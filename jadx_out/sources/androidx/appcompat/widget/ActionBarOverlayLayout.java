package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.shungo.app.R;
import e.n0;
import e.s0;
import e.t;
import g.n;
import h.o;
import i.e;
import i.f;
import i.g;
import i.m;
import i.r1;
import i.s1;
import i.t3;
import i.x3;
import i0.a2;
import i0.c2;
import i0.e0;
import i0.i0;
import i0.k0;
import i0.p;
import i0.q;
import i0.r;
import i0.t1;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements r1, p, q {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final e A;
    public final r B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c2 f421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c2 f422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c2 f423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c2 f424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f f425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OverScroller f426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i.d f428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f429z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f406c = 0;
        this.f418o = new Rect();
        this.f419p = new Rect();
        this.f420q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c2 c2Var = c2.f2901b;
        this.f421r = c2Var;
        this.f422s = c2Var;
        this.f423t = c2Var;
        this.f424u = c2Var;
        this.f428y = new i.d(0, this);
        this.f429z = new e(this, 0);
        this.A = new e(this, 1);
        i(context);
        this.B = new r();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z4) {
        boolean z5;
        g gVar = (g) frameLayout.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // i0.p
    public final void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // i0.q
    public final void b(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        c(view, i4, i5, i6, i7, i8);
    }

    @Override // i0.p
    public final void c(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // i0.p
    public final void d(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f410g == null || this.f411h) {
            return;
        }
        if (this.f408e.getVisibility() == 0) {
            translationY = (int) (this.f408e.getTranslationY() + this.f408e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f410g.setBounds(0, translationY, getWidth(), this.f410g.getIntrinsicHeight() + translationY);
        this.f410g.draw(canvas);
    }

    @Override // i0.p
    public final void e(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    @Override // i0.p
    public final boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f408e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.B;
        return rVar.f2961b | rVar.f2960a;
    }

    public CharSequence getTitle() {
        k();
        return ((x3) this.f409f).f2837a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f429z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f427x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f405b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f410g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f411h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f426w = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 == 2) {
            ((x3) this.f409f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i4 == 5) {
            ((x3) this.f409f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        s1 wrapper;
        if (this.f407d == null) {
            this.f407d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f408e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof s1) {
                wrapper = (s1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f409f = wrapper;
        }
    }

    public final void l(o oVar, t tVar) {
        k();
        x3 x3Var = (x3) this.f409f;
        m mVar = x3Var.f2849m;
        Toolbar toolbar = x3Var.f2837a;
        if (mVar == null) {
            x3Var.f2849m = new m(toolbar.getContext());
        }
        m mVar2 = x3Var.f2849m;
        mVar2.f2660f = tVar;
        if (oVar == null && toolbar.f476b == null) {
            return;
        }
        toolbar.f();
        o oVar2 = toolbar.f476b.f430q;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            oVar2.r(toolbar.L);
            oVar2.r(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new t3(toolbar);
        }
        mVar2.f2672r = true;
        if (oVar != null) {
            oVar.b(mVar2, toolbar.f485k);
            oVar.b(toolbar.M, toolbar.f485k);
        } else {
            mVar2.g(toolbar.f485k, null);
            toolbar.M.g(toolbar.f485k, null);
            mVar2.c();
            toolbar.M.c();
        }
        toolbar.f476b.setPopupTheme(toolbar.f486l);
        toolbar.f476b.setPresenter(mVar2);
        toolbar.L = mVar2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        c2 c2VarG = c2.g(this, windowInsets);
        boolean zG = g(this.f408e, new Rect(c2VarG.b(), c2VarG.d(), c2VarG.c(), c2VarG.a()), false);
        WeakHashMap weakHashMap = v0.f2983a;
        Rect rect = this.f418o;
        k0.b(this, c2VarG, rect);
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        a2 a2Var = c2VarG.f2902a;
        c2 c2VarL = a2Var.l(i4, i5, i6, i7);
        this.f421r = c2VarL;
        if (!this.f422s.equals(c2VarL)) {
            this.f422s = this.f421r;
            zG = true;
        }
        Rect rect2 = this.f419p;
        if (rect2.equals(rect)) {
            if (zG) {
            }
            return a2Var.a().f2902a.c().f2902a.b().f();
        }
        rect2.set(rect);
        requestLayout();
        return a2Var.a().f2902a.c().f2902a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = v0.f2983a;
        i0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f408e, i4, 0, i5, 0);
        g gVar = (g) this.f408e.getLayoutParams();
        int iMax = Math.max(0, this.f408e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int iMax2 = Math.max(0, this.f408e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f408e.getMeasuredState());
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z4 = (e0.g(this) & 256) != 0;
        if (z4) {
            measuredHeight = this.f405b;
            if (this.f413j && this.f408e.getTabContainer() != null) {
                measuredHeight += this.f405b;
            }
        } else {
            measuredHeight = this.f408e.getVisibility() != 8 ? this.f408e.getMeasuredHeight() : 0;
        }
        Rect rect = this.f418o;
        Rect rect2 = this.f420q;
        rect2.set(rect);
        c2 c2Var = this.f421r;
        this.f423t = c2Var;
        if (this.f412i || z4) {
            b0.c cVarB = b0.c.b(c2Var.b(), this.f423t.d() + measuredHeight, this.f423t.c(), this.f423t.a());
            n0 n0Var = new n0(this.f423t);
            ((t1) n0Var.f1896c).g(cVarB);
            this.f423t = n0Var.v();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f423t = c2Var.f2902a.l(0, measuredHeight, 0, 0);
        }
        g(this.f407d, rect2, true);
        if (!this.f424u.equals(this.f423t)) {
            c2 c2Var2 = this.f423t;
            this.f424u = c2Var2;
            ContentFrameLayout contentFrameLayout = this.f407d;
            WindowInsets windowInsetsF = c2Var2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = i0.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    c2.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.f407d, i4, 0, i5, 0);
        g gVar2 = (g) this.f407d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f407d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f407d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f407d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i4, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (!this.f414k || !z4) {
            return false;
        }
        this.f426w.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f426w.getFinalY() > this.f408e.getHeight()) {
            h();
            this.A.run();
        } else {
            h();
            this.f429z.run();
        }
        this.f415l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f416m + i5;
        this.f416m = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        s0 s0Var;
        n nVar;
        this.B.f2960a = i4;
        this.f416m = getActionBarHideOffset();
        h();
        f fVar = this.f425v;
        if (fVar == null || (nVar = (s0Var = (s0) fVar).B) == null) {
            return;
        }
        nVar.a();
        s0Var.B = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f408e.getVisibility() != 0) {
            return false;
        }
        return this.f414k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f414k || this.f415l) {
            return;
        }
        if (this.f416m <= this.f408e.getHeight()) {
            h();
            postDelayed(this.f429z, 600L);
        } else {
            h();
            postDelayed(this.A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i5 = this.f417n ^ i4;
        this.f417n = i4;
        boolean z4 = (i4 & 4) == 0;
        boolean z5 = (i4 & 256) != 0;
        f fVar = this.f425v;
        if (fVar != null) {
            ((s0) fVar).f1937x = !z5;
            if (z4 || !z5) {
                s0 s0Var = (s0) fVar;
                if (s0Var.f1938y) {
                    s0Var.f1938y = false;
                    s0Var.W2(true);
                }
            } else {
                s0 s0Var2 = (s0) fVar;
                if (!s0Var2.f1938y) {
                    s0Var2.f1938y = true;
                    s0Var2.W2(true);
                }
            }
        }
        if ((i5 & 256) == 0 || this.f425v == null) {
            return;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        i0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f406c = i4;
        f fVar = this.f425v;
        if (fVar != null) {
            ((s0) fVar).f1936w = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f408e.setTranslationY(-Math.max(0, Math.min(i4, this.f408e.getHeight())));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.f425v = fVar;
        if (getWindowToken() != null) {
            ((s0) this.f425v).f1936w = this.f406c;
            int i4 = this.f417n;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = v0.f2983a;
                i0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f413j = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f414k) {
            this.f414k = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        k();
        x3 x3Var = (x3) this.f409f;
        x3Var.f2840d = i4 != 0 ? r3.q.g(x3Var.f2837a.getContext(), i4) : null;
        x3Var.c();
    }

    public void setLogo(int i4) {
        k();
        x3 x3Var = (x3) this.f409f;
        x3Var.f2841e = i4 != 0 ? r3.q.g(x3Var.f2837a.getContext(), i4) : null;
        x3Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f412i = z4;
        this.f411h = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // i.r1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((x3) this.f409f).f2847k = callback;
    }

    @Override // i.r1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        x3 x3Var = (x3) this.f409f;
        if (x3Var.f2843g) {
            return;
        }
        x3Var.f2844h = charSequence;
        if ((x3Var.f2838b & 8) != 0) {
            Toolbar toolbar = x3Var.f2837a;
            toolbar.setTitle(charSequence);
            if (x3Var.f2843g) {
                v0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        x3 x3Var = (x3) this.f409f;
        x3Var.f2840d = drawable;
        x3Var.c();
    }
}
