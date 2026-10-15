package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c3.h;
import defpackage.a;
import java.util.List;
import y0.a0;
import y0.a1;
import y0.b0;
import y0.d1;
import y0.n0;
import y0.o0;
import y0.p0;
import y0.q;
import y0.v;
import y0.v0;
import y0.w;
import y0.x;
import y0.y;
import y0.z;
import y0.z0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends o0 implements z0 {
    public final v A;
    public final w B;
    public final int C;
    public final int[] D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x f1006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f1007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f1015z;

    public LinearLayoutManager(int i4) {
        this.f1005p = 1;
        this.f1009t = false;
        this.f1010u = false;
        this.f1011v = false;
        this.f1012w = true;
        this.f1013x = -1;
        this.f1014y = Integer.MIN_VALUE;
        this.f1015z = null;
        this.A = new v();
        this.B = new w();
        this.C = 2;
        this.D = new int[2];
        X0(i4);
        c(null);
        if (this.f1009t) {
            this.f1009t = false;
            j0();
        }
    }

    public final int A0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        a0 a0Var = this.f1007r;
        boolean z4 = !this.f1012w;
        return h.p0(a1Var, a0Var, H0(z4), G0(z4), this, this.f1012w);
    }

    public final int B0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        a0 a0Var = this.f1007r;
        boolean z4 = !this.f1012w;
        return h.q0(a1Var, a0Var, H0(z4), G0(z4), this, this.f1012w, this.f1010u);
    }

    public final int C0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        a0 a0Var = this.f1007r;
        boolean z4 = !this.f1012w;
        return h.r0(a1Var, a0Var, H0(z4), G0(z4), this, this.f1012w);
    }

    public final int D0(int i4) {
        if (i4 == 1) {
            return (this.f1005p != 1 && Q0()) ? 1 : -1;
        }
        if (i4 == 2) {
            return (this.f1005p != 1 && Q0()) ? -1 : 1;
        }
        if (i4 == 17) {
            return this.f1005p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 33) {
            return this.f1005p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 != 66) {
            return (i4 == 130 && this.f1005p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f1005p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void E0() {
        if (this.f1006q == null) {
            x xVar = new x();
            xVar.f5326a = true;
            xVar.f5333h = 0;
            xVar.f5334i = 0;
            xVar.f5336k = null;
            this.f1006q = xVar;
        }
    }

    public final int F0(v0 v0Var, x xVar, a1 a1Var, boolean z4) {
        int i4;
        int i5 = xVar.f5328c;
        int i6 = xVar.f5332g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                xVar.f5332g = i6 + i5;
            }
            T0(v0Var, xVar);
        }
        int i7 = xVar.f5328c + xVar.f5333h;
        while (true) {
            if ((!xVar.f5337l && i7 <= 0) || (i4 = xVar.f5329d) < 0 || i4 >= a1Var.b()) {
                break;
            }
            w wVar = this.B;
            wVar.f5322a = 0;
            wVar.f5323b = false;
            wVar.f5324c = false;
            wVar.f5325d = false;
            R0(v0Var, a1Var, xVar, wVar);
            if (!wVar.f5323b) {
                int i8 = xVar.f5327b;
                int i9 = wVar.f5322a;
                xVar.f5327b = (xVar.f5331f * i9) + i8;
                if (!wVar.f5324c || xVar.f5336k != null || !a1Var.f5068g) {
                    xVar.f5328c -= i9;
                    i7 -= i9;
                }
                int i10 = xVar.f5332g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    xVar.f5332g = i11;
                    int i12 = xVar.f5328c;
                    if (i12 < 0) {
                        xVar.f5332g = i11 + i12;
                    }
                    T0(v0Var, xVar);
                }
                if (z4 && wVar.f5325d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - xVar.f5328c;
    }

    public final View G0(boolean z4) {
        return this.f1010u ? K0(0, v(), z4) : K0(v() - 1, -1, z4);
    }

    public final View H0(boolean z4) {
        return this.f1010u ? K0(v() - 1, -1, z4) : K0(0, v(), z4);
    }

    public final int I0() {
        View viewK0 = K0(v() - 1, -1, false);
        if (viewK0 == null) {
            return -1;
        }
        return o0.F(viewK0);
    }

    @Override // y0.o0
    public final boolean J() {
        return true;
    }

    public final View J0(int i4, int i5) {
        int i6;
        int i7;
        E0();
        if (i5 <= i4 && i5 >= i4) {
            return u(i4);
        }
        if (this.f1007r.d(u(i4)) < this.f1007r.f()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.f1005p == 0 ? this.f5230c.h(i4, i5, i6, i7) : this.f5231d.h(i4, i5, i6, i7);
    }

    public final View K0(int i4, int i5, boolean z4) {
        E0();
        int i6 = z4 ? 24579 : 320;
        return this.f1005p == 0 ? this.f5230c.h(i4, i5, i6, 320) : this.f5231d.h(i4, i5, i6, 320);
    }

    public View L0(v0 v0Var, a1 a1Var, int i4, int i5, int i6) {
        E0();
        int iF = this.f1007r.f();
        int iE = this.f1007r.e();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View viewU = u(i4);
            int iF2 = o0.F(viewU);
            if (iF2 >= 0 && iF2 < i6) {
                if (((p0) viewU.getLayoutParams()).f5273a.j()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1007r.d(viewU) < iE && this.f1007r.b(viewU) >= iF) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i4 += i7;
        }
        return view != null ? view : view2;
    }

    public final int M0(int i4, v0 v0Var, a1 a1Var, boolean z4) {
        int iE;
        int iE2 = this.f1007r.e() - i4;
        if (iE2 <= 0) {
            return 0;
        }
        int i5 = -W0(-iE2, v0Var, a1Var);
        int i6 = i4 + i5;
        if (!z4 || (iE = this.f1007r.e() - i6) <= 0) {
            return i5;
        }
        this.f1007r.k(iE);
        return iE + i5;
    }

    public final int N0(int i4, v0 v0Var, a1 a1Var, boolean z4) {
        int iF;
        int iF2 = i4 - this.f1007r.f();
        if (iF2 <= 0) {
            return 0;
        }
        int i5 = -W0(iF2, v0Var, a1Var);
        int i6 = i4 + i5;
        if (!z4 || (iF = i6 - this.f1007r.f()) <= 0) {
            return i5;
        }
        this.f1007r.k(-iF);
        return i5 - iF;
    }

    public final View O0() {
        return u(this.f1010u ? 0 : v() - 1);
    }

    @Override // y0.o0
    public final void P(RecyclerView recyclerView) {
    }

    public final View P0() {
        return u(this.f1010u ? v() - 1 : 0);
    }

    @Override // y0.o0
    public View Q(View view, int i4, v0 v0Var, a1 a1Var) {
        int iD0;
        View viewJ0;
        V0();
        if (v() == 0 || (iD0 = D0(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        E0();
        Z0(iD0, (int) (this.f1007r.g() * 0.33333334f), false, a1Var);
        x xVar = this.f1006q;
        xVar.f5332g = Integer.MIN_VALUE;
        xVar.f5326a = false;
        F0(v0Var, xVar, a1Var, true);
        if (iD0 == -1) {
            viewJ0 = this.f1010u ? J0(v() - 1, -1) : J0(0, v());
        } else {
            viewJ0 = this.f1010u ? J0(0, v()) : J0(v() - 1, -1);
        }
        View viewP0 = iD0 == -1 ? P0() : O0();
        if (!viewP0.hasFocusable()) {
            return viewJ0;
        }
        if (viewJ0 == null) {
            return null;
        }
        return viewP0;
    }

    public final boolean Q0() {
        return A() == 1;
    }

    @Override // y0.o0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View viewK0 = K0(0, v(), false);
            accessibilityEvent.setFromIndex(viewK0 == null ? -1 : o0.F(viewK0));
            accessibilityEvent.setToIndex(I0());
        }
    }

    public void R0(v0 v0Var, a1 a1Var, x xVar, w wVar) {
        int iC;
        int i4;
        int i5;
        int iL;
        View viewB = xVar.b(v0Var);
        if (viewB == null) {
            wVar.f5323b = true;
            return;
        }
        p0 p0Var = (p0) viewB.getLayoutParams();
        if (xVar.f5336k == null) {
            if (this.f1010u == (xVar.f5331f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f1010u == (xVar.f5331f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        p0 p0Var2 = (p0) viewB.getLayoutParams();
        Rect rectJ = this.f5229b.J(viewB);
        int i6 = rectJ.left + rectJ.right;
        int i7 = rectJ.top + rectJ.bottom;
        int iW = o0.w(this.f5241n, this.f5239l, D() + C() + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) p0Var2).width, d());
        int iW2 = o0.w(this.f5242o, this.f5240m, B() + E() + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) p0Var2).height, e());
        if (s0(viewB, iW, iW2, p0Var2)) {
            viewB.measure(iW, iW2);
        }
        wVar.f5322a = this.f1007r.c(viewB);
        if (this.f1005p == 1) {
            if (Q0()) {
                iL = this.f5241n - D();
                iC = iL - this.f1007r.l(viewB);
            } else {
                iC = C();
                iL = this.f1007r.l(viewB) + iC;
            }
            if (xVar.f5331f == -1) {
                i4 = xVar.f5327b;
                i5 = i4 - wVar.f5322a;
            } else {
                i5 = xVar.f5327b;
                i4 = wVar.f5322a + i5;
            }
        } else {
            int iE = E();
            int iL2 = this.f1007r.l(viewB) + iE;
            if (xVar.f5331f == -1) {
                int i8 = xVar.f5327b;
                int i9 = i8 - wVar.f5322a;
                iL = i8;
                i4 = iL2;
                iC = i9;
                i5 = iE;
            } else {
                int i10 = xVar.f5327b;
                int i11 = wVar.f5322a + i10;
                iC = i10;
                i4 = iL2;
                i5 = iE;
                iL = i11;
            }
        }
        o0.L(viewB, iC, i5, iL, i4);
        if (p0Var.f5273a.j() || p0Var.f5273a.m()) {
            wVar.f5324c = true;
        }
        wVar.f5325d = viewB.hasFocusable();
    }

    public void S0(v0 v0Var, a1 a1Var, v vVar, int i4) {
    }

    public final void T0(v0 v0Var, x xVar) {
        int i4;
        if (!xVar.f5326a || xVar.f5337l) {
            return;
        }
        int i5 = xVar.f5332g;
        int i6 = xVar.f5334i;
        if (xVar.f5331f != -1) {
            if (i5 < 0) {
                return;
            }
            int i7 = i5 - i6;
            int iV = v();
            if (!this.f1010u) {
                for (int i8 = 0; i8 < iV; i8++) {
                    View viewU = u(i8);
                    if (this.f1007r.b(viewU) > i7 || this.f1007r.i(viewU) > i7) {
                        U0(v0Var, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = iV - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View viewU2 = u(i10);
                if (this.f1007r.b(viewU2) > i7 || this.f1007r.i(viewU2) > i7) {
                    U0(v0Var, i9, i10);
                    return;
                }
            }
            return;
        }
        int iV2 = v();
        if (i5 < 0) {
            return;
        }
        a0 a0Var = this.f1007r;
        int i11 = a0Var.f5061d;
        o0 o0Var = a0Var.f5081a;
        switch (i11) {
            case 0:
                i4 = o0Var.f5241n;
                break;
            default:
                i4 = o0Var.f5242o;
                break;
        }
        int i12 = (i4 - i5) + i6;
        if (this.f1010u) {
            for (int i13 = 0; i13 < iV2; i13++) {
                View viewU3 = u(i13);
                if (this.f1007r.d(viewU3) < i12 || this.f1007r.j(viewU3) < i12) {
                    U0(v0Var, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iV2 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewU4 = u(i15);
            if (this.f1007r.d(viewU4) < i12 || this.f1007r.j(viewU4) < i12) {
                U0(v0Var, i14, i15);
                return;
            }
        }
    }

    public final void U0(v0 v0Var, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                View viewU = u(i4);
                h0(i4);
                v0Var.g(viewU);
                i4--;
            }
            return;
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            View viewU2 = u(i6);
            h0(i6);
            v0Var.g(viewU2);
        }
    }

    public final void V0() {
        if (this.f1005p == 1 || !Q0()) {
            this.f1010u = this.f1009t;
        } else {
            this.f1010u = !this.f1009t;
        }
    }

    public final int W0(int i4, v0 v0Var, a1 a1Var) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        E0();
        this.f1006q.f5326a = true;
        int i5 = i4 > 0 ? 1 : -1;
        int iAbs = Math.abs(i4);
        Z0(i5, iAbs, true, a1Var);
        x xVar = this.f1006q;
        int iF0 = F0(v0Var, xVar, a1Var, false) + xVar.f5332g;
        if (iF0 < 0) {
            return 0;
        }
        if (iAbs > iF0) {
            i4 = i5 * iF0;
        }
        this.f1007r.k(-i4);
        this.f1006q.f5335j = i4;
        return i4;
    }

    public final void X0(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(a.e("invalid orientation:", i4));
        }
        c(null);
        if (i4 != this.f1005p || this.f1007r == null) {
            a0 a0VarA = b0.a(this, i4);
            this.f1007r = a0VarA;
            this.A.f5309a = a0VarA;
            this.f1005p = i4;
            j0();
        }
    }

    public void Y0(boolean z4) {
        c(null);
        if (this.f1011v == z4) {
            return;
        }
        this.f1011v = z4;
        j0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x0208  */
    /* JADX WARN: Code duplicated, block: B:119:0x021e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0233  */
    /* JADX WARN: Code duplicated, block: B:123:0x023e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0264  */
    /* JADX WARN: Code duplicated, block: B:132:0x026b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0274  */
    /* JADX WARN: Code duplicated, block: B:136:0x027b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:181:0x032e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    @Override // y0.o0
    public void Z(v0 v0Var, a1 a1Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        View viewL0;
        int iF;
        p0 p0Var;
        int i4;
        int iD;
        int i5;
        boolean z4;
        int i6;
        int i7;
        List list;
        int i8;
        int i9;
        int iM0;
        int i10;
        int i11;
        View viewQ;
        int iD2;
        int iE;
        int i12;
        int i13 = -1;
        if (!(this.f1015z == null && this.f1013x == -1) && a1Var.b() == 0) {
            e0(v0Var);
            return;
        }
        y yVar = this.f1015z;
        if (yVar != null && (i12 = yVar.f5339b) >= 0) {
            this.f1013x = i12;
        }
        E0();
        this.f1006q.f5326a = false;
        V0();
        RecyclerView recyclerView2 = this.f5229b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.f5228a.j(focusedChild)) {
            focusedChild = null;
        }
        v vVar = this.A;
        if (!vVar.f5313e || this.f1013x != -1 || this.f1015z != null) {
            vVar.d();
            vVar.f5312d = this.f1010u ^ this.f1011v;
            if (a1Var.f5068g || (i4 = this.f1013x) == -1) {
                if (v() != 0) {
                    recyclerView = this.f5229b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.f5228a.j(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        p0Var = (p0) focusedChild2.getLayoutParams();
                        if (p0Var.f5273a.j() && p0Var.f5273a.c() >= 0 && p0Var.f5273a.c() < a1Var.b()) {
                            vVar.c(focusedChild2, o0.F(focusedChild2));
                        } else if (this.f1008s == this.f1011v) {
                            if (vVar.f5312d) {
                                if (this.f1010u) {
                                    viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                                } else {
                                    viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                                }
                            } else if (this.f1010u) {
                                viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                            } else {
                                viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                            }
                            if (viewL0 != null) {
                                vVar.b(viewL0, o0.F(viewL0));
                                if (!a1Var.f5068g && x0() && (this.f1007r.d(viewL0) >= this.f1007r.e() || this.f1007r.b(viewL0) < this.f1007r.f())) {
                                    if (vVar.f5312d) {
                                        iF = this.f1007r.e();
                                    } else {
                                        iF = this.f1007r.f();
                                    }
                                    vVar.f5311c = iF;
                                }
                            } else {
                                vVar.a();
                                if (this.f1011v) {
                                    iB = a1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                vVar.f5310b = iB;
                            }
                        } else {
                            vVar.a();
                            if (this.f1011v) {
                                iB = a1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            vVar.f5310b = iB;
                        }
                    } else if (this.f1008s == this.f1011v) {
                        if (vVar.f5312d) {
                            if (this.f1010u) {
                                viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                            } else {
                                viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                            }
                        } else if (this.f1010u) {
                            viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                        } else {
                            viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                        }
                        if (viewL0 != null) {
                            vVar.b(viewL0, o0.F(viewL0));
                            if (!a1Var.f5068g) {
                                if (vVar.f5312d) {
                                    iF = this.f1007r.e();
                                } else {
                                    iF = this.f1007r.f();
                                }
                                vVar.f5311c = iF;
                            }
                        } else {
                            vVar.a();
                            if (this.f1011v) {
                                iB = a1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            vVar.f5310b = iB;
                        }
                    } else {
                        vVar.a();
                        if (this.f1011v) {
                            iB = a1Var.b() - 1;
                        } else {
                            iB = 0;
                        }
                        vVar.f5310b = iB;
                    }
                } else {
                    vVar.a();
                    if (this.f1011v) {
                        iB = a1Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    vVar.f5310b = iB;
                }
            } else if (i4 < 0 || i4 >= a1Var.b()) {
                this.f1013x = -1;
                this.f1014y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.f5229b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        p0Var = (p0) focusedChild2.getLayoutParams();
                        if (p0Var.f5273a.j()) {
                            if (this.f1008s == this.f1011v) {
                                if (vVar.f5312d) {
                                    if (this.f1010u) {
                                        viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                                    } else {
                                        viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                                    }
                                } else if (this.f1010u) {
                                    viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                                } else {
                                    viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                                }
                                if (viewL0 != null) {
                                    vVar.b(viewL0, o0.F(viewL0));
                                    if (!a1Var.f5068g) {
                                        if (vVar.f5312d) {
                                            iF = this.f1007r.e();
                                        } else {
                                            iF = this.f1007r.f();
                                        }
                                        vVar.f5311c = iF;
                                    }
                                } else {
                                    vVar.a();
                                    if (this.f1011v) {
                                        iB = a1Var.b() - 1;
                                    } else {
                                        iB = 0;
                                    }
                                    vVar.f5310b = iB;
                                }
                            } else {
                                vVar.a();
                                if (this.f1011v) {
                                    iB = a1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                vVar.f5310b = iB;
                            }
                        } else if (this.f1008s == this.f1011v) {
                            if (vVar.f5312d) {
                                if (this.f1010u) {
                                    viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                                } else {
                                    viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                                }
                            } else if (this.f1010u) {
                                viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                            } else {
                                viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                            }
                            if (viewL0 != null) {
                                vVar.b(viewL0, o0.F(viewL0));
                                if (!a1Var.f5068g) {
                                    if (vVar.f5312d) {
                                        iF = this.f1007r.e();
                                    } else {
                                        iF = this.f1007r.f();
                                    }
                                    vVar.f5311c = iF;
                                }
                            } else {
                                vVar.a();
                                if (this.f1011v) {
                                    iB = a1Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                vVar.f5310b = iB;
                            }
                        } else {
                            vVar.a();
                            if (this.f1011v) {
                                iB = a1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            vVar.f5310b = iB;
                        }
                    } else if (this.f1008s == this.f1011v) {
                        if (vVar.f5312d) {
                            if (this.f1010u) {
                                viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                            } else {
                                viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                            }
                        } else if (this.f1010u) {
                            viewL0 = L0(v0Var, a1Var, v() - 1, -1, a1Var.b());
                        } else {
                            viewL0 = L0(v0Var, a1Var, 0, v(), a1Var.b());
                        }
                        if (viewL0 != null) {
                            vVar.b(viewL0, o0.F(viewL0));
                            if (!a1Var.f5068g) {
                                if (vVar.f5312d) {
                                    iF = this.f1007r.e();
                                } else {
                                    iF = this.f1007r.f();
                                }
                                vVar.f5311c = iF;
                            }
                        } else {
                            vVar.a();
                            if (this.f1011v) {
                                iB = a1Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            vVar.f5310b = iB;
                        }
                    } else {
                        vVar.a();
                        if (this.f1011v) {
                            iB = a1Var.b() - 1;
                        } else {
                            iB = 0;
                        }
                        vVar.f5310b = iB;
                    }
                } else {
                    vVar.a();
                    if (this.f1011v) {
                        iB = a1Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    vVar.f5310b = iB;
                }
            } else {
                int i14 = this.f1013x;
                vVar.f5310b = i14;
                y yVar2 = this.f1015z;
                if (yVar2 != null && yVar2.f5339b >= 0) {
                    boolean z5 = yVar2.f5341d;
                    vVar.f5312d = z5;
                    if (z5) {
                        vVar.f5311c = this.f1007r.e() - this.f1015z.f5340c;
                    } else {
                        vVar.f5311c = this.f1007r.f() + this.f1015z.f5340c;
                    }
                } else if (this.f1014y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i14);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            vVar.f5312d = (this.f1013x < o0.F(u(0))) == this.f1010u;
                        }
                        vVar.a();
                    } else if (this.f1007r.c(viewQ2) > this.f1007r.g()) {
                        vVar.a();
                    } else if (this.f1007r.d(viewQ2) - this.f1007r.f() < 0) {
                        vVar.f5311c = this.f1007r.f();
                        vVar.f5312d = false;
                    } else if (this.f1007r.e() - this.f1007r.b(viewQ2) < 0) {
                        vVar.f5311c = this.f1007r.e();
                        vVar.f5312d = true;
                    } else {
                        vVar.f5311c = vVar.f5312d ? this.f1007r.h() + this.f1007r.b(viewQ2) : this.f1007r.d(viewQ2);
                    }
                } else {
                    boolean z6 = this.f1010u;
                    vVar.f5312d = z6;
                    if (z6) {
                        vVar.f5311c = this.f1007r.e() - this.f1014y;
                    } else {
                        vVar.f5311c = this.f1007r.f() + this.f1014y;
                    }
                }
            }
            vVar.f5313e = true;
        } else if (focusedChild != null && (this.f1007r.d(focusedChild) >= this.f1007r.e() || this.f1007r.b(focusedChild) <= this.f1007r.f())) {
            vVar.c(focusedChild, o0.F(focusedChild));
        }
        x xVar = this.f1006q;
        xVar.f5331f = xVar.f5335j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(a1Var, iArr);
        int iF2 = this.f1007r.f() + Math.max(0, iArr[0]);
        int iMax = Math.max(0, iArr[1]);
        a0 a0Var = this.f1007r;
        int i15 = a0Var.f5061d;
        o0 o0Var = a0Var.f5081a;
        switch (i15) {
            case 0:
                iD = o0Var.D();
                break;
            default:
                iD = o0Var.B();
                break;
        }
        int i16 = iD + iMax;
        if (a1Var.f5068g && (i11 = this.f1013x) != -1 && this.f1014y != Integer.MIN_VALUE && (viewQ = q(i11)) != null) {
            if (this.f1010u) {
                iE = this.f1007r.e() - this.f1007r.b(viewQ);
                iD2 = this.f1014y;
            } else {
                iD2 = this.f1007r.d(viewQ) - this.f1007r.f();
                iE = this.f1014y;
            }
            int i17 = iE - iD2;
            if (i17 > 0) {
                iF2 += i17;
            } else {
                i16 -= i17;
            }
        }
        if (!vVar.f5312d ? !this.f1010u : this.f1010u) {
            i13 = 1;
        }
        S0(v0Var, a1Var, vVar, i13);
        p(v0Var);
        x xVar2 = this.f1006q;
        a0 a0Var2 = this.f1007r;
        int i18 = a0Var2.f5061d;
        o0 o0Var2 = a0Var2.f5081a;
        switch (i18) {
            case 0:
                i5 = o0Var2.f5239l;
                break;
            default:
                i5 = o0Var2.f5240m;
                break;
        }
        if (i5 == 0) {
            switch (i18) {
                case 0:
                    i10 = o0Var2.f5241n;
                    break;
                default:
                    i10 = o0Var2.f5242o;
                    break;
            }
            if (i10 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        xVar2.f5337l = z4;
        xVar2.getClass();
        this.f1006q.f5334i = 0;
        if (vVar.f5312d) {
            b1(vVar.f5310b, vVar.f5311c);
            x xVar3 = this.f1006q;
            xVar3.f5333h = iF2;
            F0(v0Var, xVar3, a1Var, false);
            x xVar4 = this.f1006q;
            i7 = xVar4.f5327b;
            int i19 = xVar4.f5329d;
            int i20 = xVar4.f5328c;
            if (i20 > 0) {
                i16 += i20;
            }
            a1(vVar.f5310b, vVar.f5311c);
            x xVar5 = this.f1006q;
            xVar5.f5333h = i16;
            xVar5.f5329d += xVar5.f5330e;
            F0(v0Var, xVar5, a1Var, false);
            x xVar6 = this.f1006q;
            i6 = xVar6.f5327b;
            int i21 = xVar6.f5328c;
            if (i21 > 0) {
                b1(i19, i7);
                x xVar7 = this.f1006q;
                xVar7.f5333h = i21;
                F0(v0Var, xVar7, a1Var, false);
                i7 = this.f1006q.f5327b;
            }
        } else {
            a1(vVar.f5310b, vVar.f5311c);
            x xVar8 = this.f1006q;
            xVar8.f5333h = i16;
            F0(v0Var, xVar8, a1Var, false);
            x xVar9 = this.f1006q;
            i6 = xVar9.f5327b;
            int i22 = xVar9.f5329d;
            int i23 = xVar9.f5328c;
            if (i23 > 0) {
                iF2 += i23;
            }
            b1(vVar.f5310b, vVar.f5311c);
            x xVar10 = this.f1006q;
            xVar10.f5333h = iF2;
            xVar10.f5329d += xVar10.f5330e;
            F0(v0Var, xVar10, a1Var, false);
            x xVar11 = this.f1006q;
            i7 = xVar11.f5327b;
            int i24 = xVar11.f5328c;
            if (i24 > 0) {
                a1(i22, i6);
                x xVar12 = this.f1006q;
                xVar12.f5333h = i24;
                F0(v0Var, xVar12, a1Var, false);
                i6 = this.f1006q.f5327b;
            }
        }
        if (v() > 0) {
            if (this.f1010u ^ this.f1011v) {
                int iM1 = M0(i6, v0Var, a1Var, true);
                i8 = i7 + iM1;
                i9 = i6 + iM1;
                iM0 = N0(i8, v0Var, a1Var, false);
            } else {
                int iN0 = N0(i7, v0Var, a1Var, true);
                i8 = i7 + iN0;
                i9 = i6 + iN0;
                iM0 = M0(i9, v0Var, a1Var, false);
            }
            i7 = i8 + iM0;
            i6 = i9 + iM0;
        }
        if (a1Var.f5072k && v() != 0 && !a1Var.f5068g && x0()) {
            List list2 = v0Var.f5317d;
            int size = list2.size();
            int iF3 = o0.F(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i25 = 0; i25 < size; i25++) {
                d1 d1Var = (d1) list2.get(i25);
                if (!d1Var.j()) {
                    boolean z7 = d1Var.c() < iF3;
                    boolean z8 = this.f1010u;
                    View view = d1Var.f5103a;
                    if (z7 != z8) {
                        iC += this.f1007r.c(view);
                    } else {
                        iC2 += this.f1007r.c(view);
                    }
                }
            }
            this.f1006q.f5336k = list2;
            if (iC > 0) {
                b1(o0.F(P0()), i7);
                x xVar13 = this.f1006q;
                xVar13.f5333h = iC;
                xVar13.f5328c = 0;
                xVar13.a(null);
                F0(v0Var, this.f1006q, a1Var, false);
            }
            if (iC2 > 0) {
                a1(o0.F(O0()), i6);
                x xVar14 = this.f1006q;
                xVar14.f5333h = iC2;
                xVar14.f5328c = 0;
                list = null;
                xVar14.a(null);
                F0(v0Var, this.f1006q, a1Var, false);
            } else {
                list = null;
            }
            this.f1006q.f5336k = list;
        }
        if (a1Var.f5068g) {
            vVar.d();
        } else {
            a0 a0Var3 = this.f1007r;
            a0Var3.f5082b = a0Var3.g();
        }
        this.f1008s = this.f1011v;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void Z0(int i4, int i5, boolean z4, a1 a1Var) {
        int i6;
        boolean z5;
        int iF;
        int iD;
        int i7;
        x xVar = this.f1006q;
        a0 a0Var = this.f1007r;
        int i8 = a0Var.f5061d;
        o0 o0Var = a0Var.f5081a;
        switch (i8) {
            case 0:
                i6 = o0Var.f5239l;
                break;
            default:
                i6 = o0Var.f5240m;
                break;
        }
        if (i6 == 0) {
            switch (i8) {
                case 0:
                    i7 = o0Var.f5241n;
                    break;
                default:
                    i7 = o0Var.f5242o;
                    break;
            }
            if (i7 == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        xVar.f5337l = z5;
        xVar.f5331f = i4;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(a1Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z6 = i4 == 1;
        x xVar2 = this.f1006q;
        int i9 = z6 ? iMax2 : iMax;
        xVar2.f5333h = i9;
        if (!z6) {
            iMax = iMax2;
        }
        xVar2.f5334i = iMax;
        if (z6) {
            a0 a0Var2 = this.f1007r;
            int i10 = a0Var2.f5061d;
            o0 o0Var2 = a0Var2.f5081a;
            switch (i10) {
                case 0:
                    iD = o0Var2.D();
                    break;
                default:
                    iD = o0Var2.B();
                    break;
            }
            xVar2.f5333h = iD + i9;
            View viewO0 = O0();
            x xVar3 = this.f1006q;
            xVar3.f5330e = this.f1010u ? -1 : 1;
            int iF2 = o0.F(viewO0);
            x xVar4 = this.f1006q;
            xVar3.f5329d = iF2 + xVar4.f5330e;
            xVar4.f5327b = this.f1007r.b(viewO0);
            iF = this.f1007r.b(viewO0) - this.f1007r.e();
        } else {
            View viewP0 = P0();
            x xVar5 = this.f1006q;
            xVar5.f5333h = this.f1007r.f() + xVar5.f5333h;
            x xVar6 = this.f1006q;
            xVar6.f5330e = this.f1010u ? 1 : -1;
            int iF3 = o0.F(viewP0);
            x xVar7 = this.f1006q;
            xVar6.f5329d = iF3 + xVar7.f5330e;
            xVar7.f5327b = this.f1007r.d(viewP0);
            iF = (-this.f1007r.d(viewP0)) + this.f1007r.f();
        }
        x xVar8 = this.f1006q;
        xVar8.f5328c = i5;
        if (z4) {
            xVar8.f5328c = i5 - iF;
        }
        xVar8.f5332g = iF;
    }

    @Override // y0.z0
    public final PointF a(int i4) {
        if (v() == 0) {
            return null;
        }
        int i5 = (i4 < o0.F(u(0))) != this.f1010u ? -1 : 1;
        return this.f1005p == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    @Override // y0.o0
    public void a0(a1 a1Var) {
        this.f1015z = null;
        this.f1013x = -1;
        this.f1014y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void a1(int i4, int i5) {
        this.f1006q.f5328c = this.f1007r.e() - i5;
        x xVar = this.f1006q;
        xVar.f5330e = this.f1010u ? -1 : 1;
        xVar.f5329d = i4;
        xVar.f5331f = 1;
        xVar.f5327b = i5;
        xVar.f5332g = Integer.MIN_VALUE;
    }

    @Override // y0.o0
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof y) {
            this.f1015z = (y) parcelable;
            j0();
        }
    }

    public final void b1(int i4, int i5) {
        this.f1006q.f5328c = i5 - this.f1007r.f();
        x xVar = this.f1006q;
        xVar.f5329d = i4;
        xVar.f5330e = this.f1010u ? 1 : -1;
        xVar.f5331f = -1;
        xVar.f5327b = i5;
        xVar.f5332g = Integer.MIN_VALUE;
    }

    @Override // y0.o0
    public final void c(String str) {
        if (this.f1015z == null) {
            super.c(str);
        }
    }

    @Override // y0.o0
    public final Parcelable c0() {
        y yVar = this.f1015z;
        if (yVar != null) {
            y yVar2 = new y();
            yVar2.f5339b = yVar.f5339b;
            yVar2.f5340c = yVar.f5340c;
            yVar2.f5341d = yVar.f5341d;
            return yVar2;
        }
        y yVar3 = new y();
        if (v() > 0) {
            E0();
            boolean z4 = this.f1008s ^ this.f1010u;
            yVar3.f5341d = z4;
            if (z4) {
                View viewO0 = O0();
                yVar3.f5340c = this.f1007r.e() - this.f1007r.b(viewO0);
                yVar3.f5339b = o0.F(viewO0);
            } else {
                View viewP0 = P0();
                yVar3.f5339b = o0.F(viewP0);
                yVar3.f5340c = this.f1007r.d(viewP0) - this.f1007r.f();
            }
        } else {
            yVar3.f5339b = -1;
        }
        return yVar3;
    }

    @Override // y0.o0
    public final boolean d() {
        return this.f1005p == 0;
    }

    @Override // y0.o0
    public final boolean e() {
        return this.f1005p == 1;
    }

    @Override // y0.o0
    public final void h(int i4, int i5, a1 a1Var, q qVar) {
        if (this.f1005p != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        E0();
        Z0(i4 > 0 ? 1 : -1, Math.abs(i4), true, a1Var);
        z0(a1Var, this.f1006q, qVar);
    }

    @Override // y0.o0
    public final void i(int i4, q qVar) {
        boolean z4;
        int i5;
        y yVar = this.f1015z;
        if (yVar == null || (i5 = yVar.f5339b) < 0) {
            V0();
            z4 = this.f1010u;
            i5 = this.f1013x;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            z4 = yVar.f5341d;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.C && i5 >= 0 && i5 < i4; i7++) {
            qVar.a(i5, 0);
            i5 += i6;
        }
    }

    @Override // y0.o0
    public final int j(a1 a1Var) {
        return A0(a1Var);
    }

    @Override // y0.o0
    public int k(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // y0.o0
    public int k0(int i4, v0 v0Var, a1 a1Var) {
        if (this.f1005p == 1) {
            return 0;
        }
        return W0(i4, v0Var, a1Var);
    }

    @Override // y0.o0
    public int l(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // y0.o0
    public final void l0(int i4) {
        this.f1013x = i4;
        this.f1014y = Integer.MIN_VALUE;
        y yVar = this.f1015z;
        if (yVar != null) {
            yVar.f5339b = -1;
        }
        j0();
    }

    @Override // y0.o0
    public final int m(a1 a1Var) {
        return A0(a1Var);
    }

    @Override // y0.o0
    public int m0(int i4, v0 v0Var, a1 a1Var) {
        if (this.f1005p == 0) {
            return 0;
        }
        return W0(i4, v0Var, a1Var);
    }

    @Override // y0.o0
    public int n(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // y0.o0
    public int o(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // y0.o0
    public final View q(int i4) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iF = i4 - o0.F(u(0));
        if (iF >= 0 && iF < iV) {
            View viewU = u(iF);
            if (o0.F(viewU) == i4) {
                return viewU;
            }
        }
        return super.q(i4);
    }

    @Override // y0.o0
    public p0 r() {
        return new p0(-2, -2);
    }

    @Override // y0.o0
    public final boolean t0() {
        if (this.f5240m == 1073741824 || this.f5239l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i4 = 0; i4 < iV; i4++) {
            ViewGroup.LayoutParams layoutParams = u(i4).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.o0
    public void v0(RecyclerView recyclerView, int i4) {
        z zVar = new z(recyclerView.getContext());
        zVar.f5349a = i4;
        w0(zVar);
    }

    @Override // y0.o0
    public boolean x0() {
        return this.f1015z == null && this.f1008s == this.f1011v;
    }

    public void y0(a1 a1Var, int[] iArr) {
        int i4;
        int iG = a1Var.f5062a != -1 ? this.f1007r.g() : 0;
        if (this.f1006q.f5331f == -1) {
            i4 = 0;
        } else {
            i4 = iG;
            iG = 0;
        }
        iArr[0] = iG;
        iArr[1] = i4;
    }

    public void z0(a1 a1Var, x xVar, q qVar) {
        int i4 = xVar.f5329d;
        if (i4 < 0 || i4 >= a1Var.b()) {
            return;
        }
        qVar.a(i4, Math.max(0, xVar.f5332g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f1005p = 1;
        this.f1009t = false;
        this.f1010u = false;
        this.f1011v = false;
        this.f1012w = true;
        this.f1013x = -1;
        this.f1014y = Integer.MIN_VALUE;
        this.f1015z = null;
        this.A = new v();
        this.B = new w();
        this.C = 2;
        this.D = new int[2];
        n0 n0VarG = o0.G(context, attributeSet, i4, i5);
        X0(n0VarG.f5223a);
        boolean z4 = n0VarG.f5225c;
        c(null);
        if (z4 != this.f1009t) {
            this.f1009t = z4;
            j0();
        }
        Y0(n0VarG.f5226d);
    }
}
