package c1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f1222a;

    @Override // c1.r, c1.p
    public final void c() {
        v vVar = this.f1222a;
        if (vVar.B) {
            return;
        }
        vVar.F();
        vVar.B = true;
    }

    @Override // c1.p
    public final void d(q qVar) {
        v vVar = this.f1222a;
        int i4 = vVar.A - 1;
        vVar.A = i4;
        if (i4 == 0) {
            vVar.B = false;
            vVar.m();
        }
        qVar.v(this);
    }
}
