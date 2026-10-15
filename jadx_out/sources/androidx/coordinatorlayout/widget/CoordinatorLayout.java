package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.shungo.app.R;
import e.n0;
import g.h;
import h0.c;
import i0.c2;
import i0.e0;
import i0.f0;
import i0.h0;
import i0.i0;
import i0.k0;
import i0.p;
import i0.q;
import i0.r;
import i0.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n.k;
import v.a;
import w.b;
import w.d;
import w.e;
import w.f;
import w.g;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements p, q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class[] f530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f533y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c2 f547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n0 f551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f552t;

    static {
        Package r4 = CoordinatorLayout.class.getPackage();
        f529u = r4 != null ? r4.getName() : null;
        f532x = new g(0);
        f530v = new Class[]{Context.class, AttributeSet.class};
        f531w = new ThreadLocal();
        f533y = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f534b = new ArrayList();
        this.f535c = new h(3);
        this.f536d = new ArrayList();
        this.f537e = new ArrayList();
        this.f538f = new int[2];
        this.f539g = new int[2];
        this.f552t = new r();
        int[] iArr = a.f4768a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f542j = intArray;
            float f5 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                int[] iArr2 = this.f542j;
                iArr2[i4] = (int) (iArr2[i4] * f5);
            }
        }
        this.f549q = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new w.c(this));
        WeakHashMap weakHashMap = v0.f2983a;
        if (e0.c(this) == 0) {
            e0.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f533y.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i4, Rect rect, Rect rect2, d dVar, int i5, int i6) {
        int iWidth;
        int iHeight;
        int i7 = dVar.f4821c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = dVar.f4822d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 != 1) {
            iWidth = i11 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i12 != 16) {
            iHeight = i12 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i9 == 1) {
            iWidth -= i5 / 2;
        } else if (i9 != 5) {
            iWidth -= i5;
        }
        if (i10 == 16) {
            iHeight -= i6 / 2;
        } else if (i10 != 80) {
            iHeight -= i6;
        }
        rect2.set(iWidth, iHeight, i5 + iWidth, i6 + iHeight);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f4820b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    w.a aVar = (w.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    w.a aVar2 = dVar.f4819a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f4819a = aVar;
                        dVar.f4820b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            dVar.f4820b = true;
        }
        return dVar;
    }

    public static void u(View view, int i4) {
        d dVar = (d) view.getLayoutParams();
        int i5 = dVar.f4827i;
        if (i5 != i4) {
            WeakHashMap weakHashMap = v0.f2983a;
            view.offsetLeftAndRight(i4 - i5);
            dVar.f4827i = i4;
        }
    }

    public static void v(View view, int i4) {
        d dVar = (d) view.getLayoutParams();
        int i5 = dVar.f4828j;
        if (i5 != i4) {
            WeakHashMap weakHashMap = v0.f2983a;
            view.offsetTopAndBottom(i4 - i5);
            dVar.f4828j = i4;
        }
    }

    @Override // i0.p
    public final void a(View view, View view2, int i4, int i5) {
        r rVar = this.f552t;
        if (i5 == 1) {
            rVar.f2961b = i4;
        } else {
            rVar.f2960a = i4;
        }
        this.f544l = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((d) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // i0.q
    public final void b(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        w.a aVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i8) && (aVar = dVar.f4819a) != null) {
                    int[] iArr2 = this.f538f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i5, i6, i7, iArr2);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // i0.p
    public final void c(View view, int i4, int i5, int i6, int i7, int i8) {
        b(view, i4, i5, i6, i7, 0, this.f539g);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // i0.p
    public final void d(View view, int i4) {
        r rVar = this.f552t;
        if (i4 == 1) {
            rVar.f2961b = 0;
        } else {
            rVar.f2960a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i4)) {
                w.a aVar = dVar.f4819a;
                if (aVar != null) {
                    aVar.p(childAt, view, i4);
                }
                if (i4 == 0) {
                    dVar.f4832n = false;
                } else if (i4 == 1) {
                    dVar.f4833o = false;
                }
                dVar.getClass();
            }
        }
        this.f544l = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        w.a aVar = ((d) view.getLayoutParams()).f4819a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f549q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // i0.p
    public final void e(View view, int i4, int i5, int[] iArr, int i6) {
        w.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z4 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.f4819a) != null) {
                    int[] iArr2 = this.f538f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(childAt, view, i5, iArr2, i6);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // i0.p
    public final boolean f(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                w.a aVar = dVar.f4819a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i4, i5);
                    z4 |= zO;
                    if (i5 == 0) {
                        dVar.f4832n = zO;
                    } else if (i5 == 1) {
                        dVar.f4833o = zO;
                    }
                } else if (i5 == 0) {
                    dVar.f4832n = false;
                } else if (i5 == 1) {
                    dVar.f4833o = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f534b);
    }

    public final c2 getLastWindowInsets() {
        return this.f547o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f552t;
        return rVar.f2961b | rVar.f2960a;
    }

    public Drawable getStatusBarBackground() {
        return this.f549q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i4 + iMax, i5 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        h hVar = this.f535c;
        int i4 = ((k) hVar.f2226e).f3524d;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) ((k) hVar.f2226e).j(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) hVar.f2226e).h(i5));
            }
        }
        ArrayList arrayList3 = this.f537e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = w.h.f4838a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = w.h.f4838a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        w.h.a(this, view, matrix);
        ThreadLocal threadLocal3 = w.h.f4839b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i4) {
        int[] iArr = this.f542j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i4, int i5) {
        c cVar = f533y;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i4, i5);
        } finally {
            rectG.setEmpty();
            cVar.b(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f546n) {
            if (this.f545m == null) {
                this.f545m = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f545m);
        }
        if (this.f547o == null) {
            WeakHashMap weakHashMap = v0.f2983a;
            if (e0.b(this)) {
                i0.c(this);
            }
        }
        this.f541i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f546n && this.f545m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f545m);
        }
        View view = this.f544l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f541i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f548p || this.f549q == null) {
            return;
        }
        c2 c2Var = this.f547o;
        int iD = c2Var != null ? c2Var.d() : 0;
        if (iD > 0) {
            this.f549q.setBounds(0, 0, getWidth(), iD);
            this.f549q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        w.a aVar;
        WeakHashMap weakHashMap = v0.f2983a;
        int iD = f0.d(this);
        ArrayList arrayList = this.f534b;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f4819a) == null || !aVar.g(this, view, iD))) {
                q(view, iD);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z4;
        int i6;
        int i7;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        w.a aVar;
        int i8;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        s();
        int childCount = getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = getChildAt(i16);
            h hVar = this.f535c;
            int i17 = ((k) hVar.f2226e).f3524d;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) ((k) hVar.f2226e).j(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z4 != this.f546n) {
            if (z4) {
                if (this.f541i) {
                    if (this.f545m == null) {
                        this.f545m = new e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f545m);
                }
                this.f546n = true;
            } else {
                if (this.f541i && this.f545m != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f545m);
                }
                this.f546n = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = v0.f2983a;
        int iD = f0.d(this);
        boolean z6 = iD == 1;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z7 = this.f547o != null && e0.b(this);
        ArrayList arrayList3 = this.f534b;
        int size3 = arrayList3.size();
        int i21 = suggestedMinimumWidth;
        int i22 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i23 < size3) {
            View view = (View) arrayList3.get(i23);
            int i24 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i8 = size3;
                arrayList = arrayList3;
                i13 = paddingLeft;
                i9 = paddingRight;
                i10 = iD;
                iCombineMeasuredStates = i24;
                z5 = false;
                i15 = i23;
            } else {
                d dVar = (d) view.getLayoutParams();
                int i25 = dVar.f4823e;
                if (i25 < 0 || mode == 0) {
                    i6 = i23;
                    i7 = i22;
                } else {
                    int iM = m(i25);
                    i6 = i23;
                    int i26 = dVar.f4821c;
                    if (i26 == 0) {
                        i26 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, iD) & 7;
                    i7 = i22;
                    if ((absoluteGravity == 3 && !z6) || (absoluteGravity == 5 && z6)) {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    } else if ((absoluteGravity == 5 && !z6) || (absoluteGravity == 3 && z6)) {
                        iMax = Math.max(0, iM - paddingLeft);
                    }
                    if (z7 || e0.b(view)) {
                        iMakeMeasureSpec = i4;
                        iMakeMeasureSpec2 = i5;
                    } else {
                        int iC = this.f547o.c() + this.f547o.b();
                        int iA = this.f547o.a() + this.f547o.d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                    }
                    aVar = dVar.f4819a;
                    if (aVar != null) {
                        i15 = i6;
                        i9 = paddingRight;
                        i11 = i7;
                        z5 = false;
                        i13 = paddingLeft;
                        i14 = i24;
                        i10 = iD;
                        i12 = i21;
                        i8 = size3;
                        arrayList = arrayList3;
                        if (!aVar.h(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                        }
                        int iMax2 = Math.max(i12, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax3 = Math.max(i11, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        i21 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                        i22 = iMax3;
                    } else {
                        i8 = size3;
                        arrayList = arrayList3;
                        i9 = paddingRight;
                        i10 = iD;
                        i11 = i7;
                        i12 = i21;
                        i13 = paddingLeft;
                        i14 = i24;
                        i15 = i6;
                        z5 = false;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    int iMax4 = Math.max(i12, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax5 = Math.max(i11, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    i21 = iMax4;
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    i22 = iMax5;
                }
                iMax = 0;
                if (z7) {
                    iMakeMeasureSpec = i4;
                    iMakeMeasureSpec2 = i5;
                } else {
                    iMakeMeasureSpec = i4;
                    iMakeMeasureSpec2 = i5;
                }
                aVar = dVar.f4819a;
                if (aVar != null) {
                    i15 = i6;
                    i9 = paddingRight;
                    i11 = i7;
                    z5 = false;
                    i13 = paddingLeft;
                    i14 = i24;
                    i10 = iD;
                    i12 = i21;
                    i8 = size3;
                    arrayList = arrayList3;
                    if (!aVar.h(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                    }
                    int iMax6 = Math.max(i12, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax7 = Math.max(i11, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    i21 = iMax6;
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    i22 = iMax7;
                } else {
                    i8 = size3;
                    arrayList = arrayList3;
                    i9 = paddingRight;
                    i10 = iD;
                    i11 = i7;
                    i12 = i21;
                    i13 = paddingLeft;
                    i14 = i24;
                    i15 = i6;
                    z5 = false;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                int iMax8 = Math.max(i12, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int iMax9 = Math.max(i11, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                i21 = iMax8;
                iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                i22 = iMax9;
            }
            i23 = i15 + 1;
            paddingLeft = i13;
            paddingRight = i9;
            iD = i10;
            size3 = i8;
            arrayList3 = arrayList;
        }
        int i27 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i21, i4, (-16777216) & i27), View.resolveSizeAndState(i22, i5, i27 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    w.a aVar = dVar.f4819a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        w.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f4819a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        e(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        c(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f3594b);
        SparseArray sparseArray = fVar.f4836d;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            w.a aVar = n(childAt).f4819a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            w.a aVar = ((d) childAt.getLayoutParams()).f4819a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        fVar.f4836d = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        boolean zQ;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f543k == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zQ = false;
            }
            motionEventObtain = null;
            if (this.f543k == null) {
                zQ |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return zQ;
        }
        zR = false;
        w.a aVar = ((d) this.f543k.getLayoutParams()).f4819a;
        if (aVar != null) {
            zQ = aVar.q(this.f543k, motionEvent);
        } else {
            zQ = false;
        }
        motionEventObtain = null;
        if (this.f543k == null) {
            zQ |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            t(false);
        } else {
            t(false);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0283  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    public final void p(int i4) {
        int i5;
        Rect rect;
        int i6;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        View view;
        c cVar;
        w.a aVar;
        WeakHashMap weakHashMap = v0.f2983a;
        int iD = f0.d(this);
        ArrayList arrayList2 = this.f534b;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i13 = 0;
        while (true) {
            c cVar2 = f533y;
            if (i13 >= size) {
                Rect rect2 = rectG3;
                rectG.setEmpty();
                cVar2.b(rectG);
                rectG2.setEmpty();
                cVar2.b(rectG2);
                rect2.setEmpty();
                cVar2.b(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i13);
            d dVar = (d) view2.getLayoutParams();
            if (i4 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i6 = size;
                rect = rectG3;
                i5 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (dVar.f4830l == ((View) arrayList2.get(i14))) {
                        d dVar2 = (d) view2.getLayoutParams();
                        if (dVar2.f4829k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            Rect rectG6 = g();
                            k(dVar2.f4829k, rectG4);
                            i(view2, rectG5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            cVar = cVar2;
                            l(iD, rectG4, rectG6, dVar2, measuredWidth, measuredHeight);
                            boolean z6 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(r16, rectG6, measuredWidth, measuredHeight);
                            int i15 = rectG6.left - rectG5.left;
                            int i16 = rectG6.top - rectG5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = v0.f2983a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = v0.f2983a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z6 && (aVar = r16.f4819a) != null) {
                                aVar.d(this, view, dVar2.f4829k);
                            }
                            rectG4.setEmpty();
                            cVar.b(rectG4);
                            rectG5.setEmpty();
                            cVar.b(rectG5);
                            rectG6.setEmpty();
                            cVar.b(rectG6);
                        } else {
                            view = view2;
                            cVar = cVar2;
                        }
                    } else {
                        view = view2;
                        cVar = cVar2;
                    }
                    i14++;
                    cVar2 = cVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i13 = i13;
                    dVar = dVar;
                    rectG3 = rectG3;
                }
                d dVar3 = dVar;
                ArrayList arrayList3 = arrayList2;
                int i17 = size;
                Rect rect3 = rectG3;
                i5 = i13;
                View view3 = view2;
                p.e eVar = cVar2;
                i(view3, rectG2, true);
                if (dVar3.f4825g != 0 && !rectG2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar3.f4825g, iD);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        rectG.top = Math.max(rectG.top, rectG2.bottom);
                    } else if (i18 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rectG2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        rectG.left = Math.max(rectG.left, rectG2.right);
                    } else if (i19 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rectG2.left);
                    }
                }
                if (dVar3.f4826h != 0 && view3.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = v0.f2983a;
                    if (h0.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        d dVar4 = (d) view3.getLayoutParams();
                        w.a aVar2 = dVar4.f4819a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (aVar2 == null || !aVar2.a(view3)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        eVar.b(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            eVar.b(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar4.f4826h, iD);
                            if ((absoluteGravity2 & 48) != 48 || (i11 = (rectG7.top - ((ViewGroup.MarginLayoutParams) dVar4).topMargin) - dVar4.f4828j) >= (i12 = rectG.top)) {
                                z4 = false;
                            } else {
                                v(view3, i12 - i11);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin) + dVar4.f4828j) < (i10 = rectG.bottom)) {
                                v(view3, height - i10);
                            } else if (!z4) {
                                v(view3, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i8 = (rectG7.left - ((ViewGroup.MarginLayoutParams) dVar4).leftMargin) - dVar4.f4827i) >= (i9 = rectG.left)) {
                                z5 = false;
                            } else {
                                u(view3, i9 - i8);
                                z5 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin) + dVar4.f4827i) < (i7 = rectG.right)) {
                                u(view3, width - i7);
                            } else if (!z5) {
                                u(view3, 0);
                            }
                            rectG7.setEmpty();
                            eVar.b(rectG7);
                        }
                    }
                }
                if (i4 != 2) {
                    rect = rect3;
                    rect.set(((d) view3.getLayoutParams()).f4834p);
                    if (rect.equals(rectG2)) {
                        arrayList = arrayList3;
                        i6 = i17;
                    } else {
                        ((d) view3.getLayoutParams()).f4834p.set(rectG2);
                    }
                } else {
                    rect = rect3;
                }
                int i20 = i5 + 1;
                i6 = i17;
                while (true) {
                    arrayList = arrayList3;
                    if (i20 < i6) {
                        View view4 = (View) arrayList.get(i20);
                        w.a aVar3 = ((d) view4.getLayoutParams()).f4819a;
                        if (aVar3 != null) {
                            aVar3.b(view4);
                        }
                        i20++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i13 = i5 + 1;
            size = i6;
            rectG3 = rect;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i4) {
        int i5;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f4829k;
        if (view2 == null && dVar.f4824f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f533y;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                k(view2, rectG);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i4, rectG, rectG2, dVar2, measuredWidth, measuredHeight);
                h(dVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                cVar.b(rectG);
                rectG2.setEmpty();
                cVar.b(rectG2);
            }
        }
        int i6 = dVar.f4823e;
        if (i6 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f547o != null) {
                WeakHashMap weakHashMap = v0.f2983a;
                if (e0.b(this) && !e0.b(view)) {
                    rectG3.left = this.f547o.b() + rectG3.left;
                    rectG3.top = this.f547o.d() + rectG3.top;
                    rectG3.right -= this.f547o.c();
                    rectG3.bottom -= this.f547o.a();
                }
            }
            Rect rectG4 = g();
            int i7 = dVar3.f4821c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            i0.k.b(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i4);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            cVar.b(rectG3);
            rectG4.setEmpty();
            cVar.b(rectG4);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i8 = dVar4.f4821c;
        if (i8 == 0) {
            i8 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i4 == 1) {
            i6 = width - i6;
        }
        int iM = m(i6) - measuredWidth2;
        if (i9 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i9 == 5) {
            iM += measuredWidth2;
        }
        if (i10 != 16) {
            i5 = i10 != 80 ? 0 : measuredHeight2;
        } else {
            i5 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i4) {
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f536d;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        g gVar = f532x;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            d dVar = (d) view.getLayoutParams();
            w.a aVar = dVar.f4819a;
            if (!(zF || z5) || actionMasked == 0) {
                if (!zF && aVar != null) {
                    if (i4 == 0) {
                        zF = aVar.f(this, view, motionEvent);
                    } else if (i4 == 1) {
                        zF = aVar.q(view, motionEvent);
                    }
                    if (zF) {
                        this.f543k = view;
                    }
                }
                if (dVar.f4819a == null) {
                    dVar.f4831m = false;
                }
                boolean z6 = dVar.f4831m;
                if (z6) {
                    z4 = true;
                } else {
                    dVar.f4831m = z6;
                    z4 = z6;
                }
                z5 = z4 && !z6;
                if (z4 && !z5) {
                    break;
                }
            } else if (aVar != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i4 == 0) {
                    aVar.f(this, view, motionEventObtain);
                } else if (i4 == 1) {
                    aVar.q(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        w.a aVar = ((d) view.getLayoutParams()).f4819a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f540h) {
            return;
        }
        t(false);
        this.f540h = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0099
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f550r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f549q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f549q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f549q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f549q;
                WeakHashMap weakHashMap = v0.f2983a;
                c0.c.b(drawable3, f0.d(this));
                this.f549q.setVisible(getVisibility() == 0, false);
                this.f549q.setCallback(this);
            }
            WeakHashMap weakHashMap2 = v0.f2983a;
            e0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        Drawable drawableB;
        if (i4 != 0) {
            Context context = getContext();
            Object obj = z.d.f5428a;
            drawableB = z.b.b(context, i4);
        } else {
            drawableB = null;
        }
        setStatusBarBackground(drawableB);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f549q;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f549q.setVisible(z4, false);
    }

    public final void t(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            w.a aVar = ((d) childAt.getLayoutParams()).f4819a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).f4831m = false;
        }
        this.f543k = null;
        this.f540h = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f549q;
    }

    public final void w() {
        WeakHashMap weakHashMap = v0.f2983a;
        if (!e0.b(this)) {
            k0.u(this, null);
            return;
        }
        if (this.f551s == null) {
            this.f551s = new n0(8, this);
        }
        k0.u(this, this.f551s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
