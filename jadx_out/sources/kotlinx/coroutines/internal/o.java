package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes.dex */
public class o extends r3.a implements e3.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.e f3305d;

    public o(c3.e eVar, c3.k kVar) {
        super(kVar, true);
        this.f3305d = eVar;
    }

    @Override // r3.p0
    public void d(Object obj) {
        a.d(c3.h.k1(this.f3305d), c3.h.f2(obj), null);
    }

    @Override // e3.d
    public final e3.d f() {
        c3.e eVar = this.f3305d;
        if (eVar instanceof e3.d) {
            return (e3.d) eVar;
        }
        return null;
    }

    @Override // r3.p0
    public void i(Object obj) {
        this.f3305d.b(c3.h.f2(obj));
    }

    @Override // r3.p0
    public final boolean w() {
        return true;
    }
}
