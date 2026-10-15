package p0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.activity.j;
import c3.h;
import i0.v0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f3731v = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3733b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f3735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f3736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f3737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f3739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f3740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f3741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f3743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f3747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f3748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f3749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewGroup f3751t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3734c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f3752u = new j(5, this);

    public e(Context context, ViewGroup viewGroup, h hVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3751t = viewGroup;
        this.f3748q = hVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3746o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3733b = viewConfiguration.getScaledTouchSlop();
        this.f3744m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3745n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3747p = new OverScroller(context, f3731v);
    }

    public final void a() {
        this.f3734c = -1;
        float[] fArr = this.f3735d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3736e, 0.0f);
            Arrays.fill(this.f3737f, 0.0f);
            Arrays.fill(this.f3738g, 0.0f);
            Arrays.fill(this.f3739h, 0);
            Arrays.fill(this.f3740i, 0);
            Arrays.fill(this.f3741j, 0);
            this.f3742k = 0;
        }
        VelocityTracker velocityTracker = this.f3743l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3743l = null;
        }
    }

    public final void b(View view, int i4) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3751t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f3749r = view;
        this.f3734c = i4;
        this.f3748q.M1(view, i4);
        n(1);
    }

    public final boolean c(View view, float f5, float f6) {
        if (view == null) {
            return false;
        }
        h hVar = this.f3748q;
        boolean z4 = hVar.e1(view) > 0;
        boolean z5 = hVar.f1() > 0;
        if (z4 && z5) {
            float f7 = (f6 * f6) + (f5 * f5);
            int i4 = this.f3733b;
            return f7 > ((float) (i4 * i4));
        }
        if (z4) {
            return Math.abs(f5) > ((float) this.f3733b);
        }
        return z5 && Math.abs(f6) > ((float) this.f3733b);
    }

    public final void d(int i4) {
        float[] fArr = this.f3735d;
        if (fArr != null) {
            int i5 = this.f3742k;
            int i6 = 1 << i4;
            if ((i5 & i6) != 0) {
                fArr[i4] = 0.0f;
                this.f3736e[i4] = 0.0f;
                this.f3737f[i4] = 0.0f;
                this.f3738g[i4] = 0.0f;
                this.f3739h[i4] = 0;
                this.f3740i[i4] = 0;
                this.f3741j[i4] = 0;
                this.f3742k = (~i6) & i5;
            }
        }
    }

    public final int e(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f3751t.getWidth();
        float f5 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / width) - 0.5f) * 0.47123894f)) * f5) + f5;
        int iAbs = Math.abs(i5);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3732a == 2) {
            OverScroller overScroller = this.f3747p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3749r.getLeft();
            int top = currY - this.f3749r.getTop();
            if (left != 0) {
                View view = this.f3749r;
                WeakHashMap weakHashMap = v0.f2983a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3749r;
                WeakHashMap weakHashMap2 = v0.f2983a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3748q.O1(this.f3749r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.f3751t.post(this.f3752u);
        }
        return this.f3732a == 2;
    }

    public final View g(int i4, int i5) {
        ViewGroup viewGroup = this.f3751t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3748q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i4, int i5, int i6, int i7) {
        float f5;
        float f6;
        float f7;
        float f8;
        int left = this.f3749r.getLeft();
        int top = this.f3749r.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        OverScroller overScroller = this.f3747p;
        int i10 = 0;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f3749r;
        int i11 = (int) this.f3745n;
        int i12 = (int) this.f3744m;
        int iAbs = Math.abs(i6);
        if (iAbs < i11) {
            i6 = 0;
        } else if (iAbs > i12) {
            i6 = i6 > 0 ? i12 : -i12;
        }
        int iAbs2 = Math.abs(i7);
        if (iAbs2 < i11) {
            i7 = i10;
        } else if (iAbs2 > i12) {
            if (i7 > 0) {
                i7 = i12;
            } else {
                i10 = -i12;
                i7 = i10;
            }
        }
        int iAbs3 = Math.abs(i8);
        int iAbs4 = Math.abs(i9);
        int iAbs5 = Math.abs(i6);
        int iAbs6 = Math.abs(i7);
        int i13 = iAbs5 + iAbs6;
        int i14 = iAbs3 + iAbs4;
        if (i6 != 0) {
            f5 = iAbs5;
            f6 = i13;
        } else {
            f5 = iAbs3;
            f6 = i14;
        }
        float f9 = f5 / f6;
        if (i7 != 0) {
            f7 = iAbs6;
            f8 = i13;
        } else {
            f7 = iAbs4;
            f8 = i14;
        }
        float f10 = f7 / f8;
        h hVar = this.f3748q;
        overScroller.startScroll(left, top, i8, i9, (int) ((e(i9, i7, hVar.f1()) * f10) + (e(i8, i6, hVar.e1(view)) * f9)));
        n(2);
        return true;
    }

    public final boolean i(int i4) {
        if ((this.f3742k & (1 << i4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3743l == null) {
            this.f3743l = VelocityTracker.obtain();
        }
        this.f3743l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x4, (int) y4);
            l(x4, y4, pointerId);
            q(viewG, pointerId);
            int i5 = this.f3739h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3732a == 1) {
                k();
            }
            a();
            return;
        }
        h hVar = this.f3748q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3732a == 1) {
                    this.f3750s = true;
                    hVar.P1(this.f3749r, 0.0f, 0.0f);
                    this.f3750s = false;
                    if (this.f3732a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                l(x5, y5, pointerId2);
                if (this.f3732a == 0) {
                    q(g((int) x5, (int) y5), pointerId2);
                    int i6 = this.f3739h[pointerId2];
                    return;
                }
                int i7 = (int) x5;
                int i8 = (int) y5;
                View view = this.f3749r;
                if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                    q(this.f3749r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3732a == 1 && pointerId3 == this.f3734c) {
                int pointerCount = motionEvent.getPointerCount();
                while (i4 < pointerCount) {
                    int pointerId4 = motionEvent.getPointerId(i4);
                    if (pointerId4 != this.f3734c) {
                        View viewG2 = g((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                        View view2 = this.f3749r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            if (this.f3734c == -1) {
                                break;
                            }
                        }
                    }
                    i4++;
                }
                k();
            }
            d(pointerId3);
            return;
        }
        if (this.f3732a == 1) {
            if (i(this.f3734c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3734c);
                float x6 = motionEvent.getX(iFindPointerIndex);
                float y6 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f3737f;
                int i9 = this.f3734c;
                int i10 = (int) (x6 - fArr[i9]);
                int i11 = (int) (y6 - this.f3738g[i9]);
                int left = this.f3749r.getLeft() + i10;
                int top = this.f3749r.getTop() + i11;
                int left2 = this.f3749r.getLeft();
                int top2 = this.f3749r.getTop();
                if (i10 != 0) {
                    left = hVar.g0(this.f3749r, left);
                    WeakHashMap weakHashMap = v0.f2983a;
                    this.f3749r.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    top = hVar.h0(this.f3749r, top);
                    WeakHashMap weakHashMap2 = v0.f2983a;
                    this.f3749r.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    hVar.O1(this.f3749r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i4 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i4);
            if (i(pointerId5)) {
                float x7 = motionEvent.getX(i4);
                float y7 = motionEvent.getY(i4);
                float f5 = x7 - this.f3735d[pointerId5];
                float f6 = y7 - this.f3736e[pointerId5];
                Math.abs(f5);
                Math.abs(f6);
                int i12 = this.f3739h[pointerId5];
                Math.abs(f6);
                Math.abs(f5);
                int i13 = this.f3739h[pointerId5];
                Math.abs(f5);
                Math.abs(f6);
                int i14 = this.f3739h[pointerId5];
                Math.abs(f6);
                Math.abs(f5);
                int i15 = this.f3739h[pointerId5];
                if (this.f3732a != 1) {
                    View viewG3 = g((int) x7, (int) y7);
                    if (c(viewG3, f5, f6) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i4++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3743l;
        float f5 = this.f3744m;
        velocityTracker.computeCurrentVelocity(1000, f5);
        float xVelocity = this.f3743l.getXVelocity(this.f3734c);
        float f6 = this.f3745n;
        float fAbs = Math.abs(xVelocity);
        float f7 = 0.0f;
        if (fAbs < f6) {
            xVelocity = 0.0f;
        } else if (fAbs > f5) {
            xVelocity = xVelocity > 0.0f ? f5 : -f5;
        }
        float yVelocity = this.f3743l.getYVelocity(this.f3734c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f6) {
            if (fAbs2 > f5) {
                if (yVelocity <= 0.0f) {
                    f5 = -f5;
                }
                f7 = f5;
            } else {
                f7 = yVelocity;
            }
        }
        this.f3750s = true;
        this.f3748q.P1(this.f3749r, xVelocity, f7);
        this.f3750s = false;
        if (this.f3732a == 1) {
            n(0);
        }
    }

    public final void l(float f5, float f6, int i4) {
        float[] fArr = this.f3735d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3736e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3737f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3738g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3739h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3740i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3741j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3735d = fArr2;
            this.f3736e = fArr3;
            this.f3737f = fArr4;
            this.f3738g = fArr5;
            this.f3739h = iArr;
            this.f3740i = iArr2;
            this.f3741j = iArr3;
        }
        float[] fArr9 = this.f3735d;
        this.f3737f[i4] = f5;
        fArr9[i4] = f5;
        float[] fArr10 = this.f3736e;
        this.f3738g[i4] = f6;
        fArr10[i4] = f6;
        int[] iArr7 = this.f3739h;
        int i6 = (int) f5;
        int i7 = (int) f6;
        ViewGroup viewGroup = this.f3751t;
        int left = viewGroup.getLeft();
        int i8 = this.f3746o;
        int i9 = i6 < left + i8 ? 1 : 0;
        if (i7 < viewGroup.getTop() + i8) {
            i9 |= 4;
        }
        if (i6 > viewGroup.getRight() - i8) {
            i9 |= 2;
        }
        if (i7 > viewGroup.getBottom() - i8) {
            i9 |= 8;
        }
        iArr7[i4] = i9;
        this.f3742k |= 1 << i4;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (i(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f3737f[pointerId] = x4;
                this.f3738g[pointerId] = y4;
            }
        }
    }

    public final void n(int i4) {
        this.f3751t.removeCallbacks(this.f3752u);
        if (this.f3732a != i4) {
            this.f3732a = i4;
            this.f3748q.N1(i4);
            if (this.f3732a == 0) {
                this.f3749r = null;
            }
        }
    }

    public final boolean o(int i4, int i5) {
        if (this.f3750s) {
            return h(i4, i5, (int) this.f3743l.getXVelocity(this.f3734c), (int) this.f3743l.getYVelocity(this.f3734c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    public final boolean p(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3743l == null) {
            this.f3743l = VelocityTracker.obtain();
        }
        this.f3743l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            l(x4, y4, pointerId);
            View viewG2 = g((int) x4, (int) y4);
            if (viewG2 == this.f3749r && this.f3732a == 2) {
                q(viewG2, pointerId);
            }
            int i4 = this.f3739h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                l(x5, y5, pointerId2);
                int i5 = this.f3732a;
                if (i5 == 0) {
                    int i6 = this.f3739h[pointerId2];
                } else if (i5 == 2 && (viewG = g((int) x5, (int) y5)) == this.f3749r) {
                    q(viewG, pointerId2);
                }
            } else if (actionMasked == 6) {
                d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f3735d != null && this.f3736e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 0; i7 < pointerCount; i7++) {
                int pointerId3 = motionEvent.getPointerId(i7);
                if (i(pointerId3)) {
                    float x6 = motionEvent.getX(i7);
                    float y6 = motionEvent.getY(i7);
                    float f5 = x6 - this.f3735d[pointerId3];
                    float f6 = y6 - this.f3736e[pointerId3];
                    View viewG3 = g((int) x6, (int) y6);
                    boolean z4 = viewG3 != null && c(viewG3, f5, f6);
                    if (!z4) {
                        Math.abs(f5);
                        Math.abs(f6);
                        int i8 = this.f3739h[pointerId3];
                        Math.abs(f6);
                        Math.abs(f5);
                        int i9 = this.f3739h[pointerId3];
                        Math.abs(f5);
                        Math.abs(f6);
                        int i10 = this.f3739h[pointerId3];
                        Math.abs(f6);
                        Math.abs(f5);
                        int i11 = this.f3739h[pointerId3];
                        if (this.f3732a != 1) {
                            break;
                        }
                    } else {
                        int left = viewG3.getLeft();
                        h hVar = this.f3748q;
                        int iG0 = hVar.g0(viewG3, ((int) f5) + left);
                        int top = viewG3.getTop();
                        int iH0 = hVar.h0(viewG3, ((int) f6) + top);
                        int iE1 = hVar.e1(viewG3);
                        int iF1 = hVar.f1();
                        if ((iE1 == 0 || (iE1 > 0 && iG0 == left)) && (iF1 == 0 || (iF1 > 0 && iH0 == top))) {
                            break;
                        }
                        Math.abs(f5);
                        Math.abs(f6);
                        int i12 = this.f3739h[pointerId3];
                        Math.abs(f6);
                        Math.abs(f5);
                        int i13 = this.f3739h[pointerId3];
                        Math.abs(f5);
                        Math.abs(f6);
                        int i14 = this.f3739h[pointerId3];
                        Math.abs(f6);
                        Math.abs(f5);
                        int i15 = this.f3739h[pointerId3];
                        if (this.f3732a != 1 || (z4 && q(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m(motionEvent);
        }
        return this.f3732a == 1;
    }

    public final boolean q(View view, int i4) {
        if (view == this.f3749r && this.f3734c == i4) {
            return true;
        }
        if (view == null || !this.f3748q.H2(view, i4)) {
            return false;
        }
        this.f3734c = i4;
        b(view, i4);
        return true;
    }
}
