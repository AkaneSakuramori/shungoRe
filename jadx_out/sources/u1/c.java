package u1;

import a0.j;
import a0.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import c3.h;
import com.shungo.app.R;
import d1.d;
import d1.e;
import i.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f4679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f4680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f4684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f4685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f4686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f4688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f4689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f4690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f4692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f4694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f4696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f4697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f4677z = {R.attr.state_indeterminate};
    public static final int[] A = {R.attr.state_error};
    public static final int[][] B = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(k2.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4678f = new LinkedHashSet();
        this.f4679g = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f38a;
        Drawable drawableA = j.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f1697b = drawableA;
        drawableA.setCallback(eVar.f1696g);
        new d(eVar.f1697b.getConstantState());
        this.f4696x = eVar;
        this.f4697y = new a(this);
        Context context3 = getContext();
        this.f4685m = m0.c.a(this);
        this.f4688p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = n1.a.f3552n;
        k.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        e.c cVar = new e.c(context3, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox));
        this.f4686n = cVar.h(2);
        if (this.f4685m != null && h.j2(context3, R.attr.isMaterial3Theme, false)) {
            int iN = cVar.n(0, 0);
            int iN2 = cVar.n(1, 0);
            if (iN == C && iN2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4685m = r3.q.g(context3, R.drawable.mtrl_checkbox_button);
                this.f4687o = true;
                if (this.f4686n == null) {
                    this.f4686n = r3.q.g(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4689q = h.Q0(context3, cVar, 3);
        this.f4690r = h.S1(cVar.k(4, -1), PorterDuff.Mode.SRC_IN);
        this.f4681i = cVar.b(10, false);
        this.f4682j = cVar.b(6, true);
        this.f4683k = cVar.b(9, false);
        this.f4684l = cVar.q(8);
        if (cVar.r(7)) {
            setCheckedState(cVar.k(7, 0));
        }
        cVar.v();
        a();
    }

    private String getButtonStateDescription() {
        int i4 = this.f4691s;
        if (i4 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i4 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4680h == null) {
            int iO0 = h.O0(this, R.attr.colorControlActivated);
            int iO1 = h.O0(this, R.attr.colorError);
            int iO2 = h.O0(this, R.attr.colorSurface);
            int iO3 = h.O0(this, R.attr.colorOnSurface);
            this.f4680h = new ColorStateList(B, new int[]{h.t1(iO2, iO1, 1.0f), h.t1(iO2, iO0, 1.0f), h.t1(iO2, iO3, 0.54f), h.t1(iO2, iO3, 0.38f), h.t1(iO2, iO3, 0.38f)});
        }
        return this.f4680h;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4688p;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i.d dVar;
        Drawable drawableMutate = this.f4685m;
        ColorStateList colorStateList3 = this.f4688p;
        PorterDuff.Mode modeB = m0.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                c0.b.i(drawableMutate, modeB);
            }
        }
        this.f4685m = drawableMutate;
        Drawable drawableMutate2 = this.f4686n;
        ColorStateList colorStateList4 = this.f4689q;
        PorterDuff.Mode mode = this.f4690r;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                c0.b.i(drawableMutate2, mode);
            }
        }
        this.f4686n = drawableMutate2;
        if (this.f4687o) {
            e eVar = this.f4696x;
            if (eVar != null) {
                Drawable drawable = eVar.f1697b;
                a aVar = this.f4697y;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f4674a == null) {
                        aVar.f4674a = new d1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4674a);
                }
                ArrayList arrayList = eVar.f1695f;
                d1.c cVar = eVar.f1692c;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.f1695f.size() == 0 && (dVar = eVar.f1694e) != null) {
                        cVar.f1688b.removeListener(dVar);
                        eVar.f1694e = null;
                    }
                }
                Drawable drawable2 = eVar.f1697b;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f4674a == null) {
                        aVar.f4674a = new d1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4674a);
                } else if (aVar != null) {
                    if (eVar.f1695f == null) {
                        eVar.f1695f = new ArrayList();
                    }
                    if (!eVar.f1695f.contains(aVar)) {
                        eVar.f1695f.add(aVar);
                        if (eVar.f1694e == null) {
                            eVar.f1694e = new i.d(2, eVar);
                        }
                        cVar.f1688b.addListener(eVar.f1694e);
                    }
                }
            }
            Drawable drawable3 = this.f4685m;
            if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                ((AnimatedStateListDrawable) this.f4685m).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
            }
        }
        Drawable drawable4 = this.f4685m;
        if (drawable4 != null && (colorStateList2 = this.f4688p) != null) {
            c0.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f4686n;
        if (drawable5 != null && (colorStateList = this.f4689q) != null) {
            c0.b.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f4685m;
        Drawable drawable7 = this.f4686n;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f5 = intrinsicWidth / intrinsicHeight;
                if (f5 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f5);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f5 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f4685m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4686n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4689q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4690r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4688p;
    }

    public int getCheckedState() {
        return this.f4691s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4684l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4691s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4681i && this.f4688p == null && this.f4689q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4677z);
        }
        if (this.f4683k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        for (int i5 = 0; i5 < iArrOnCreateDrawableState.length; i5++) {
            int i6 = iArrOnCreateDrawableState[i5];
            if (i6 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i6 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i5] = 16842912;
            }
            this.f4692t = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f4692t = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f4682j || !TextUtils.isEmpty(getText()) || (drawableA = m0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (h.q1(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            c0.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4683k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4684l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f4676b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4676b = getCheckedState();
        return bVar;
    }

    @Override // i.t, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(r3.q.g(getContext(), i4));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4686n = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(r3.q.g(getContext(), i4));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4689q == colorStateList) {
            return;
        }
        this.f4689q = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4690r == mode) {
            return;
        }
        this.f4690r = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4688p == colorStateList) {
            return;
        }
        this.f4688p = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f4682j = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4691s != i4) {
            this.f4691s = i4;
            super.setChecked(i4 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4694v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4693u) {
                return;
            }
            this.f4693u = true;
            LinkedHashSet linkedHashSet = this.f4679g;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    defpackage.a.n(it.next());
                    throw null;
                }
            }
            if (this.f4691s != 2 && (onCheckedChangeListener = this.f4695w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4693u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4684l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        setErrorAccessibilityLabel(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f4683k == z4) {
            return;
        }
        this.f4683k = z4;
        refreshDrawableState();
        Iterator it = this.f4678f.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4695w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4694v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f4681i = z4;
        if (z4) {
            m0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            m0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // i.t, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4685m = drawable;
        this.f4687o = false;
        a();
    }
}
