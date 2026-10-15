package i0;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a0 f2924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f2925d;

    public i1(View view, o1 o1Var, i.a0 a0Var, ValueAnimator valueAnimator) {
        this.f2923b = view;
        this.f2924c = a0Var;
        this.f2925d = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1.h(this.f2923b, this.f2924c);
        this.f2925d.start();
    }
}
