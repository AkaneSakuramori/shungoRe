package e3;

import c3.h;
import c3.i;
import c3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f1988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient c3.e f1989d;

    public c(c3.e eVar, k kVar) {
        super(eVar);
        this.f1988c = kVar;
    }

    @Override // c3.e
    public final k g() {
        k kVar = this.f1988c;
        h.X(kVar);
        return kVar;
    }

    @Override // e3.a
    public final void i() {
        c3.e eVar = this.f1989d;
        if (eVar != null && eVar != this) {
            k kVar = this.f1988c;
            h.X(kVar);
            i iVarE = kVar.e(c3.f.f1265b);
            h.X(iVarE);
        }
        this.f1989d = b.f1987b;
    }

    public c(c3.e eVar) {
        this(eVar, eVar != null ? eVar.g() : null);
    }
}
