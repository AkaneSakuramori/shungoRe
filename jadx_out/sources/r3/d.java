package r3;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k0 implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f4081f;

    public d(a aVar) {
        this.f4081f = aVar;
    }

    @Override // r3.c
    public final boolean d(Throwable th) {
        p0 p0Var = this.f4100e;
        if (p0Var == null) {
            c3.h.E2("job");
            throw null;
        }
        if (th instanceof CancellationException) {
            return true;
        }
        return p0Var.j(th);
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object e(Object obj) throws IllegalAccessException, InvocationTargetException {
        m((Throwable) obj);
        return z2.f.f5511a;
    }

    @Override // r3.l0
    public final void m(Throwable th) throws IllegalAccessException, InvocationTargetException {
        p0 p0Var = this.f4100e;
        if (p0Var != null) {
            ((p0) this.f4081f).j(p0Var);
        } else {
            c3.h.E2("job");
            throw null;
        }
    }
}
