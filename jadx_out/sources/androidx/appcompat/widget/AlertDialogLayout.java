package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.shungo.app.R;
import i.d2;
import i.e2;
import i0.e0;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends e2 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int l(View view) {
        WeakHashMap weakHashMap = v0.f2983a;
        int iD = e0.d(view);
        if (iD > 0) {
            return iD;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    @Override // i.e2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i4;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - measuredHeight : (((i7 - i5) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                d2 d2Var = (d2) childAt.getLayoutParams();
                int i15 = ((LinearLayout.LayoutParams) d2Var).gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                WeakHashMap weakHashMap = v0.f2983a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, f0.d(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i10 = ((LinearLayout.LayoutParams) d2Var).leftMargin + paddingLeft;
                    } else {
                        i8 = paddingRight - measuredWidth;
                        i9 = ((LinearLayout.LayoutParams) d2Var).rightMargin;
                    }
                    if (k(i14)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                    childAt.layout(i10, i16, measuredWidth + i10, i16 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i16;
                } else {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) d2Var).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) d2Var).rightMargin;
                }
                i10 = i8 - i9;
                if (k(i14)) {
                    paddingTop += intrinsicHeight;
                }
                int i17 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                childAt.layout(i10, i17, measuredWidth + i10, i17 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i17;
            }
        }
    }

    @Override // i.e2, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iCombineMeasuredStates;
        int iL;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i4, i5);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i4, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            iL = l(view2);
            measuredHeight = view2.getMeasuredHeight() - iL;
            paddingBottom += iL;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iL = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i4, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i7 = size - paddingBottom;
        if (view2 != null) {
            int i8 = paddingBottom - iL;
            int iMin = Math.min(i7, measuredHeight);
            if (iMin > 0) {
                i7 -= iMin;
                iL += iMin;
            }
            view2.measure(i4, View.MeasureSpec.makeMeasureSpec(iL, 1073741824));
            paddingBottom = i8 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i7 > 0) {
            view3.measure(i4, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i7, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i4, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i5, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt3 = getChildAt(i10);
                if (childAt3.getVisibility() != 8) {
                    d2 d2Var = (d2) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) d2Var).width == -1) {
                        int i11 = ((LinearLayout.LayoutParams) d2Var).height;
                        ((LinearLayout.LayoutParams) d2Var).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i5, 0);
                        ((LinearLayout.LayoutParams) d2Var).height = i11;
                    }
                }
            }
        }
    }
}
