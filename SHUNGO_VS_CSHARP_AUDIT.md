# Comprehensive Audit: Shungo vs. CSharp Companion

**Date:** October 2026  
**Audited Artifacts:**
1. **Shungo 1.7.2** (`shungo1.7.2.apk`, `com.shungo.app`)
2. **CSharp Companion v1.0.0** (`app-release.apk`, `org.cleanroom.pokemongo`)

---

## 1. Executive Summary

This audit performs an architectural, protocol, and functional comparison between **Shungo** (a cloud-backed, root-injected Android hybrid utility) and **CSharp Companion** (an offline-first, native Kotlin/Jetpack Compose companion and clean-room implementation).

While both projects target **Pokémon GO** (`com.nianticlabs.pokemongo`), they represent fundamentally divergent engineering philosophies:
- **Shungo** is an **ephemeral thin-client wrapper**: it bundles zero native binaries or offline game logic in the APK, relying entirely on a privileged root shell (`su`) to dynamically fetch a standalone `frida-inject` binary and V8 JavaScript hooking payload (`data.json`) from `https://shungo.app`. UI is rendered via remote WebViews.
- **CSharp Companion** is an **autonomous clean-room suite**: it features a full native Android Jetpack Compose interface with 44 implemented gameplay features, an offline game mechanics simulator, a standalone diagnostic framework, and a modular IPC transport layer (`TargetCommunicationBridge`, `LineProtocolIpcTransport`, `IpcTransportRegistry`) capable of speaking Shungo's line protocol while remaining testable in isolation.

---

## 2. In-Depth Shungo Reverse Engineering Findings (Verified vs. Previously Unverified)

### 2.1 Cryptographic Implementation (`InjectorService.c`)
- **Cipher:** `AES/CBC/PKCS7Padding`
- **Key Derivation Function (KDF):** `PBKDF2WithHmacSHA1`
- **Passphrase:** `"1.7.2ui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ="`
- **Salt (Base64 `QWlGNHNhMTJTQWZ2bGhpV3U=`):** `"AiF4sa12SAfvlhiWu"` (17 bytes: `[65, 105, 70, 52, 115, 97, 49, 50, 83, 65, 102, 118, 108, 104, 105, 87, 117]`)
- **Iteration Count:** `10,000`
- **Key Length:** `256` bits
- **Initialization Vector (IV) (Base64 `bVQzNFNhRkQ1Njc4UUFaWA==`):** `"mT34SaFD5678QAZX"` (16 bytes: `[109, 84, 51, 52, 83, 97, 70, 68, 53, 54, 55, 56, 81, 65, 90, 88]`)
- **Telemetry Payload (`catched`):** Contains `caughtInfo` (`by`, `at`, `latitude`, `longitude`). Encrypted ciphertext is Base64 encoded and dispatched via HTTP POST to `/api/shungo/catched`. Coordinates are cached locally in SharedPreferences `lastActions`.

### 2.2 Privileged Root Execution Vector
1. **Touch Filter Override:** Executes `settings put global block_untrusted_touches 0` via `su`. This disables Android 12+ security checks that reject touches passing through translucent system overlays.
2. **Frida Conflict Mitigation & Restoration:**
   - On startup: runs `fs=$(pidof frida-server) && echo "frida-server cmd: $(tr '\0' ' ' < /proc/${fs%% *}/cmdline)" && kill $fs`.
   - Captures running command in `f1646n`.
   - On service destroy: restores previous `frida-server` by running `<cmd> < /dev/null > /dev/null 2>&1 &`.
3. **Execution Modes:**
   - *Spawn Mode:* `am force-stop com.nianticlabs.pokemongo`, then runs `/files/injector -f com.nianticlabs.pokemongo -s /files/data.json -R v8 -i -P '<JSON_CONFIG>'`.
   - *Attach Mode:* `am start -n com.nianticlabs.pokemongo/<activity> -W -S`, sleeps for `injectionDelayMs`, then runs `/files/injector -p $(pidof com.nianticlabs.pokemongo) -s /files/data.json -R v8 -i -P '<JSON_CONFIG>'`.

### 2.3 IPC Wire Protocol Specification
- **Stream Framing:** Line-oriented text over standard I/O streams.
- **Inbound Prefix:** `[GAME]{"method":"<METHOD>","payload":{...}}`
- **Dispatch Methods:**
  - `ping`: Keepalive. Resets 30-second watchdog timer. If watchdog expires, `InjectorService` forcibly destroys the injector process and automatically relaunches itself.
  - `catched`: Telemetry reporting. Returns `<statusCode>}` over stdin.
  - `getPokemons`: Relays query to `/api/shungo/pokemons?<query>` with Bearer auth; writes JSON response to stdin.
  - `request`: Generic authenticated HTTP proxy for the Frida hook script.
  - `status`: Logs injector state changes.

