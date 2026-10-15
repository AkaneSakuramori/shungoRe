package z3;

import f4.i;
import f4.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import t3.a0;
import t3.b0;
import t3.q;
import t3.s;
import t3.w;
import t3.x;
import t3.z;
import x3.l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f5530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f5532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f4.h f5533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f5536g;

    public h(w wVar, l lVar, i iVar, f4.h hVar) {
        c3.h.b0(lVar, "connection");
        this.f5530a = wVar;
        this.f5531b = lVar;
        this.f5532c = iVar;
        this.f5533d = hVar;
        this.f5535f = new a(iVar);
    }

    @Override // y3.d
    public final void a() {
        this.f5533d.flush();
    }

    @Override // y3.d
    public final void b() {
        this.f5533d.flush();
    }

    @Override // y3.d
    public final u c(i.w wVar, long j4) {
        z zVar = (z) wVar.f2811e;
        if (zVar != null) {
            zVar.getClass();
        }
        if (q3.l.U2("chunked", ((q) wVar.f2810d).a("Transfer-Encoding"))) {
            if (this.f5534e == 1) {
                this.f5534e = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f5534e).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f5534e == 1) {
            this.f5534e = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f5534e).toString());
    }

    @Override // y3.d
    public final void cancel() {
        Socket socket = this.f5531b.f4990c;
        if (socket != null) {
            u3.b.d(socket);
        }
    }

    @Override // y3.d
    public final f4.w d(b0 b0Var) {
        if (!y3.e.a(b0Var)) {
            return i(0L);
        }
        if (q3.l.U2("chunked", b0.a(b0Var, "Transfer-Encoding"))) {
            s sVar = (s) b0Var.f4307b.f2808b;
            if (this.f5534e == 4) {
                this.f5534e = 5;
                return new d(this, sVar);
            }
            throw new IllegalStateException(("state: " + this.f5534e).toString());
        }
        long j4 = u3.b.j(b0Var);
        if (j4 != -1) {
            return i(j4);
        }
        if (this.f5534e == 4) {
            this.f5534e = 5;
            this.f5531b.k();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f5534e).toString());
    }

    @Override // y3.d
    public final a0 e(boolean z4) {
        a aVar = this.f5535f;
        int i4 = this.f5534e;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(("state: " + this.f5534e).toString());
        }
        try {
            String strN = aVar.f5512a.n(aVar.f5513b);
            aVar.f5513b -= (long) strN.length();
            y3.h hVarH = f2.e.H(strN);
            int i5 = hVarH.f5426b;
            a0 a0Var = new a0();
            x xVar = hVarH.f5425a;
            c3.h.b0(xVar, "protocol");
            a0Var.f4294b = xVar;
            a0Var.f4295c = i5;
            String str = hVarH.f5427c;
            c3.h.b0(str, "message");
            a0Var.f4296d = str;
            a0Var.f4298f = aVar.a().c();
            if (z4 && i5 == 100) {
                return null;
            }
            if (i5 == 100) {
                this.f5534e = 3;
                return a0Var;
            }
            if (102 > i5 || i5 >= 200) {
                this.f5534e = 4;
                return a0Var;
            }
            this.f5534e = 3;
            return a0Var;
        } catch (EOFException e5) {
            throw new IOException("unexpected end of stream on " + this.f5531b.f4989b.f4342a.f4290i.g(), e5);
        }
    }

    @Override // y3.d
    public final long f(b0 b0Var) {
        if (!y3.e.a(b0Var)) {
            return 0L;
        }
        if (q3.l.U2("chunked", b0.a(b0Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return u3.b.j(b0Var);
    }

    @Override // y3.d
    public final void g(i.w wVar) {
        Proxy.Type type = this.f5531b.f4989b.f4343b.type();
        c3.h.a0(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) wVar.f2809c);
        sb.append(' ');
        Object obj = wVar.f2808b;
        if (((s) obj).f4428i || type != Proxy.Type.HTTP) {
            sb.append(c3.h.h2((s) obj));
        } else {
            sb.append((s) obj);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
        j((q) wVar.f2810d, string);
    }

    @Override // y3.d
    public final l h() {
        return this.f5531b;
    }

    public final e i(long j4) {
        if (this.f5534e == 4) {
            this.f5534e = 5;
            return new e(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f5534e).toString());
    }

    public final void j(q qVar, String str) {
        c3.h.b0(qVar, "headers");
        c3.h.b0(str, "requestLine");
        if (this.f5534e != 0) {
            throw new IllegalStateException(("state: " + this.f5534e).toString());
        }
        f4.h hVar = this.f5533d;
        hVar.m(str).m("\r\n");
        int size = qVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            hVar.m(qVar.b(i4)).m(": ").m(qVar.d(i4)).m("\r\n");
        }
        hVar.m("\r\n");
        this.f5534e = 1;
    }
}
