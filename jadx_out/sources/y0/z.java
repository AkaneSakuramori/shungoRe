package y0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5349a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f5350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f5351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f5354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f5355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f5357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f5358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f5359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f5360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5364p;

    public z(Context context) {
        y0 y0Var = new y0();
        y0Var.f5345d = -1;
        y0Var.f5347f = false;
        y0Var.f5348g = 0;
        y0Var.f5342a = 0;
        y0Var.f5343b = 0;
        y0Var.f5344c = Integer.MIN_VALUE;
        y0Var.f5346e = null;
        this.f5355g = y0Var;
        this.f5357i = new LinearInterpolator();
        this.f5358j = new DecelerateInterpolator();
        this.f5361m = false;
        this.f5363o = 0;
        this.f5364p = 0;
        this.f5360l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i5;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i9 = i6 - i4;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i5;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    public int b(View view, int i4) {
        o0 o0Var = this.f5351c;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return a((view.getLeft() - ((p0) view.getLayoutParams()).f5274b.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, view.getRight() + ((p0) view.getLayoutParams()).f5274b.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.C(), o0Var.f5241n - o0Var.D(), i4);
    }

    public int c(View view, int i4) {
        o0 o0Var = this.f5351c;
        if (o0Var == null || !o0Var.e()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return a((view.getTop() - ((p0) view.getLayoutParams()).f5274b.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getBottom() + ((p0) view.getLayoutParams()).f5274b.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.E(), o0Var.f5242o - o0Var.B(), i4);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i4) {
        float fAbs = Math.abs(i4);
        if (!this.f5361m) {
            this.f5362n = d(this.f5360l);
            this.f5361m = true;
        }
        return (int) Math.ceil(fAbs * this.f5362n);
    }

    public PointF f(int i4) {
        Object obj = this.f5351c;
        if (obj instanceof z0) {
            return ((z0) obj).a(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + z0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void g(int i4, int i5) {
        PointF pointFF;
        RecyclerView recyclerView = this.f5350b;
        if (this.f5349a == -1 || recyclerView == null) {
            i();
        }
        if (this.f5352d && this.f5354f == null && this.f5351c != null && (pointFF = f(this.f5349a)) != null) {
            float f5 = pointFF.x;
            if (f5 != 0.0f || pointFF.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f5), (int) Math.signum(pointFF.y), null);
            }
        }
        this.f5352d = false;
        View view = this.f5354f;
        y0 y0Var = this.f5355g;
        if (view != null) {
            this.f5350b.getClass();
            d1 d1VarI = RecyclerView.I(view);
            if ((d1VarI != null ? d1VarI.c() : -1) == this.f5349a) {
                h(this.f5354f, recyclerView.f1025d0, y0Var);
                y0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5354f = null;
            }
        }
        if (this.f5353e) {
            a1 a1Var = recyclerView.f1025d0;
            if (this.f5350b.f1042m.v() == 0) {
                i();
            } else {
                int i6 = this.f5363o;
                int i7 = i6 - i4;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f5363o = i7;
                int i8 = this.f5364p;
                int i9 = i8 - i5;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f5364p = i9;
                if (i7 == 0 && i9 == 0) {
                    PointF pointFF2 = f(this.f5349a);
                    if (pointFF2 != null) {
                        float f6 = pointFF2.x;
                        if (f6 == 0.0f && pointFF2.y == 0.0f) {
                            y0Var.f5345d = this.f5349a;
                            i();
                        } else {
                            float f7 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f7 * f7) + (f6 * f6));
                            float f8 = pointFF2.x / fSqrt;
                            pointFF2.x = f8;
                            float f9 = pointFF2.y / fSqrt;
                            pointFF2.y = f9;
                            this.f5359k = pointFF2;
                            this.f5363o = (int) (f8 * 10000.0f);
                            this.f5364p = (int) (f9 * 10000.0f);
                            int iE = e(10000);
                            int i10 = (int) (this.f5363o * 1.2f);
                            int i11 = (int) (this.f5364p * 1.2f);
                            LinearInterpolator linearInterpolator = this.f5357i;
                            y0Var.f5342a = i10;
                            y0Var.f5343b = i11;
                            y0Var.f5344c = (int) (iE * 1.2f);
                            y0Var.f5346e = linearInterpolator;
                            y0Var.f5347f = true;
                        }
                    } else {
                        y0Var.f5345d = this.f5349a;
                        i();
                    }
                }
            }
            boolean z4 = y0Var.f5345d >= 0;
            y0Var.a(recyclerView);
            if (z4 && this.f5353e) {
                this.f5352d = true;
                recyclerView.f1019a0.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, a1 a1Var, y0 y0Var) {
        int i4;
        PointF pointF = this.f5359k;
        int i5 = 0;
        if (pointF != null) {
            float f5 = pointF.x;
            if (f5 == 0.0f) {
                i4 = 0;
            } else {
                i4 = f5 > 0.0f ? 1 : -1;
            }
        } else {
            i4 = 0;
        }
        int iB = b(view, i4);
        PointF pointF2 = this.f5359k;
        if (pointF2 != null) {
            float f6 = pointF2.y;
            if (f6 != 0.0f) {
                i5 = f6 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i5);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5358j;
            y0Var.f5342a = -iB;
            y0Var.f5343b = -iC;
            y0Var.f5344c = iCeil;
            y0Var.f5346e = decelerateInterpolator;
            y0Var.f5347f = true;
        }
    }

    public final void i() {
        if (this.f5353e) {
            this.f5353e = false;
            this.f5364p = 0;
            this.f5363o = 0;
            this.f5359k = null;
            this.f5350b.f1025d0.f5062a = -1;
            this.f5354f = null;
            this.f5349a = -1;
            this.f5352d = false;
            o0 o0Var = this.f5351c;
            if (o0Var.f5232e == this) {
                o0Var.f5232e = null;
            }
            this.f5351c = null;
            this.f5350b = null;
        }
    }
}
