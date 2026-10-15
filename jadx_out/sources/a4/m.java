package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f164f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f165g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, g0 g0Var) {
        super(str, true);
        this.f163e = nVar;
        this.f165g = g0Var;
    }

    @Override // w3.a
    public final long a() {
        long jA;
        int i4;
        b0[] b0VarArr;
        n nVar = this.f163e;
        boolean z4 = this.f164f;
        g0 g0Var = this.f165g;
        nVar.getClass();
        c3.h.b0(g0Var, "settings");
        k3.m mVar = new k3.m();
        t tVar = nVar.f167c;
        synchronized (tVar.f208z) {
            synchronized (tVar) {
                try {
                    g0 g0Var2 = tVar.f202t;
                    if (!z4) {
                        g0 g0Var3 = new g0();
                        g0Var3.b(g0Var2);
                        g0Var3.b(g0Var);
                        g0Var = g0Var3;
                    }
                    mVar.f3276b = g0Var;
                    jA = ((long) g0Var.a()) - ((long) g0Var2.a());
                    b0VarArr = (jA == 0 || tVar.f186d.isEmpty()) ? null : (b0[]) tVar.f186d.values().toArray(new b0[0]);
                    g0 g0Var4 = (g0) mVar.f3276b;
                    c3.h.b0(g0Var4, "<set-?>");
                    tVar.f202t = g0Var4;
                    tVar.f194l.c(new k(tVar.f187e + " onSettings", tVar, mVar, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                tVar.f208z.a((g0) mVar.f3276b);
            } catch (IOException e5) {
                tVar.e(e5);
            }
        }
        if (b0VarArr == null) {
            return -1L;
        }
        for (b0 b0Var : b0VarArr) {
            synchronized (b0Var) {
                b0Var.f92f += jA;
                if (jA > 0) {
                    b0Var.notifyAll();
                }
            }
        }
        return -1L;
    }
}
