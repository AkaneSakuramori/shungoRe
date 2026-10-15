package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.lifecycle.h, z0.g, androidx.lifecycle.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.q0 f925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f926c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0.f f927d = null;

    public z0(androidx.lifecycle.q0 q0Var) {
        this.f925b = q0Var;
    }

    public final void b(androidx.lifecycle.l lVar) {
        this.f926c.e(lVar);
    }

    public final void c() {
        if (this.f926c == null) {
            this.f926c = new androidx.lifecycle.t(this);
            this.f927d = z0.c.b(this);
        }
    }

    @Override // z0.g
    public final z0.e e() {
        c();
        return this.f927d.f5440b;
    }

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.q0 h() {
        c();
        return this.f925b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t t() {
        c();
        return this.f926c;
    }
}