### 2.4 Floating HUD & Power Management
- **Overlay Window:** `WindowManager.LayoutParams` type `TYPE_APPLICATION_OVERLAY` (`2038`), flags `56` (`FLAG_NOT_FOCUSABLE | FLAG_NOT_TOUCHABLE | FLAG_NOT_TOUCH_MODAL`), format `TRANSLUCENT` (`-2`), alpha `0.99f`. Loads `https://shungo.app/app/overlay`.
- **Proximity Sensor (`u2.d`):** When enabled, acquires `PROXIMITY_SCREEN_OFF_WAKE_LOCK` (`32`) when device is covered/in pocket, turning off screen while keeping injection active.
- **ART Downgrade:** Exposes `pm uninstall com.google.android.art && reboot` in JS interface (`defpackage.e`) to roll back Mainline APEX updates that break dynamic hook integrity.

---

## 3. Feature-Parity Matrix: Shungo vs. CSharp Companion

| Feature / Domain | Shungo Implementation | CSharp Implementation | Parity Status | Evidence & Technical Notes |
| :--- | :--- | :--- | :--- | :--- |
| **Primary UI Architecture** | Remote WebView (`https://shungo.app/app`) | Native Jetpack Compose (13 full screens) | **Divergent (Superior in CSharp)** | Shungo is web-dependent; CSharp has native Compose responsive UI. |
| **In-Game HUD Overlay** | Floating transparent WebView (`/app/overlay`) | Native floating Compose HUD (`InGameOverlayView`) | **Implemented (Full Parity)** | Both use `WindowManager` `TYPE_APPLICATION_OVERLAY` (2038). |
| **Root Shell (`su`) Integration** | Native `su` via topjohnwu `libsu` & `main.jar` | Decoupled via `IpcTransportRegistry` | **Architectural Choice** | Shungo couples to `su`; CSharp abstracts transport behind an adapter. |
| **Dynamic Binary Injection** | Downloads `frida-inject` & V8 script at runtime | Smali bytecode injection (`CSharpBridge`) | **Alternative Approach** | Shungo uses out-of-process Frida; CSharp uses in-process Smali hooks. |
| **Touch Filtering Bypass** | `settings put global block_untrusted_touches 0` | Native touch handling on HUD window | **Implemented in Shungo** | Shungo requires root; CSharp overlay uses native Compose touch handlers. |
| **IPC Protocol Framing** | Line protocol: `[GAME]{"method":"...","payload":...}` | `IpcFrameCodec` + `LineProtocolIpcTransport` | **Implemented (Full Parity)** | 100% wire-compatible framing and method dispatch. |
| **IPC Methods (`ping`)** | 30s watchdog with process restart | `TargetCommunicationBridge` watchdog + pong | **Implemented (Full Parity)** | Both enforce 30-second heartbeat timeout. |
| **IPC Methods (`catched`)** | AES-CBC-256 encrypted POST to `/api/shungo/catched` | Dispatches via `handleIncomingMessage("catched")` | **Partial** | Wire method handled; CSharp does not use Shungo's AES cloud endpoint. |
| **IPC Methods (`getPokemons`)** | Proxies to `/api/shungo/pokemons` | Internal Pokedex / inventory query response | **Implemented (Full Parity)** | Both answer `getPokemons` requests over the transport. |
| **IPC Methods (`request`)** | Authenticated OkHttp cloud gateway | Internal generic request forwarder | **Implemented (Full Parity)** | Returns status 200 or 404 cleanly. |
| **Proximity Pocket Mode** | `PROXIMITY_SCREEN_OFF_WAKE_LOCK` (32) | Missing in companion | **Missing in CSharp** | Shungo registers `Sensor.TYPE_PROXIMITY` (8). |
| **ART Downgrade Helper** | `pm uninstall com.google.android.art && reboot` | Missing in companion | **Missing in CSharp** | Shungo provides 1-tap APEX ART rollback for Frida compatibility. |
| **Virtual Joystick & Tap-to-Walk**| Injected script canvas overlay | Native Compose draggable thumbstick & waypoints | **Implemented (Full Parity)** | CSharp implements full speed presets (9.3, 18.5, 30.0, 60.0 km/h). |
| **Softban Cooldown Timer** | Unknown / server-side | Native Haversine formula + countdown HUD | **Implemented in CSharp** | CSharp calculates distance-based softban cooldown up to 7200s. |
| **GPX Route Automation** | Handled in server web UI | Native `RouteManager` with loop/bounce/once | **Implemented in CSharp** | CSharp parses GPX waypoints and auto-walks player coordinates. |
| **Encounter IV HUD & Throw Mod**| Injected Frida hook | Native `AutomationEngine` with Nice/Great/Exc | **Implemented in CSharp** | CSharp calculates appraisal 3-bar IVs and throw multipliers. |
| **Sniper Feeds (100% IV / PvP)** | Cloud feed via WebSocket / REST | Native `SniperManager` with 1-tap teleport | **Implemented in CSharp** | CSharp includes Gen 1-9 species dictionary and PvP stat calculator. |
| **Licensing & Activation** | Auth0 OAuth2 / PKCE (`auth.shungo.app`) | Offline `LicensingManager` with dev keys | **Alternative Approach** | Shungo requires cloud subscription; CSharp supports offline dev keys. |

