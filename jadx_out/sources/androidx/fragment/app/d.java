package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f721a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f725e;

    public d(ViewGroup viewGroup, q qVar, b0 b0Var, e0.e eVar) {
        this.f722b = viewGroup;
        this.f723c = qVar;
        this.f724d = b0Var;
        this.f725e = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i4 = this.f721a;
        ViewGroup viewGroup = this.f722b;
        switch (i4) {
            case 0:
                viewGroup.post(new v(1, this));
                break;
            default:
                viewGroup.post(new v(0, this));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public d(View view, ViewGroup viewGroup, f fVar, h hVar) {
        this.f725e = hVar;
        this.f722b = viewGroup;
        this.f723c = view;
        this.f724d = fVar;
    }
}
