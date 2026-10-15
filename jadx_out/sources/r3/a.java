package r3;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p0 implements c3.e, o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3.k f4074c;

    public a(c3.k kVar, boolean z4) {
        super(z4);
        v((i0) kVar.e(l.f4099c));
        this.f4074c = kVar.x(this);
    }

    @Override // r3.p0
    public final void C(Object obj) {
        if (obj instanceof f) {
            Throwable th = ((f) obj).f4084a;
        }
    }

    @Override // r3.p0, r3.i0
    public final boolean a() {
        return super.a();
    }

    @Override // c3.e
    public final void b(Object obj) {
        Throwable thA = z2.c.a(obj);
        if (thA != null) {
            obj = new f(thA);
        }
        Object objY = y(obj);
        if (objY == q.f4114c) {
            return;
        }
        i(objY);
    }

    @Override // c3.e
    public final c3.k g() {
        return this.f4074c;
    }

    @Override // r3.p0
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // r3.p0
    public final void u(androidx.fragment.app.p pVar) throws IllegalAccessException, InvocationTargetException {
        c3.h.g1(this.f4074c, pVar);
    }

    @Override // r3.p0
    public final String z() {
        return super.z();
    }
}
