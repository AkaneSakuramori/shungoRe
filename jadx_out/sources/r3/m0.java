package r3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f4101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f4102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f4103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f4104i;

    public m0(p0 p0Var, n0 n0Var, d dVar, Object obj) {
        this.f4101f = p0Var;
        this.f4102g = n0Var;
        this.f4103h = dVar;
        this.f4104i = obj;
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        m((Throwable) obj);
        return z2.f.f5511a;
    }

    @Override // r3.l0
    public final void m(Throwable th) {
        p0 p0Var = this.f4101f;
        p0Var.getClass();
        d dVarA = p0.A(this.f4103h);
        n0 n0Var = this.f4102g;
        Object obj = this.f4104i;
        if (dVarA != null) {
            while (q.l(dVarA.f4081f, false, new m0(p0Var, n0Var, dVarA, obj), 1) == s0.f4123b) {
                dVarA = p0.A(dVarA);
                if (dVarA == null) {
                }
            }
            return;
        }
        p0Var.d(p0Var.o(n0Var, obj));
    }
}
