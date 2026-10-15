package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.shungo.app.R;
import e.i;
import f2.g;
import f2.h;
import f2.l;
import i.a0;
import i0.c;
import i0.e0;
import i0.f0;
import i0.h0;
import i0.i0;
import i0.j1;
import i0.k0;
import i0.k1;
import i0.l1;
import i0.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p0.e;
import r1.b;
import r1.d;
import w.a;
import y.k;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final d A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public e M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1355a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1356a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1357b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HashMap f1358b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1359c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1360c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1361d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final b f1362d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f1367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f1368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f1382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f1383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1384z;

    public BottomSheetBehavior() {
        this.f1355a = 0;
        this.f1357b = true;
        this.f1369k = -1;
        this.f1370l = -1;
        this.A = new d(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.f1360c0 = new SparseIntArray();
        this.f1362d0 = new b(this);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        if (k0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View viewV = v(viewGroup.getChildAt(i4));
                if (viewV != null) {
                    return viewV;
                }
            }
        }
        return null;
    }

    public static int w(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    public final void A(int i4) {
        if (i4 == -1) {
            if (this.f1364f) {
                return;
            } else {
                this.f1364f = true;
            }
        } else {
            if (!this.f1364f && this.f1363e == i4) {
                return;
            }
            this.f1364f = false;
            this.f1363e = Math.max(0, i4);
        }
        I();
    }

    public final void B(int i4) {
        if (i4 == 1 || i4 == 2) {
            throw new IllegalArgumentException(defpackage.a.h(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i4 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
            return;
        }
        int i5 = 6;
        int i6 = (i4 == 6 && this.f1357b && y(i4) <= this.D) ? 3 : i4;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            C(i4);
            return;
        }
        View view = (View) this.U.get();
        androidx.activity.h hVar = new androidx.activity.h(this, view, i6, i5);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f2983a;
            if (h0.b(view)) {
                view.post(hVar);
                return;
            }
        }
        hVar.run();
    }

    public final void C(int i4) {
        if (this.L == i4) {
            return;
        }
        this.L = i4;
        if (i4 != 4 && i4 != 3 && i4 != 6) {
            boolean z4 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            H(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            H(false);
        }
        G(i4, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            defpackage.a.n(arrayList.get(0));
            throw null;
        }
    }

    public final boolean D(View view, float f5) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f5 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            p0.e r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f3749r = r3
            r3 = -1
            r1.f3734c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f3732a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f3749r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f3749r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            r1.d r3 = r2.A
            r3.a(r4)
            goto L43
        L40:
            r2.C(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.i(view, 524288);
        v0.g(view, 0);
        v0.i(view, 262144);
        v0.g(view, 0);
        v0.i(view, 1048576);
        v0.g(view, 0);
        SparseIntArray sparseIntArray = this.f1360c0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            v0.i(view, i4);
            v0.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1357b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            i iVar = new i(this, 6);
            ArrayList arrayListE = v0.e(view);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayListE.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = v0.f2986d;
                        if (i6 >= iArr.length || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z4 = true;
                        for (int i9 = 0; i9 < arrayListE.size(); i9++) {
                            z4 &= ((j0.i) arrayListE.get(i9)).a() != i8;
                        }
                        if (z4) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    iA = i7;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((j0.i) arrayListE.get(i5)).f3139a).getLabel())) {
                    iA = ((j0.i) arrayListE.get(i5)).a();
                    break;
                }
                i5++;
            }
            if (iA != -1) {
                j0.i iVar2 = new j0.i(null, iA, string, iVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = v0.c(view);
                c cVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof i0.a ? ((i0.a) accessibilityDelegateC).f2884a : new c(accessibilityDelegateC);
                if (cVar == null) {
                    cVar = new c();
                }
                v0.l(view, cVar);
                v0.i(view, iVar2.a());
                v0.e(view).add(iVar2);
                v0.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.L != 5) {
            v0.j(view, j0.i.f3136j, new i(this, 5));
        }
        int i10 = this.L;
        if (i10 == 3) {
            v0.j(view, j0.i.f3135i, new i(this, this.f1357b ? 4 : 6));
            return;
        }
        if (i10 == 4) {
            v0.j(view, j0.i.f3134h, new i(this, this.f1357b ? 3 : 6));
        } else {
            if (i10 != 6) {
                return;
            }
            v0.j(view, j0.i.f3135i, new i(this, 4));
            v0.j(view, j0.i.f3134h, new i(this, 3));
        }
    }

    public final void G(int i4, boolean z4) {
        ValueAnimator valueAnimator;
        if (i4 == 2) {
            return;
        }
        boolean z5 = this.L == 3 && (this.f1382x || z());
        if (this.f1384z == z5 || this.f1367i == null) {
            return;
        }
        this.f1384z = z5;
        if (z4 && (valueAnimator = this.B) != null) {
            if (valueAnimator.isRunning()) {
                this.B.reverse();
                return;
            } else {
                this.B.setFloatValues(this.f1367i.f2057b.f2044j, z5 ? s() : 1.0f);
                this.B.start();
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.B;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.B.cancel();
        }
        h hVar = this.f1367i;
        float fS = this.f1384z ? s() : 1.0f;
        g gVar = hVar.f2057b;
        if (gVar.f2044j != fS) {
            gVar.f2044j = fS;
            hVar.f2061f = true;
            hVar.invalidateSelf();
        }
    }

    public final void H(boolean z4) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f1358b0 != null) {
                    return;
                } else {
                    this.f1358b0 = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.U.get() && z4) {
                    this.f1358b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f1358b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.U != null) {
            r();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // w.a
    public final void c(w.d dVar) {
        this.U = null;
        this.M = null;
    }

    @Override // w.a
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // w.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i4;
        e eVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x4, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1356a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.o(view, x4, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1356a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (eVar = this.M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i4 = this.Z) == -1 || Math.abs(((float) i4) - motionEvent.getY()) <= ((float) this.M.f3733b)) ? false : true;
    }

    @Override // w.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        WeakHashMap weakHashMap = v0.f2983a;
        if (e0.b(coordinatorLayout) && !e0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.f1365g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z4 = (i5 < 29 || this.f1372n || this.f1364f) ? false : true;
            if (this.f1373o || this.f1374p || this.f1375q || this.f1377s || this.f1378t || this.f1379u || z4) {
                k kVar = new k(this, z4);
                int iF = f0.f(view);
                int paddingTop = view.getPaddingTop();
                int iE = f0.e(view);
                int paddingBottom = view.getPaddingBottom();
                y0.k0 k0Var = new y0.k0();
                k0Var.f5186a = iF;
                k0Var.f5187b = paddingTop;
                k0Var.f5188c = iE;
                k0Var.f5189d = paddingBottom;
                k0.u(view, new a0(kVar, 10, k0Var));
                if (h0.b(view)) {
                    i0.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new z1.l());
                }
            }
            r1.e eVar = new r1.e(view);
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new l1(eVar));
            } else {
                PathInterpolator pathInterpolator = k1.f2932e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener j1Var = new j1(view, eVar);
                view.setTag(R.id.tag_window_insets_animation_callback, j1Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(j1Var);
                }
            }
            this.U = new WeakReference(view);
            new a2.a(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            h hVar = this.f1367i;
            if (hVar != null) {
                e0.q(view, hVar);
                h hVar2 = this.f1367i;
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = k0.i(view);
                }
                hVar2.j(fI);
            } else {
                ColorStateList colorStateList = this.f1368j;
                if (colorStateList != null) {
                    k0.q(view, colorStateList);
                }
            }
            F();
            if (e0.c(view) == 0) {
                e0.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1362d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i4);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i6 = iMin - height;
        int i7 = this.f1381w;
        if (i6 < i7) {
            if (this.f1376r) {
                int i8 = this.f1370l;
                if (i8 != -1) {
                    iMin = Math.min(iMin, i8);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i7;
                int i9 = this.f1370l;
                if (i9 != -1) {
                    iMin2 = Math.min(iMin2, i9);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int i10 = this.L;
        if (i10 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i10 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.L, false);
        this.V = new WeakReference(v(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        defpackage.a.n(arrayList.get(0));
        throw null;
    }

    @Override // w.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f1369k, marginLayoutParams.width), w(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1370l, marginLayoutParams.height));
        return true;
    }

    @Override // w.a
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // w.a
    public final void j(View view, View view2, int i4, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i6 = top - i4;
        if (i4 > 0) {
            if (i6 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                WeakHashMap weakHashMap = v0.f2983a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = v0.f2983a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i7 = this.G;
            if (i6 > i7 && !this.I) {
                int i8 = top - i7;
                iArr[1] = i8;
                WeakHashMap weakHashMap3 = v0.f2983a;
                view.offsetTopAndBottom(-i8);
                C(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap4 = v0.f2983a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        }
        u(view.getTop());
        this.O = i4;
        this.P = true;
    }

    @Override // w.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // w.a
    public final void m(View view, Parcelable parcelable) {
        r1.c cVar = (r1.c) parcelable;
        int i4 = this.f1355a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f1363e = cVar.f4056e;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f1357b = cVar.f4057f;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.I = cVar.f4058g;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.J = cVar.f4059h;
            }
        }
        int i5 = cVar.f4055d;
        if (i5 == 1 || i5 == 2) {
            this.L = 4;
        } else {
            this.L = i5;
        }
    }

    @Override // w.a
    public final Parcelable n(View view) {
        return new r1.c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // w.a
    public final boolean o(View view, int i4, int i5) {
        this.O = 0;
        this.P = false;
        return (i4 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // w.a
    public final void p(View view, View view2, int i4) {
        int top;
        int top2;
        int i5;
        float yVelocity;
        int i6 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.f1357b && view.getTop() > this.E) {
                    i6 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1359c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i6 = 5;
                } else if (this.O == 0) {
                    top2 = view.getTop();
                    if (this.f1357b) {
                        i5 = this.E;
                        if (top2 < i5) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.G)) {
                            i6 = 4;
                        }
                        i6 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i6 = 4;
                    }
                } else {
                    if (!this.f1357b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i6 = 6;
                        }
                    }
                    i6 = 4;
                }
            } else if (this.O == 0) {
                top2 = view.getTop();
                if (this.f1357b) {
                    i5 = this.E;
                    if (top2 < i5) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.G)) {
                        i6 = 4;
                    }
                    i6 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i6 = 4;
                }
            } else {
                if (!this.f1357b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i6 = 6;
                    }
                }
                i6 = 4;
            }
            E(view, i6, false);
            this.P = false;
        }
    }

    @Override // w.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.L;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.M;
        if (eVar != null && (this.K || i4 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            e eVar2 = this.M;
            if (fAbs > eVar2.f3733b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int iT = t();
        if (this.f1357b) {
            this.G = Math.max(this.T - iT, this.D);
        } else {
            this.G = this.T - iT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f5;
        float f6 = 0.0f;
        if (this.f1367i != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                h hVar = this.f1367i;
                float fA = hVar.f2057b.f2035a.f2096e.a(hVar.g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f5 = 0.0f;
                    } else {
                        f5 = radius / fA;
                    }
                } else {
                    f5 = 0.0f;
                }
                h hVar2 = this.f1367i;
                float fA2 = hVar2.f2057b.f2035a.f2097f.a(hVar2.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f6 = radius2 / fA2;
                    }
                }
                return Math.max(f5, f6);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i4;
        if (this.f1364f) {
            return Math.min(Math.max(this.f1365g, this.T - ((this.S * 9) / 16)), this.R) + this.f1380v;
        }
        return (this.f1372n || this.f1373o || (i4 = this.f1371m) <= 0) ? this.f1363e + this.f1380v : Math.max(this.f1363e, i4 + this.f1366h);
    }

    public final void u(int i4) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.G;
            if (i4 <= i5 && i5 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            defpackage.a.n(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f1357b) {
            return this.D;
        }
        return Math.max(this.C, this.f1376r ? 0 : this.f1381w);
    }

    public final int y(int i4) {
        if (i4 == 3) {
            return x();
        }
        if (i4 == 4) {
            return this.G;
        }
        if (i4 == 5) {
            return this.T;
        }
        if (i4 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(defpackage.a.e("Invalid state to get top offset: ", i4));
    }

    public final boolean z() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.f1355a = 0;
        this.f1357b = true;
        this.f1369k = -1;
        this.f1370l = -1;
        this.A = new d(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.f1360c0 = new SparseIntArray();
        this.f1362d0 = new b(this);
        this.f1366h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3539a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1368j = c3.h.P0(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f1383y = l.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        l lVar = this.f1383y;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f1367i = hVar;
            hVar.i(context);
            ColorStateList colorStateList = this.f1368j;
            if (colorStateList != null) {
                this.f1367i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1367i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new r1.a(0, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f1369k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f1370l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i4 = typedValuePeekValue.data) == -1) {
            A(i4);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z4) {
            this.I = z4;
            if (!z4 && this.L == 5) {
                B(4);
            }
            F();
        }
        this.f1372n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f1357b != z5) {
            this.f1357b = z5;
            if (this.U != null) {
                r();
            }
            C((this.f1357b && this.L == 6) ? 3 : this.L);
            G(this.L, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f1355a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f5 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f5 > 0.0f && f5 < 1.0f) {
            this.F = f5;
            if (this.U != null) {
                this.E = (int) ((1.0f - f5) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i5 = typedValuePeekValue2.data;
                if (i5 >= 0) {
                    this.C = i5;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f1361d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f1373o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f1374p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f1375q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f1376r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f1377s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f1378t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f1379u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f1382x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f1359c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
