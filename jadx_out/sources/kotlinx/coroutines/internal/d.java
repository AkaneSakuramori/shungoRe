package kotlinx.coroutines.internal;

import java.lang.reflect.InvocationTargetException;
import r3.s;
import r3.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r3.k implements Runnable, t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3.k f3287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f3289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3290g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public d(kotlinx.coroutines.scheduling.k kVar, int i4) {
        this.f3287d = kVar;
        this.f3288e = i4;
        if ((kVar instanceof t ? (t) kVar : null) == null) {
            int i5 = s.f4122a;
        }
        this.f3289f = new g();
        this.f3290g = new Object();
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        while (true) {
            int i4 = 0;
            while (true) {
                Runnable runnable = (Runnable) this.f3289f.d();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        c3.h.g1(c3.l.f1275b, th);
                    }
                    i4++;
                    if (i4 >= 16 && this.f3287d.C()) {
                        this.f3287d.z(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f3290g) {
                this.runningWorkers--;
                if (this.f3289f.c() == 0) {
                    return;
                } else {
                    this.runningWorkers++;
                }
            }
        }
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) {
        this.f3289f.a(runnable);
        if (this.runningWorkers >= this.f3288e) {
            return;
        }
        synchronized (this.f3290g) {
            if (this.runningWorkers >= this.f3288e) {
                return;
            }
            this.runningWorkers++;
            this.f3287d.z(this, this);
        }
    }
}
