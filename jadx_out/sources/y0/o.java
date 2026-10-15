package y0;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5227a;

    public o(p pVar) {
        this.f5227a = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p pVar = this.f5227a;
        pVar.f5249c.setAlpha(iFloatValue);
        pVar.f5250d.setAlpha(iFloatValue);
        pVar.f5265s.invalidate();
    }
}
