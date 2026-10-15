package i2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.shungo.app.MainActivity;
import i.a0;
import i0.c2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements y, l2.e, i0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3117b;

    public /* synthetic */ w(int i4) {
        this.f3117b = i4;
    }

    public final void a(Context context, m.f fVar, String str, Runnable runnable) {
        Bundle bundle;
        switch (this.f3117b) {
            case 1:
                a0 a0VarA = fVar.f3408b.a();
                if (str != null) {
                    ((Intent) a0VarA.f2519c).setPackage(str);
                }
                if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                    ((Intent) a0VarA.f2519c).putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                }
                ((Intent) a0VarA.f2519c).setData(fVar.f3407a);
                Intent intent = (Intent) a0VarA.f2519c;
                Bundle bundle2 = (Bundle) a0VarA.f2520d;
                Object obj = z.d.f5428a;
                z.a.b(context, intent, bundle2);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Uri uri = fVar.f3407a;
                Resources resources = context.getResources();
                try {
                    bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                l2.c cVar = new l2.c(bundle, resources);
                int i4 = l2.h.f3398b;
                Intent intent2 = new Intent(context, (Class<?>) l2.h.class);
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL", uri);
                Object obj2 = z.d.f5428a;
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", z.c.a(context, cVar.f3378a));
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", z.c.a(context, cVar.f3379b));
                List list = cVar.f3380c;
                if (list != null) {
                    intent2.putStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS", new ArrayList<>(list));
                }
                context.startActivity(intent2);
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override // i0.s
    public final c2 q(View view, c2 c2Var) {
        int i4 = MainActivity.F;
        c3.h.b0(view, "view");
        b0.c cVarF = c2Var.f2902a.f(7);
        c3.h.a0(cVarF, "getInsets(...)");
        view.setPadding(cVarF.f1081a, cVarF.f1082b, cVarF.f1083c, cVarF.f1084d);
        return c2Var;
    }
}
