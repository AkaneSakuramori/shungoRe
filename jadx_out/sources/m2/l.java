package m2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f3451a;

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        b0 b0Var = this.f3451a;
        if (b0Var != null) {
            return b0Var.b(bVar);
        }
        throw new IllegalStateException();
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        b0 b0Var = this.f3451a;
        if (b0Var == null) {
            throw new IllegalStateException();
        }
        b0Var.c(cVar, obj);
    }
}
