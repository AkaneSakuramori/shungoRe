package h1;

import a4.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.b f2492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f2494c = new e0();

    public a(g1.b bVar, e eVar, z0.c cVar) {
        this.f2492a = bVar;
        this.f2493b = eVar;
    }

    public final boolean a(long j4, long j5) {
        if (j4 <= 0) {
            return false;
        }
        this.f2494c.getClass();
        return j4 <= (j5 * ((long) 1000)) + System.currentTimeMillis();
    }
}
