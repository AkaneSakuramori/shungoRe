package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Application.ActivityLifecycleCallbacks {
    public static final f0 Companion = new f0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        c3.h.b0(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new g0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c3.h.b0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        c3.h.b0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c3.h.b0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        c3.h.b0(activity, "activity");
        int i4 = h0.f953c;
        f2.e.l(activity, l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        c3.h.b0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c3.h.b0(activity, "activity");
        c3.h.b0(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c3.h.b0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c3.h.b0(activity, "activity");
    }
}
