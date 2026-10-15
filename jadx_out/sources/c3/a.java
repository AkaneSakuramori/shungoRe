package c3;

import j3.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1257b;

    public a(j jVar) {
        this.f1257b = jVar;
    }

    @Override // c3.k
    public i e(j jVar) {
        return h.L0(this, jVar);
    }

    @Override // c3.i
    public final j getKey() {
        return this.f1257b;
    }

    @Override // c3.k
    public final Object h(Object obj, p pVar) {
        return pVar.c(obj, this);
    }

    @Override // c3.k
    public k t(j jVar) {
        return h.A1(this, jVar);
    }

    @Override // c3.k
    public final k x(k kVar) {
        h.b0(kVar, "context");
        return h.W1(this, kVar);
    }
}
