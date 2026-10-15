package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlinx.coroutines.internal.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4125e = AtomicIntegerFieldUpdater.newUpdater(v.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public v(c3.e eVar, c3.k kVar) {
        super(eVar, kVar);
        this._decision = 0;
    }

    public final Object H() {
        f0 f0Var;
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object objR = r();
                g0 g0Var = objR instanceof g0 ? (g0) objR : null;
                if (g0Var != null && (f0Var = g0Var.f4087a) != null) {
                    objR = f0Var;
                }
                if (objR instanceof f) {
                    throw ((f) objR).f4084a;
                }
                return objR;
            }
        } while (!f4125e.compareAndSet(this, 0, 1));
        return d3.a.f1765b;
    }

    @Override // kotlinx.coroutines.internal.o, r3.p0
    public final void d(Object obj) {
        i(obj);
    }

    @Override // kotlinx.coroutines.internal.o, r3.p0
    public final void i(Object obj) {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                kotlinx.coroutines.internal.a.d(c3.h.k1(this.f3305d), c3.h.f2(obj), null);
                return;
            }
        } while (!f4125e.compareAndSet(this, 0, 2));
    }
}
