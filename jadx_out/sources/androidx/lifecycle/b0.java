package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends f {
    final /* synthetic */ d0 this$0;

    public b0(d0 d0Var) {
        this.this$0 = d0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c3.h.b0(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = h0.f953c;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            c3.h.Y(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((h0) fragmentFindFragmentByTag).f954b = this.this$0.f951i;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c3.h.b0(activity, "activity");
        d0 d0Var = this.this$0;
        int i4 = d0Var.f945c - 1;
        d0Var.f945c = i4;
        if (i4 == 0) {
            Handler handler = d0Var.f948f;
            c3.h.X(handler);
            handler.postDelayed(d0Var.f950h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        c3.h.b0(activity, "activity");
        z.a(activity, new a0(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c3.h.b0(activity, "activity");
        d0 d0Var = this.this$0;
        int i4 = d0Var.f944b - 1;
        d0Var.f944b = i4;
        if (i4 == 0 && d0Var.f946d) {
            d0Var.f949g.e(l.ON_STOP);
            d0Var.f947e = true;
        }
    }
}
