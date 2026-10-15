package r3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f4120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f4121i;

    static {
        Long l4;
        r rVar = new r();
        f4120h = rVar;
        rVar.f4078d = 1 + rVar.f4078d;
        rVar.f4079e = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f4121i = timeUnit.toNanos(l4.longValue());
    }

    @Override // r3.c0
    public final Thread H() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // r3.b0
    public final void J(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.J(runnable);
    }

    public final synchronized void N() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            M();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w0.f4127a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 != 2 && i4 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j4 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jL = L();
                        if (jL == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j4 == Long.MAX_VALUE) {
                                j4 = f4121i + jNanoTime;
                            }
                            long j5 = j4 - jNanoTime;
                            if (j5 <= 0) {
                                _thread = null;
                                N();
                                if (K()) {
                                    return;
                                }
                                H();
                                return;
                            }
                            if (jL > j5) {
                                jL = j5;
                            }
                        } else {
                            j4 = Long.MAX_VALUE;
                        }
                        if (jL > 0) {
                            int i5 = debugStatus;
                            if (i5 == 2 || i5 == 3) {
                                break;
                                break;
                            }
                            LockSupport.parkNanos(this, jL);
                        }
                    }
                    _thread = null;
                    N();
                    if (K()) {
                        return;
                    }
                    H();
                    return;
                }
                _thread = null;
                N();
                if (K()) {
                    return;
                }
                H();
            }
        } catch (Throwable th) {
            _thread = null;
            N();
            if (!K()) {
                H();
            }
            throw th;
        }
    }

    @Override // r3.b0, r3.c0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
