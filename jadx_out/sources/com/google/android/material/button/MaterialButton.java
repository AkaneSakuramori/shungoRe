package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c0.b;
import c3.h;
import e.n0;
import f2.l;
import f2.x;
import i.s;
import i0.f0;
import i0.v0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.p;
import r3.q;
import s1.a;
import s1.c;
import z.d;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends s implements Checkable, x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f1385s = {R.attr.state_checkable};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f1386t = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f1387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f1388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f1389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f1391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f1392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1400r;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(k2.a.a(context, attributeSet, com.shungo.app.R.attr.materialButtonStyle, com.shungo.app.R.style.Widget_MaterialComponents_Button), attributeSet, com.shungo.app.R.attr.materialButtonStyle);
        this.f1388f = new LinkedHashSet();
        this.f1398p = false;
        this.f1399q = false;
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, n1.a.f3548j, com.shungo.app.R.attr.materialButtonStyle, com.shungo.app.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1397o = typedArrayE.getDimensionPixelSize(12, 0);
        int i4 = typedArrayE.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1390h = h.S1(i4, mode);
        this.f1391i = h.P0(getContext(), typedArrayE, 14);
        this.f1392j = h.U0(getContext(), typedArrayE, 10);
        this.f1400r = typedArrayE.getInteger(11, 1);
        this.f1394l = typedArrayE.getDimensionPixelSize(13, 0);
        c cVar = new c(this, l.b(context2, attributeSet, com.shungo.app.R.attr.materialButtonStyle, com.shungo.app.R.style.Widget_MaterialComponents_Button).a());
        this.f1387e = cVar;
        cVar.f4202c = typedArrayE.getDimensionPixelOffset(1, 0);
        cVar.f4203d = typedArrayE.getDimensionPixelOffset(2, 0);
        cVar.f4204e = typedArrayE.getDimensionPixelOffset(3, 0);
        cVar.f4205f = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            cVar.f4206g = dimensionPixelSize;
            float f5 = dimensionPixelSize;
            f2.k kVarE = cVar.f4201b.e();
            kVarE.f2084e = new f2.a(f5);
            kVarE.f2085f = new f2.a(f5);
            kVarE.f2086g = new f2.a(f5);
            kVarE.f2087h = new f2.a(f5);
            cVar.c(kVarE.a());
            cVar.f4215p = true;
        }
        cVar.f4207h = typedArrayE.getDimensionPixelSize(20, 0);
        cVar.f4208i = h.S1(typedArrayE.getInt(7, -1), mode);
        cVar.f4209j = h.P0(getContext(), typedArrayE, 6);
        cVar.f4210k = h.P0(getContext(), typedArrayE, 19);
        cVar.f4211l = h.P0(getContext(), typedArrayE, 16);
        cVar.f4216q = typedArrayE.getBoolean(5, false);
        cVar.f4219t = typedArrayE.getDimensionPixelSize(9, 0);
        cVar.f4217r = typedArrayE.getBoolean(21, true);
        WeakHashMap weakHashMap = v0.f2983a;
        int iF = f0.f(this);
        int paddingTop = getPaddingTop();
        int iE = f0.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            cVar.f4214o = true;
            setSupportBackgroundTintList(cVar.f4209j);
            setSupportBackgroundTintMode(cVar.f4208i);
        } else {
            cVar.e();
        }
        f0.k(this, iF + cVar.f4202c, paddingTop + cVar.f4204e, iE + cVar.f4203d, paddingBottom + cVar.f4205f);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.f1397o);
        d(this.f1392j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f1387e;
        return cVar != null && cVar.f4216q;
    }

    public final boolean b() {
        c cVar = this.f1387e;
        return (cVar == null || cVar.f4214o) ? false : true;
    }

    public final void c() {
        int i4 = this.f1400r;
        boolean z4 = true;
        if (i4 != 1 && i4 != 2) {
            z4 = false;
        }
        if (z4) {
            p.e(this, this.f1392j, null, null, null);
            return;
        }
        if (i4 == 3 || i4 == 4) {
            p.e(this, null, null, this.f1392j, null);
        } else if (i4 == 16 || i4 == 32) {
            p.e(this, null, this.f1392j, null, null);
        }
    }

    public final void d(boolean z4) {
        Drawable drawable = this.f1392j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1392j = drawableMutate;
            b.h(drawableMutate, this.f1391i);
            PorterDuff.Mode mode = this.f1390h;
            if (mode != null) {
                b.i(this.f1392j, mode);
            }
            int intrinsicWidth = this.f1394l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1392j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1394l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1392j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1392j;
            int i4 = this.f1395m;
            int i5 = this.f1396n;
            drawable2.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
            this.f1392j.setVisible(true, z4);
        }
        if (z4) {
            c();
            return;
        }
        Drawable[] drawableArrA = p.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i6 = this.f1400r;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f1392j) || (((i6 == 3 || i6 == 4) && drawable5 != this.f1392j) || ((i6 == 16 || i6 == 32) && drawable4 != this.f1392j))) {
            c();
        }
    }

    public final void e(int i4, int i5) {
        if (this.f1392j == null || getLayout() == null) {
            return;
        }
        int i6 = this.f1400r;
        if (!(i6 == 1 || i6 == 2) && i6 != 3 && i6 != 4) {
            if (i6 == 16 || i6 == 32) {
                this.f1395m = 0;
                if (i6 == 16) {
                    this.f1396n = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f1394l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f1392j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f1397o) - getPaddingBottom()) / 2);
                if (this.f1396n != iMax) {
                    this.f1396n = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1396n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f1400r;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1395m = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f1394l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f1392j.getIntrinsicWidth();
        }
        int textLayoutWidth = i4 - getTextLayoutWidth();
        WeakHashMap weakHashMap = v0.f2983a;
        int iE = (((textLayoutWidth - f0.e(this)) - intrinsicWidth) - this.f1397o) - f0.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iE /= 2;
        }
        if ((f0.d(this) == 1) != (this.f1400r == 4)) {
            iE = -iE;
        }
        if (this.f1395m != iE) {
            this.f1395m = iE;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1393k)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1393k;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f1387e.f4206g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1392j;
    }

    public int getIconGravity() {
        return this.f1400r;
    }

    public int getIconPadding() {
        return this.f1397o;
    }

    public int getIconSize() {
        return this.f1394l;
    }

    public ColorStateList getIconTint() {
        return this.f1391i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1390h;
    }

    public int getInsetBottom() {
        return this.f1387e.f4205f;
    }

    public int getInsetTop() {
        return this.f1387e.f4204e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f1387e.f4211l;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (b()) {
            return this.f1387e.f4201b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f1387e.f4210k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f1387e.f4207h;
        }
        return 0;
    }

    @Override // i.s
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f1387e.f4209j : super.getSupportBackgroundTintList();
    }

    @Override // i.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f1387e.f4208i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1398p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            h.t2(this, this.f1387e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1385s);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1386t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // i.s, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // i.s, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // i.s, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof s1.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s1.b bVar = (s1.b) parcelable;
        super.onRestoreInstanceState(bVar.f3594b);
        setChecked(bVar.f4199d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        s1.b bVar = new s1.b(super.onSaveInstanceState());
        bVar.f4199d = this.f1398p;
        return bVar;
    }

    @Override // i.s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f1387e.f4217r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1392j != null) {
            if (this.f1392j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1393k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (!b()) {
            super.setBackgroundColor(i4);
            return;
        }
        c cVar = this.f1387e;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i4);
        }
    }

    @Override // i.s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f1387e;
        cVar.f4214o = true;
        ColorStateList colorStateList = cVar.f4209j;
        MaterialButton materialButton = cVar.f4200a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f4208i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // i.s, android.view.View
    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? q.g(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (b()) {
            this.f1387e.f4216q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (a() && isEnabled() && this.f1398p != z4) {
            this.f1398p = z4;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z5 = this.f1398p;
                if (!materialButtonToggleGroup.f1407g) {
                    materialButtonToggleGroup.b(getId(), z5);
                }
            }
            if (this.f1399q) {
                return;
            }
            this.f1399q = true;
            Iterator it = this.f1388f.iterator();
            if (it.hasNext()) {
                defpackage.a.n(it.next());
                throw null;
            }
            this.f1399q = false;
        }
    }

    public void setCornerRadius(int i4) {
        if (b()) {
            c cVar = this.f1387e;
            if (cVar.f4215p && cVar.f4206g == i4) {
                return;
            }
            cVar.f4206g = i4;
            cVar.f4215p = true;
            float f5 = i4;
            f2.k kVarE = cVar.f4201b.e();
            kVarE.f2084e = new f2.a(f5);
            kVarE.f2085f = new f2.a(f5);
            kVarE.f2086g = new f2.a(f5);
            kVarE.f2087h = new f2.a(f5);
            cVar.c(kVarE.a());
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (b()) {
            this.f1387e.b(false).j(f5);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1392j != drawable) {
            this.f1392j = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f1400r != i4) {
            this.f1400r = i4;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f1397o != i4) {
            this.f1397o = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? q.g(getContext(), i4) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1394l != i4) {
            this.f1394l = i4;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1391i != colorStateList) {
            this.f1391i = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1390h != mode) {
            this.f1390h = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(d.b(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        c cVar = this.f1387e;
        cVar.d(cVar.f4204e, i4);
    }

    public void setInsetTop(int i4) {
        c cVar = this.f1387e;
        cVar.d(i4, cVar.f4205f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1389g = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        a aVar = this.f1389g;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((n0) aVar).f1896c).invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1387e;
            if (cVar.f4211l != colorStateList) {
                cVar.f4211l = colorStateList;
                MaterialButton materialButton = cVar.f4200a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(d2.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (b()) {
            setRippleColor(d.b(getContext(), i4));
        }
    }

    @Override // f2.x
    public void setShapeAppearanceModel(l lVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f1387e.c(lVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (b()) {
            c cVar = this.f1387e;
            cVar.f4213n = z4;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1387e;
            if (cVar.f4210k != colorStateList) {
                cVar.f4210k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (b()) {
            setStrokeColor(d.b(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (b()) {
            c cVar = this.f1387e;
            if (cVar.f4207h != i4) {
                cVar.f4207h = i4;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // i.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f1387e;
        if (cVar.f4209j != colorStateList) {
            cVar.f4209j = colorStateList;
            if (cVar.b(false) != null) {
                b.h(cVar.b(false), cVar.f4209j);
            }
        }
    }

    @Override // i.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f1387e;
        if (cVar.f4208i != mode) {
            cVar.f4208i = mode;
            if (cVar.b(false) == null || cVar.f4208i == null) {
                return;
            }
            b.i(cVar.b(false), cVar.f4208i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f1387e.f4217r = z4;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1398p);
    }
}
