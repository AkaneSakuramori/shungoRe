package i2;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2998b;

    public /* synthetic */ a(o oVar, int i4) {
        this.f2997a = i4;
        this.f2998b = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f2997a;
        o oVar = this.f2998b;
        switch (i4) {
            case 0:
                d dVar = (d) oVar;
                dVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = dVar.f3060d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            case 1:
                d dVar2 = (d) oVar;
                dVar2.getClass();
                dVar2.f3060d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                k kVar = (k) oVar;
                kVar.getClass();
                kVar.f3060d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
