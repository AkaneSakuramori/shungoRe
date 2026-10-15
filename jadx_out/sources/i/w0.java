package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Spinner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f2814j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f2817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f2818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f2820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f2822i;

    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    public w0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        int i4;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.shungo.app.R.attr.spinnerStyle);
        this.f2822i = new Rect();
        m3.a(this, getContext());
        int[] iArr = d.a.f1675v;
        e.c cVar = new e.c(context, context.obtainStyledAttributes(attributeSet, iArr, com.shungo.app.R.attr.spinnerStyle, 0));
        this.f2815b = new r(this);
        int iN = cVar.n(4, 0);
        if (iN != 0) {
            this.f2816c = new g.f(context, iN);
        } else {
            this.f2816c = context;
        }
        int i5 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2814j, com.shungo.app.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i5 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e5) {
                    e = e5;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    i4 = 1;
                    if (i5 != 0) {
                        q0 q0Var = new q0(this);
                        this.f2820g = q0Var;
                        q0Var.f2750d = cVar.o(2);
                    } else if (i5 == 1) {
                        t0 t0Var = new t0(this, this.f2816c, attributeSet);
                        e.c cVarU = e.c.u(this.f2816c, attributeSet, iArr, com.shungo.app.R.attr.spinnerStyle);
                        this.f2821h = ((TypedArray) cVarU.f1780d).getLayoutDimension(3, -2);
                        t0Var.k(cVarU.h(1));
                        t0Var.D = cVar.o(2);
                        cVarU.v();
                        this.f2820g = t0Var;
                        this.f2817d = new k(this, this, t0Var, i4);
                    }
                    textArray = ((TypedArray) cVar.f1780d).getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.shungo.app.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    cVar.v();
                    this.f2819f = true;
                    spinnerAdapter = this.f2818e;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f2818e = null;
                    }
                    this.f2815b.e(attributeSet, com.shungo.app.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        i4 = 1;
        if (i5 != 0) {
            q0 q0Var2 = new q0(this);
            this.f2820g = q0Var2;
            q0Var2.f2750d = cVar.o(2);
        } else if (i5 == 1) {
            t0 t0Var2 = new t0(this, this.f2816c, attributeSet);
            e.c cVarU2 = e.c.u(this.f2816c, attributeSet, iArr, com.shungo.app.R.attr.spinnerStyle);
            this.f2821h = ((TypedArray) cVarU2.f1780d).getLayoutDimension(3, -2);
            t0Var2.k(cVarU2.h(1));
            t0Var2.D = cVar.o(2);
            cVarU2.v();
            this.f2820g = t0Var2;
            this.f2817d = new k(this, this, t0Var2, i4);
        }
        textArray = ((TypedArray) cVar.f1780d).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.shungo.app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        cVar.v();
        this.f2819f = true;
        spinnerAdapter = this.f2818e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2818e = null;
        }
        this.f2815b.e(attributeSet, com.shungo.app.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f2822i;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2815b;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        v0 v0Var = this.f2820g;
        return v0Var != null ? v0Var.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        v0 v0Var = this.f2820g;
        return v0Var != null ? v0Var.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2820g != null ? this.f2821h : super.getDropDownWidth();
    }

    public final v0 getInternalPopup() {
        return this.f2820g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        v0 v0Var = this.f2820g;
        return v0Var != null ? v0Var.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2816c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        v0 v0Var = this.f2820g;
        return v0Var != null ? v0Var.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2815b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2815b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v0 v0Var = this.f2820g;
        if (v0Var == null || !v0Var.a()) {
            return;
        }
        v0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f2820g == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        u0 u0Var = (u0) parcelable;
        super.onRestoreInstanceState(u0Var.getSuperState());
        if (!u0Var.f2786b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new h.e(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        u0 u0Var = new u0(super.onSaveInstanceState());
        v0 v0Var = this.f2820g;
        u0Var.f2786b = v0Var != null && v0Var.a();
        return u0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f2817d;
        if (kVar == null || !kVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        v0 v0Var = this.f2820g;
        if (v0Var == null) {
            return super.performClick();
        }
        if (v0Var.a()) {
            return true;
        }
        this.f2820g.e(o0.b(this), o0.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2815b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2815b;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        v0 v0Var = this.f2820g;
        if (v0Var == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            v0Var.p(i4);
            v0Var.c(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        v0 v0Var = this.f2820g;
        if (v0Var != null) {
            v0Var.l(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f2820g != null) {
            this.f2821h = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        v0 v0Var = this.f2820g;
        if (v0Var != null) {
            v0Var.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(r3.q.g(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        v0 v0Var = this.f2820g;
        if (v0Var != null) {
            v0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2815b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2815b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2819f) {
            this.f2818e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        v0 v0Var = this.f2820g;
        if (v0Var != null) {
            Context context = this.f2816c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            r0 r0Var = new r0();
            r0Var.f2761b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                r0Var.f2762c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                p0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            v0Var.n(r0Var);
        }
    }
}
