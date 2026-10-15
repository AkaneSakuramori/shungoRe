package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class u extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f2783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f2784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f2785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        n3.a(context);
        m3.a(this, getContext());
        e1 e1Var = new e1(this);
        this.f2784d = e1Var;
        e1Var.f(attributeSet, R.attr.checkedTextViewStyle);
        e1Var.b();
        r rVar = new r(this);
        this.f2783c = rVar;
        rVar.e(attributeSet, R.attr.checkedTextViewStyle);
        v vVar = new v(this, 0);
        this.f2782b = vVar;
        vVar.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f2785e == null) {
            this.f2785e = new b0(this);
        }
        return this.f2785e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e1 e1Var = this.f2784d;
        if (e1Var != null) {
            e1Var.b();
        }
        r rVar = this.f2783c;
        if (rVar != null) {
            rVar.a();
        }
        v vVar = this.f2782b;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof m0.t ? ((m0.t) customSelectionActionModeCallback).f3438a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2783c;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2783c;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        v vVar = this.f2782b;
        if (vVar != null) {
            return vVar.f2797b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        v vVar = this.f2782b;
        if (vVar != null) {
            return vVar.f2798c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2784d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2784d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        r3.q.n(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2783c;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2783c;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        v vVar = this.f2782b;
        if (vVar != null) {
            if (vVar.f2801f) {
                vVar.f2801f = false;
            } else {
                vVar.f2801f = true;
                vVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2784d;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2784d;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c3.h.M2(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2783c;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2783c;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        v vVar = this.f2782b;
        if (vVar != null) {
            vVar.f2797b = colorStateList;
            vVar.f2799d = true;
            vVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        v vVar = this.f2782b;
        if (vVar != null) {
            vVar.f2798c = mode;
            vVar.f2800e = true;
            vVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e1 e1Var = this.f2784d;
        e1Var.l(colorStateList);
        e1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e1 e1Var = this.f2784d;
        e1Var.m(mode);
        e1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e1 e1Var = this.f2784d;
        if (e1Var != null) {
            e1Var.g(context, i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(r3.q.g(getContext(), i4));
    }
}
