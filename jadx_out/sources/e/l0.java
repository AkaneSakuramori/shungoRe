package e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1890b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1891c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f1892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f1893e;

    public l0(m0 m0Var) {
        this.f1892d = m0Var;
    }

    public final void a() {
        synchronized (this.f1890b) {
            try {
                Runnable runnable = (Runnable) this.f1891c.poll();
                this.f1893e = runnable;
                if (runnable != null) {
                    this.f1892d.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1890b) {
            try {
                this.f1891c.add(new k0(this, 0, runnable));
                if (this.f1893e == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
