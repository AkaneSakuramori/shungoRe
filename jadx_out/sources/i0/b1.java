package i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2893d;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, int i4) {
        this.f2890a = i4;
        this.f2893d = obj;
        this.f2892c = obj2;
        this.f2891b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2890a) {
            case 0:
                ((e1) this.f2892c).x((View) this.f2891b);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4 = this.f2890a;
        Object obj = this.f2892c;
        switch (i4) {
            case 0:
                ((e1) obj).a();
                break;
            default:
                ((o1) obj).f2949a.d(1.0f);
                k1.e((View) this.f2891b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2890a) {
            case 0:
                ((e1) this.f2892c).C();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
