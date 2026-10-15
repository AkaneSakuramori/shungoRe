package y3;

import a3.p;
import e.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import t3.a0;
import t3.b0;
import t3.d0;
import t3.e0;
import t3.r;
import t3.s;
import t3.t;
import t3.w;
import t3.y;
import t3.z;
import x3.j;
import x3.l;
import x3.m;
import x3.n;
import x3.o;

/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f5424a;

    public g(w wVar) {
        c3.h.b0(wVar, "client");
        this.f5424a = wVar;
    }

    public static int d(b0 b0Var, int i4) {
        String strA = b0.a(b0Var, "Retry-After");
        if (strA == null) {
            return i4;
        }
        if (!new q3.f("\\d+").a(strA)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        c3.h.a0(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // t3.t
    public final b0 a(f fVar) {
        SSLSocketFactory sSLSocketFactory;
        e4.c cVar;
        t3.f fVar2;
        i.w wVar = fVar.f5419e;
        j jVar = fVar.f5415a;
        boolean z4 = true;
        List listH3 = p.f75b;
        b0 b0Var = null;
        int i4 = 0;
        i.w wVarB = wVar;
        boolean z5 = true;
        while (true) {
            jVar.getClass();
            c3.h.b0(wVarB, "request");
            if (jVar.f4981m != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (jVar) {
                try {
                    if (!(jVar.f4983o ^ z4)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                    if (!(jVar.f4982n ^ z4)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z5) {
                m mVar = jVar.f4973e;
                s sVar = (s) wVarB.f2808b;
                boolean z6 = sVar.f4428i;
                w wVar2 = jVar.f4970b;
                if (z6) {
                    SSLSocketFactory sSLSocketFactory2 = wVar2.f4467p;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    e4.c cVar2 = wVar2.f4471t;
                    fVar2 = wVar2.f4472u;
                    sSLSocketFactory = sSLSocketFactory2;
                    cVar = cVar2;
                } else {
                    sSLSocketFactory = null;
                    cVar = null;
                    fVar2 = null;
                }
                jVar.f4978j = new x3.f(mVar, new t3.a(sVar.f4423d, sVar.f4424e, wVar2.f4463l, wVar2.f4466o, sSLSocketFactory, cVar, fVar2, wVar2.f4465n, wVar2.f4470s, wVar2.f4469r, wVar2.f4464m), jVar, jVar.f4974f);
            }
            try {
                if (jVar.f4985q) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        b0 b0VarB = fVar.b(wVarB);
                        if (b0Var != null) {
                            a0 a0VarE = b0VarB.e();
                            a0 a0VarE2 = b0Var.e();
                            a0VarE2.f4299g = null;
                            b0 b0VarA = a0VarE2.a();
                            if (b0VarA.f4313h != null) {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                            a0VarE.f4302j = b0VarA;
                            b0VarB = a0VarE.a();
                        }
                        b0Var = b0VarB;
                        x3.e eVar = jVar.f4981m;
                        wVarB = b(b0Var, eVar);
                        if (wVarB == null) {
                            if (eVar != null && eVar.f4952e) {
                                if (!(!jVar.f4980l)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                jVar.f4980l = true;
                                jVar.f4975g.i();
                            }
                            jVar.f(false);
                            return b0Var;
                        }
                        d0 d0Var = b0Var.f4313h;
                        if (d0Var != null) {
                            u3.b.c(d0Var);
                        }
                        i4++;
                        if (i4 > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i4);
                        }
                        jVar.f(true);
                        listH3 = listH3;
                        z5 = true;
                        z4 = true;
                    } catch (n e5) {
                        List list = listH3;
                        if (!c(e5.f5011c, jVar, wVarB, false)) {
                            IOException iOException = e5.f5010b;
                            c3.h.b0(iOException, "<this>");
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                c3.h.F(iOException, (Exception) it.next());
                            }
                            throw iOException;
                        }
                        listH3 = a3.n.h3(list, e5.f5010b);
                        jVar.f(true);
                        z4 = true;
                        z5 = false;
                        i4 = i4;
                    }
                } catch (IOException e6) {
                    if (!c(e6, jVar, wVarB, !(e6 instanceof a4.a))) {
                        Iterator it2 = listH3.iterator();
                        while (it2.hasNext()) {
                            c3.h.F(e6, (Exception) it2.next());
                        }
                        throw e6;
                    }
                    listH3 = a3.n.h3(listH3, e6);
                    jVar.f(true);
                    z4 = true;
                    i4 = i4;
                    z5 = false;
                }
            } catch (Throwable th2) {
                jVar.f(true);
                throw th2;
            }
        }
    }

    public final i.w b(b0 b0Var, x3.e eVar) throws ProtocolException {
        String strA;
        r rVar;
        l lVar;
        e0 e0Var = (eVar == null || (lVar = eVar.f4954g) == null) ? null : lVar.f4989b;
        int i4 = b0Var.f4310e;
        String str = (String) b0Var.f4307b.f2809c;
        if (i4 != 307 && i4 != 308) {
            if (i4 == 401) {
                this.f5424a.f4459h.getClass();
                return null;
            }
            if (i4 == 421) {
                if (eVar == null || !(!c3.h.I(eVar.f4950c.f4956b.f4290i.f4423d, eVar.f4954g.f4989b.f4342a.f4290i.f4423d))) {
                    return null;
                }
                l lVar2 = eVar.f4954g;
                synchronized (lVar2) {
                    lVar2.f4998k = true;
                }
                return b0Var.f4307b;
            }
            if (i4 == 503) {
                b0 b0Var2 = b0Var.f4316k;
                if ((b0Var2 == null || b0Var2.f4310e != 503) && d(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.f4307b;
                }
                return null;
            }
            if (i4 == 407) {
                c3.h.X(e0Var);
                if (e0Var.f4343b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.f5424a.f4465n.getClass();
                return null;
            }
            if (i4 == 408) {
                if (!this.f5424a.f4458g) {
                    return null;
                }
                b0 b0Var3 = b0Var.f4316k;
                if ((b0Var3 == null || b0Var3.f4310e != 408) && d(b0Var, 0) <= 0) {
                    return b0Var.f4307b;
                }
                return null;
            }
            switch (i4) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        w wVar = this.f5424a;
        if (!wVar.f4460i || (strA = b0.a(b0Var, "Location")) == null) {
            return null;
        }
        i.w wVar2 = b0Var.f4307b;
        s sVar = (s) wVar2.f2808b;
        sVar.getClass();
        try {
            rVar = new r();
            rVar.c(sVar, strA);
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        s sVarB = rVar != null ? rVar.b() : null;
        if (sVarB == null) {
            return null;
        }
        if (!c3.h.I(sVarB.f4420a, ((s) wVar2.f2808b).f4420a) && !wVar.f4461j) {
            return null;
        }
        y yVarF = wVar2.f();
        if (c3.h.T1(str)) {
            boolean zI = c3.h.I(str, "PROPFIND");
            int i5 = b0Var.f4310e;
            boolean z4 = zI || i5 == 308 || i5 == 307;
            if (!(true ^ c3.h.I(str, "PROPFIND")) || i5 == 308 || i5 == 307) {
                yVarF.d(str, z4 ? (z) wVar2.f2811e : null);
            } else {
                yVarF.d("GET", null);
            }
            if (!z4) {
                yVarF.f4488c.c("Transfer-Encoding");
                yVarF.f4488c.c("Content-Length");
                yVarF.f4488c.c("Content-Type");
            }
        }
        if (!u3.b.a((s) wVar2.f2808b, sVarB)) {
            yVarF.f4488c.c("Authorization");
        }
        yVarF.f4486a = sVarB;
        return yVarF.b();
    }

    public final boolean c(IOException iOException, j jVar, i.w wVar, boolean z4) {
        o oVar;
        l lVar;
        if (!this.f5424a.f4458g) {
            return false;
        }
        if ((z4 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z4)) {
            return false;
        }
        x3.f fVar = jVar.f4978j;
        c3.h.X(fVar);
        int i4 = fVar.f4961g;
        if (i4 != 0 || fVar.f4962h != 0 || fVar.f4963i != 0) {
            if (fVar.f4964j == null) {
                e0 e0Var = null;
                if (i4 <= 1 && fVar.f4962h <= 1 && fVar.f4963i <= 0 && (lVar = fVar.f4957c.f4979k) != null) {
                    synchronized (lVar) {
                        if (lVar.f4999l == 0 && u3.b.a(lVar.f4989b.f4342a.f4290i, fVar.f4956b.f4290i)) {
                            e0Var = lVar.f4989b;
                        }
                    }
                }
                if (e0Var != null) {
                    fVar.f4964j = e0Var;
                } else {
                    i iVar = fVar.f4959e;
                    if ((iVar == null || !iVar.b()) && (oVar = fVar.f4960f) != null && !oVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
