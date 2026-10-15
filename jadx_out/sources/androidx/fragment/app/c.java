package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f708e;

    public c(ViewGroup viewGroup, View view, boolean z4, c1 c1Var, f fVar) {
        this.f704a = viewGroup;
        this.f705b = view;
        this.f706c = z4;
        this.f707d = c1Var;
        this.f708e = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f704a;
        View view = this.f705b;
        viewGroup.endViewTransition(view);
        if (this.f706c) {
            defpackage.a.a(this.f707d.f713a, view);
        }
        this.f708e.b();
    }
}
