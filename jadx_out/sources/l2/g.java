package l2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import e.i;
import e.n0;
import i.a0;
import i2.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f3389i = new w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f3394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l.e f3395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g.a f3396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3397h;

    public g(Context context) {
        int i4;
        int i5;
        i iVar;
        int i6 = 2;
        g.a aVar = new g.a(context, 2);
        this.f3390a = context;
        this.f3393d = 96375;
        this.f3396g = aVar;
        PackageManager packageManager = context.getPackageManager();
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        listQueryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap map = new HashMap();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (true) {
            i4 = 0;
            i5 = 1;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.serviceInfo.packageName;
            if (a.f3375a.contains(str2) && a.a(packageManager, str2, 362600000)) {
                map.put(str2, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i4 = 1;
                }
                map.put(str2, Integer.valueOf(i4 ^ 1));
            }
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        String str3 = null;
        while (it2.hasNext()) {
            String str4 = it2.next().activityInfo.packageName;
            int iIntValue = map.containsKey(str4) ? ((Integer) map.get(str4)).intValue() : 2;
            if (iIntValue == 0) {
                Log.d("TWAProviderPicker", "Found TWA provider, finishing search: " + str4);
                iVar = new i(i4, str4);
                this.f3391b = (String) iVar.f1879c;
                this.f3392c = iVar.f1878b;
            }
            if (iIntValue == 1) {
                Log.d("TWAProviderPicker", "Found Custom Tabs provider: " + str4);
                if (str == null) {
                    str = str4;
                }
            } else if (iIntValue == 2) {
                Log.d("TWAProviderPicker", "Found browser: " + str4);
                if (str3 == null) {
                    str3 = str4;
                }
            }
        }
        if (str != null) {
            Log.d("TWAProviderPicker", "Found no TWA providers, using first Custom Tabs provider: ".concat(str));
            iVar = new i(i5, str);
        } else {
            Log.d("TWAProviderPicker", "Found no TWA providers, using first browser: " + str3);
            iVar = new i(i6, str3);
        }
        this.f3391b = (String) iVar.f1879c;
        this.f3392c = iVar.f1878b;
    }

    public final void a(m.f fVar) {
        ArrayList arrayListA;
        w wVar = f3389i;
        if (this.f3397h) {
            throw new IllegalStateException("TwaLauncher already destroyed");
        }
        int i4 = 0;
        n0 n0Var = null;
        int i5 = this.f3392c;
        String str = this.f3391b;
        if (i5 == 0) {
            d dVar = new d(this, fVar);
            if (this.f3395f != null) {
                dVar.run();
            } else {
                d dVar2 = new d(this, fVar, i4);
                if (this.f3394e == null) {
                    this.f3394e = new f(this);
                }
                f fVar2 = this.f3394e;
                fVar2.f3386b = dVar;
                fVar2.f3387c = dVar2;
                Context context = this.f3390a;
                fVar2.f3362a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                context.bindService(intent, fVar2, 1);
            }
        } else {
            wVar.a(this.f3390a, fVar, str, null);
        }
        if (this.f3390a.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return;
        }
        try {
            arrayListA = (Build.VERSION.SDK_INT >= 28 ? new m.a() : new f2.e(6)).a(this.f3390a.getPackageManager(), str);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("PackageIdentity", "Could not get fingerprint for package.", e5);
            arrayListA = null;
        }
        if (arrayListA != null) {
            try {
                n0Var = new n0(7, m.d.a(str, arrayListA));
            } catch (IOException e6) {
                Log.e("Token", "Exception when creating token.", e6);
            }
        }
        SharedPreferences sharedPreferences = this.f3396g.f2207a.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
        if (n0Var == null) {
            sharedPreferences.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
        } else {
            byte[] bArr = ((m.d) n0Var.f1896c).f3404a;
            sharedPreferences.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
        }
    }

    public final void b(m.f fVar, Runnable runnable) {
        if (this.f3397h || this.f3395f == null) {
            return;
        }
        Log.d("TwaLauncher", "Launching Trusted Web Activity.");
        l.e eVar = this.f3395f;
        if (eVar == null) {
            fVar.getClass();
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        l.c cVar = fVar.f3408b;
        cVar.getClass();
        String packageName = eVar.f3364b.getPackageName();
        Intent intent = cVar.f3357a;
        intent.setPackage(packageName);
        a.a aVar = (a.a) eVar.f3363a;
        aVar.getClass();
        Bundle bundle = new Bundle();
        e0.c.b(bundle, "android.support.customtabs.extra.SESSION", aVar);
        PendingIntent pendingIntent = eVar.f3365c;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        intent.putExtras(bundle);
        Intent intent2 = (Intent) cVar.a().f2519c;
        intent2.setData(fVar.f3407a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        List listEmptyList = Collections.emptyList();
        fVar.f3409c.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", bundle2);
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", 0);
        a0 a0Var = new a0(intent2, 3, listEmptyList);
        Context context = this.f3390a;
        Boolean bool = b.f3377b;
        Intent intent3 = new Intent(context, (Class<?>) b.class);
        if (b.f3377b == null) {
            b.f3377b = Boolean.valueOf(intent3.resolveActivityInfo(context.getPackageManager(), 0) != null);
        }
        if (!Boolean.FALSE.equals(b.f3377b)) {
            intent3.setFlags(268435456);
            intent2.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(context, 0, intent3, 67108864));
        }
        Context context2 = this.f3390a;
        Iterator it = ((List) a0Var.f2520d).iterator();
        while (it.hasNext()) {
            context2.grantUriPermission(((Intent) a0Var.f2519c).getPackage(), (Uri) it.next(), 1);
        }
        Intent intent4 = (Intent) a0Var.f2519c;
        Object obj = z.d.f5428a;
        z.a.b(context2, intent4, null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
