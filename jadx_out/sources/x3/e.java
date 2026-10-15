package x3;

import a4.h0;
import f4.q;
import java.io.IOException;
import t3.a0;
import t3.b0;
import t3.c0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3.n f4949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f4950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3.d f4951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f4954g;

    public e(j jVar, t3.n nVar, f fVar, y3.d dVar) {
        c3.h.b0(nVar, "eventListener");
        this.f4948a = jVar;
        this.f4949b = nVar;
        this.f4950c = fVar;
        this.f4951d = dVar;
        this.f4954g = dVar.h();
    }

    public final IOException a(boolean z4, boolean z5, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        t3.n nVar = this.f4949b;
        j jVar = this.f4948a;
        if (z5) {
            if (iOException != null) {
                nVar.getClass();
                c3.h.b0(jVar, "call");
            } else {
                nVar.getClass();
                c3.h.b0(jVar, "call");
            }
        }
        if (z4) {
            if (iOException != null) {
                nVar.getClass();
                c3.h.b0(jVar, "call");
            } else {
                nVar.getClass();
                c3.h.b0(jVar, "call");
            }
        }
        return jVar.h(this, z5, z4, iOException);
    }

    public final c0 b(b0 b0Var) throws IOException {
        y3.d dVar = this.f4951d;
        try {
            String strA = b0.a(b0Var, "Content-Type");
            long jF = dVar.f(b0Var);
            return new c0(strA, jF, new q(new d(this, dVar.d(b0Var), jF)));
        } catch (IOException e5) {
            this.f4949b.getClass();
            c3.h.b0(this.f4948a, "call");
            d(e5);
            throw e5;
        }
    }

    public final a0 c(boolean z4) throws IOException {
        try {
            a0 a0VarE = this.f4951d.e(z4);
            if (a0VarE != null) {
                a0VarE.f4305m = this;
            }
            return a0VarE;
        } catch (IOException e5) {
            this.f4949b.getClass();
            c3.h.b0(this.f4948a, "call");
            d(e5);
            throw e5;
        }
    }

    public final void d(IOException iOException) {
        this.f4953f = true;
        this.f4950c.c(iOException);
        l lVarH = this.f4951d.h();
        j jVar = this.f4948a;
        synchronized (lVarH) {
            try {
                c3.h.b0(jVar, "call");
                if (iOException instanceof h0) {
                    if (((h0) iOException).f155b == a4.b.f83g) {
                        int i4 = lVarH.f5001n + 1;
                        lVarH.f5001n = i4;
                        if (i4 > 1) {
                            lVarH.f4997j = true;
                            lVarH.f4999l++;
                        }
                    } else if (((h0) iOException).f155b != a4.b.f84h || !jVar.f4985q) {
                        lVarH.f4997j = true;
                        lVarH.f4999l++;
                    }
                } else if (lVarH.f4994g == null || (iOException instanceof a4.a)) {
                    lVarH.f4997j = true;
                    if (lVarH.f5000m == 0) {
                        l.d(jVar.f4970b, lVarH.f4989b, iOException);
                        lVarH.f4999l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
