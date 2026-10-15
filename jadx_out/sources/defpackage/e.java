package defpackage;

import a3.j;
import a3.n;
import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import androidx.fragment.app.k;
import c3.h;
import com.auth0.android.provider.AuthenticationActivity;
import com.shungo.app.MainActivity;
import com.shungo.app.R;
import g1.b;
import j1.c0;
import j1.h0;
import j1.n0;
import j1.p0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import q3.a;
import r3.x;
import t3.r;
import t3.s;
import u2.m;
import u2.o;
import x2.d;
import z.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1770a;

    public e(Context context) {
        h.b0(context, "context");
        this.f1770a = context;
    }

    @JavascriptInterface
    public final void DownloadUpdate(String str) {
        h.b0(str, "url");
        Object systemService = this.f1770a.getSystemService("download");
        h.Y(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle("Shungo Update");
        request.setDescription("Downloading new Shungo version...");
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "shungo.apk");
        ((DownloadManager) systemService).enqueue(request);
    }

    @JavascriptInterface
    public final void SaveLogs() throws IOException {
        StringBuilder sb = new StringBuilder("pm grant ");
        Context context = this.f1770a;
        sb.append(context.getPackageName());
        sb.append(" android.permission.WRITE_EXTERNAL_STORAGE");
        d.a(sb.toString()).S2();
        d.a("pm grant " + context.getPackageName() + " android.permission.MANAGE_EXTERNAL_STORAGE").S2();
        d.a("pm grant " + context.getPackageName() + " android.permission.READ_EXTERNAL_STORAGE").S2();
        File file = new File(context.getFilesDir(), "shungologs.txt");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(context.getFilesDir(), "logs");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, "shungo.log");
        ArrayList arrayList = new ArrayList();
        File file4 = new File(file3.getParentFile(), "shungo.log.1");
        if (file4.exists()) {
            arrayList.add(file4);
        }
        if (file3.exists()) {
            arrayList.add(file3);
        }
        String strG3 = n.g3(arrayList, "", null, null, m.f4741c, 30);
        if (strG3.length() == 0) {
            InputStream inputStream = Runtime.getRuntime().exec("logcat -d -t 5000").getInputStream();
            h.a0(inputStream, "getInputStream(...)");
            Reader inputStreamReader = new InputStreamReader(inputStream, a.f3886a);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            StringBuilder sb2 = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb2.append(line);
                sb2.append("\n");
            }
            strG3 = sb2.toString();
            h.a0(strG3, "toString(...)");
        }
        if (strG3.length() > 0) {
            try {
                File file5 = new File(context.getFilesDir(), "shungologs.txt");
                String str = "logs : " + file5.getAbsolutePath();
                PrintStream printStream = System.out;
                printStream.println((Object) str);
                file5.createNewFile();
                FileWriter fileWriter = new FileWriter(file5);
                fileWriter.write(strG3);
                fileWriter.flush();
                fileWriter.close();
                String str2 = "mv " + file5.getAbsolutePath() + " /sdcard/";
                printStream.println((Object) ("move logs: " + str2));
                d.a(str2).S2();
                Toast.makeText(context, "Saved logs to /sdcard/".concat("shungologs.txt"), 0).show();
            } catch (Exception e5) {
                Toast.makeText(context, "Error saving logs : " + e5.getMessage(), 0).show();
                e5.printStackTrace();
            }
        }
    }

    @JavascriptInterface
    public final void SaveSettings(String str) {
        h.b0(str, "settings");
        System.out.println((Object) "Saving settings: ".concat(str));
        Context context = this.f1770a;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("shungo", 0).edit();
        editorEdit.putString("settings", str);
        editorEdit.apply();
        Toast.makeText(context, "Settings saved!", 0).show();
    }

    @JavascriptInterface
    public final void copyToClipboard(String str) {
        Context context = this.f1770a;
        if (context instanceof MainActivity) {
            Object obj = z.d.f5428a;
            Object objB = c.b(context, ClipboardManager.class);
            h.Y(objB, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData clipDataNewPlainText = ClipData.newPlainText("text", str);
            System.out.println((Object) a.g("Copied ", str, " to clipboard"));
            ((ClipboardManager) objB).setPrimaryClip(clipDataNewPlainText);
        }
    }

    @JavascriptInterface
    public final boolean hasOverlayPermission() {
        Context context = this.f1770a;
        if (!(context instanceof MainActivity)) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) context;
        mainActivity.getClass();
        return Settings.canDrawOverlays(mainActivity);
    }

    @JavascriptInterface
    public final void onDowngradeArtClick() {
        d.a("pm uninstall com.google.android.art && reboot").S2();
        Toast.makeText(this.f1770a, "ART downgrade done, please reboot your device", 1).show();
    }

    @JavascriptInterface
    public final void onLoginClick() {
        Context context = this.f1770a;
        if (context instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context;
            f1.a aVar = mainActivity.f1648y;
            if (aVar == null) {
                h.E2("account");
                throw null;
            }
            String str = p0.f3210a;
            n0 n0Var = new n0(aVar);
            String string = mainActivity.getString(R.string.com_auth0_scheme);
            h.a0(string, "getString(...)");
            Locale locale = Locale.ROOT;
            h.a0(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!h.I(string, lowerCase)) {
                Log.w(p0.f3210a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            n0Var.f3202c = string;
            LinkedHashMap linkedHashMap = n0Var.f3200a;
            linkedHashMap.put("scope", "openid profile email offline_access");
            k kVar = new k(0, mainActivity);
            p0.f3211b = null;
            if (n0Var.f3204e.a(mainActivity.getPackageManager()) == null) {
                kVar.a(new g1.c("a0.browser_not_available", "No compatible Browser application is installed."));
                return;
            }
            c0 c0Var = new c0(aVar, kVar, linkedHashMap, n0Var.f3204e);
            LinkedHashMap linkedHashMap2 = n0Var.f3201b;
            h.b0(linkedHashMap2, "headers");
            HashMap map = c0Var.f3162n;
            map.putAll(linkedHashMap2);
            c0Var.f3165q = null;
            c0Var.f3166r = null;
            boolean zIsEmpty = TextUtils.isEmpty(null);
            b bVar = c0Var.f3164p;
            c0Var.f3167s = zIsEmpty ? String.valueOf(bVar.f2303a.f2026b) : null;
            p0.f3211b = c0Var;
            if (n0Var.f3203d == null) {
                n0Var.f3203d = h.M0(n0Var.f3202c, mainActivity.getApplicationContext().getPackageName(), String.valueOf(aVar.f2026b));
            }
            String str2 = n0Var.f3203d;
            h.X(str2);
            LinkedHashMap linkedHashMap3 = c0Var.f3161m;
            h.b0(linkedHashMap3, "parameters");
            linkedHashMap3.put("scope", linkedHashMap3.containsKey("scope") ? h.i1((String) j.X2(linkedHashMap3)) : "openid profile email");
            if (c0Var.f3165q == null) {
                c0Var.f3165q = new h0(bVar, str2, map);
            }
            h0 h0Var = c0Var.f3165q;
            h.X(h0Var);
            String str3 = h0Var.f3179d;
            h.a0(str3, "codeChallenge");
            linkedHashMap3.put("code_challenge", str3);
            linkedHashMap3.put("code_challenge_method", "S256");
            String str4 = c0.f3157t;
            Log.v(str4, "Using PKCE authentication flow");
            f1.a aVar2 = c0Var.f3158j;
            linkedHashMap3.put("auth0Client", aVar2.f2027c.f3444a);
            linkedHashMap3.put("client_id", aVar2.f2025a);
            linkedHashMap3.put("redirect_uri", str2);
            String strEncodeToString = (String) linkedHashMap3.get("state");
            if (strEncodeToString == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                strEncodeToString = Base64.encodeToString(bArr, 11);
                h.a0(strEncodeToString, "encodeToString(\n        ….NO_PADDING\n            )");
            }
            String strEncodeToString2 = (String) linkedHashMap3.get("nonce");
            if (strEncodeToString2 == null) {
                byte[] bArr2 = new byte[32];
                new SecureRandom().nextBytes(bArr2);
                strEncodeToString2 = Base64.encodeToString(bArr2, 11);
                h.a0(strEncodeToString2, "encodeToString(\n        ….NO_PADDING\n            )");
            }
            linkedHashMap3.put("state", strEncodeToString);
            linkedHashMap3.put("nonce", strEncodeToString2);
            s sVar = aVar2.f2026b;
            h.X(sVar);
            r rVarF = sVar.f();
            rVarF.d("authorize", 0, 9, false, true);
            Uri.Builder builderBuildUpon = Uri.parse(rVarF.b().f4427h).buildUpon();
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri uriBuild = builderBuildUpon.build();
            Log.d(str4, "Using the following Authorize URI: " + uriBuild);
            h.a0(uriBuild, "uri");
            int i4 = AuthenticationActivity.f1300d;
            z0.c.a(mainActivity, uriBuild, c0Var.f3160l, c0Var.f3163o);
        }
    }

    @JavascriptInterface
    public final void onLogoutClick() {
        Context context = this.f1770a;
        if (context instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context;
            mainActivity.getClass();
            mainActivity.runOnUiThread(new o(mainActivity, 0));
        }
    }

    @JavascriptInterface
    public final void onStartClick() {
        if (this.f1770a instanceof MainActivity) {
            kotlinx.coroutines.scheduling.d dVar = x.f4128a;
            h.s1(kotlinx.coroutines.internal.k.f3303a, new d(this, null));
        }
    }

    @JavascriptInterface
    public final void onStopClick() {
        Context context = this.f1770a;
        if (context instanceof MainActivity) {
            ((MainActivity) context).p(true);
            h.B2(context);
            ((MainActivity) context).p(false);
        }
    }

    @JavascriptInterface
    public final void requestOverlayPermission() {
        Context context = this.f1770a;
        if (context instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context;
            mainActivity.getClass();
            if (Settings.canDrawOverlays(mainActivity)) {
                return;
            }
            mainActivity.D.Q2(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())));
        }
    }
}
