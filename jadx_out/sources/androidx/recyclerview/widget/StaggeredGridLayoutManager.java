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
import i0.e0;
import j0.n;
import j0.o;
import j1.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import y0.a0;
import y0.a1;
import y0.h1;
import y0.i1;
import y0.k1;
import y0.l;
import y0.l1;
import y0.n0;
import y0.o0;
import y0.p0;
import y0.q;
import y0.u;
import y0.v0;
import y0.z;
import y0.z0;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends o0 implements z0 {
    public final b0 B;
    public final int C;
    public boolean D;
    public boolean E;
    public k1 F;
    public final Rect G;
    public final h1 H;
    public final boolean I;
    public int[] J;
    public final l K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1[] f1064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0.b0 f1065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0.b0 f1066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f1069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1070w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f1072y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1071x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1073z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f1063p = -1;
        this.f1070w = false;
        b0 b0Var = new b0(1);
        this.B = b0Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new h1(this);
        this.I = true;
        this.K = new l(1, this);
        n0 n0VarG = o0.G(context, attributeSet, i4, i5);
        int i6 = n0VarG.f5223a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i6 != this.f1067t) {
            this.f1067t = i6;
            y0.b0 b0Var2 = this.f1065r;
            this.f1065r = this.f1066s;
            this.f1066s = b0Var2;
            j0();
        }
        int i7 = n0VarG.f5224b;
        c(null);
        if (i7 != this.f1063p) {
            b0Var.f();
            j0();
            this.f1063p = i7;
            this.f1072y = new BitSet(this.f1063p);
            this.f1064q = new l1[this.f1063p];
            for (int i8 = 0; i8 < this.f1063p; i8++) {
                this.f1064q[i8] = new l1(this, i8);
            }
            j0();
        }
        boolean z4 = n0VarG.f5225c;
        c(null);
        k1 k1Var = this.F;
        if (k1Var != null && k1Var.f5197i != z4) {
            k1Var.f5197i = z4;
        }
        this.f1070w = z4;
        j0();
        u uVar = new u();
        uVar.f5298a = true;
        uVar.f5303f = 0;
        uVar.f5304g = 0;
        this.f1069v = uVar;
        this.f1065r = y0.b0.a(this, this.f1067t);
        this.f1066s = y0.b0.a(this, 1 - this.f1067t);
    }

    public static int b1(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    public final int A0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        y0.b0 b0Var = this.f1065r;
        boolean z4 = this.I;
        return h.p0(a1Var, b0Var, F0(!z4), E0(!z4), this, this.I);
    }

    public final int B0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        y0.b0 b0Var = this.f1065r;
        boolean z4 = this.I;
        return h.q0(a1Var, b0Var, F0(!z4), E0(!z4), this, this.I, this.f1071x);
    }

    public final int C0(a1 a1Var) {
        if (v() == 0) {
            return 0;
        }
        y0.b0 b0Var = this.f1065r;
        boolean z4 = this.I;
        return h.r0(a1Var, b0Var, F0(!z4), E0(!z4), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int D0(v0 v0Var, u uVar, a1 a1Var) {
        l1 l1Var;
        ?? r6;
        int i4;
        int iH;
        int iC;
        int iF;
        int iC2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        this.f1072y.set(0, this.f1063p, true);
        u uVar2 = this.f1069v;
        int i11 = uVar2.f5306i ? uVar.f5302e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : uVar.f5302e == 1 ? uVar.f5304g + uVar.f5299b : uVar.f5303f - uVar.f5299b;
        int i12 = uVar.f5302e;
        for (int i13 = 0; i13 < this.f1063p; i13++) {
            if (!this.f1064q[i13].f5208a.isEmpty()) {
                a1(this.f1064q[i13], i12, i11);
            }
        }
        int iE = this.f1071x ? this.f1065r.e() : this.f1065r.f();
        boolean z4 = false;
        while (true) {
            int i14 = uVar.f5300c;
            if (((i14 < 0 || i14 >= a1Var.b()) ? i9 : i10) == 0 || (!uVar2.f5306i && this.f1072y.isEmpty())) {
                break;
            }
            View viewD = v0Var.d(uVar.f5300c);
            uVar.f5300c += uVar.f5301d;
            i1 i1Var = (i1) viewD.getLayoutParams();
            int iC3 = i1Var.f5273a.c();
            b0 b0Var = this.B;
            int[] iArr = (int[]) b0Var.f3155c;
            int i15 = (iArr == null || iC3 >= iArr.length) ? -1 : iArr[iC3];
            if (i15 == -1) {
                if (R0(uVar.f5302e)) {
                    i8 = this.f1063p - i10;
                    i7 = -1;
                    i6 = -1;
                } else {
                    i6 = i10;
                    i7 = this.f1063p;
                    i8 = i9;
                }
                l1 l1Var2 = null;
                if (uVar.f5302e == i10) {
                    int iF2 = this.f1065r.f();
                    int i16 = Integer.MAX_VALUE;
                    while (i8 != i7) {
                        l1 l1Var3 = this.f1064q[i8];
                        int iF3 = l1Var3.f(iF2);
                        if (iF3 < i16) {
                            i16 = iF3;
                            l1Var2 = l1Var3;
                        }
                        i8 += i6;
                    }
                } else {
                    int iE2 = this.f1065r.e();
                    int i17 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        l1 l1Var4 = this.f1064q[i8];
                        int iH2 = l1Var4.h(iE2);
                        if (iH2 > i17) {
                            l1Var2 = l1Var4;
                            i17 = iH2;
                        }
                        i8 += i6;
                    }
                }
                l1Var = l1Var2;
                b0Var.g(iC3);
                ((int[]) b0Var.f3155c)[iC3] = l1Var.f5212e;
            } else {
                l1Var = this.f1064q[i15];
            }
            i1Var.f5163e = l1Var;
            if (uVar.f5302e == 1) {
                r6 = 0;
                b(viewD, -1, false);
            } else {
                r6 = 0;
                b(viewD, 0, false);
            }
            if (this.f1067t == 1) {
                i4 = 1;
                P0(viewD, o0.w(this.f1068u, this.f5239l, r6, ((ViewGroup.MarginLayoutParams) i1Var).width, r6), o0.w(this.f5242o, this.f5240m, B() + E(), ((ViewGroup.MarginLayoutParams) i1Var).height, true));
            } else {
                i4 = 1;
                P0(viewD, o0.w(this.f5241n, this.f5239l, D() + C(), ((ViewGroup.MarginLayoutParams) i1Var).width, true), o0.w(this.f1068u, this.f5240m, 0, ((ViewGroup.MarginLayoutParams) i1Var).height, false));
            }
            if (uVar.f5302e == i4) {
                iC = l1Var.f(iE);
                iH = this.f1065r.c(viewD) + iC;
            } else {
                iH = l1Var.h(iE);
                iC = iH - this.f1065r.c(viewD);
            }
            if (uVar.f5302e == 1) {
                l1 l1Var5 = i1Var.f5163e;
                l1Var5.getClass();
                i1 i1Var2 = (i1) viewD.getLayoutParams();
                i1Var2.f5163e = l1Var5;
                ArrayList arrayList = l1Var5.f5208a;
                arrayList.add(viewD);
                l1Var5.f5210c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    l1Var5.f5209b = Integer.MIN_VALUE;
                }
                if (i1Var2.f5273a.j() || i1Var2.f5273a.m()) {
                    l1Var5.f5211d = l1Var5.f5213f.f1065r.c(viewD) + l1Var5.f5211d;
                }
            } else {
                l1 l1Var6 = i1Var.f5163e;
                l1Var6.getClass();
                i1 i1Var3 = (i1) viewD.getLayoutParams();
                i1Var3.f5163e = l1Var6;
                ArrayList arrayList2 = l1Var6.f5208a;
                arrayList2.add(0, viewD);
                l1Var6.f5209b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    l1Var6.f5210c = Integer.MIN_VALUE;
                }
                if (i1Var3.f5273a.j() || i1Var3.f5273a.m()) {
                    l1Var6.f5211d = l1Var6.f5213f.f1065r.c(viewD) + l1Var6.f5211d;
                }
            }
            if (O0() && this.f1067t == 1) {
                iC2 = this.f1066s.e() - (((this.f1063p - 1) - l1Var.f5212e) * this.f1068u);
                iF = iC2 - this.f1066s.c(viewD);
            } else {
                iF = this.f1066s.f() + (l1Var.f5212e * this.f1068u);
                iC2 = this.f1066s.c(viewD) + iF;
            }
            if (this.f1067t == 1) {
                o0.L(viewD, iF, iC, iC2, iH);
            } else {
                o0.L(viewD, iC, iF, iH, iC2);
            }
            a1(l1Var, uVar2.f5302e, i11);
            T0(v0Var, uVar2);
            if (uVar2.f5305h && viewD.hasFocusable()) {
                i5 = 0;
                this.f1072y.set(l1Var.f5212e, false);
            } else {
                i5 = 0;
            }
            i9 = i5;
            i10 = 1;
            z4 = true;
        }
        int i18 = i9;
        if (!z4) {
            T0(v0Var, uVar2);
        }
        int iF4 = uVar2.f5302e == -1 ? this.f1065r.f() - L0(this.f1065r.f()) : K0(this.f1065r.e()) - this.f1065r.e();
        return iF4 > 0 ? Math.min(uVar.f5299b, iF4) : i18;
    }

    public final View E0(boolean z4) {
        int iF = this.f1065r.f();
        int iE = this.f1065r.e();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iD = this.f1065r.d(viewU);
            int iB = this.f1065r.b(viewU);
            if (iB > iF && iD < iE) {
                if (iB <= iE || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z4) {
        int iF = this.f1065r.f();
        int iE = this.f1065r.e();
        int iV = v();
        View view = null;
        for (int i4 = 0; i4 < iV; i4++) {
            View viewU = u(i4);
            int iD = this.f1065r.d(viewU);
            if (this.f1065r.b(viewU) > iF && iD < iE) {
                if (iD >= iF || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(v0 v0Var, a1 a1Var, boolean z4) {
        int iE;
        int iK0 = K0(Integer.MIN_VALUE);
        if (iK0 != Integer.MIN_VALUE && (iE = this.f1065r.e() - iK0) > 0) {
            int i4 = iE - (-X0(-iE, v0Var, a1Var));
            if (!z4 || i4 <= 0) {
                return;
            }
            this.f1065r.k(i4);
        }
    }

    @Override // y0.o0
    public final int H(v0 v0Var, a1 a1Var) {
        return this.f1067t == 0 ? this.f1063p : super.H(v0Var, a1Var);
    }

    public final void H0(v0 v0Var, a1 a1Var, boolean z4) {
        int iF;
        int iL0 = L0(Integer.MAX_VALUE);
        if (iL0 != Integer.MAX_VALUE && (iF = iL0 - this.f1065r.f()) > 0) {
            int iX0 = iF - X0(iF, v0Var, a1Var);
            if (!z4 || iX0 <= 0) {
                return;
            }
            this.f1065r.k(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return o0.F(u(0));
    }

    @Override // y0.o0
    public final boolean J() {
        return this.C != 0;
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return o0.F(u(iV - 1));
    }

    public final int K0(int i4) {
        int iF = this.f1064q[0].f(i4);
        for (int i5 = 1; i5 < this.f1063p; i5++) {
            int iF2 = this.f1064q[i5].f(i4);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int L0(int i4) {
        int iH = this.f1064q[0].h(i4);
        for (int i5 = 1; i5 < this.f1063p; i5++) {
            int iH2 = this.f1064q[i5].h(i4);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // y0.o0
    public final void M(int i4) {
        super.M(i4);
        for (int i5 = 0; i5 < this.f1063p; i5++) {
            l1 l1Var = this.f1064q[i5];
            int i6 = l1Var.f5209b;
            if (i6 != Integer.MIN_VALUE) {
                l1Var.f5209b = i6 + i4;
            }
            int i7 = l1Var.f5210c;
            if (i7 != Integer.MIN_VALUE) {
                l1Var.f5210c = i7 + i4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void M0(int i4, int i5, int i6) {
        int i7;
        int i8;
        b0 b0Var;
        int iJ0;
        int iJ1 = this.f1071x ? J0() : I0();
        if (i6 == 8) {
            if (i4 < i5) {
                i7 = i5 + 1;
            } else {
                i7 = i4 + 1;
                i8 = i5;
            }
            b0Var = this.B;
            b0Var.i(i8);
            if (i6 != 1) {
                b0Var.k(i4, i5);
            } else if (i6 != 2) {
                b0Var.l(i4, i5);
            } else if (i6 == 8) {
                b0Var.l(i4, 1);
                b0Var.k(i5, 1);
            }
            if (i7 <= iJ1) {
                return;
            }
            if (this.f1071x) {
                iJ0 = I0();
            } else {
                iJ0 = J0();
            }
            if (i8 <= iJ0) {
                j0();
            }
        }
        i7 = i4 + i5;
        i8 = i4;
        b0Var = this.B;
        b0Var.i(i8);
        if (i6 != 1) {
            b0Var.k(i4, i5);
        } else if (i6 != 2) {
            b0Var.l(i4, i5);
        } else if (i6 == 8) {
            b0Var.l(i4, 1);
            b0Var.k(i5, 1);
        }
        if (i7 <= iJ1) {
            return;
        }
        if (this.f1071x) {
            iJ0 = I0();
        } else {
            iJ0 = J0();
        }
        if (i8 <= iJ0) {
            j0();
        }
    }

    @Override // y0.o0
    public final void N(int i4) {
        super.N(i4);
        for (int i5 = 0; i5 < this.f1063p; i5++) {
            l1 l1Var = this.f1064q[i5];
            int i6 = l1Var.f5209b;
            if (i6 != Integer.MIN_VALUE) {
                l1Var.f5209b = i6 + i4;
            }
            int i7 = l1Var.f5210c;
            if (i7 != Integer.MIN_VALUE) {
                l1Var.f5210c = i7 + i4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002c A[SYNTHETIC] */
    public final View N0() {
        boolean z4;
        boolean z5;
        int iV = v();
        int i4 = iV - 1;
        BitSet bitSet = new BitSet(this.f1063p);
        bitSet.set(0, this.f1063p, true);
        byte b5 = (this.f1067t == 1 && O0()) ? (byte) 1 : (byte) -1;
        if (this.f1071x) {
            iV = -1;
        } else {
            i4 = 0;
        }
        int i5 = i4 < iV ? 1 : -1;
        while (i4 != iV) {
            View viewU = u(i4);
            i1 i1Var = (i1) viewU.getLayoutParams();
            if (bitSet.get(i1Var.f5163e.f5212e)) {
                l1 l1Var = i1Var.f5163e;
                if (this.f1071x) {
                    int i6 = l1Var.f5210c;
                    if (i6 == Integer.MIN_VALUE) {
                        l1Var.a();
                        i6 = l1Var.f5210c;
                    }
                    if (i6 < this.f1065r.e()) {
                        ArrayList arrayList = l1Var.f5208a;
                        ((i1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                    bitSet.clear(i1Var.f5163e.f5212e);
                } else {
                    int i7 = l1Var.f5209b;
                    if (i7 == Integer.MIN_VALUE) {
                        View view = (View) l1Var.f5208a.get(0);
                        i1 i1Var2 = (i1) view.getLayoutParams();
                        l1Var.f5209b = l1Var.f5213f.f1065r.d(view);
                        i1Var2.getClass();
                        i7 = l1Var.f5209b;
                    }
                    if (i7 > this.f1065r.f()) {
                        ((i1) ((View) l1Var.f5208a.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                    bitSet.clear(i1Var.f5163e.f5212e);
                }
            }
            i4 += i5;
            if (i4 != iV) {
                View viewU2 = u(i4);
                if (this.f1071x) {
                    int iB = this.f1065r.b(viewU);
                    int iB2 = this.f1065r.b(viewU2);
                    if (iB < iB2) {
                        return viewU;
                    }
                    if (iB == iB2) {
                        if (i1Var.f5163e.f5212e - ((i1) viewU2.getLayoutParams()).f5163e.f5212e < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (b5 < 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z4 != z5) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iD = this.f1065r.d(viewU);
                    int iD2 = this.f1065r.d(viewU2);
                    if (iD > iD2) {
                        return viewU;
                    }
                    if (iD == iD2) {
                        if (i1Var.f5163e.f5212e - ((i1) viewU2.getLayoutParams()).f5163e.f5212e < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (b5 < 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z4 != z5) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final boolean O0() {
        return A() == 1;
    }

    @Override // y0.o0
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5229b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i4 = 0; i4 < this.f1063p; i4++) {
            this.f1064q[i4].b();
        }
        recyclerView.requestLayout();
    }

    public final void P0(View view, int i4, int i5) {
        RecyclerView recyclerView = this.f5229b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        i1 i1Var = (i1) view.getLayoutParams();
        int iB1 = b1(i4, ((ViewGroup.MarginLayoutParams) i1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) i1Var).rightMargin + rect.right);
        int iB2 = b1(i5, ((ViewGroup.MarginLayoutParams) i1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) i1Var).bottomMargin + rect.bottom);
        if (s0(view, iB1, iB2, i1Var)) {
            view.measure(iB1, iB2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0057  */
    /* JADX WARN: Code duplicated, block: B:46:0x005f  */
    @Override // y0.o0
    public final View Q(View view, int i4, v0 v0Var, a1 a1Var) {
        View viewA;
        int i5;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView == null || (viewA = recyclerView.A(view)) == null || this.f5228a.j(viewA)) {
            viewA = null;
        }
        if (viewA == null) {
            return null;
        }
        W0();
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 == 66 ? this.f1067t == 0 : !(i4 != 130 || this.f1067t != 1)) {
                            i5 = 1;
                        }
                    } else if (this.f1067t == 1) {
                        i5 = -1;
                    }
                    i5 = Integer.MIN_VALUE;
                } else if (this.f1067t == 0) {
                    i5 = -1;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
            } else if (this.f1067t != 1 && O0()) {
                i5 = -1;
            } else {
                i5 = 1;
            }
        } else if (this.f1067t != 1 && O0()) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        i1 i1Var = (i1) viewA.getLayoutParams();
        i1Var.getClass();
        l1 l1Var = i1Var.f5163e;
        int iJ0 = i5 == 1 ? J0() : I0();
        Z0(iJ0, a1Var);
        Y0(i5);
        u uVar = this.f1069v;
        uVar.f5300c = uVar.f5301d + iJ0;
        uVar.f5299b = (int) (this.f1065r.g() * 0.33333334f);
        uVar.f5305h = true;
        uVar.f5298a = false;
        D0(v0Var, uVar, a1Var);
        this.D = this.f1071x;
        View viewG = l1Var.g(iJ0, i5);
        if (viewG != null && viewG != viewA) {
            return viewG;
        }
        if (R0(i5)) {
            for (int i6 = this.f1063p - 1; i6 >= 0; i6--) {
                View viewG2 = this.f1064q[i6].g(iJ0, i5);
                if (viewG2 != null && viewG2 != viewA) {
                    return viewG2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f1063p; i7++) {
                View viewG3 = this.f1064q[i7].g(iJ0, i5);
                if (viewG3 != null && viewG3 != viewA) {
                    return viewG3;
                }
            }
        }
        boolean z4 = (this.f1070w ^ true) == (i5 == -1);
        View viewQ = q(z4 ? l1Var.c() : l1Var.d());
        if (viewQ != null && viewQ != viewA) {
            return viewQ;
        }
        if (R0(i5)) {
            for (int i8 = this.f1063p - 1; i8 >= 0; i8--) {
                if (i8 != l1Var.f5212e) {
                    View viewQ2 = q(z4 ? this.f1064q[i8].c() : this.f1064q[i8].d());
                    if (viewQ2 != null && viewQ2 != viewA) {
                        return viewQ2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f1063p; i9++) {
                View viewQ3 = q(z4 ? this.f1064q[i9].c() : this.f1064q[i9].d());
                if (viewQ3 != null && viewQ3 != viewA) {
                    return viewQ3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:261:0x042c  */
    /* JADX WARN: Code duplicated, block: B:272:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01ea A[SYNTHETIC] */
    public final void Q0(v0 v0Var, a1 a1Var, boolean z4) {
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        k1 k1Var;
        int iV;
        int i8;
        int iF;
        int iF2;
        int iV2;
        int i9;
        k1 k1Var2 = this.F;
        h1 h1Var = this.H;
        if (!(k1Var2 == null && this.f1073z == -1) && a1Var.b() == 0) {
            e0(v0Var);
            h1Var.a();
            return;
        }
        boolean z6 = (h1Var.f5154e && this.f1073z == -1 && this.F == null) ? false : true;
        b0 b0Var = this.B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = h1Var.f5156g;
        if (z6) {
            h1Var.a();
            k1 k1Var3 = this.F;
            if (k1Var3 != null) {
                int i10 = k1Var3.f5192d;
                if (i10 > 0) {
                    if (i10 == this.f1063p) {
                        for (int i11 = 0; i11 < this.f1063p; i11++) {
                            this.f1064q[i11].b();
                            k1 k1Var4 = this.F;
                            int iE = k1Var4.f5193e[i11];
                            if (iE != Integer.MIN_VALUE) {
                                iE += k1Var4.f5198j ? this.f1065r.e() : this.f1065r.f();
                            }
                            l1 l1Var = this.f1064q[i11];
                            l1Var.f5209b = iE;
                            l1Var.f5210c = iE;
                        }
                    } else {
                        k1Var3.f5193e = null;
                        k1Var3.f5192d = 0;
                        k1Var3.f5194f = 0;
                        k1Var3.f5195g = null;
                        k1Var3.f5196h = null;
                        k1Var3.f5190b = k1Var3.f5191c;
                    }
                }
                k1 k1Var5 = this.F;
                this.E = k1Var5.f5199k;
                boolean z7 = k1Var5.f5197i;
                c(null);
                k1 k1Var6 = this.F;
                if (k1Var6 != null && k1Var6.f5197i != z7) {
                    k1Var6.f5197i = z7;
                }
                this.f1070w = z7;
                j0();
                W0();
                k1 k1Var7 = this.F;
                int i12 = k1Var7.f5190b;
                if (i12 != -1) {
                    this.f1073z = i12;
                    h1Var.f5152c = k1Var7.f5198j;
                } else {
                    h1Var.f5152c = this.f1071x;
                }
                if (k1Var7.f5194f > 1) {
                    b0Var.f3155c = k1Var7.f5195g;
                    b0Var.f3156d = k1Var7.f5196h;
                }
            } else {
                W0();
                h1Var.f5152c = this.f1071x;
            }
            if (a1Var.f5068g || (i9 = this.f1073z) == -1) {
                if (this.D) {
                    int iB = a1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        }
                        iF2 = o0.F(u(iV2));
                        if (iF2 < 0 && iF2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = a1Var.b();
                    iV = v();
                    i8 = 0;
                    while (true) {
                        if (i8 >= iV) {
                            iF2 = 0;
                            break;
                        }
                        iF = o0.F(u(i8));
                        if (iF < 0 && iF < iB2) {
                            iF2 = iF;
                            break;
                        }
                        i8++;
                    }
                }
                h1Var.f5150a = iF2;
                h1Var.f5151b = Integer.MIN_VALUE;
            } else if (i9 < 0 || i9 >= a1Var.b()) {
                this.f1073z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = a1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iF2 = 0;
                            break;
                        } else {
                            iF2 = o0.F(u(iV2));
                            if (iF2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = a1Var.b();
                    iV = v();
                    i8 = 0;
                    while (true) {
                        if (i8 >= iV) {
                            iF2 = 0;
                            break;
                        } else {
                            iF = o0.F(u(i8));
                            if (iF < 0) {
                            }
                            i8++;
                        }
                    }
                }
                h1Var.f5150a = iF2;
                h1Var.f5151b = Integer.MIN_VALUE;
            } else {
                k1 k1Var8 = this.F;
                if (k1Var8 == null || k1Var8.f5190b == -1 || k1Var8.f5192d < 1) {
                    View viewQ = q(this.f1073z);
                    if (viewQ != null) {
                        h1Var.f5150a = this.f1071x ? J0() : I0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (h1Var.f5152c) {
                                h1Var.f5151b = (this.f1065r.e() - this.A) - this.f1065r.b(viewQ);
                            } else {
                                h1Var.f5151b = (this.f1065r.f() + this.A) - this.f1065r.d(viewQ);
                            }
                        } else if (this.f1065r.c(viewQ) > this.f1065r.g()) {
                            h1Var.f5151b = h1Var.f5152c ? this.f1065r.e() : this.f1065r.f();
                        } else {
                            int iD = this.f1065r.d(viewQ) - this.f1065r.f();
                            if (iD < 0) {
                                h1Var.f5151b = -iD;
                            } else {
                                int iE2 = this.f1065r.e() - this.f1065r.b(viewQ);
                                if (iE2 < 0) {
                                    h1Var.f5151b = iE2;
                                } else {
                                    h1Var.f5151b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i13 = this.f1073z;
                        h1Var.f5150a = i13;
                        int i14 = this.A;
                        if (i14 == Integer.MIN_VALUE) {
                            boolean z8 = y0(i13) == 1;
                            h1Var.f5152c = z8;
                            h1Var.f5151b = z8 ? staggeredGridLayoutManager.f1065r.e() : staggeredGridLayoutManager.f1065r.f();
                        } else if (h1Var.f5152c) {
                            h1Var.f5151b = staggeredGridLayoutManager.f1065r.e() - i14;
                        } else {
                            h1Var.f5151b = staggeredGridLayoutManager.f1065r.f() + i14;
                        }
                        h1Var.f5153d = true;
                    }
                } else {
                    h1Var.f5151b = Integer.MIN_VALUE;
                    h1Var.f5150a = this.f1073z;
                }
            }
            h1Var.f5154e = true;
        }
        if (this.F == null && this.f1073z == -1 && (h1Var.f5152c != this.D || O0() != this.E)) {
            b0Var.f();
            h1Var.f5153d = true;
        }
        if (v() > 0 && ((k1Var = this.F) == null || k1Var.f5192d < 1)) {
            if (h1Var.f5153d) {
                for (int i15 = 0; i15 < this.f1063p; i15++) {
                    this.f1064q[i15].b();
                    int i16 = h1Var.f5151b;
                    if (i16 != Integer.MIN_VALUE) {
                        l1 l1Var2 = this.f1064q[i15];
                        l1Var2.f5209b = i16;
                        l1Var2.f5210c = i16;
                    }
                }
            } else if (z6 || h1Var.f5155f == null) {
                for (int i17 = 0; i17 < this.f1063p; i17++) {
                    l1 l1Var3 = this.f1064q[i17];
                    boolean z9 = this.f1071x;
                    int i18 = h1Var.f5151b;
                    int iF3 = z9 ? l1Var3.f(Integer.MIN_VALUE) : l1Var3.h(Integer.MIN_VALUE);
                    l1Var3.b();
                    if (iF3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = l1Var3.f5213f;
                        if ((!z9 || iF3 >= staggeredGridLayoutManager2.f1065r.e()) && (z9 || iF3 <= staggeredGridLayoutManager2.f1065r.f())) {
                            if (i18 != Integer.MIN_VALUE) {
                                iF3 += i18;
                            }
                            l1Var3.f5210c = iF3;
                            l1Var3.f5209b = iF3;
                        }
                    }
                }
                l1[] l1VarArr = this.f1064q;
                int length = l1VarArr.length;
                int[] iArr = h1Var.f5155f;
                if (iArr == null || iArr.length < length) {
                    h1Var.f5155f = new int[staggeredGridLayoutManager.f1064q.length];
                }
                for (int i19 = 0; i19 < length; i19++) {
                    h1Var.f5155f[i19] = l1VarArr[i19].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i20 = 0; i20 < this.f1063p; i20++) {
                    l1 l1Var4 = this.f1064q[i20];
                    l1Var4.b();
                    int i21 = h1Var.f5155f[i20];
                    l1Var4.f5209b = i21;
                    l1Var4.f5210c = i21;
                }
            }
        }
        p(v0Var);
        u uVar = this.f1069v;
        uVar.f5298a = false;
        int iG = this.f1066s.g();
        this.f1068u = iG / this.f1063p;
        a0 a0Var = (a0) this.f1066s;
        int i22 = a0Var.f5061d;
        o0 o0Var = a0Var.f5081a;
        switch (i22) {
            case 0:
                i4 = o0Var.f5239l;
                break;
            default:
                i4 = o0Var.f5240m;
                break;
        }
        View.MeasureSpec.makeMeasureSpec(iG, i4);
        Z0(h1Var.f5150a, a1Var);
        if (h1Var.f5152c) {
            Y0(-1);
            D0(v0Var, uVar, a1Var);
            Y0(1);
            uVar.f5300c = h1Var.f5150a + uVar.f5301d;
            D0(v0Var, uVar, a1Var);
        } else {
            Y0(1);
            D0(v0Var, uVar, a1Var);
            Y0(-1);
            uVar.f5300c = h1Var.f5150a + uVar.f5301d;
            D0(v0Var, uVar, a1Var);
        }
        a0 a0Var2 = (a0) this.f1066s;
        int i23 = a0Var2.f5061d;
        o0 o0Var2 = a0Var2.f5081a;
        switch (i23) {
            case 0:
                i5 = o0Var2.f5239l;
                break;
            default:
                i5 = o0Var2.f5240m;
                break;
        }
        if (i5 != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < iV3; i24++) {
                View viewU = u(i24);
                float fC = this.f1066s.c(viewU);
                if (fC >= fMax) {
                    ((i1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f1068u;
            int iRound = Math.round(fMax * this.f1063p);
            y0.b0 b0Var2 = this.f1066s;
            a0 a0Var3 = (a0) b0Var2;
            int i26 = a0Var3.f5061d;
            o0 o0Var3 = a0Var3.f5081a;
            switch (i26) {
                case 0:
                    i6 = o0Var3.f5239l;
                    break;
                default:
                    i6 = o0Var3.f5240m;
                    break;
            }
            if (i6 == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, b0Var2.g());
            }
            this.f1068u = iRound / this.f1063p;
            a0 a0Var4 = (a0) this.f1066s;
            int i27 = a0Var4.f5061d;
            o0 o0Var4 = a0Var4.f5081a;
            switch (i27) {
                case 0:
                    i7 = o0Var4.f5239l;
                    break;
                default:
                    i7 = o0Var4.f5240m;
                    break;
            }
            View.MeasureSpec.makeMeasureSpec(iRound, i7);
            if (this.f1068u != i25) {
                for (int i28 = 0; i28 < iV3; i28++) {
                    View viewU2 = u(i28);
                    i1 i1Var = (i1) viewU2.getLayoutParams();
                    i1Var.getClass();
                    if (O0() && this.f1067t == 1) {
                        int i29 = -((this.f1063p - 1) - i1Var.f5163e.f5212e);
                        viewU2.offsetLeftAndRight((this.f1068u * i29) - (i29 * i25));
                    } else {
                        int i30 = i1Var.f5163e.f5212e;
                        int i31 = this.f1068u * i30;
                        int i32 = i30 * i25;
                        if (this.f1067t == 1) {
                            viewU2.offsetLeftAndRight(i31 - i32);
                        } else {
                            viewU2.offsetTopAndBottom(i31 - i32);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1071x) {
                G0(v0Var, a1Var, true);
                H0(v0Var, a1Var, false);
            } else {
                H0(v0Var, a1Var, true);
                G0(v0Var, a1Var, false);
            }
        }
        if (z4 && !a1Var.f5068g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.f5229b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z5 = z0();
        }
        if (a1Var.f5068g) {
            h1Var.a();
        }
        this.D = h1Var.f5152c;
        this.E = O0();
        if (z5) {
            h1Var.a();
            Q0(v0Var, a1Var, false);
        }
    }

    @Override // y0.o0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iF = o0.F(viewF0);
            int iF2 = o0.F(viewE0);
            if (iF < iF2) {
                accessibilityEvent.setFromIndex(iF);
                accessibilityEvent.setToIndex(iF2);
            } else {
                accessibilityEvent.setFromIndex(iF2);
                accessibilityEvent.setToIndex(iF);
            }
        }
    }

    public final boolean R0(int i4) {
        if (this.f1067t == 0) {
            return (i4 == -1) != this.f1071x;
        }
        return ((i4 == -1) == this.f1071x) == O0();
    }

    public final void S0(int i4, a1 a1Var) {
        int iI0;
        int i5;
        if (i4 > 0) {
            iI0 = J0();
            i5 = 1;
        } else {
            iI0 = I0();
            i5 = -1;
        }
        u uVar = this.f1069v;
        uVar.f5298a = true;
        Z0(iI0, a1Var);
        Y0(i5);
        uVar.f5300c = iI0 + uVar.f5301d;
        uVar.f5299b = Math.abs(i4);
    }

    @Override // y0.o0
    public final void T(v0 v0Var, a1 a1Var, View view, o oVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof i1)) {
            S(view, oVar);
            return;
        }
        i1 i1Var = (i1) layoutParams;
        if (this.f1067t == 0) {
            l1 l1Var = i1Var.f5163e;
            oVar.i(n.a(l1Var == null ? -1 : l1Var.f5212e, 1, -1, -1, false));
        } else {
            l1 l1Var2 = i1Var.f5163e;
            oVar.i(n.a(-1, -1, l1Var2 == null ? -1 : l1Var2.f5212e, 1, false));
        }
    }

    public final void T0(v0 v0Var, u uVar) {
        int iMin;
        if (!uVar.f5298a || uVar.f5306i) {
            return;
        }
        if (uVar.f5299b == 0) {
            if (uVar.f5302e == -1) {
                U0(uVar.f5304g, v0Var);
                return;
            } else {
                V0(uVar.f5303f, v0Var);
                return;
            }
        }
        int i4 = 1;
        if (uVar.f5302e == -1) {
            int i5 = uVar.f5303f;
            int iH = this.f1064q[0].h(i5);
            while (i4 < this.f1063p) {
                int iH2 = this.f1064q[i4].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i4++;
            }
            int i6 = i5 - iH;
            U0(i6 < 0 ? uVar.f5304g : uVar.f5304g - Math.min(i6, uVar.f5299b), v0Var);
            return;
        }
        int i7 = uVar.f5304g;
        int iF = this.f1064q[0].f(i7);
        while (i4 < this.f1063p) {
            int iF2 = this.f1064q[i4].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i4++;
        }
        int i8 = iF - uVar.f5304g;
        if (i8 < 0) {
            iMin = uVar.f5303f;
        } else {
            iMin = Math.min(i8, uVar.f5299b) + uVar.f5303f;
        }
        V0(iMin, v0Var);
    }

    @Override // y0.o0
    public final void U(int i4, int i5) {
        M0(i4, i5, 1);
    }

    public final void U0(int i4, v0 v0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1065r.d(viewU) < i4 || this.f1065r.j(viewU) < i4) {
                return;
            }
            i1 i1Var = (i1) viewU.getLayoutParams();
            i1Var.getClass();
            if (i1Var.f5163e.f5208a.size() == 1) {
                return;
            }
            l1 l1Var = i1Var.f5163e;
            ArrayList arrayList = l1Var.f5208a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            i1 i1Var2 = (i1) view.getLayoutParams();
            i1Var2.f5163e = null;
            if (i1Var2.f5273a.j() || i1Var2.f5273a.m()) {
                l1Var.f5211d -= l1Var.f5213f.f1065r.c(view);
            }
            if (size == 1) {
                l1Var.f5209b = Integer.MIN_VALUE;
            }
            l1Var.f5210c = Integer.MIN_VALUE;
            g0(viewU, v0Var);
        }
    }

    @Override // y0.o0
    public final void V() {
        this.B.f();
        j0();
    }

    public final void V0(int i4, v0 v0Var) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1065r.b(viewU) > i4 || this.f1065r.i(viewU) > i4) {
                return;
            }
            i1 i1Var = (i1) viewU.getLayoutParams();
            i1Var.getClass();
            if (i1Var.f5163e.f5208a.size() == 1) {
                return;
            }
            l1 l1Var = i1Var.f5163e;
            ArrayList arrayList = l1Var.f5208a;
            View view = (View) arrayList.remove(0);
            i1 i1Var2 = (i1) view.getLayoutParams();
            i1Var2.f5163e = null;
            if (arrayList.size() == 0) {
                l1Var.f5210c = Integer.MIN_VALUE;
            }
            if (i1Var2.f5273a.j() || i1Var2.f5273a.m()) {
                l1Var.f5211d -= l1Var.f5213f.f1065r.c(view);
            }
            l1Var.f5209b = Integer.MIN_VALUE;
            g0(viewU, v0Var);
        }
    }

    @Override // y0.o0
    public final void W(int i4, int i5) {
        M0(i4, i5, 8);
    }

    public final void W0() {
        if (this.f1067t == 1 || !O0()) {
            this.f1071x = this.f1070w;
        } else {
            this.f1071x = !this.f1070w;
        }
    }

    @Override // y0.o0
    public final void X(int i4, int i5) {
        M0(i4, i5, 2);
    }

    public final int X0(int i4, v0 v0Var, a1 a1Var) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        S0(i4, a1Var);
        u uVar = this.f1069v;
        int iD0 = D0(v0Var, uVar, a1Var);
        if (uVar.f5299b >= iD0) {
            i4 = i4 < 0 ? -iD0 : iD0;
        }
        this.f1065r.k(-i4);
        this.D = this.f1071x;
        uVar.f5299b = 0;
        T0(v0Var, uVar);
        return i4;
    }

    @Override // y0.o0
    public final void Y(int i4, int i5) {
        M0(i4, i5, 4);
    }

    public final void Y0(int i4) {
        u uVar = this.f1069v;
        uVar.f5302e = i4;
        uVar.f5301d = this.f1071x != (i4 == -1) ? -1 : 1;
    }

    @Override // y0.o0
    public final void Z(v0 v0Var, a1 a1Var) {
        Q0(v0Var, a1Var, true);
    }

    public final void Z0(int i4, a1 a1Var) {
        int iG;
        int iG2;
        int i5;
        int i6;
        int i7;
        int i8;
        u uVar = this.f1069v;
        boolean z4 = false;
        uVar.f5299b = 0;
        uVar.f5300c = i4;
        z zVar = this.f5232e;
        if (!(zVar != null && zVar.f5353e) || (i8 = a1Var.f5062a) == -1) {
            iG = 0;
            iG2 = 0;
        } else {
            if (this.f1071x == (i8 < i4)) {
                iG = this.f1065r.g();
                iG2 = 0;
            } else {
                iG2 = this.f1065r.g();
                iG = 0;
            }
        }
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView == null || !recyclerView.f1032h) {
            a0 a0Var = (a0) this.f1065r;
            int i9 = a0Var.f5061d;
            o0 o0Var = a0Var.f5081a;
            switch (i9) {
                case 0:
                    i5 = o0Var.f5241n;
                    break;
                default:
                    i5 = o0Var.f5242o;
                    break;
            }
            uVar.f5304g = i5 + iG;
            uVar.f5303f = -iG2;
        } else {
            uVar.f5303f = this.f1065r.f() - iG2;
            uVar.f5304g = this.f1065r.e() + iG;
        }
        uVar.f5305h = false;
        uVar.f5298a = true;
        y0.b0 b0Var = this.f1065r;
        a0 a0Var2 = (a0) b0Var;
        int i10 = a0Var2.f5061d;
        o0 o0Var2 = a0Var2.f5081a;
        switch (i10) {
            case 0:
                i6 = o0Var2.f5239l;
                break;
            default:
                i6 = o0Var2.f5240m;
                break;
        }
        if (i6 == 0) {
            a0 a0Var3 = (a0) b0Var;
            int i11 = a0Var3.f5061d;
            o0 o0Var3 = a0Var3.f5081a;
            switch (i11) {
                case 0:
                    i7 = o0Var3.f5241n;
                    break;
                default:
                    i7 = o0Var3.f5242o;
                    break;
            }
            if (i7 == 0) {
                z4 = true;
            }
        }
        uVar.f5306i = z4;
    }

    @Override // y0.z0
    public final PointF a(int i4) {
        int iY0 = y0(i4);
        PointF pointF = new PointF();
        if (iY0 == 0) {
            return null;
        }
        if (this.f1067t == 0) {
            pointF.x = iY0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iY0;
        }
        return pointF;
    }

    @Override // y0.o0
    public final void a0(a1 a1Var) {
        this.f1073z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void a1(l1 l1Var, int i4, int i5) {
        int i6 = l1Var.f5211d;
        int i7 = l1Var.f5212e;
        if (i4 != -1) {
            int i8 = l1Var.f5210c;
            if (i8 == Integer.MIN_VALUE) {
                l1Var.a();
                i8 = l1Var.f5210c;
            }
            if (i8 - i6 >= i5) {
                this.f1072y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = l1Var.f5209b;
        if (i9 == Integer.MIN_VALUE) {
            View view = (View) l1Var.f5208a.get(0);
            i1 i1Var = (i1) view.getLayoutParams();
            l1Var.f5209b = l1Var.f5213f.f1065r.d(view);
            i1Var.getClass();
            i9 = l1Var.f5209b;
        }
        if (i9 + i6 <= i5) {
            this.f1072y.set(i7, false);
        }
    }

    @Override // y0.o0
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof k1) {
            this.F = (k1) parcelable;
            j0();
        }
    }

    @Override // y0.o0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // y0.o0
    public final Parcelable c0() {
        int iH;
        int iF;
        int[] iArr;
        k1 k1Var = this.F;
        if (k1Var != null) {
            k1 k1Var2 = new k1();
            k1Var2.f5192d = k1Var.f5192d;
            k1Var2.f5190b = k1Var.f5190b;
            k1Var2.f5191c = k1Var.f5191c;
            k1Var2.f5193e = k1Var.f5193e;
            k1Var2.f5194f = k1Var.f5194f;
            k1Var2.f5195g = k1Var.f5195g;
            k1Var2.f5197i = k1Var.f5197i;
            k1Var2.f5198j = k1Var.f5198j;
            k1Var2.f5199k = k1Var.f5199k;
            k1Var2.f5196h = k1Var.f5196h;
            return k1Var2;
        }
        k1 k1Var3 = new k1();
        k1Var3.f5197i = this.f1070w;
        k1Var3.f5198j = this.D;
        k1Var3.f5199k = this.E;
        b0 b0Var = this.B;
        if (b0Var == null || (iArr = (int[]) b0Var.f3155c) == null) {
            k1Var3.f5194f = 0;
        } else {
            k1Var3.f5195g = iArr;
            k1Var3.f5194f = iArr.length;
            k1Var3.f5196h = (List) b0Var.f3156d;
        }
        if (v() > 0) {
            k1Var3.f5190b = this.D ? J0() : I0();
            View viewE0 = this.f1071x ? E0(true) : F0(true);
            k1Var3.f5191c = viewE0 != null ? o0.F(viewE0) : -1;
            int i4 = this.f1063p;
            k1Var3.f5192d = i4;
            k1Var3.f5193e = new int[i4];
            for (int i5 = 0; i5 < this.f1063p; i5++) {
                if (this.D) {
                    iH = this.f1064q[i5].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f1065r.e();
                        iH -= iF;
                    }
                } else {
                    iH = this.f1064q[i5].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f1065r.f();
                        iH -= iF;
                    }
                }
                k1Var3.f5193e[i5] = iH;
            }
        } else {
            k1Var3.f5190b = -1;
            k1Var3.f5191c = -1;
            k1Var3.f5192d = 0;
        }
        return k1Var3;
    }

    @Override // y0.o0
    public final boolean d() {
        return this.f1067t == 0;
    }

    @Override // y0.o0
    public final void d0(int i4) {
        if (i4 == 0) {
            z0();
        }
    }

    @Override // y0.o0
    public final boolean e() {
        return this.f1067t == 1;
    }

    @Override // y0.o0
    public final boolean f(p0 p0Var) {
        return p0Var instanceof i1;
    }

    @Override // y0.o0
    public final void h(int i4, int i5, a1 a1Var, q qVar) {
        u uVar;
        int iF;
        int iH;
        if (this.f1067t != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        S0(i4, a1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1063p) {
            this.J = new int[this.f1063p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f1063p;
            uVar = this.f1069v;
            if (i6 >= i8) {
                break;
            }
            if (uVar.f5301d == -1) {
                iF = uVar.f5303f;
                iH = this.f1064q[i6].h(iF);
            } else {
                iF = this.f1064q[i6].f(uVar.f5304g);
                iH = uVar.f5304g;
            }
            int i9 = iF - iH;
            if (i9 >= 0) {
                this.J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = uVar.f5300c;
            if (i11 < 0 || i11 >= a1Var.b()) {
                return;
            }
            qVar.a(uVar.f5300c, this.J[i10]);
            uVar.f5300c += uVar.f5301d;
        }
    }

    @Override // y0.o0
    public final int j(a1 a1Var) {
        return A0(a1Var);
    }

    @Override // y0.o0
    public final int k(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // y0.o0
    public final int k0(int i4, v0 v0Var, a1 a1Var) {
        return X0(i4, v0Var, a1Var);
    }

    @Override // y0.o0
    public final int l(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // y0.o0
    public final void l0(int i4) {
        k1 k1Var = this.F;
        if (k1Var != null && k1Var.f5190b != i4) {
            k1Var.f5193e = null;
            k1Var.f5192d = 0;
            k1Var.f5190b = -1;
            k1Var.f5191c = -1;
        }
        this.f1073z = i4;
        this.A = Integer.MIN_VALUE;
        j0();
    }

    @Override // y0.o0
    public final int m(a1 a1Var) {
        return A0(a1Var);
    }

    @Override // y0.o0
    public final int m0(int i4, v0 v0Var, a1 a1Var) {
        return X0(i4, v0Var, a1Var);
    }

    @Override // y0.o0
    public final int n(a1 a1Var) {
        return B0(a1Var);
    }

    @Override // y0.o0
    public final int o(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // y0.o0
    public final void p0(Rect rect, int i4, int i5) {
        int iG;
        int iG2;
        int iD = D() + C();
        int iB = B() + E();
        if (this.f1067t == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f5229b;
            WeakHashMap weakHashMap = i0.v0.f2983a;
            iG2 = o0.g(i5, iHeight, e0.d(recyclerView));
            iG = o0.g(i4, (this.f1068u * this.f1063p) + iD, e0.e(this.f5229b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f5229b;
            WeakHashMap weakHashMap2 = i0.v0.f2983a;
            iG = o0.g(i4, iWidth, e0.e(recyclerView2));
            iG2 = o0.g(i5, (this.f1068u * this.f1063p) + iB, e0.d(this.f5229b));
        }
        this.f5229b.setMeasuredDimension(iG, iG2);
    }

    @Override // y0.o0
    public final p0 r() {
        return this.f1067t == 0 ? new i1(-2, -1) : new i1(-1, -2);
    }

    @Override // y0.o0
    public final p0 s(Context context, AttributeSet attributeSet) {
        return new i1(context, attributeSet);
    }

    @Override // y0.o0
    public final p0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new i1((ViewGroup.MarginLayoutParams) layoutParams) : new i1(layoutParams);
    }

    @Override // y0.o0
    public final void v0(RecyclerView recyclerView, int i4) {
        z zVar = new z(recyclerView.getContext());
        zVar.f5349a = i4;
        w0(zVar);
    }

    @Override // y0.o0
    public final int x(v0 v0Var, a1 a1Var) {
        return this.f1067t == 1 ? this.f1063p : super.x(v0Var, a1Var);
    }

    @Override // y0.o0
    public final boolean x0() {
        return this.F == null;
    }

    public final int y0(int i4) {
        if (v() == 0) {
            return this.f1071x ? 1 : -1;
        }
        return (i4 < I0()) != this.f1071x ? -1 : 1;
    }

    public final boolean z0() {
        int iI0;
        if (v() != 0 && this.C != 0 && this.f5234g) {
            if (this.f1071x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            b0 b0Var = this.B;
            if (iI0 == 0 && N0() != null) {
                b0Var.f();
                this.f5233f = true;
                j0();
                return true;
            }
        }
        return false;
    }
}
