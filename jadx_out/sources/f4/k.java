package f4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f2171e;

    public k(y yVar) {
        c3.h.b0(yVar, "delegate");
        this.f2171e = yVar;
    }

    @Override // f4.y
    public final y a() {
        return this.f2171e.a();
    }

    @Override // f4.y
    public final y b() {
        return this.f2171e.b();
    }

    @Override // f4.y
    public final long c() {
        return this.f2171e.c();
    }

    @Override // f4.y
    public final y d(long j4) {
        return this.f2171e.d(j4);
    }

    @Override // f4.y
    public final boolean e() {
        return this.f2171e.e();
    }

    @Override // f4.y
    public final void f() throws InterruptedIOException {
        this.f2171e.f();
    }

    @Override // f4.y
    public final y g(long j4, TimeUnit timeUnit) {
        c3.h.b0(timeUnit, "unit");
        return this.f2171e.g(j4, timeUnit);
    }
}
