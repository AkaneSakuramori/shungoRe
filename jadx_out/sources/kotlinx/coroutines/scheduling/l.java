package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3348b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3349c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3350d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3351e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3352a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final h a(h hVar) {
        if (hVar.f3338c.f2033b == 1) {
            f3351e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return hVar;
        }
        int i4 = this.producerIndex & 127;
        while (this.f3352a.get(i4) != null) {
            Thread.yield();
        }
        this.f3352a.lazySet(i4, hVar);
        f3349c.incrementAndGet(this);
        return null;
    }

    public final int b() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final h c() {
        h hVar;
        while (true) {
            int i4 = this.consumerIndex;
            if (i4 - this.producerIndex == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (f3350d.compareAndSet(this, i4, i4 + 1) && (hVar = (h) this.f3352a.getAndSet(i5, null)) != null) {
                if (hVar.f3338c.f2033b == 1) {
                    f3351e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final long d(l lVar) {
        int i4 = lVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = lVar.f3352a;
        for (int i5 = lVar.consumerIndex; i5 != i4; i5++) {
            int i6 = i5 & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = (h) atomicReferenceArray.get(i6);
            if (hVar != null && hVar.f3338c.f2033b == 1) {
                do {
                    if (atomicReferenceArray.compareAndSet(i6, hVar, null)) {
                        f3351e.decrementAndGet(lVar);
                        h hVar2 = (h) f3348b.getAndSet(this, hVar);
                        if (hVar2 == null) {
                            return -1L;
                        }
                        a(hVar2);
                        return -1L;
                    }
                } while (atomicReferenceArray.get(i6) == hVar);
            }
        }
        return e(lVar, true);
    }

    public final long e(l lVar, boolean z4) {
        while (true) {
            h hVar = (h) lVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z4 && hVar.f3338c.f2033b != 1) {
                return -2L;
            }
            j.f3344e.getClass();
            long jNanoTime = System.nanoTime() - hVar.f3337b;
            long j4 = j.f3340a;
            if (jNanoTime < j4) {
                return j4 - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3348b;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar, null)) {
                    h hVar2 = (h) f3348b.getAndSet(this, hVar);
                    if (hVar2 == null) {
                        return -1L;
                    }
                    a(hVar2);
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(lVar) == hVar);
        }
    }
}
