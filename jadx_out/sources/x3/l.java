package x3;

import a4.b0;
import a4.c0;
import a4.g0;
import a4.t;
import a4.u;
import androidx.lifecycle.k0;
import f4.p;
import f4.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import t3.a0;
import t3.e0;
import t3.s;
import t3.w;
import t3.x;
import t3.y;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a4.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f4989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f4990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f4991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t3.o f4992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f4993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f4994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f4995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f4996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f5003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5004q;

    public l(m mVar, e0 e0Var) {
        c3.h.b0(mVar, "connectionPool");
        c3.h.b0(e0Var, "route");
        this.f4989b = e0Var;
        this.f5002o = 1;
        this.f5003p = new ArrayList();
        this.f5004q = Long.MAX_VALUE;
    }

    public static void d(w wVar, e0 e0Var, IOException iOException) {
        c3.h.b0(wVar, "client");
        c3.h.b0(e0Var, "failedRoute");
        c3.h.b0(iOException, "failure");
        if (e0Var.f4343b.type() != Proxy.Type.DIRECT) {
            t3.a aVar = e0Var.f4342a;
            aVar.f4289h.connectFailed(aVar.f4290i.h(), e0Var.f4343b.address(), iOException);
        }
        c.a aVar2 = wVar.f4477z;
        synchronized (aVar2) {
            ((Set) aVar2.f1137a).add(e0Var);
        }
    }

    @Override // a4.j
    public final synchronized void a(t tVar, g0 g0Var) {
        c3.h.b0(tVar, "connection");
        c3.h.b0(g0Var, "settings");
        this.f5002o = (g0Var.f144a & 16) != 0 ? g0Var.f145b[4] : Integer.MAX_VALUE;
    }

    @Override // a4.j
    public final void b(b0 b0Var) {
        c3.h.b0(b0Var, "stream");
        b0Var.c(a4.b.f83g, null);
    }

    public final void c(int i4, int i5, int i6, boolean z4, j jVar, t3.n nVar) throws Throwable {
        c3.h.b0(jVar, "call");
        c3.h.b0(nVar, "eventListener");
        if (this.f4993f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.f4989b.f4342a.f4292k;
        b bVar = new b(list);
        t3.a aVar = this.f4989b.f4342a;
        if (aVar.f4284c == null) {
            if (!list.contains(t3.i.f4380f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f4989b.f4342a.f4290i.f4423d;
            b4.l lVar = b4.l.f1135a;
            if (!b4.l.f1135a.h(str)) {
                throw new n(new UnknownServiceException(defpackage.a.g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f4291j.contains(x.f4482g)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar2 = null;
        while (true) {
            try {
                e0 e0Var = this.f4989b;
                if (e0Var.f4342a.f4284c == null || e0Var.f4343b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i4, i5, jVar, nVar);
                    } catch (IOException e5) {
                        e = e5;
                        Socket socket = this.f4991d;
                        if (socket != null) {
                            u3.b.d(socket);
                        }
                        Socket socket2 = this.f4990c;
                        if (socket2 != null) {
                            u3.b.d(socket2);
                        }
                        this.f4991d = null;
                        this.f4990c = null;
                        this.f4995h = null;
                        this.f4996i = null;
                        this.f4992e = null;
                        this.f4993f = null;
                        this.f4994g = null;
                        this.f5002o = 1;
                        e0 e0Var2 = this.f4989b;
                        InetSocketAddress inetSocketAddress = e0Var2.f4344c;
                        Proxy proxy = e0Var2.f4343b;
                        c3.h.b0(inetSocketAddress, "inetSocketAddress");
                        c3.h.b0(proxy, "proxy");
                        if (nVar2 == null) {
                            nVar2 = new n(e);
                        } else {
                            c3.h.F(nVar2.f5010b, e);
                            nVar2.f5011c = e;
                        }
                        if (!z4) {
                            throw nVar2;
                        }
                        bVar.f4934d = true;
                        if (!bVar.f4933c) {
                            throw nVar2;
                        }
                        if (e instanceof ProtocolException) {
                            throw nVar2;
                        }
                        if (e instanceof InterruptedIOException) {
                            throw nVar2;
                        }
                        if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw nVar2;
                        }
                        if (e instanceof SSLPeerUnverifiedException) {
                            throw nVar2;
                        }
                        if (!(e instanceof SSLException)) {
                            throw nVar2;
                        }
                    }
                } else {
                    f(i4, i5, i6, jVar, nVar);
                    if (this.f4990c == null) {
                        break;
                    }
                }
                g(bVar, jVar, nVar);
                e0 e0Var3 = this.f4989b;
                InetSocketAddress inetSocketAddress2 = e0Var3.f4344c;
                Proxy proxy2 = e0Var3.f4343b;
                c3.h.b0(inetSocketAddress2, "inetSocketAddress");
                c3.h.b0(proxy2, "proxy");
                break;
            } catch (IOException e6) {
                e = e6;
            }
        }
        e0 e0Var4 = this.f4989b;
        if (e0Var4.f4342a.f4284c != null && e0Var4.f4343b.type() == Proxy.Type.HTTP && this.f4990c == null) {
            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f5004q = System.nanoTime();
    }

    public final void e(int i4, int i5, j jVar, t3.n nVar) throws IOException {
        Socket socketCreateSocket;
        e0 e0Var = this.f4989b;
        Proxy proxy = e0Var.f4343b;
        t3.a aVar = e0Var.f4342a;
        Proxy.Type type = proxy.type();
        int i6 = type == null ? -1 : k.f4988a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            socketCreateSocket = aVar.f4283b.createSocket();
            c3.h.X(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f4990c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f4989b.f4344c;
        nVar.getClass();
        c3.h.b0(jVar, "call");
        c3.h.b0(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i5);
        try {
            b4.l lVar = b4.l.f1135a;
            b4.l.f1135a.e(socketCreateSocket, this.f4989b.f4344c, i4);
            try {
                this.f4995h = new q(r3.q.s(socketCreateSocket));
                this.f4996i = new p(r3.q.r(socketCreateSocket));
            } catch (NullPointerException e5) {
                if (c3.h.I(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4989b.f4344c);
            connectException.initCause(e6);
            throw connectException;
        }
    }

    public final void f(int i4, int i5, int i6, j jVar, t3.n nVar) throws IOException {
        int i7;
        char c5;
        y yVar = new y();
        e0 e0Var = this.f4989b;
        s sVar = e0Var.f4342a.f4290i;
        c3.h.b0(sVar, "url");
        yVar.f4486a = sVar;
        w wVar = null;
        yVar.d("CONNECT", null);
        t3.a aVar = e0Var.f4342a;
        boolean z4 = true;
        yVar.c("Host", u3.b.v(aVar.f4290i, true));
        yVar.c("Proxy-Connection", "Keep-Alive");
        yVar.c("User-Agent", "okhttp/4.12.0");
        i.w wVarB = yVar.b();
        a0 a0Var = new a0();
        a0Var.f4293a = wVarB;
        a0Var.f4294b = x.f4479d;
        a0Var.f4295c = 407;
        a0Var.f4296d = "Preemptive Authenticate";
        a0Var.f4299g = u3.b.f4763c;
        a0Var.f4303k = -1L;
        a0Var.f4304l = -1L;
        t3.p pVar = a0Var.f4298f;
        pVar.getClass();
        f2.e.f("Proxy-Authenticate");
        f2.e.g("OkHttp-Preemptive", "Proxy-Authenticate");
        pVar.c("Proxy-Authenticate");
        pVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        i.w wVarA = aVar.f4287f.a(e0Var, a0Var.a());
        if (wVarA != null) {
            wVarB = wVarA;
        }
        s sVar2 = (s) wVarB.f2808b;
        int i8 = 0;
        while (i8 < 21) {
            e(i4, i5, jVar, nVar);
            String str = "CONNECT " + u3.b.v(sVar2, z4) + " HTTP/1.1";
            while (true) {
                q qVar = this.f4995h;
                c3.h.X(qVar);
                p pVar2 = this.f4996i;
                c3.h.X(pVar2);
                z3.h hVar = new z3.h(wVar, this, qVar, pVar2);
                f4.y yVarB = qVar.f2187b.b();
                i7 = i8;
                long j4 = i5;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                yVarB.g(j4, timeUnit);
                pVar2.f2184b.b().g(i6, timeUnit);
                hVar.j((t3.q) wVarB.f2810d, str);
                hVar.a();
                a0 a0VarE = hVar.e(false);
                c3.h.X(a0VarE);
                a0VarE.f4293a = wVarB;
                t3.b0 b0VarA = a0VarE.a();
                long j5 = u3.b.j(b0VarA);
                if (j5 != -1) {
                    z3.e eVarI = hVar.i(j5);
                    u3.b.t(eVarI, Integer.MAX_VALUE, timeUnit);
                    eVarI.close();
                }
                int i9 = b0VarA.f4310e;
                if (i9 == 200) {
                    c5 = 407;
                    if (!qVar.f2188c.r() || !pVar2.f2185c.r()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    wVarB = null;
                    break;
                }
                c5 = 407;
                if (i9 != 407) {
                    throw new IOException(defpackage.a.e("Unexpected response code for CONNECT: ", i9));
                }
                i.w wVarA2 = aVar.f4287f.a(e0Var, b0VarA);
                if (wVarA2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (q3.l.U2("close", t3.b0.a(b0VarA, "Connection"))) {
                    wVarB = wVarA2;
                    break;
                }
                i5 = i5;
                wVarB = wVarA2;
                i8 = i7;
                wVar = null;
            }
            if (wVarB == null) {
                return;
            }
            Socket socket = this.f4990c;
            if (socket != null) {
                u3.b.d(socket);
            }
            this.f4990c = null;
            this.f4996i = null;
            this.f4995h = null;
            c3.h.b0(jVar, "call");
            c3.h.b0(e0Var.f4344c, "inetSocketAddress");
            c3.h.b0(e0Var.f4343b, "proxy");
            i8 = i7 + 1;
            wVar = null;
            z4 = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, j jVar, t3.n nVar) throws Throwable {
        t3.a aVar = this.f4989b.f4342a;
        SSLSocketFactory sSLSocketFactory = aVar.f4284c;
        x xVarS = x.f4479d;
        if (sSLSocketFactory == null) {
            List list = aVar.f4291j;
            x xVar = x.f4482g;
            if (!list.contains(xVar)) {
                this.f4991d = this.f4990c;
                this.f4993f = xVarS;
                return;
            } else {
                this.f4991d = this.f4990c;
                this.f4993f = xVar;
                l();
                return;
            }
        }
        nVar.getClass();
        c3.h.b0(jVar, "call");
        t3.a aVar2 = this.f4989b.f4342a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f4284c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            c3.h.X(sSLSocketFactory2);
            Socket socket = this.f4990c;
            s sVar = aVar2.f4290i;
            int i4 = 1;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, sVar.f4423d, sVar.f4424e, true);
            c3.h.Y(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                t3.i iVarA = bVar.a(sSLSocket2);
                if (iVarA.f4382b) {
                    b4.l lVar = b4.l.f1135a;
                    b4.l.f1135a.d(sSLSocket2, aVar2.f4290i.f4423d, aVar2.f4291j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                c3.h.a0(session, "sslSocketSession");
                t3.o oVarP = f2.e.p(session);
                HostnameVerifier hostnameVerifier = aVar2.f4285d;
                c3.h.X(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f4290i.f4423d, session)) {
                    t3.f fVar = aVar2.f4286e;
                    c3.h.X(fVar);
                    this.f4992e = new t3.o(oVarP.f4405a, oVarP.f4406b, oVarP.f4407c, new t3.e(fVar, oVarP, aVar2, i4));
                    fVar.a(aVar2.f4290i.f4423d, new k0(3, this));
                    if (iVarA.f4382b) {
                        b4.l lVar2 = b4.l.f1135a;
                        strF = b4.l.f1135a.f(sSLSocket2);
                    }
                    this.f4991d = sSLSocket2;
                    this.f4995h = new q(r3.q.s(sSLSocket2));
                    this.f4996i = new p(r3.q.r(sSLSocket2));
                    if (strF != null) {
                        xVarS = f2.e.s(strF);
                    }
                    this.f4993f = xVarS;
                    b4.l lVar3 = b4.l.f1135a;
                    b4.l.f1135a.a(sSLSocket2);
                    if (this.f4993f == x.f4481f) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = oVarP.a();
                if (!(!listA.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f4290i.f4423d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                c3.h.Y(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.f4290i.f4423d);
                sb.append(" not verified:\n              |    certificate: ");
                t3.f fVar2 = t3.f.f4345c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                f4.j jVar2 = f4.j.f2167e;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                c3.h.a0(encoded, "publicKey.encoded");
                sb2.append(a4.x.m(encoded).b("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List listA2 = e4.c.a(x509Certificate, 7);
                List listA3 = e4.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(listA3.size() + listA2.size());
                arrayList.addAll(listA2);
                arrayList.addAll(listA3);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(c3.h.G2(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    b4.l lVar4 = b4.l.f1135a;
                    b4.l.f1135a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    u3.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(t3.a aVar, List list) {
        t3.o oVar;
        c3.h.b0(aVar, "address");
        byte[] bArr = u3.b.f4761a;
        int i4 = 0;
        if (this.f5003p.size() < this.f5002o && !this.f4997j) {
            e0 e0Var = this.f4989b;
            if (!e0Var.f4342a.a(aVar)) {
                return false;
            }
            s sVar = aVar.f4290i;
            String str = sVar.f4423d;
            t3.a aVar2 = e0Var.f4342a;
            if (c3.h.I(str, aVar2.f4290i.f4423d)) {
                return true;
            }
            if (this.f4994g != null && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e0 e0Var2 = (e0) it.next();
                    Proxy.Type type = e0Var2.f4343b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && e0Var.f4343b.type() == type2) {
                        if (c3.h.I(e0Var.f4344c, e0Var2.f4344c)) {
                            if (aVar.f4285d == e4.c.f1995a) {
                                byte[] bArr2 = u3.b.f4761a;
                                s sVar2 = aVar2.f4290i;
                                if (sVar.f4424e != sVar2.f4424e) {
                                    break;
                                }
                                String str2 = sVar2.f4423d;
                                String str3 = sVar.f4423d;
                                if (!c3.h.I(str3, str2)) {
                                    if (!this.f4998k && (oVar = this.f4992e) != null) {
                                        List listA = oVar.a();
                                        if (!(!listA.isEmpty())) {
                                            break;
                                        }
                                        Object obj = listA.get(0);
                                        c3.h.Y(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        if (!e4.c.c(str3, (X509Certificate) obj)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    t3.f fVar = aVar.f4286e;
                                    c3.h.X(fVar);
                                    t3.o oVar2 = this.f4992e;
                                    c3.h.X(oVar2);
                                    List listA2 = oVar2.a();
                                    c3.h.b0(str3, "hostname");
                                    c3.h.b0(listA2, "peerCertificates");
                                    fVar.a(str3, new t3.e(fVar, listA2, str3, i4));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z4) {
        long j4;
        byte[] bArr = u3.b.f4761a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f4990c;
        c3.h.X(socket);
        Socket socket2 = this.f4991d;
        c3.h.X(socket2);
        q qVar = this.f4995h;
        c3.h.X(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t tVar = this.f4994g;
        if (tVar != null) {
            synchronized (tVar) {
                if (tVar.f190h) {
                    return false;
                }
                return tVar.f199q >= tVar.f198p || jNanoTime < tVar.f200r;
            }
        }
        synchronized (this) {
            j4 = jNanoTime - this.f5004q;
        }
        if (j4 < 10000000000L || !z4) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !qVar.r();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final y3.d j(w wVar, y3.f fVar) {
        Socket socket = this.f4991d;
        c3.h.X(socket);
        q qVar = this.f4995h;
        c3.h.X(qVar);
        p pVar = this.f4996i;
        c3.h.X(pVar);
        t tVar = this.f4994g;
        if (tVar != null) {
            return new u(wVar, this, fVar, tVar);
        }
        int i4 = fVar.f5421g;
        socket.setSoTimeout(i4);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f2187b.b().g(i4, timeUnit);
        pVar.f2184b.b().g(fVar.f5422h, timeUnit);
        return new z3.h(wVar, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f4997j = true;
    }

    public final void l() throws SocketException {
        String strConcat;
        int i4;
        Socket socket = this.f4991d;
        c3.h.X(socket);
        q qVar = this.f4995h;
        c3.h.X(qVar);
        p pVar = this.f4996i;
        c3.h.X(pVar);
        int i5 = 0;
        socket.setSoTimeout(0);
        w3.f fVar = w3.f.f4914i;
        a4.h hVar = new a4.h(fVar);
        String str = this.f4989b.f4342a.f4290i.f4423d;
        c3.h.b0(str, "peerName");
        hVar.f148c = socket;
        if (hVar.f146a) {
            strConcat = u3.b.f4767g + ' ' + str;
        } else {
            strConcat = "MockWebServer ".concat(str);
        }
        c3.h.b0(strConcat, "<set-?>");
        hVar.f149d = strConcat;
        hVar.f150e = qVar;
        hVar.f151f = pVar;
        hVar.f152g = this;
        hVar.f154i = 0;
        t tVar = new t(hVar);
        this.f4994g = tVar;
        g0 g0Var = t.C;
        this.f5002o = (g0Var.f144a & 16) != 0 ? g0Var.f145b[4] : Integer.MAX_VALUE;
        c0 c0Var = tVar.f208z;
        synchronized (c0Var) {
            try {
                if (c0Var.f115f) {
                    throw new IOException("closed");
                }
                if (c0Var.f112c) {
                    Logger logger = c0.f110h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(u3.b.h(">> CONNECTION " + a4.g.f140a.d(), new Object[0]));
                    }
                    c0Var.f111b.g(a4.g.f140a);
                    c0Var.f111b.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0 c0Var2 = tVar.f208z;
        g0 g0Var2 = tVar.f201s;
        synchronized (c0Var2) {
            try {
                c3.h.b0(g0Var2, "settings");
                if (c0Var2.f115f) {
                    throw new IOException("closed");
                }
                c0Var2.h(0, Integer.bitCount(g0Var2.f144a) * 6, 4, 0);
                int i6 = 0;
                while (i6 < 10) {
                    if (((1 << i6) & g0Var2.f144a) != 0) {
                        if (i6 != 4) {
                            i4 = i6 != 7 ? i6 : 4;
                        } else {
                            i4 = 3;
                        }
                        c0Var2.f111b.v(i4);
                        c0Var2.f111b.d(g0Var2.f145b[i6]);
                    }
                    i6++;
                }
                c0Var2.f111b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = tVar.f201s.a();
        if (iA != 65535) {
            tVar.f208z.C(0, iA - 65535);
        }
        fVar.f().c(new w3.b(i5, tVar.A, tVar.f187e), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        e0 e0Var = this.f4989b;
        sb.append(e0Var.f4342a.f4290i.f4423d);
        sb.append(':');
        sb.append(e0Var.f4342a.f4290i.f4424e);
        sb.append(", proxy=");
        sb.append(e0Var.f4343b);
        sb.append(" hostAddress=");
        sb.append(e0Var.f4344c);
        sb.append(" cipherSuite=");
        t3.o oVar = this.f4992e;
        if (oVar == null || (obj = oVar.f4406b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f4993f);
        sb.append('}');
        return sb.toString();
    }
}
