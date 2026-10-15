package u0;

import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e[] f4671b;

    public c(e... eVarArr) {
        h.b0(eVarArr, "initializers");
        this.f4671b = eVarArr;
    }

    @Override // androidx.lifecycle.p0
    public final n0 b(Class cls, d dVar) {
        n0 n0Var = null;
        for (e eVar : this.f4671b) {
            if (h.I(eVar.f4672a, cls)) {
                Object objE = eVar.f4673b.e(dVar);
                n0Var = objE instanceof n0 ? (n0) objE : null;
            }
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
