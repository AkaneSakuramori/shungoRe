package f4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class e extends y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f2155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f2156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f2157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f2158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f2159l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f2161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2162g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f2155h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        c3.h.a0(conditionNewCondition, "newCondition(...)");
        f2156i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2157j = millis;
        f2158k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j4 = this.f2206c;
        boolean z4 = this.f2204a;
        if (j4 != 0 || z4) {
            ReentrantLock reentrantLock = f2155h;
            reentrantLock.lock();
            try {
                if (!(!this.f2160e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f2160e = true;
                if (f2159l == null) {
                    f2159l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j4 != 0 && z4) {
                    this.f2162g = Math.min(j4, c() - jNanoTime) + jNanoTime;
                } else if (j4 != 0) {
                    this.f2162g = j4 + jNanoTime;
                } else {
                    if (!z4) {
                        throw new AssertionError();
                    }
                    this.f2162g = c();
                }
                long j5 = this.f2162g - jNanoTime;
                e eVar2 = f2159l;
                c3.h.X(eVar2);
                while (true) {
                    eVar = eVar2.f2161f;
                    if (eVar == null || j5 < eVar.f2162g - jNanoTime) {
                        break;
                        break;
                    }
                    eVar2 = eVar;
                }
                this.f2161f = eVar;
                eVar2.f2161f = this;
                if (eVar2 == f2159l) {
                    f2156i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f2155h;
        reentrantLock.lock();
        try {
            if (!this.f2160e) {
                return false;
            }
            this.f2160e = false;
            e eVar = f2159l;
            while (eVar != null) {
                e eVar2 = eVar.f2161f;
                if (eVar2 == this) {
                    eVar.f2161f = this.f2161f;
                    this.f2161f = null;
                    return false;
                }
                eVar = eVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
