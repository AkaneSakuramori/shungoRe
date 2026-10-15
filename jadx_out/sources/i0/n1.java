package i0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f2942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2943d;

    public n1(int i4, Interpolator interpolator, long j4) {
        this.f2940a = i4;
        this.f2942c = interpolator;
        this.f2943d = j4;
    }

    public long a() {
        return this.f2943d;
    }

    public float b() {
        Interpolator interpolator = this.f2942c;
        return interpolator != null ? interpolator.getInterpolation(this.f2941b) : this.f2941b;
    }

    public int c() {
        return this.f2940a;
    }

    public void d(float f5) {
        this.f2941b = f5;
    }
}
