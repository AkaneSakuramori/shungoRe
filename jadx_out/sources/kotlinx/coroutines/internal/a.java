package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import r3.c0;
import r3.i0;
import r3.p0;
import r3.v0;
import r3.w0;
import r3.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.e f3278a = new g1.e("NO_DECISION");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1.e f3279b = new g1.e("UNDEFINED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1.e f3280c = new g1.e("CONDITION_FALSE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1.e f3281d = new g1.e("NO_THREAD_ELEMENTS");

    public static final void c(c3.k kVar, Object obj) {
        if (obj == f3281d) {
            return;
        }
        if (!(obj instanceof r)) {
            Object objH = kVar.h(null, q.f3308e);
            if (objH == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            defpackage.a.n(objH);
            throw null;
        }
        r rVar = (r) obj;
        v0[] v0VarArr = rVar.f3312b;
        int length = v0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        v0 v0Var = v0VarArr[length];
        c3.h.X(null);
        Object obj2 = rVar.f3311a[length];
        throw null;
    }

    public static final void d(c3.e eVar, Object obj, j3.l lVar) {
        Object fVar;
        if (!(eVar instanceof c)) {
            eVar.b(obj);
            return;
        }
        c cVar = (c) eVar;
        Throwable thA = z2.c.a(obj);
        if (thA == null) {
            fVar = lVar != null ? new r3.g(obj, lVar) : obj;
        } else {
            fVar = new r3.f(thA);
        }
        r3.k kVar = cVar.f3283e;
        c3.e eVar2 = cVar.f3284f;
        eVar2.g();
        if (kVar.C()) {
            cVar.f3285g = fVar;
            cVar.f4126d = 1;
            cVar.f3283e.z(eVar2.g(), cVar);
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
            cVar.f3285g = fVar;
            cVar.f4126d = 1;
            bVar.G(cVar);
            return;
        }
        bVar.f4078d = 4294967296L + j4;
        try {
            i0 i0Var = (i0) eVar2.g().e(r3.l.f4099c);
            if (i0Var == null || i0Var.a()) {
                Object obj2 = cVar.f3286h;
                c3.k kVarG = eVar2.g();
                Object objF = f(kVarG, obj2);
                y0 y0VarJ2 = objF != f3281d ? c3.h.J2(eVar2, kVarG, objF) : null;
                try {
                    eVar2.b(obj);
                    if (y0VarJ2 == null || y0VarJ2.H()) {
                        c(kVarG, objF);
                    }
                } catch (Throwable th) {
                    if (y0VarJ2 == null || y0VarJ2.H()) {
                        c(kVarG, objF);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionP = ((p0) i0Var).p();
                if (fVar instanceof r3.g) {
                    ((r3.g) fVar).f4086b.e(cancellationExceptionP);
                }
                cVar.b(c3.h.A0(cancellationExceptionP));
            }
            while (bVar.I()) {
            }
        } catch (Throwable th2) {
            try {
                cVar.a(th2, null);
            } finally {
                bVar.F();
            }
        }
    }

    public static final Object e(c3.k kVar) {
        Object objH = kVar.h(0, q.f3307d);
        c3.h.X(objH);
        return objH;
    }

    public static final Object f(c3.k kVar, Object obj) {
        if (obj == null) {
            obj = e(kVar);
        }
        if (obj == 0) {
            return f3281d;
        }
        if (obj instanceof Integer) {
            return kVar.h(new r(kVar, ((Number) obj).intValue()), q.f3309f);
        }
        defpackage.a.n(obj);
        throw null;
    }

    public abstract boolean a();

    public abstract void b();
}
