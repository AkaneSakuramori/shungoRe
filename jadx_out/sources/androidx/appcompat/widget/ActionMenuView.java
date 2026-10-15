package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import e.n0;
import f2.e;
import h.b0;
import h.e0;
import h.n;
import h.o;
import h.q;
import i.b4;
import i.d2;
import i.e2;
import i.h;
import i.l;
import i.m;
import i.p;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends e2 implements n, e0 {
    public final int A;
    public p B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0 f435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h.m f436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f438y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f439z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f439z = (int) (56.0f * f5);
        this.A = (int) (f5 * 4.0f);
        this.f431r = context;
        this.f432s = 0;
    }

    public static i.o l() {
        i.o oVar = new i.o(-2, -2);
        oVar.f2718a = false;
        ((LinearLayout.LayoutParams) oVar).gravity = 16;
        return oVar;
    }

    public static i.o m(ViewGroup.LayoutParams layoutParams) {
        i.o oVar;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof i.o) {
            i.o oVar2 = (i.o) layoutParams;
            oVar = new i.o(oVar2);
            oVar.f2718a = oVar2.f2718a;
        } else {
            oVar = new i.o(layoutParams);
        }
        if (((LinearLayout.LayoutParams) oVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) oVar).gravity = 16;
        }
        return oVar;
    }

    @Override // h.e0
    public final void b(o oVar) {
        this.f430q = oVar;
    }

    @Override // i.e2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i.o;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // h.n
    public final boolean e(q qVar) {
        return this.f430q.q(qVar, null, 0);
    }

    @Override // i.e2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // i.e2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f430q == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f430q = oVar;
            int i4 = 5;
            oVar.f2430e = new n0(i4, this);
            m mVar = new m(context);
            this.f434u = mVar;
            mVar.f2667m = true;
            mVar.f2668n = true;
            b0 eVar = this.f435v;
            if (eVar == null) {
                eVar = new e(i4);
            }
            mVar.f2660f = eVar;
            this.f430q.b(mVar, this.f431r);
            m mVar2 = this.f434u;
            mVar2.f2663i = this;
            this.f430q = mVar2.f2658d;
        }
        return this.f430q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m mVar = this.f434u;
        l lVar = mVar.f2664j;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (mVar.f2666l) {
            return mVar.f2665k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f432s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // i.e2
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ d2 generateDefaultLayoutParams() {
        return l();
    }

    @Override // i.e2
    /* JADX INFO: renamed from: i */
    public final d2 generateLayoutParams(AttributeSet attributeSet) {
        return new i.o(getContext(), attributeSet);
    }

    @Override // i.e2
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ d2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i4) {
        boolean zB = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof i.n)) {
            zB = ((i.n) childAt).b();
        }
        return (i4 <= 0 || !(childAt2 instanceof i.n)) ? zB : zB | ((i.n) childAt2).a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m mVar = this.f434u;
        if (mVar != null) {
            mVar.c();
            if (this.f434u.h()) {
                this.f434u.f();
                this.f434u.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f434u;
        if (mVar != null) {
            mVar.f();
            h hVar = mVar.f2675u;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f2346j.dismiss();
        }
    }

    @Override // i.e2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f437x) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i4;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zA = b4.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                i.o oVar = (i.o) childAt.getLayoutParams();
                if (oVar.f2718a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) oVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) oVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) oVar).leftMargin) + ((LinearLayout.LayoutParams) oVar).rightMargin;
                    n(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                i.o oVar2 = (i.o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oVar2.f2718a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) oVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) oVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            i.o oVar3 = (i.o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oVar3.f2718a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) oVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) oVar3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // i.e2, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        ?? r4;
        int i10;
        o oVar;
        boolean z5 = this.f437x;
        boolean z6 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f437x = z6;
        if (z5 != z6) {
            this.f438y = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f437x && (oVar = this.f430q) != null && size != this.f438y) {
            this.f438y = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f437x || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                i.o oVar2 = (i.o) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) oVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) oVar2).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f439z;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int iMax = 0;
        int i18 = 0;
        boolean z7 = false;
        int i19 = 0;
        int iMax2 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.A;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z8) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                i.o oVar3 = (i.o) childAt.getLayoutParams();
                oVar3.f2723f = false;
                oVar3.f2720c = 0;
                oVar3.f2719b = 0;
                oVar3.f2721d = false;
                ((LinearLayout.LayoutParams) oVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) oVar3).rightMargin = 0;
                oVar3.f2722e = z8 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i22 = oVar3.f2718a ? 1 : i14;
                i.o oVar4 = (i.o) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i22 <= 0 || (z9 && i22 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i16, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z9 && i10 < 2) {
                        i10 = 2;
                    }
                }
                oVar4.f2721d = !oVar4.f2718a && z9;
                oVar4.f2719b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i10);
                if (oVar3.f2721d) {
                    i19++;
                }
                if (oVar3.f2718a) {
                    z7 = true;
                }
                i14 -= i10;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j4 |= (long) (1 << i18);
                }
                i17 = i21;
            }
            i18++;
            size3 = i20;
            paddingBottom = paddingBottom;
            i12 = i12;
        }
        int i23 = i12;
        int i24 = size3;
        int i25 = iMax2;
        boolean z10 = z7 && i17 == 2;
        boolean z11 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                i7 = i25;
                z4 = z11;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j5 = 0;
            while (i28 < childCount2) {
                int i29 = i25;
                i.o oVar5 = (i.o) getChildAt(i28).getLayoutParams();
                boolean z12 = z11;
                if (oVar5.f2721d) {
                    int i30 = oVar5.f2719b;
                    if (i30 < i26) {
                        j5 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        i27++;
                        j5 |= 1 << i28;
                    }
                }
                i28++;
                z11 = z12;
                i25 = i29;
            }
            i7 = i25;
            z4 = z11;
            j4 |= j5;
            if (i27 > i14) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                i.o oVar6 = (i.o) childAt2.getLayoutParams();
                int i33 = mode;
                int i34 = childMeasureSpec;
                int i35 = childCount2;
                long j6 = 1 << i32;
                if ((j5 & j6) != 0) {
                    if (z10 && oVar6.f2722e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i6 + i16, 0, i6, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    oVar6.f2719b += r4;
                    oVar6.f2723f = r4;
                    i14--;
                } else if (oVar6.f2719b == i31) {
                    j4 |= j6;
                }
                i32++;
                childMeasureSpec = i34;
                mode = i33;
                childCount2 = i35;
            }
            i25 = i7;
            z11 = true;
        }
        int i36 = childMeasureSpec;
        int i37 = childCount2;
        boolean z13 = !z7 && i17 == 1;
        if (i14 <= 0 || j4 == 0 || (i14 >= i17 - 1 && !z13 && iMax <= 1)) {
            i8 = i37;
        } else {
            float fBitCount = Long.bitCount(j4);
            if (!z13) {
                if ((j4 & 1) != 0 && !((i.o) getChildAt(0).getLayoutParams()).f2722e) {
                    fBitCount -= 0.5f;
                }
                int i38 = i37 - 1;
                if ((j4 & ((long) (1 << i38))) != 0 && !((i.o) getChildAt(i38).getLayoutParams()).f2722e) {
                    fBitCount -= 0.5f;
                }
            }
            int i39 = fBitCount > 0.0f ? (int) ((i14 * i16) / fBitCount) : 0;
            i8 = i37;
            for (int i40 = 0; i40 < i8; i40++) {
                if ((j4 & ((long) (1 << i40))) != 0) {
                    View childAt3 = getChildAt(i40);
                    i.o oVar7 = (i.o) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        oVar7.f2720c = i39;
                        oVar7.f2723f = true;
                        if (i40 == 0 && !oVar7.f2722e) {
                            ((LinearLayout.LayoutParams) oVar7).leftMargin = (-i39) / 2;
                        }
                        z4 = true;
                    } else if (oVar7.f2718a) {
                        oVar7.f2720c = i39;
                        oVar7.f2723f = true;
                        ((LinearLayout.LayoutParams) oVar7).rightMargin = (-i39) / 2;
                        z4 = true;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) oVar7).leftMargin = i39 / 2;
                        }
                        if (i40 != i8 - 1) {
                            ((LinearLayout.LayoutParams) oVar7).rightMargin = i39 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            int i41 = 0;
            while (i41 < i8) {
                View childAt4 = getChildAt(i41);
                i.o oVar8 = (i.o) childAt4.getLayoutParams();
                if (oVar8.f2723f) {
                    i9 = i36;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((oVar8.f2719b * i16) + oVar8.f2720c, 1073741824), i9);
                } else {
                    i9 = i36;
                }
                i41++;
                i36 = i9;
            }
        }
        setMeasuredDimension(i23, mode != 1073741824 ? i7 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f434u.f2672r = z4;
    }

    public void setOnMenuItemClickListener(p pVar) {
        this.B = pVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m mVar = this.f434u;
        l lVar = mVar.f2664j;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            mVar.f2666l = true;
            mVar.f2665k = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f433t = z4;
    }

    public void setPopupTheme(int i4) {
        if (this.f432s != i4) {
            this.f432s = i4;
            if (i4 == 0) {
                this.f431r = getContext();
            } else {
                this.f431r = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(m mVar) {
        this.f434u = mVar;
        mVar.f2663i = this;
        this.f430q = mVar.f2658d;
    }

    @Override // i.e2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i.o(getContext(), attributeSet);
    }
}
