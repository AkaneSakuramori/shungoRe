package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.c0;
import r3.w;
import r3.w0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w implements e3.d, c3.e {
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r3.k f3283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3.e f3284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3286h;

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");
    }

    public c(r3.k kVar, e3.c cVar) {
        super(0L, kotlinx.coroutines.scheduling.j.f3345f);
        this.f4126d = -1;
        this.f3283e = kVar;
        this.f3284f = cVar;
        this.f3285g = a.f3279b;
        c3.k kVar2 = cVar.f1988c;
        c3.h.X(kVar2);
        this.f3286h = a.e(kVar2);
        this._reusableCancellableContinuation = null;
    }

    @Override // c3.e
    public final void b(Object obj) {
        c3.e eVar = this.f3284f;
        c3.k kVarG = eVar.g();
        Throwable thA = z2.c.a(obj);
        Object fVar = thA == null ? obj : new r3.f(thA);
        r3.k kVar = this.f3283e;
        if (kVar.C()) {
            this.f3285g = fVar;
            this.f4126d = 0;
            kVar.z(kVarG, this);
            return;
        }
        ThreadLocal threadLocal = w0.f4127a;
        c0 bVar = (c0) threadLocal.get();
        if (bVar == null) {
            bVar = new r3.b(Thread.currentThread());
            threadLocal.set(bVar);
        }
        long j4 = bVar.f4078d;
        if (j4 >= 4294967296L) {
            this.f3285g = fVar;
            this.f4126d = 0;
            bVar.G(this);
            return;
        }
        bVar.f4078d = 4294967296L + j4;
        try {
            c3.k kVarG2 = eVar.g();
            Object objF = a.f(kVarG2, this.f3286h);
            try {
                eVar.b(obj);
                a.c(kVarG2, objF);
                while (bVar.I()) {
                }
            } catch (Throwable th) {
                a.c(kVarG2, objF);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                a(th2, null);
            } finally {
                bVar.F();
            }
        }
    }

    @Override // e3.d
    public final e3.d f() {
        c3.e eVar = this.f3284f;
        if (eVar instanceof e3.d) {
            return (e3.d) eVar;
        }
        return null;
    }

    @Override // c3.e
    public final c3.k g() {
        return this.f3284f.g();
    }

    public final String toString() {
        Object objA0;
        String string;
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.f3283e);
        sb.append(", ");
        c3.e eVar = this.f3284f;
        if (eVar instanceof c) {
            string = eVar.toString();
        } else {
            try {
                objA0 = eVar + '@' + r3.q.h(eVar);
            } catch (Throwable th) {
                objA0 = c3.h.A0(th);
            }
            if (z2.c.a(objA0) != null) {
                objA0 = eVar.getClass().getName() + '@' + r3.q.h(eVar);
            }
            string = (String) objA0;
        }
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
