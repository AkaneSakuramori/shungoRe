package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3291b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3292c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3293d = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public final f f() {
        Object obj;
        while (true) {
            f fVar = (f) this._prev;
            f fVar2 = fVar;
            while (true) {
                f fVar3 = null;
                while (true) {
                    obj = fVar2._next;
                    if (obj == this) {
                        if (fVar == fVar2) {
                            return fVar2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3292c;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, fVar, fVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != fVar) {
                                break;
                            }
                        }
                        return fVar2;
                    }
                    if (k()) {
                        return null;
                    }
                    if (obj == null) {
                        return fVar2;
                    }
                    if (obj instanceof l) {
                        ((l) obj).a(fVar2);
                        break;
                    }
                    if (!(obj instanceof m)) {
                        fVar3 = fVar2;
                        fVar2 = (f) obj;
                    } else {
                        if (fVar3 != null) {
                            break;
                        }
                        fVar2 = (f) fVar2._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3291b;
                f fVar4 = ((m) obj).f3304a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(fVar3, fVar2, fVar4)) {
                    if (atomicReferenceFieldUpdater2.get(fVar3) != fVar2) {
                        break;
                    }
                }
                fVar2 = fVar3;
            }
        }
    }

    public final void g(f fVar) {
        while (true) {
            f fVar2 = (f) fVar._prev;
            if (h() != fVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3292c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(fVar, fVar2, this)) {
                    if (k()) {
                        fVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(fVar) == fVar2);
        }
    }

    public final Object h() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof l)) {
                return obj;
            }
            ((l) obj).a(this);
        }
    }

    public final f i() {
        f fVar;
        Object objH = h();
        m mVar = objH instanceof m ? (m) objH : null;
        return (mVar == null || (fVar = mVar.f3304a) == null) ? (f) objH : fVar;
    }

    public final f j() {
        f fVarF = f();
        if (fVarF == null) {
            Object obj = this._prev;
            while (true) {
                fVarF = (f) obj;
                if (!fVarF.k()) {
                    break;
                }
                obj = fVarF._prev;
            }
        }
        return fVarF;
    }

    public boolean k() {
        return h() instanceof m;
    }

    public final void l() {
        while (true) {
            Object objH = h();
            if (objH instanceof m) {
                f fVar = ((m) objH).f3304a;
                return;
            }
            if (objH == this) {
                return;
            }
            f fVar2 = (f) objH;
            m mVar = (m) fVar2._removedRef;
            if (mVar == null) {
                mVar = new m(fVar2);
                f3293d.lazySet(fVar2, mVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3291b;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objH, mVar)) {
                    fVar2.f();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objH);
        }
    }

    public String toString() {
        return new e(this) + '@' + r3.q.h(this);
    }
}
