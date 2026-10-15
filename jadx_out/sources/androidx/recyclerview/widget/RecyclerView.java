package androidx.recyclerview.widget;

import a4.e0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import e0.k;
import e0.l;
import i0.o;
import j1.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.e;
import p0.d;
import y0.a;
import y0.a1;
import y0.b;
import y0.b1;
import y0.c0;
import y0.c1;
import y0.d0;
import y0.d1;
import y0.f0;
import y0.f1;
import y0.g0;
import y0.i0;
import y0.j0;
import y0.k0;
import y0.l0;
import y0.m0;
import y0.o0;
import y0.o1;
import y0.p;
import y0.p0;
import y0.q;
import y0.q0;
import y0.r0;
import y0.s;
import y0.s0;
import y0.t0;
import y0.u0;
import y0.v0;
import y0.w0;
import y0.x0;
import y0.z;
import y0.z0;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int[] f1016t0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Class[] f1017u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final d f1018v0;
    public boolean A;
    public int B;
    public int C;
    public j0 D;
    public EdgeEffect E;
    public EdgeEffect F;
    public EdgeEffect G;
    public EdgeEffect H;
    public l0 I;
    public int J;
    public int K;
    public VelocityTracker L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public q0 R;
    public final int S;
    public final int T;
    public final float U;
    public final float V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final c1 f1019a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f1020b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public s f1021b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f1022c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final q f1023c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f1024d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final a1 f1025d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f1026e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public s0 f1027e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0.d f1028f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ArrayList f1029f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f1030g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1031g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1032h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f1033h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f1034i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final f0 f1035i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1036j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f1037j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f1038k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public f1 f1039k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g0 f1040l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int[] f1041l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o0 f1042m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public o f1043m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f1044n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int[] f1045n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1046o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int[] f1047o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r0 f1048p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f1049p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1050q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f1051q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1052r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final y0.e0 f1053r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1054s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final f0 f1055s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1062z;

    static {
        Class cls = Integer.TYPE;
        f1017u0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1018v0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.shungo.app.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i4));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static d1 I(View view) {
        if (view == null) {
            return null;
        }
        return ((p0) view.getLayoutParams()).f5273a;
    }

    private o getScrollingChildHelper() {
        if (this.f1043m0 == null) {
            this.f1043m0 = new o(this);
        }
        return this.f1043m0;
    }

    public static void j(d1 d1Var) {
        WeakReference weakReference = d1Var.f5104b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == d1Var.f5103a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            d1Var.f5104b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final boolean B(MotionEvent motionEvent) {
        boolean z4;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1046o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            r0 r0Var = (r0) arrayList.get(i4);
            p pVar = (p) r0Var;
            int i5 = pVar.f5268v;
            if (i5 == 1) {
                boolean zD = pVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = pVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        pVar.f5269w = 1;
                        pVar.f5262p = (int) motionEvent.getX();
                    } else if (zD) {
                        pVar.f5269w = 2;
                        pVar.f5259m = (int) motionEvent.getY();
                    }
                    pVar.f(2);
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (i5 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && action != 3) {
                this.f1048p = r0Var;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iE = this.f1028f.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < iE; i6++) {
            d1 d1VarI = I(this.f1028f.d(i6));
            if (!d1VarI.q()) {
                int iC = d1VarI.c();
                if (iC < i4) {
                    i4 = iC;
                }
                if (iC > i5) {
                    i5 = iC;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public final d1 E(int i4) {
        d1 d1Var = null;
        if (this.f1062z) {
            return null;
        }
        int iH = this.f1028f.h();
        for (int i5 = 0; i5 < iH; i5++) {
            d1 d1VarI = I(this.f1028f.g(i5));
            if (d1VarI != null && !d1VarI.j() && F(d1VarI) == i4) {
                if (!this.f1028f.j(d1VarI.f5103a)) {
                    return d1VarI;
                }
                d1Var = d1VarI;
            }
        }
        return d1Var;
    }

    public final int F(d1 d1Var) {
        if (d1Var.e(524) || !d1Var.g()) {
            return -1;
        }
        b bVar = this.f1026e;
        int i4 = d1Var.f5105c;
        ArrayList arrayList = bVar.f5077b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            int i6 = aVar.f5057a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = aVar.f5058b;
                    if (i7 <= i4) {
                        int i8 = aVar.f5060d;
                        if (i7 + i8 > i4) {
                            return -1;
                        }
                        i4 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = aVar.f5058b;
                    if (i9 == i4) {
                        i4 = aVar.f5060d;
                    } else {
                        if (i9 < i4) {
                            i4--;
                        }
                        if (aVar.f5060d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (aVar.f5058b <= i4) {
                i4 += aVar.f5060d;
            }
        }
        return i4;
    }

    public final long G(d1 d1Var) {
        return this.f1040l.f5142b ? d1Var.f5107e : d1Var.f5105c;
    }

    public final d1 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        boolean z4 = p0Var.f5275c;
        Rect rect = p0Var.f5274b;
        if (!z4) {
            return rect;
        }
        if (this.f1025d0.f5068g && (p0Var.f5273a.m() || p0Var.f5273a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1044n;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Rect rect2 = this.f1034i;
            rect2.set(0, 0, 0, 0);
            ((m0) arrayList.get(i4)).getClass();
            ((p0) view.getLayoutParams()).f5273a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        p0Var.f5275c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1054s || this.f1062z || this.f1026e.g();
    }

    public final boolean L() {
        return this.B > 0;
    }

    public final void M(int i4) {
        if (this.f1042m == null) {
            return;
        }
        setScrollState(2);
        this.f1042m.l0(i4);
        awakenScrollBars();
    }

    public final void N() {
        int iH = this.f1028f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            ((p0) this.f1028f.g(i4).getLayoutParams()).f5275c = true;
        }
        ArrayList arrayList = this.f1022c.f5316c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p0 p0Var = (p0) ((d1) arrayList.get(i5)).f5103a.getLayoutParams();
            if (p0Var != null) {
                p0Var.f5275c = true;
            }
        }
    }

    public final void O(int i4, int i5, boolean z4) {
        int i6 = i4 + i5;
        int iH = this.f1028f.h();
        for (int i7 = 0; i7 < iH; i7++) {
            d1 d1VarI = I(this.f1028f.g(i7));
            if (d1VarI != null && !d1VarI.q()) {
                int i8 = d1VarI.f5105c;
                a1 a1Var = this.f1025d0;
                if (i8 >= i6) {
                    d1VarI.n(-i5, z4);
                    a1Var.f5067f = true;
                } else if (i8 >= i4) {
                    d1VarI.b(8);
                    d1VarI.n(-i5, z4);
                    d1VarI.f5105c = i4 - 1;
                    a1Var.f5067f = true;
                }
            }
        }
        v0 v0Var = this.f1022c;
        ArrayList arrayList = v0Var.f5316c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList.get(size);
            if (d1Var != null) {
                int i9 = d1Var.f5105c;
                if (i9 >= i6) {
                    d1Var.n(-i5, z4);
                } else if (i9 >= i4) {
                    d1Var.b(8);
                    v0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.B++;
    }

    public final void Q(boolean z4) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i5 = this.B - 1;
        this.B = i5;
        if (i5 < 1) {
            this.B = 0;
            if (z4) {
                int i6 = this.f1060x;
                this.f1060x = 0;
                if (i6 != 0 && (accessibilityManager = this.f1061y) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    j0.b.b(accessibilityEventObtain, i6);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1051q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) arrayList.get(size);
                    if (d1Var.f5103a.getParent() == this && !d1Var.q() && (i4 = d1Var.f5119q) != -1) {
                        WeakHashMap weakHashMap = i0.v0.f2983a;
                        i0.e0.s(d1Var.f5103a, i4);
                        d1Var.f5119q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.K = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.O = x4;
            this.M = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.P = y4;
            this.N = y4;
        }
    }

    public final void S() {
        if (this.f1037j0 || !this.f1050q) {
            return;
        }
        WeakHashMap weakHashMap = i0.v0.f2983a;
        i0.e0.m(this, this.f1053r0);
        this.f1037j0 = true;
    }

    public final void T() {
        boolean z4;
        if (this.f1062z) {
            b bVar = this.f1026e;
            bVar.l(bVar.f5077b);
            bVar.l(bVar.f5078c);
            if (this.A) {
                this.f1042m.V();
            }
        }
        if (this.I == null || !this.f1042m.x0()) {
            this.f1026e.c();
        } else {
            this.f1026e.j();
        }
        boolean z5 = this.f1031g0 || this.f1033h0;
        boolean z6 = this.f1054s && this.I != null && ((z4 = this.f1062z) || z5 || this.f1042m.f5233f) && (!z4 || this.f1040l.f5142b);
        a1 a1Var = this.f1025d0;
        a1Var.f5071j = z6;
        a1Var.f5072k = z6 && z5 && !this.f1062z && this.I != null && this.f1042m.x0();
    }

    public final void U(boolean z4) {
        this.A = z4 | this.A;
        this.f1062z = true;
        int iH = this.f1028f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            d1 d1VarI = I(this.f1028f.g(i4));
            if (d1VarI != null && !d1VarI.q()) {
                d1VarI.b(6);
            }
        }
        N();
        v0 v0Var = this.f1022c;
        ArrayList arrayList = v0Var.f5316c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d1 d1Var = (d1) arrayList.get(i5);
            if (d1Var != null) {
                d1Var.b(6);
                d1Var.a(null);
            }
        }
        g0 g0Var = v0Var.f5321h.f1040l;
        if (g0Var == null || !g0Var.f5142b) {
            v0Var.e();
        }
    }

    public final void V(d1 d1Var, k0 k0Var) {
        d1Var.f5112j &= -8193;
        boolean z4 = this.f1025d0.f5069h;
        b0 b0Var = this.f1030g;
        if (z4 && d1Var.m() && !d1Var.j() && !d1Var.q()) {
            ((e) b0Var.f3156d).e(G(d1Var), d1Var);
        }
        b0Var.e(d1Var, k0Var);
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1034i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p0) {
            p0 p0Var = (p0) layoutParams;
            if (!p0Var.f5275c) {
                int i4 = rect.left;
                Rect rect2 = p0Var.f5274b;
                rect.left = i4 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1042m.i0(this, view, this.f1034i, !this.f1054s, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.H.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            i0.e0.k(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    public final boolean Y(int i4, int i5, MotionEvent motionEvent) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        m();
        g0 g0Var = this.f1040l;
        int[] iArr = this.f1049p0;
        if (g0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Z(i4, i5, iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            i6 = i10;
            i7 = i11;
            i8 = i4 - i10;
            i9 = i5 - i11;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.f1044n.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i6, i7, i8, i9, this.f1045n0, 0, iArr);
        int i12 = iArr[0];
        int i13 = i8 - i12;
        int i14 = iArr[1];
        int i15 = i9 - i14;
        boolean z5 = (i12 == 0 && i14 == 0) ? false : true;
        int i16 = this.O;
        int[] iArr2 = this.f1045n0;
        int i17 = iArr2[0];
        this.O = i16 - i17;
        int i18 = this.P;
        int i19 = iArr2[1];
        this.P = i18 - i19;
        int[] iArr3 = this.f1047o0;
        iArr3[0] = iArr3[0] + i17;
        iArr3[1] = iArr3[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x4 = motionEvent.getX();
                float f5 = i13;
                float y4 = motionEvent.getY();
                float f6 = i15;
                if (f5 < 0.0f) {
                    v();
                    m0.d.a(this.E, (-f5) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    if (f5 > 0.0f) {
                        w();
                        m0.d.a(this.G, f5 / getWidth(), y4 / getHeight());
                    } else {
                        z4 = false;
                    }
                    if (f6 < 0.0f) {
                        x();
                        m0.d.a(this.F, (-f6) / getHeight(), x4 / getWidth());
                    } else if (f6 > 0.0f) {
                        u();
                        m0.d.a(this.H, f6 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else if (!z4 || f5 != 0.0f || f6 != 0.0f) {
                    }
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    i0.e0.k(this);
                }
                z4 = true;
                if (f6 < 0.0f) {
                    x();
                    m0.d.a(this.F, (-f6) / getHeight(), x4 / getWidth());
                } else if (f6 > 0.0f) {
                    u();
                    m0.d.a(this.H, f6 / getHeight(), 1.0f - (x4 / getWidth()));
                } else if (!z4) {
                }
                WeakHashMap weakHashMap2 = i0.v0.f2983a;
                i0.e0.k(this);
            }
            l(i4, i5);
        }
        if (i6 != 0 || i7 != 0) {
            t(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i6 == 0 && i7 == 0) ? false : true;
    }

    public final void Z(int i4, int i5, int[] iArr) {
        d1 d1Var;
        c0();
        P();
        int i6 = l.f1962a;
        k.a("RV Scroll");
        a1 a1Var = this.f1025d0;
        z(a1Var);
        v0 v0Var = this.f1022c;
        int iK0 = i4 != 0 ? this.f1042m.k0(i4, v0Var, a1Var) : 0;
        int iM0 = i5 != 0 ? this.f1042m.m0(i5, v0Var, a1Var) : 0;
        k.b();
        int iE = this.f1028f.e();
        for (int i7 = 0; i7 < iE; i7++) {
            View viewD = this.f1028f.d(i7);
            d1 d1VarH = H(viewD);
            if (d1VarH != null && (d1Var = d1VarH.f5111i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = d1Var.f5103a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iK0;
            iArr[1] = iM0;
        }
    }

    public final void a0(int i4) {
        z zVar;
        if (this.f1058v) {
            return;
        }
        setScrollState(0);
        c1 c1Var = this.f1019a0;
        c1Var.f5094h.removeCallbacks(c1Var);
        c1Var.f5090d.abortAnimation();
        o0 o0Var = this.f1042m;
        if (o0Var != null && (zVar = o0Var.f5232e) != null) {
            zVar.i();
        }
        o0 o0Var2 = this.f1042m;
        if (o0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var2.l0(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            o0Var.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b0(int i4, int i5, boolean z4) {
        o0 o0Var = this.f1042m;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1058v) {
            return;
        }
        if (!o0Var.d()) {
            i4 = 0;
        }
        if (!this.f1042m.e()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (z4) {
            int i6 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().h(i6, 1);
        }
        this.f1019a0.b(i4, i5, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i4 = this.f1056t + 1;
        this.f1056t = i4;
        if (i4 != 1 || this.f1058v) {
            return;
        }
        this.f1057u = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p0) && this.f1042m.f((p0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.d()) {
            return this.f1042m.j(this.f1025d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.d()) {
            return this.f1042m.k(this.f1025d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.d()) {
            return this.f1042m.l(this.f1025d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.e()) {
            return this.f1042m.m(this.f1025d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.e()) {
            return this.f1042m.n(this.f1025d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        o0 o0Var = this.f1042m;
        if (o0Var != null && o0Var.e()) {
            return this.f1042m.o(this.f1025d0);
        }
        return 0;
    }

    public final void d0(boolean z4) {
        if (this.f1056t < 1) {
            this.f1056t = 1;
        }
        if (!z4 && !this.f1058v) {
            this.f1057u = false;
        }
        if (this.f1056t == 1) {
            if (z4 && this.f1057u && !this.f1058v && this.f1042m != null && this.f1040l != null) {
                o();
            }
            if (!this.f1058v) {
                this.f1057u = false;
            }
        }
        this.f1056t--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return getScrollingChildHelper().a(f5, f6, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return getScrollingChildHelper().b(f5, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().e(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f1044n;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((m0) arrayList.get(i4)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1032h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.E;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1032h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.F;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.G;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1032h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.G;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.H;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1032h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.H;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.I == null || arrayList.size() <= 0 || !this.I.f()) && !z4) {
            return;
        }
        WeakHashMap weakHashMap = i0.v0.f2983a;
        i0.e0.k(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e0(int i4) {
        getScrollingChildHelper().i(i4);
    }

    public final void f(d1 d1Var) {
        View view = d1Var.f5103a;
        boolean z4 = view.getParent() == this;
        this.f1022c.k(H(view));
        if (d1Var.l()) {
            this.f1028f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f1028f.a(view, -1, true);
            return;
        }
        y0.d dVar = this.f1028f;
        int iIndexOfChild = dVar.f5095a.f5132a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            dVar.f5096b.h(iIndexOfChild);
            dVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i4) {
        View viewQ;
        int i5;
        byte b5;
        boolean z4;
        this.f1042m.getClass();
        boolean z5 = (this.f1040l == null || this.f1042m == null || L() || this.f1058v) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        a1 a1Var = this.f1025d0;
        v0 v0Var = this.f1022c;
        if (z5 && (i4 == 2 || i4 == 1)) {
            if (this.f1042m.e()) {
                if (focusFinder.findNextFocus(this, view, i4 == 2 ? 130 : 33) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f1042m.d()) {
                z4 = focusFinder.findNextFocus(this, view, (this.f1042m.A() == 1) ^ (i4 == 2) ? 66 : 17) == null;
            }
            if (z4) {
                m();
                if (A(view) == null) {
                    return null;
                }
                c0();
                this.f1042m.Q(view, i4, v0Var, a1Var);
                d0(false);
            }
            viewQ = focusFinder.findNextFocus(this, view, i4);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (viewFindNextFocus == null && z5) {
                m();
                if (A(view) == null) {
                    return null;
                }
                c0();
                viewQ = this.f1042m.Q(view, i4, v0Var, a1Var);
                d0(false);
            } else {
                viewQ = viewFindNextFocus;
            }
        }
        if (viewQ != null && !viewQ.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            W(viewQ, null);
            return view;
        }
        if (viewQ != null && viewQ != this && A(viewQ) != null) {
            if (view == null || A(view) == null) {
                return viewQ;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1034i;
            rect.set(0, 0, width, height);
            int width2 = viewQ.getWidth();
            int height2 = viewQ.getHeight();
            Rect rect2 = this.f1036j;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewQ, rect2);
            int i6 = this.f1042m.A() == 1 ? -1 : 1;
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                i5 = 1;
            } else {
                int i9 = rect.right;
                int i10 = rect2.right;
                i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
            }
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                b5 = 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                b5 = ((i13 > i14 || i11 >= i14) && i11 > i12) ? (byte) -1 : (byte) 0;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 17) {
                        if (i4 != 33) {
                            if (i4 != 66) {
                                if (i4 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i4 + y());
                                }
                                if (b5 > 0) {
                                    return viewQ;
                                }
                            } else if (i5 > 0) {
                                return viewQ;
                            }
                        } else if (b5 < 0) {
                            return viewQ;
                        }
                    } else if (i5 < 0) {
                        return viewQ;
                    }
                } else {
                    if (b5 > 0) {
                        return viewQ;
                    }
                    if (b5 == 0 && i5 * i6 >= 0) {
                        return viewQ;
                    }
                }
            } else {
                if (b5 < 0) {
                    return viewQ;
                }
                if (b5 == 0 && i5 * i6 <= 0) {
                    return viewQ;
                }
            }
        }
        return super.focusSearch(view, i4);
    }

    public final void g(m0 m0Var) {
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            o0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1044n;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            return o0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            return o0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g0 getAdapter() {
        return this.f1040l;
    }

    @Override // android.view.View
    public int getBaseline() {
        o0 o0Var = this.f1042m;
        if (o0Var == null) {
            return super.getBaseline();
        }
        o0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1032h;
    }

    public f1 getCompatAccessibilityDelegate() {
        return this.f1039k0;
    }

    public j0 getEdgeEffectFactory() {
        return this.D;
    }

    public l0 getItemAnimator() {
        return this.I;
    }

    public int getItemDecorationCount() {
        return this.f1044n.size();
    }

    public o0 getLayoutManager() {
        return this.f1042m;
    }

    public int getMaxFlingVelocity() {
        return this.T;
    }

    public int getMinFlingVelocity() {
        return this.S;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public q0 getOnFlingListener() {
        return this.R;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.W;
    }

    public u0 getRecycledViewPool() {
        return this.f1022c.c();
    }

    public int getScrollState() {
        return this.J;
    }

    public final void h(s0 s0Var) {
        if (this.f1029f0 == null) {
            this.f1029f0 = new ArrayList();
        }
        this.f1029f0.add(s0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.C > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1050q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1058v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2947d;
    }

    public final void k() {
        int iH = this.f1028f.h();
        for (int i4 = 0; i4 < iH; i4++) {
            d1 d1VarI = I(this.f1028f.g(i4));
            if (!d1VarI.q()) {
                d1VarI.f5106d = -1;
                d1VarI.f5109g = -1;
            }
        }
        v0 v0Var = this.f1022c;
        ArrayList arrayList = v0Var.f5316c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d1 d1Var = (d1) arrayList.get(i5);
            d1Var.f5106d = -1;
            d1Var.f5109g = -1;
        }
        ArrayList arrayList2 = v0Var.f5314a;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            d1 d1Var2 = (d1) arrayList2.get(i6);
            d1Var2.f5106d = -1;
            d1Var2.f5109g = -1;
        }
        ArrayList arrayList3 = v0Var.f5315b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                d1 d1Var3 = (d1) v0Var.f5315b.get(i7);
                d1Var3.f5106d = -1;
                d1Var3.f5109g = -1;
            }
        }
    }

    public final void l(int i4, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            zIsFinished = false;
        } else {
            this.E.onRelease();
            zIsFinished = this.E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.G.onRelease();
            zIsFinished |= this.G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.F.onRelease();
            zIsFinished |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.H.onRelease();
            zIsFinished |= this.H.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            i0.e0.k(this);
        }
    }

    public final void m() {
        if (!this.f1054s || this.f1062z) {
            int i4 = l.f1962a;
            k.a("RV FullInvalidate");
            o();
            k.b();
            return;
        }
        if (this.f1026e.g()) {
            this.f1026e.getClass();
            if (this.f1026e.g()) {
                int i5 = l.f1962a;
                k.a("RV FullInvalidate");
                o();
                k.b();
            }
        }
    }

    public final void n(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.v0.f2983a;
        setMeasuredDimension(o0.g(i4, paddingRight, i0.e0.e(this)), o0.g(i5, getPaddingBottom() + getPaddingTop(), i0.e0.d(this)));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0315  */
    /* JADX WARN: Code duplicated, block: B:171:0x0359  */
    /* JADX WARN: Code duplicated, block: B:173:0x035c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0371  */
    /* JADX WARN: Code duplicated, block: B:181:0x0379  */
    /* JADX WARN: Code duplicated, block: B:184:0x037e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0386  */
    /* JADX WARN: Code duplicated, block: B:190:0x038d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0397 A[LOOP:4: B:186:0x0384->B:193:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b2 A[LOOP:5: B:195:0x039f->B:202:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:234:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03b5 A[EDGE_INSN: B:238:0x03b5->B:203:0x03b5 BREAK  A[LOOP:5: B:195:0x039f->B:202:0x03b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [y0.d1] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void o() {
        View view;
        long j4;
        ?? r12;
        int i4;
        int iB;
        int i5;
        int iMin;
        d1 d1VarE;
        View view2;
        d1 d1VarE2;
        View view3;
        int i6;
        View viewFindViewById;
        ArrayList arrayList;
        View view4;
        boolean z4;
        k0 k0Var;
        int i7;
        if (this.f1040l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1042m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        a1 a1Var = this.f1025d0;
        boolean z5 = false;
        a1Var.f5070i = false;
        if (a1Var.f5065d == 1) {
            p();
            this.f1042m.n0(this);
            q();
        } else {
            b bVar = this.f1026e;
            if ((bVar.f5078c.isEmpty() || bVar.f5077b.isEmpty()) && this.f1042m.f5241n == getWidth() && this.f1042m.f5242o == getHeight()) {
                this.f1042m.n0(this);
            } else {
                this.f1042m.n0(this);
                q();
            }
        }
        a1Var.a(4);
        c0();
        P();
        a1Var.f5065d = 1;
        boolean z6 = a1Var.f5071j;
        Long l4 = null;
        v0 v0Var = this.f1022c;
        b0 b0Var = this.f1030g;
        if (z6) {
            int iE = this.f1028f.e() - 1;
            while (iE >= 0) {
                d1 d1VarI = I(this.f1028f.d(iE));
                if (!d1VarI.q()) {
                    long jG = G(d1VarI);
                    this.I.getClass();
                    k0 k0Var2 = new k0();
                    k0Var2.a(d1VarI);
                    d1 d1Var = (d1) ((e) b0Var.f3156d).d(jG, l4);
                    if (d1Var == null || d1Var.q()) {
                        b0Var.d(d1VarI, k0Var2);
                    } else {
                        o1 o1Var = (o1) ((n.k) b0Var.f3155c).getOrDefault(d1Var, l4);
                        boolean z7 = (o1Var == null || (o1Var.f5244a & 1) == 0) ? z5 : true;
                        o1 o1Var2 = (o1) ((n.k) b0Var.f3155c).getOrDefault(d1VarI, l4);
                        boolean z8 = (o1Var2 == null || (o1Var2.f5244a & 1) == 0) ? false : true;
                        if (z7 && d1Var == d1VarI) {
                            b0Var.d(d1VarI, k0Var2);
                        } else {
                            k0 k0VarN = b0Var.n(d1Var, 4);
                            b0Var.d(d1VarI, k0Var2);
                            k0 k0VarN2 = b0Var.n(d1VarI, 8);
                            if (k0VarN == null) {
                                int iE2 = this.f1028f.e();
                                for (int i8 = 0; i8 < iE2; i8++) {
                                    d1 d1VarI2 = I(this.f1028f.d(i8));
                                    if (d1VarI2 != d1VarI && G(d1VarI2) == jG) {
                                        g0 g0Var = this.f1040l;
                                        if (g0Var == null || !g0Var.f5142b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d1VarI2 + " \n View Holder 2:" + d1VarI + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d1VarI2 + " \n View Holder 2:" + d1VarI + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d1Var + " cannot be found but it is necessary for " + d1VarI + y());
                            } else {
                                d1Var.p(false);
                                if (z7) {
                                    f(d1Var);
                                }
                                if (d1Var != d1VarI) {
                                    if (z8) {
                                        f(d1VarI);
                                    }
                                    d1Var.f5110h = d1VarI;
                                    f(d1Var);
                                    v0Var.k(d1Var);
                                    d1VarI.p(false);
                                    d1VarI.f5111i = d1Var;
                                }
                                if (this.I.a(d1Var, d1VarI, k0VarN, k0VarN2)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                iE--;
                z5 = false;
                l4 = null;
            }
            for (int i9 = ((n.k) b0Var.f3155c).f3524d - 1; i9 >= 0; i9--) {
                d1 d1Var2 = (d1) ((n.k) b0Var.f3155c).h(i9);
                o1 o1Var3 = (o1) ((n.k) b0Var.f3155c).i(i9);
                int i10 = o1Var3.f5244a;
                int i11 = i10 & 3;
                f0 f0Var = this.f1055s0;
                if (i11 == 3) {
                    RecyclerView recyclerView = f0Var.f5132a;
                    recyclerView.f1042m.g0(d1Var2.f5103a, recyclerView.f1022c);
                } else if ((i10 & 1) != 0) {
                    k0 k0Var3 = o1Var3.f5245b;
                    if (k0Var3 == null) {
                        RecyclerView recyclerView2 = f0Var.f5132a;
                        recyclerView2.f1042m.g0(d1Var2.f5103a, recyclerView2.f1022c);
                    } else {
                        f0Var.g(d1Var2, k0Var3, o1Var3.f5246c);
                    }
                } else if ((i10 & 14) == 14) {
                    f0Var.f(d1Var2, o1Var3.f5245b, o1Var3.f5246c);
                } else {
                    if ((i10 & 12) == 12) {
                        k0 k0Var4 = o1Var3.f5245b;
                        k0 k0Var5 = o1Var3.f5246c;
                        f0Var.getClass();
                        d1Var2.p(false);
                        RecyclerView recyclerView3 = f0Var.f5132a;
                        if (!recyclerView3.f1062z) {
                            y0.k kVar = (y0.k) recyclerView3.I;
                            kVar.getClass();
                            int i12 = k0Var4.f5186a;
                            int i13 = k0Var5.f5186a;
                            if (i12 == i13 && k0Var4.f5187b == k0Var5.f5187b) {
                                kVar.c(d1Var2);
                            } else if (kVar.g(d1Var2, i12, k0Var4.f5187b, i13, k0Var5.f5187b)) {
                                recyclerView3.S();
                            }
                        } else if (recyclerView3.I.a(d1Var2, d1Var2, k0Var4, k0Var5)) {
                            recyclerView3.S();
                        }
                    } else {
                        if ((i10 & 4) != 0) {
                            k0Var = null;
                            f0Var.g(d1Var2, o1Var3.f5245b, null);
                        } else {
                            k0Var = null;
                            if ((i10 & 8) != 0) {
                                f0Var.f(d1Var2, o1Var3.f5245b, o1Var3.f5246c);
                            }
                        }
                        i7 = 0;
                    }
                    o1Var3.f5244a = i7;
                    o1Var3.f5245b = k0Var;
                    o1Var3.f5246c = k0Var;
                    o1.f5243d.b(o1Var3);
                }
                i7 = 0;
                k0Var = null;
                o1Var3.f5244a = i7;
                o1Var3.f5245b = k0Var;
                o1Var3.f5246c = k0Var;
                o1.f5243d.b(o1Var3);
            }
            view = null;
        } else {
            view = null;
        }
        this.f1042m.f0(v0Var);
        a1Var.f5063b = a1Var.f5066e;
        this.f1062z = false;
        this.A = false;
        a1Var.f5071j = false;
        a1Var.f5072k = false;
        this.f1042m.f5233f = false;
        ArrayList arrayList2 = v0Var.f5315b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        o0 o0Var = this.f1042m;
        if (o0Var.f5238k) {
            o0Var.f5237j = 0;
            o0Var.f5238k = false;
            v0Var.l();
        }
        this.f1042m.a0(a1Var);
        Q(true);
        d0(false);
        b0Var.f();
        int[] iArr = this.f1041l0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        C(iArr);
        if (iArr[0] != i14 || iArr[1] != i15) {
            t(0, 0);
        }
        if (this.W && this.f1040l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j4 = a1Var.f5074m;
                if (j4 == -1) {
                    r12 = view;
                } else {
                    r12 = view;
                }
                if (r12 != 0) {
                    arrayList = this.f1028f.f5097c;
                    view4 = r12.f5103a;
                    if (!arrayList.contains(view4)) {
                        if (this.f1028f.e() > 0) {
                            i4 = a1Var.f5073l;
                            if (i4 == -1) {
                                i4 = 0;
                            }
                            iB = a1Var.b();
                            i5 = i4;
                            while (true) {
                                if (i5 < iB) {
                                    d1VarE2 = E(i5);
                                    if (d1VarE2 != null) {
                                        view3 = d1VarE2.f5103a;
                                        if (view3.hasFocusable()) {
                                            view = view3;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i4) - 1; iMin >= 0; iMin--) {
                                    d1VarE = E(iMin);
                                    if (d1VarE == null) {
                                        break;
                                        break;
                                    }
                                    view2 = d1VarE.f5103a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f1028f.e() > 0) {
                        i4 = a1Var.f5073l;
                        if (i4 == -1) {
                            i4 = 0;
                        }
                        iB = a1Var.b();
                        i5 = i4;
                        while (true) {
                            if (i5 < iB) {
                                d1VarE2 = E(i5);
                                if (d1VarE2 != null) {
                                    view3 = d1VarE2.f5103a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                d1VarE = E(iMin);
                                if (d1VarE == null) {
                                    break;
                                    break;
                                }
                                view2 = d1VarE.f5103a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1028f.e() > 0) {
                    i4 = a1Var.f5073l;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    iB = a1Var.b();
                    i5 = i4;
                    while (true) {
                        if (i5 < iB) {
                            d1VarE2 = E(i5);
                            if (d1VarE2 != null) {
                                view3 = d1VarE2.f5103a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            d1VarE = E(iMin);
                            if (d1VarE == null) {
                                break;
                                break;
                            }
                            view2 = d1VarE.f5103a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i6 = a1Var.f5075n;
                    if (i6 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f1028f.f5097c.contains(getFocusedChild())) {
                j4 = a1Var.f5074m;
                if (j4 == -1 && (z4 = this.f1040l.f5142b) && z4) {
                    int iH = this.f1028f.h();
                    r12 = view;
                    int i16 = 0;
                    while (i16 < iH) {
                        d1 d1VarI3 = I(this.f1028f.g(i16));
                        if (d1VarI3 != null && !d1VarI3.j() && d1VarI3.f5107e == j4) {
                            if (!this.f1028f.f5097c.contains(d1VarI3.f5103a)) {
                                r12 = d1VarI3;
                                break;
                            }
                            r12 = d1VarI3;
                        }
                        i16++;
                        r12 = r12;
                    }
                } else {
                    r12 = view;
                }
                if (r12 != 0) {
                    arrayList = this.f1028f.f5097c;
                    view4 = r12.f5103a;
                    if (!arrayList.contains(view4) && view4.hasFocusable()) {
                        view = view4;
                    } else if (this.f1028f.e() > 0) {
                        i4 = a1Var.f5073l;
                        if (i4 == -1) {
                            i4 = 0;
                        }
                        iB = a1Var.b();
                        i5 = i4;
                        while (true) {
                            if (i5 < iB) {
                                d1VarE2 = E(i5);
                                if (d1VarE2 != null) {
                                    view3 = d1VarE2.f5103a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                d1VarE = E(iMin);
                                if (d1VarE == null) {
                                    break;
                                }
                                view2 = d1VarE.f5103a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1028f.e() > 0) {
                    i4 = a1Var.f5073l;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    iB = a1Var.b();
                    i5 = i4;
                    while (true) {
                        if (i5 < iB) {
                            d1VarE2 = E(i5);
                            if (d1VarE2 != null) {
                                view3 = d1VarE2.f5103a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            d1VarE = E(iMin);
                            if (d1VarE == null) {
                                break;
                                break;
                            }
                            view2 = d1VarE.f5103a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i6 = a1Var.f5075n;
                    if (i6 != -1 && (viewFindViewById = view.findViewById(i6)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        a1Var.f5074m = -1L;
        a1Var.f5073l = -1;
        a1Var.f5075n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.B = 0;
        this.f1050q = true;
        this.f1054s = this.f1054s && !isLayoutRequested();
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            o0Var.f5234g = true;
            o0Var.O(this);
        }
        this.f1037j0 = false;
        ThreadLocal threadLocal = s.f5286f;
        s sVar = (s) threadLocal.get();
        this.f1021b0 = sVar;
        if (sVar == null) {
            s sVar2 = new s();
            sVar2.f5288b = new ArrayList();
            sVar2.f5291e = new ArrayList();
            this.f1021b0 = sVar2;
            WeakHashMap weakHashMap = i0.v0.f2983a;
            Display displayB = i0.f0.b(this);
            if (isInEditMode() || displayB == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = displayB.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            s sVar3 = this.f1021b0;
            sVar3.f5290d = (long) (1.0E9f / refreshRate);
            threadLocal.set(sVar3);
        }
        this.f1021b0.f5288b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z zVar;
        super.onDetachedFromWindow();
        l0 l0Var = this.I;
        if (l0Var != null) {
            l0Var.e();
        }
        setScrollState(0);
        c1 c1Var = this.f1019a0;
        c1Var.f5094h.removeCallbacks(c1Var);
        c1Var.f5090d.abortAnimation();
        o0 o0Var = this.f1042m;
        if (o0Var != null && (zVar = o0Var.f5232e) != null) {
            zVar.i();
        }
        this.f1050q = false;
        o0 o0Var2 = this.f1042m;
        if (o0Var2 != null) {
            o0Var2.f5234g = false;
            o0Var2.P(this);
        }
        this.f1051q0.clear();
        removeCallbacks(this.f1053r0);
        this.f1030g.getClass();
        while (o1.f5243d.a() != null) {
        }
        s sVar = this.f1021b0;
        if (sVar != null) {
            sVar.f5288b.remove(this);
            this.f1021b0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1044n;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((m0) arrayList.get(i4)).a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        float axisValue;
        if (this.f1042m != null && !this.f1058v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f5 = this.f1042m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1042m.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f1042m.e()) {
                    f5 = -axisValue2;
                } else if (this.f1042m.d()) {
                    axisValue = axisValue2;
                    f5 = 0.0f;
                } else {
                    f5 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f5 = 0.0f;
                axisValue = 0.0f;
            }
            if (f5 != 0.0f || axisValue != 0.0f) {
                Y((int) (axisValue * this.U), (int) (f5 * this.V), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f1058v) {
            return false;
        }
        this.f1048p = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        o0 o0Var = this.f1042m;
        if (o0Var == null) {
            return false;
        }
        boolean zD = o0Var.d();
        boolean zE = this.f1042m.e();
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1059w) {
                this.f1059w = false;
            }
            this.K = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.O = x4;
            this.M = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.P = y4;
            this.N = y4;
            if (this.J == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f1047o0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = zD;
            if (zE) {
                i4 = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i4, 0);
        } else if (actionMasked == 1) {
            this.L.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.K);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.K + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.J != 1) {
                int i5 = x5 - this.M;
                int i6 = y5 - this.N;
                if (!zD || Math.abs(i5) <= this.Q) {
                    z4 = false;
                } else {
                    this.O = x5;
                    z4 = true;
                }
                if (zE && Math.abs(i6) > this.Q) {
                    this.P = y5;
                } else if (z4) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.K = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.O = x6;
            this.M = x6;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.P = y6;
            this.N = y6;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.J == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8 = l.f1962a;
        k.a("RV OnLayout");
        o();
        k.b();
        this.f1054s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        o0 o0Var = this.f1042m;
        if (o0Var == null) {
            n(i4, i5);
            return;
        }
        boolean zJ = o0Var.J();
        a1 a1Var = this.f1025d0;
        if (!zJ) {
            if (this.f1052r) {
                this.f1042m.f5229b.n(i4, i5);
                return;
            }
            if (a1Var.f5072k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g0 g0Var = this.f1040l;
            if (g0Var != null) {
                a1Var.f5066e = g0Var.a();
            } else {
                a1Var.f5066e = 0;
            }
            c0();
            this.f1042m.f5229b.n(i4, i5);
            d0(false);
            a1Var.f5068g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f1042m.f5229b.n(i4, i5);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1040l == null) {
            return;
        }
        if (a1Var.f5065d == 1) {
            p();
        }
        this.f1042m.o0(i4, i5);
        a1Var.f5070i = true;
        q();
        this.f1042m.q0(i4, i5);
        if (this.f1042m.t0()) {
            this.f1042m.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            a1Var.f5070i = true;
            q();
            this.f1042m.q0(i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x0 x0Var = (x0) parcelable;
        this.f1024d = x0Var;
        super.onRestoreInstanceState(x0Var.f3594b);
        o0 o0Var = this.f1042m;
        if (o0Var == null || (parcelable2 = this.f1024d.f5338d) == null) {
            return;
        }
        o0Var.b0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x0 x0Var = new x0(super.onSaveInstanceState());
        x0 x0Var2 = this.f1024d;
        if (x0Var2 != null) {
            x0Var.f5338d = x0Var2.f5338d;
        } else {
            o0 o0Var = this.f1042m;
            if (o0Var != null) {
                x0Var.f5338d = o0Var.c0();
            } else {
                x0Var.f5338d = null;
            }
        }
        return x0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.H = null;
        this.F = null;
        this.G = null;
        this.E = null;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x024f  */
    /* JADX WARN: Code duplicated, block: B:209:0x030e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0314  */
    /* JADX WARN: Code duplicated, block: B:215:0x0344  */
    /* JADX WARN: Code duplicated, block: B:217:0x0366  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb A[PHI: r0
      0x00eb: PHI (r0v58 int) = (r0v45 int), (r0v62 int) binds: [B:44:0x00d4, B:48:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        boolean z4;
        int i4;
        RecyclerView recyclerView2;
        int i5;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        RecyclerView recyclerView3;
        c1 c1Var;
        RecyclerView recyclerView4;
        Interpolator interpolator;
        d dVar;
        int minFlingVelocity;
        boolean z5;
        y0.b0 b0VarD;
        int iF;
        PointF pointFA;
        int i6;
        boolean z6;
        int i7 = 0;
        if (this.f1058v || this.f1059w) {
            return false;
        }
        r0 r0Var = this.f1048p;
        if (r0Var != null) {
            recyclerView = this;
            p pVar = (p) r0Var;
            if (pVar.f5268v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zD = pVar.d(motionEvent.getX(), motionEvent.getY());
                    boolean zC = pVar.c(motionEvent.getX(), motionEvent.getY());
                    if (zD || zC) {
                        if (zC) {
                            pVar.f5269w = 1;
                            pVar.f5262p = (int) motionEvent.getX();
                        } else {
                            if (zD) {
                                i4 = 2;
                                pVar.f5269w = 2;
                                pVar.f5259m = (int) motionEvent.getY();
                            }
                            pVar.f(i4);
                        }
                        i4 = 2;
                        pVar.f(i4);
                    }
                } else if (motionEvent.getAction() == 1 && pVar.f5268v == 2) {
                    pVar.f5259m = 0.0f;
                    pVar.f5262p = 0.0f;
                    pVar.f(1);
                    pVar.f5269w = 0;
                } else if (motionEvent.getAction() == 2 && pVar.f5268v == 2) {
                    pVar.g();
                    int i8 = pVar.f5269w;
                    int i9 = pVar.f5248b;
                    if (i8 == 1) {
                        float x4 = motionEvent.getX();
                        int[] iArr = pVar.f5271y;
                        iArr[0] = i9;
                        int i10 = pVar.f5263q - i9;
                        iArr[1] = i10;
                        float fMax = Math.max(i9, Math.min(i10, x4));
                        if (Math.abs(pVar.f5261o - fMax) >= 2.0f) {
                            int iE = p.e(pVar.f5262p, fMax, iArr, pVar.f5265s.computeHorizontalScrollRange(), pVar.f5265s.computeHorizontalScrollOffset(), pVar.f5263q);
                            if (iE != 0) {
                                pVar.f5265s.scrollBy(iE, 0);
                            }
                            pVar.f5262p = fMax;
                        }
                    }
                    if (pVar.f5269w == 2) {
                        float y4 = motionEvent.getY();
                        int[] iArr2 = pVar.f5270x;
                        iArr2[0] = i9;
                        int i11 = pVar.f5264r - i9;
                        iArr2[1] = i11;
                        float fMax2 = Math.max(i9, Math.min(i11, y4));
                        if (Math.abs(pVar.f5258l - fMax2) >= 2.0f) {
                            int iE2 = p.e(pVar.f5259m, fMax2, iArr2, pVar.f5265s.computeVerticalScrollRange(), pVar.f5265s.computeVerticalScrollOffset(), pVar.f5264r);
                            if (iE2 != 0) {
                                pVar.f5265s.scrollBy(0, iE2);
                            }
                            pVar.f5259m = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            z4 = true;
            if (action == 3 || action == 1) {
                recyclerView.f1048p = null;
            }
        } else {
            if (motionEvent.getAction() == 0 || !B(motionEvent)) {
                o0 o0Var = this.f1042m;
                if (o0Var == null) {
                    return false;
                }
                boolean zD2 = o0Var.d();
                boolean zE = this.f1042m.e();
                if (this.L == null) {
                    this.L = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f1047o0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int iFindPointerIndex = motionEvent.findPointerIndex(this.K);
                            if (iFindPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.K + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            int iMax = this.O - x5;
                            int iMax2 = this.P - y5;
                            if (this.J != 1) {
                                if (zD2) {
                                    iMax = iMax > 0 ? Math.max(0, iMax - this.Q) : Math.min(0, iMax + this.Q);
                                    if (iMax != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                } else {
                                    z6 = false;
                                }
                                if (zE) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.Q) : Math.min(0, iMax2 + this.Q);
                                    if (iMax2 != 0) {
                                        z6 = true;
                                    }
                                }
                                if (z6) {
                                    setScrollState(1);
                                }
                            }
                            int i12 = iMax;
                            int i13 = iMax2;
                            if (this.J == 1) {
                                int[] iArr4 = this.f1049p0;
                                iArr4[0] = 0;
                                iArr4[1] = 0;
                                boolean zR = r(zD2 ? i12 : 0, zE ? i13 : 0, iArr4, this.f1045n0, 0);
                                int[] iArr5 = this.f1045n0;
                                if (zR) {
                                    i12 -= iArr4[0];
                                    i13 -= iArr4[1];
                                    iArr3[0] = iArr3[0] + iArr5[0];
                                    iArr3[1] = iArr3[1] + iArr5[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i14 = i12;
                                int i15 = i13;
                                this.O = x5 - iArr5[0];
                                this.P = y5 - iArr5[1];
                                if (Y(zD2 ? i14 : 0, zE ? i15 : 0, motionEvent)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                s sVar = this.f1021b0;
                                if (sVar != null && (i14 != 0 || i15 != 0)) {
                                    sVar.a(this, i14, i15);
                                }
                            }
                        } else if (actionMasked == 3) {
                            X();
                            setScrollState(0);
                        } else if (actionMasked == 5) {
                            this.K = motionEvent.getPointerId(actionIndex);
                            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.O = x6;
                            this.M = x6;
                            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.P = y6;
                            this.N = y6;
                        } else if (actionMasked == 6) {
                            R(motionEvent);
                        }
                        recyclerView2 = this;
                    } else {
                        this.L.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.L;
                        int i16 = this.T;
                        velocityTracker.computeCurrentVelocity(1000, i16);
                        float f5 = zD2 ? -this.L.getXVelocity(this.K) : 0.0f;
                        float f6 = zE ? -this.L.getYVelocity(this.K) : 0.0f;
                        if (f5 == 0.0f && f6 == 0.0f) {
                            recyclerView3 = this;
                            i6 = 0;
                            motionEvent3 = motionEventObtain;
                        } else {
                            int i17 = (int) f5;
                            int i18 = (int) f6;
                            o0 o0Var2 = this.f1042m;
                            if (o0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else {
                                if (!this.f1058v) {
                                    int iD = o0Var2.d();
                                    boolean zE2 = this.f1042m.e();
                                    int i19 = this.S;
                                    if (iD == 0 || Math.abs(i17) < i19) {
                                        i17 = 0;
                                    }
                                    if (!zE2 || Math.abs(i18) < i19) {
                                        i18 = 0;
                                    }
                                    if (i17 != 0 || i18 != 0) {
                                        float f7 = i17;
                                        float f8 = i18;
                                        if (!dispatchNestedPreFling(f7, f8)) {
                                            boolean z7 = iD != 0 || zE2;
                                            dispatchNestedFling(f7, f8, z7);
                                            q0 q0Var = this.R;
                                            if (q0Var != null) {
                                                d0 d0Var = (d0) q0Var;
                                                o0 layoutManager = d0Var.f5098a.getLayoutManager();
                                                if (layoutManager == 0 || d0Var.f5098a.getAdapter() == null || ((Math.abs(i18) <= (minFlingVelocity = d0Var.f5098a.getMinFlingVelocity()) && Math.abs(i17) <= minFlingVelocity) || !((z5 = layoutManager instanceof z0)))) {
                                                    motionEvent3 = motionEventObtain;
                                                    if (z7) {
                                                        if (zE2) {
                                                            iD = (iD == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().h(iD, 1);
                                                        int i20 = -i16;
                                                        int iMax3 = Math.max(i20, Math.min(i17, i16));
                                                        int iMax4 = Math.max(i20, Math.min(i18, i16));
                                                        c1Var = this.f1019a0;
                                                        recyclerView4 = c1Var.f5094h;
                                                        recyclerView4.setScrollState(2);
                                                        c1Var.f5089c = 0;
                                                        c1Var.f5088b = 0;
                                                        interpolator = c1Var.f5091e;
                                                        dVar = f1018v0;
                                                        if (interpolator != dVar) {
                                                            c1Var.f5091e = dVar;
                                                            c1Var.f5090d = new OverScroller(recyclerView4.getContext(), dVar);
                                                        }
                                                        c1Var.f5090d.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        c1Var.a();
                                                    } else {
                                                        recyclerView3 = this;
                                                    }
                                                } else {
                                                    c0 c0Var = !z5 ? null : new c0(d0Var, d0Var.f5098a.getContext(), i7);
                                                    if (c0Var == null) {
                                                        motionEvent3 = motionEventObtain;
                                                    } else {
                                                        int iZ = layoutManager.z();
                                                        if (iZ != 0) {
                                                            if (layoutManager.e()) {
                                                                b0VarD = d0Var.e(layoutManager);
                                                            } else {
                                                                b0VarD = layoutManager.d() ? d0Var.d(layoutManager) : null;
                                                            }
                                                            if (b0VarD == null) {
                                                                motionEvent3 = motionEventObtain;
                                                            } else {
                                                                int iV = layoutManager.v();
                                                                motionEvent3 = motionEventObtain;
                                                                int i21 = Integer.MIN_VALUE;
                                                                int i22 = Integer.MAX_VALUE;
                                                                int i23 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i23 < iV) {
                                                                    int i24 = iV;
                                                                    View viewU = layoutManager.u(i23);
                                                                    if (viewU != null) {
                                                                        int iB = d0.b(viewU, b0VarD);
                                                                        if (iB <= 0 && iB > i21) {
                                                                            i21 = iB;
                                                                            view2 = viewU;
                                                                        }
                                                                        if (iB >= 0 && iB < i22) {
                                                                            i22 = iB;
                                                                            view = viewU;
                                                                        }
                                                                    }
                                                                    i23++;
                                                                    iV = i24;
                                                                }
                                                                boolean z8 = !layoutManager.d() ? i18 <= 0 : i17 <= 0;
                                                                if (z8 && view != null) {
                                                                    iF = o0.F(view);
                                                                } else if (z8 || view2 == null) {
                                                                    if (z8) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        int iF2 = ((z5 && (pointFA = ((z0) layoutManager).a(layoutManager.z() - 1)) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == z8 ? -1 : 1) + o0.F(view);
                                                                        if (iF2 >= 0 && iF2 < iZ) {
                                                                            iF = iF2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    iF = o0.F(view2);
                                                                }
                                                            }
                                                            iF = -1;
                                                        } else {
                                                            motionEvent3 = motionEventObtain;
                                                            iF = -1;
                                                        }
                                                        if (iF != -1) {
                                                            c0Var.f5349a = iF;
                                                            layoutManager.w0(c0Var);
                                                        }
                                                    }
                                                    if (z7) {
                                                        if (zE2) {
                                                            iD = (iD == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().h(iD, 1);
                                                        int i25 = -i16;
                                                        int iMax5 = Math.max(i25, Math.min(i17, i16));
                                                        int iMax6 = Math.max(i25, Math.min(i18, i16));
                                                        c1Var = this.f1019a0;
                                                        recyclerView4 = c1Var.f5094h;
                                                        recyclerView4.setScrollState(2);
                                                        c1Var.f5089c = 0;
                                                        c1Var.f5088b = 0;
                                                        interpolator = c1Var.f5091e;
                                                        dVar = f1018v0;
                                                        if (interpolator != dVar) {
                                                            c1Var.f5091e = dVar;
                                                            c1Var.f5090d = new OverScroller(recyclerView4.getContext(), dVar);
                                                        }
                                                        c1Var.f5090d.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        c1Var.a();
                                                    } else {
                                                        recyclerView3 = this;
                                                    }
                                                }
                                            } else {
                                                motionEvent3 = motionEventObtain;
                                                if (z7) {
                                                    if (zE2) {
                                                        iD = (iD == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().h(iD, 1);
                                                    int i26 = -i16;
                                                    int iMax7 = Math.max(i26, Math.min(i17, i16));
                                                    int iMax8 = Math.max(i26, Math.min(i18, i16));
                                                    c1Var = this.f1019a0;
                                                    recyclerView4 = c1Var.f5094h;
                                                    recyclerView4.setScrollState(2);
                                                    c1Var.f5089c = 0;
                                                    c1Var.f5088b = 0;
                                                    interpolator = c1Var.f5091e;
                                                    dVar = f1018v0;
                                                    if (interpolator != dVar) {
                                                        c1Var.f5091e = dVar;
                                                        c1Var.f5090d = new OverScroller(recyclerView4.getContext(), dVar);
                                                    }
                                                    c1Var.f5090d.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                    c1Var.a();
                                                } else {
                                                    recyclerView3 = this;
                                                }
                                            }
                                        }
                                        i6 = 0;
                                    }
                                }
                                X();
                                motionEvent2 = motionEvent3;
                            }
                            recyclerView3 = this;
                            motionEvent3 = motionEventObtain;
                            i6 = 0;
                        }
                        recyclerView3.setScrollState(i6);
                        X();
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent2.recycle();
                    return true;
                }
                recyclerView2 = this;
                recyclerView2.K = motionEvent.getPointerId(0);
                int x7 = (int) (motionEvent.getX() + 0.5f);
                recyclerView2.O = x7;
                recyclerView2.M = x7;
                int y7 = (int) (motionEvent.getY() + 0.5f);
                recyclerView2.P = y7;
                recyclerView2.N = y7;
                if (zE) {
                    i5 = zD2;
                    i5 = (zD2 ? 1 : 0) | 2;
                }
                i5 = zD2;
                getScrollingChildHelper().h(i5, 0);
                motionEvent2 = motionEventObtain;
                recyclerView2.L.addMovement(motionEvent2);
                motionEvent2.recycle();
                return true;
            }
            recyclerView = this;
            z4 = true;
        }
        X();
        recyclerView.setScrollState(0);
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    public final void p() {
        View viewA;
        int iF;
        o1 o1Var;
        a1 a1Var = this.f1025d0;
        a1Var.a(1);
        z(a1Var);
        a1Var.f5070i = false;
        c0();
        b0 b0Var = this.f1030g;
        b0Var.f();
        P();
        T();
        View focusedChild = (this.W && hasFocus() && this.f1040l != null) ? getFocusedChild() : null;
        d1 d1VarH = (focusedChild == null || (viewA = A(focusedChild)) == null) ? null : H(viewA);
        if (d1VarH == null) {
            a1Var.f5074m = -1L;
            a1Var.f5073l = -1;
            a1Var.f5075n = -1;
        } else {
            a1Var.f5074m = this.f1040l.f5142b ? d1VarH.f5107e : -1L;
            if (this.f1062z) {
                iF = -1;
            } else if (d1VarH.j()) {
                iF = d1VarH.f5106d;
            } else {
                RecyclerView recyclerView = d1VarH.f5120r;
                if (recyclerView == null) {
                    iF = -1;
                } else {
                    iF = recyclerView.F(d1VarH);
                }
            }
            a1Var.f5073l = iF;
            View focusedChild2 = d1VarH.f5103a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            a1Var.f5075n = id;
        }
        a1Var.f5069h = a1Var.f5071j && this.f1033h0;
        this.f1033h0 = false;
        this.f1031g0 = false;
        a1Var.f5068g = a1Var.f5072k;
        a1Var.f5066e = this.f1040l.a();
        C(this.f1041l0);
        if (a1Var.f5071j) {
            int iE = this.f1028f.e();
            for (int i4 = 0; i4 < iE; i4++) {
                d1 d1VarI = I(this.f1028f.d(i4));
                if (!d1VarI.q() && (!d1VarI.h() || this.f1040l.f5142b)) {
                    l0 l0Var = this.I;
                    l0.b(d1VarI);
                    d1VarI.d();
                    l0Var.getClass();
                    k0 k0Var = new k0();
                    k0Var.a(d1VarI);
                    b0Var.e(d1VarI, k0Var);
                    if (a1Var.f5069h && d1VarI.m() && !d1VarI.j() && !d1VarI.q() && !d1VarI.h()) {
                        ((e) b0Var.f3156d).e(G(d1VarI), d1VarI);
                    }
                }
            }
        }
        if (a1Var.f5072k) {
            int iH = this.f1028f.h();
            for (int i5 = 0; i5 < iH; i5++) {
                d1 d1VarI2 = I(this.f1028f.g(i5));
                if (!d1VarI2.q() && d1VarI2.f5106d == -1) {
                    d1VarI2.f5106d = d1VarI2.f5105c;
                }
            }
            boolean z4 = a1Var.f5067f;
            a1Var.f5067f = false;
            this.f1042m.Z(this.f1022c, a1Var);
            a1Var.f5067f = z4;
            for (int i6 = 0; i6 < this.f1028f.e(); i6++) {
                d1 d1VarI3 = I(this.f1028f.d(i6));
                if (!d1VarI3.q() && ((o1Var = (o1) ((n.k) b0Var.f3155c).getOrDefault(d1VarI3, null)) == null || (o1Var.f5244a & 4) == 0)) {
                    l0.b(d1VarI3);
                    boolean zE = d1VarI3.e(8192);
                    l0 l0Var2 = this.I;
                    d1VarI3.d();
                    l0Var2.getClass();
                    k0 k0Var2 = new k0();
                    k0Var2.a(d1VarI3);
                    if (zE) {
                        V(d1VarI3, k0Var2);
                    } else {
                        o1 o1VarA = (o1) ((n.k) b0Var.f3155c).getOrDefault(d1VarI3, null);
                        if (o1VarA == null) {
                            o1VarA = o1.a();
                            ((n.k) b0Var.f3155c).put(d1VarI3, o1VarA);
                        }
                        o1VarA.f5244a |= 2;
                        o1VarA.f5245b = k0Var2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        d0(false);
        a1Var.f5065d = 2;
    }

    public final void q() {
        c0();
        P();
        a1 a1Var = this.f1025d0;
        a1Var.a(6);
        this.f1026e.c();
        a1Var.f5066e = this.f1040l.a();
        a1Var.f5064c = 0;
        a1Var.f5068g = false;
        this.f1042m.Z(this.f1022c, a1Var);
        a1Var.f5067f = false;
        this.f1024d = null;
        a1Var.f5071j = a1Var.f5071j && this.I != null;
        a1Var.f5065d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2, i6);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        d1 d1VarI = I(view);
        if (d1VarI != null) {
            if (d1VarI.l()) {
                d1VarI.f5112j &= -257;
            } else if (!d1VarI.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d1VarI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        z zVar = this.f1042m.f5232e;
        if ((zVar == null || !zVar.f5353e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f1042m.i0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f1046o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r0) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1056t != 0 || this.f1058v) {
            this.f1057u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        o0 o0Var = this.f1042m;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1058v) {
            return;
        }
        boolean zD = o0Var.d();
        boolean zE = this.f1042m.e();
        if (zD || zE) {
            if (!zD) {
                i4 = 0;
            }
            if (!zE) {
                i5 = 0;
            }
            Y(i4, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iA = accessibilityEvent != null ? j0.b.a(accessibilityEvent) : 0;
            this.f1060x |= iA != 0 ? iA : 0;
        }
    }

    public void setAccessibilityDelegateCompat(f1 f1Var) {
        this.f1039k0 = f1Var;
        i0.v0.l(this, f1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.f1040l;
        e0 e0Var = this.f1020b;
        if (g0Var2 != null) {
            g0Var2.f5141a.unregisterObserver(e0Var);
            this.f1040l.getClass();
        }
        l0 l0Var = this.I;
        if (l0Var != null) {
            l0Var.e();
        }
        o0 o0Var = this.f1042m;
        v0 v0Var = this.f1022c;
        if (o0Var != null) {
            o0Var.e0(v0Var);
            this.f1042m.f0(v0Var);
        }
        v0Var.f5314a.clear();
        v0Var.e();
        b bVar = this.f1026e;
        bVar.l(bVar.f5077b);
        bVar.l(bVar.f5078c);
        g0 g0Var3 = this.f1040l;
        this.f1040l = g0Var;
        if (g0Var != null) {
            g0Var.f5141a.registerObserver(e0Var);
        }
        g0 g0Var4 = this.f1040l;
        v0Var.f5314a.clear();
        v0Var.e();
        u0 u0VarC = v0Var.c();
        if (g0Var3 != null) {
            u0VarC.f5308b--;
        }
        if (u0VarC.f5308b == 0) {
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = u0VarC.f5307a;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                ((t0) sparseArray.valueAt(i4)).f5294a.clear();
                i4++;
            }
        }
        if (g0Var4 != null) {
            u0VarC.f5308b++;
        }
        this.f1025d0.f5067f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i0 i0Var) {
        if (i0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f1032h) {
            this.H = null;
            this.F = null;
            this.G = null;
            this.E = null;
        }
        this.f1032h = z4;
        super.setClipToPadding(z4);
        if (this.f1054s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j0 j0Var) {
        j0Var.getClass();
        this.D = j0Var;
        this.H = null;
        this.F = null;
        this.G = null;
        this.E = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f1052r = z4;
    }

    public void setItemAnimator(l0 l0Var) {
        l0 l0Var2 = this.I;
        if (l0Var2 != null) {
            l0Var2.e();
            this.I.f5202a = null;
        }
        this.I = l0Var;
        if (l0Var != null) {
            l0Var.f5202a = this.f1035i0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        v0 v0Var = this.f1022c;
        v0Var.f5318e = i4;
        v0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(o0 o0Var) {
        f0 f0Var;
        z zVar;
        if (o0Var == this.f1042m) {
            return;
        }
        setScrollState(0);
        c1 c1Var = this.f1019a0;
        c1Var.f5094h.removeCallbacks(c1Var);
        c1Var.f5090d.abortAnimation();
        o0 o0Var2 = this.f1042m;
        if (o0Var2 != null && (zVar = o0Var2.f5232e) != null) {
            zVar.i();
        }
        o0 o0Var3 = this.f1042m;
        v0 v0Var = this.f1022c;
        if (o0Var3 != null) {
            l0 l0Var = this.I;
            if (l0Var != null) {
                l0Var.e();
            }
            this.f1042m.e0(v0Var);
            this.f1042m.f0(v0Var);
            v0Var.f5314a.clear();
            v0Var.e();
            if (this.f1050q) {
                o0 o0Var4 = this.f1042m;
                o0Var4.f5234g = false;
                o0Var4.P(this);
            }
            this.f1042m.r0(null);
            this.f1042m = null;
        } else {
            v0Var.f5314a.clear();
            v0Var.e();
        }
        y0.d dVar = this.f1028f;
        dVar.f5096b.g();
        ArrayList arrayList = dVar.f5097c;
        int size = arrayList.size() - 1;
        while (true) {
            f0Var = dVar.f5095a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            f0Var.getClass();
            d1 d1VarI = I(view);
            if (d1VarI != null) {
                int i4 = d1VarI.f5118p;
                RecyclerView recyclerView = f0Var.f5132a;
                if (recyclerView.L()) {
                    d1VarI.f5119q = i4;
                    recyclerView.f1051q0.add(d1VarI);
                } else {
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    i0.e0.s(d1VarI.f5103a, i4);
                }
                d1VarI.f5118p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = f0Var.f5132a;
        int childCount = recyclerView2.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView2.getChildAt(i5);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f1042m = o0Var;
        if (o0Var != null) {
            if (o0Var.f5229b != null) {
                throw new IllegalArgumentException("LayoutManager " + o0Var + " is already attached to a RecyclerView:" + o0Var.f5229b.y());
            }
            o0Var.r0(this);
            if (this.f1050q) {
                o0 o0Var5 = this.f1042m;
                o0Var5.f5234g = true;
                o0Var5.O(this);
            }
        }
        v0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2947d) {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            i0.k0.z(scrollingChildHelper.f2946c);
        }
        scrollingChildHelper.f2947d = z4;
    }

    public void setOnFlingListener(q0 q0Var) {
        this.R = q0Var;
    }

    @Deprecated
    public void setOnScrollListener(s0 s0Var) {
        this.f1027e0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.W = z4;
    }

    public void setRecycledViewPool(u0 u0Var) {
        v0 v0Var = this.f1022c;
        u0 u0Var2 = v0Var.f5320g;
        if (u0Var2 != null) {
            u0Var2.f5308b--;
        }
        v0Var.f5320g = u0Var;
        if (u0Var == null || v0Var.f5321h.getAdapter() == null) {
            return;
        }
        v0Var.f5320g.f5308b++;
    }

    public void setRecyclerListener(w0 w0Var) {
    }

    public void setScrollState(int i4) {
        z zVar;
        if (i4 == this.J) {
            return;
        }
        this.J = i4;
        if (i4 != 2) {
            c1 c1Var = this.f1019a0;
            c1Var.f5094h.removeCallbacks(c1Var);
            c1Var.f5090d.abortAnimation();
            o0 o0Var = this.f1042m;
            if (o0Var != null && (zVar = o0Var.f5232e) != null) {
                zVar.i();
            }
        }
        o0 o0Var2 = this.f1042m;
        if (o0Var2 != null) {
            o0Var2.d0(i4);
        }
        s0 s0Var = this.f1027e0;
        if (s0Var != null) {
            s0Var.a(this, i4);
        }
        ArrayList arrayList = this.f1029f0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.f1029f0.get(size)).a(this, i4);
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.Q = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.Q = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b1 b1Var) {
        this.f1022c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        z zVar;
        if (z4 != this.f1058v) {
            i("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.f1058v = false;
                if (this.f1057u && this.f1042m != null && this.f1040l != null) {
                    requestLayout();
                }
                this.f1057u = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1058v = true;
            this.f1059w = true;
            setScrollState(0);
            c1 c1Var = this.f1019a0;
            c1Var.f5094h.removeCallbacks(c1Var);
            c1Var.f5090d.abortAnimation();
            o0 o0Var = this.f1042m;
            if (o0Var == null || (zVar = o0Var.f5232e) == null) {
                return;
            }
            zVar.i();
        }
    }

    public final void t(int i4, int i5) {
        this.C++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        s0 s0Var = this.f1027e0;
        if (s0Var != null) {
            s0Var.b(this, i4, i5);
        }
        ArrayList arrayList = this.f1029f0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.f1029f0.get(size)).b(this, i4, i5);
            }
        }
        this.C--;
    }

    public final void u() {
        if (this.H != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H = edgeEffect;
        if (this.f1032h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.E != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E = edgeEffect;
        if (this.f1032h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.G != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.f1032h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.F != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1032h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1040l + ", layout:" + this.f1042m + ", context:" + getContext();
    }

    public final void z(a1 a1Var) {
        if (getScrollState() != 2) {
            a1Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1019a0.f5090d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x03af  */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        int i5;
        char c5;
        boolean z4;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i4);
        this.f1020b = new e0(this);
        this.f1022c = new v0(this);
        this.f1030g = new b0(0);
        this.f1034i = new Rect();
        this.f1036j = new Rect();
        this.f1038k = new RectF();
        this.f1044n = new ArrayList();
        this.f1046o = new ArrayList();
        this.f1056t = 0;
        this.f1062z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = new j0();
        y0.k kVar = new y0.k();
        kVar.f5202a = null;
        kVar.f5203b = new ArrayList();
        kVar.f5204c = 120L;
        kVar.f5205d = 120L;
        kVar.f5206e = 250L;
        kVar.f5207f = 250L;
        kVar.f5174g = true;
        kVar.f5175h = new ArrayList();
        kVar.f5176i = new ArrayList();
        kVar.f5177j = new ArrayList();
        kVar.f5178k = new ArrayList();
        kVar.f5179l = new ArrayList();
        kVar.f5180m = new ArrayList();
        kVar.f5181n = new ArrayList();
        kVar.f5182o = new ArrayList();
        kVar.f5183p = new ArrayList();
        kVar.f5184q = new ArrayList();
        kVar.f5185r = new ArrayList();
        this.I = kVar;
        this.J = 0;
        this.K = -1;
        this.U = Float.MIN_VALUE;
        this.V = Float.MIN_VALUE;
        this.W = true;
        this.f1019a0 = new c1(this);
        this.f1023c0 = new q();
        a1 a1Var = new a1();
        a1Var.f5062a = -1;
        a1Var.f5063b = 0;
        a1Var.f5064c = 0;
        a1Var.f5065d = 1;
        a1Var.f5066e = 0;
        a1Var.f5067f = false;
        a1Var.f5068g = false;
        a1Var.f5069h = false;
        a1Var.f5070i = false;
        a1Var.f5071j = false;
        a1Var.f5072k = false;
        this.f1025d0 = a1Var;
        this.f1031g0 = false;
        this.f1033h0 = false;
        f0 f0Var = new f0(this);
        this.f1035i0 = f0Var;
        this.f1037j0 = false;
        this.f1041l0 = new int[2];
        this.f1045n0 = new int[2];
        this.f1047o0 = new int[2];
        this.f1049p0 = new int[2];
        this.f1051q0 = new ArrayList();
        this.f1053r0 = new y0.e0(this);
        this.f1055s0 = new f0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Q = viewConfiguration.getScaledTouchSlop();
        this.U = i0.w0.a(viewConfiguration);
        this.V = i0.w0.b(viewConfiguration);
        this.S = viewConfiguration.getScaledMinimumFlingVelocity();
        this.T = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.I.f5202a = f0Var;
        this.f1026e = new b(new f0(this));
        this.f1028f = new y0.d(new f0(this));
        WeakHashMap weakHashMap = i0.v0.f2983a;
        if (i0.m0.c(this) == 0) {
            i0.m0.m(this, 8);
        }
        if (i0.e0.c(this) == 0) {
            i0.e0.s(this, 1);
        }
        this.f1061y = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f1(this));
        int[] iArr = x0.a.f4928a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1032h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            i5 = 4;
            c5 = 2;
            new p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.shungo.app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.shungo.app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.shungo.app.R.dimen.fastscroll_margin));
        } else {
            i5 = 4;
            c5 = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (strTrim.isEmpty()) {
                z4 = true;
            } else {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1017u0);
                        Object[] objArr2 = new Object[i5];
                        objArr2[0] = context;
                        z4 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c5] = Integer.valueOf(i4);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                constructor = clsAsSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e6);
                            }
                        }
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        z4 = true;
                    }
                    constructor.setAccessible(z4);
                    setLayoutManager((o0) constructor.newInstance(objArr));
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e8);
                } catch (ClassNotFoundException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e9);
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e10);
                } catch (InstantiationException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e11);
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e12);
                }
            }
        } else {
            z4 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        int[] iArr2 = f1016t0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4, 0);
        }
        boolean z5 = typedArrayObtainStyledAttributes2.getBoolean(0, z4);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o0 o0Var = this.f1042m;
        if (o0Var != null) {
            return o0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
