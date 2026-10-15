package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.e f909e;

    public w(ViewGroup viewGroup, View view, q qVar, b0 b0Var, e0.e eVar) {
        this.f905a = viewGroup;
        this.f906b = view;
        this.f907c = qVar;
        this.f908d = b0Var;
        this.f909e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f905a;
        View view = this.f906b;
        viewGroup.endViewTransition(view);
        q qVar = this.f907c;
        o oVar = qVar.I;
        Animator animator2 = oVar == null ? null : oVar.f823b;
        qVar.d().f823b = null;
        if (animator2 == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        this.f908d.c(qVar, this.f909e);
    }
}
