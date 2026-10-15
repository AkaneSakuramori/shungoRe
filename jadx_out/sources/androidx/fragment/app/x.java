package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animation f910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Animator f911b;

    public x(Animation animation) {
        this.f910a = animation;
        this.f911b = null;
    }

    public x(Animator animator) {
        this.f910a = null;
        this.f911b = animator;
    }
}
