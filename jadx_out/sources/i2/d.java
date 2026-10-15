package i2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f3006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f3007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f3008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f3009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f3010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f3011m;

    public d(n nVar) {
        super(nVar);
        this.f3008j = new com.google.android.material.datepicker.m(1, this);
        this.f3009k = new b(this, 0);
        this.f3003e = c3.h.k2(nVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f3004f = c3.h.k2(nVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f3005g = c3.h.l2(nVar.getContext(), R.attr.motionEasingLinearInterpolator, o1.a.f3595a);
        this.f3006h = c3.h.l2(nVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.f3598d);
    }

    @Override // i2.o
    public final void a() {
        if (this.f3058b.f3050q != null) {
            return;
        }
        t(u());
    }

    @Override // i2.o
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // i2.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // i2.o
    public final View.OnFocusChangeListener e() {
        return this.f3009k;
    }

    @Override // i2.o
    public final View.OnClickListener f() {
        return this.f3008j;
    }

    @Override // i2.o
    public final View.OnFocusChangeListener g() {
        return this.f3009k;
    }

    @Override // i2.o
    public final void m(EditText editText) {
        this.f3007i = editText;
        this.f3057a.setEndIconVisible(u());
    }

    @Override // i2.o
    public final void p(boolean z4) {
        if (this.f3058b.f3050q == null) {
            return;
        }
        t(z4);
    }

    @Override // i2.o
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f3006h);
        valueAnimatorOfFloat.setDuration(this.f3004f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3005g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f3003e;
        valueAnimatorOfFloat2.setDuration(i4);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3010l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f3010l.addListener(new c(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i4);
        valueAnimatorOfFloat3.addUpdateListener(new a(this, 1));
        this.f3011m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, 1));
    }

    @Override // i2.o
    public final void s() {
        EditText editText = this.f3007i;
        if (editText != null) {
            editText.post(new androidx.activity.d(10, this));
        }
    }

    public final void t(boolean z4) {
        boolean z5 = this.f3058b.d() == z4;
        if (z4 && !this.f3010l.isRunning()) {
            this.f3011m.cancel();
            this.f3010l.start();
            if (z5) {
                this.f3010l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f3010l.cancel();
        this.f3011m.start();
        if (z5) {
            this.f3011m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f3007i;
        return editText != null && (editText.hasFocus() || this.f3060d.hasFocus()) && this.f3007i.getText().length() > 0;
    }
}
