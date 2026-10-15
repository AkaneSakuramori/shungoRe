package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import r3.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3336d;

    public g(int i4, int i5, long j4) {
        this.f3336d = new b(i4, i5, j4, "DefaultDispatcher");
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) {
        b bVar = this.f3336d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f3321i;
        bVar.e(runnable, j.f3345f, false);
    }
}