---

## 4. DeepSeek-Assigned CSharp Implementation Verification

All tasks assigned by DeepSeek for the `csharp` project have been executed, verified, and integrated into the repository:

### 4.1 Transport Layer Audit & Implementation
1. **`IpcModels.kt`**:
   - Expanded `IpcTransport` interface with lifecycle methods (`connect`, `disconnect`, `sendMessage`, `registerMessageHandler`).
   - Added observable `connectionState: StateFlow<IpcConnectionState>`.
   - Added `Reconnecting(attempt)` state and correlated request IDs.
2. **`IpcFrameCodec.kt`**:
   - Implements strict wire framing over `[GAME]` prefix.
   - Decodes requests and responses into sealed `DecodeResult`: `Message`, `Response`, `Malformed`, `Ignored`.
   - Foreign lines and malformed JSON are isolated without throwing exceptions.
3. **`DuplexConnection.kt`**:
   - Transport-agnostic bidirectional line interface.
   - `InMemoryDuplexConnection`: In-process loopback pipe with unbuffered Kotlin channels for deterministic testing.
4. **`LineProtocolIpcTransport.kt`**:
   - Generic protocol engine running over any `DuplexConnection`.
   - Asynchronous reader loop with correlated request/response timeouts (`withTimeoutOrNull`).
   - Malformed frame dropping and counting (`malformedFrameCount`).
   - Automatic reconnection with configurable backoff and max attempts.
5. **`IpcTransportRegistry.kt`**:
   - Clean provider registry allowing runtime adapters to be registered dynamically.
   - Resolves to `StandaloneNullTransport` by default.
6. **`TargetCommunicationBridge.kt`**:
   - Pure, injectable boundary coordinating transport lifecycle and dispatching `ping`, `catched`, `getPokemons`, and `request`.

### 4.2 Test Suite Execution Results
The test suite in `/root/reverse-engineering/test-app/implementation` was executed with `--rerun-tasks`:

```
org.cleanroom.pokemongo.IpcTransportTest:             15 tests, 0 failures (0.271s)
org.cleanroom.pokemongo.CompanionArchitectureTest:     5 tests, 0 failures (0.161s)
org.cleanroom.pokemongo.ActivationSystemTest:          4 tests, 0 failures (0.026s)
org.cleanroom.pokemongo.AutomationEngineTest:          4 tests, 0 failures (0.015s)
org.cleanroom.pokemongo.DiagnosticsTest:               4 tests, 0 failures (0.006s)
org.cleanroom.pokemongo.ExtendedFeaturesTest:         14 tests, 0 failures (0.034s)
org.cleanroom.pokemongo.MovementControllerTest:        4 tests, 0 failures (0.003s)
org.cleanroom.pokemongo.PokemonGoMechanicsTest:        6 tests, 0 failures (0.002s)

OVERALL: 56 tests, 0 failures, 0 errors (BUILD SUCCESSFUL)
```

### 4.3 Build Verification
Both release and debug APKs were assembled:
- **`app-release.apk`**: `40,887,580` bytes (39 MB), signed with **APK Signature Scheme v3** (`apksigner verify --verbose` -> `Verified using v3 scheme: true`).
- **`app-debug.apk`**: `55,574,528` bytes (53 MB), fully assembled and validated.
