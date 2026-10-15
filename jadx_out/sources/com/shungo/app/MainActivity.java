package com.shungo.app;

import a3.j;
import a3.q;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.result.d;
import c3.e;
import c3.h;
import com.shungo.app.MainActivity;
import e.m;
import f1.a;
import h1.c;
import i0.k0;
import i0.v0;
import i2.w;
import j1.b0;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import l0.b;
import q3.f;
import q3.l;
import t3.u;
import u2.o;
import u2.p;
import u2.s;
import u2.t;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends m {
    public static final /* synthetic */ int F = 0;
    public SharedPreferences A;
    public c B;
    public boolean C;
    public final d D = this.f280l.c("activity_rq#" + this.f279k.getAndIncrement(), this, new c.d(), new b(this));
    public final int E = 111;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WebView f1647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f1648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l1.a f1649z;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(e eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i4 = sVar.f4754g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sVar.f4754g = i4 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, eVar);
            }
        } else {
            sVar = new s(this, eVar);
        }
        s sVar2 = sVar;
        Object objB = sVar2.f4752e;
        d3.a aVar = d3.a.f1765b;
        int i5 = sVar2.f4754g;
        if (i5 == 0) {
            h.D2(objB);
            l1.a aVar2 = this.f1649z;
            if (aVar2 == null) {
                return null;
            }
            u uVar = w2.d.f4898a;
            StringBuilder sb = new StringBuilder("&userId=");
            String str = aVar2.f3368b;
            if (str == null) {
                Map mapB3 = q.f76b;
                Map map = aVar2.f3373g;
                if ((map != null ? j.b3(map) : mapB3).containsKey("sub")) {
                    if (map != null) {
                        mapB3 = j.b3(map);
                    }
                    str = (String) mapB3.get("sub");
                } else {
                    str = null;
                }
            }
            sb.append(str);
            String string = sb.toString();
            sVar2.f4754g = 1;
            objB = w2.d.b(this, "/api/shungo/userInfo", string, null, sVar2, 24);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h.D2(objB);
        }
        w2.a aVar3 = (w2.a) objB;
        if (aVar3 == null) {
            return null;
        }
        System.out.println((Object) ("fetch user profile: " + aVar3.f4888b));
        return aVar3.f4887a;
    }

    public final WebView o() {
        WebView webView = this.f1647x;
        if (webView != null) {
            return webView;
        }
        h.E2("webView");
        throw null;
    }

    @Override // androidx.fragment.app.u, androidx.activity.n, y.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Integer numQ2;
        String defaultUserAgent;
        final String str;
        String str2;
        Integer numQ3;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(R.id.main);
        w wVar = new w(3);
        WeakHashMap weakHashMap = v0.f2983a;
        k0.u(viewFindViewById, wVar);
        String string = getString(R.string.com_auth0_client_id);
        h.a0(string, "getString(...)");
        String string2 = getString(R.string.com_auth0_domain);
        h.a0(string2, "getString(...)");
        a aVar = new a(string, string2);
        this.f1648y = aVar;
        this.B = new c(new g1.b(aVar), new h1.e(this));
        SharedPreferences sharedPreferences = getSharedPreferences("shungo", 0);
        h.a0(sharedPreferences, "getSharedPreferences(...)");
        this.A = sharedPreferences;
        View viewFindViewById2 = findViewById(R.id.webview);
        h.a0(viewFindViewById2, "findViewById(...)");
        this.f1647x = (WebView) viewFindViewById2;
        o().setWebViewClient(new t(this));
        o().addJavascriptInterface(new defpackage.e(this), "Android");
        int i4 = 1;
        o().getSettings().setJavaScriptEnabled(true);
        o().getSettings().setDomStorageEnabled(true);
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null || (str2 = currentWebViewPackage.versionName) == null || (numQ3 = q3.j.Q2(l.s3(str2, '.'))) == null) {
            numQ2 = null;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this);
            } catch (Exception unused) {
                defaultUserAgent = null;
            }
            if (defaultUserAgent != null) {
                Matcher matcher = new f("Chrome/(\\d+)").f3902b.matcher(defaultUserAgent);
                h.a0(matcher, "nativePattern.matcher(input)");
                q3.e eVar = !matcher.find(0) ? null : new q3.e(matcher, defaultUserAgent);
                if (eVar != null) {
                    if (eVar.f3901b == null) {
                        eVar.f3901b = new q3.d(eVar);
                    }
                    q3.d dVar = eVar.f3901b;
                    h.X(dVar);
                    numQ2 = q3.j.Q2((String) dVar.get(1));
                }
            }
        } else {
            numQ2 = Integer.valueOf(numQ3.intValue());
        }
        if (numQ2 == null || numQ2.intValue() >= this.E) {
            o().post(new o(this, i4));
        } else {
            PackageInfo currentWebViewPackage2 = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage2 == null || (str = currentWebViewPackage2.packageName) == null) {
                str = "com.google.android.webview";
            }
            new AlertDialog.Builder(this).setCancelable(false).setTitle("Update required").setMessage("Your Android System WebView is too old to display Shungo correctly. Please update it from the Play Store, then reopen the app.").setPositiveButton("Update", new DialogInterface.OnClickListener() { // from class: u2.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    int i6 = MainActivity.F;
                    MainActivity mainActivity = this.f4749b;
                    c3.h.b0(mainActivity, "this$0");
                    String str3 = str;
                    c3.h.b0(str3, "$webViewPackageName");
                    try {
                        mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(str3))));
                    } catch (ActivityNotFoundException unused2) {
                        mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str3))));
                    }
                    dialogInterface.dismiss();
                    mainActivity.finish();
                }
            }).setNegativeButton("Continue anyway", new DialogInterface.OnClickListener() { // from class: u2.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    int i6 = MainActivity.F;
                    MainActivity mainActivity = this.f4751b;
                    c3.h.b0(mainActivity, "this$0");
                    dialogInterface.dismiss();
                    mainActivity.o().post(new o(mainActivity, 1));
                }
            }).show();
        }
        try {
            getPackageManager().getPackageInfo("com.nianticlabs.pokemongo", 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            h.y2(this, "POGO not installed", "Pokémon GO was not found on your device, please install");
        }
    }

    public final void p(boolean z4) {
        o();
        o().post(new p(this, z4, 0));
    }

    public final void q() {
        k3.m mVar = new k3.m();
        a aVar = this.f1648y;
        if (aVar == null) {
            h.E2("account");
            throw null;
        }
        mVar.f3276b = new g1.b(aVar);
        o().evaluateJavascript("setLoading(true)", null);
        c cVar = this.B;
        if (cVar == null) {
            h.E2("manager");
            throw null;
        }
        cVar.f2501d.execute(new h1.b(cVar, new b0(mVar, 3, this)));
    }
}
