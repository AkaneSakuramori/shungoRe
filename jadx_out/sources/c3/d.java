package c3;

import j3.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f1264c;

    public d(i iVar, k kVar) {
        h.b0(kVar, "left");
        h.b0(iVar, "element");
        this.f1263b = kVar;
        this.f1264c = iVar;
    }

    @Override // c3.k
    public final i e(j jVar) {
        h.b0(jVar, "key");
        d dVar = this;
        while (true) {
            i iVarE = dVar.f1264c.e(jVar);
            if (iVarE != null) {
                return iVarE;
            }
            k kVar = dVar.f1263b;
            if (!(kVar instanceof d)) {
                return kVar.e(jVar);
            }
            dVar = (d) kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                dVar.getClass();
                int i4 = 2;
                d dVar2 = dVar;
                int i5 = 2;
                while (true) {
                    k kVar = dVar2.f1263b;
                    dVar2 = kVar instanceof d ? (d) kVar : null;
                    if (dVar2 == null) {
                        break;
                    }
                    i5++;
                }
                d dVar3 = this;
                while (true) {
                    k kVar2 = dVar3.f1263b;
                    dVar3 = kVar2 instanceof d ? (d) kVar2 : null;
                    if (dVar3 == null) {
                        break;
                    }
                    i4++;
                }
                if (i5 == i4) {
                    d dVar4 = this;
                    while (true) {
                        i iVar = dVar4.f1264c;
                        if (!h.I(dVar.e(iVar.getKey()), iVar)) {
                            break;
                        }
                        k kVar3 = dVar4.f1263b;
                        if (kVar3 instanceof d) {
                            dVar4 = (d) kVar3;
                        } else {
                            h.Y(kVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            i iVar2 = (i) kVar3;
                            if (h.I(dVar.e(iVar2.getKey()), iVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // c3.k
    public final Object h(Object obj, p pVar) {
        return pVar.c(this.f1263b.h(obj, pVar), this.f1264c);
    }

    public final int hashCode() {
        return this.f1264c.hashCode() + this.f1263b.hashCode();
    }

    @Override // c3.k
    public final k t(j jVar) {
        h.b0(jVar, "key");
        i iVar = this.f1264c;
        i iVarE = iVar.e(jVar);
        k kVar = this.f1263b;
        if (iVarE != null) {
            return kVar;
        }
        k kVarT = kVar.t(jVar);
        if (kVarT == kVar) {
            return this;
        }
        return kVarT == l.f1275b ? iVar : new d(iVar, kVarT);
    }

    public final String toString() {
        return "[" + ((String) h("", c.f1260d)) + ']';
    }

    @Override // c3.k
    public final k x(k kVar) {
        return h.W1(this, kVar);
    }
}
