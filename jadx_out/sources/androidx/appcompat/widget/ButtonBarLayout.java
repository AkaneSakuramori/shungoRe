package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.shungo.app.R;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f443d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f443d = -1;
        int[] iArr = d.a.f1664k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f441b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f441b);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f442c != z4) {
            if (!z4 || this.f441b) {
                this.f442c = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[LOOP:0: B:26:0x0051->B:31:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[LOOP:1: B:37:0x0087->B:41:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0063 A[EDGE_INSN: B:53:0x0063->B:33:0x0063 BREAK  A[LOOP:0: B:26:0x0051->B:31:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int childCount;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int childCount2;
        int size = View.MeasureSpec.getSize(i4);
        int paddingBottom = 0;
        if (this.f441b) {
            if (size > this.f443d && this.f442c) {
                setStacked(false);
            }
            this.f443d = size;
        }
        if (this.f442c || View.MeasureSpec.getMode(i4) != 1073741824) {
            iMakeMeasureSpec = i4;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i5);
        if (!this.f441b || this.f442c || (getMeasuredWidthAndState() & (-16777216)) != 16777216) {
            if (z4) {
            }
            childCount = getChildCount();
            i6 = 0;
            while (true) {
                i7 = -1;
                if (i6 < childCount) {
                    i6 = -1;
                    break;
                } else if (getChildAt(i6).getVisibility() == 0) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 >= 0) {
                View childAt = getChildAt(i6);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (this.f442c) {
                    childCount2 = getChildCount();
                    for (i8 = i6 + 1; i8 < childCount2; i8++) {
                        if (getChildAt(i8).getVisibility() == 0) {
                            i7 = i8;
                            break;
                        }
                    }
                    if (i7 >= 0) {
                        paddingBottom = getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                    } else {
                        paddingBottom = measuredHeight;
                    }
                } else {
                    paddingBottom = getPaddingBottom() + measuredHeight;
                }
            }
            WeakHashMap weakHashMap = v0.f2983a;
            if (e0.d(this) != paddingBottom) {
                setMinimumHeight(paddingBottom);
                if (i5 == 0) {
                    super.onMeasure(i4, i5);
                }
            }
        }
        setStacked(true);
        super.onMeasure(i4, i5);
        childCount = getChildCount();
        i6 = 0;
        while (true) {
            i7 = -1;
            if (i6 < childCount) {
                i6 = -1;
                break;
            } else {
                if (getChildAt(i6).getVisibility() == 0) {
                    break;
                    break;
                }
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt2 = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = childAt2.getMeasuredHeight() + getPaddingTop() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (this.f442c) {
                childCount2 = getChildCount();
                while (i8 < childCount2) {
                    if (getChildAt(i8).getVisibility() == 0) {
                        i7 = i8;
                        break;
                    }
                }
                if (i7 >= 0) {
                    paddingBottom = getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    paddingBottom = measuredHeight;
                }
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap2 = v0.f2983a;
        if (e0.d(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f441b != z4) {
            this.f441b = z4;
            if (!z4 && this.f442c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
