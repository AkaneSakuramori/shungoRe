package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3313i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f3314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f3320h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile /* synthetic */ int workerCtl;

    public a(b bVar, int i4) {
        this.f3320h = bVar;
        setDaemon(true);
        this.f3314b = new l();
        this.f3315c = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = b.f3324l;
        l3.e.f3401b.getClass();
        this.f3318f = l3.e.f3402c.a().nextInt();
        f(i4);
    }

    public final h a(boolean z4) {
        h hVarE;
        h hVarE2;
        long j4;
        h hVarC;
        if (this.f3315c != 1) {
            b bVar = this.f3320h;
            do {
                j4 = bVar.controlState;
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    if (z4) {
                        l lVar = this.f3314b;
                        lVar.getClass();
                        hVarC = (h) l.f3348b.getAndSet(lVar, null);
                        if (hVarC == null) {
                            hVarC = lVar.c();
                        }
                        if (hVarC == null) {
                            hVarC = (h) this.f3320h.f3330g.d();
                        }
                    } else {
                        hVarC = (h) this.f3320h.f3330g.d();
                    }
                    return hVarC == null ? i(true) : hVarC;
                }
            } while (!b.f3322j.compareAndSet(bVar, j4, j4 - 4398046511104L));
            this.f3315c = 1;
        }
        if (z4) {
            boolean z5 = d(this.f3320h.f3325b * 2) == 0;
            if (z5 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            l lVar2 = this.f3314b;
            lVar2.getClass();
            h hVar = (h) l.f3348b.getAndSet(lVar2, null);
            h hVarC2 = hVar == null ? lVar2.c() : hVar;
            if (hVarC2 != null) {
                return hVarC2;
            }
            if (!z5 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(false);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i5 = this.f3318f;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f3318f = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f3320h;
        if (iD == 0) {
            h hVar = (h) bVar.f3329f.d();
            return hVar != null ? hVar : (h) bVar.f3330g.d();
        }
        h hVar2 = (h) bVar.f3330g.d();
        return hVar2 != null ? hVar2 : (h) bVar.f3329f.d();
    }

    public final void f(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3320h.f3328e);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i4) {
        int i5 = this.f3315c;
        boolean z4 = i5 == 1;
        if (z4) {
            b.f3322j.addAndGet(this.f3320h, 4398046511104L);
        }
        if (i5 != i4) {
            this.f3315c = i4;
        }
        return z4;
    }

    public final h i(boolean z4) {
        long jE;
        int i4 = (int) (this.f3320h.controlState & 2097151);
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        b bVar = this.f3320h;
        long jMin = Long.MAX_VALUE;
        for (int i5 = 0; i5 < i4; i5++) {
            iD++;
            if (iD > i4) {
                iD = 1;
            }
            a aVar = (a) bVar.f3331h.b(iD);
            if (aVar != null && aVar != this) {
                if (z4) {
                    jE = this.f3314b.d(aVar.f3314b);
                } else {
                    l lVar = this.f3314b;
                    l lVar2 = aVar.f3314b;
                    lVar.getClass();
                    h hVarC = lVar2.c();
                    if (hVarC != null) {
                        h hVar = (h) l.f3348b.getAndSet(lVar, hVarC);
                        if (hVar != null) {
                            lVar.a(hVar);
                        }
                        jE = -1;
                    } else {
                        jE = lVar.e(lVar2, false);
                    }
                }
                if (jE == -1) {
                    l lVar3 = this.f3314b;
                    lVar3.getClass();
                    h hVar2 = (h) l.f3348b.getAndSet(lVar3, null);
                    return hVar2 == null ? lVar3.c() : hVar2;
                }
                if (jE > 0) {
                    jMin = Math.min(jMin, jE);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f3317e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (this.f3320h.isTerminated() || this.f3315c == 5) {
                    break loop0;
                }
                h hVarA = a(this.f3319g);
                if (hVarA != null) {
                    this.f3317e = 0L;
                    int i4 = hVarA.f3338c.f2033b;
                    this.f3316d = 0L;
                    if (this.f3315c == 3) {
                        this.f3315c = 2;
                    }
                    b bVar = this.f3320h;
                    if (i4 != 0 && h(2) && !bVar.z() && !bVar.x(bVar.controlState)) {
                        bVar.z();
                    }
                    bVar.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                    }
                    if (i4 != 0) {
                        b.f3322j.addAndGet(bVar, -2097152L);
                        if (this.f3315c == 5) {
                            break;
                        }
                        this.f3315c = 4;
                        break;
                    }
                    break;
                }
                this.f3319g = false;
                if (this.f3317e != 0) {
                    if (z4) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3317e);
                        this.f3317e = 0L;
                        break;
                    }
                    z4 = true;
                } else if (this.nextParkedWorker != b.f3324l) {
                    this.workerCtl = -1;
                    while (this.nextParkedWorker != b.f3324l && this.workerCtl == -1 && !this.f3320h.isTerminated() && this.f3315c != 5) {
                        h(3);
                        Thread.interrupted();
                        if (this.f3316d == 0) {
                            this.f3316d = System.nanoTime() + this.f3320h.f3327d;
                        }
                        LockSupport.parkNanos(this.f3320h.f3327d);
                        if (System.nanoTime() - this.f3316d >= 0) {
                            this.f3316d = 0L;
                            b bVar2 = this.f3320h;
                            synchronized (bVar2.f3331h) {
                                try {
                                    if (!bVar2.isTerminated()) {
                                        if (((int) (bVar2.controlState & 2097151)) > bVar2.f3325b) {
                                            if (f3313i.compareAndSet(this, -1, 1)) {
                                                int i5 = this.indexInArray;
                                                f(0);
                                                bVar2.t(this, i5, 0);
                                                int andDecrement = (int) (b.f3322j.getAndDecrement(bVar2) & 2097151);
                                                if (andDecrement != i5) {
                                                    Object objB = bVar2.f3331h.b(andDecrement);
                                                    c3.h.X(objB);
                                                    a aVar = (a) objB;
                                                    bVar2.f3331h.c(i5, aVar);
                                                    aVar.f(i5);
                                                    bVar2.t(aVar, andDecrement, i5);
                                                }
                                                bVar2.f3331h.c(andDecrement, null);
                                                this.f3315c = 5;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                } else {
                    this.f3320h.h(this);
                }
            }
        }
        h(5);
    }
}
