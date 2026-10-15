package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import c3.h;
import e.c;
import i0.e0;
import i0.k0;
import i0.o;
import i0.q;
import i0.r;
import i0.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.e;
import m0.i;
import m0.j;
import m0.k;
import m0.l;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements q {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final i D = new i();
    public static final int[] E = {R.attr.fillViewport};
    public float A;
    public k B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OverScroller f573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EdgeEffect f575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f594z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.shungo.app.R.attr.nestedScrollViewStyle);
        this.f572d = new Rect();
        this.f577i = true;
        this.f578j = false;
        this.f579k = null;
        this.f580l = false;
        this.f583o = true;
        this.f587s = -1;
        this.f588t = new int[2];
        this.f589u = new int[2];
        int i4 = Build.VERSION.SDK_INT;
        this.f574f = i4 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f575g = i4 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f570b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f573e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f584p = viewConfiguration.getScaledTouchSlop();
        this.f585q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f586r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, com.shungo.app.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f593y = new r();
        this.f594z = new o(this);
        setNestedScrollingEnabled(true);
        v0.l(this, D);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    @Override // i0.p
    public final void a(View view, View view2, int i4, int i5) {
        r rVar = this.f593y;
        if (i5 == 1) {
            rVar.f2961b = i4;
        } else {
            rVar.f2960a = i4;
        }
        this.f594z.h(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // i0.q
    public final void b(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(i7, i8, iArr);
    }

    @Override // i0.p
    public final void c(View view, int i4, int i5, int i6, int i7, int i8) {
        n(i7, i8, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i4;
        int scrollRange;
        int overScrollMode;
        if (this.f573e.isFinished()) {
            return;
        }
        this.f573e.computeScrollOffset();
        int currY = this.f573e.getCurrY();
        int i5 = currY - this.f591w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f575g;
        EdgeEffect edgeEffect2 = this.f574f;
        if (i5 <= 0 || h.T0(edgeEffect2) == 0.0f) {
            if (i5 < 0 && h.T0(edgeEffect) != 0.0f) {
                float f5 = height;
                iRound = Math.round(h.L1(edgeEffect, (i5 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
                if (iRound != i5) {
                    edgeEffect.finish();
                }
            }
            this.f591w = currY;
            iArr = this.f589u;
            iArr[1] = 0;
            this.f594z.c(0, i5, iArr, null, 1);
            i4 = i5 - iArr[1];
            scrollRange = getScrollRange();
            if (i4 != 0) {
                int scrollY = getScrollY();
                p(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i4 - scrollY2;
                iArr[1] = 0;
                this.f594z.e(0, scrollY2, 0, i6, this.f588t, 1, iArr);
                i4 = i6 - iArr[1];
            }
            if (i4 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f573e.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f573e.getCurrVelocity());
                    }
                }
                this.f573e.abortAnimation();
                w(1);
            }
            if (!this.f573e.isFinished()) {
                w(1);
            } else {
                WeakHashMap weakHashMap = v0.f2983a;
                e0.k(this);
            }
        }
        iRound = Math.round(h.L1(edgeEffect2, ((-i5) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i5) {
            edgeEffect2.finish();
        }
        i5 -= iRound;
        this.f591w = currY;
        iArr = this.f589u;
        iArr[1] = 0;
        this.f594z.c(0, i5, iArr, null, 1);
        i4 = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (i4 != 0) {
            int scrollY3 = getScrollY();
            p(i4, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i7 = i4 - scrollY4;
            iArr[1] = 0;
            this.f594z.e(0, scrollY4, 0, i7, this.f588t, 1, iArr);
            i4 = i7 - iArr[1];
        }
        if (i4 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i4 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f573e.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f573e.getCurrVelocity());
                }
            } else if (i4 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f573e.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f573e.getCurrVelocity());
            }
            this.f573e.abortAnimation();
            w(1);
        }
        if (!this.f573e.isFinished()) {
            w(1);
        } else {
            WeakHashMap weakHashMap2 = v0.f2983a;
            e0.k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // i0.p
    public final void d(View view, int i4) {
        r rVar = this.f593y;
        if (i4 == 1) {
            rVar.f2961b = 0;
        } else {
            rVar.f2960a = 0;
        }
        w(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f594z.a(f5, f6, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f594z.b(f5, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f594z.c(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f594z.e(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f574f;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = v0.f2983a;
                e0.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f575g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (j.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (j.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = v0.f2983a;
            e0.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // i0.p
    public final void e(View view, int i4, int i5, int[] iArr, int i6) {
        this.f594z.c(i4, i5, iArr, null, i6);
    }

    @Override // i0.p
    public final boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f572d;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i4);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f593y;
        return rVar.f2961b | rVar.f2960a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f594z.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f572d.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : g(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f594z.f2947d;
    }

    public final void j(int i4) {
        if (getChildCount() > 0) {
            this.f573e.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f594z.h(2, 1);
            this.f591w = getScrollY();
            WeakHashMap weakHashMap = v0.f2983a;
            e0.k(this);
        }
    }

    public final boolean k(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f572d;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i4, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i4, int i5) {
        Rect rect = this.f572d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f594z.d(scrollY2, i4 - scrollY2, i5, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f587s) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f576h = (int) motionEvent.getY(i4);
            this.f587s = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f581m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f578j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f580l) {
            if ((motionEvent.getSource() & 2) == 2) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                s(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, (motionEvent.getSource() & 8194) == 8194);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f580l) {
            return true;
        }
        int i4 = action & 255;
        if (i4 == 0) {
            int y4 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 < childAt.getTop() - scrollY || y4 >= childAt.getBottom() - scrollY || x4 < childAt.getLeft() || x4 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f573e.isFinished()) {
                        z4 = false;
                    }
                    this.f580l = z4;
                    velocityTracker = this.f581m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f581m = null;
                    }
                } else {
                    this.f576h = y4;
                    this.f587s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f581m;
                    if (velocityTracker3 == null) {
                        this.f581m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f581m.addMovement(motionEvent);
                    this.f573e.computeScrollOffset();
                    if (!v(motionEvent) && this.f573e.isFinished()) {
                        z4 = false;
                    }
                    this.f580l = z4;
                    this.f594z.h(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z4 = false;
                }
                this.f580l = z4;
                velocityTracker = this.f581m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f581m = null;
                }
            }
        } else if (i4 == 1) {
            this.f580l = false;
            this.f587s = -1;
            velocityTracker2 = this.f581m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f581m = null;
            }
            if (this.f573e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = v0.f2983a;
                e0.k(this);
            }
            w(0);
        } else if (i4 == 2) {
            int i5 = this.f587s;
            if (i5 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y5 - this.f576h) > this.f584p && (2 & getNestedScrollAxes()) == 0) {
                        this.f580l = true;
                        this.f576h = y5;
                        if (this.f581m == null) {
                            this.f581m = VelocityTracker.obtain();
                        }
                        this.f581m.addMovement(motionEvent);
                        this.f590v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i4 == 3) {
            this.f580l = false;
            this.f587s = -1;
            velocityTracker2 = this.f581m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f581m = null;
            }
            if (this.f573e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap2 = v0.f2983a;
                e0.k(this);
            }
            w(0);
        } else if (i4 == 6) {
            o(motionEvent);
        }
        return this.f580l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredHeight;
        super.onLayout(z4, i4, i5, i6, i7);
        int i8 = 0;
        this.f577i = false;
        View view = this.f579k;
        if (view != null && l(view, this)) {
            View view2 = this.f579k;
            Rect rect = this.f572d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f579k = null;
        if (!this.f578j) {
            if (this.f592x != null) {
                scrollTo(getScrollX(), this.f592x.f3437b);
                this.f592x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i8 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f578j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f582n && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        j((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.f594z.c(i4, i5, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (viewFindNextFocus == null || (true ^ m(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f592x = lVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f3437b = getScrollY();
        return lVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        k kVar = this.B;
        if (kVar != null) {
            c cVar = (c) kVar;
            e.h.a(this, (View) cVar.f1779c, (View) cVar.f1780d);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f572d;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f583o) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f581m == null) {
            this.f581m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f590v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f5 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f590v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f575g;
            EdgeEffect edgeEffect2 = this.f574f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f581m;
                velocityTracker.computeCurrentVelocity(1000, this.f586r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f587s);
                if (Math.abs(yVelocity) >= this.f585q) {
                    if (h.T0(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (h.T0(edgeEffect) != 0.0f) {
                        int i4 = -yVelocity;
                        if (t(edgeEffect, i4)) {
                            edgeEffect.onAbsorb(i4);
                        } else {
                            j(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f6 = i5;
                        if (!dispatchNestedPreFling(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            j(i5);
                        }
                    }
                } else if (this.f573e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    e0.k(this);
                }
                this.f587s = -1;
                this.f580l = false;
                VelocityTracker velocityTracker2 = this.f581m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f581m = null;
                }
                w(0);
                this.f574f.onRelease();
                this.f575g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f587s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f587s + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f576h - y4;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (h.T0(edgeEffect2) != 0.0f) {
                        float f7 = -h.L1(edgeEffect2, -height, x4);
                        if (h.T0(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f5 = f7;
                    } else if (h.T0(edgeEffect) != 0.0f) {
                        float fL1 = h.L1(edgeEffect, height, 1.0f - x4);
                        if (h.T0(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f5 = fL1;
                    }
                    int iRound = Math.round(f5 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i7 = i6 - iRound;
                    if (!this.f580l && Math.abs(i7) > this.f584p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f580l = true;
                        i7 = i7 > 0 ? i7 - this.f584p : i7 + this.f584p;
                    }
                    if (this.f580l) {
                        int iS = s(i7, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f576h = y4 - iS;
                        this.f590v += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f580l && getChildCount() > 0 && this.f573e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap2 = v0.f2983a;
                    e0.k(this);
                }
                this.f587s = -1;
                this.f580l = false;
                VelocityTracker velocityTracker3 = this.f581m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f581m = null;
                }
                w(0);
                this.f574f.onRelease();
                this.f575g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f576h = (int) motionEvent.getY(actionIndex);
                this.f587s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f576h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f587s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f580l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f573e.isFinished()) {
                this.f573e.abortAnimation();
                w(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f576h = y5;
            this.f587s = pointerId;
            this.f594z.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f581m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i4, int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i8 = i6 + i4;
        if (i5 <= 0 && i5 >= 0) {
            z4 = false;
        } else {
            i5 = 0;
            z4 = true;
        }
        if (i8 > i7) {
            z5 = true;
        } else if (i8 < 0) {
            i7 = 0;
            z5 = true;
        } else {
            i7 = i8;
            z5 = false;
        }
        if (z5 && !this.f594z.g(1)) {
            this.f573e.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i7, z4, z5);
        return z4 || z5;
    }

    public final void q(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f572d;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        r(i4, i5, i6);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i4, int i5, int i6) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7 && z8) {
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else if (z8) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            s(z5 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f577i) {
            this.f579k = view2;
        } else {
            Rect rect = this.f572d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z5 = iH != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, iH);
            } else {
                u(0, iH, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f581m) != null) {
            velocityTracker.recycle();
            this.f581m = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f577i = true;
        super.requestLayout();
    }

    public final int s(int i4, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        o oVar = this.f594z;
        if (i6 == 1) {
            oVar.h(2, i6);
        }
        boolean zC = this.f594z.c(0, i4, this.f589u, this.f588t, i6);
        int[] iArr = this.f589u;
        int[] iArr2 = this.f588t;
        if (zC) {
            i7 = i4 - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i4;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z5 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z6 = p(i7, 0, scrollY, scrollRange) && !oVar.g(i6);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f594z.e(0, scrollY2, 0, i7 - scrollY2, this.f588t, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f575g;
        EdgeEffect edgeEffect2 = this.f574f;
        if (i11 < 0) {
            if (z5) {
                h.L1(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z5) {
            h.L1(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            WeakHashMap weakHashMap = v0.f2983a;
            e0.k(this);
        } else if (z6 && i6 == 0) {
            this.f581m.clear();
        }
        if (i6 == 1) {
            w(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i4 < 0) {
                i4 = 0;
            } else if (width + i4 > width2) {
                i4 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i4 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i4, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f582n) {
            this.f582n = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        o oVar = this.f594z;
        if (oVar.f2947d) {
            WeakHashMap weakHashMap = v0.f2983a;
            k0.z(oVar.f2946c);
        }
        oVar.f2947d = z4;
    }

    public void setOnScrollChangeListener(k kVar) {
        this.B = kVar;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f583o = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f594z.h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float fT0 = h.T0(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i4) * 0.35f;
        float f5 = this.f570b * 0.015f;
        double dLog = Math.log(fAbs / f5);
        double d5 = C;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f5))) < fT0;
    }

    public final void u(int i4, int i5, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f571c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f573e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                this.f594z.h(2, 1);
            } else {
                w(1);
            }
            this.f591w = getScrollY();
            WeakHashMap weakHashMap = v0.f2983a;
            e0.k(this);
        } else {
            if (!this.f573e.isFinished()) {
                this.f573e.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.f571c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f574f;
        if (h.T0(edgeEffect) != 0.0f) {
            h.L1(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f575g;
        if (h.T0(edgeEffect2) == 0.0f) {
            return z4;
        }
        h.L1(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.f594z.i(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
