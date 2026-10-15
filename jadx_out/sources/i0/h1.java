package i0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f2917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f2918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f2919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2921e;

    public h1(o1 o1Var, c2 c2Var, c2 c2Var2, int i4, View view) {
        this.f2917a = o1Var;
        this.f2918b = c2Var;
        this.f2919c = c2Var2;
        this.f2920d = i4;
        this.f2921e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o1 o1Var = this.f2917a;
        o1Var.f2949a.d(animatedFraction);
        float fB = o1Var.f2949a.b();
        PathInterpolator pathInterpolator = k1.f2932e;
        c2 c2Var = this.f2918b;
        e.n0 n0Var = new e.n0(c2Var);
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((this.f2920d & i4) == 0) {
                ((t1) n0Var.f1896c).c(i4, c2Var.f2902a.f(i4));
            } else {
                b0.c cVarF = c2Var.f2902a.f(i4);
                b0.c cVarF2 = this.f2919c.f2902a.f(i4);
                float f5 = 1.0f - fB;
                ((t1) n0Var.f1896c).c(i4, c2.e(cVarF, (int) (((double) ((cVarF.f1081a - cVarF2.f1081a) * f5)) + 0.5d), (int) (((double) ((cVarF.f1082b - cVarF2.f1082b) * f5)) + 0.5d), (int) (((double) ((cVarF.f1083c - cVarF2.f1083c) * f5)) + 0.5d), (int) (((double) ((cVarF.f1084d - cVarF2.f1084d) * f5)) + 0.5d)));
            }
        }
        k1.g(this.f2921e, n0Var.v(), Collections.singletonList(o1Var));
    }
}
