package i2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.R;
import i.h1;
import i0.f0;
import i0.h0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f3107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f3108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f3109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f3110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f3111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f3112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView.ScaleType f3114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f3115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3116k;

    public v(TextInputLayout textInputLayout, e.c cVar) {
        CharSequence charSequenceQ;
        super(textInputLayout.getContext());
        this.f3107b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3110e = checkableImageButton;
        h1 h1Var = new h1(getContext(), null);
        this.f3108c = h1Var;
        if (c3.h.p1(getContext())) {
            i0.m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f3115j;
        checkableImageButton.setOnClickListener(null);
        c3.h.r2(checkableImageButton, onLongClickListener);
        this.f3115j = null;
        checkableImageButton.setOnLongClickListener(null);
        c3.h.r2(checkableImageButton, null);
        if (cVar.r(69)) {
            this.f3111f = c3.h.Q0(getContext(), cVar, 69);
        }
        if (cVar.r(70)) {
            this.f3112g = c3.h.S1(cVar.k(70, -1), null);
        }
        if (cVar.r(66)) {
            b(cVar.h(66));
            if (cVar.r(65) && checkableImageButton.getContentDescription() != (charSequenceQ = cVar.q(65))) {
                checkableImageButton.setContentDescription(charSequenceQ);
            }
            checkableImageButton.setCheckable(cVar.b(64, true));
        }
        int iE = cVar.e(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iE < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iE != this.f3113h) {
            this.f3113h = iE;
            checkableImageButton.setMinimumWidth(iE);
            checkableImageButton.setMinimumHeight(iE);
        }
        if (cVar.r(68)) {
            ImageView.ScaleType scaleTypeS0 = c3.h.s0(cVar.k(68, -1));
            this.f3114i = scaleTypeS0;
            checkableImageButton.setScaleType(scaleTypeS0);
        }
        h1Var.setVisibility(8);
        h1Var.setId(R.id.textinput_prefix_text);
        h1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = v0.f2983a;
        h0.f(h1Var, 1);
        h1Var.setTextAppearance(cVar.n(60, 0));
        if (cVar.r(61)) {
            h1Var.setTextColor(cVar.c(61));
        }
        CharSequence charSequenceQ2 = cVar.q(59);
        this.f3109d = TextUtils.isEmpty(charSequenceQ2) ? null : charSequenceQ2;
        h1Var.setText(charSequenceQ2);
        e();
        addView(checkableImageButton);
        addView(h1Var);
    }

    public final int a() {
        int iB;
        CheckableImageButton checkableImageButton = this.f3110e;
        if (checkableImageButton.getVisibility() == 0) {
            iB = i0.m.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iB = 0;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        return f0.f(this.f3108c) + f0.f(this) + iB;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3110e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3111f;
            PorterDuff.Mode mode = this.f3112g;
            TextInputLayout textInputLayout = this.f3107b;
            c3.h.H(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            c3.h.g2(textInputLayout, checkableImageButton, this.f3111f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3115j;
        checkableImageButton.setOnClickListener(null);
        c3.h.r2(checkableImageButton, onLongClickListener);
        this.f3115j = null;
        checkableImageButton.setOnLongClickListener(null);
        c3.h.r2(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z4) {
        CheckableImageButton checkableImageButton = this.f3110e;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int iF;
        EditText editText = this.f3107b.f1553e;
        if (editText == null) {
            return;
        }
        if (this.f3110e.getVisibility() == 0) {
            iF = 0;
        } else {
            WeakHashMap weakHashMap = v0.f2983a;
            iF = f0.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f2983a;
        f0.k(this.f3108c, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i4 = (this.f3109d == null || this.f3116k) ? 8 : 0;
        setVisibility((this.f3110e.getVisibility() == 0 || i4 == 0) ? 0 : 8);
        this.f3108c.setVisibility(i4);
        this.f3107b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        d();
    }
}
