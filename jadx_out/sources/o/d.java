package o;

import c3.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3582n;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3578j = atomicReferenceFieldUpdater;
        this.f3579k = atomicReferenceFieldUpdater2;
        this.f3580l = atomicReferenceFieldUpdater3;
        this.f3581m = atomicReferenceFieldUpdater4;
        this.f3582n = atomicReferenceFieldUpdater5;
    }

    @Override // c3.h
    public final boolean R(f fVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3576b;
        do {
            atomicReferenceFieldUpdater = this.f3581m;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(fVar) == cVar);
        return false;
    }

    @Override // c3.h
    public final boolean S(f fVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3582n;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(fVar) == obj);
        return false;
    }

    @Override // c3.h
    public final boolean T(f fVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3580l;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(fVar) == eVar);
        return false;
    }

    @Override // c3.h
    public final void X1(e eVar, e eVar2) {
        this.f3579k.lazySet(eVar, eVar2);
    }

    @Override // c3.h
    public final void Y1(e eVar, Thread thread) {
        this.f3578j.lazySet(eVar, thread);
    }
}
