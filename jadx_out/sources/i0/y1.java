package i0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class y1 extends w1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0.c f2993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0.c f2994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0.c f2995p;

    public y1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
        this.f2993n = null;
        this.f2994o = null;
        this.f2995p = null;
    }

    @Override // i0.a2
    public b0.c g() {
        if (this.f2994o == null) {
            this.f2994o = b0.c.c(this.f2975c.getMandatorySystemGestureInsets());
        }
        return this.f2994o;
    }

    @Override // i0.a2
    public b0.c i() {
        if (this.f2993n == null) {
            this.f2993n = b0.c.c(this.f2975c.getSystemGestureInsets());
        }
        return this.f2993n;
    }

    @Override // i0.a2
    public b0.c k() {
        if (this.f2995p == null) {
            this.f2995p = b0.c.c(this.f2975c.getTappableElementInsets());
        }
        return this.f2995p;
    }

    @Override // i0.u1, i0.a2
    public c2 l(int i4, int i5, int i6, int i7) {
        return c2.g(null, this.f2975c.inset(i4, i5, i6, i7));
    }

    @Override // i0.v1, i0.a2
    public void q(b0.c cVar) {
    }
}
