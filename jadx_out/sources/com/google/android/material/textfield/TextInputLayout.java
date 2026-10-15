package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.j;
import c1.i;
import com.google.android.material.internal.CheckableImageButton;
import e.c;
import e.n0;
import f2.g;
import f2.h;
import f2.l;
import i.h1;
import i.t1;
import i.u2;
import i.y2;
import i0.e0;
import i0.f0;
import i0.h0;
import i0.m0;
import i0.v0;
import i2.f;
import i2.m;
import i2.n;
import i2.r;
import i2.t;
import i2.v;
import i2.w;
import i2.x;
import i2.y;
import i2.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k2.a;
import m0.p;
import r3.q;
import z.d;
import z1.b;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean D;
    public CharSequence E;
    public boolean F;
    public h G;
    public h H;
    public StateListDrawable I;
    public boolean J;
    public h K;
    public h L;
    public l M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Rect f1546a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f1547b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RectF f1548b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f1549c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Typeface f1550c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f1551d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorDrawable f1552d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f1553e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1554e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1555f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f1556f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1557g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorDrawable f1558g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1559h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1560h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1561i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Drawable f1562i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1563j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f1564j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f1565k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ColorStateList f1566k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1567l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f1568l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1569m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1570m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1571n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f1572n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f1573o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ColorStateList f1574o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h1 f1575p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f1576p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1577q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1578q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1579r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1580r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f1581s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1582s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1583t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1584t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h1 f1585u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1586u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f1587v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final b f1588v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1589w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1590w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f1591x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1592x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f1593y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1594y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f1595z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f1596z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v32 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        ?? r4;
        super(a.a(context, attributeSet, com.shungo.app.R.attr.textInputStyle, com.shungo.app.R.style.Widget_Design_TextInputLayout), attributeSet, com.shungo.app.R.attr.textInputStyle);
        this.f1557g = -1;
        this.f1559h = -1;
        this.f1561i = -1;
        this.f1563j = -1;
        this.f1565k = new r(this);
        this.f1573o = new w(0);
        this.W = new Rect();
        this.f1546a0 = new Rect();
        this.f1548b0 = new RectF();
        this.f1556f0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f1588v0 = bVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1547b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o1.a.f3595a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f5455g != 8388659) {
            bVar.f5455g = 8388659;
            bVar.h(false);
        }
        int[] iArr = n1.a.A;
        k.a(context2, attributeSet, com.shungo.app.R.attr.textInputStyle, com.shungo.app.R.style.Widget_Design_TextInputLayout);
        k.b(context2, attributeSet, iArr, com.shungo.app.R.attr.textInputStyle, com.shungo.app.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        c cVar = new c(context2, context2.obtainStyledAttributes(attributeSet, iArr, com.shungo.app.R.attr.textInputStyle, com.shungo.app.R.style.Widget_Design_TextInputLayout));
        v vVar = new v(this, cVar);
        this.f1549c = vVar;
        this.D = cVar.b(48, true);
        setHint(cVar.q(4));
        this.f1592x0 = cVar.b(47, true);
        this.f1590w0 = cVar.b(42, true);
        if (cVar.r(6)) {
            setMinEms(cVar.k(6, -1));
        } else if (cVar.r(3)) {
            setMinWidth(cVar.e(3, -1));
        }
        if (cVar.r(5)) {
            setMaxEms(cVar.k(5, -1));
        } else if (cVar.r(2)) {
            setMaxWidth(cVar.e(2, -1));
        }
        this.M = l.b(context2, attributeSet, com.shungo.app.R.attr.textInputStyle, com.shungo.app.R.style.Widget_Design_TextInputLayout).a();
        this.O = context2.getResources().getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.Q = cVar.d(9, 0);
        this.S = cVar.e(16, context2.getResources().getDimensionPixelSize(com.shungo.app.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.T = cVar.e(17, context2.getResources().getDimensionPixelSize(com.shungo.app.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float dimension = ((TypedArray) cVar.f1780d).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) cVar.f1780d).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) cVar.f1780d).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) cVar.f1780d).getDimension(11, -1.0f);
        f2.k kVarE = this.M.e();
        if (dimension >= 0.0f) {
            kVarE.f2084e = new f2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            kVarE.f2085f = new f2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            kVarE.f2086g = new f2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            kVarE.f2087h = new f2.a(dimension4);
        }
        this.M = kVarE.a();
        ColorStateList colorStateListQ0 = c3.h.Q0(context2, cVar, 7);
        if (colorStateListQ0 != null) {
            int defaultColor = colorStateListQ0.getDefaultColor();
            this.f1576p0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListQ0.isStateful()) {
                this.f1578q0 = colorStateListQ0.getColorForState(new int[]{-16842910}, -1);
                this.f1580r0 = colorStateListQ0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1582s0 = colorStateListQ0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1580r0 = this.f1576p0;
                ColorStateList colorStateListB = d.b(context2, com.shungo.app.R.color.mtrl_filled_background_color);
                this.f1578q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f1582s0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.f1576p0 = 0;
            this.f1578q0 = 0;
            this.f1580r0 = 0;
            this.f1582s0 = 0;
        }
        if (cVar.r(1)) {
            ColorStateList colorStateListC = cVar.c(1);
            this.f1566k0 = colorStateListC;
            this.f1564j0 = colorStateListC;
        }
        ColorStateList colorStateListQ1 = c3.h.Q0(context2, cVar, 14);
        this.f1572n0 = ((TypedArray) cVar.f1780d).getColor(14, 0);
        Object obj = d.f5428a;
        this.f1568l0 = z.c.a(context2, com.shungo.app.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1584t0 = z.c.a(context2, com.shungo.app.R.color.mtrl_textinput_disabled_color);
        this.f1570m0 = z.c.a(context2, com.shungo.app.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListQ1 != null) {
            setBoxStrokeColorStateList(colorStateListQ1);
        }
        if (cVar.r(15)) {
            setBoxStrokeErrorColor(c3.h.Q0(context2, cVar, 15));
        }
        if (cVar.n(49, -1) != -1) {
            r4 = 0;
            setHintTextAppearance(cVar.n(49, 0));
        } else {
            r4 = 0;
        }
        this.B = cVar.c(24);
        this.C = cVar.c(25);
        int iN = cVar.n(40, r4);
        CharSequence charSequenceQ = cVar.q(35);
        int iK = cVar.k(34, 1);
        boolean zB = cVar.b(36, r4);
        int iN2 = cVar.n(45, r4);
        boolean zB2 = cVar.b(44, r4);
        CharSequence charSequenceQ2 = cVar.q(43);
        int iN3 = cVar.n(57, r4);
        CharSequence charSequenceQ3 = cVar.q(56);
        boolean zB3 = cVar.b(18, r4);
        setCounterMaxLength(cVar.k(19, -1));
        this.f1579r = cVar.n(22, 0);
        this.f1577q = cVar.n(20, 0);
        setBoxBackgroundMode(cVar.k(8, 0));
        setErrorContentDescription(charSequenceQ);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f1577q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f1579r);
        setPlaceholderText(charSequenceQ3);
        setPlaceholderTextAppearance(iN3);
        if (cVar.r(41)) {
            setErrorTextColor(cVar.c(41));
        }
        if (cVar.r(46)) {
            setHelperTextColor(cVar.c(46));
        }
        if (cVar.r(50)) {
            setHintTextColor(cVar.c(50));
        }
        if (cVar.r(23)) {
            setCounterTextColor(cVar.c(23));
        }
        if (cVar.r(21)) {
            setCounterOverflowTextColor(cVar.c(21));
        }
        if (cVar.r(58)) {
            setPlaceholderTextColor(cVar.c(58));
        }
        n nVar = new n(this, cVar);
        this.f1551d = nVar;
        boolean zB4 = cVar.b(0, true);
        cVar.v();
        e0.s(this, 2);
        m0.m(this, 1);
        frameLayout.addView(vVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(zB4);
        setHelperTextEnabled(zB2);
        setErrorEnabled(zB);
        setCounterEnabled(zB3);
        setHelperText(charSequenceQ2);
    }

    private Drawable getEditTextBoxBackground() {
        int iA;
        EditText editText = this.f1553e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int iO0 = c3.h.O0(this.f1553e, com.shungo.app.R.attr.colorControlHighlight);
        int i4 = this.P;
        int[][] iArr = C0;
        if (i4 != 2) {
            if (i4 != 1) {
                return null;
            }
            h hVar = this.G;
            int i5 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{c3.h.t1(iO0, i5, 0.1f), i5}), hVar, hVar);
        }
        Context context = getContext();
        h hVar2 = this.G;
        TypedValue typedValueM2 = c3.h.m2(com.shungo.app.R.attr.colorSurface, context, "TextInputLayout");
        int i6 = typedValueM2.resourceId;
        if (i6 != 0) {
            Object obj = d.f5428a;
            iA = z.c.a(context, i6);
        } else {
            iA = typedValueM2.data;
        }
        h hVar3 = new h(hVar2.f2057b.f2035a);
        int iT1 = c3.h.t1(iO0, iA, 0.1f);
        hVar3.k(new ColorStateList(iArr, new int[]{iT1, 0}));
        hVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iT1, iA});
        h hVar4 = new h(hVar2.f2057b.f2035a);
        hVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar3, hVar4), hVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], f(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = f(true);
        }
        return this.H;
    }

    public static void k(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1553e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1553e = editText;
        int i4 = this.f1557g;
        if (i4 != -1) {
            setMinEms(i4);
        } else {
            setMinWidth(this.f1561i);
        }
        int i5 = this.f1559h;
        if (i5 != -1) {
            setMaxEms(i5);
        } else {
            setMaxWidth(this.f1563j);
        }
        this.J = false;
        i();
        setTextInputAccessibilityDelegate(new x(this));
        Typeface typeface = this.f1553e.getTypeface();
        b bVar = this.f1588v0;
        bVar.m(typeface);
        float textSize = this.f1553e.getTextSize();
        if (bVar.f5456h != textSize) {
            bVar.f5456h = textSize;
            bVar.h(false);
        }
        int i6 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f1553e.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f1553e.getGravity();
        int i7 = (gravity & (-113)) | 48;
        if (bVar.f5455g != i7) {
            bVar.f5455g = i7;
            bVar.h(false);
        }
        if (bVar.f5453f != gravity) {
            bVar.f5453f = gravity;
            bVar.h(false);
        }
        this.f1553e.addTextChangedListener(new y2(this, 1));
        if (this.f1564j0 == null) {
            this.f1564j0 = this.f1553e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f1553e.getHint();
                this.f1555f = hint;
                setHint(hint);
                this.f1553e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (i6 >= 29) {
            p();
        }
        if (this.f1575p != null) {
            n(this.f1553e.getText());
        }
        r();
        this.f1565k.b();
        this.f1549c.bringToFront();
        n nVar = this.f1551d;
        nVar.bringToFront();
        Iterator it = this.f1556f0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        nVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        b bVar = this.f1588v0;
        if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
            bVar.A = charSequence;
            bVar.B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.f1586u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f1583t == z4) {
            return;
        }
        if (z4) {
            h1 h1Var = this.f1585u;
            if (h1Var != null) {
                this.f1547b.addView(h1Var);
                this.f1585u.setVisibility(0);
            }
        } else {
            h1 h1Var2 = this.f1585u;
            if (h1Var2 != null) {
                h1Var2.setVisibility(8);
            }
            this.f1585u = null;
        }
        this.f1583t = z4;
    }

    public final void a(float f5) {
        b bVar = this.f1588v0;
        if (bVar.f5445b == f5) {
            return;
        }
        int i4 = 1;
        if (this.f1594y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1594y0 = valueAnimator;
            valueAnimator.setInterpolator(c3.h.l2(getContext(), com.shungo.app.R.attr.motionEasingEmphasizedInterpolator, o1.a.f3596b));
            this.f1594y0.setDuration(c3.h.k2(getContext(), com.shungo.app.R.attr.motionDurationMedium4, 167));
            this.f1594y0.addUpdateListener(new r1.a(i4, this));
        }
        this.f1594y0.setFloatValues(bVar.f5445b, f5);
        this.f1594y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1547b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i4;
        int i5;
        h hVar = this.G;
        if (hVar == null) {
            return;
        }
        l lVar = hVar.f2057b.f2035a;
        l lVar2 = this.M;
        if (lVar != lVar2) {
            hVar.setShapeAppearanceModel(lVar2);
        }
        if (this.P == 2 && (i4 = this.R) > -1 && (i5 = this.U) != 0) {
            h hVar2 = this.G;
            hVar2.f2057b.f2045k = i4;
            hVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
            g gVar = hVar2.f2057b;
            if (gVar.f2038d != colorStateListValueOf) {
                gVar.f2038d = colorStateListValueOf;
                hVar2.onStateChange(hVar2.getState());
            }
        }
        int iB = this.V;
        if (this.P == 1) {
            iB = b0.a.b(this.V, c3.h.N0(getContext(), com.shungo.app.R.attr.colorSurface, 0));
        }
        this.V = iB;
        this.G.k(ColorStateList.valueOf(iB));
        h hVar3 = this.K;
        if (hVar3 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                hVar3.k(this.f1553e.isFocused() ? ColorStateList.valueOf(this.f1568l0) : ColorStateList.valueOf(this.U));
                this.L.k(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.D) {
            return 0;
        }
        int i4 = this.P;
        b bVar = this.f1588v0;
        if (i4 == 0) {
            fD = bVar.d();
        } else {
            if (i4 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final i d() {
        i iVar = new i();
        iVar.f1177y = 3;
        iVar.f1199d = c3.h.k2(getContext(), com.shungo.app.R.attr.motionDurationShort2, 87);
        iVar.f1200e = c3.h.l2(getContext(), com.shungo.app.R.attr.motionEasingLinearInterpolator, o1.a.f3595a);
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f1553e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f1555f != null) {
            boolean z4 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f1553e.setHint(this.f1555f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f1553e.setHint(hint);
                this.F = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.f1547b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i4);
            if (childAt == this.f1553e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar;
        int i4;
        super.draw(canvas);
        boolean z4 = this.D;
        b bVar = this.f1588v0;
        if (z4) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f5451e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.N;
                    textPaint.setTextSize(bVar.G);
                    float f5 = bVar.f5464p;
                    float f6 = bVar.f5465q;
                    float f7 = bVar.F;
                    if (f7 != 1.0f) {
                        canvas.scale(f7, f7, f5, f6);
                    }
                    if (bVar.f5450d0 <= 1 || bVar.C) {
                        canvas.translate(f5, f6);
                        bVar.Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f5464p - bVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f6);
                        float f8 = alpha;
                        textPaint.setAlpha((int) (bVar.f5446b0 * f8));
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            float f9 = bVar.H;
                            float f10 = bVar.I;
                            float f11 = bVar.J;
                            int i6 = bVar.K;
                            textPaint.setShadowLayer(f9, f10, f11, b0.a.d(i6, (textPaint.getAlpha() * Color.alpha(i6)) / 255));
                        }
                        bVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f5444a0 * f8));
                        if (i5 >= 31) {
                            float f12 = bVar.H;
                            float f13 = bVar.I;
                            float f14 = bVar.J;
                            int i7 = bVar.K;
                            textPaint.setShadowLayer(f12, f13, f14, b0.a.d(i7, (Color.alpha(i7) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f5448c0;
                        float f15 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f15, textPaint);
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                        }
                        String strTrim = bVar.f5448c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i4 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i4 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(i4), str.length()), 0.0f, f15, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.L == null || (hVar = this.K) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f1553e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f16 = bVar.f5445b;
            int iCenterX = bounds2.centerX();
            bounds.left = o1.a.c(iCenterX, bounds2.left, f16);
            bounds.right = o1.a.c(iCenterX, bounds2.right, f16);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z4;
        ColorStateList colorStateList;
        if (this.f1596z0) {
            return;
        }
        this.f1596z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f1588v0;
        if (bVar != null) {
            bVar.L = drawableState;
            ColorStateList colorStateList2 = bVar.f5459k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = bVar.f5458j) == null || !colorStateList.isStateful())) {
                z4 = false;
            } else {
                bVar.h(false);
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (this.f1553e != null) {
            WeakHashMap weakHashMap = v0.f2983a;
            u(h0.c(this) && isEnabled(), false);
        }
        r();
        x();
        if (z4) {
            invalidate();
        }
        this.f1596z0 = false;
    }

    public final boolean e() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof i2.h);
    }

    public final h f(boolean z4) {
        int iA;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_shape_corner_size_small_component);
        float f5 = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1553e;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.shungo.app.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        f2.k kVar = new f2.k();
        kVar.f2084e = new f2.a(f5);
        kVar.f2085f = new f2.a(f5);
        kVar.f2087h = new f2.a(dimensionPixelOffset);
        kVar.f2086g = new f2.a(dimensionPixelOffset);
        l lVarA = kVar.a();
        EditText editText2 = this.f1553e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof t ? ((t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = h.f2056x;
            TypedValue typedValueM2 = c3.h.m2(com.shungo.app.R.attr.colorSurface, context, h.class.getSimpleName());
            int i4 = typedValueM2.resourceId;
            if (i4 != 0) {
                Object obj = d.f5428a;
                iA = z.c.a(context, i4);
            } else {
                iA = typedValueM2.data;
            }
            dropDownBackgroundTintList = ColorStateList.valueOf(iA);
        }
        h hVar = new h();
        hVar.i(context);
        hVar.k(dropDownBackgroundTintList);
        hVar.j(popupElevation);
        hVar.setShapeAppearanceModel(lVarA);
        g gVar = hVar.f2057b;
        if (gVar.f2042h == null) {
            gVar.f2042h = new Rect();
        }
        hVar.f2057b.f2042h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i4, boolean z4) {
        int compoundPaddingLeft;
        if (z4 || getPrefixText() == null) {
            compoundPaddingLeft = (!z4 || getSuffixText() == null) ? this.f1553e.getCompoundPaddingLeft() : this.f1551d.c();
        } else {
            compoundPaddingLeft = this.f1549c.a();
        }
        return compoundPaddingLeft + i4;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1553e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public h getBoxBackground() {
        int i4 = this.P;
        if (i4 == 1 || i4 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zQ1 = c3.h.q1(this);
        RectF rectF = this.f1548b0;
        return zQ1 ? this.M.f2099h.a(rectF) : this.M.f2098g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zQ1 = c3.h.q1(this);
        RectF rectF = this.f1548b0;
        return zQ1 ? this.M.f2098g.a(rectF) : this.M.f2099h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zQ1 = c3.h.q1(this);
        RectF rectF = this.f1548b0;
        return zQ1 ? this.M.f2096e.a(rectF) : this.M.f2097f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zQ1 = c3.h.q1(this);
        RectF rectF = this.f1548b0;
        return zQ1 ? this.M.f2097f.a(rectF) : this.M.f2096e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1572n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1574o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.f1569m;
    }

    public CharSequence getCounterOverflowDescription() {
        h1 h1Var;
        if (this.f1567l && this.f1571n && (h1Var = this.f1575p) != null) {
            return h1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1595z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1564j0;
    }

    public EditText getEditText() {
        return this.f1553e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1551d.f3041h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1551d.f3041h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1551d.f3047n;
    }

    public int getEndIconMode() {
        return this.f1551d.f3043j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1551d.f3048o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1551d.f3041h;
    }

    public CharSequence getError() {
        r rVar = this.f1565k;
        if (rVar.f3083q) {
            return rVar.f3082p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1565k.f3086t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1565k.f3085s;
    }

    public int getErrorCurrentTextColors() {
        h1 h1Var = this.f1565k.f3084r;
        if (h1Var != null) {
            return h1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1551d.f3037d.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f1565k;
        if (rVar.f3090x) {
            return rVar.f3089w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        h1 h1Var = this.f1565k.f3091y;
        if (h1Var != null) {
            return h1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1588v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f1588v0;
        return bVar.e(bVar.f5459k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1566k0;
    }

    public y getLengthCounter() {
        return this.f1573o;
    }

    public int getMaxEms() {
        return this.f1559h;
    }

    public int getMaxWidth() {
        return this.f1563j;
    }

    public int getMinEms() {
        return this.f1557g;
    }

    public int getMinWidth() {
        return this.f1561i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1551d.f3041h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1551d.f3041h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1583t) {
            return this.f1581s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1589w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1587v;
    }

    public CharSequence getPrefixText() {
        return this.f1549c.f3109d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1549c.f3108c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1549c.f3108c;
    }

    public l getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1549c.f3110e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1549c.f3110e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1549c.f3113h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1549c.f3114i;
    }

    public CharSequence getSuffixText() {
        return this.f1551d.f3050q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1551d.f3051r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1551d.f3051r;
    }

    public Typeface getTypeface() {
        return this.f1550c0;
    }

    public final int h(int i4, boolean z4) {
        int compoundPaddingRight;
        if (z4 || getSuffixText() == null) {
            compoundPaddingRight = (!z4 || getPrefixText() == null) ? this.f1553e.getCompoundPaddingRight() : this.f1549c.a();
        } else {
            compoundPaddingRight = this.f1551d.c();
        }
        return i4 - compoundPaddingRight;
    }

    public final void i() {
        int i4 = this.P;
        if (i4 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i4 == 1) {
            this.G = new h(this.M);
            this.K = new h();
            this.L = new h();
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(this.P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof i2.h)) {
                this.G = new h(this.M);
            } else {
                l lVar = this.M;
                int i5 = i2.h.f3014z;
                if (lVar == null) {
                    lVar = new l();
                }
                this.G = new i2.g(new f(lVar, new RectF()));
            }
            this.K = null;
            this.L = null;
        }
        s();
        x();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (c3.h.p1(getContext())) {
                this.Q = getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f1553e != null && this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f1553e;
                WeakHashMap weakHashMap = v0.f2983a;
                f0.k(editText, f0.f(editText), getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_filled_edittext_font_2_0_padding_top), f0.e(this.f1553e), getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (c3.h.p1(getContext())) {
                EditText editText2 = this.f1553e;
                WeakHashMap weakHashMap2 = v0.f2983a;
                f0.k(editText2, f0.f(editText2), getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_filled_edittext_font_1_3_padding_top), f0.e(this.f1553e), getResources().getDimensionPixelSize(com.shungo.app.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.P != 0) {
            t();
        }
        EditText editText3 = this.f1553e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.P;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    public final void j() {
        float f5;
        float f6;
        float f7;
        RectF rectF;
        float f8;
        int i4;
        int i5;
        if (e()) {
            int width = this.f1553e.getWidth();
            int gravity = this.f1553e.getGravity();
            b bVar = this.f1588v0;
            boolean zB = bVar.b(bVar.A);
            bVar.C = zB;
            Rect rect = bVar.f5449d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i5 = rect.left;
                        f7 = i5;
                    } else {
                        f5 = rect.right;
                        f6 = bVar.Z;
                    }
                } else if (zB) {
                    f5 = rect.right;
                    f6 = bVar.Z;
                } else {
                    i5 = rect.left;
                    f7 = i5;
                }
                float fMax = Math.max(f7, rect.left);
                rectF = this.f1548b0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f8 = (width / 2.0f) + (bVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.C) {
                        f8 = fMax + bVar.Z;
                    } else {
                        i4 = rect.right;
                        f8 = i4;
                    }
                } else if (bVar.C) {
                    i4 = rect.right;
                    f8 = i4;
                } else {
                    f8 = bVar.Z + fMax;
                }
                rectF.right = Math.min(f8, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f9 = rectF.left;
                float f10 = this.O;
                rectF.left = f9 - f10;
                rectF.right += f10;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
                i2.h hVar = (i2.h) this.G;
                hVar.getClass();
                hVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f5 = width / 2.0f;
            f6 = bVar.Z / 2.0f;
            f7 = f5 - f6;
            float fMax2 = Math.max(f7, rect.left);
            rectF = this.f1548b0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f8 = (width / 2.0f) + (bVar.Z / 2.0f);
            } else {
                f8 = (width / 2.0f) + (bVar.Z / 2.0f);
            }
            rectF.right = Math.min(f8, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(TextView textView, int i4) {
        try {
            textView.setTextAppearance(i4);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.shungo.app.R.style.TextAppearance_AppCompat_Caption);
        Context context = getContext();
        Object obj = d.f5428a;
        textView.setTextColor(z.c.a(context, com.shungo.app.R.color.design_error));
    }

    public final boolean m() {
        r rVar = this.f1565k;
        return (rVar.f3081o != 1 || rVar.f3084r == null || TextUtils.isEmpty(rVar.f3082p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((w) this.f1573o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f1571n;
        int i4 = this.f1569m;
        String string = null;
        if (i4 == -1) {
            this.f1575p.setText(String.valueOf(length));
            this.f1575p.setContentDescription(null);
            this.f1571n = false;
        } else {
            this.f1571n = length > i4;
            Context context = getContext();
            this.f1575p.setContentDescription(context.getString(this.f1571n ? com.shungo.app.R.string.character_counter_overflowed_content_description : com.shungo.app.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1569m)));
            if (z4 != this.f1571n) {
                o();
            }
            g0.c cVarC = g0.c.c();
            h1 h1Var = this.f1575p;
            String string2 = getContext().getString(com.shungo.app.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1569m));
            if (string2 == null) {
                cVarC.getClass();
            } else {
                string = cVarC.d(string2, cVarC.f2289c).toString();
            }
            h1Var.setText(string);
        }
        if (this.f1553e == null || z4 == this.f1571n) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h1 h1Var = this.f1575p;
        if (h1Var != null) {
            l(h1Var, this.f1571n ? this.f1577q : this.f1579r);
            if (!this.f1571n && (colorStateList2 = this.f1595z) != null) {
                this.f1575p.setTextColor(colorStateList2);
            }
            if (!this.f1571n || (colorStateList = this.A) == null) {
                return;
            }
            this.f1575p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1588v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        n nVar = this.f1551d;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.B0 = false;
        if (this.f1553e != null && this.f1553e.getMeasuredHeight() < (iMax = Math.max(nVar.getMeasuredHeight(), this.f1549c.getMeasuredHeight()))) {
            this.f1553e.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zQ = q();
        if (z4 || zQ) {
            this.f1553e.post(new androidx.activity.d(12, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        EditText editText = this.f1553e;
        if (editText != null) {
            ThreadLocal threadLocal = z1.c.f5475a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.W;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = z1.c.f5475a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            z1.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = z1.c.f5476b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            h hVar = this.K;
            if (hVar != null) {
                int i8 = rect.bottom;
                hVar.setBounds(rect.left, i8 - this.S, rect.right, i8);
            }
            h hVar2 = this.L;
            if (hVar2 != null) {
                int i9 = rect.bottom;
                hVar2.setBounds(rect.left, i9 - this.T, rect.right, i9);
            }
            if (this.D) {
                float textSize = this.f1553e.getTextSize();
                b bVar = this.f1588v0;
                if (bVar.f5456h != textSize) {
                    bVar.f5456h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f1553e.getGravity();
                int i10 = (gravity & (-113)) | 48;
                if (bVar.f5455g != i10) {
                    bVar.f5455g = i10;
                    bVar.h(false);
                }
                if (bVar.f5453f != gravity) {
                    bVar.f5453f = gravity;
                    bVar.h(false);
                }
                if (this.f1553e == null) {
                    throw new IllegalStateException();
                }
                boolean zQ1 = c3.h.q1(this);
                int i11 = rect.bottom;
                Rect rect2 = this.f1546a0;
                rect2.bottom = i11;
                int i12 = this.P;
                if (i12 == 1) {
                    rect2.left = g(rect.left, zQ1);
                    rect2.top = rect.top + this.Q;
                    rect2.right = h(rect.right, zQ1);
                } else if (i12 != 2) {
                    rect2.left = g(rect.left, zQ1);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zQ1);
                } else {
                    rect2.left = this.f1553e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f1553e.getPaddingRight();
                }
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                int i16 = rect2.bottom;
                Rect rect3 = bVar.f5449d;
                if (rect3.left != i13 || rect3.top != i14 || rect3.right != i15 || rect3.bottom != i16) {
                    rect3.set(i13, i14, i15, i16);
                    bVar.M = true;
                }
                if (this.f1553e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.O;
                textPaint.setTextSize(bVar.f5456h);
                textPaint.setTypeface(bVar.f5469u);
                textPaint.setLetterSpacing(bVar.W);
                float f5 = -textPaint.ascent();
                rect2.left = this.f1553e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.P != 1 || this.f1553e.getMinLines() > 1) ? rect.top + this.f1553e.getCompoundPaddingTop() : (int) (rect.centerY() - (f5 / 2.0f));
                rect2.right = rect.right - this.f1553e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.f1553e.getMinLines() > 1) ? rect.bottom - this.f1553e.getCompoundPaddingBottom() : (int) (rect2.top + f5);
                rect2.bottom = compoundPaddingBottom;
                int i17 = rect2.left;
                int i18 = rect2.top;
                int i19 = rect2.right;
                Rect rect4 = bVar.f5447c;
                if (rect4.left != i17 || rect4.top != i18 || rect4.right != i19 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i17, i18, i19, compoundPaddingBottom);
                    bVar.M = true;
                }
                bVar.h(false);
                if (!e() || this.f1586u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        EditText editText;
        super.onMeasure(i4, i5);
        boolean z4 = this.B0;
        n nVar = this.f1551d;
        if (!z4) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        if (this.f1585u != null && (editText = this.f1553e) != null) {
            this.f1585u.setGravity(editText.getGravity());
            this.f1585u.setPadding(this.f1553e.getCompoundPaddingLeft(), this.f1553e.getCompoundPaddingTop(), this.f1553e.getCompoundPaddingRight(), this.f1553e.getCompoundPaddingBottom());
        }
        nVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.f3594b);
        setError(zVar.f3119d);
        if (zVar.f3120e) {
            post(new j(8, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z4 = i4 == 1;
        if (z4 != this.N) {
            f2.c cVar = this.M.f2096e;
            RectF rectF = this.f1548b0;
            float fA = cVar.a(rectF);
            float fA2 = this.M.f2097f.a(rectF);
            float fA3 = this.M.f2099h.a(rectF);
            float fA4 = this.M.f2098g.a(rectF);
            l lVar = this.M;
            c3.h hVar = lVar.f2092a;
            c3.h hVar2 = lVar.f2093b;
            c3.h hVar3 = lVar.f2095d;
            c3.h hVar4 = lVar.f2094c;
            f2.k kVar = new f2.k();
            kVar.f2080a = hVar2;
            f2.k.b(hVar2);
            kVar.f2081b = hVar;
            f2.k.b(hVar);
            kVar.f2083d = hVar4;
            f2.k.b(hVar4);
            kVar.f2082c = hVar3;
            f2.k.b(hVar3);
            kVar.f2084e = new f2.a(fA2);
            kVar.f2085f = new f2.a(fA);
            kVar.f2087h = new f2.a(fA4);
            kVar.f2086g = new f2.a(fA3);
            l lVarA = kVar.a();
            this.N = z4;
            setShapeAppearanceModel(lVarA);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.f3119d = getError();
        }
        n nVar = this.f1551d;
        zVar.f3120e = nVar.f3043j != 0 && nVar.f3041h.isChecked();
        return zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.B;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueI2 = c3.h.i2(context, com.shungo.app.R.attr.colorControlActivated);
            if (typedValueI2 != null) {
                int i4 = typedValueI2.resourceId;
                if (i4 != 0) {
                    colorStateListValueOf = d.b(context, i4);
                } else {
                    int i5 = typedValueI2.data;
                    if (i5 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i5);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f1553e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f1553e.getTextCursorDrawable().mutate();
        if ((m() || (this.f1575p != null && this.f1571n)) && (colorStateList = this.C) != null) {
            colorStateListValueOf = colorStateList;
        }
        c0.b.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z4;
        if (this.f1553e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z5 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            v vVar = this.f1549c;
            if (vVar.getMeasuredWidth() > 0) {
                int measuredWidth = vVar.getMeasuredWidth() - this.f1553e.getPaddingLeft();
                if (this.f1552d0 == null || this.f1554e0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f1552d0 = colorDrawable;
                    this.f1554e0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] drawableArrA = p.a(this.f1553e);
                Drawable drawable = drawableArrA[0];
                ColorDrawable colorDrawable2 = this.f1552d0;
                if (drawable != colorDrawable2) {
                    p.e(this.f1553e, colorDrawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (this.f1552d0 != null) {
                Drawable[] drawableArrA2 = p.a(this.f1553e);
                p.e(this.f1553e, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f1552d0 = null;
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (this.f1552d0 != null) {
            Drawable[] drawableArrA3 = p.a(this.f1553e);
            p.e(this.f1553e, null, drawableArrA3[1], drawableArrA3[2], drawableArrA3[3]);
            this.f1552d0 = null;
            z4 = true;
        } else {
            z4 = false;
        }
        n nVar = this.f1551d;
        if ((nVar.e() || ((nVar.f3043j != 0 && nVar.d()) || nVar.f3050q != null)) && nVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = nVar.f3051r.getMeasuredWidth() - this.f1553e.getPaddingRight();
            if (nVar.e()) {
                checkableImageButton = nVar.f3037d;
            } else if (nVar.f3043j != 0 && nVar.d()) {
                checkableImageButton = nVar.f3041h;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = i0.m.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrA4 = p.a(this.f1553e);
            ColorDrawable colorDrawable3 = this.f1558g0;
            if (colorDrawable3 == null || this.f1560h0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f1558g0 = colorDrawable4;
                    this.f1560h0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrA4[2];
                ColorDrawable colorDrawable5 = this.f1558g0;
                if (drawable2 != colorDrawable5) {
                    this.f1562i0 = drawable2;
                    p.e(this.f1553e, drawableArrA4[0], drawableArrA4[1], colorDrawable5, drawableArrA4[3]);
                } else {
                    z5 = z4;
                }
            } else {
                this.f1560h0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                p.e(this.f1553e, drawableArrA4[0], drawableArrA4[1], this.f1558g0, drawableArrA4[3]);
            }
        } else {
            if (this.f1558g0 == null) {
                return z4;
            }
            Drawable[] drawableArrA5 = p.a(this.f1553e);
            if (drawableArrA5[2] == this.f1558g0) {
                p.e(this.f1553e, drawableArrA5[0], drawableArrA5[1], this.f1562i0, drawableArrA5[3]);
            } else {
                z5 = z4;
            }
            this.f1558g0 = null;
        }
        return z5;
    }

    public final void r() {
        Drawable background;
        h1 h1Var;
        PorterDuffColorFilter porterDuffColorFilterG;
        PorterDuffColorFilter porterDuffColorFilterG2;
        EditText editText = this.f1553e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = t1.f2777a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = i.x.f2833b;
            synchronized (i.x.class) {
                porterDuffColorFilterG2 = u2.g(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterG2);
            return;
        }
        if (!this.f1571n || (h1Var = this.f1575p) == null) {
            drawableMutate.clearColorFilter();
            this.f1553e.refreshDrawableState();
            return;
        }
        int currentTextColor = h1Var.getCurrentTextColor();
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode mode4 = i.x.f2833b;
        synchronized (i.x.class) {
            porterDuffColorFilterG = u2.g(currentTextColor, mode3);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final void s() {
        EditText editText = this.f1553e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f1553e;
            WeakHashMap weakHashMap = v0.f2983a;
            e0.q(editText2, editTextBoxBackground);
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.V != i4) {
            this.V = i4;
            this.f1576p0 = i4;
            this.f1580r0 = i4;
            this.f1582s0 = i4;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        Context context = getContext();
        Object obj = d.f5428a;
        setBoxBackgroundColor(z.c.a(context, i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1576p0 = defaultColor;
        this.V = defaultColor;
        this.f1578q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1580r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1582s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.P) {
            return;
        }
        this.P = i4;
        if (this.f1553e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.Q = i4;
    }

    public void setBoxCornerFamily(int i4) {
        f2.k kVarE = this.M.e();
        f2.c cVar = this.M.f2096e;
        c3.h hVarX0 = c3.h.x0(i4);
        kVarE.f2080a = hVarX0;
        f2.k.b(hVarX0);
        kVarE.f2084e = cVar;
        f2.c cVar2 = this.M.f2097f;
        c3.h hVarX1 = c3.h.x0(i4);
        kVarE.f2081b = hVarX1;
        f2.k.b(hVarX1);
        kVarE.f2085f = cVar2;
        f2.c cVar3 = this.M.f2099h;
        c3.h hVarX2 = c3.h.x0(i4);
        kVarE.f2083d = hVarX2;
        f2.k.b(hVarX2);
        kVarE.f2087h = cVar3;
        f2.c cVar4 = this.M.f2098g;
        c3.h hVarX3 = c3.h.x0(i4);
        kVarE.f2082c = hVarX3;
        f2.k.b(hVarX3);
        kVarE.f2086g = cVar4;
        this.M = kVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f1572n0 != i4) {
            this.f1572n0 = i4;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1568l0 = colorStateList.getDefaultColor();
            this.f1584t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1570m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1572n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1572n0 != colorStateList.getDefaultColor()) {
            this.f1572n0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1574o0 != colorStateList) {
            this.f1574o0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.S = i4;
        x();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.T = i4;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f1567l != z4) {
            r rVar = this.f1565k;
            if (z4) {
                h1 h1Var = new h1(getContext(), null);
                this.f1575p = h1Var;
                h1Var.setId(com.shungo.app.R.id.textinput_counter);
                Typeface typeface = this.f1550c0;
                if (typeface != null) {
                    this.f1575p.setTypeface(typeface);
                }
                this.f1575p.setMaxLines(1);
                rVar.a(this.f1575p, 2);
                i0.m.h((ViewGroup.MarginLayoutParams) this.f1575p.getLayoutParams(), getResources().getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1575p != null) {
                    EditText editText = this.f1553e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                rVar.g(this.f1575p, 2);
                this.f1575p = null;
            }
            this.f1567l = z4;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f1569m != i4) {
            if (i4 > 0) {
                this.f1569m = i4;
            } else {
                this.f1569m = -1;
            }
            if (!this.f1567l || this.f1575p == null) {
                return;
            }
            EditText editText = this.f1553e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f1577q != i4) {
            this.f1577q = i4;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f1579r != i4) {
            this.f1579r = i4;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1595z != colorStateList) {
            this.f1595z = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (m() || (this.f1575p != null && this.f1571n)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1564j0 = colorStateList;
        this.f1566k0 = colorStateList;
        if (this.f1553e != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        k(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f1551d.f3041h.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f1551d.f3041h.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i4) {
        n nVar = this.f1551d;
        CharSequence text = i4 != 0 ? nVar.getResources().getText(i4) : null;
        CheckableImageButton checkableImageButton = nVar.f3041h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i4) {
        n nVar = this.f1551d;
        Drawable drawableG = i4 != 0 ? q.g(nVar.getContext(), i4) : null;
        CheckableImageButton checkableImageButton = nVar.f3041h;
        checkableImageButton.setImageDrawable(drawableG);
        if (drawableG != null) {
            ColorStateList colorStateList = nVar.f3045l;
            PorterDuff.Mode mode = nVar.f3046m;
            TextInputLayout textInputLayout = nVar.f3035b;
            c3.h.H(textInputLayout, checkableImageButton, colorStateList, mode);
            c3.h.g2(textInputLayout, checkableImageButton, nVar.f3045l);
        }
    }

    public void setEndIconMinSize(int i4) {
        n nVar = this.f1551d;
        if (i4 < 0) {
            nVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i4 != nVar.f3047n) {
            nVar.f3047n = i4;
            CheckableImageButton checkableImageButton = nVar.f3041h;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
            CheckableImageButton checkableImageButton2 = nVar.f3037d;
            checkableImageButton2.setMinimumWidth(i4);
            checkableImageButton2.setMinimumHeight(i4);
        }
    }

    public void setEndIconMode(int i4) {
        this.f1551d.g(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f1551d;
        View.OnLongClickListener onLongClickListener = nVar.f3049p;
        CheckableImageButton checkableImageButton = nVar.f3041h;
        checkableImageButton.setOnClickListener(onClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f1551d;
        nVar.f3049p = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f3041h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.f1551d;
        nVar.f3048o = scaleType;
        nVar.f3041h.setScaleType(scaleType);
        nVar.f3037d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.f1551d;
        if (nVar.f3045l != colorStateList) {
            nVar.f3045l = colorStateList;
            c3.h.H(nVar.f3035b, nVar.f3041h, colorStateList, nVar.f3046m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1551d;
        if (nVar.f3046m != mode) {
            nVar.f3046m = mode;
            c3.h.H(nVar.f3035b, nVar.f3041h, nVar.f3045l, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f1551d.h(z4);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f1565k;
        if (!rVar.f3083q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            rVar.f();
            return;
        }
        rVar.c();
        rVar.f3082p = charSequence;
        rVar.f3084r.setText(charSequence);
        int i4 = rVar.f3080n;
        if (i4 != 1) {
            rVar.f3081o = 1;
        }
        rVar.i(i4, rVar.f3081o, rVar.h(rVar.f3084r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        r rVar = this.f1565k;
        rVar.f3086t = i4;
        h1 h1Var = rVar.f3084r;
        if (h1Var != null) {
            WeakHashMap weakHashMap = v0.f2983a;
            h0.f(h1Var, i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f1565k;
        rVar.f3085s = charSequence;
        h1 h1Var = rVar.f3084r;
        if (h1Var != null) {
            h1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        r rVar = this.f1565k;
        if (rVar.f3083q == z4) {
            return;
        }
        rVar.c();
        TextInputLayout textInputLayout = rVar.f3074h;
        if (z4) {
            h1 h1Var = new h1(rVar.f3073g, null);
            rVar.f3084r = h1Var;
            h1Var.setId(com.shungo.app.R.id.textinput_error);
            rVar.f3084r.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f3084r.setTypeface(typeface);
            }
            int i4 = rVar.f3087u;
            rVar.f3087u = i4;
            h1 h1Var2 = rVar.f3084r;
            if (h1Var2 != null) {
                textInputLayout.l(h1Var2, i4);
            }
            ColorStateList colorStateList = rVar.f3088v;
            rVar.f3088v = colorStateList;
            h1 h1Var3 = rVar.f3084r;
            if (h1Var3 != null && colorStateList != null) {
                h1Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = rVar.f3085s;
            rVar.f3085s = charSequence;
            h1 h1Var4 = rVar.f3084r;
            if (h1Var4 != null) {
                h1Var4.setContentDescription(charSequence);
            }
            int i5 = rVar.f3086t;
            rVar.f3086t = i5;
            h1 h1Var5 = rVar.f3084r;
            if (h1Var5 != null) {
                WeakHashMap weakHashMap = v0.f2983a;
                h0.f(h1Var5, i5);
            }
            rVar.f3084r.setVisibility(4);
            rVar.a(rVar.f3084r, 0);
        } else {
            rVar.f();
            rVar.g(rVar.f3084r, 0);
            rVar.f3084r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        rVar.f3083q = z4;
    }

    public void setErrorIconDrawable(int i4) {
        n nVar = this.f1551d;
        nVar.i(i4 != 0 ? q.g(nVar.getContext(), i4) : null);
        c3.h.g2(nVar.f3035b, nVar.f3037d, nVar.f3038e);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f1551d;
        CheckableImageButton checkableImageButton = nVar.f3037d;
        View.OnLongClickListener onLongClickListener = nVar.f3040g;
        checkableImageButton.setOnClickListener(onClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f1551d;
        nVar.f3040g = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f3037d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.f1551d;
        if (nVar.f3038e != colorStateList) {
            nVar.f3038e = colorStateList;
            c3.h.H(nVar.f3035b, nVar.f3037d, colorStateList, nVar.f3039f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1551d;
        if (nVar.f3039f != mode) {
            nVar.f3039f = mode;
            c3.h.H(nVar.f3035b, nVar.f3037d, nVar.f3038e, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        r rVar = this.f1565k;
        rVar.f3087u = i4;
        h1 h1Var = rVar.f3084r;
        if (h1Var != null) {
            rVar.f3074h.l(h1Var, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f1565k;
        rVar.f3088v = colorStateList;
        h1 h1Var = rVar.f3084r;
        if (h1Var == null || colorStateList == null) {
            return;
        }
        h1Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.f1590w0 != z4) {
            this.f1590w0 = z4;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f1565k;
        if (zIsEmpty) {
            if (rVar.f3090x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f3090x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f3089w = charSequence;
        rVar.f3091y.setText(charSequence);
        int i4 = rVar.f3080n;
        if (i4 != 2) {
            rVar.f3081o = 2;
        }
        rVar.i(i4, rVar.f3081o, rVar.h(rVar.f3091y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f1565k;
        rVar.A = colorStateList;
        h1 h1Var = rVar.f3091y;
        if (h1Var == null || colorStateList == null) {
            return;
        }
        h1Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        r rVar = this.f1565k;
        if (rVar.f3090x == z4) {
            return;
        }
        rVar.c();
        if (z4) {
            h1 h1Var = new h1(rVar.f3073g, null);
            rVar.f3091y = h1Var;
            h1Var.setId(com.shungo.app.R.id.textinput_helper_text);
            rVar.f3091y.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f3091y.setTypeface(typeface);
            }
            rVar.f3091y.setVisibility(4);
            h0.f(rVar.f3091y, 1);
            int i4 = rVar.f3092z;
            rVar.f3092z = i4;
            h1 h1Var2 = rVar.f3091y;
            if (h1Var2 != null) {
                h1Var2.setTextAppearance(i4);
            }
            ColorStateList colorStateList = rVar.A;
            rVar.A = colorStateList;
            h1 h1Var3 = rVar.f3091y;
            if (h1Var3 != null && colorStateList != null) {
                h1Var3.setTextColor(colorStateList);
            }
            rVar.a(rVar.f3091y, 1);
            rVar.f3091y.setAccessibilityDelegate(new i2.q(rVar));
        } else {
            rVar.c();
            int i5 = rVar.f3080n;
            if (i5 == 2) {
                rVar.f3081o = 0;
            }
            rVar.i(i5, rVar.f3081o, rVar.h(rVar.f3091y, ""));
            rVar.g(rVar.f3091y, 1);
            rVar.f3091y = null;
            TextInputLayout textInputLayout = rVar.f3074h;
            textInputLayout.r();
            textInputLayout.x();
        }
        rVar.f3090x = z4;
    }

    public void setHelperTextTextAppearance(int i4) {
        r rVar = this.f1565k;
        rVar.f3092z = i4;
        h1 h1Var = rVar.f3091y;
        if (h1Var != null) {
            h1Var.setTextAppearance(i4);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f1592x0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.D) {
            this.D = z4;
            if (z4) {
                CharSequence hint = this.f1553e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f1553e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f1553e.getHint())) {
                    this.f1553e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f1553e != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i4) {
        b bVar = this.f1588v0;
        View view = bVar.f5443a;
        c2.d dVar = new c2.d(view.getContext(), i4);
        ColorStateList colorStateList = dVar.f1252j;
        if (colorStateList != null) {
            bVar.f5459k = colorStateList;
        }
        float f5 = dVar.f1253k;
        if (f5 != 0.0f) {
            bVar.f5457i = f5;
        }
        ColorStateList colorStateList2 = dVar.f1243a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f1247e;
        bVar.T = dVar.f1248f;
        bVar.R = dVar.f1249g;
        bVar.V = dVar.f1251i;
        c2.a aVar = bVar.f5473y;
        if (aVar != null) {
            aVar.f1236l = true;
        }
        n0 n0Var = new n0(28, bVar);
        dVar.a();
        bVar.f5473y = new c2.a(n0Var, dVar.f1256n);
        dVar.c(view.getContext(), bVar.f5473y);
        bVar.h(false);
        this.f1566k0 = bVar.f5459k;
        if (this.f1553e != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1566k0 != colorStateList) {
            if (this.f1564j0 == null) {
                b bVar = this.f1588v0;
                if (bVar.f5459k != colorStateList) {
                    bVar.f5459k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f1566k0 = colorStateList;
            if (this.f1553e != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(y yVar) {
        this.f1573o = yVar;
    }

    public void setMaxEms(int i4) {
        this.f1559h = i4;
        EditText editText = this.f1553e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxEms(i4);
    }

    public void setMaxWidth(int i4) {
        this.f1563j = i4;
        EditText editText = this.f1553e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxWidth(i4);
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f1557g = i4;
        EditText editText = this.f1553e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinEms(i4);
    }

    public void setMinWidth(int i4) {
        this.f1561i = i4;
        EditText editText = this.f1553e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinWidth(i4);
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        n nVar = this.f1551d;
        nVar.f3041h.setContentDescription(i4 != 0 ? nVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        n nVar = this.f1551d;
        nVar.f3041h.setImageDrawable(i4 != 0 ? q.g(nVar.getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        n nVar = this.f1551d;
        if (z4 && nVar.f3043j != 1) {
            nVar.g(1);
        } else if (z4) {
            nVar.getClass();
        } else {
            nVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.f1551d;
        nVar.f3045l = colorStateList;
        c3.h.H(nVar.f3035b, nVar.f3041h, colorStateList, nVar.f3046m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1551d;
        nVar.f3046m = mode;
        c3.h.H(nVar.f3035b, nVar.f3041h, nVar.f3045l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1585u == null) {
            h1 h1Var = new h1(getContext(), null);
            this.f1585u = h1Var;
            h1Var.setId(com.shungo.app.R.id.textinput_placeholder);
            e0.s(this.f1585u, 2);
            i iVarD = d();
            this.f1591x = iVarD;
            iVarD.f1198c = 67L;
            this.f1593y = d();
            setPlaceholderTextAppearance(this.f1589w);
            setPlaceholderTextColor(this.f1587v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1583t) {
                setPlaceholderTextEnabled(true);
            }
            this.f1581s = charSequence;
        }
        EditText editText = this.f1553e;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f1589w = i4;
        h1 h1Var = this.f1585u;
        if (h1Var != null) {
            h1Var.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1587v != colorStateList) {
            this.f1587v = colorStateList;
            h1 h1Var = this.f1585u;
            if (h1Var == null || colorStateList == null) {
                return;
            }
            h1Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f1549c;
        vVar.getClass();
        vVar.f3109d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f3108c.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i4) {
        this.f1549c.f3108c.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1549c.f3108c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(l lVar) {
        h hVar = this.G;
        if (hVar == null || hVar.f2057b.f2035a == lVar) {
            return;
        }
        this.M = lVar;
        b();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f1549c.f3110e.setCheckable(z4);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1549c.f3110e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? q.g(getContext(), i4) : null);
    }

    public void setStartIconMinSize(int i4) {
        v vVar = this.f1549c;
        if (i4 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i4 != vVar.f3113h) {
            vVar.f3113h = i4;
            CheckableImageButton checkableImageButton = vVar.f3110e;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f1549c;
        View.OnLongClickListener onLongClickListener = vVar.f3115j;
        CheckableImageButton checkableImageButton = vVar.f3110e;
        checkableImageButton.setOnClickListener(onClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f1549c;
        vVar.f3115j = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f3110e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c3.h.r2(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f1549c;
        vVar.f3114i = scaleType;
        vVar.f3110e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f1549c;
        if (vVar.f3111f != colorStateList) {
            vVar.f3111f = colorStateList;
            c3.h.H(vVar.f3107b, vVar.f3110e, colorStateList, vVar.f3112g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f1549c;
        if (vVar.f3112g != mode) {
            vVar.f3112g = mode;
            c3.h.H(vVar.f3107b, vVar.f3110e, vVar.f3111f, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f1549c.c(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        n nVar = this.f1551d;
        nVar.getClass();
        nVar.f3050q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        nVar.f3051r.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i4) {
        this.f1551d.f3051r.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1551d.f3051r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x xVar) {
        EditText editText = this.f1553e;
        if (editText != null) {
            v0.l(editText, xVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1550c0) {
            this.f1550c0 = typeface;
            this.f1588v0.m(typeface);
            r rVar = this.f1565k;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                h1 h1Var = rVar.f3084r;
                if (h1Var != null) {
                    h1Var.setTypeface(typeface);
                }
                h1 h1Var2 = rVar.f3091y;
                if (h1Var2 != null) {
                    h1Var2.setTypeface(typeface);
                }
            }
            h1 h1Var3 = this.f1575p;
            if (h1Var3 != null) {
                h1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.f1547b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        h1 h1Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f1553e;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1553e;
        boolean z7 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1564j0;
        b bVar = this.f1588v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f1564j0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1584t0) : this.f1584t0));
        } else if (m()) {
            h1 h1Var2 = this.f1565k.f3084r;
            bVar.i(h1Var2 != null ? h1Var2.getTextColors() : null);
        } else if (this.f1571n && (h1Var = this.f1575p) != null) {
            bVar.i(h1Var.getTextColors());
        } else if (z7 && (colorStateList = this.f1566k0) != null && bVar.f5459k != colorStateList) {
            bVar.f5459k = colorStateList;
            bVar.h(false);
        }
        n nVar = this.f1551d;
        v vVar = this.f1549c;
        if (z6 || !this.f1590w0 || (isEnabled() && z7)) {
            if (z5 || this.f1586u0) {
                ValueAnimator valueAnimator = this.f1594y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1594y0.cancel();
                }
                if (z4 && this.f1592x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f1586u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f1553e;
                v(editText3 != null ? editText3.getText() : null);
                vVar.f3116k = false;
                vVar.e();
                nVar.f3052s = false;
                nVar.n();
                return;
            }
            return;
        }
        if (z5 || !this.f1586u0) {
            ValueAnimator valueAnimator2 = this.f1594y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1594y0.cancel();
            }
            if (z4 && this.f1592x0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && (!((i2.h) this.G).f3015y.f3013v.isEmpty()) && e()) {
                ((i2.h) this.G).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1586u0 = true;
            h1 h1Var3 = this.f1585u;
            if (h1Var3 != null && this.f1583t) {
                h1Var3.setText((CharSequence) null);
                c1.t.a(this.f1547b, this.f1593y);
                this.f1585u.setVisibility(4);
            }
            vVar.f3116k = true;
            vVar.e();
            nVar.f3052s = true;
            nVar.n();
        }
    }

    public final void v(Editable editable) {
        ((w) this.f1573o).getClass();
        FrameLayout frameLayout = this.f1547b;
        if ((editable != null && editable.length() != 0) || this.f1586u0) {
            h1 h1Var = this.f1585u;
            if (h1Var == null || !this.f1583t) {
                return;
            }
            h1Var.setText((CharSequence) null);
            c1.t.a(frameLayout, this.f1593y);
            this.f1585u.setVisibility(4);
            return;
        }
        if (this.f1585u == null || !this.f1583t || TextUtils.isEmpty(this.f1581s)) {
            return;
        }
        this.f1585u.setText(this.f1581s);
        c1.t.a(frameLayout, this.f1591x);
        this.f1585u.setVisibility(0);
        this.f1585u.bringToFront();
        announceForAccessibility(this.f1581s);
    }

    public final void w(boolean z4, boolean z5) {
        int defaultColor = this.f1574o0.getDefaultColor();
        int colorForState = this.f1574o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1574o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.U = colorForState2;
        } else if (z5) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void x() {
        h1 h1Var;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z4 = false;
        boolean z5 = isFocused() || ((editText2 = this.f1553e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1553e) != null && editText.isHovered())) {
            z4 = true;
        }
        if (!isEnabled()) {
            this.U = this.f1584t0;
        } else if (m()) {
            if (this.f1574o0 != null) {
                w(z5, z4);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.f1571n || (h1Var = this.f1575p) == null) {
            if (z5) {
                this.U = this.f1572n0;
            } else if (z4) {
                this.U = this.f1570m0;
            } else {
                this.U = this.f1568l0;
            }
        } else if (this.f1574o0 != null) {
            w(z5, z4);
        } else {
            this.U = h1Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        n nVar = this.f1551d;
        nVar.l();
        CheckableImageButton checkableImageButton = nVar.f3037d;
        ColorStateList colorStateList = nVar.f3038e;
        TextInputLayout textInputLayout = nVar.f3035b;
        c3.h.g2(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = nVar.f3045l;
        CheckableImageButton checkableImageButton2 = nVar.f3041h;
        c3.h.g2(textInputLayout, checkableImageButton2, colorStateList2);
        if (nVar.b() instanceof i2.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                c3.h.H(textInputLayout, checkableImageButton2, nVar.f3045l, nVar.f3046m);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                c0.b.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        v vVar = this.f1549c;
        c3.h.g2(vVar.f3107b, vVar.f3110e, vVar.f3111f);
        if (this.P == 2) {
            int i4 = this.R;
            if (z5 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i4 && e() && !this.f1586u0) {
                if (e()) {
                    ((i2.h) this.G).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.f1578q0;
            } else if (z4 && !z5) {
                this.V = this.f1582s0;
            } else if (z5) {
                this.V = this.f1580r0;
            } else {
                this.V = this.f1576p0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1549c.b(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1551d.f3041h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1551d.f3041h.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1551d.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1551d.f3041h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.f1551d;
        CheckableImageButton checkableImageButton = nVar.f3041h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = nVar.f3045l;
            PorterDuff.Mode mode = nVar.f3046m;
            TextInputLayout textInputLayout = nVar.f3035b;
            c3.h.H(textInputLayout, checkableImageButton, colorStateList, mode);
            c3.h.g2(textInputLayout, checkableImageButton, nVar.f3045l);
        }
    }
}
