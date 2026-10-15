package kotlinx.coroutines.scheduling;

import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f3339d;

    public i(Runnable runnable, long j4, f2.e eVar) {
        super(j4, eVar);
        this.f3339d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3339d.run();
        } finally {
            this.f3338c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3339d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(q.h(runnable));
        sb.append(", ");
        sb.append(this.f3337b);
        sb.append(", ");
        sb.append(this.f3338c);
        sb.append(']');
        return sb.toString();
    }
}
