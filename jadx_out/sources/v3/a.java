package v3;

import c3.h;
import f2.e;
import i.w;
import q3.l;
import t3.a0;
import t3.b0;
import t3.d0;
import t3.n;
import t3.p;
import t3.q;
import t3.t;
import t3.x;
import x3.j;
import y3.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4814a = 0;

    @Override // t3.t
    public final b0 a(f fVar) {
        q qVar;
        q qVar2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVar = fVar.f5419e;
        w wVar2 = new b(jCurrentTimeMillis, wVar).f4815a;
        c cVar = new c(wVar2, null);
        if (cVar.f4816a != null && wVar2.b().f4330j) {
            cVar = new c(null, null);
        }
        j jVar = fVar.f5415a;
        j jVar2 = jVar instanceof j ? jVar : null;
        if (jVar2 != null) {
            n nVar = jVar2.f4974f;
        }
        w wVar3 = cVar.f4816a;
        b0 b0Var = cVar.f4817b;
        if (wVar3 == null && b0Var == null) {
            a0 a0Var = new a0();
            a0Var.f4293a = wVar;
            a0Var.f4294b = x.f4479d;
            a0Var.f4295c = 504;
            a0Var.f4296d = "Unsatisfiable Request (only-if-cached)";
            a0Var.f4299g = u3.b.f4763c;
            a0Var.f4303k = -1L;
            a0Var.f4304l = System.currentTimeMillis();
            b0 b0VarA = a0Var.a();
            h.b0(jVar, "call");
            return b0VarA;
        }
        if (wVar3 == null) {
            h.X(b0Var);
            a0 a0VarE = b0Var.e();
            b0 b0VarD = e.d(b0Var);
            a0.b("cacheResponse", b0VarD);
            a0VarE.f4301i = b0VarD;
            b0 b0VarA2 = a0VarE.a();
            h.b0(jVar, "call");
            return b0VarA2;
        }
        if (b0Var != null) {
            h.b0(jVar, "call");
        }
        b0 b0VarB = fVar.b(wVar3);
        if (b0Var != null) {
            if (b0VarB.f4310e == 304) {
                a0 a0VarE2 = b0Var.e();
                p pVar = new p();
                q qVar3 = b0Var.f4312g;
                int size = qVar3.size();
                int i4 = 0;
                while (true) {
                    qVar = b0VarB.f4312g;
                    if (i4 >= size) {
                        break;
                    }
                    String strB = qVar3.b(i4);
                    String strD = qVar3.d(i4);
                    if (l.U2("Warning", strB)) {
                        qVar2 = qVar3;
                        if (l.o3(strD, "1", false)) {
                        }
                        i4++;
                        qVar3 = qVar2;
                    } else {
                        qVar2 = qVar3;
                    }
                    if (l.U2("Content-Length", strB) || l.U2("Content-Encoding", strB) || l.U2("Content-Type", strB) || !e.B(strB) || qVar.a(strB) == null) {
                        pVar.a(strB, strD);
                    }
                    i4++;
                    qVar3 = qVar2;
                }
                int size2 = qVar.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String strB2 = qVar.b(i5);
                    if (!l.U2("Content-Length", strB2) && !l.U2("Content-Encoding", strB2) && !l.U2("Content-Type", strB2) && e.B(strB2)) {
                        pVar.a(strB2, qVar.d(i5));
                    }
                }
                a0VarE2.f4298f = pVar.b().c();
                a0VarE2.f4303k = b0VarB.f4317l;
                a0VarE2.f4304l = b0VarB.f4318m;
                b0 b0VarD2 = e.d(b0Var);
                a0.b("cacheResponse", b0VarD2);
                a0VarE2.f4301i = b0VarD2;
                b0 b0VarD3 = e.d(b0VarB);
                a0.b("networkResponse", b0VarD3);
                a0VarE2.f4300h = b0VarD3;
                a0VarE2.a();
                d0 d0Var = b0VarB.f4313h;
                h.X(d0Var);
                d0Var.close();
                h.X(null);
                throw null;
            }
            d0 d0Var2 = b0Var.f4313h;
            if (d0Var2 != null) {
                u3.b.c(d0Var2);
            }
        }
        a0 a0VarE3 = b0VarB.e();
        b0 b0VarD4 = e.d(b0Var);
        a0.b("cacheResponse", b0VarD4);
        a0VarE3.f4301i = b0VarD4;
        b0 b0VarD5 = e.d(b0VarB);
        a0.b("networkResponse", b0VarD5);
        a0VarE3.f4300h = b0VarD5;
        return a0VarE3.a();
    }
}
