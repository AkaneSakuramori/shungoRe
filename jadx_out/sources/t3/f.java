package t3;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f4345c = new f(a3.n.k3(new p(2).f4409a), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3.h f4347b;

    public f(Set set, c3.h hVar) {
        c3.h.b0(set, "pins");
        this.f4346a = set;
        this.f4347b = hVar;
    }

    public final void a(String str, j3.a aVar) {
        c3.h.b0(str, "hostname");
        Iterator it = this.f4346a.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (c3.h.I(fVar.f4346a, this.f4346a) && c3.h.I(fVar.f4347b, this.f4347b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4346a.hashCode() + 1517) * 41;
        c3.h hVar = this.f4347b;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
