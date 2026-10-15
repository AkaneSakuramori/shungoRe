# Shungo Reverse Engineering

Complete reverse-engineering analysis of **Shungo** (`shungo1.7.2.apk`), an Android companion, overlay, and automation utility targeting Pokémon GO (`com.nianticlabs.pokemongo`).

## Full Report
Detailed architecture, IPC protocol, cryptographic recovery, and component mapping:
- [SHUNGO_REVERSE_ENGINEERING_REPORT.md](SHUNGO_REVERSE_ENGINEERING_REPORT.md)

## Repository Layout
- `shungo1.7.2.apk`: Original validated target APK (SHA-256: `2b1361837ac2a85722286c73142a1cb06094c1d1b05a7ea212a0b0eb909059fe`)
- `classes.dex`: Extracted primary DEX file (SHA-256: `13414302d2958d944974ac6035b2b20ce8fc3d8817fe3c8ce051a8ecc921500d`)
- `main_jar_classes.dex`: Extracted DEX from `assets/main.jar` (`libsu` RootServerMain)
- `apktool_out/`: Apktool disassembly (manifest, resources, smali)
- `jadx_out/`: Complete JADX decompiled Java source tree
- `jadx_main_jar/`: Decompiled source of `main.jar`
- `SHUNGO_REVERSE_ENGINEERING_REPORT.md`: Comprehensive technical findings report

## Key Findings
- **Stack:** Kotlin + AndroidX + Material 3 + OkHttp + Auth0 OIDC + libsu.
- **UI:** Hybrid WebView loading `https://shungo.app/app` and floating `WindowManager` HUD overlay (`TYPE_APPLICATION_OVERLAY` 2038) loading `https://shungo.app/app/overlay`.
- **Native Architecture:** Zero `.so` files packaged in APK. Dynamically fetches standalone `frida-inject` ELF from `/api/assets/injector` and JavaScript hooking payload (`data.json`) from `/api/assets/agent`.
- **Privileged Execution:** Spawns/attaches via root `su` shell:
  `injector -f/-p com.nianticlabs.pokemongo -s data.json -R v8 -i -P '{...}'`
- **IPC & Telemetry:** Streams over stdout using `[GAME]{"method":"...","payload":{...}}`. Pokémon catch data is encrypted with AES-CBC-256 (PBKDF2 key derivation, passphrase `"1.7.2ui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ="`, salt `"AiF4sa12SAfvlhiWu"`, IV `"mT34SaFD5678QAZX"`).