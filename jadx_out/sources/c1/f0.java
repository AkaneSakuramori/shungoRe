package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f1160c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1163f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1161d = true;

    public f0(View view, int i4) {
        this.f1158a = view;
        this.f1159b = i4;
        this.f1160c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // c1.p
    public final void a() {
    }

    @Override // c1.p
    public final void b() {
        f(false);
    }

    @Override // c1.p
    public final void c() {
    }

    @Override // c1.p
    public final void d(q qVar) {
        if (!this.f1163f) {
            y.f1231a.g(this.f1158a, this.f1159b);
            ViewGroup viewGroup = this.f1160c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qVar.v(this);
    }

    @Override // c1.p
    public final void e() {
        f(true);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f1161d || this.f1162e == z4 || (viewGroup = this.f1160c) == null) {
            return;
        }
        this.f1162e = z4;
        c3.h.C2(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1163f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1163f) {
            y.f1231a.g(this.f1158a, this.f1159b);
            ViewGroup viewGroup = this.f1160c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f1163f) {
            return;
        }
        y.f1231a.g(this.f1158a, this.f1159b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f1163f) {
            return;
        }
        y.f1231a.g(this.f1158a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
