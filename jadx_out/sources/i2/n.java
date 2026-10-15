package i2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.R;
import i.h1;
import i0.e0;
import i0.f0;
import i0.h0;
import i0.v0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends LinearLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f3034x = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f3035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f3036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f3038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f3040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f3041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.activity.result.i f3042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f3044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f3045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f3048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f3049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f3050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f3051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f3053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f3054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j0.d f3055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f3056w;

    public n(TextInputLayout textInputLayout, e.c cVar) {
        CharSequence charSequenceQ;
        super(textInputLayout.getContext());
        this.f3043j = 0;
        this.f3044k = new LinkedHashSet();
        this.f3056w = new l(this);
        m mVar = new m(this);
        this.f3054u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3035b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3036c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f3037d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f3041h = checkableImageButtonA2;
        androidx.activity.result.i iVar = new androidx.activity.result.i();
        iVar.f318d = new SparseArray();
        iVar.f319e = this;
        iVar.f316b = cVar.n(28, 0);
        iVar.f317c = cVar.n(52, 0);
        this.f3042i = iVar;
        h1 h1Var = new h1(getContext(), null);
        this.f3051r = h1Var;
        if (cVar.r(38)) {
            this.f3038e = c3.h.Q0(getContext(), cVar, 38);
        }
        if (cVar.r(39)) {
            this.f3039f = c3.h.S1(cVar.k(39, -1), null);
        }
        if (cVar.r(37)) {
            i(cVar.h(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = v0.f2983a;
        e0.s(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!cVar.r(53)) {
            if (cVar.r(32)) {
                this.f3045l = c3.h.Q0(getContext(), cVar, 32);
            }
            if (cVar.r(33)) {
                this.f3046m = c3.h.S1(cVar.k(33, -1), null);
            }
        }
        if (cVar.r(30)) {
            g(cVar.k(30, 0));
            if (cVar.r(27) && checkableImageButtonA2.getContentDescription() != (charSequenceQ = cVar.q(27))) {
                checkableImageButtonA2.setContentDescription(charSequenceQ);
            }
            checkableImageButtonA2.setCheckable(cVar.b(26, true));
        } else if (cVar.r(53)) {
            if (cVar.r(54)) {
                this.f3045l = c3.h.Q0(getContext(), cVar, 54);
            }
            if (cVar.r(55)) {
                this.f3046m = c3.h.S1(cVar.k(55, -1), null);
            }
            g(cVar.b(53, false) ? 1 : 0);
            CharSequence charSequenceQ2 = cVar.q(51);
            if (checkableImageButtonA2.getContentDescription() != charSequenceQ2) {
                checkableImageButtonA2.setContentDescription(charSequenceQ2);
            }
        }
        int iE = cVar.e(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iE < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iE != this.f3047n) {
            this.f3047n = iE;
            checkableImageButtonA2.setMinimumWidth(iE);
            checkableImageButtonA2.setMinimumHeight(iE);
            checkableImageButtonA.setMinimumWidth(iE);
            checkableImageButtonA.setMinimumHeight(iE);
        }
        if (cVar.r(31)) {
            ImageView.ScaleType scaleTypeS0 = c3.h.s0(cVar.k(31, -1));
            this.f3048o = scaleTypeS0;
            checkableImageButtonA2.setScaleType(scaleTypeS0);
            checkableImageButtonA.setScaleType(scaleTypeS0);
        }
        h1Var.setVisibility(8);
        h1Var.setId(R.id.textinput_suffix_text);
        h1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        h0.f(h1Var, 1);
        h1Var.setTextAppearance(cVar.n(72, 0));
        if (cVar.r(73)) {
            h1Var.setTextColor(cVar.c(73));
        }
        CharSequence charSequenceQ3 = cVar.q(71);
        this.f3050q = TextUtils.isEmpty(charSequenceQ3) ? null : charSequenceQ3;
        h1Var.setText(charSequenceQ3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(h1Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f1556f0.add(mVar);
        if (textInputLayout.f1553e != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new h.f(2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (c3.h.p1(getContext())) {
            i0.m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        int i4 = this.f3043j;
        androidx.activity.result.i iVar = this.f3042i;
        SparseArray sparseArray = (SparseArray) iVar.f318d;
        o eVar = (o) sparseArray.get(i4);
        if (eVar == null) {
            if (i4 != -1) {
                int i5 = 1;
                if (i4 == 0) {
                    eVar = new e((n) iVar.f319e, i5);
                } else if (i4 == 1) {
                    eVar = new u((n) iVar.f319e, iVar.f317c);
                } else if (i4 == 2) {
                    eVar = new d((n) iVar.f319e);
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException(defpackage.a.e("Invalid end icon mode: ", i4));
                    }
                    eVar = new k((n) iVar.f319e);
                }
            } else {
                eVar = new e((n) iVar.f319e, 0);
            }
            sparseArray.append(i4, eVar);
        }
        return eVar;
    }

    public final int c() {
        int iC;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f3041h;
            iC = i0.m.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iC = 0;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        return f0.e(this.f3051r) + f0.e(this) + iC;
    }

    public final boolean d() {
        return this.f3036c.getVisibility() == 0 && this.f3041h.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f3037d.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z5;
        boolean zIsActivated;
        boolean zIsChecked;
        o oVarB = b();
        boolean zK = oVarB.k();
        CheckableImageButton checkableImageButton = this.f3041h;
        boolean z6 = true;
        if (!zK || (zIsChecked = checkableImageButton.isChecked()) == oVarB.l()) {
            z5 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z5 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == oVarB.j()) {
            z6 = z5;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z6) {
            c3.h.g2(this.f3035b, checkableImageButton, this.f3045l);
        }
    }

    public final void g(int i4) {
        if (this.f3043j == i4) {
            return;
        }
        o oVarB = b();
        j0.d dVar = this.f3055v;
        AccessibilityManager accessibilityManager = this.f3054u;
        if (dVar != null && accessibilityManager != null) {
            j0.c.b(accessibilityManager, dVar);
        }
        this.f3055v = null;
        oVarB.s();
        this.f3043j = i4;
        Iterator it = this.f3044k.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
        h(i4 != 0);
        o oVarB2 = b();
        int iD = this.f3042i.f316b;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableG = iD != 0 ? r3.q.g(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f3041h;
        checkableImageButton.setImageDrawable(drawableG);
        TextInputLayout textInputLayout = this.f3035b;
        if (drawableG != null) {
            c3.h.H(textInputLayout, checkableImageButton, this.f3045l, this.f3046m);
            c3.h.g2(textInputLayout, checkableImageButton, this.f3045l);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.k());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        oVarB2.r();
        j0.d dVarH = oVarB2.h();
        this.f3055v = dVarH;
        if (dVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = v0.f2983a;
            if (h0.b(this)) {
                j0.c.a(accessibilityManager, this.f3055v);
            }
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f3049p;
        checkableImageButton.setOnClickListener(onClickListenerF);
        c3.h.r2(checkableImageButton, onLongClickListener);
        EditText editText = this.f3053t;
        if (editText != null) {
            oVarB2.m(editText);
            j(oVarB2);
        }
        c3.h.H(textInputLayout, checkableImageButton, this.f3045l, this.f3046m);
        f(true);
    }

    public final void h(boolean z4) {
        if (d() != z4) {
            this.f3041h.setVisibility(z4 ? 0 : 8);
            k();
            m();
            this.f3035b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3037d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        c3.h.H(this.f3035b, checkableImageButton, this.f3038e, this.f3039f);
    }

    public final void j(o oVar) {
        if (this.f3053t == null) {
            return;
        }
        if (oVar.e() != null) {
            this.f3053t.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f3041h.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.f3036c.setVisibility((this.f3041h.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f3050q == null || this.f3052s) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f3037d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3035b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1565k.f3083q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f3043j != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int iE;
        TextInputLayout textInputLayout = this.f3035b;
        if (textInputLayout.f1553e == null) {
            return;
        }
        if (d() || e()) {
            iE = 0;
        } else {
            EditText editText = textInputLayout.f1553e;
            WeakHashMap weakHashMap = v0.f2983a;
            iE = f0.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f1553e.getPaddingTop();
        int paddingBottom = textInputLayout.f1553e.getPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f2983a;
        f0.k(this.f3051r, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void n() {
        h1 h1Var = this.f3051r;
        int visibility = h1Var.getVisibility();
        int i4 = (this.f3050q == null || this.f3052s) ? 8 : 0;
        if (visibility != i4) {
            b().p(i4 == 0);
        }
        k();
        h1Var.setVisibility(i4);
        this.f3035b.q();
    }
}
