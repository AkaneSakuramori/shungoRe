package com.shungo.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import c3.h;
import com.shungo.app.InjectorService;
import defpackage.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.internal.k;
import org.json.JSONException;
import org.json.JSONObject;
import q3.a;
import q3.g;
import q3.l;
import r3.x;
import u2.d;
import u2.f;
import u2.j;
import y.m;
import y.n;
import y.w;
import y2.q;

/* JADX INFO: loaded from: classes.dex */
public final class InjectorService extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f1633o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f1634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f1635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BufferedWriter f1636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Sensor f1637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SensorManager f1638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PowerManager.WakeLock f1639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f1640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f1641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Timer f1643k = new Timer();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Process f1644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f1645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile String f1646n;

    public final Notification a() {
        NotificationChannel notificationChannel = new NotificationChannel("foreground_service_channel", "Shungo", 3);
        Object systemService = getSystemService("notification");
        h.Y(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        m mVar = new m();
        mVar.f5040b = new ArrayList();
        mVar.f5041c = new ArrayList();
        mVar.f5042d = new ArrayList();
        mVar.f5046h = true;
        Notification notification = new Notification();
        mVar.f5050l = notification;
        mVar.f5039a = this;
        mVar.f5048j = "foreground_service_channel";
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        mVar.f5045g = 0;
        mVar.f5051m = new ArrayList();
        mVar.f5049k = true;
        notification.icon = R.mipmap.ic_launcher;
        mVar.f5043e = "Shungo".length() > 5120 ? "Shungo".subSequence(0, 5120) : "Shungo";
        mVar.f5044f = "Running...".length() > 5120 ? "Running...".subSequence(0, 5120) : "Running...";
        mVar.f5045g = 0;
        w wVar = new w(mVar);
        wVar.f5053b.getClass();
        Notification notificationA = n.a(wVar.f5052a);
        wVar.f5053b.getClass();
        h.a0(notificationA, "build(...)");
        return notificationA;
    }

    public final void b() {
        try {
            d dVar = new d(this);
            Object systemService = getSystemService("sensor");
            h.Y(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            SensorManager sensorManager = (SensorManager) systemService;
            this.f1638f = sensorManager;
            this.f1637e = sensorManager.getDefaultSensor(8);
            SensorManager sensorManager2 = this.f1638f;
            h.X(sensorManager2);
            sensorManager2.registerListener(dVar, this.f1637e, 3);
            Object systemService2 = getSystemService("power");
            h.Y(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
            this.f1639g = ((PowerManager) systemService2).newWakeLock(32, "shungo:app");
        } catch (Exception e5) {
            System.out.println(e5);
        }
    }

    public final void c(String str) throws JSONException {
        JSONObject jSONObject;
        String strEncodeToString;
        Log.d("SHUNGO", "Coms: " + str);
        if (l.o3(str, "[GAME]", false)) {
            Handler handler = new Handler(Looper.getMainLooper());
            JSONObject jSONObject2 = new JSONObject(l.i3(str, "[GAME]", ""));
            String string = jSONObject2.getString("method");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("payload");
            handler.post(new androidx.emoji2.text.n(this, string, jSONObject3, 2));
            if (string.equals("ping")) {
                this.f1641i = Long.valueOf(System.currentTimeMillis());
                System.out.println((Object) ("Ping received at " + this.f1641i));
            }
            if (string.equals("catched")) {
                StringBuilder sb = new StringBuilder("{\"body\":\"");
                String string2 = jSONObject3.toString();
                h.a0(string2, "toString(...)");
                try {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode("bVQzNFNhRkQ1Njc4UUFaWA==", 0));
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                    char[] charArray = "1.7.2ui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ=".toCharArray();
                    h.a0(charArray, "this as java.lang.String).toCharArray()");
                    SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(charArray, Base64.decode("QWlGNHNhMTJTQWZ2bGhpV3U=", 0), 10000, 256)).getEncoded(), "AES");
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    byte[] bytes = string2.getBytes(a.f3886a);
                    h.a0(bytes, "this as java.lang.String).getBytes(charset)");
                    strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                    h.a0(strEncodeToString, "encodeToString(...)");
                } catch (Exception e5) {
                    Log.e("Shungo", "Error while encrypting: " + e5);
                    strEncodeToString = "";
                }
                sb.append(l.i3(strEncodeToString, "\n", ""));
                sb.append("\"}");
                String string3 = sb.toString();
                kotlinx.coroutines.scheduling.d dVar = x.f4128a;
                h.s1(k.f3303a, new f(this, string3, this, null));
                String string4 = jSONObject3.getJSONObject("caughtInfo").getString("by");
                long j4 = jSONObject3.getJSONObject("caughtInfo").getLong("at");
                double d5 = jSONObject3.getJSONObject("caughtInfo").getDouble("longitude");
                jSONObject = jSONObject3;
                String str2 = "{\"at\":" + j4 + ",\"latitude\":" + jSONObject3.getJSONObject("caughtInfo").getDouble("latitude") + ",\"longitude\":" + d5 + '}';
                Log.d("Shungo", "catch from " + string4 + " info: " + str2);
                SharedPreferences sharedPreferences = this.f1640h;
                SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
                Log.d("Shungo", "edit pref: " + editorEdit);
                if (editorEdit != null) {
                    SharedPreferences sharedPreferences2 = this.f1640h;
                    String string5 = sharedPreferences2 != null ? sharedPreferences2.getString("lastActions", null) : null;
                    Log.d("Shungo", "current : " + string5);
                    if (string5 == null) {
                        editorEdit.putString("lastActions", "{\"" + string4 + "\": " + str2 + '}');
                        editorEdit.apply();
                        Log.d("Shungo", "set string to {\"" + string4 + "\": " + str2 + '}');
                    } else {
                        try {
                            JSONObject jSONObject4 = new JSONObject(string5);
                            Log.d("Shungo", "jsonObject : " + jSONObject4);
                            Iterator<String> itKeys = jSONObject4.keys();
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    Log.d("Shungo", "adding new key " + string4 + " with value " + str2);
                                    jSONObject4.put(string4, new JSONObject(str2));
                                    break;
                                }
                                String next = itKeys.next();
                                Log.d("Shungo", "Key: " + next);
                                if (h.I(next, string4)) {
                                    jSONObject4.put(string4, new JSONObject(str2));
                                    Log.d("Shungo", "replacing existing key " + string4 + " with value " + str2);
                                    break;
                                }
                            }
                            String string6 = jSONObject4.toString();
                            h.a0(string6, "toString(...)");
                            Log.d("Shungo", " updated json: " + string6);
                            editorEdit.putString("lastActions", string6);
                            editorEdit.apply();
                            Log.d("Shungo", "edited lastActions success");
                        } catch (JSONException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            } else {
                jSONObject = jSONObject3;
            }
            if (string.equals("getPokemons")) {
                String string7 = jSONObject.getString("query");
                System.out.println((Object) string7);
                k3.m mVar = new k3.m();
                mVar.f3276b = this;
                kotlinx.coroutines.scheduling.d dVar2 = x.f4128a;
                h.s1(k.f3303a, new u2.h(mVar, string7, this, null));
            }
            if (string.equals("request")) {
                String string8 = jSONObject.getString("query");
                String string9 = jSONObject.getString("path");
                String string10 = jSONObject.getString("body");
                System.out.println((Object) string8);
                k3.m mVar2 = new k3.m();
                mVar2.f3276b = this;
                kotlinx.coroutines.scheduling.d dVar3 = x.f4128a;
                h.s1(k.f3303a, new j(mVar2, string9, string8, string10, this, null));
            }
        }
    }

    public final void d(String str) {
        x2.d.a("pm grant " + getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW").S2();
        if (!Settings.canDrawOverlays(this)) {
            Toast.makeText(this, "No permission for overlay", 0).show();
            return;
        }
        Object systemService = getSystemService("window");
        h.Y(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.overlay_webview, (ViewGroup) null);
        this.f1634b = viewInflate;
        h.X(viewInflate);
        WebView webView = (WebView) viewInflate.findViewById(R.id.webview);
        this.f1635c = webView;
        if (webView != null) {
            webView.setWebViewClient(new u2.k(this, str));
        }
        WebView webView2 = this.f1635c;
        if (webView2 != null) {
            webView2.addJavascriptInterface(new e(this), "Android");
        }
        WebView webView3 = this.f1635c;
        WebSettings settings = webView3 != null ? webView3.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f1635c;
        if (webView4 != null) {
            webView4.setBackgroundColor(0);
        }
        WebView webView5 = this.f1635c;
        if (webView5 != null) {
            webView5.setLayerType(1, null);
        }
        WebView webView6 = this.f1635c;
        if (webView6 != null) {
            webView6.setRendererPriorityPolicy(2, false);
        }
        WebView webView7 = this.f1635c;
        if (webView7 != null) {
            webView7.post(new androidx.activity.d(13, this));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, 56, -2);
        layoutParams.alpha = 0.99f;
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = 0;
        windowManager.addView(this.f1634b, layoutParams);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.b0(intent, "intent");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    @Override // android.app.Service
    public final void onCreate() throws PackageManager.NameNotFoundException {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        Intent launchIntentForPackage;
        ComponentName component;
        PackageInfo packageInfo;
        Double dValueOf;
        long jRound;
        String str5 = "spawn";
        super.onCreate();
        try {
            u2.n.f4742a.a(this);
            SharedPreferences sharedPreferences = getSharedPreferences("shungo", 0);
            this.f1640h = sharedPreferences;
            String string2 = sharedPreferences != null ? sharedPreferences.getString("settings", null) : null;
            Notification notificationA = a();
            final k3.l lVar = new k3.l();
            final k3.j jVar = new k3.j();
            if (Build.VERSION.SDK_INT < 33) {
                startForeground(1, notificationA);
            } else {
                startForeground(1, notificationA, 1073741824);
            }
            if (string2 == null || l.b3(string2)) {
                str = "last actions raw: ";
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has("other")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("other");
                        if (jSONObject2.has("proximitySensor") && jSONObject2.getBoolean("proximitySensor")) {
                            System.out.println((Object) ("starting proximity sensor handler: " + jSONObject2.getBoolean("proximitySensor")));
                            b();
                        }
                        String strOptString = jSONObject2.optString("injectionDelay");
                        h.a0(strOptString, "optString(...)");
                        try {
                            dValueOf = g.f3903a.a(strOptString) ? Double.valueOf(Double.parseDouble(strOptString)) : null;
                        } catch (NumberFormatException unused) {
                        }
                        if (dValueOf != null) {
                            double dDoubleValue = dValueOf.doubleValue();
                            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                                dValueOf = null;
                            }
                            if (dValueOf != null) {
                                str = "last actions raw: ";
                                double dM0 = h.m0(dValueOf.doubleValue()) * ((double) 1000);
                                try {
                                    if (Double.isNaN(dM0)) {
                                        throw new IllegalArgumentException("Cannot round NaN value.");
                                    }
                                    jRound = Math.round(dM0);
                                } catch (Exception e5) {
                                    e = e5;
                                    e.printStackTrace();
                                }
                            } else {
                                str = "last actions raw: ";
                                jRound = 0;
                            }
                        } else {
                            str = "last actions raw: ";
                            jRound = 0;
                        }
                        lVar.f3275b = jRound;
                        String str6 = "injection delay: " + lVar.f3275b + "ms";
                        PrintStream printStream = System.out;
                        printStream.println((Object) str6);
                        boolean zI = h.I(jSONObject2.optString("injectionMode"), "spawn");
                        jVar.f3273b = zI;
                        if (!zI) {
                            str5 = "attach";
                        }
                        printStream.println((Object) "injection mode: ".concat(str5));
                    } else {
                        str = "last actions raw: ";
                    }
                } catch (Exception e6) {
                    e = e6;
                    str = "last actions raw: ";
                }
            }
            String absolutePath = new File(getFilesDir(), "data.json").getAbsolutePath();
            final String absolutePath2 = new File(getFilesDir(), "injector").getAbsolutePath();
            PackageManager packageManager = getPackageManager();
            if (packageManager != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = packageManager.getPackageInfo("com.nianticlabs.pokemongo", PackageManager.PackageInfoFlags.of(1));
                    h.X(packageInfo);
                } else {
                    packageInfo = packageManager.getPackageInfo("com.nianticlabs.pokemongo", 1);
                    h.X(packageInfo);
                }
                str2 = packageInfo.versionName;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str3 = "unknown";
            } else {
                str3 = "\"" + str2 + '\"';
            }
            SharedPreferences sharedPreferences2 = this.f1640h;
            if (sharedPreferences2 != null) {
                str4 = null;
                string = sharedPreferences2.getString("lastActions", null);
            } else {
                str4 = null;
                string = null;
            }
            String str7 = string2 == null ? "{}" : string2;
            PrintStream printStream2 = System.out;
            printStream2.println((Object) (str + string));
            if (string == null) {
                string = "{}";
            }
            printStream2.println((Object) "last actions json: ".concat(string));
            String str8 = "{\"settings\":" + str7 + ",\"gameVersion\":" + str3 + ",\"lastActions\":" + string + '}';
            h.b0(str8, "cmd");
            String str9 = "-P " + ("'" + l.i3(str8, "'", "''") + '\'');
            d(string2);
            PackageManager packageManager2 = getPackageManager();
            String className = (packageManager2 == null || (launchIntentForPackage = packageManager2.getLaunchIntentForPackage("com.nianticlabs.pokemongo")) == null || (component = launchIntentForPackage.getComponent()) == null) ? str4 : component.getClassName();
            printStream2.println((Object) ("mainActivity: " + className));
            final String str10 = "am start -n com.nianticlabs.pokemongo/" + className + " -W -S";
            String str11 = jVar.f3273b ? "-f com.nianticlabs.pokemongo" : "-p `pidof com.nianticlabs.pokemongo`";
            final String str12 = absolutePath2 + ' ' + str11 + " -s " + absolutePath + " -R v8 -i " + str9;
            Log.d("SHUNGO", "ran: " + (absolutePath2 + ' ' + str11 + " -s " + getFilesDir() + "/agent-temp -R v8 -i " + str9));
            this.f1643k.scheduleAtFixedRate(new u2.l(this, this), 0L, 30000L);
            Thread thread = new Thread(new Runnable() { // from class: u2.c
                @Override // java.lang.Runnable
                public final void run() {
                    String str13;
                    k3.j jVar2;
                    boolean z4;
                    InjectorService injectorService = this.f4702b;
                    String str14 = absolutePath2;
                    k3.j jVar3 = jVar;
                    String str15 = str10;
                    k3.l lVar2 = lVar;
                    String str16 = str12;
                    int i4 = InjectorService.f1633o;
                    c3.h.b0(injectorService, "this$0");
                    c3.h.b0(jVar3, "$spawnMode");
                    c3.h.b0(str15, "$startPogo");
                    c3.h.b0(lVar2, "$injectionDelayMs");
                    c3.h.b0(str16, "$inject");
                    while (!Thread.interrupted()) {
                        try {
                            boolean z5 = false;
                            ProcessBuilder processBuilder = new ProcessBuilder("su");
                            processBuilder.redirectErrorStream(true);
                            Map<String, String> mapEnvironment = processBuilder.environment();
                            c3.h.a0(mapEnvironment, "environment(...)");
                            mapEnvironment.put("LANG", "en-US.UTF-8");
                            Process processStart = processBuilder.start();
                            injectorService.f1644l = processStart;
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(processStart != null ? processStart.getOutputStream() : null, "UTF-8"));
                            injectorService.f1636d = bufferedWriter;
                            bufferedWriter.write("settings put global block_untrusted_touches 0");
                            BufferedWriter bufferedWriter2 = injectorService.f1636d;
                            if (bufferedWriter2 != null) {
                                bufferedWriter2.newLine();
                            }
                            BufferedWriter bufferedWriter3 = injectorService.f1636d;
                            if (bufferedWriter3 != null) {
                                bufferedWriter3.write("chmod +x " + str14);
                            }
                            BufferedWriter bufferedWriter4 = injectorService.f1636d;
                            if (bufferedWriter4 != null) {
                                bufferedWriter4.newLine();
                            }
                            if (jVar3.f3273b) {
                                BufferedWriter bufferedWriter5 = injectorService.f1636d;
                                if (bufferedWriter5 != null) {
                                    bufferedWriter5.write("fs=$(pidof frida-server) && echo \"frida-server cmd: $(tr '\\0' ' ' < /proc/${fs%% *}/cmdline)\" && kill $fs");
                                }
                                BufferedWriter bufferedWriter6 = injectorService.f1636d;
                                if (bufferedWriter6 != null) {
                                    bufferedWriter6.newLine();
                                }
                                BufferedWriter bufferedWriter7 = injectorService.f1636d;
                                if (bufferedWriter7 != null) {
                                    bufferedWriter7.write("am force-stop com.nianticlabs.pokemongo");
                                }
                                BufferedWriter bufferedWriter8 = injectorService.f1636d;
                                if (bufferedWriter8 != null) {
                                    bufferedWriter8.newLine();
                                }
                                str13 = str14;
                                jVar2 = jVar3;
                            } else {
                                BufferedWriter bufferedWriter9 = injectorService.f1636d;
                                if (bufferedWriter9 != null) {
                                    bufferedWriter9.write(str15);
                                }
                                BufferedWriter bufferedWriter10 = injectorService.f1636d;
                                if (bufferedWriter10 != null) {
                                    bufferedWriter10.newLine();
                                }
                                if (lVar2.f3275b > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    str13 = str14;
                                    jVar2 = jVar3;
                                    long j4 = 1000;
                                    sb.append(lVar2.f3275b / j4);
                                    sb.append('.');
                                    sb.append(q3.l.d3(String.valueOf(lVar2.f3275b % j4)));
                                    String string3 = sb.toString();
                                    BufferedWriter bufferedWriter11 = injectorService.f1636d;
                                    if (bufferedWriter11 != null) {
                                        bufferedWriter11.write("sleep " + string3);
                                    }
                                    BufferedWriter bufferedWriter12 = injectorService.f1636d;
                                    if (bufferedWriter12 != null) {
                                        bufferedWriter12.newLine();
                                    }
                                } else {
                                    str13 = str14;
                                    jVar2 = jVar3;
                                }
                                BufferedWriter bufferedWriter13 = injectorService.f1636d;
                                if (bufferedWriter13 != null) {
                                    bufferedWriter13.write("pid=$(pidof com.nianticlabs.pokemongo) && echo \"pid: $pid\"");
                                }
                                BufferedWriter bufferedWriter14 = injectorService.f1636d;
                                if (bufferedWriter14 != null) {
                                    bufferedWriter14.newLine();
                                }
                            }
                            try {
                                BufferedWriter bufferedWriter15 = injectorService.f1636d;
                                if (bufferedWriter15 != null) {
                                    bufferedWriter15.write(str16 + "; echo \"injector exited with code $?\"");
                                }
                                BufferedWriter bufferedWriter16 = injectorService.f1636d;
                                if (bufferedWriter16 != null) {
                                    bufferedWriter16.newLine();
                                }
                                BufferedWriter bufferedWriter17 = injectorService.f1636d;
                                if (bufferedWriter17 != null) {
                                    bufferedWriter17.flush();
                                }
                                Process process = injectorService.f1644l;
                                InputStream inputStream = process != null ? process.getInputStream() : null;
                                Process process2 = injectorService.f1644l;
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new SequenceInputStream(inputStream, process2 != null ? process2.getErrorStream() : null), "UTF-8"));
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    if (q3.l.o3(line, "frida-server cmd: ", z5)) {
                                        injectorService.f1646n = q3.l.t3(q3.l.h3("frida-server cmd: ", line)).toString();
                                    } else {
                                        if (q3.l.o3(line, "[GAME]", z5) || q3.l.o3(line, "injector exited with code ", z5)) {
                                            String str17 = injectorService.f1646n;
                                            if (str17 != null) {
                                                injectorService.f1646n = null;
                                                y2.d.b(null, new y2.f(x2.d.a(str17.concat(" </dev/null >/dev/null 2>&1 &")), y2.q.f5410b, null));
                                            }
                                            z4 = false;
                                        } else {
                                            z4 = z5;
                                        }
                                        if (q3.l.o3(line, "injector exited with code ", z4)) {
                                            injectorService.c("[GAME]{\"method\":\"status\",\"payload\":{\"status\":\"Injector stopped (code " + q3.l.t3(q3.l.h3("injector exited with code ", line)).toString() + ")\"}}");
                                        }
                                        injectorService.c(line);
                                    }
                                    z5 = false;
                                }
                                bufferedReader.close();
                                BufferedWriter bufferedWriter18 = injectorService.f1636d;
                                if (bufferedWriter18 != null) {
                                    bufferedWriter18.close();
                                }
                                Process process3 = injectorService.f1644l;
                                if (process3 != null) {
                                    process3.destroyForcibly();
                                }
                                Process process4 = injectorService.f1644l;
                                System.out.println((Object) ("binary stopped with exitCode " + (process4 != null ? Integer.valueOf(process4.waitFor()) : null)));
                                if (injectorService.f1642j) {
                                    injectorService.startForegroundService(new Intent(injectorService, (Class<?>) InjectorService.class));
                                }
                                injectorService.f1642j = false;
                            } catch (InterruptedIOException unused2) {
                            } catch (Exception e7) {
                                e = e7;
                                Log.e("Injector", "Injector Thread", e);
                            }
                        } catch (InterruptedIOException unused3) {
                            str13 = str14;
                            jVar2 = jVar3;
                        } catch (Exception e8) {
                            e = e8;
                            str13 = str14;
                            jVar2 = jVar3;
                        }
                        str14 = str13;
                        jVar3 = jVar2;
                    }
                }
            });
            this.f1645m = thread;
            thread.start();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() throws IOException {
        super.onDestroy();
        this.f1643k.cancel();
        BufferedWriter bufferedWriter = this.f1636d;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        Object systemService = getSystemService("window");
        h.Y(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        View view = this.f1634b;
        y2.f fVar = null;
        if (view != null && view.isAttachedToWindow()) {
            windowManager.removeView(this.f1634b);
            WebView webView = this.f1635c;
            if (webView != null) {
                webView.clearHistory();
            }
            WebView webView2 = this.f1635c;
            if (webView2 != null) {
                webView2.clearCache(false);
            }
            WebView webView3 = this.f1635c;
            if (webView3 != null) {
                webView3.loadUrl("about:blank");
            }
            WebView webView4 = this.f1635c;
            if (webView4 != null) {
                webView4.onPause();
            }
            WebView webView5 = this.f1635c;
            if (webView5 != null) {
                webView5.removeAllViews();
            }
            WebView webView6 = this.f1635c;
            if (webView6 != null) {
                webView6.destroy();
            }
            this.f1634b = null;
            this.f1635c = null;
        }
        PowerManager.WakeLock wakeLock = this.f1639g;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.f1639g;
            h.X(wakeLock2);
            wakeLock2.release();
        }
        Thread thread = this.f1645m;
        if (thread != null) {
            thread.interrupt();
        }
        Process process = this.f1644l;
        if (process != null) {
            process.destroyForcibly();
        }
        String str = this.f1646n;
        if (str == null) {
            return;
        }
        this.f1646n = null;
        y2.d.b(null, new y2.f(x2.d.a(str.concat(" </dev/null >/dev/null 2>&1 &")), q.f5410b, fVar));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
