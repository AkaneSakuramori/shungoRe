package com.google.android.material.sidesheet;

import a0.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.shungo.app.R;
import f2.h;
import f2.k;
import f2.l;
import g2.c;
import i0.e0;
import i0.h0;
import i0.k0;
import i0.v0;
import j0.b0;
import j0.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.e;
import r1.d;
import w.a;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g2.a f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f1519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f1520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f1521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f1522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f1526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f1528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f1533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f1534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f1536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f1539v;

    public SideSheetBehavior() {
        this.f1522e = new d(this);
        this.f1524g = true;
        this.f1525h = 5;
        this.f1528k = 0.1f;
        this.f1535r = -1;
        this.f1538u = new LinkedHashSet();
        this.f1539v = new c(this);
    }

    @Override // w.a
    public final void c(w.d dVar) {
        this.f1533p = null;
        this.f1526i = null;
    }

    @Override // w.a
    public final void e() {
        this.f1533p = null;
        this.f1526i = null;
    }

    @Override // w.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.d(view) == null) || !this.f1524g) {
            this.f1527j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1536s) != null) {
            velocityTracker.recycle();
            this.f1536s = null;
        }
        if (this.f1536s == null) {
            this.f1536s = VelocityTracker.obtain();
        }
        this.f1536s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1537t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1527j) {
            this.f1527j = false;
            return false;
        }
        return (this.f1527j || (eVar = this.f1526i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0215  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x0215, please report this as an issue */
    @Override // w.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        l lVar;
        w.d dVar;
        WeakReference weakReference;
        l lVarA;
        h hVar;
        View view2;
        WeakReference weakReference2;
        l lVarA2;
        h hVar2;
        View view3;
        int right;
        int left;
        int i5;
        int right2;
        int i6;
        View viewFindViewById;
        int i7;
        WeakHashMap weakHashMap = v0.f2983a;
        int i8 = 1;
        if (e0.b(coordinatorLayout) && !e0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int iS2 = 0;
        if (this.f1533p == null) {
            this.f1533p = new WeakReference(view);
            new a2.a(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            h hVar3 = this.f1519b;
            if (hVar3 != null) {
                e0.q(view, hVar3);
                h hVar4 = this.f1519b;
                float fI = this.f1523f;
                if (fI == -1.0f) {
                    fI = k0.i(view);
                }
                hVar4.j(fI);
            } else {
                ColorStateList colorStateList = this.f1520c;
                if (colorStateList != null) {
                    k0.q(view, colorStateList);
                }
            }
            int i9 = this.f1525h == 5 ? 4 : 0;
            if (view.getVisibility() != i9) {
                view.setVisibility(i9);
            }
            u();
            if (e0.c(view) == 0) {
                e0.s(view, 1);
            }
            if (v0.d(view) == null) {
                v0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i10 = Gravity.getAbsoluteGravity(((w.d) view.getLayoutParams()).f4821c, i4) == 3 ? 1 : 0;
        g2.a aVar = this.f1518a;
        if (aVar != null) {
            switch (aVar.f2312j) {
                case 0:
                    i7 = 1;
                    break;
                default:
                    i7 = 0;
                    break;
            }
            if (i7 != i10) {
                lVar = this.f1521d;
                dVar = null;
                if (i10 == 0) {
                    this.f1518a = new g2.a(this, i8);
                    if (lVar != null) {
                        weakReference2 = this.f1533p;
                        if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof w.d)) {
                            dVar = (w.d) view3.getLayoutParams();
                        }
                        if (dVar != null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                            k kVarE = lVar.e();
                            kVarE.f2085f = new f2.a(0.0f);
                            kVarE.f2086g = new f2.a(0.0f);
                            lVarA2 = kVarE.a();
                            hVar2 = this.f1519b;
                            if (hVar2 != null) {
                                hVar2.setShapeAppearanceModel(lVarA2);
                            }
                        }
                    }
                } else {
                    if (i10 == 1) {
                        throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
                    }
                    this.f1518a = new g2.a(this, iS2);
                    if (lVar != null) {
                        weakReference = this.f1533p;
                        if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof w.d)) {
                            dVar = (w.d) view2.getLayoutParams();
                        }
                        if (dVar != null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                            k kVarE2 = lVar.e();
                            kVarE2.f2084e = new f2.a(0.0f);
                            kVarE2.f2087h = new f2.a(0.0f);
                            lVarA = kVarE2.a();
                            hVar = this.f1519b;
                            if (hVar != null) {
                                hVar.setShapeAppearanceModel(lVarA);
                            }
                        }
                    }
                }
            }
        } else {
            lVar = this.f1521d;
            dVar = null;
            if (i10 == 0) {
                this.f1518a = new g2.a(this, i8);
                if (lVar != null) {
                    weakReference2 = this.f1533p;
                    if (weakReference2 != null) {
                        dVar = (w.d) view3.getLayoutParams();
                    }
                    if (dVar != null) {
                        k kVarE3 = lVar.e();
                        kVarE3.f2085f = new f2.a(0.0f);
                        kVarE3.f2086g = new f2.a(0.0f);
                        lVarA2 = kVarE3.a();
                        hVar2 = this.f1519b;
                        if (hVar2 != null) {
                            hVar2.setShapeAppearanceModel(lVarA2);
                        }
                    } else {
                        k kVarE4 = lVar.e();
                        kVarE4.f2085f = new f2.a(0.0f);
                        kVarE4.f2086g = new f2.a(0.0f);
                        lVarA2 = kVarE4.a();
                        hVar2 = this.f1519b;
                        if (hVar2 != null) {
                            hVar2.setShapeAppearanceModel(lVarA2);
                        }
                    }
                }
            } else {
                if (i10 == 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
                }
                this.f1518a = new g2.a(this, iS2);
                if (lVar != null) {
                    weakReference = this.f1533p;
                    if (weakReference != null) {
                        dVar = (w.d) view2.getLayoutParams();
                    }
                    if (dVar != null) {
                        k kVarE5 = lVar.e();
                        kVarE5.f2084e = new f2.a(0.0f);
                        kVarE5.f2087h = new f2.a(0.0f);
                        lVarA = kVarE5.a();
                        hVar = this.f1519b;
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(lVarA);
                        }
                    } else {
                        k kVarE6 = lVar.e();
                        kVarE6.f2084e = new f2.a(0.0f);
                        kVarE6.f2087h = new f2.a(0.0f);
                        lVarA = kVarE6.a();
                        hVar = this.f1519b;
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(lVarA);
                        }
                    }
                }
            }
        }
        if (this.f1526i == null) {
            this.f1526i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1539v);
        }
        g2.a aVar2 = this.f1518a;
        int i11 = aVar2.f2312j;
        SideSheetBehavior sideSheetBehavior = aVar2.f2313k;
        switch (i11) {
            case 0:
                right = view.getRight() + sideSheetBehavior.f1532o;
                break;
            default:
                right = view.getLeft() - sideSheetBehavior.f1532o;
                break;
        }
        coordinatorLayout.q(view, i4);
        this.f1530m = coordinatorLayout.getWidth();
        switch (this.f1518a.f2312j) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.f1531n = left;
        this.f1529l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f1518a.f2312j) {
                case 0:
                    i5 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i5 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.f1532o = i5;
        int i12 = this.f1525h;
        if (i12 == 1 || i12 == 2) {
            g2.a aVar3 = this.f1518a;
            int i13 = aVar3.f2312j;
            SideSheetBehavior sideSheetBehavior2 = aVar3.f2313k;
            switch (i13) {
                case 0:
                    right2 = view.getRight() + sideSheetBehavior2.f1532o;
                    break;
                default:
                    right2 = view.getLeft() - sideSheetBehavior2.f1532o;
                    break;
            }
            iS2 = right - right2;
        } else if (i12 != 3) {
            if (i12 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1525h);
            }
            iS2 = this.f1518a.S2();
        }
        view.offsetLeftAndRight(iS2);
        if (this.f1534q == null && (i6 = this.f1535r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i6)) != null) {
            this.f1534q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f1538u.iterator();
        while (it.hasNext()) {
            defpackage.a.n(it.next());
        }
        return true;
    }

    @Override // w.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // w.a
    public final void m(View view, Parcelable parcelable) {
        int i4 = ((g2.d) parcelable).f2317d;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f1525h = i4;
    }

    @Override // w.a
    public final Parcelable n(View view) {
        return new g2.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // w.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1525h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f1526i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1536s) != null) {
            velocityTracker.recycle();
            this.f1536s = null;
        }
        if (this.f1536s == null) {
            this.f1536s = VelocityTracker.obtain();
        }
        this.f1536s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1527j && s()) {
            float fAbs = Math.abs(this.f1537t - motionEvent.getX());
            e eVar = this.f1526i;
            if (fAbs > eVar.f3733b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1527j;
    }

    public final void r(int i4) {
        View view;
        if (this.f1525h == i4) {
            return;
        }
        this.f1525h = i4;
        WeakReference weakReference = this.f1533p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i5 = this.f1525h == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
        Iterator it = this.f1538u.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
        u();
    }

    public final boolean s() {
        return this.f1526i != null && (this.f1524g || this.f1525h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.f1522e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            g2.a r0 = r2.f1518a
            int r0 = r0.S2()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = defpackage.a.e(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            g2.a r0 = r2.f1518a
            int r0 = r0.R2()
        L1f:
            p0.e r1 = r2.f1526i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f3749r = r3
            r3 = -1
            r1.f3734c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f3732a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f3749r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f3749r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            r1.d r3 = r2.f1522e
            r3.a(r4)
            goto L5a
        L57:
            r2.r(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1533p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.i(view, 262144);
        v0.g(view, 0);
        v0.i(view, 1048576);
        v0.g(view, 0);
        final int i4 = 5;
        if (this.f1525h != 5) {
            v0.j(view, i.f3136j, new b0() { // from class: g2.b
                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                @Override // j0.b0
                public final boolean j(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.f2314b;
                    sideSheetBehavior.getClass();
                    int i5 = 1;
                    int i6 = i4;
                    if (i6 == 1 || i6 == 2) {
                        throw new IllegalArgumentException(defpackage.a.h(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1533p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i6);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1533p.get();
                        n nVar = new n(i6, i5, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            nVar.run();
                        } else {
                            WeakHashMap weakHashMap = v0.f2983a;
                            if (h0.b(view3)) {
                                view3.post(nVar);
                            } else {
                                nVar.run();
                            }
                        }
                    }
                    return true;
                }
            });
        }
        final int i5 = 3;
        if (this.f1525h != 3) {
            v0.j(view, i.f3134h, new b0() { // from class: g2.b
                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                @Override // j0.b0
                public final boolean j(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.f2314b;
                    sideSheetBehavior.getClass();
                    int i6 = 1;
                    int i7 = i5;
                    if (i7 == 1 || i7 == 2) {
                        throw new IllegalArgumentException(defpackage.a.h(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1533p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i7);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1533p.get();
                        n nVar = new n(i7, i6, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            nVar.run();
                        } else {
                            WeakHashMap weakHashMap = v0.f2983a;
                            if (h0.b(view3)) {
                                view3.post(nVar);
                            } else {
                                nVar.run();
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1522e = new d(this);
        this.f1524g = true;
        this.f1525h = 5;
        this.f1528k = 0.1f;
        this.f1535r = -1;
        this.f1538u = new LinkedHashSet();
        this.f1539v = new c(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3561w);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1520c = c3.h.P0(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f1521d = l.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f1535r = resourceId;
            WeakReference weakReference = this.f1534q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1534q = null;
            WeakReference weakReference2 = this.f1533p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    if (h0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        l lVar = this.f1521d;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f1519b = hVar;
            hVar.i(context);
            ColorStateList colorStateList = this.f1520c;
            if (colorStateList != null) {
                this.f1519b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1519b.setTint(typedValue.data);
            }
        }
        this.f1523f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f1524g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
