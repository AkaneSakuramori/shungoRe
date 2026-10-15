package y3;

import i.w;
import q3.l;
import t3.a0;
import t3.b0;
import t3.c0;
import t3.d0;
import t3.k;
import t3.n;
import t3.p;
import t3.q;
import t3.s;
import t3.t;
import t3.u;
import t3.y;
import t3.z;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5412a;

    public a(n nVar) {
        c3.h.b0(nVar, "cookieJar");
        this.f5412a = nVar;
    }

    @Override // t3.t
    public final b0 a(f fVar) {
        d0 d0Var;
        w wVar = fVar.f5419e;
        y yVarF = wVar.f();
        z zVar = (z) wVar.f2811e;
        if (zVar != null) {
            u uVar = zVar.f4491a;
            if (uVar != null) {
                yVarF.c("Content-Type", uVar.f4431a);
            }
            long j4 = zVar.f4492b;
            if (j4 != -1) {
                yVarF.c("Content-Length", String.valueOf(j4));
                yVarF.f4488c.c("Transfer-Encoding");
            } else {
                yVarF.c("Transfer-Encoding", "chunked");
                yVarF.f4488c.c("Content-Length");
            }
        }
        Object obj = wVar.f2810d;
        String strA = ((q) obj).a("Host");
        boolean z4 = false;
        Object obj2 = wVar.f2808b;
        if (strA == null) {
            yVarF.c("Host", u3.b.v((s) obj2, false));
        }
        if (((q) obj).a("Connection") == null) {
            yVarF.c("Connection", "Keep-Alive");
        }
        if (((q) obj).a("Accept-Encoding") == null && ((q) obj).a("Range") == null) {
            yVarF.c("Accept-Encoding", "gzip");
            z4 = true;
        }
        s sVar = (s) obj2;
        k kVar = this.f5412a;
        ((n) kVar).getClass();
        c3.h.b0(sVar, "url");
        if (((q) obj).a("User-Agent") == null) {
            yVarF.c("User-Agent", "okhttp/4.12.0");
        }
        b0 b0VarB = fVar.b(yVarF.b());
        q qVar = b0VarB.f4312g;
        e.b(kVar, sVar, qVar);
        a0 a0VarE = b0VarB.e();
        a0VarE.f4293a = wVar;
        if (z4 && l.U2("gzip", b0.a(b0VarB, "Content-Encoding")) && e.a(b0VarB) && (d0Var = b0VarB.f4313h) != null) {
            f4.l lVar = new f4.l(((c0) d0Var).f4336d);
            p pVarC = qVar.c();
            pVarC.c("Content-Encoding");
            pVarC.c("Content-Length");
            a0VarE.f4298f = pVarC.b().c();
            a0VarE.f4299g = new c0(b0.a(b0VarB, "Content-Type"), -1L, new f4.q(lVar));
        }
        return a0VarE.a();
    }
}
