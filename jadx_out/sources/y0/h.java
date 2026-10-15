package y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f5148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f5149e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f5145a = i4;
        this.f5149e = kVar;
        this.f5146b = iVar;
        this.f5147c = viewPropertyAnimator;
        this.f5148d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4 = this.f5145a;
        k kVar = this.f5149e;
        i iVar = this.f5146b;
        View view = this.f5148d;
        ViewPropertyAnimator viewPropertyAnimator = this.f5147c;
        switch (i4) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f5157a);
                kVar.f5185r.remove(iVar.f5157a);
                kVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f5158b);
                kVar.f5185r.remove(iVar.f5158b);
                kVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i4 = this.f5145a;
        k kVar = this.f5149e;
        i iVar = this.f5146b;
        switch (i4) {
            case 0:
                d1 d1Var = iVar.f5157a;
                kVar.getClass();
                break;
            default:
                d1 d1Var2 = iVar.f5158b;
                kVar.getClass();
                break;
        }
    }
}
