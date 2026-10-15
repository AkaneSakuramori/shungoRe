package i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f2526c;

    public /* synthetic */ b2(c2 c2Var, int i4) {
        this.f2525b = i4;
        this.f2526c = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2525b;
        c2 c2Var = this.f2526c;
        switch (i4) {
            case 0:
                ViewParent parent = c2Var.f2540e.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                c2Var.a();
                View view = c2Var.f2540e;
                if (view.isEnabled() && !view.isLongClickable() && c2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    c2Var.f2543h = true;
                    break;
                }
                break;
        }
    }
}
