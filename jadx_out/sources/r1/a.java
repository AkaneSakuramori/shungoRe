package r1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f2.g;
import f2.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4053b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f4052a = i4;
        this.f4053b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f4052a;
        Object obj = this.f4053b;
        switch (i4) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = ((BottomSheetBehavior) obj).f1367i;
                if (hVar != null) {
                    g gVar = hVar.f2057b;
                    if (gVar.f2044j != fFloatValue) {
                        gVar.f2044j = fFloatValue;
                        hVar.f2061f = true;
                        hVar.invalidateSelf();
                    }
                }
                break;
            default:
                ((TextInputLayout) obj).f1588v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
