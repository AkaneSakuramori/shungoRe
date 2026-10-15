package s;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4180h;

    public n(o oVar, r.d dVar, p.d dVar2, int i4) {
        this.f4180h = oVar;
        this.f4179g = new WeakReference(dVar);
        r.c cVar = dVar.I;
        dVar2.getClass();
        this.f4173a = p.d.n(cVar);
        this.f4174b = p.d.n(dVar.J);
        this.f4175c = p.d.n(dVar.K);
        this.f4176d = p.d.n(dVar.L);
        this.f4177e = p.d.n(dVar.M);
        this.f4178f = i4;
    }

    public static boolean a(int i4, int i5, int i6) {
        if (i4 == i5) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i4);
        View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
        }
        return false;
    }

    public final void b(r.d dVar, b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i4;
        int iMakeMeasureSpec3;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i5;
        if (dVar == null) {
            return;
        }
        if (dVar.f3951g0 == 8) {
            bVar.f4138e = 0;
            bVar.f4139f = 0;
            bVar.f4140g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        int i6 = bVar.f4134a;
        int i7 = bVar.f4135b;
        int i8 = bVar.f4136c;
        int i9 = bVar.f4137d;
        int i10 = this.f4173a + this.f4174b;
        int i11 = this.f4175c;
        View view = (View) dVar.f3949f0;
        int iA = p.h.a(i6);
        r.c cVar = dVar.K;
        r.c cVar2 = dVar.I;
        if (iA == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else if (iA == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4177e, i11, -2);
        } else if (iA == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4177e, i11, -2);
            boolean z5 = dVar.f3971r == 1;
            int i12 = bVar.f4143j;
            if (i12 == 1 || i12 == 2) {
                boolean z6 = view.getMeasuredHeight() == dVar.l();
                if (bVar.f4143j == 2 || !z5 || ((z5 && z6) || dVar.B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.r(), 1073741824);
                }
            }
        } else if (iA != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i13 = this.f4177e;
            int i14 = cVar2 != null ? cVar2.f3935g : 0;
            if (cVar != null) {
                i14 += cVar.f3935g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i11 + i14, -1);
        }
        int iA2 = p.h.a(i7);
        if (iA2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (iA2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4178f, i10, -2);
        } else if (iA2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4178f, i10, -2);
            boolean z7 = dVar.f3972s == 1;
            int i15 = bVar.f4143j;
            if (i15 == 1 || i15 == 2) {
                boolean z8 = view.getMeasuredWidth() == dVar.r();
                if (bVar.f4143j == 2 || !z7 || ((z7 && z8) || dVar.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                }
            }
        } else if (iA2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i16 = this.f4178f;
            int i17 = cVar2 != null ? dVar.J.f3935g : 0;
            if (cVar != null) {
                i17 += dVar.L.f3935g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i10 + i17, -1);
        }
        r.e eVar = (r.e) dVar.T;
        Object obj = this.f4180h;
        if (eVar != null && r.k.b(((ConstraintLayout) obj).f520j, 256) && view.getMeasuredWidth() == dVar.r() && view.getMeasuredWidth() < eVar.r() && view.getMeasuredHeight() == dVar.l() && view.getMeasuredHeight() < eVar.l() && view.getBaseline() == dVar.f3939a0 && !dVar.A() && a(dVar.G, iMakeMeasureSpec, dVar.r()) && a(dVar.H, iMakeMeasureSpec2, dVar.l())) {
            bVar.f4138e = dVar.r();
            bVar.f4139f = dVar.l();
            bVar.f4140g = dVar.f3939a0;
            return;
        }
        boolean z9 = i6 == 3;
        boolean z10 = i7 == 3;
        boolean z11 = i7 == 4 || i7 == 1;
        boolean z12 = i6 == 4 || i6 == 1;
        boolean z13 = z9 && dVar.W > 0.0f;
        boolean z14 = z10 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        u.e eVar2 = (u.e) view.getLayoutParams();
        int i18 = bVar.f4143j;
        if (i18 != 1 && i18 != 2 && z9 && dVar.f3971r == 0 && z10 && dVar.f3972s == 0) {
            z4 = false;
            measuredWidth = 0;
            i5 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof r.g)) {
                ((t) view).j((r.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.f3950g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i19 = dVar.f3974u;
            int iMax2 = i19 > 0 ? Math.max(i19, measuredWidth2) : measuredWidth2;
            int i20 = dVar.f3975v;
            if (i20 > 0) {
                iMax2 = Math.min(i20, iMax2);
            }
            int i21 = dVar.f3977x;
            iMax = i21 > 0 ? Math.max(i21, measuredHeight) : measuredHeight;
            int i22 = iMakeMeasureSpec;
            int i23 = dVar.f3978y;
            if (i23 > 0) {
                iMax = Math.min(i23, iMax);
            }
            if (!r.k.b(((ConstraintLayout) obj).f520j, 1)) {
                if (z13 && z11) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z14 && z12) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z4 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i4 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i4 = 1073741824;
                    iMakeMeasureSpec3 = i22;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i4);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                dVar.G = iMakeMeasureSpec3;
                dVar.H = iMakeMeasureSpec2;
                z4 = false;
                dVar.f3950g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i5 = -1;
        }
        boolean z15 = baseline != i5 ? true : z4;
        if (measuredWidth != bVar.f4136c || iMax != bVar.f4137d) {
            z4 = true;
        }
        bVar.f4142i = z4;
        boolean z16 = eVar2.f4518c0 ? true : z15;
        if (z16 && baseline != -1 && dVar.f3939a0 != baseline) {
            bVar.f4142i = true;
        }
        bVar.f4138e = measuredWidth;
        bVar.f4139f = iMax;
        bVar.f4141h = z16;
        bVar.f4140g = baseline;
    }

    public n(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4180h = constraintLayout;
        this.f4179g = constraintLayout2;
    }
}
