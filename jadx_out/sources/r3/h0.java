package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4091g = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j3.l f4092f;

    public h0(l0 l0Var) {
        this.f4092f = l0Var;
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        m((Throwable) obj);
        return z2.f.f5511a;
    }

    @Override // r3.l0
    public final void m(Throwable th) {
        if (f4091g.compareAndSet(this, 0, 1)) {
            this.f4092f.e(th);
        }
    }
}
