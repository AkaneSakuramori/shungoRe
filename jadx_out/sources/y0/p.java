package y0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m0 implements r0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final l B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f5249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f5250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f5253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f5254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5262p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f5265s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f5272z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5263q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5264r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5266t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5267u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5268v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5269w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f5270x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f5271y = new int[2];

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5272z = valueAnimatorOfFloat;
        this.A = 0;
        l lVar = new l(0, this);
        this.B = lVar;
        m mVar = new m(this);
        this.f5249c = stateListDrawable;
        this.f5250d = drawable;
        this.f5253g = stateListDrawable2;
        this.f5254h = drawable2;
        this.f5251e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f5252f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f5255i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f5256j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f5247a = i5;
        this.f5248b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new n(this));
        valueAnimatorOfFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f5265s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            o0 o0Var = recyclerView2.f1042m;
            if (o0Var != null) {
                o0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1044n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5265s;
            recyclerView3.f1046o.remove(this);
            if (recyclerView3.f1048p == this) {
                recyclerView3.f1048p = null;
            }
            ArrayList arrayList2 = this.f5265s.f1029f0;
            if (arrayList2 != null) {
                arrayList2.remove(mVar);
            }
            this.f5265s.removeCallbacks(lVar);
        }
        this.f5265s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f5265s.f1046o.add(this);
            this.f5265s.h(mVar);
        }
    }

    public static int e(float f5, float f6, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f6 - f5) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    @Override // y0.m0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f5263q != this.f5265s.getWidth() || this.f5264r != this.f5265s.getHeight()) {
            this.f5263q = this.f5265s.getWidth();
            this.f5264r = this.f5265s.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f5266t) {
                int i4 = this.f5263q;
                int i5 = this.f5251e;
                int i6 = i4 - i5;
                int i7 = this.f5258l;
                int i8 = this.f5257k;
                int i9 = i7 - (i8 / 2);
                StateListDrawable stateListDrawable = this.f5249c;
                stateListDrawable.setBounds(0, 0, i5, i8);
                int i10 = this.f5264r;
                int i11 = this.f5252f;
                Drawable drawable = this.f5250d;
                drawable.setBounds(0, 0, i11, i10);
                RecyclerView recyclerView2 = this.f5265s;
                WeakHashMap weakHashMap = i0.v0.f2983a;
                if (i0.f0.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i5, i9);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i5, -i9);
                } else {
                    canvas.translate(i6, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i9);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i6, -i9);
                }
            }
            if (this.f5267u) {
                int i12 = this.f5264r;
                int i13 = this.f5255i;
                int i14 = i12 - i13;
                int i15 = this.f5261o;
                int i16 = this.f5260n;
                int i17 = i15 - (i16 / 2);
                StateListDrawable stateListDrawable2 = this.f5253g;
                stateListDrawable2.setBounds(0, 0, i16, i13);
                int i18 = this.f5263q;
                int i19 = this.f5256j;
                Drawable drawable2 = this.f5254h;
                drawable2.setBounds(0, 0, i18, i19);
                canvas.translate(0.0f, i14);
                drawable2.draw(canvas);
                canvas.translate(i17, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i17, -i14);
            }
        }
    }

    public final boolean c(float f5, float f6) {
        if (f6 >= this.f5264r - this.f5255i) {
            int i4 = this.f5261o;
            int i5 = this.f5260n;
            if (f5 >= i4 - (i5 / 2) && f5 <= (i5 / 2) + i4) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f5, float f6) {
        RecyclerView recyclerView = this.f5265s;
        WeakHashMap weakHashMap = i0.v0.f2983a;
        boolean z4 = i0.f0.d(recyclerView) == 1;
        int i4 = this.f5251e;
        if (z4) {
            if (f5 > i4 / 2) {
                return false;
            }
        } else if (f5 < this.f5263q - i4) {
            return false;
        }
        int i5 = this.f5258l;
        int i6 = this.f5257k / 2;
        return f6 >= ((float) (i5 - i6)) && f6 <= ((float) (i6 + i5));
    }

    public final void f(int i4) {
        l lVar = this.B;
        StateListDrawable stateListDrawable = this.f5249c;
        if (i4 == 2 && this.f5268v != 2) {
            stateListDrawable.setState(C);
            this.f5265s.removeCallbacks(lVar);
        }
        if (i4 == 0) {
            this.f5265s.invalidate();
        } else {
            g();
        }
        if (this.f5268v == 2 && i4 != 2) {
            stateListDrawable.setState(D);
            this.f5265s.removeCallbacks(lVar);
            this.f5265s.postDelayed(lVar, 1200);
        } else if (i4 == 1) {
            this.f5265s.removeCallbacks(lVar);
            this.f5265s.postDelayed(lVar, 1500);
        }
        this.f5268v = i4;
    }

    public final void g() {
        int i4 = this.A;
        ValueAnimator valueAnimator = this.f5272z;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
