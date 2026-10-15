package l;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import i.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3361e;

    public c() {
        this.f3357a = new Intent("android.intent.action.VIEW");
        this.f3358b = new a();
        this.f3360d = 0;
        this.f3361e = true;
    }

    public final a0 a() {
        Intent intent = this.f3357a;
        Object obj = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            e0.c.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3361e);
        intent.putExtras(this.f3358b.a().b());
        Bundle bundle2 = this.f3359c;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f3360d);
        return new a0(intent, 2, obj);
    }

    public c(e eVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f3357a = intent;
        this.f3358b = new a();
        this.f3360d = 0;
        this.f3361e = true;
        if (eVar != null) {
            intent.setPackage(eVar.f3364b.getPackageName());
            a.a aVar = (a.a) eVar.f3363a;
            aVar.getClass();
            Bundle bundle = new Bundle();
            e0.c.b(bundle, "android.support.customtabs.extra.SESSION", aVar);
            PendingIntent pendingIntent = eVar.f3365c;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
