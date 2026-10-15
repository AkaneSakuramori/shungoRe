package f4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f2203d = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2206c;

    public y a() {
        this.f2204a = false;
        return this;
    }

    public y b() {
        this.f2206c = 0L;
        return this;
    }

    public long c() {
        if (this.f2204a) {
            return this.f2205b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public y d(long j4) {
        this.f2204a = true;
        this.f2205b = j4;
        return this;
    }

    public boolean e() {
        return this.f2204a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2204a && this.f2205b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j4, TimeUnit timeUnit) {
        c3.h.b0(timeUnit, "unit");
        if (j4 >= 0) {
            this.f2206c = timeUnit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j4).toString());
    }
}
