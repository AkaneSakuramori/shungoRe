package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends RadioButton implements m0.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f2611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f2612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f2613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        n3.a(context);
        m3.a(this, getContext());
        v vVar = new v(this, 1);
        this.f2610b = vVar;
        vVar.c(attributeSet, R.attr.radioButtonStyle);
        r rVar = new r(this);
        this.f2611c = rVar;
        rVar.e(attributeSet, R.attr.radioButtonStyle);
        e1 e1Var = new e1(this);
        this.f2612d = e1Var;
        e1Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f2613e == null) {
            this.f2613e = new b0(this);
        }
        return this.f2613e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2611c;
        if (rVar != null) {
            rVar.a();
        }
        e1 e1Var = this.f2612d;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        v vVar = this.f2610b;
        if (vVar != null) {
            vVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2611c;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2611c;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // m0.v
    public ColorStateList getSupportButtonTintList() {
        v vVar = this.f2610b;
        if (vVar != null) {
            return vVar.f2797b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        v vVar = this.f2610b;
        if (vVar != null) {
            return vVar.f2798c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2612d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2612d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2611c;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2611c;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        v vVar = this.f2610b;
        if (vVar != null) {
            if (vVar.f2801f) {
                vVar.f2801f = false;
            } else {
                vVar.f2801f = true;
                vVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2612d;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2612d;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((f2.e) getEmojiTextViewHelper().f2524b.f1896c).u(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2611c;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2611c;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // m0.v
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        v vVar = this.f2610b;
        if (vVar != null) {
            vVar.f2797b = colorStateList;
            vVar.f2799d = true;
            vVar.a();
        }
    }

    @Override // m0.v
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        v vVar = this.f2610b;
        if (vVar != null) {
            vVar.f2798c = mode;
            vVar.f2800e = true;
            vVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e1 e1Var = this.f2612d;
        e1Var.l(colorStateList);
        e1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e1 e1Var = this.f2612d;
        e1Var.m(mode);
        e1Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(r3.q.g(getContext(), i4));
    }
}
