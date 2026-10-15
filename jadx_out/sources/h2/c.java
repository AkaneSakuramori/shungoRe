package h2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c3.h;
import com.shungo.app.R;
import f2.l;
import i0.e0;
import i0.i0;
import i0.k0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f2503j = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f2510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f2511i;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(k2.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, n1.a.f3562x);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = v0.f2983a;
            k0.s(this, dimensionPixelSize);
        }
        this.f2505c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2504b = l.b(context2, attributeSet, 0, 0).a();
        }
        this.f2506d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(h.P0(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(h.S1(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2507e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2508f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2509g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2503j);
        setFocusable(true);
        if (getBackground() == null) {
            int iT1 = h.t1(h.O0(this, R.attr.colorSurface), h.O0(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            l lVar = this.f2504b;
            if (lVar != null) {
                int i4 = d.f2512a;
                f2.h hVar = new f2.h(lVar);
                hVar.k(ColorStateList.valueOf(iT1));
                drawable = hVar;
            } else {
                Resources resources = getResources();
                int i5 = d.f2512a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iT1);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f2510h;
            if (colorStateList != null) {
                c0.b.h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = v0.f2983a;
            e0.q(this, drawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f2507e;
    }

    public int getAnimationMode() {
        return this.f2505c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2506d;
    }

    public int getMaxInlineActionWidth() {
        return this.f2509g;
    }

    public int getMaxWidth() {
        return this.f2508f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = v0.f2983a;
        i0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i6 = this.f2508f;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
    }

    public void setAnimationMode(int i4) {
        this.f2505c = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2510h != null) {
            drawable = drawable.mutate();
            c0.b.h(drawable, this.f2510h);
            c0.b.i(drawable, this.f2511i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2510h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            c0.b.h(drawableMutate, colorStateList);
            c0.b.i(drawableMutate, this.f2511i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2511i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            c0.b.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2503j);
        super.setOnClickListener(onClickListener);
    }
}
