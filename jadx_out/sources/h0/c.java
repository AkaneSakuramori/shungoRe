package h0;

import p.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2491d;

    public c() {
        super(12, 1);
        this.f2491d = new Object();
    }

    @Override // p.e
    public final Object a() {
        Object objA;
        synchronized (this.f2491d) {
            objA = super.a();
        }
        return objA;
    }

    @Override // p.e
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.f2491d) {
            zB = super.b(obj);
        }
        return zB;
    }
}
