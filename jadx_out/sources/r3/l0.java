package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends kotlinx.coroutines.internal.f implements y, f0, j3.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f4100e;

    @Override // r3.f0
    public final boolean a() {
        return true;
    }

    @Override // r3.f0
    public final r0 b() {
        return null;
    }

    @Override // r3.y
    public final void c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p0 p0Var = this.f4100e;
        if (p0Var == null) {
            c3.h.E2("job");
            throw null;
        }
        while (true) {
            Object objR = p0Var.r();
            if (!(objR instanceof l0)) {
                if (!(objR instanceof f0) || ((f0) objR).b() == null) {
                    return;
                }
                l();
                return;
            }
            if (objR != this) {
                return;
            }
            z zVar = q.f4119h;
            do {
                atomicReferenceFieldUpdater = p0.f4111b;
                if (atomicReferenceFieldUpdater.compareAndSet(p0Var, objR, zVar)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(p0Var) == objR);
        }
    }

    public abstract void m(Throwable th);

    @Override // kotlinx.coroutines.internal.f
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(q.h(this));
        sb.append("[job@");
        p0 p0Var = this.f4100e;
        if (p0Var == null) {
            c3.h.E2("job");
            throw null;
        }
        sb.append(q.h(p0Var));
        sb.append(']');
        return sb.toString();
    }
}
