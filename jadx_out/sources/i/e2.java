package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f2580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f2581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f2582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2586p;

    public e2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2572b = true;
        this.f2573c = -1;
        this.f2574d = 0;
        this.f2576f = 8388659;
        int[] iArr = d.a.f1667n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
        i0.v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4);
        int iK = cVar.k(1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = cVar.k(0, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zB = cVar.b(2, true);
        if (!zB) {
            setBaselineAligned(zB);
        }
        this.f2578h = ((TypedArray) cVar.f1780d).getFloat(4, -1.0f);
        this.f2573c = cVar.k(3, -1);
        this.f2579i = cVar.b(7, false);
        setDividerDrawable(cVar.h(5));
        this.f2585o = cVar.k(8, 0);
        this.f2586p = cVar.e(6, 0);
        cVar.v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d2;
    }

    public final void f(Canvas canvas, int i4) {
        this.f2582l.setBounds(getPaddingLeft() + this.f2586p, i4, (getWidth() - getPaddingRight()) - this.f2586p, this.f2584n + i4);
        this.f2582l.draw(canvas);
    }

    public final void g(Canvas canvas, int i4) {
        this.f2582l.setBounds(i4, getPaddingTop() + this.f2586p, this.f2583m + i4, (getHeight() - getPaddingBottom()) - this.f2586p);
        this.f2582l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f2573c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f2573c;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2573c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2574d;
        if (this.f2575e == 1 && (i4 = this.f2576f & 112) != 48) {
            if (i4 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2577g) / 2;
            } else if (i4 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2577g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((d2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2573c;
    }

    public Drawable getDividerDrawable() {
        return this.f2582l;
    }

    public int getDividerPadding() {
        return this.f2586p;
    }

    public int getDividerWidth() {
        return this.f2583m;
    }

    public int getGravity() {
        return this.f2576f;
    }

    public int getOrientation() {
        return this.f2575e;
    }

    public int getShowDividers() {
        return this.f2585o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2578h;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d2 generateDefaultLayoutParams() {
        int i4 = this.f2575e;
        if (i4 == 0) {
            return new d2(-2, -2);
        }
        if (i4 == 1) {
            return new d2(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d2 generateLayoutParams(AttributeSet attributeSet) {
        return new d2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public d2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d2(layoutParams);
    }

    public final boolean k(int i4) {
        if (i4 == 0) {
            return (this.f2585o & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f2585o & 4) != 0;
        }
        if ((this.f2585o & 2) == 0) {
            return false;
        }
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        int bottom;
        if (this.f2582l == null) {
            return;
        }
        int i5 = 0;
        if (this.f2575e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && k(i5)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((d2) childAt.getLayoutParams())).topMargin) - this.f2584n);
                }
                i5++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f2584n;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((d2) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = b4.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i5)) {
                d2 d2Var = (d2) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) d2Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) d2Var).leftMargin) - this.f2583m);
            }
            i5++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                d2 d2Var2 = (d2) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                    i4 = this.f2583m;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) d2Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f2583m;
                right = left - i4;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int paddingLeft;
        int i8;
        int i9;
        int i10;
        int i11;
        int baseline;
        int i12;
        int i13;
        int measuredHeight;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (this.f2575e == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i18 = i6 - i4;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.f2576f;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            if (i20 != 16) {
                paddingTop = i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.f2577g;
            } else {
                paddingTop = getPaddingTop() + (((i7 - i5) - this.f2577g) / 2);
            }
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt != null && childAt.getVisibility() != i17) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    d2 d2Var = (d2) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) d2Var).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, i0.f0.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i16 = ((LinearLayout.LayoutParams) d2Var).leftMargin + paddingLeft2;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) d2Var).rightMargin;
                        }
                        if (k(i22)) {
                            paddingTop += this.f2584n;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i24;
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) d2Var).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) d2Var).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (k(i22)) {
                        paddingTop += this.f2584n;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                    childAt.layout(i16, i25, measuredWidth + i16, i25 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i25;
                }
                i22++;
                i17 = 8;
            }
            return;
        }
        boolean zA = b4.a(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i7 - i5;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.f2576f;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z5 = this.f2572b;
        int[] iArr = this.f2580j;
        int[] iArr2 = this.f2581k;
        WeakHashMap weakHashMap2 = i0.v0.f2983a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, i0.f0.d(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i4) - this.f2577g;
        } else {
            paddingLeft = getPaddingLeft() + (((i6 - i4) - this.f2577g) / 2);
        }
        if (zA) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i30 = 0;
        while (i30 < virtualChildCount2) {
            int i31 = (i8 * i30) + i9;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    d2 d2Var2 = (d2) childAt2.getLayoutParams();
                    if (z5) {
                        i11 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) d2Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i12 = ((LinearLayout.LayoutParams) d2Var2).gravity;
                        if (i12 < 0) {
                            i12 = i29;
                        }
                        i13 = i12 & 112;
                        if (i13 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) d2Var2).topMargin) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                        } else if (i13 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) d2Var2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i13 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (k(i31)) {
                            paddingLeft += this.f2583m;
                        }
                        int i32 = paddingLeft + ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                        childAt2.layout(i32, measuredHeight, i32 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + i32;
                    } else {
                        i11 = virtualChildCount2;
                    }
                    i12 = ((LinearLayout.LayoutParams) d2Var2).gravity;
                    if (i12 < 0) {
                        i12 = i29;
                    }
                    i13 = i12 & 112;
                    if (i13 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) d2Var2).topMargin) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                    } else if (i13 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) d2Var2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i13 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (k(i31)) {
                        paddingLeft += this.f2583m;
                    }
                    int i33 = paddingLeft + ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                    childAt2.layout(i33, measuredHeight, i33 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + i33;
                }
                i30++;
                i9 = i10;
                i8 = i8;
                virtualChildCount2 = i11;
                i29 = i29;
            }
            i11 = virtualChildCount2;
            i30++;
            i9 = i10;
            i8 = i8;
            virtualChildCount2 = i11;
            i29 = i29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0486  */
    /* JADX WARN: Code duplicated, block: B:214:0x048b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0552  */
    /* JADX WARN: Code duplicated, block: B:252:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x055d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0600  */
    /* JADX WARN: Code duplicated, block: B:289:0x060c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:315:0x0698  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:373:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0806  */
    /* JADX WARN: Code duplicated, block: B:388:0x083d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0860  */
    /* JADX WARN: Code duplicated, block: B:393:0x086e  */
    /* JADX WARN: Code duplicated, block: B:395:0x087a  */
    /* JADX WARN: Code duplicated, block: B:397:0x0886  */
    /* JADX WARN: Code duplicated, block: B:398:0x089b  */
    /* JADX WARN: Code duplicated, block: B:429:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        char c5;
        int iMax;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        char c6;
        int i10;
        View childAt;
        int i11;
        int i12;
        int i13;
        int baseline;
        int i14;
        int iMakeMeasureSpec;
        int i15;
        View childAt2;
        d2 d2Var;
        int i16;
        View childAt3;
        d2 d2Var2;
        float f6;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z4;
        boolean z5;
        d2 d2Var3;
        int measuredWidth;
        boolean z6;
        int i23;
        boolean z7;
        int i24;
        int measuredHeight;
        boolean z8;
        int baseline2;
        int i25;
        int i26;
        boolean z9;
        int i27;
        int i28;
        boolean z10;
        d2 d2Var4;
        boolean z11;
        int i29;
        boolean z12;
        int iMax2;
        int i30 = -2;
        int i31 = 1073741824;
        int i32 = 8;
        int i33 = Integer.MIN_VALUE;
        float f7 = 0.0f;
        boolean z13 = true;
        if (this.f2575e == 1) {
            this.f2577g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i34 = this.f2573c;
            boolean z14 = this.f2579i;
            boolean z15 = true;
            int i35 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z16 = false;
            int iMax5 = 0;
            int i36 = 0;
            int i37 = 0;
            boolean z17 = false;
            float f8 = 0.0f;
            while (i35 < virtualChildCount) {
                View childAt4 = getChildAt(i35);
                if (childAt4 == null) {
                    this.f2577g = this.f2577g;
                } else {
                    if (childAt4.getVisibility() != i32) {
                        if (k(i35)) {
                            this.f2577g += this.f2584n;
                        }
                        d2 d2Var5 = (d2) childAt4.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) d2Var5).weight;
                        f8 += f9;
                        if (mode2 == i31 && ((LinearLayout.LayoutParams) d2Var5).height == 0 && f9 > f7) {
                            int i38 = this.f2577g;
                            this.f2577g = Math.max(i38, ((LinearLayout.LayoutParams) d2Var5).topMargin + i38 + ((LinearLayout.LayoutParams) d2Var5).bottomMargin);
                            i34 = i34;
                            d2Var4 = d2Var5;
                            z11 = true;
                            z10 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) d2Var5).height != 0 || f9 <= f7) {
                                i28 = i33;
                            } else {
                                ((LinearLayout.LayoutParams) d2Var5).height = i30;
                                i28 = 0;
                            }
                            int i39 = f8 == f7 ? this.f2577g : 0;
                            z10 = true;
                            d2Var4 = d2Var5;
                            measureChildWithMargins(childAt4, i4, 0, i5, i39);
                            if (i28 != i33) {
                                ((LinearLayout.LayoutParams) d2Var4).height = i28;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i40 = this.f2577g;
                            this.f2577g = Math.max(i40, i40 + measuredHeight2 + ((LinearLayout.LayoutParams) d2Var4).topMargin + ((LinearLayout.LayoutParams) d2Var4).bottomMargin);
                            int i41 = iMax5;
                            if (z14) {
                                iMax5 = Math.max(measuredHeight2, i41);
                            }
                            z11 = z16;
                        }
                        if (i34 >= 0 && i34 == i35 + 1) {
                            this.f2574d = this.f2577g;
                        }
                        if (i35 < i34 && ((LinearLayout.LayoutParams) d2Var4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i29 = mode;
                        if (i29 == 1073741824 || ((LinearLayout.LayoutParams) d2Var4).width != -1) {
                            z12 = false;
                        } else {
                            z12 = z10;
                            z17 = z12;
                        }
                        int i42 = ((LinearLayout.LayoutParams) d2Var4).leftMargin + ((LinearLayout.LayoutParams) d2Var4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i42;
                        iMax2 = Math.max(i36, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i37, childAt4.getMeasuredState());
                        boolean z18 = (z15 && ((LinearLayout.LayoutParams) d2Var4).width == -1) ? z10 : false;
                        if (((LinearLayout.LayoutParams) d2Var4).weight > 0.0f) {
                            if (!z12) {
                                i42 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i42);
                        } else {
                            int i43 = iMax4;
                            if (!z12) {
                                i42 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i42);
                            iMax4 = i43;
                        }
                        z16 = z11;
                        i37 = iCombineMeasuredStates;
                        z15 = z18;
                    }
                    i35++;
                    mode = i29;
                    i36 = iMax2;
                    i34 = i34;
                    z13 = z10;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i30 = -2;
                    i31 = 1073741824;
                    i32 = 8;
                    i33 = Integer.MIN_VALUE;
                    f7 = 0.0f;
                }
                i34 = i34;
                mode2 = mode2;
                i29 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i36;
                z10 = true;
                i35++;
                mode = i29;
                i36 = iMax2;
                i34 = i34;
                z13 = z10;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i30 = -2;
                i31 = 1073741824;
                i32 = 8;
                i33 = Integer.MIN_VALUE;
                f7 = 0.0f;
            }
            int i44 = mode2;
            int i45 = mode;
            int i46 = virtualChildCount;
            boolean z19 = z13;
            int iMax6 = iMax3;
            int i47 = iMax4;
            int i48 = iMax5;
            int i49 = i36;
            int iCombineMeasuredStates2 = i37;
            if (this.f2577g > 0 && k(i46)) {
                this.f2577g += this.f2584n;
            }
            int i50 = i44;
            if (z14 && (i50 == Integer.MIN_VALUE || i50 == 0)) {
                this.f2577g = 0;
                for (int i51 = 0; i51 < i46; i51++) {
                    View childAt5 = getChildAt(i51);
                    if (childAt5 == null) {
                        this.f2577g = this.f2577g;
                    } else if (childAt5.getVisibility() != 8) {
                        d2 d2Var6 = (d2) childAt5.getLayoutParams();
                        int i52 = this.f2577g;
                        this.f2577g = Math.max(i52, i52 + i48 + ((LinearLayout.LayoutParams) d2Var6).topMargin + ((LinearLayout.LayoutParams) d2Var6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2577g;
            this.f2577g = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, 0);
            int i53 = (16777215 & iResolveSizeAndState) - this.f2577g;
            if (z16 || (i53 != 0 && f8 > 0.0f)) {
                float f10 = this.f2578h;
                if (f10 > 0.0f) {
                    f8 = f10;
                }
                this.f2577g = 0;
                int i54 = 0;
                while (i54 < i46) {
                    View childAt6 = getChildAt(i54);
                    if (childAt6.getVisibility() == 8) {
                        i25 = i50;
                    } else {
                        d2 d2Var7 = (d2) childAt6.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) d2Var7).weight;
                        if (f11 > 0.0f) {
                            int i55 = (int) ((i53 * f11) / f8);
                            f8 -= f11;
                            int i56 = i53 - i55;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) d2Var7).leftMargin + ((LinearLayout.LayoutParams) d2Var7).rightMargin, ((LinearLayout.LayoutParams) d2Var7).width);
                            if (((LinearLayout.LayoutParams) d2Var7).height == 0) {
                                i27 = 1073741824;
                                if (i50 == 1073741824) {
                                    if (i55 <= 0) {
                                        i55 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i55, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i53 = i56;
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i55;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i27));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i53 = i56;
                        }
                        int i57 = ((LinearLayout.LayoutParams) d2Var7).leftMargin + ((LinearLayout.LayoutParams) d2Var7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i57;
                        int iMax7 = Math.max(i49, measuredWidth3);
                        if (i45 != 1073741824) {
                            i25 = i50;
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) d2Var7).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i57);
                            if (z15 || ((LinearLayout.LayoutParams) d2Var7).width != i26) {
                                z9 = false;
                            } else {
                                z9 = z19;
                            }
                            int i58 = this.f2577g;
                            this.f2577g = Math.max(i58, childAt6.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) d2Var7).topMargin + ((LinearLayout.LayoutParams) d2Var7).bottomMargin);
                            z15 = z9;
                            i49 = iMax7;
                        } else {
                            i25 = i50;
                            i26 = -1;
                        }
                        i57 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i57);
                        if (z15) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        int i59 = this.f2577g;
                        this.f2577g = Math.max(i59, childAt6.getMeasuredHeight() + i59 + ((LinearLayout.LayoutParams) d2Var7).topMargin + ((LinearLayout.LayoutParams) d2Var7).bottomMargin);
                        z15 = z9;
                        i49 = iMax7;
                    }
                    i54++;
                    i50 = i25;
                }
                this.f2577g = getPaddingBottom() + getPaddingTop() + this.f2577g;
            } else {
                iMax6 = Math.max(iMax6, i47);
                if (z14 && i50 != 1073741824) {
                    for (int i60 = 0; i60 < i46; i60++) {
                        View childAt7 = getChildAt(i60);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d2) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i48, 1073741824));
                        }
                    }
                }
            }
            int i61 = i49;
            if (z15 || i45 == 1073741824) {
                iMax6 = i61;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i4, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z17) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i62 = 0; i62 < i46; i62++) {
                    View childAt8 = getChildAt(i62);
                    if (childAt8.getVisibility() != 8) {
                        d2 d2Var8 = (d2) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) d2Var8).width == -1) {
                            int i63 = ((LinearLayout.LayoutParams) d2Var8).height;
                            ((LinearLayout.LayoutParams) d2Var8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i5, 0);
                            ((LinearLayout.LayoutParams) d2Var8).height = i63;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2577g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i4);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (this.f2580j == null || this.f2581k == null) {
            this.f2580j = new int[4];
            this.f2581k = new int[4];
        }
        int[] iArr = this.f2580j;
        int[] iArr2 = this.f2581k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z20 = this.f2572b;
        boolean z21 = this.f2579i;
        boolean z22 = mode3 == 1073741824;
        boolean z23 = true;
        int iMax8 = 0;
        float f12 = 0.0f;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i65 < virtualChildCount2) {
            View childAt9 = getChildAt(i65);
            if (childAt9 == null) {
                this.f2577g = this.f2577g;
                i22 = i65;
                z4 = z21;
                z5 = z20;
            } else {
                int i67 = iMax8;
                int i68 = i64;
                if (childAt9.getVisibility() == 8) {
                    z5 = z20;
                    iMax8 = i67;
                    i64 = i68;
                    i22 = i65;
                    z4 = z21;
                } else {
                    if (k(i65)) {
                        this.f2577g += this.f2583m;
                    }
                    d2 d2Var9 = (d2) childAt9.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) d2Var9).weight;
                    float f14 = f12 + f13;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) d2Var9).width == 0 && f13 > 0.0f) {
                        if (z22) {
                            this.f2577g = ((LinearLayout.LayoutParams) d2Var9).leftMargin + ((LinearLayout.LayoutParams) d2Var9).rightMargin + this.f2577g;
                        } else {
                            int i69 = this.f2577g;
                            this.f2577g = Math.max(i69, ((LinearLayout.LayoutParams) d2Var9).leftMargin + i69 + ((LinearLayout.LayoutParams) d2Var9).rightMargin);
                        }
                        if (z20) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            d2Var3 = d2Var9;
                            i19 = i67;
                            i20 = i68;
                            i22 = i65;
                            z4 = z21;
                            z5 = z20;
                        } else {
                            d2Var3 = d2Var9;
                            i19 = i67;
                            i20 = i68;
                            i22 = i65;
                            i23 = 1073741824;
                            z4 = z21;
                            z5 = z20;
                            z6 = true;
                        }
                        if (mode4 == i23 && ((LinearLayout.LayoutParams) d2Var3).height == -1) {
                            z7 = true;
                            z25 = true;
                        } else {
                            z7 = false;
                        }
                        i24 = ((LinearLayout.LayoutParams) d2Var3).topMargin + ((LinearLayout.LayoutParams) d2Var3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i24;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                        if (!z5 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i70 = ((LinearLayout.LayoutParams) d2Var3).gravity;
                            if (i70 < 0) {
                                i70 = this.f2576f;
                            }
                            int i71 = (((i70 & 112) >> 4) & (-2)) >> 1;
                            iArr[i71] = Math.max(iArr[i71], baseline2);
                            iArr2[i71] = Math.max(iArr2[i71], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i20, measuredHeight);
                        if (z23 || ((LinearLayout.LayoutParams) d2Var3).height != -1) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (((LinearLayout.LayoutParams) d2Var3).weight > 0.0f) {
                            if (z7) {
                                measuredHeight = i24;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i19;
                        } else {
                            if (z7) {
                                measuredHeight = i24;
                            }
                            iMax8 = Math.max(i19, measuredHeight);
                        }
                        i64 = iMax11;
                        i66 = iCombineMeasuredStates3;
                        z24 = z6;
                        z23 = z8;
                        f12 = f14;
                    } else {
                        int i72 = i65;
                        if (((LinearLayout.LayoutParams) d2Var9).width == 0) {
                            f6 = 0.0f;
                            if (f13 > 0.0f) {
                                ((LinearLayout.LayoutParams) d2Var9).width = -2;
                                i17 = 0;
                            }
                            if (f14 == f6) {
                                i18 = this.f2577g;
                            } else {
                                i18 = 0;
                            }
                            i19 = i67;
                            i20 = i68;
                            i21 = i17;
                            i22 = i72;
                            z4 = z21;
                            z5 = z20;
                            measureChildWithMargins(childAt9, i4, i18, i5, 0);
                            if (i21 != Integer.MIN_VALUE) {
                                d2Var3 = d2Var9;
                                ((LinearLayout.LayoutParams) d2Var3).width = i21;
                            } else {
                                d2Var3 = d2Var9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z22) {
                                this.f2577g = ((LinearLayout.LayoutParams) d2Var3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) d2Var3).rightMargin + this.f2577g;
                            } else {
                                int i73 = this.f2577g;
                                this.f2577g = Math.max(i73, i73 + measuredWidth + ((LinearLayout.LayoutParams) d2Var3).leftMargin + ((LinearLayout.LayoutParams) d2Var3).rightMargin);
                            }
                            if (z4) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f6 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        if (f14 == f6) {
                            i18 = this.f2577g;
                        } else {
                            i18 = 0;
                        }
                        i19 = i67;
                        i20 = i68;
                        i21 = i17;
                        i22 = i72;
                        z4 = z21;
                        z5 = z20;
                        measureChildWithMargins(childAt9, i4, i18, i5, 0);
                        if (i21 != Integer.MIN_VALUE) {
                            d2Var3 = d2Var9;
                            ((LinearLayout.LayoutParams) d2Var3).width = i21;
                        } else {
                            d2Var3 = d2Var9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z22) {
                            this.f2577g = ((LinearLayout.LayoutParams) d2Var3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) d2Var3).rightMargin + this.f2577g;
                        } else {
                            int i74 = this.f2577g;
                            this.f2577g = Math.max(i74, i74 + measuredWidth + ((LinearLayout.LayoutParams) d2Var3).leftMargin + ((LinearLayout.LayoutParams) d2Var3).rightMargin);
                        }
                        if (z4) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z6 = z24;
                    i23 = 1073741824;
                    if (mode4 == i23) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    i24 = ((LinearLayout.LayoutParams) d2Var3).topMargin + ((LinearLayout.LayoutParams) d2Var3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i24;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                    if (!z5) {
                    }
                    int iMax12 = Math.max(i20, measuredHeight);
                    if (z23) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (((LinearLayout.LayoutParams) d2Var3).weight > 0.0f) {
                        if (z7) {
                            measuredHeight = i24;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i19;
                    } else {
                        if (z7) {
                            measuredHeight = i24;
                        }
                        iMax8 = Math.max(i19, measuredHeight);
                    }
                    i64 = iMax12;
                    i66 = iCombineMeasuredStates4;
                    z24 = z6;
                    z23 = z8;
                    f12 = f14;
                }
            }
            i65 = i22 + 1;
            z21 = z4;
            z20 = z5;
        }
        int i75 = i64;
        boolean z26 = z21;
        boolean z27 = z20;
        if (this.f2577g > 0 && k(virtualChildCount2)) {
            this.f2577g += this.f2583m;
        }
        int i76 = iArr[1];
        if (i76 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c5 = 3;
            if (iArr[3] == -1) {
                iMax = i75;
            }
            if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f2577g = 0;
                for (i16 = 0; i16 < virtualChildCount2; i16++) {
                    childAt3 = getChildAt(i16);
                    if (childAt3 == null) {
                        this.f2577g = this.f2577g;
                    } else if (childAt3.getVisibility() == 8) {
                        d2Var2 = (d2) childAt3.getLayoutParams();
                        if (z22) {
                            this.f2577g = ((LinearLayout.LayoutParams) d2Var2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + this.f2577g;
                        } else {
                            int i77 = this.f2577g;
                            this.f2577g = Math.max(i77, i77 + iMax9 + ((LinearLayout.LayoutParams) d2Var2).leftMargin + ((LinearLayout.LayoutParams) d2Var2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2577g;
            this.f2577g = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, 0);
            i6 = (16777215 & iResolveSizeAndState2) - this.f2577g;
            if (!z24 || (i6 != 0 && f12 > 0.0f)) {
                f5 = this.f2578h;
                if (f5 > 0.0f) {
                    f12 = f5;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f2577g = 0;
                int iCombineMeasuredStates5 = i66;
                iMax = -1;
                i7 = 0;
                while (i7 < virtualChildCount2) {
                    childAt = getChildAt(i7);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i11 = i6;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        d2 d2Var10 = (d2) childAt.getLayoutParams();
                        float f15 = ((LinearLayout.LayoutParams) d2Var10).weight;
                        if (f15 > 0.0f) {
                            int i78 = (int) ((i6 * f15) / f12);
                            float f16 = f12 - f15;
                            int i79 = i6 - i78;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) d2Var10).topMargin + ((LinearLayout.LayoutParams) d2Var10).bottomMargin, ((LinearLayout.LayoutParams) d2Var10).height);
                            if (((LinearLayout.LayoutParams) d2Var10).width == 0) {
                                i14 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i78 <= 0) {
                                        i78 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f12 = f16;
                                i12 = i79;
                            } else {
                                i14 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i78;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f12 = f16;
                            i12 = i79;
                        } else {
                            i12 = i6;
                        }
                        if (z22) {
                            this.f2577g = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) d2Var10).leftMargin + ((LinearLayout.LayoutParams) d2Var10).rightMargin + this.f2577g;
                        } else {
                            int i80 = this.f2577g;
                            this.f2577g = Math.max(i80, childAt.getMeasuredWidth() + i80 + ((LinearLayout.LayoutParams) d2Var10).leftMargin + ((LinearLayout.LayoutParams) d2Var10).rightMargin);
                        }
                        boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) d2Var10).height == -1;
                        int i81 = ((LinearLayout.LayoutParams) d2Var10).topMargin + ((LinearLayout.LayoutParams) d2Var10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i81;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z28) {
                            i81 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i81);
                        if (z23) {
                            i13 = -1;
                            boolean z29 = ((LinearLayout.LayoutParams) d2Var10).height == -1;
                            if (!z27 && (baseline = childAt.getBaseline()) != i13) {
                                int i82 = ((LinearLayout.LayoutParams) d2Var10).gravity;
                                if (i82 < 0) {
                                    i82 = this.f2576f;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                iArr[i83] = Math.max(iArr[i83], baseline);
                                iArr2[i83] = Math.max(iArr2[i83], measuredHeight4 - baseline);
                            }
                            z23 = z29;
                            i11 = i12;
                            f12 = f12;
                        } else {
                            i13 = -1;
                        }
                        if (!z27) {
                        }
                        z23 = z29;
                        i11 = i12;
                        f12 = f12;
                    }
                    i7++;
                    i6 = i11;
                    virtualChildCount2 = virtualChildCount2;
                }
                i8 = virtualChildCount2;
                this.f2577g = getPaddingRight() + getPaddingLeft() + this.f2577g;
                i9 = iArr[1];
                if (i9 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c6 = 3;
                    if (iArr[3] == -1) {
                        i10 = 0;
                    }
                    i66 = iCombineMeasuredStates5;
                } else {
                    c6 = 3;
                }
                i10 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i9, iArr[2]))));
                i66 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z26 && mode3 != 1073741824) {
                    for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                        View childAt10 = getChildAt(i84);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d2) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i8 = virtualChildCount2;
                i10 = 0;
            }
            if (z23 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i66 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i5, i66 << 16));
            if (z25) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i15 = i8;
                while (i10 < i15) {
                    childAt2 = getChildAt(i10);
                    if (childAt2.getVisibility() != 8) {
                        d2Var = (d2) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) d2Var).height == -1) {
                            int i85 = ((LinearLayout.LayoutParams) d2Var).width;
                            ((LinearLayout.LayoutParams) d2Var).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i4, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) d2Var).width = i85;
                        }
                    }
                    i10++;
                }
            }
        }
        c5 = 3;
        iMax = Math.max(i75, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c5], Math.max(iArr[0], Math.max(i76, iArr[2]))));
        if (z26) {
            this.f2577g = 0;
            while (i16 < virtualChildCount2) {
                childAt3 = getChildAt(i16);
                if (childAt3 == null) {
                    this.f2577g = this.f2577g;
                } else if (childAt3.getVisibility() == 8) {
                    d2Var2 = (d2) childAt3.getLayoutParams();
                    if (z22) {
                        this.f2577g = ((LinearLayout.LayoutParams) d2Var2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + this.f2577g;
                    } else {
                        int i710 = this.f2577g;
                        this.f2577g = Math.max(i710, i710 + iMax9 + ((LinearLayout.LayoutParams) d2Var2).leftMargin + ((LinearLayout.LayoutParams) d2Var2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2577g;
        this.f2577g = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i4, 0);
        i6 = (16777215 & iResolveSizeAndState3) - this.f2577g;
        if (z24) {
            f5 = this.f2578h;
            if (f5 > 0.0f) {
                f12 = f5;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f2577g = 0;
            int iCombineMeasuredStates6 = i66;
            iMax = -1;
            i7 = 0;
            while (i7 < virtualChildCount2) {
                childAt = getChildAt(i7);
                if (childAt != null) {
                    i11 = i6;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i11 = i6;
                    virtualChildCount2 = virtualChildCount2;
                }
                i7++;
                i6 = i11;
                virtualChildCount2 = virtualChildCount2;
            }
            i8 = virtualChildCount2;
            this.f2577g = getPaddingRight() + getPaddingLeft() + this.f2577g;
            i9 = iArr[1];
            if (i9 != -1) {
                c6 = 3;
                i10 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i9, iArr[2]))));
            } else {
                c6 = 3;
                i10 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i9, iArr[2]))));
            }
            i66 = iCombineMeasuredStates6;
        } else {
            f5 = this.f2578h;
            if (f5 > 0.0f) {
                f12 = f5;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f2577g = 0;
            int iCombineMeasuredStates7 = i66;
            iMax = -1;
            i7 = 0;
            while (i7 < virtualChildCount2) {
                childAt = getChildAt(i7);
                if (childAt != null) {
                    i11 = i6;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i11 = i6;
                    virtualChildCount2 = virtualChildCount2;
                }
                i7++;
                i6 = i11;
                virtualChildCount2 = virtualChildCount2;
            }
            i8 = virtualChildCount2;
            this.f2577g = getPaddingRight() + getPaddingLeft() + this.f2577g;
            i9 = iArr[1];
            if (i9 != -1) {
                c6 = 3;
                i10 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i9, iArr[2]))));
            } else {
                c6 = 3;
                i10 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i9, iArr[2]))));
            }
            i66 = iCombineMeasuredStates7;
        }
        if (z23) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i66 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i5, i66 << 16));
        if (z25) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i15 = i8;
            while (i10 < i15) {
                childAt2 = getChildAt(i10);
                if (childAt2.getVisibility() != 8) {
                    d2Var = (d2) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) d2Var).height == -1) {
                        int i86 = ((LinearLayout.LayoutParams) d2Var).width;
                        ((LinearLayout.LayoutParams) d2Var).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i4, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) d2Var).width = i86;
                    }
                }
                i10++;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f2572b = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f2573c = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2582l) {
            return;
        }
        this.f2582l = drawable;
        if (drawable != null) {
            this.f2583m = drawable.getIntrinsicWidth();
            this.f2584n = drawable.getIntrinsicHeight();
        } else {
            this.f2583m = 0;
            this.f2584n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f2586p = i4;
    }

    public void setGravity(int i4) {
        if (this.f2576f != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f2576f = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f2576f;
        if ((8388615 & i6) != i5) {
            this.f2576f = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f2579i = z4;
    }

    public void setOrientation(int i4) {
        if (this.f2575e != i4) {
            this.f2575e = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f2585o) {
            requestLayout();
        }
        this.f2585o = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f2576f;
        if ((i6 & 112) != i5) {
            this.f2576f = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.f2578h = Math.max(0.0f, f5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
