package i;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f2602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f2603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f2604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.n0 f2606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Future f2607h;

    public h1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f2604e == null) {
            this.f2604e = new b0(this);
        }
        return this.f2604e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2601b;
        if (rVar != null) {
            rVar.a();
        }
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b4.f2530b) {
            return super.getAutoSizeMaxTextSize();
        }
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
        return e1Var != null ? e1Var.f2567i.f2731f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b4.f2530b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e1 e1Var = this.f2602c;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public f1 getSuperCaller() {
        if (this.f2606g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f2606g = new g1(this);
            } else {
                this.f2606g = new e.n0(6, this);
            }
        }
        return this.f2606g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2601b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2601b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2602c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2602c.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f2603d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.f2520d;
        return textClassifier == null ? x0.a((TextView) a0Var.f2519c) : textClassifier;
    }

    public g0.e getTextMetricsParamsCompat() {
        return c3.h.c1(this);
    }

    public final void l() {
        Future future = this.f2607h;
        if (future == null) {
            return;
        }
        try {
            this.f2607h = null;
            defpackage.a.n(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            c3.h.c1(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2602c.getClass();
        e1.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        r3.q.n(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        e1 e1Var = this.f2602c;
        if (e1Var == null || b4.f2530b) {
            return;
        }
        e1Var.f2567i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        l();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
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
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2601b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2601b;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e1 e1Var = this.f2602c;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((f2.e) getEmojiTextViewHelper().f2524b.f1896c).u(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i4);
        } else {
            c3.h.q2(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().u(i4);
        } else {
            c3.h.s2(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        c3.h.W(i4);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i4 != fontMetricsInt) {
            setLineSpacing(i4 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(g0.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        c3.h.c1(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2601b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2601b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e1 e1Var = this.f2602c;
        e1Var.l(colorStateList);
        e1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e1 e1Var = this.f2602c;
        e1Var.m(mode);
        e1Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f2603d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f2520d = textClassifier;
        }
    }

    public void setTextFuture(Future<g0.f> future) {
        this.f2607h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(g0.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f2291b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        m0.p.h(this, i4);
        getPaint().set(eVar.f2290a);
        m0.q.e(this, eVar.f2292c);
        m0.q.h(this, eVar.f2293d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f5) {
        boolean z4 = b4.f2530b;
        if (z4) {
            super.setTextSize(i4, f5);
            return;
        }
        e1 e1Var = this.f2602c;
        if (e1Var == null || z4) {
            return;
        }
        o1 o1Var = e1Var.f2567i;
        if (o1Var.f()) {
            return;
        }
        o1Var.g(i4, f5);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typefaceCreate;
        if (this.f2605f) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            e.n0 n0Var = b0.g.f1088a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i4);
        }
        this.f2605f = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f2605f = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        n3.a(context);
        this.f2605f = false;
        this.f2606g = null;
        m3.a(this, getContext());
        r rVar = new r(this);
        this.f2601b = rVar;
        rVar.e(attributeSet, i4);
        e1 e1Var = new e1(this);
        this.f2602c = e1Var;
        e1Var.f(attributeSet, i4);
        e1Var.b();
        this.f2603d = new a0(this);
        getEmojiTextViewHelper().a(attributeSet, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? r3.q.g(context, i4) : null, i5 != 0 ? r3.q.g(context, i5) : null, i6 != 0 ? r3.q.g(context, i6) : null, i7 != 0 ? r3.q.g(context, i7) : null);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? r3.q.g(context, i4) : null, i5 != 0 ? r3.q.g(context, i5) : null, i6 != 0 ? r3.q.g(context, i6) : null, i7 != 0 ? r3.q.g(context, i7) : null);
        e1 e1Var = this.f2602c;
        if (e1Var != null) {
            e1Var.b();
        }
    }
}
