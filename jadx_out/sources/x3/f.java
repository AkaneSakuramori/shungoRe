package x3;

import a4.h0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import t3.e0;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3.a f4956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f4957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t3.n f4958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.i f4959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f4960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f4964j;

    public f(m mVar, t3.a aVar, j jVar, t3.n nVar) {
        c3.h.b0(mVar, "connectionPool");
        c3.h.b0(nVar, "eventListener");
        this.f4955a = mVar;
        this.f4956b = aVar;
        this.f4957c = jVar;
        this.f4958d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0266  */
    /* JADX WARN: Code duplicated, block: B:117:0x0280  */
    /* JADX WARN: Code duplicated, block: B:119:0x028c  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0316  */
    /* JADX WARN: Code duplicated, block: B:169:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0317 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    public final l a(int i4, int i5, int i6, boolean z4, boolean z5) throws IOException {
        e0 e0Var;
        e.i iVar;
        o oVar;
        ArrayList arrayList;
        e.i iVar2;
        ArrayList arrayList2;
        boolean z6;
        t3.a aVar;
        Proxy proxy;
        String hostAddress;
        int port;
        List listU1;
        boolean zContains;
        l lVar;
        c.a aVar2;
        e0 e0Var2;
        e.i iVar3;
        o oVar2;
        Socket socketJ;
        while (!this.f4957c.f4985q) {
            l lVar2 = this.f4957c.f4979k;
            if (lVar2 != null) {
                synchronized (lVar2) {
                    try {
                        socketJ = (lVar2.f4997j || !b(lVar2.f4989b.f4342a.f4290i)) ? this.f4957c.j() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f4957c.f4979k == null) {
                    if (socketJ != null) {
                        u3.b.d(socketJ);
                    }
                    t3.n nVar = this.f4958d;
                    j jVar = this.f4957c;
                    nVar.getClass();
                    c3.h.b0(jVar, "call");
                    this.f4961g = 0;
                    this.f4962h = 0;
                    this.f4963i = 0;
                    if (this.f4955a.a(this.f4956b, this.f4957c, null, false)) {
                        lVar2 = this.f4957c.f4979k;
                        c3.h.X(lVar2);
                        t3.n nVar2 = this.f4958d;
                        j jVar2 = this.f4957c;
                        nVar2.getClass();
                        c3.h.b0(jVar2, "call");
                    } else {
                        e0Var = this.f4964j;
                        try {
                            if (e0Var != null) {
                                this.f4964j = null;
                            } else {
                                iVar = this.f4959e;
                                if (iVar == null && iVar.b()) {
                                    e.i iVar4 = this.f4959e;
                                    c3.h.X(iVar4);
                                    if (!iVar4.b()) {
                                        throw new NoSuchElementException();
                                    }
                                    List list = (List) iVar4.f1879c;
                                    int i7 = iVar4.f1878b;
                                    iVar4.f1878b = i7 + 1;
                                    e0Var = (e0) list.get(i7);
                                } else {
                                    oVar = this.f4960f;
                                    if (oVar == null) {
                                        t3.a aVar3 = this.f4956b;
                                        j jVar3 = this.f4957c;
                                        oVar = new o(aVar3, jVar3.f4970b.f4477z, jVar3, this.f4958d);
                                        this.f4960f = oVar;
                                    }
                                    if (oVar.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (oVar.f5017f < oVar.f5016e.size()) {
                                        if (oVar.f5017f < oVar.f5016e.size()) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        aVar = oVar.f5012a;
                                        if (z6) {
                                            throw new SocketException("No route to " + aVar.f4290i.f4423d + "; exhausted proxy configurations: " + oVar.f5016e);
                                        }
                                        List list2 = oVar.f5016e;
                                        int i8 = oVar.f5017f;
                                        oVar.f5017f = i8 + 1;
                                        proxy = (Proxy) list2.get(i8);
                                        ArrayList arrayList3 = new ArrayList();
                                        oVar.f5018g = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            s sVar = aVar.f4290i;
                                            hostAddress = sVar.f4423d;
                                            port = sVar.f4424e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            c3.h.a0(socketAddressAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                c3.h.a0(hostAddress, "hostName");
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                c3.h.a0(hostAddress, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = u3.b.f4761a;
                                            c3.h.b0(hostAddress, "<this>");
                                            if (u3.b.f4766f.a(hostAddress)) {
                                                listU1 = c3.h.u1(InetAddress.getByName(hostAddress));
                                            } else {
                                                oVar.f5015d.getClass();
                                                c3.h.b0(oVar.f5014c, "call");
                                                List listB = ((t3.n) aVar.f4282a).b(hostAddress);
                                                if (listB.isEmpty()) {
                                                    throw new UnknownHostException(aVar.f4282a + " returned no addresses for " + hostAddress);
                                                }
                                                listU1 = listB;
                                            }
                                            Iterator it = listU1.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = oVar.f5018g.iterator();
                                        while (it2.hasNext()) {
                                            e0 e0Var3 = new e0(oVar.f5012a, proxy, (InetSocketAddress) it2.next());
                                            c.a aVar4 = oVar.f5013b;
                                            synchronized (aVar4) {
                                                zContains = ((Set) aVar4.f1137a).contains(e0Var3);
                                            }
                                            if (zContains) {
                                                oVar.f5019h.add(e0Var3);
                                            } else {
                                                arrayList.add(e0Var3);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        a3.l.e3(oVar.f5019h, arrayList);
                                        oVar.f5019h.clear();
                                    }
                                    iVar2 = new e.i(arrayList);
                                    this.f4959e = iVar2;
                                    arrayList2 = arrayList;
                                    if (!this.f4957c.f4985q) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, false)) {
                                        lVar2 = this.f4957c.f4979k;
                                        c3.h.X(lVar2);
                                        t3.n nVar3 = this.f4958d;
                                        j jVar4 = this.f4957c;
                                        nVar3.getClass();
                                        c3.h.b0(jVar4, "call");
                                    } else {
                                        if (iVar2.b()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i9 = iVar2.f1878b;
                                        iVar2.f1878b = i9 + 1;
                                        e0Var = (e0) arrayList.get(i9);
                                        lVar = new l(this.f4955a, e0Var);
                                        this.f4957c.f4987s = lVar;
                                        lVar.c(i4, i5, i6, z4, this.f4957c, this.f4958d);
                                        this.f4957c.f4987s = null;
                                        aVar2 = this.f4957c.f4970b.f4477z;
                                        e0Var2 = lVar.f4989b;
                                        synchronized (aVar2) {
                                            c3.h.b0(e0Var2, "route");
                                            ((Set) aVar2.f1137a).remove(e0Var2);
                                        }
                                        if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, true)) {
                                            l lVar3 = this.f4957c.f4979k;
                                            c3.h.X(lVar3);
                                            this.f4964j = e0Var;
                                            Socket socket = lVar.f4991d;
                                            c3.h.X(socket);
                                            u3.b.d(socket);
                                            t3.n nVar4 = this.f4958d;
                                            j jVar5 = this.f4957c;
                                            nVar4.getClass();
                                            c3.h.b0(jVar5, "call");
                                            lVar2 = lVar3;
                                        } else {
                                            synchronized (lVar) {
                                                m mVar = this.f4955a;
                                                mVar.getClass();
                                                byte[] bArr2 = u3.b.f4761a;
                                                mVar.f5009e.add(lVar);
                                                mVar.f5007c.c(mVar.f5008d, 0L);
                                                this.f4957c.b(lVar);
                                            }
                                            t3.n nVar5 = this.f4958d;
                                            j jVar6 = this.f4957c;
                                            nVar5.getClass();
                                            c3.h.b0(jVar6, "call");
                                            lVar2 = lVar;
                                        }
                                    }
                                }
                            }
                            lVar.c(i4, i5, i6, z4, this.f4957c, this.f4958d);
                            this.f4957c.f4987s = null;
                            aVar2 = this.f4957c.f4970b.f4477z;
                            e0Var2 = lVar.f4989b;
                            synchronized (aVar2) {
                                c3.h.b0(e0Var2, "route");
                                ((Set) aVar2.f1137a).remove(e0Var2);
                                if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, true)) {
                                    l lVar4 = this.f4957c.f4979k;
                                    c3.h.X(lVar4);
                                    this.f4964j = e0Var;
                                    Socket socket2 = lVar.f4991d;
                                    c3.h.X(socket2);
                                    u3.b.d(socket2);
                                    t3.n nVar6 = this.f4958d;
                                    j jVar7 = this.f4957c;
                                    nVar6.getClass();
                                    c3.h.b0(jVar7, "call");
                                    lVar2 = lVar4;
                                } else {
                                    synchronized (lVar) {
                                        m mVar2 = this.f4955a;
                                        mVar2.getClass();
                                        byte[] bArr3 = u3.b.f4761a;
                                        mVar2.f5009e.add(lVar);
                                        mVar2.f5007c.c(mVar2.f5008d, 0L);
                                        this.f4957c.b(lVar);
                                        t3.n nVar7 = this.f4958d;
                                        j jVar8 = this.f4957c;
                                        nVar7.getClass();
                                        c3.h.b0(jVar8, "call");
                                        lVar2 = lVar;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f4957c.f4987s = null;
                            throw th2;
                        }
                        arrayList2 = null;
                        lVar = new l(this.f4955a, e0Var);
                        this.f4957c.f4987s = lVar;
                    }
                } else if (socketJ != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.f4961g = 0;
                this.f4962h = 0;
                this.f4963i = 0;
                if (this.f4955a.a(this.f4956b, this.f4957c, null, false)) {
                    lVar2 = this.f4957c.f4979k;
                    c3.h.X(lVar2);
                    t3.n nVar8 = this.f4958d;
                    j jVar9 = this.f4957c;
                    nVar8.getClass();
                    c3.h.b0(jVar9, "call");
                } else {
                    e0Var = this.f4964j;
                    if (e0Var != null) {
                        this.f4964j = null;
                    } else {
                        iVar = this.f4959e;
                        if (iVar == null) {
                        }
                        oVar = this.f4960f;
                        if (oVar == null) {
                            t3.a aVar5 = this.f4956b;
                            j jVar10 = this.f4957c;
                            oVar = new o(aVar5, jVar10.f4970b.f4477z, jVar10, this.f4958d);
                            this.f4960f = oVar;
                        }
                        if (oVar.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (oVar.f5017f < oVar.f5016e.size()) {
                            if (oVar.f5017f < oVar.f5016e.size()) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            aVar = oVar.f5012a;
                            if (z6) {
                                throw new SocketException("No route to " + aVar.f4290i.f4423d + "; exhausted proxy configurations: " + oVar.f5016e);
                            }
                            List list3 = oVar.f5016e;
                            int i10 = oVar.f5017f;
                            oVar.f5017f = i10 + 1;
                            proxy = (Proxy) list3.get(i10);
                            ArrayList arrayList4 = new ArrayList();
                            oVar.f5018g = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                s sVar2 = aVar.f4290i;
                                hostAddress = sVar2.f4423d;
                                port = sVar2.f4424e;
                            } else {
                                s sVar3 = aVar.f4290i;
                                hostAddress = sVar3.f4423d;
                                port = sVar3.f4424e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            a3.l.e3(oVar.f5019h, arrayList);
                            oVar.f5019h.clear();
                        }
                        iVar2 = new e.i(arrayList);
                        this.f4959e = iVar2;
                        arrayList2 = arrayList;
                        if (!this.f4957c.f4985q) {
                            throw new IOException("Canceled");
                        }
                        if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, false)) {
                            lVar2 = this.f4957c.f4979k;
                            c3.h.X(lVar2);
                            t3.n nVar9 = this.f4958d;
                            j jVar11 = this.f4957c;
                            nVar9.getClass();
                            c3.h.b0(jVar11, "call");
                        } else {
                            if (iVar2.b()) {
                                throw new NoSuchElementException();
                            }
                            int i11 = iVar2.f1878b;
                            iVar2.f1878b = i11 + 1;
                            e0Var = (e0) arrayList.get(i11);
                            lVar = new l(this.f4955a, e0Var);
                            this.f4957c.f4987s = lVar;
                            lVar.c(i4, i5, i6, z4, this.f4957c, this.f4958d);
                            this.f4957c.f4987s = null;
                            aVar2 = this.f4957c.f4970b.f4477z;
                            e0Var2 = lVar.f4989b;
                            synchronized (aVar2) {
                                c3.h.b0(e0Var2, "route");
                                ((Set) aVar2.f1137a).remove(e0Var2);
                                if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, true)) {
                                    l lVar5 = this.f4957c.f4979k;
                                    c3.h.X(lVar5);
                                    this.f4964j = e0Var;
                                    Socket socket3 = lVar.f4991d;
                                    c3.h.X(socket3);
                                    u3.b.d(socket3);
                                    t3.n nVar10 = this.f4958d;
                                    j jVar12 = this.f4957c;
                                    nVar10.getClass();
                                    c3.h.b0(jVar12, "call");
                                    lVar2 = lVar5;
                                } else {
                                    synchronized (lVar) {
                                        m mVar3 = this.f4955a;
                                        mVar3.getClass();
                                        byte[] bArr4 = u3.b.f4761a;
                                        mVar3.f5009e.add(lVar);
                                        mVar3.f5007c.c(mVar3.f5008d, 0L);
                                        this.f4957c.b(lVar);
                                        t3.n nVar11 = this.f4958d;
                                        j jVar13 = this.f4957c;
                                        nVar11.getClass();
                                        c3.h.b0(jVar13, "call");
                                        lVar2 = lVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList2 = null;
                    lVar = new l(this.f4955a, e0Var);
                    this.f4957c.f4987s = lVar;
                    lVar.c(i4, i5, i6, z4, this.f4957c, this.f4958d);
                    this.f4957c.f4987s = null;
                    aVar2 = this.f4957c.f4970b.f4477z;
                    e0Var2 = lVar.f4989b;
                    synchronized (aVar2) {
                        c3.h.b0(e0Var2, "route");
                        ((Set) aVar2.f1137a).remove(e0Var2);
                        if (this.f4955a.a(this.f4956b, this.f4957c, arrayList2, true)) {
                            l lVar6 = this.f4957c.f4979k;
                            c3.h.X(lVar6);
                            this.f4964j = e0Var;
                            Socket socket4 = lVar.f4991d;
                            c3.h.X(socket4);
                            u3.b.d(socket4);
                            t3.n nVar12 = this.f4958d;
                            j jVar14 = this.f4957c;
                            nVar12.getClass();
                            c3.h.b0(jVar14, "call");
                            lVar2 = lVar6;
                        } else {
                            synchronized (lVar) {
                                m mVar4 = this.f4955a;
                                mVar4.getClass();
                                byte[] bArr5 = u3.b.f4761a;
                                mVar4.f5009e.add(lVar);
                                mVar4.f5007c.c(mVar4.f5008d, 0L);
                                this.f4957c.b(lVar);
                                t3.n nVar13 = this.f4958d;
                                j jVar15 = this.f4957c;
                                nVar13.getClass();
                                c3.h.b0(jVar15, "call");
                                lVar2 = lVar;
                            }
                        }
                    }
                }
            }
            if (lVar2.i(z5)) {
                return lVar2;
            }
            lVar2.k();
            if (this.f4964j == null && (iVar3 = this.f4959e) != null && !iVar3.b() && (oVar2 = this.f4960f) != null && !oVar2.a()) {
                throw new IOException("exhausted all routes");
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(s sVar) {
        c3.h.b0(sVar, "url");
        s sVar2 = this.f4956b.f4290i;
        return sVar.f4424e == sVar2.f4424e && c3.h.I(sVar.f4423d, sVar2.f4423d);
    }

    public final void c(IOException iOException) {
        c3.h.b0(iOException, "e");
        this.f4964j = null;
        if (iOException instanceof h0) {
            if (((h0) iOException).f155b == a4.b.f83g) {
                this.f4961g++;
                return;
            }
        }
        if (iOException instanceof a4.a) {
            this.f4962h++;
        } else {
            this.f4963i++;
        }
    }
}
