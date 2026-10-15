package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.n;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3326c;
    volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f3329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f3330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f3331h;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g1.e f3324l = new g1.e("NOT_IN_STACK");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3321i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3322j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3323k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    public b(int i4, int i5, long j4, String str) {
        this.f3325b = i4;
        this.f3326c = i5;
        this.f3327d = j4;
        this.f3328e = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f3329f = new e();
        this.f3330g = new e();
        this.parkedWorkersStack = 0L;
        this.f3331h = new n(i4 + 1);
        this.controlState = ((long) i4) << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f3331h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j4 = this.controlState;
            int i4 = (int) (j4 & 2097151);
            int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 >= this.f3325b) {
                return 0;
            }
            if (i4 >= this.f3326c) {
                return 0;
            }
            int i6 = ((int) (this.controlState & 2097151)) + 1;
            if (i6 <= 0 || this.f3331h.b(i6) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a aVar = new a(this, i6);
            this.f3331h.c(i6, aVar);
            if (i6 != ((int) (2097151 & f3322j.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return i5 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i4;
        h hVarA;
        if (f3323k.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !c3.h.I(aVar.f3320h, this)) {
                aVar = null;
            }
            synchronized (this.f3331h) {
                i4 = (int) (this.controlState & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object objB = this.f3331h.b(i5);
                    c3.h.X(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f3314b;
                        e eVar = this.f3330g;
                        lVar.getClass();
                        h hVar = (h) l.f3348b.getAndSet(lVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarC = lVar.c();
                            if (hVarC == null) {
                                break;
                            } else {
                                eVar.a(hVarC);
                            }
                        }
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f3330g.b();
            this.f3329f.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f3329f.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f3329f.d();
                    if (hVarA == null && (hVarA = (h) this.f3330g.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void e(Runnable runnable, f2.e eVar, boolean z4) {
        h iVar;
        int i4;
        j.f3344e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f3337b = jNanoTime;
            iVar.f3338c = eVar;
        } else {
            iVar = new i(runnable, jNanoTime, eVar);
        }
        Thread threadCurrentThread = Thread.currentThread();
        h hVarA = null;
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !c3.h.I(aVar.f3320h, this)) {
            aVar = null;
        }
        if (aVar == null || (i4 = aVar.f3315c) == 5 || (iVar.f3338c.f2033b == 0 && i4 == 2)) {
            hVarA = iVar;
        } else {
            aVar.f3319g = true;
            l lVar = aVar.f3314b;
            if (z4) {
                hVarA = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f3348b.getAndSet(lVar, iVar);
                if (hVar != null) {
                    hVarA = lVar.a(hVar);
                }
            }
        }
        if (hVarA != null) {
            if (!(hVarA.f3338c.f2033b == 1 ? this.f3330g.a(hVarA) : this.f3329f.a(hVarA))) {
                throw new RejectedExecutionException(defpackage.a.h(new StringBuilder(), this.f3328e, " was terminated"));
            }
        }
        boolean z5 = z4 && aVar != null;
        if (iVar.f3338c.f2033b == 0) {
            if (z5 || z() || x(this.controlState)) {
                return;
            }
            z();
            return;
        }
        long jAddAndGet = f3322j.addAndGet(this, 2097152L);
        if (z5 || z() || x(jAddAndGet)) {
            return;
        }
        z();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(runnable, j.f3345f, false);
    }

    public final void h(a aVar) {
        long j4;
        int iB;
        if (aVar.c() != f3324l) {
            return;
        }
        do {
            j4 = this.parkedWorkersStack;
            iB = aVar.b();
            aVar.g(this.f3331h.b((int) (2097151 & j4)));
        } while (!f3321i.compareAndSet(this, j4, ((long) iB) | ((2097152 + j4) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void t(a aVar, int i4, int i5) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f3324l) {
                            i6 = -1;
                            break;
                        }
                        if (objC == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i6 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0 && f3321i.compareAndSet(this, j4, j5 | ((long) i6))) {
                return;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f3331h.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            a aVar = (a) this.f3331h.b(i9);
            if (aVar != null) {
                int iB = aVar.f3314b.b();
                int iA2 = p.h.a(aVar.f3315c);
                if (iA2 == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iA2 == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iA2 == 2) {
                    i6++;
                } else if (iA2 == 3) {
                    i7++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iA2 == 4) {
                    i8++;
                }
            }
        }
        long j4 = this.controlState;
        return this.f3328e + '@' + q.h(this) + "[Pool Size {core = " + this.f3325b + ", max = " + this.f3326c + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f3329f.c() + ", global blocking queue size = " + this.f3330g.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f3325b - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    public final boolean x(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f3325b;
        if (i4 < i5) {
            int iA = a();
            if (iA == 1 && i5 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        g1.e eVar;
        int iB;
        while (true) {
            long j4 = this.parkedWorkersStack;
            a aVar = (a) this.f3331h.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    eVar = f3324l;
                    if (objC == eVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && f3321i.compareAndSet(this, j4, ((long) iB) | j5)) {
                    aVar.g(eVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3313i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
