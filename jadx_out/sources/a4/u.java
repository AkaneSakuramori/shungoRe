package a4;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u implements y3.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f209g = u3.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f210h = u3.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.l f211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.f f212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b0 f214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t3.x f215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f216f;

    public u(t3.w wVar, x3.l lVar, y3.f fVar, t tVar) {
        c3.h.b0(lVar, "connection");
        this.f211a = lVar;
        this.f212b = fVar;
        this.f213c = tVar;
        t3.x xVar = t3.x.f4482g;
        this.f215e = wVar.f4470s.contains(xVar) ? xVar : t3.x.f4481f;
    }

    @Override // y3.d
    public final void a() throws IOException {
        b0 b0Var = this.f214d;
        c3.h.X(b0Var);
        b0Var.f().close();
    }

    @Override // y3.d
    public final void b() {
        this.f213c.flush();
    }

    @Override // y3.d
    public final f4.u c(i.w wVar, long j4) {
        b0 b0Var = this.f214d;
        c3.h.X(b0Var);
        return b0Var.f();
    }

    @Override // y3.d
    public final void cancel() {
        this.f216f = true;
        b0 b0Var = this.f214d;
        if (b0Var != null) {
            b0Var.e(b.f84h);
        }
    }

    @Override // y3.d
    public final f4.w d(t3.b0 b0Var) {
        b0 b0Var2 = this.f214d;
        c3.h.X(b0Var2);
        return b0Var2.f95i;
    }

    @Override // y3.d
    public final t3.a0 e(boolean z4) throws IOException {
        t3.q qVar;
        b0 b0Var = this.f214d;
        if (b0Var == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (b0Var) {
            b0Var.f97k.h();
            while (b0Var.f93g.isEmpty() && b0Var.f99m == null) {
                try {
                    b0Var.k();
                } catch (Throwable th) {
                    b0Var.f97k.l();
                    throw th;
                }
            }
            b0Var.f97k.l();
            if (!(!b0Var.f93g.isEmpty())) {
                IOException iOException = b0Var.f100n;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = b0Var.f99m;
                c3.h.X(bVar);
                throw new h0(bVar);
            }
            Object objRemoveFirst = b0Var.f93g.removeFirst();
            c3.h.a0(objRemoveFirst, "headersQueue.removeFirst()");
            qVar = (t3.q) objRemoveFirst;
        }
        t3.x xVar = this.f215e;
        c3.h.b0(xVar, "protocol");
        t3.p pVar = new t3.p();
        int size = qVar.size();
        y3.h hVarH = null;
        for (int i4 = 0; i4 < size; i4++) {
            String strB = qVar.b(i4);
            String strD = qVar.d(i4);
            if (c3.h.I(strB, ":status")) {
                hVarH = f2.e.H("HTTP/1.1 " + strD);
            } else if (!f210h.contains(strB)) {
                pVar.a(strB, strD);
            }
        }
        if (hVarH == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        t3.a0 a0Var = new t3.a0();
        a0Var.f4294b = xVar;
        a0Var.f4295c = hVarH.f5426b;
        String str = hVarH.f5427c;
        c3.h.b0(str, "message");
        a0Var.f4296d = str;
        a0Var.f4298f = pVar.b().c();
        if (z4 && a0Var.f4295c == 100) {
            return null;
        }
        return a0Var;
    }

    @Override // y3.d
    public final long f(t3.b0 b0Var) {
        if (y3.e.a(b0Var)) {
            return u3.b.j(b0Var);
        }
        return 0L;
    }

    @Override // y3.d
    public final void g(i.w wVar) throws IOException {
        int i4;
        b0 b0Var;
        boolean z4;
        if (this.f214d != null) {
            return;
        }
        boolean z5 = ((t3.z) wVar.f2811e) != null;
        t3.q qVar = (t3.q) wVar.f2810d;
        ArrayList arrayList = new ArrayList(qVar.size() + 4);
        arrayList.add(new c(c.f103f, (String) wVar.f2809c));
        f4.j jVar = c.f104g;
        t3.s sVar = (t3.s) wVar.f2808b;
        arrayList.add(new c(jVar, c3.h.h2(sVar)));
        String strA = ((t3.q) wVar.f2810d).a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f106i, strA));
        }
        arrayList.add(new c(c.f105h, sVar.f4420a));
        int size = qVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String strB = qVar.b(i5);
            Locale locale = Locale.US;
            c3.h.a0(locale, "US");
            String lowerCase = strB.toLowerCase(locale);
            c3.h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f209g.contains(lowerCase) || (c3.h.I(lowerCase, "te") && c3.h.I(qVar.d(i5), "trailers"))) {
                arrayList.add(new c(lowerCase, qVar.d(i5)));
            }
        }
        t tVar = this.f213c;
        tVar.getClass();
        boolean z6 = !z5;
        synchronized (tVar.f208z) {
            synchronized (tVar) {
                try {
                    if (tVar.f189g > 1073741823) {
                        tVar.x(b.f83g);
                    }
                    if (tVar.f190h) {
                        throw new a();
                    }
                    i4 = tVar.f189g;
                    tVar.f189g = i4 + 2;
                    b0Var = new b0(i4, tVar, z6, false, null);
                    z4 = !z5 || tVar.f205w >= tVar.f206x || b0Var.f91e >= b0Var.f92f;
                    if (b0Var.h()) {
                        tVar.f186d.put(Integer.valueOf(i4), b0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0 c0Var = tVar.f208z;
            synchronized (c0Var) {
                if (c0Var.f115f) {
                    throw new IOException("closed");
                }
                c0Var.f116g.d(arrayList);
                long j4 = c0Var.f113d.f2166c;
                long jMin = Math.min(c0Var.f114e, j4);
                int i6 = j4 == jMin ? 4 : 0;
                if (z6) {
                    i6 |= 1;
                }
                c0Var.h(i4, (int) jMin, 1, i6);
                c0Var.f111b.D(c0Var.f113d, jMin);
                if (j4 > jMin) {
                    c0Var.F(i4, j4 - jMin);
                }
            }
        }
        if (z4) {
            tVar.f208z.flush();
        }
        this.f214d = b0Var;
        if (this.f216f) {
            b0 b0Var2 = this.f214d;
            c3.h.X(b0Var2);
            b0Var2.e(b.f84h);
            throw new IOException("Canceled");
        }
        b0 b0Var3 = this.f214d;
        c3.h.X(b0Var3);
        a0 a0Var = b0Var3.f97k;
        long j5 = this.f212b.f5421g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0Var.g(j5, timeUnit);
        b0 b0Var4 = this.f214d;
        c3.h.X(b0Var4);
        b0Var4.f98l.g(this.f212b.f5422h, timeUnit);
    }

    @Override // y3.d
    public final x3.l h() {
        return this.f211a;
    }
}
