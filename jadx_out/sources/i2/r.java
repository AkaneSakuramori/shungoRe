package i2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.R;
import i.h1;
import i0.f0;
import i0.h0;
import i0.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f3073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f3075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f3077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f3078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f3082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h1 f3084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f3085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f3088v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f3089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h1 f3091y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3092z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3073g = context;
        this.f3074h = textInputLayout;
        this.f3079m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3067a = c3.h.k2(context, R.attr.motionDurationShort4, 217);
        this.f3068b = c3.h.k2(context, R.attr.motionDurationMedium4, 167);
        this.f3069c = c3.h.k2(context, R.attr.motionDurationShort4, 167);
        this.f3070d = c3.h.l2(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, o1.a.f3598d);
        LinearInterpolator linearInterpolator = o1.a.f3595a;
        this.f3071e = c3.h.l2(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3072f = c3.h.l2(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i4) {
        if (this.f3075i == null && this.f3077k == null) {
            Context context = this.f3073g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3075i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3075i;
            TextInputLayout textInputLayout = this.f3074h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3077k = new FrameLayout(context);
            this.f3075i.addView(this.f3077k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 == 0 || i4 == 1) {
            this.f3077k.setVisibility(0);
            this.f3077k.addView(textView);
        } else {
            this.f3075i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3075i.setVisibility(0);
        this.f3076j++;
    }

    public final void b() {
        if (this.f3075i != null) {
            TextInputLayout textInputLayout = this.f3074h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3073g;
                boolean zP1 = c3.h.p1(context);
                LinearLayout linearLayout = this.f3075i;
                WeakHashMap weakHashMap = v0.f2983a;
                int iF = f0.f(editText);
                if (zP1) {
                    iF = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zP1) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iE = f0.e(editText);
                if (zP1) {
                    iE = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                f0.k(linearLayout, iF, dimensionPixelSize, iE, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f3078l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, TextView textView, int i4, int i5, int i6) {
        if (textView == null || !z4) {
            return;
        }
        if (i4 == i6 || i4 == i5) {
            boolean z5 = i6 == i4;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
            int i7 = this.f3069c;
            objectAnimatorOfFloat.setDuration(z5 ? this.f3068b : i7);
            objectAnimatorOfFloat.setInterpolator(z5 ? this.f3071e : this.f3072f);
            if (i4 == i6 && i5 != 0) {
                objectAnimatorOfFloat.setStartDelay(i7);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i6 != i4 || i5 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f3079m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f3067a);
            objectAnimatorOfFloat2.setInterpolator(this.f3070d);
            objectAnimatorOfFloat2.setStartDelay(i7);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i4) {
        if (i4 == 1) {
            return this.f3084r;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f3091y;
    }

    public final void f() {
        this.f3082p = null;
        c();
        if (this.f3080n == 1) {
            if (!this.f3090x || TextUtils.isEmpty(this.f3089w)) {
                this.f3081o = 0;
            } else {
                this.f3081o = 2;
            }
        }
        i(this.f3080n, this.f3081o, h(this.f3084r, ""));
    }

    public final void g(TextView textView, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3075i;
        if (linearLayout == null) {
            return;
        }
        if ((i4 == 0 || i4 == 1) && (frameLayout = this.f3077k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i5 = this.f3076j - 1;
        this.f3076j = i5;
        LinearLayout linearLayout2 = this.f3075i;
        if (i5 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f2983a;
        TextInputLayout textInputLayout = this.f3074h;
        return h0.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f3081o == this.f3080n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i4, int i5, boolean z4) {
        TextView textViewE;
        TextView textViewE2;
        if (i4 == i5) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3078l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3090x, this.f3091y, 2, i4, i5);
            d(arrayList, this.f3083q, this.f3084r, 1, i4, i5);
            c3.h.U1(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i5, e(i4), i4, e(i5)));
            animatorSet.start();
        } else if (i4 != i5) {
            if (i5 != 0 && (textViewE2 = e(i5)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i4 != 0 && (textViewE = e(i4)) != null) {
                textViewE.setVisibility(4);
                if (i4 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f3080n = i5;
        }
        TextInputLayout textInputLayout = this.f3074h;
        textInputLayout.r();
        textInputLayout.u(z4, false);
        textInputLayout.x();
    }
}
