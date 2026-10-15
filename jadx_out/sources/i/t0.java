package i;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends m2 implements v0 {
    public CharSequence D;
    public ListAdapter E;
    public final Rect F;
    public int G;
    public final /* synthetic */ w0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.H = w0Var;
        this.F = new Rect();
        this.f2699p = w0Var;
        this.f2709z = true;
        this.A.setFocusable(true);
        this.f2700q = new e.d(this, 1, w0Var);
    }

    @Override // i.v0
    public final CharSequence b() {
        return this.D;
    }

    @Override // i.v0
    public final void e(int i4, int i5) {
        ViewTreeObserver viewTreeObserver;
        g0 g0Var = this.A;
        boolean zIsShowing = g0Var.isShowing();
        s();
        this.A.setInputMethodMode(2);
        h();
        z1 z1Var = this.f2687d;
        z1Var.setChoiceMode(1);
        o0.d(z1Var, i4);
        o0.c(z1Var, i5);
        w0 w0Var = this.H;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        z1 z1Var2 = this.f2687d;
        if (g0Var.isShowing() && z1Var2 != null) {
            z1Var2.setListSelectionHidden(false);
            z1Var2.setSelection(selectedItemPosition);
            if (z1Var2.getChoiceMode() != 0) {
                z1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = w0Var.getViewTreeObserver()) == null) {
            return;
        }
        h.e eVar = new h.e(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(eVar);
        this.A.setOnDismissListener(new s0(this, eVar));
    }

    @Override // i.v0
    public final void g(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // i.m2, i.v0
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.E = listAdapter;
    }

    @Override // i.v0
    public final void p(int i4) {
        this.G = i4;
    }

    public final void s() {
        int i4;
        g0 g0Var = this.A;
        Drawable background = g0Var.getBackground();
        w0 w0Var = this.H;
        if (background != null) {
            background.getPadding(w0Var.f2822i);
            boolean zA = b4.a(w0Var);
            Rect rect = w0Var.f2822i;
            i4 = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = w0Var.f2822i;
            rect2.right = 0;
            rect2.left = 0;
            i4 = 0;
        }
        int paddingLeft = w0Var.getPaddingLeft();
        int paddingRight = w0Var.getPaddingRight();
        int width = w0Var.getWidth();
        int i5 = w0Var.f2821h;
        if (i5 == -2) {
            int iA = w0Var.a((SpinnerAdapter) this.E, g0Var.getBackground());
            int i6 = w0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = w0Var.f2822i;
            int i7 = (i6 - rect3.left) - rect3.right;
            if (iA > i7) {
                iA = i7;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        this.f2690g = b4.a(w0Var) ? (((width - paddingRight) - this.f2689f) - this.G) + i4 : paddingLeft + this.G + i4;
    }
}
