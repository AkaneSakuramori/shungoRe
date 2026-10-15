package i0;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2939e;

    public m1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2939e = windowInsetsAnimation;
    }

    @Override // i0.n1
    public final long a() {
        return this.f2939e.getDurationMillis();
    }

    @Override // i0.n1
    public final float b() {
        return this.f2939e.getInterpolatedFraction();
    }

    @Override // i0.n1
    public final int c() {
        return this.f2939e.getTypeMask();
    }

    @Override // i0.n1
    public final void d(float f5) {
        this.f2939e.setFraction(f5);
    }
}
