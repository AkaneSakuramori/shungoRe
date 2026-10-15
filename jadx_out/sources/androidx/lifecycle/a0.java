package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ d0 this$0;

    public a0(d0 d0Var) {
        this.this$0 = d0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        c3.h.b0(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        c3.h.b0(activity, "activity");
        d0 d0Var = this.this$0;
        int i4 = d0Var.f944b + 1;
        d0Var.f944b = i4;
        if (i4 == 1 && d0Var.f947e) {
            d0Var.f949g.e(l.ON_START);
            d0Var.f947e = false;
        }
    }
}
