package y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f5228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f5229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.b0 f5230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.b0 f5231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f5232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5242o;

    public o0() {
        androidx.fragment.app.k kVar = new androidx.fragment.app.k(0, this);
        androidx.fragment.app.k kVar2 = new androidx.fragment.app.k(1, this);
        this.f5230c = new j1.b0(kVar);
        this.f5231d = new j1.b0(kVar2);
        this.f5233f = false;
        this.f5234g = false;
        this.f5235h = true;
        this.f5236i = true;
    }

    public static int F(View view) {
        return ((p0) view.getLayoutParams()).f5273a.c();
    }

    public static n0 G(Context context, AttributeSet attributeSet, int i4, int i5) {
        n0 n0Var = new n0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.a.f4928a, i4, i5);
        n0Var.f5223a = typedArrayObtainStyledAttributes.getInt(0, 1);
        n0Var.f5224b = typedArrayObtainStyledAttributes.getInt(10, 1);
        n0Var.f5225c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        n0Var.f5226d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return n0Var;
    }

    public static boolean K(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    public static void L(View view, int i4, int i5, int i6, int i7) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.f5274b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int g(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i5, i6) : size;
        }
        return Math.min(size, Math.max(i5, i6));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(int i4, int i5, int i6, int i7, boolean z4) {
        int iMax = Math.max(0, i4 - i6);
        if (z4) {
            if (i7 >= 0) {
                i5 = 1073741824;
            } else if (i7 != -1 || (i5 != Integer.MIN_VALUE && (i5 == 0 || i5 != 1073741824))) {
                i5 = 0;
                i7 = 0;
            } else {
                i7 = iMax;
            }
        } else if (i7 >= 0) {
            i5 = 1073741824;
        } else if (i7 == -1) {
            i7 = iMax;
        } else if (i7 != -2) {
            i5 = 0;
            i7 = 0;
        } else if (i5 == Integer.MIN_VALUE || i5 == 1073741824) {
            i7 = iMax;
            i5 = Integer.MIN_VALUE;
        } else {
            i7 = iMax;
            i5 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i7, i5);
    }

    public final int A() {
        RecyclerView recyclerView = this.f5229b;
        WeakHashMap weakHashMap = i0.v0.f2983a;
        return i0.f0.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(v0 v0Var, a1 a1Var) {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView == null || recyclerView.f1040l == null || !e()) {
            return 1;
        }
        return this.f5229b.f1040l.a();
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f5274b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5229b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5229b.f1038k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i4) {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            int iE = recyclerView.f1028f.e();
            for (int i5 = 0; i5 < iE; i5++) {
                recyclerView.f1028f.d(i5).offsetLeftAndRight(i4);
            }
        }
    }

    public void N(int i4) {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            int iE = recyclerView.f1028f.e();
            for (int i5 = 0; i5 < iE; i5++) {
                recyclerView.f1028f.d(i5).offsetTopAndBottom(i4);
            }
        }
    }

    public void O(RecyclerView recyclerView) {
    }

    public abstract void P(RecyclerView recyclerView);

    public abstract View Q(View view, int i4, v0 v0Var, a1 a1Var);

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f5229b;
        v0 v0Var = recyclerView.f1022c;
        a1 a1Var = recyclerView.f1025d0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f5229b.canScrollVertically(-1) && !this.f5229b.canScrollHorizontally(-1) && !this.f5229b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        g0 g0Var = this.f5229b.f1040l;
        if (g0Var != null) {
            accessibilityEvent.setItemCount(g0Var.a());
        }
    }

    public final void S(View view, j0.o oVar) {
        d1 d1VarI = RecyclerView.I(view);
        if (d1VarI == null || d1VarI.j() || this.f5228a.f5097c.contains(d1VarI.f5103a)) {
            return;
        }
        RecyclerView recyclerView = this.f5229b;
        T(recyclerView.f1022c, recyclerView.f1025d0, view, oVar);
    }

    public void T(v0 v0Var, a1 a1Var, View view, j0.o oVar) {
        oVar.i(j0.n.a(e() ? F(view) : 0, 1, d() ? F(view) : 0, 1, false));
    }

    public void U(int i4, int i5) {
    }

    public void V() {
    }

    public void W(int i4, int i5) {
    }

    public void X(int i4, int i5) {
    }

    public void Y(int i4, int i5) {
    }

    public abstract void Z(v0 v0Var, a1 a1Var);

    public abstract void a0(a1 a1Var);

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    public final void b(View view, int i4, boolean z4) {
        int iB;
        d1 d1VarI = RecyclerView.I(view);
        if (z4 || d1VarI.j()) {
            this.f5229b.f1030g.c(d1VarI);
        } else {
            this.f5229b.f1030g.o(d1VarI);
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (d1VarI.r() || d1VarI.k()) {
            if (d1VarI.k()) {
                d1VarI.f5116n.k(d1VarI);
            } else {
                d1VarI.f5112j &= -33;
            }
            this.f5228a.b(view, i4, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f5229b) {
                d dVar = this.f5228a;
                int iIndexOfChild = dVar.f5095a.f5132a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iB = -1;
                } else {
                    c cVar = dVar.f5096b;
                    if (cVar.d(iIndexOfChild)) {
                        iB = -1;
                    } else {
                        iB = iIndexOfChild - cVar.b(iIndexOfChild);
                    }
                }
                if (i4 == -1) {
                    i4 = this.f5228a.e();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5229b.indexOfChild(view) + this.f5229b.y());
                }
                if (iB != i4) {
                    o0 o0Var = this.f5229b.f1042m;
                    View viewU = o0Var.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + o0Var.f5229b.toString());
                    }
                    o0Var.u(iB);
                    o0Var.f5228a.c(iB);
                    p0 p0Var2 = (p0) viewU.getLayoutParams();
                    d1 d1VarI2 = RecyclerView.I(viewU);
                    if (d1VarI2.j()) {
                        o0Var.f5229b.f1030g.c(d1VarI2);
                    } else {
                        o0Var.f5229b.f1030g.o(d1VarI2);
                    }
                    o0Var.f5228a.b(viewU, i4, p0Var2, d1VarI2.j());
                }
            } else {
                this.f5228a.a(view, i4, false);
                p0Var.f5275c = true;
                z zVar = this.f5232e;
                if (zVar != null && zVar.f5353e) {
                    zVar.f5350b.getClass();
                    d1 d1VarI3 = RecyclerView.I(view);
                    if ((d1VarI3 != null ? d1VarI3.c() : -1) == zVar.f5349a) {
                        zVar.f5354f = view;
                    }
                }
            }
        }
        if (p0Var.f5276d) {
            d1VarI.f5103a.invalidate();
            p0Var.f5276d = false;
        }
    }

    public void b0(Parcelable parcelable) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public Parcelable c0() {
        return null;
    }

    public abstract boolean d();

    public void d0(int i4) {
    }

    public abstract boolean e();

    public final void e0(v0 v0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).q()) {
                View viewU = u(iV);
                h0(iV);
                v0Var.g(viewU);
            }
        }
    }

    public boolean f(p0 p0Var) {
        return p0Var != null;
    }

    public final void f0(v0 v0Var) {
        ArrayList arrayList;
        int size = v0Var.f5314a.size();
        int i4 = size - 1;
        while (true) {
            arrayList = v0Var.f5314a;
            if (i4 < 0) {
                break;
            }
            View view = ((d1) arrayList.get(i4)).f5103a;
            d1 d1VarI = RecyclerView.I(view);
            if (!d1VarI.q()) {
                d1VarI.p(false);
                if (d1VarI.l()) {
                    this.f5229b.removeDetachedView(view, false);
                }
                l0 l0Var = this.f5229b.I;
                if (l0Var != null) {
                    l0Var.d(d1VarI);
                }
                d1VarI.p(true);
                d1 d1VarI2 = RecyclerView.I(view);
                d1VarI2.f5116n = null;
                d1VarI2.f5117o = false;
                d1VarI2.f5112j &= -33;
                v0Var.h(d1VarI2);
            }
            i4--;
        }
        arrayList.clear();
        ArrayList arrayList2 = v0Var.f5315b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5229b.invalidate();
        }
    }

    public final void g0(View view, v0 v0Var) {
        d dVar = this.f5228a;
        f0 f0Var = dVar.f5095a;
        int iIndexOfChild = f0Var.f5132a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (dVar.f5096b.f(iIndexOfChild)) {
                dVar.k(view);
            }
            f0Var.h(iIndexOfChild);
        }
        v0Var.g(view);
    }

    public void h(int i4, int i5, a1 a1Var, q qVar) {
    }

    public final void h0(int i4) {
        if (u(i4) != null) {
            d dVar = this.f5228a;
            int iF = dVar.f(i4);
            f0 f0Var = dVar.f5095a;
            View childAt = f0Var.f5132a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (dVar.f5096b.f(iF)) {
                dVar.k(childAt);
            }
            f0Var.h(iF);
        }
    }

    public void i(int i4, q qVar) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    public boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        int iC = C();
        int iE = E();
        int iD = this.f5241n - D();
        int iB = this.f5242o - B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i4 = left - iC;
        int iMin = Math.min(0, i4);
        int i5 = top - iE;
        int iMin2 = Math.min(0, i5);
        int i6 = iWidth - iD;
        int iMax = Math.max(0, i6);
        int iMax2 = Math.max(0, iHeight - iB);
        if (A() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i4, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i6);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i5, iMax2);
        }
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iC2 = C();
                int iE2 = E();
                int iD2 = this.f5241n - D();
                int iB2 = this.f5242o - B();
                Rect rect2 = this.f5229b.f1034i;
                y(focusedChild, rect2);
                if (rect2.left - iMax < iD2 && rect2.right - iMax > iC2 && rect2.top - iMin2 < iB2 && rect2.bottom - iMin2 > iE2) {
                    if (iMax == 0) {
                    }
                    if (z4) {
                        recyclerView.scrollBy(iMax, iMin2);
                    } else {
                        recyclerView.b0(iMax, iMin2, false);
                    }
                    return true;
                }
            }
        } else if (iMax == 0 || iMin2 != 0) {
            if (z4) {
                recyclerView.scrollBy(iMax, iMin2);
            } else {
                recyclerView.b0(iMax, iMin2, false);
            }
            return true;
        }
        return false;
    }

    public abstract int j(a1 a1Var);

    public final void j0() {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int k(a1 a1Var);

    public abstract int k0(int i4, v0 v0Var, a1 a1Var);

    public abstract int l(a1 a1Var);

    public abstract void l0(int i4);

    public abstract int m(a1 a1Var);

    public abstract int m0(int i4, v0 v0Var, a1 a1Var);

    public abstract int n(a1 a1Var);

    public final void n0(RecyclerView recyclerView) {
        o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int o(a1 a1Var);

    public final void o0(int i4, int i5) {
        this.f5241n = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.f5239l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1016t0;
        }
        this.f5242o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f5240m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1016t0;
        }
    }

    public final void p(v0 v0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            d1 d1VarI = RecyclerView.I(viewU);
            if (!d1VarI.q()) {
                if (!d1VarI.h() || d1VarI.j() || this.f5229b.f1040l.f5142b) {
                    u(iV);
                    this.f5228a.c(iV);
                    v0Var.i(viewU);
                    this.f5229b.f1030g.o(d1VarI);
                } else {
                    h0(iV);
                    v0Var.h(d1VarI);
                }
            }
        }
    }

    public void p0(Rect rect, int i4, int i5) {
        int iD = D() + C() + rect.width();
        int iB = B() + E() + rect.height();
        RecyclerView recyclerView = this.f5229b;
        WeakHashMap weakHashMap = i0.v0.f2983a;
        this.f5229b.setMeasuredDimension(g(i4, iD, i0.e0.e(recyclerView)), g(i5, iB, i0.e0.d(this.f5229b)));
    }

    public View q(int i4) {
        int iV = v();
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = u(i5);
            d1 d1VarI = RecyclerView.I(viewU);
            if (d1VarI != null && d1VarI.c() == i4 && !d1VarI.q() && (this.f5229b.f1025d0.f5068g || !d1VarI.j())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(int i4, int i5) {
        int iV = v();
        if (iV == 0) {
            this.f5229b.n(i4, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            Rect rect = this.f5229b.f1034i;
            y(viewU, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f5229b.f1034i.set(i9, i7, i6, i8);
        p0(this.f5229b.f1034i, i4, i5);
    }

    public abstract p0 r();

    public final void r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5229b = null;
            this.f5228a = null;
            this.f5241n = 0;
            this.f5242o = 0;
        } else {
            this.f5229b = recyclerView;
            this.f5228a = recyclerView.f1028f;
            this.f5241n = recyclerView.getWidth();
            this.f5242o = recyclerView.getHeight();
        }
        this.f5239l = 1073741824;
        this.f5240m = 1073741824;
    }

    public p0 s(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public final boolean s0(View view, int i4, int i5, p0 p0Var) {
        return (!view.isLayoutRequested() && this.f5235h && K(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) p0Var).width) && K(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true;
    }

    public p0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p0) {
            return new p0((p0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p0((ViewGroup.MarginLayoutParams) layoutParams) : new p0(layoutParams);
    }

    public boolean t0() {
        return false;
    }

    public final View u(int i4) {
        d dVar = this.f5228a;
        if (dVar != null) {
            return dVar.d(i4);
        }
        return null;
    }

    public final boolean u0(View view, int i4, int i5, p0 p0Var) {
        return (this.f5235h && K(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) p0Var).width) && K(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true;
    }

    public final int v() {
        d dVar = this.f5228a;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public abstract void v0(RecyclerView recyclerView, int i4);

    public final void w0(z zVar) {
        z zVar2 = this.f5232e;
        if (zVar2 != null && zVar != zVar2 && zVar2.f5353e) {
            zVar2.i();
        }
        this.f5232e = zVar;
        RecyclerView recyclerView = this.f5229b;
        c1 c1Var = recyclerView.f1019a0;
        c1Var.f5094h.removeCallbacks(c1Var);
        c1Var.f5090d.abortAnimation();
        if (zVar.f5356h) {
            Log.w("RecyclerView", "An instance of " + zVar.getClass().getSimpleName() + " was started more than once. Each instance of" + zVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        zVar.f5350b = recyclerView;
        zVar.f5351c = this;
        int i4 = zVar.f5349a;
        if (i4 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1025d0.f5062a = i4;
        zVar.f5353e = true;
        zVar.f5352d = true;
        zVar.f5354f = recyclerView.f1042m.q(i4);
        zVar.f5350b.f1019a0.a();
        zVar.f5356h = true;
    }

    public int x(v0 v0Var, a1 a1Var) {
        RecyclerView recyclerView = this.f5229b;
        if (recyclerView == null || recyclerView.f1040l == null || !d()) {
            return 1;
        }
        return this.f5229b.f1040l.a();
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1016t0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f5274b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public final int z() {
        RecyclerView recyclerView = this.f5229b;
        g0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }
}
