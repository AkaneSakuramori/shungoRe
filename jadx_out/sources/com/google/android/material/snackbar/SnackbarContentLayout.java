package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c3.h;
import com.shungo.app.R;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;
import o1.a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f1541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f1542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1543d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.l2(context, R.attr.motionEasingEmphasizedInterpolator, a.f3596b);
    }

    public final boolean a(int i4, int i5, int i6) {
        boolean z4;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f1541b.getPaddingTop() == i5 && this.f1541b.getPaddingBottom() == i6) {
            return z4;
        }
        TextView textView = this.f1541b;
        WeakHashMap weakHashMap = v0.f2983a;
        if (f0.g(textView)) {
            f0.k(textView, f0.f(textView), i5, f0.e(textView), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f1542c;
    }

    public TextView getMessageView() {
        return this.f1541b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1541b = (TextView) findViewById(R.id.snackbar_text);
        this.f1542c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1541b.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.f1543d <= 0 || this.f1542c.getMeasuredWidth() <= this.f1543d) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f1543d = i4;
    }
}
