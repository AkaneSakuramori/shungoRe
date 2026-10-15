package p1;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VelocityTracker f3764g;

    @Override // w.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f3763f < 0) {
            this.f3763f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3760c) {
            int i4 = this.f3761d;
            if (i4 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y4 - this.f3762e) > this.f3763f) {
                this.f3762e = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f3764g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f3761d = -1;
        motionEvent.getX();
        motionEvent.getY();
        defpackage.a.l(view);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // w.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3761d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.f3762e = (int) motionEvent.getY(iFindPointerIndex);
                defpackage.a.n(view);
                throw null;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i4 = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f3761d = motionEvent.getPointerId(i4);
                    this.f3762e = (int) (motionEvent.getY(i4) + 0.5f);
                }
            }
            velocityTracker = this.f3764g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.f3760c;
        }
        VelocityTracker velocityTracker2 = this.f3764g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f3764g.computeCurrentVelocity(1000);
            this.f3764g.getYVelocity(this.f3761d);
            defpackage.a.n(view);
            throw null;
        }
        this.f3760c = false;
        this.f3761d = -1;
        VelocityTracker velocityTracker3 = this.f3764g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f3764g = null;
        }
        velocityTracker = this.f3764g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f3760c;
    }
}
