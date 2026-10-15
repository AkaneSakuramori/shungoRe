package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import i.o3;
import i0.e0;
import j0.n;
import j0.o;
import java.util.Arrays;
import java.util.WeakHashMap;
import y0.a0;
import y0.a1;
import y0.o0;
import y0.p0;
import y0.q;
import y0.t;
import y0.v;
import y0.v0;
import y0.w;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final o3 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o3(1);
        this.L = new Rect();
        j1(o0.G(context, attributeSet, i4, i5).f5224b);
    }

    @Override // y0.o0
    public final int H(v0 v0Var, a1 a1Var) {
        if (this.f1005p == 0) {
            return this.F;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return f1(a1Var.b() - 1, v0Var, a1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View L0(v0 v0Var, a1 a1Var, int i4, int i5, int i6) {
        E0();
        int iF = this.f1007r.f();
        int iE = this.f1007r.e();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View viewU = u(i4);
            int iF2 = o0.F(viewU);
            if (iF2 >= 0 && iF2 < i6 && g1(iF2, v0Var, a1Var) == 0) {
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

    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r23, int r24, y0.v0 r25, y0.a1 r26) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, y0.v0, y0.a1):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:108:0x0215  */
    /* JADX WARN: Code duplicated, block: B:110:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0237  */
    /* JADX WARN: Code duplicated, block: B:112:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:133:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7 A[LOOP:1: B:49:0x00b5->B:50:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(v0 v0Var, a1 a1Var, x xVar, w wVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f5;
        int i9;
        int i10;
        int i11;
        int iL;
        int iC;
        int iL2;
        int i12;
        int i13;
        View view;
        t tVar;
        View view2;
        t tVar2;
        int i14;
        int i15;
        int iE1;
        int iW;
        int iW2;
        int i16;
        int iC2;
        View view3;
        ?? r8;
        RecyclerView recyclerView;
        Rect rect;
        int iC3;
        float fL;
        int i17;
        View viewB;
        a0 a0Var = this.f1007r;
        int i18 = a0Var.f5061d;
        o0 o0Var = a0Var.f5081a;
        switch (i18) {
            case 0:
                i4 = o0Var.f5240m;
                break;
            default:
                i4 = o0Var.f5239l;
                break;
        }
        boolean z4 = i4 != 1073741824;
        int i19 = v() > 0 ? this.G[this.F] : 0;
        if (z4) {
            k1();
        }
        boolean z5 = xVar.f5330e == 1;
        int iG1 = this.F;
        if (!z5) {
            iG1 = g1(xVar.f5329d, v0Var, a1Var) + h1(xVar.f5329d, v0Var, a1Var);
        }
        for (int i20 = 0; i20 < this.F && (i17 = xVar.f5329d) >= 0 && i17 < a1Var.b() && iG1 > 0; i20++) {
            int i21 = xVar.f5329d;
            int iH1 = h1(i21, v0Var, a1Var);
            if (iH1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i21 + " requires " + iH1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            iG1 -= iH1;
            if (iG1 < 0 || (viewB = xVar.b(v0Var)) == null) {
                if (i20 == 0) {
                    wVar.f5323b = true;
                    return;
                }
                if (z5) {
                    i7 = 1;
                    i6 = i20;
                    i5 = 0;
                } else {
                    i5 = i20 - 1;
                    i6 = -1;
                    i7 = -1;
                }
                i8 = 0;
                while (i5 != i6) {
                    View view4 = this.H[i5];
                    t tVar3 = (t) view4.getLayoutParams();
                    int iH2 = h1(o0.F(view4), v0Var, a1Var);
                    tVar3.f5293f = iH2;
                    tVar3.f5292e = i8;
                    i8 += iH2;
                    i5 += i7;
                }
                f5 = 0.0f;
                i10 = 0;
                for (i9 = 0; i9 < i20; i9++) {
                    view3 = this.H[i9];
                    if (xVar.f5336k == null) {
                        r8 = 0;
                        r8 = 0;
                        if (z5) {
                            b(view3, -1, true);
                        } else {
                            b(view3, 0, true);
                        }
                    } else if (z5) {
                        r8 = 0;
                        b(view3, -1, false);
                    } else {
                        r8 = 0;
                        b(view3, 0, false);
                    }
                    recyclerView = this.f5229b;
                    rect = this.L;
                    if (recyclerView == null) {
                        rect.set(r8, r8, r8, r8);
                    } else {
                        rect.set(recyclerView.J(view3));
                    }
                    i1(view3, i4, r8);
                    iC3 = this.f1007r.c(view3);
                    if (iC3 > i10) {
                        i10 = iC3;
                    }
                    fL = (this.f1007r.l(view3) * 1.0f) / ((t) view3.getLayoutParams()).f5293f;
                    if (fL > f5) {
                        f5 = fL;
                    }
                }
                if (z4) {
                    c1(Math.max(Math.round(f5 * this.F), i19));
                    i10 = 0;
                    for (i16 = 0; i16 < i20; i16++) {
                        View view5 = this.H[i16];
                        i1(view5, 1073741824, true);
                        iC2 = this.f1007r.c(view5);
                        if (iC2 > i10) {
                            i10 = iC2;
                        }
                    }
                }
                for (i11 = 0; i11 < i20; i11++) {
                    view2 = this.H[i11];
                    if (this.f1007r.c(view2) != i10) {
                        tVar2 = (t) view2.getLayoutParams();
                        Rect rect2 = tVar2.f5274b;
                        i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) tVar2).topMargin + ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
                        i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) tVar2).leftMargin + ((ViewGroup.MarginLayoutParams) tVar2).rightMargin;
                        iE1 = e1(tVar2.f5292e, tVar2.f5293f);
                        if (this.f1005p == 1) {
                            iW2 = o0.w(iE1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) tVar2).width, false);
                            iW = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                        } else {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                            iW = o0.w(iE1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) tVar2).height, false);
                            iW2 = iMakeMeasureSpec;
                        }
                        if (u0(view2, iW2, iW, (p0) view2.getLayoutParams())) {
                            view2.measure(iW2, iW);
                        }
                    }
                }
                wVar.f5322a = i10;
                if (this.f1005p == 1) {
                    if (xVar.f5331f == -1) {
                        int i22 = xVar.f5327b;
                        iC = i22 - i10;
                        iL = i22;
                    } else {
                        int i23 = xVar.f5327b;
                        iL = i23 + i10;
                        iC = i23;
                    }
                    iL2 = 0;
                    i12 = 0;
                } else if (xVar.f5331f == -1) {
                    int i24 = xVar.f5327b;
                    iC = 0;
                    iL = 0;
                    i12 = i24 - i10;
                    iL2 = i24;
                } else {
                    i12 = xVar.f5327b;
                    iL2 = i12 + i10;
                    iC = 0;
                    iL = 0;
                }
                for (i13 = 0; i13 < i20; i13++) {
                    view = this.H[i13];
                    tVar = (t) view.getLayoutParams();
                    if (this.f1005p == 1) {
                        int iE = E() + this.G[tVar.f5292e];
                        i12 = iE;
                        iL2 = this.f1007r.l(view) + iE;
                    } else if (Q0()) {
                        int iC4 = C() + this.G[this.F - tVar.f5292e];
                        iL = iC4;
                        iC = iC4 - this.f1007r.l(view);
                    } else {
                        iC = C() + this.G[tVar.f5292e];
                        iL = this.f1007r.l(view) + iC;
                    }
                    o0.L(view, iC, i12, iL, iL2);
                    if (tVar.f5273a.j() || tVar.f5273a.m()) {
                        wVar.f5324c = true;
                    }
                    wVar.f5325d = view.hasFocusable() | wVar.f5325d;
                }
                Arrays.fill(this.H, (Object) null);
            }
            this.H[i20] = viewB;
        }
        if (i20 == 0) {
            wVar.f5323b = true;
            return;
        }
        if (z5) {
            i7 = 1;
            i6 = i20;
            i5 = 0;
        } else {
            i5 = i20 - 1;
            i6 = -1;
            i7 = -1;
        }
        i8 = 0;
        while (i5 != i6) {
            View view6 = this.H[i5];
            t tVar4 = (t) view6.getLayoutParams();
            int iH3 = h1(o0.F(view6), v0Var, a1Var);
            tVar4.f5293f = iH3;
            tVar4.f5292e = i8;
            i8 += iH3;
            i5 += i7;
        }
        f5 = 0.0f;
        i10 = 0;
        while (i9 < i20) {
            view3 = this.H[i9];
            if (xVar.f5336k == null) {
                r8 = 0;
                r8 = 0;
                if (z5) {
                    b(view3, -1, true);
                } else {
                    b(view3, 0, true);
                }
            } else if (z5) {
                r8 = 0;
                b(view3, -1, false);
            } else {
                r8 = 0;
                b(view3, 0, false);
            }
            recyclerView = this.f5229b;
            rect = this.L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view3));
            }
            i1(view3, i4, r8);
            iC3 = this.f1007r.c(view3);
            if (iC3 > i10) {
                i10 = iC3;
            }
            fL = (this.f1007r.l(view3) * 1.0f) / ((t) view3.getLayoutParams()).f5293f;
            if (fL > f5) {
                f5 = fL;
            }
        }
        if (z4) {
            c1(Math.max(Math.round(f5 * this.F), i19));
            i10 = 0;
            while (i16 < i20) {
                View view7 = this.H[i16];
                i1(view7, 1073741824, true);
                iC2 = this.f1007r.c(view7);
                if (iC2 > i10) {
                    i10 = iC2;
                }
            }
        }
        while (i11 < i20) {
            view2 = this.H[i11];
            if (this.f1007r.c(view2) != i10) {
                tVar2 = (t) view2.getLayoutParams();
                Rect rect3 = tVar2.f5274b;
                i14 = rect3.top + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar2).topMargin + ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
                i15 = rect3.left + rect3.right + ((ViewGroup.MarginLayoutParams) tVar2).leftMargin + ((ViewGroup.MarginLayoutParams) tVar2).rightMargin;
                iE1 = e1(tVar2.f5292e, tVar2.f5293f);
                if (this.f1005p == 1) {
                    iW2 = o0.w(iE1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) tVar2).width, false);
                    iW = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iW = o0.w(iE1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) tVar2).height, false);
                    iW2 = iMakeMeasureSpec2;
                }
                if (u0(view2, iW2, iW, (p0) view2.getLayoutParams())) {
                    view2.measure(iW2, iW);
                }
            }
        }
        wVar.f5322a = i10;
        if (this.f1005p == 1) {
            if (xVar.f5331f == -1) {
                int i25 = xVar.f5327b;
                iC = i25 - i10;
                iL = i25;
            } else {
                int i26 = xVar.f5327b;
                iL = i26 + i10;
                iC = i26;
            }
            iL2 = 0;
            i12 = 0;
        } else if (xVar.f5331f == -1) {
            int i27 = xVar.f5327b;
            iC = 0;
            iL = 0;
            i12 = i27 - i10;
            iL2 = i27;
        } else {
            i12 = xVar.f5327b;
            iL2 = i12 + i10;
            iC = 0;
            iL = 0;
        }
        while (i13 < i20) {
            view = this.H[i13];
            tVar = (t) view.getLayoutParams();
            if (this.f1005p == 1) {
                int iE2 = E() + this.G[tVar.f5292e];
                i12 = iE2;
                iL2 = this.f1007r.l(view) + iE2;
            } else if (Q0()) {
                int iC5 = C() + this.G[this.F - tVar.f5292e];
                iL = iC5;
                iC = iC5 - this.f1007r.l(view);
            } else {
                iC = C() + this.G[tVar.f5292e];
                iL = this.f1007r.l(view) + iC;
            }
            o0.L(view, iC, i12, iL, iL2);
            if (tVar.f5273a.j()) {
                wVar.f5324c = true;
            } else {
                wVar.f5324c = true;
            }
            wVar.f5325d = view.hasFocusable() | wVar.f5325d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(v0 v0Var, a1 a1Var, v vVar, int i4) {
        k1();
        if (a1Var.b() > 0 && !a1Var.f5068g) {
            boolean z4 = i4 == 1;
            int iG1 = g1(vVar.f5310b, v0Var, a1Var);
            if (z4) {
                while (iG1 > 0) {
                    int i5 = vVar.f5310b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    vVar.f5310b = i6;
                    iG1 = g1(i6, v0Var, a1Var);
                }
            } else {
                int iB = a1Var.b() - 1;
                int i7 = vVar.f5310b;
                while (i7 < iB) {
                    int i8 = i7 + 1;
                    int iG2 = g1(i8, v0Var, a1Var);
                    if (iG2 <= iG1) {
                        break;
                    }
                    i7 = i8;
                    iG1 = iG2;
                }
                vVar.f5310b = i7;
            }
        }
        d1();
    }

    @Override // y0.o0
    public final void T(v0 v0Var, a1 a1Var, View view, o oVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof t)) {
            S(view, oVar);
            return;
        }
        t tVar = (t) layoutParams;
        int iF1 = f1(tVar.f5273a.c(), v0Var, a1Var);
        if (this.f1005p == 0) {
            oVar.i(n.a(tVar.f5292e, tVar.f5293f, iF1, 1, false));
        } else {
            oVar.i(n.a(iF1, 1, tVar.f5292e, tVar.f5293f, false));
        }
    }

    @Override // y0.o0
    public final void U(int i4, int i5) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f2740d).clear();
    }

    @Override // y0.o0
    public final void V() {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f2740d).clear();
    }

    @Override // y0.o0
    public final void W(int i4, int i5) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f2740d).clear();
    }

    @Override // y0.o0
    public final void X(int i4, int i5) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f2740d).clear();
    }

    @Override // y0.o0
    public final void Y(int i4, int i5) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f2740d).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Y0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final void Z(v0 v0Var, a1 a1Var) {
        boolean z4 = a1Var.f5068g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z4) {
            int iV = v();
            for (int i4 = 0; i4 < iV; i4++) {
                t tVar = (t) u(i4).getLayoutParams();
                int iC = tVar.f5273a.c();
                sparseIntArray2.put(iC, tVar.f5293f);
                sparseIntArray.put(iC, tVar.f5292e);
            }
        }
        super.Z(v0Var, a1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final void a0(a1 a1Var) {
        super.a0(a1Var);
        this.E = false;
    }

    public final void c1(int i4) {
        int i5;
        int[] iArr = this.G;
        int i6 = this.F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i4 / i6;
        int i9 = i4 % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.G = iArr;
    }

    public final void d1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int e1(int i4, int i5) {
        if (this.f1005p != 1 || !Q0()) {
            int[] iArr = this.G;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.G;
        int i6 = this.F;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    @Override // y0.o0
    public final boolean f(p0 p0Var) {
        return p0Var instanceof t;
    }

    public final int f1(int i4, v0 v0Var, a1 a1Var) {
        boolean z4 = a1Var.f5068g;
        o3 o3Var = this.K;
        if (!z4) {
            return o3Var.a(i4, this.F);
        }
        int iB = v0Var.b(i4);
        if (iB != -1) {
            return o3Var.a(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public final int g1(int i4, v0 v0Var, a1 a1Var) {
        boolean z4 = a1Var.f5068g;
        o3 o3Var = this.K;
        if (!z4) {
            return o3Var.b(i4, this.F);
        }
        int i5 = this.J.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int iB = v0Var.b(i4);
        if (iB != -1) {
            return o3Var.b(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    public final int h1(int i4, v0 v0Var, a1 a1Var) {
        boolean z4 = a1Var.f5068g;
        o3 o3Var = this.K;
        if (!z4) {
            o3Var.getClass();
            return 1;
        }
        int i5 = this.I.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        if (v0Var.b(i4) != -1) {
            o3Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    public final void i1(View view, int i4, boolean z4) {
        int iW;
        int iW2;
        t tVar = (t) view.getLayoutParams();
        Rect rect = tVar.f5274b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) tVar).topMargin + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) tVar).leftMargin + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
        int iE1 = e1(tVar.f5292e, tVar.f5293f);
        if (this.f1005p == 1) {
            iW2 = o0.w(iE1, i4, i6, ((ViewGroup.MarginLayoutParams) tVar).width, false);
            iW = o0.w(this.f1007r.g(), this.f5240m, i5, ((ViewGroup.MarginLayoutParams) tVar).height, true);
        } else {
            int iW3 = o0.w(iE1, i4, i5, ((ViewGroup.MarginLayoutParams) tVar).height, false);
            int iW4 = o0.w(this.f1007r.g(), this.f5239l, i6, ((ViewGroup.MarginLayoutParams) tVar).width, true);
            iW = iW3;
            iW2 = iW4;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (z4 ? u0(view, iW2, iW, p0Var) : s0(view, iW2, iW, p0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void j1(int i4) {
        if (i4 == this.F) {
            return;
        }
        this.E = true;
        if (i4 < 1) {
            throw new IllegalArgumentException(a.e("Span count should be at least 1. Provided ", i4));
        }
        this.F = i4;
        this.K.d();
        j0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int k(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int k0(int i4, v0 v0Var, a1 a1Var) {
        k1();
        d1();
        return super.k0(i4, v0Var, a1Var);
    }

    public final void k1() {
        int iB;
        int iE;
        if (this.f1005p == 1) {
            iB = this.f5241n - D();
            iE = C();
        } else {
            iB = this.f5242o - B();
            iE = E();
        }
        c1(iB - iE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int l(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int m0(int i4, v0 v0Var, a1 a1Var) {
        k1();
        d1();
        return super.m0(i4, v0Var, a1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int n(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final int o(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // y0.o0
    public final void p0(Rect rect, int i4, int i5) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.p0(rect, i4, i5);
        }
        int iD = D() + C();
        int iB = B() + E();
        if (this.f1005p == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f5229b;
            WeakHashMap weakHashMap = i0.v0.f2983a;
            iG2 = o0.g(i5, iHeight, e0.d(recyclerView));
            int[] iArr = this.G;
            iG = o0.g(i4, iArr[iArr.length - 1] + iD, e0.e(this.f5229b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f5229b;
            WeakHashMap weakHashMap2 = i0.v0.f2983a;
            iG = o0.g(i4, iWidth, e0.e(recyclerView2));
            int[] iArr2 = this.G;
            iG2 = o0.g(i5, iArr2[iArr2.length - 1] + iB, e0.d(this.f5229b));
        }
        this.f5229b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final p0 r() {
        return this.f1005p == 0 ? new t(-2, -1) : new t(-1, -2);
    }

    @Override // y0.o0
    public final p0 s(Context context, AttributeSet attributeSet) {
        t tVar = new t(context, attributeSet);
        tVar.f5292e = -1;
        tVar.f5293f = 0;
        return tVar;
    }

    @Override // y0.o0
    public final p0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            t tVar = new t((ViewGroup.MarginLayoutParams) layoutParams);
            tVar.f5292e = -1;
            tVar.f5293f = 0;
            return tVar;
        }
        t tVar2 = new t(layoutParams);
        tVar2.f5292e = -1;
        tVar2.f5293f = 0;
        return tVar2;
    }

    @Override // y0.o0
    public final int x(v0 v0Var, a1 a1Var) {
        if (this.f1005p == 1) {
            return this.F;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return f1(a1Var.b() - 1, v0Var, a1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final boolean x0() {
        return this.f1015z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(a1 a1Var, x xVar, q qVar) {
        int i4;
        int i5 = this.F;
        for (int i6 = 0; i6 < this.F && (i4 = xVar.f5329d) >= 0 && i4 < a1Var.b() && i5 > 0; i6++) {
            qVar.a(xVar.f5329d, Math.max(0, xVar.f5332g));
            this.K.getClass();
            i5--;
            xVar.f5329d += xVar.f5330e;
        }
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o3(1);
        this.L = new Rect();
        j1(i4);
    }
}
