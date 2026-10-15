package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends c0 implements t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4077g = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_queue");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_delayed");
    }

    public void J(Runnable runnable) {
        loop0: while (true) {
            Object obj = this._queue;
            if (this._isCompleted == 0) {
                if (obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4077g;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof kotlinx.coroutines.internal.i) {
                    kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
                    int iA = iVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4077g;
                        kotlinx.coroutines.internal.i iVarE = iVar.e();
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVarE) && atomicReferenceFieldUpdater2.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != q.f4112a) {
                    kotlinx.coroutines.internal.i iVar2 = new kotlinx.coroutines.internal.i(8, true);
                    iVar2.a((Runnable) obj);
                    iVar2.a(runnable);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f4077g;
                    do {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, iVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater3.get(this) == obj);
                }
            }
            r.f4120h.J(runnable);
            return;
        }
        Thread threadH = H();
        if (Thread.currentThread() != threadH) {
            LockSupport.unpark(threadH);
        }
    }

    public final boolean K() {
        r0.b bVar = this.f4080f;
        if (bVar != null && bVar.f4028a != bVar.f4029b) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.i) {
                return ((kotlinx.coroutines.internal.i) obj).d();
            }
            if (obj != q.f4112a) {
                return false;
            }
        }
        return true;
    }

    public final long L() {
        Runnable runnable;
        if (I()) {
            return 0L;
        }
        loop0: while (true) {
            Object obj = this._queue;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof kotlinx.coroutines.internal.i) {
                kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
                Object objF = iVar.f();
                if (objF != kotlinx.coroutines.internal.i.f3298g) {
                    runnable = (Runnable) objF;
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4077g;
                kotlinx.coroutines.internal.i iVarE = iVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVarE) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == q.f4112a) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4077g;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        r0.b bVar = this.f4080f;
        if (((bVar == null || bVar.f4028a == bVar.f4029b) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 == null) {
        } else if (obj2 instanceof kotlinx.coroutines.internal.i) {
            if (!((kotlinx.coroutines.internal.i) obj2).d()) {
                return 0L;
            }
        } else if (obj2 != q.f4112a) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public final void M() {
        this._queue = null;
        this._delayed = null;
    }

    @Override // r3.c0
    public void shutdown() {
        w0.f4127a.set(null);
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            g1.e eVar = q.f4112a;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4077g;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof kotlinx.coroutines.internal.i) {
                    ((kotlinx.coroutines.internal.i) obj).b();
                    break;
                }
                if (obj == eVar) {
                    break;
                }
                kotlinx.coroutines.internal.i iVar = new kotlinx.coroutines.internal.i(8, true);
                iVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4077g;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        while (L() <= 0) {
        }
        System.nanoTime();
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) {
        J(runnable);
    }
}
