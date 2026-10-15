package j1;

import android.net.Uri;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import com.shungo.app.MainActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.a f3205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3206b = "https";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f3208d;

    public o0(f1.a aVar) {
        this.f3205a = aVar;
        g0.a aVar2 = new g0.a(1);
        this.f3208d = new m(aVar2.f2275b, aVar2.f2274a, (j) aVar2.f2276c);
    }

    public final void a(MainActivity mainActivity, androidx.fragment.app.k kVar) {
        p0.f3211b = null;
        if (this.f3208d.a(mainActivity.getPackageManager()) == null) {
            kVar.a(new g1.c("a0.browser_not_available", "No compatible Browser application is installed."));
            return;
        }
        String str = this.f3207c;
        f1.a aVar = this.f3205a;
        if (str == null) {
            this.f3207c = c3.h.M0(this.f3206b, mainActivity.getApplicationContext().getPackageName(), String.valueOf(aVar.f2026b));
        }
        String str2 = this.f3207c;
        c3.h.X(str2);
        w wVar = new w(aVar, kVar, str2, this.f3208d);
        p0.f3211b = wVar;
        HashMap map = wVar.f3226m;
        f1.a aVar2 = wVar.f3223j;
        map.put("auth0Client", aVar2.f2027c.f3444a);
        map.put("client_id", aVar2.f2025a);
        t3.s sVar = aVar2.f2026b;
        c3.h.X(sVar);
        t3.r rVarF = sVar.f();
        rVarF.d("v2", 0, 2, false, true);
        rVarF.d("logout", 0, 6, false, true);
        Uri.Builder builderBuildUpon = Uri.parse(rVarF.b().f4427h).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Uri uriBuild = builderBuildUpon.build();
        Log.d(w.f3222o, "Using the following Logout URI: " + uriBuild);
        c3.h.a0(uriBuild, "uri");
        int i4 = AuthenticationActivity.f1300d;
        z0.c.a(mainActivity, uriBuild, wVar.f3225l, wVar.f3227n);
    }
}
