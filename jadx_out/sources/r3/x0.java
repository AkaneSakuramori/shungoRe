package r3;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4130d = 0;

    static {
        new x0();
    }

    @Override // r3.k
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) {
        defpackage.a.k(kVar.e(a1.f4075c));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
