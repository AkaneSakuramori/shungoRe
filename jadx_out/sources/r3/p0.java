package r3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class p0 implements i0, e, t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4111b = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public p0(boolean z4) {
        this._state = z4 ? q.f4119h : q.f4118g;
        this._parentHandle = null;
    }

    public static d A(kotlinx.coroutines.internal.f fVar) {
        while (fVar.k()) {
            fVar = fVar.j();
        }
        while (true) {
            fVar = fVar.i();
            if (!fVar.k()) {
                if (fVar instanceof d) {
                    return (d) fVar;
                }
                if (fVar instanceof r0) {
                    return null;
                }
            }
        }
    }

    public static String F(Object obj) {
        if (!(obj instanceof n0)) {
            if (obj instanceof f0) {
                return ((f0) obj).a() ? "Active" : "New";
            }
            return obj instanceof f ? "Cancelled" : "Completed";
        }
        n0 n0Var = (n0) obj;
        if (n0Var.e()) {
            return "Cancelling";
        }
        return n0Var.f() ? "Completing" : "Active";
    }

    public final void B(r0 r0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        androidx.fragment.app.p pVar = null;
        for (kotlinx.coroutines.internal.f fVarI = (kotlinx.coroutines.internal.f) r0Var.h(); !c3.h.I(fVarI, r0Var); fVarI = fVarI.i()) {
            if (fVarI instanceof k0) {
                l0 l0Var = (l0) fVarI;
                try {
                    l0Var.m(th);
                } catch (Throwable th2) {
                    if (pVar != null) {
                        c3.h.F(pVar, th2);
                    } else {
                        pVar = new androidx.fragment.app.p("Exception in completion handler " + l0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (pVar != null) {
            u(pVar);
        }
        k(th);
    }

    public void C(Object obj) {
    }

    public void D() {
    }

    public final void E(l0 l0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        l0Var.getClass();
        kotlinx.coroutines.internal.f.f3292c.lazySet(r0Var, l0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.f.f3291b;
        atomicReferenceFieldUpdater2.lazySet(r0Var, l0Var);
        loop0: while (l0Var.h() == l0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(l0Var, l0Var, r0Var)) {
                    r0Var.g(l0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(l0Var) == l0Var);
        }
        kotlinx.coroutines.internal.f fVarI = l0Var.i();
        do {
            atomicReferenceFieldUpdater = f4111b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l0Var, fVarI)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l0Var);
    }

    public final Object G(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof f0)) {
            return q.f4113b;
        }
        if (((obj instanceof z) || (obj instanceof l0)) && !(obj instanceof d) && !(obj2 instanceof f)) {
            f0 f0Var = (f0) obj;
            Object g0Var = obj2 instanceof f0 ? new g0((f0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4111b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, f0Var, g0Var)) {
                    C(obj2);
                    m(f0Var, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == f0Var);
            return q.f4115d;
        }
        f0 f0Var2 = (f0) obj;
        r0 r0VarQ = q(f0Var2);
        if (r0VarQ == null) {
            return q.f4115d;
        }
        d dVarA = null;
        n0 n0Var = f0Var2 instanceof n0 ? (n0) f0Var2 : null;
        if (n0Var == null) {
            n0Var = new n0(r0VarQ, null);
        }
        k3.m mVar = new k3.m();
        synchronized (n0Var) {
            if (n0Var.f()) {
                return q.f4113b;
            }
            n0Var.i();
            if (n0Var != f0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4111b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, f0Var2, n0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != f0Var2) {
                        return q.f4115d;
                    }
                }
            }
            boolean zE = n0Var.e();
            f fVar = obj2 instanceof f ? (f) obj2 : null;
            if (fVar != null) {
                n0Var.c(fVar.f4084a);
            }
            Throwable thD = n0Var.d();
            if (!Boolean.valueOf(!zE).booleanValue()) {
                thD = null;
            }
            mVar.f3276b = thD;
            if (thD != null) {
                B(r0VarQ, thD);
            }
            d dVar = f0Var2 instanceof d ? (d) f0Var2 : null;
            if (dVar == null) {
                r0 r0VarB = f0Var2.b();
                if (r0VarB != null) {
                    dVarA = A(r0VarB);
                }
            } else {
                dVarA = dVar;
            }
            if (dVarA != null) {
                while (q.l(dVarA.f4081f, false, new m0(this, n0Var, dVarA, obj2), 1) == s0.f4123b) {
                    dVarA = A(dVarA);
                    if (dVarA == null) {
                    }
                }
                return q.f4114c;
            }
            return o(n0Var, obj2);
        }
    }

    @Override // r3.i0
    public boolean a() {
        Object objR = r();
        return (objR instanceof f0) && ((f0) objR).a();
    }

    public final boolean c(Object obj, r0 r0Var, l0 l0Var) {
        char c5;
        o0 o0Var = new o0(l0Var, this, obj);
        do {
            kotlinx.coroutines.internal.f fVarJ = r0Var.j();
            kotlinx.coroutines.internal.f.f3292c.lazySet(l0Var, fVarJ);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.f.f3291b;
            atomicReferenceFieldUpdater.lazySet(l0Var, r0Var);
            o0Var.f4108c = r0Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(fVarJ, r0Var, o0Var)) {
                    if (o0Var.a(fVarJ) != null) {
                        c5 = 2;
                        break;
                    }
                    c5 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(fVarJ) != r0Var) {
                    c5 = 0;
                    break;
                }
            }
            if (c5 == 1) {
                return true;
            }
        } while (c5 != 2);
        return false;
    }

    public void d(Object obj) {
    }

    @Override // c3.k
    public final c3.i e(c3.j jVar) {
        return c3.h.L0(this, jVar);
    }

    @Override // c3.i
    public final c3.j getKey() {
        return l.f4099c;
    }

    @Override // c3.k
    public final Object h(Object obj, j3.p pVar) {
        return pVar.c(obj, this);
    }

    public void i(Object obj) {
        d(obj);
    }

    public final boolean j(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thN = null;
        loop0: while (true) {
            Object objR = r();
            if (!(objR instanceof n0)) {
                if (!(objR instanceof f0)) {
                    obj2 = q.f4116e;
                    break;
                }
                if (thN == null) {
                    thN = n(obj);
                }
                f0 f0Var = (f0) objR;
                if (f0Var.a()) {
                    r0 r0VarQ = q(f0Var);
                    if (r0VarQ == null) {
                        continue;
                    } else {
                        n0 n0Var = new n0(r0VarQ, thN);
                        do {
                            atomicReferenceFieldUpdater = f4111b;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f0Var, n0Var)) {
                                B(r0VarQ, thN);
                                obj2 = q.f4113b;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f0Var);
                    }
                } else {
                    Object objG = G(objR, new f(thN));
                    if (objG == q.f4113b) {
                        throw new IllegalStateException(("Cannot happen in " + objR).toString());
                    }
                    if (objG != q.f4115d) {
                        obj2 = objG;
                        break;
                    }
                }
            } else {
                synchronized (objR) {
                    try {
                        if (!((n0) objR).g()) {
                            boolean zE = ((n0) objR).e();
                            if (thN == null) {
                                thN = n(obj);
                            }
                            ((n0) objR).c(thN);
                            Throwable thD = zE ^ true ? ((n0) objR).d() : null;
                            if (thD != null) {
                                B(((n0) objR).f4106b, thD);
                            }
                            obj2 = q.f4113b;
                            break;
                        }
                        obj2 = q.f4116e;
                        break;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (obj2 == q.f4113b || obj2 == q.f4114c) {
            return true;
        }
        if (obj2 == q.f4116e) {
            return false;
        }
        d(obj2);
        return true;
    }

    public final boolean k(Throwable th) {
        if (w()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        c cVar = (c) this._parentHandle;
        if (cVar == null || cVar == s0.f4123b) {
            return z4;
        }
        return cVar.d(th) || z4;
    }

    public String l() {
        return "Job was cancelled";
    }

    public final void m(f0 f0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        c cVar = (c) this._parentHandle;
        if (cVar != null) {
            cVar.c();
            this._parentHandle = s0.f4123b;
        }
        androidx.fragment.app.p pVar = null;
        f fVar = obj instanceof f ? (f) obj : null;
        Throwable th = fVar != null ? fVar.f4084a : null;
        if (f0Var instanceof l0) {
            try {
                ((l0) f0Var).m(th);
                return;
            } catch (Throwable th2) {
                u(new androidx.fragment.app.p("Exception in completion handler " + f0Var + " for " + this, th2));
                return;
            }
        }
        r0 r0VarB = f0Var.b();
        if (r0VarB != null) {
            for (kotlinx.coroutines.internal.f fVarI = (kotlinx.coroutines.internal.f) r0VarB.h(); !c3.h.I(fVarI, r0VarB); fVarI = fVarI.i()) {
                if (fVarI instanceof l0) {
                    l0 l0Var = (l0) fVarI;
                    try {
                        l0Var.m(th);
                    } catch (Throwable th3) {
                        if (pVar != null) {
                            c3.h.F(pVar, th3);
                        } else {
                            pVar = new androidx.fragment.app.p("Exception in completion handler " + l0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (pVar != null) {
                u(pVar);
            }
        }
    }

    public final Throwable n(Object obj) {
        Throwable thD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        p0 p0Var = (p0) ((t0) obj);
        Object objR = p0Var.r();
        if (objR instanceof n0) {
            thD = ((n0) objR).d();
        } else if (objR instanceof f) {
            thD = ((f) objR).f4084a;
        } else {
            if (objR instanceof f0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objR).toString());
            }
            thD = null;
        }
        CancellationException j0Var = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (j0Var == null) {
            j0Var = new j0("Parent job is ".concat(F(objR)), thD, p0Var);
        }
        return j0Var;
    }

    public final Object o(n0 n0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = null;
        Throwable j0Var = null;
        f fVar = obj instanceof f ? (f) obj : null;
        Throwable th = fVar != null ? fVar.f4084a : null;
        synchronized (n0Var) {
            n0Var.e();
            ArrayList<Throwable> arrayListH = n0Var.h(th);
            if (!arrayListH.isEmpty()) {
                for (Object obj3 : arrayListH) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                j0Var = (Throwable) obj2;
                if (j0Var == null) {
                    j0Var = (Throwable) arrayListH.get(0);
                }
            } else if (n0Var.e()) {
                j0Var = new j0(l(), null, this);
            }
            if (j0Var != null && arrayListH.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListH.size()));
                for (Throwable th2 : arrayListH) {
                    if (th2 != j0Var && th2 != j0Var && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        c3.h.F(j0Var, th2);
                    }
                }
            }
        }
        if (j0Var != null && j0Var != th) {
            obj = new f(j0Var);
        }
        if (j0Var != null && (k(j0Var) || s(j0Var))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            f.f4083b.compareAndSet((f) obj, 0, 1);
        }
        C(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4111b;
        Object g0Var = obj instanceof f0 ? new g0((f0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n0Var, g0Var) && atomicReferenceFieldUpdater.get(this) == n0Var) {
        }
        m(n0Var, obj);
        return obj;
    }

    public final CancellationException p() {
        CancellationException cancellationException;
        Object objR = r();
        if (!(objR instanceof n0)) {
            if (objR instanceof f0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objR instanceof f)) {
                return new j0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((f) objR).f4084a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new j0(l(), th, this) : cancellationException;
        }
        Throwable thD = ((n0) objR).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = l();
        }
        return new j0(strConcat, thD, this);
    }

    public final r0 q(f0 f0Var) {
        r0 r0VarB = f0Var.b();
        if (r0VarB != null) {
            return r0VarB;
        }
        if (f0Var instanceof z) {
            return new r0();
        }
        if (f0Var instanceof l0) {
            E((l0) f0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f0Var).toString());
    }

    public final Object r() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.l) obj).a(this);
        }
    }

    public boolean s(Throwable th) {
        return false;
    }

    @Override // c3.k
    public final c3.k t(c3.j jVar) {
        return c3.h.A1(this, jVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z() + '{' + F(r()) + '}');
        sb.append('@');
        sb.append(q.h(this));
        return sb.toString();
    }

    public void u(androidx.fragment.app.p pVar) {
        throw pVar;
    }

    public final void v(i0 i0Var) {
        byte b5;
        s0 s0Var = s0.f4123b;
        if (i0Var == null) {
            this._parentHandle = s0Var;
            return;
        }
        p0 p0Var = (p0) i0Var;
        do {
            Object objR = p0Var.r();
            boolean z4 = objR instanceof z;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4111b;
            b5 = 0;
            if (z4) {
                if (!((z) objR).f4132b) {
                    z zVar = q.f4119h;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(p0Var, objR, zVar)) {
                            p0Var.D();
                            b5 = 1;
                        } else if (atomicReferenceFieldUpdater.get(p0Var) != objR) {
                            b5 = -1;
                        }
                    }
                }
            } else if (objR instanceof e0) {
                r0 r0Var = ((e0) objR).f4082b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(p0Var, objR, r0Var)) {
                        p0Var.D();
                        b5 = 1;
                    } else if (atomicReferenceFieldUpdater.get(p0Var) != objR) {
                        b5 = -1;
                    }
                }
            }
            if (b5 == 0) {
                break;
            }
        } while (b5 != 1);
        c cVar = (c) q.l(p0Var, true, new d((a) this), 2);
        this._parentHandle = cVar;
        if (!(r() instanceof f0)) {
            cVar.c();
            this._parentHandle = s0Var;
        }
    }

    public boolean w() {
        return false;
    }

    @Override // c3.k
    public final c3.k x(c3.k kVar) {
        return c3.h.V1(this, kVar);
    }

    public final Object y(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objG;
        do {
            objG = G(r(), obj);
            if (objG == q.f4113b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                f fVar = obj instanceof f ? (f) obj : null;
                throw new IllegalStateException(str, fVar != null ? fVar.f4084a : null);
            }
        } while (objG == q.f4115d);
        return objG;
    }

    public String z() {
        return getClass().getSimpleName();
    }
}
