package i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f2540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2 f2541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2 f2542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2545j = new int[2];

    public c2(View view) {
        this.f2540e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2537b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2538c = tapTimeout;
        this.f2539d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b2 b2Var = this.f2542g;
        View view = this.f2540e;
        if (b2Var != null) {
            view.removeCallbacks(b2Var);
        }
        b2 b2Var2 = this.f2541f;
        if (b2Var2 != null) {
            view.removeCallbacks(b2Var2);
        }
    }

    public abstract h.g0 b();

    public abstract boolean c();

    public boolean d() {
        h.g0 g0VarB = b();
        if (g0VarB == null || !g0VarB.a()) {
            return true;
        }
        g0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        z1 z1VarF;
        boolean z5 = this.f2543h;
        View view2 = this.f2540e;
        if (z5) {
            h.g0 g0VarB = b();
            if (g0VarB != null && g0VarB.a() && (z1VarF = g0VarB.f()) != null && z1VarF.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2545j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                z1VarF.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = z1VarF.b(motionEventObtainNoHistory, this.f2544i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z6) {
                    z4 = true;
                } else if (d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (d()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f2544i = motionEvent.getPointerId(0);
                    if (this.f2541f == null) {
                        this.f2541f = new b2(this, 0);
                    }
                    view2.postDelayed(this.f2541f, this.f2538c);
                    if (this.f2542g == null) {
                        this.f2542g = new b2(this, 1);
                    }
                    view2.postDelayed(this.f2542g, this.f2539d);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2544i);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y4 = motionEvent.getY(iFindPointerIndex);
                        float f5 = this.f2537b;
                        float f6 = -f5;
                        if (x4 < f6 || y4 < f6 || x4 >= (view2.getRight() - view2.getLeft()) + f5 || y4 >= (view2.getBottom() - view2.getTop()) + f5) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z4 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2543h = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2543h = false;
        this.f2544i = -1;
        b2 b2Var = this.f2541f;
        if (b2Var != null) {
            this.f2540e.removeCallbacks(b2Var);
        }
    }
}
