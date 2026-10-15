package i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class s extends Button {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f2769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f2770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        n3.a(context);
        m3.a(this, getContext());
        r rVar = new r(this);
        this.f2768b = rVar;
        rVar.e(attributeSet, i4);
        e1 e1Var = new e1(this);
        this.f2769c = e1Var;
        e1Var.f(attributeSet, i4);
        e1Var.b();
        getEmojiTextViewHelper().a(attributeSet, i4);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f2770d == null) {
            this.f2770d = new b0(this);
        }
        return this.f2770d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2768b;
        if (rVar != null) {
            rVar.a();
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b4.f2530b) {
            return super.getAutoSizeMaxTextSize();
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            return Math.round(e1Var.f2567i.f2730e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b4.f2530b) {
            return super.getAutoSizeMinTextSize();
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            return Math.round(e1Var.f2567i.f2729d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b4.f2530b) {
            return super.getAutoSizeStepGranularity();
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            return Math.round(e1Var.f2567i.f2728c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b4.f2530b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e1 e1Var = this.f2769c;
        return e1Var != null ? e1Var.f2567i.f2731f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b4.f2530b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            return e1Var.f2567i.f2726a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof m0.t ? ((m0.t) customSelectionActionModeCallback).f3438a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2768b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2768b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2769c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2769c.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        e1 e1Var = this.f2769c;
        if (e1Var == null || b4.f2530b) {
            return;
        }
        e1Var.f2567i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        e1 e1Var = this.f2769c;
        if (e1Var == null || b4.f2530b) {
            return;
        }
        o1 o1Var = e1Var.f2567i;
        if (o1Var.f()) {
            o1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (b4.f2530b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.i(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (b4.f2530b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.j(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (b4.f2530b) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2768b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2768b;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c3.h.M2(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((f2.e) getEmojiTextViewHelper().f2524b.f1896c).u(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.f2559a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2768b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2768b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e1 e1Var = this.f2769c;
        e1Var.l(colorStateList);
        e1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e1 e1Var = this.f2769c;
        e1Var.m(mode);
        e1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e1 e1Var = this.f2769c;
        if (e1Var != null) {
            e1Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f5) {
        boolean z4 = b4.f2530b;
        if (z4) {
            super.setTextSize(i4, f5);
            return;
        }
        e1 e1Var = this.f2769c;
        if (e1Var == null || z4) {
            return;
        }
        o1 o1Var = e1Var.f2567i;
        if (o1Var.f()) {
            return;
        }
        o1Var.g(i4, f5);
    }
}
