package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f921f;

    public y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f921f = true;
        this.f917b = viewGroup;
        this.f918c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f921f = true;
        if (this.f919d) {
            return !this.f920e;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f919d = true;
            i0.v.a(this.f917b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f919d;
        ViewGroup viewGroup = this.f917b;
        if (z4 || !this.f921f) {
            viewGroup.endViewTransition(this.f918c);
            this.f920e = true;
        } else {
            this.f921f = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f5) {
        this.f921f = true;
        if (this.f919d) {
            return !this.f920e;
        }
        if (!super.getTransformation(j4, transformation, f5)) {
            this.f919d = true;
            i0.v.a(this.f917b, this);
        }
        return true;
    }
}
