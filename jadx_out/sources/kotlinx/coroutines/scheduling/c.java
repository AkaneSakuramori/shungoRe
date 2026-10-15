package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.p;
import r3.d0;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3332d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.d f3333e;

    static {
        k kVar = k.f3347d;
        int i4 = p.f3306a;
        if (64 >= i4) {
            i4 = 64;
        }
        int iW = q.w("kotlinx.coroutines.io.parallelism", i4, 0, 0, 12);
        kVar.getClass();
        if (iW < 1) {
            throw new IllegalArgumentException(defpackage.a.e("Expected positive parallelism level, but got ", iW).toString());
        }
        f3333e = new kotlinx.coroutines.internal.d(kVar, iW);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z(c3.l.f1275b, runnable);
    }

    @Override // r3.k
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) {
        f3333e.z(kVar, runnable);
    }
}
