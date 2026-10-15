package r3;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlinx.coroutines.internal.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f4131e;

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(c3.e eVar, c3.k kVar) {
        z0 z0Var = z0.f4133b;
        super(eVar, kVar.e(z0Var) == null ? kVar.x(z0Var) : kVar);
        this.f4131e = new ThreadLocal();
        if (eVar.g().e(c3.f.f1265b) instanceof k) {
            return;
        }
        Object objF = kotlinx.coroutines.internal.a.f(kVar, null);
        kotlinx.coroutines.internal.a.c(kVar, objF);
        this.f4131e.set(new z2.a(kVar, objF));
    }

    public final boolean H() {
        ThreadLocal threadLocal = this.f4131e;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }

    @Override // kotlinx.coroutines.internal.o, r3.p0
    public final void i(Object obj) {
        ThreadLocal threadLocal = this.f4131e;
        z2.a aVar = (z2.a) threadLocal.get();
        if (aVar != null) {
            kotlinx.coroutines.internal.a.c((c3.k) aVar.f5504b, aVar.f5505c);
            threadLocal.set(null);
        }
        Object objF2 = c3.h.f2(obj);
        c3.e eVar = this.f3305d;
        c3.k kVarG = eVar.g();
        Object objF = kotlinx.coroutines.internal.a.f(kVarG, null);
        y0 y0VarJ2 = objF != kotlinx.coroutines.internal.a.f3281d ? c3.h.J2(eVar, kVarG, objF) : null;
        try {
            eVar.b(objF2);
        } finally {
            if (y0VarJ2 == null || y0VarJ2.H()) {
                kotlinx.coroutines.internal.a.c(kVarG, objF);
            }
        }
    }
}
