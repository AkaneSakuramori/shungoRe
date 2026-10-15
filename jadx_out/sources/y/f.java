package y;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f5024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5026d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5027e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5028f = false;

    public f(Activity activity) {
        this.f5024b = activity;
        this.f5025c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5024b == activity) {
            this.f5024b = null;
            this.f5027e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f5027e || this.f5028f || this.f5026d) {
            return;
        }
        Object obj = this.f5023a;
        try {
            Object obj2 = g.f5031c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f5025c) {
                g.f5035g.postAtFrontOfQueue(new i.j(g.f5030b.get(activity), obj2, 4));
                this.f5028f = true;
                this.f5023a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f5024b == activity) {
            this.f5026d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
