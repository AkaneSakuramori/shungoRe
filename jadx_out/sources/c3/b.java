package c3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.l f1258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f1259c;

    public b(j jVar, r3.i iVar) {
        h.b0(jVar, "baseKey");
        this.f1258b = iVar;
        this.f1259c = jVar instanceof b ? ((b) jVar).f1259c : jVar;
    }

    public final i a(i iVar) {
        h.b0(iVar, "element");
        return (i) this.f1258b.e(iVar);
    }
}
