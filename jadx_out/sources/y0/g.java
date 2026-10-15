package y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f5135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f5140f;

    public g(k kVar, d1 d1Var, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5140f = kVar;
        this.f5135a = d1Var;
        this.f5136b = i4;
        this.f5137c = view;
        this.f5138d = i5;
        this.f5139e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f5136b;
        View view = this.f5137c;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f5138d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5139e.setListener(null);
        k kVar = this.f5140f;
        d1 d1Var = this.f5135a;
        kVar.c(d1Var);
        kVar.f5183p.remove(d1Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5140f.getClass();
    }
}
