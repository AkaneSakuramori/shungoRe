package y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5131e;

    public /* synthetic */ f(k kVar, Object obj, View view, ViewPropertyAnimator viewPropertyAnimator, int i4) {
        this.f5127a = i4;
        this.f5131e = kVar;
        this.f5128b = obj;
        this.f5129c = view;
        this.f5130d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5127a) {
            case 1:
                this.f5129c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4 = this.f5127a;
        Object obj = this.f5131e;
        View view = this.f5129c;
        Object obj2 = this.f5130d;
        Object obj3 = this.f5128b;
        switch (i4) {
            case 0:
                ((ViewPropertyAnimator) obj2).setListener(null);
                view.setAlpha(1.0f);
                k kVar = (k) obj;
                d1 d1Var = (d1) obj3;
                kVar.c(d1Var);
                kVar.f5184q.remove(d1Var);
                kVar.i();
                break;
            case 1:
                ((ViewPropertyAnimator) obj2).setListener(null);
                k kVar2 = (k) obj;
                d1 d1Var2 = (d1) obj3;
                kVar2.c(d1Var2);
                kVar2.f5182o.remove(d1Var2);
                kVar2.i();
                break;
            default:
                ((ViewGroup) obj3).endViewTransition(view);
                animator.removeListener(this);
                androidx.fragment.app.q qVar = (androidx.fragment.app.q) obj2;
                View view2 = qVar.F;
                if (view2 != null && qVar.f872z) {
                    view2.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i4 = this.f5127a;
        Object obj = this.f5131e;
        switch (i4) {
            case 0:
                ((k) obj).getClass();
                break;
            case 1:
                ((k) obj).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public f(k kVar, d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5127a = 0;
        this.f5131e = kVar;
        this.f5128b = d1Var;
        this.f5130d = viewPropertyAnimator;
        this.f5129c = view;
    }
}
