package a4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f2.e f223f = new f2.e(29, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f224g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4.i f225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f228e;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        c3.h.a0(logger, "getLogger(Http2::class.java.name)");
        f224g = logger;
    }

    public w(f4.i iVar, boolean z4) {
        this.f225b = iVar;
        this.f226c = z4;
        v vVar = new v(iVar);
        this.f227d = vVar;
        this.f228e = new d(vVar);
    }

    public final boolean a(boolean z4, n nVar) throws IOException {
        b bVar;
        b bVar2;
        Object[] array;
        c3.h.b0(nVar, "handler");
        int i4 = 0;
        try {
            this.f225b.k(9L);
            int iS = u3.b.s(this.f225b);
            if (iS > 16384) {
                throw new IOException(defpackage.a.e("FRAME_SIZE_ERROR: ", iS));
            }
            int iB = this.f225b.B() & 255;
            byte B = this.f225b.B();
            int i5 = B & 255;
            int iE = this.f225b.E();
            int i6 = iE & Integer.MAX_VALUE;
            Logger logger = f224g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(i6, iS, iB, i5, true));
            }
            if (z4 && iB != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f141b;
                sb.append(iB < strArr.length ? strArr[iB] : u3.b.h("0x%02x", Integer.valueOf(iB)));
                throw new IOException(sb.toString());
            }
            switch (iB) {
                case 0:
                    h(nVar, iS, i5, i6);
                    return true;
                case 1:
                    x(nVar, iS, i5, i6);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + iS + " != 5");
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    f4.i iVar = this.f225b;
                    iVar.E();
                    iVar.B();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + iS + " != 4");
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iE2 = this.f225b.E();
                    b[] bVarArrValues = b.values();
                    int length = bVarArrValues.length;
                    while (true) {
                        if (i4 < length) {
                            b bVar3 = bVarArrValues[i4];
                            if (bVar3.f86b == iE2) {
                                bVar = bVar3;
                            } else {
                                i4++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        throw new IOException(defpackage.a.e("TYPE_RST_STREAM unexpected error code: ", iE2));
                    }
                    t tVar = nVar.f167c;
                    tVar.getClass();
                    if (i6 == 0 || (iE & 1) != 0) {
                        b0 b0VarT = tVar.t(i6);
                        if (b0VarT == null) {
                            return true;
                        }
                        b0VarT.j(bVar);
                        return true;
                    }
                    tVar.f193k.c(new q(tVar.f187e + '[' + i6 + "] onReset", tVar, i6, bVar, 0), 0L);
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((B & 1) == 0) {
                        if (iS % 6 != 0) {
                            throw new IOException(defpackage.a.e("TYPE_SETTINGS length % 6 != 0: ", iS));
                        }
                        g0 g0Var = new g0();
                        n3.a aVarA2 = c3.h.A2(c3.h.I2(0, iS), 6);
                        int i7 = aVarA2.f3565b;
                        int i8 = aVarA2.f3566c;
                        int i9 = aVarA2.f3567d;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                f4.i iVar2 = this.f225b;
                                short sU = iVar2.u();
                                byte[] bArr = u3.b.f4761a;
                                int i10 = sU & 65535;
                                int iE3 = iVar2.E();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 == 4) {
                                        if (iE3 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    } else if (i10 == 5 && (iE3 < 16384 || iE3 > 16777215)) {
                                        throw new IOException(defpackage.a.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", iE3));
                                    }
                                } else if (iE3 != 0 && iE3 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                g0Var.c(i10, iE3);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        t tVar2 = nVar.f167c;
                        tVar2.f192j.c(new m(defpackage.a.h(new StringBuilder(), tVar2.f187e, " applyAndAckSettings"), nVar, g0Var), 0L);
                    } else if (iS != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                    break;
                case 5:
                    z(nVar, iS, i5, i6);
                    break;
                case 6:
                    if (iS != 8) {
                        throw new IOException(defpackage.a.e("TYPE_PING length != 8: ", iS));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int iE4 = this.f225b.E();
                    int iE5 = this.f225b.E();
                    if ((B & 1) == 0) {
                        nVar.f167c.f192j.c(new l(defpackage.a.h(new StringBuilder(), nVar.f167c.f187e, " ping"), nVar.f167c, iE4, iE5), 0L);
                    } else {
                        t tVar3 = nVar.f167c;
                        synchronized (tVar3) {
                            try {
                                if (iE4 == 1) {
                                    tVar3.f197o++;
                                } else if (iE4 == 2) {
                                    tVar3.f199q++;
                                } else if (iE4 == 3) {
                                    tVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                    break;
                case 7:
                    if (iS < 8) {
                        throw new IOException(defpackage.a.e("TYPE_GOAWAY length < 8: ", iS));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int iE6 = this.f225b.E();
                    int iE7 = this.f225b.E();
                    int i11 = iS - 8;
                    b[] bVarArrValues2 = b.values();
                    int length2 = bVarArrValues2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            b bVar4 = bVarArrValues2[i12];
                            if (bVar4.f86b == iE7) {
                                bVar2 = bVar4;
                            } else {
                                i12++;
                            }
                        } else {
                            bVar2 = null;
                        }
                    }
                    if (bVar2 == null) {
                        throw new IOException(defpackage.a.e("TYPE_GOAWAY unexpected error code: ", iE7));
                    }
                    f4.j jVarL = f4.j.f2167e;
                    if (i11 > 0) {
                        jVarL = this.f225b.l(i11);
                    }
                    c3.h.b0(jVarL, "debugData");
                    jVarL.c();
                    t tVar4 = nVar.f167c;
                    synchronized (tVar4) {
                        array = tVar4.f186d.values().toArray(new b0[0]);
                        tVar4.f190h = true;
                    }
                    b0[] b0VarArr = (b0[]) array;
                    int length3 = b0VarArr.length;
                    while (i4 < length3) {
                        b0 b0Var = b0VarArr[i4];
                        if (b0Var.f87a > iE6 && b0Var.g()) {
                            b0Var.j(b.f83g);
                            nVar.f167c.t(b0Var.f87a);
                        }
                        i4++;
                    }
                    break;
                    break;
                case 8:
                    if (iS != 4) {
                        throw new IOException(defpackage.a.e("TYPE_WINDOW_UPDATE length !=4: ", iS));
                    }
                    long jE = ((long) this.f225b.E()) & 2147483647L;
                    if (jE == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i6 != 0) {
                        b0 b0VarH = nVar.f167c.h(i6);
                        if (b0VarH != null) {
                            synchronized (b0VarH) {
                                b0VarH.f92f += jE;
                                if (jE > 0) {
                                    b0VarH.notifyAll();
                                }
                            }
                        }
                    } else {
                        t tVar5 = nVar.f167c;
                        synchronized (tVar5) {
                            tVar5.f206x += jE;
                            tVar5.notifyAll();
                        }
                    }
                    break;
                    break;
                default:
                    this.f225b.q(iS);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f225b.close();
    }

    public final void e(n nVar) throws IOException {
        c3.h.b0(nVar, "handler");
        if (this.f226c) {
            if (!a(true, nVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        f4.j jVar = g.f140a;
        f4.j jVarL = this.f225b.l(jVar.f2168b.length);
        Level level = Level.FINE;
        Logger logger = f224g;
        if (logger.isLoggable(level)) {
            logger.fine(u3.b.h("<< CONNECTION " + jVarL.d(), new Object[0]));
        }
        if (!c3.h.I(jVar, jVarL)) {
            throw new IOException("Expected a connection header but was ".concat(jVarL.j()));
        }
    }

    public final void h(n nVar, int i4, int i5, int i6) throws IOException {
        int i7;
        boolean z4;
        boolean z5;
        long j4;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte B = this.f225b.B();
            byte[] bArr = u3.b.f4761a;
            i7 = B & 255;
        } else {
            i7 = 0;
        }
        int iE = f2.e.E(i4, i5, i7);
        f4.i iVar = this.f225b;
        nVar.getClass();
        c3.h.b0(iVar, "source");
        nVar.f167c.getClass();
        long j5 = 0;
        if (i6 != 0 && (i6 & 1) == 0) {
            t tVar = nVar.f167c;
            tVar.getClass();
            f4.g gVar = new f4.g();
            long j6 = iE;
            iVar.k(j6);
            iVar.f(gVar, j6);
            tVar.f193k.c(new o(tVar.f187e + '[' + i6 + "] onData", tVar, i6, gVar, iE, z6), 0L);
        } else {
            b0 b0VarH = nVar.f167c.h(i6);
            if (b0VarH == null) {
                nVar.f167c.F(i6, b.f80d);
                long j7 = iE;
                nVar.f167c.z(j7);
                iVar.q(j7);
            } else {
                byte[] bArr2 = u3.b.f4761a;
                z zVar = b0VarH.f95i;
                long j8 = iE;
                zVar.getClass();
                long j9 = j8;
                while (true) {
                    if (j9 <= j5) {
                        byte[] bArr3 = u3.b.f4761a;
                        zVar.f239g.f88b.z(j8);
                        break;
                    }
                    synchronized (zVar.f239g) {
                        z4 = zVar.f235c;
                        z5 = zVar.f237e.f2166c + j9 > zVar.f234b;
                    }
                    if (z5) {
                        iVar.q(j9);
                        zVar.f239g.e(b.f82f);
                        break;
                    }
                    if (z4) {
                        iVar.q(j9);
                        break;
                    }
                    long jF = iVar.f(zVar.f236d, j9);
                    if (jF == -1) {
                        throw new EOFException();
                    }
                    j9 -= jF;
                    b0 b0Var = zVar.f239g;
                    synchronized (b0Var) {
                        try {
                            if (zVar.f238f) {
                                f4.g gVar2 = zVar.f236d;
                                gVar2.q(gVar2.f2166c);
                                j4 = 0;
                            } else {
                                f4.g gVar3 = zVar.f237e;
                                j4 = 0;
                                boolean z7 = gVar3.f2166c == 0;
                                gVar3.J(zVar.f236d);
                                if (z7) {
                                    b0Var.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j5 = j4;
                }
                if (z6) {
                    b0VarH.i(u3.b.f4762b, true);
                }
            }
        }
        this.f225b.q(i7);
    }

    public final List t(int i4, int i5, int i6, int i7) throws IOException {
        v vVar = this.f227d;
        vVar.f221f = i4;
        vVar.f218c = i4;
        vVar.f222g = i5;
        vVar.f219d = i6;
        vVar.f220e = i7;
        while (true) {
            d dVar = this.f228e;
            f4.q qVar = dVar.f120d;
            boolean zR = qVar.r();
            ArrayList arrayList = dVar.f119c;
            if (zR) {
                List listJ3 = a3.n.j3(arrayList);
                arrayList.clear();
                return listJ3;
            }
            byte B = qVar.B();
            byte[] bArr = u3.b.f4761a;
            int i8 = B & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((B & 128) == 128) {
                int iE = dVar.e(i8, 127);
                int i9 = iE - 1;
                if (i9 >= 0) {
                    c[] cVarArr = f.f137a;
                    if (i9 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i9]);
                    }
                }
                int length = dVar.f122f + 1 + (i9 - f.f137a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.f121e;
                    if (length < cVarArr2.length) {
                        c cVar = cVarArr2[length];
                        c3.h.X(cVar);
                        arrayList.add(cVar);
                    }
                }
                throw new IOException(defpackage.a.e("Header index too large ", iE));
            }
            if (i8 == 64) {
                c[] cVarArr3 = f.f137a;
                f4.j jVarD = dVar.d();
                f.a(jVarD);
                dVar.c(new c(jVarD, dVar.d()));
            } else if ((B & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i8, 63) - 1), dVar.d()));
            } else if ((B & 32) == 32) {
                int iE2 = dVar.e(i8, 31);
                dVar.f118b = iE2;
                if (iE2 < 0 || iE2 > dVar.f117a) {
                    throw new IOException("Invalid dynamic table size update " + dVar.f118b);
                }
                int i10 = dVar.f124h;
                if (iE2 < i10) {
                    if (iE2 == 0) {
                        c[] cVarArr4 = dVar.f121e;
                        Arrays.fill(cVarArr4, 0, cVarArr4.length, (Object) null);
                        dVar.f122f = dVar.f121e.length - 1;
                        dVar.f123g = 0;
                        dVar.f124h = 0;
                    } else {
                        dVar.a(i10 - iE2);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                c[] cVarArr5 = f.f137a;
                f4.j jVarD2 = dVar.d();
                f.a(jVarD2);
                arrayList.add(new c(jVarD2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i8, 15) - 1), dVar.d()));
            }
        }
    }

    public final void x(n nVar, int i4, int i5, int i6) throws IOException {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z4 = false;
        int i8 = 1;
        boolean z5 = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte B = this.f225b.B();
            byte[] bArr = u3.b.f4761a;
            i7 = B & 255;
        } else {
            i7 = 0;
        }
        if ((i5 & 32) != 0) {
            f4.i iVar = this.f225b;
            iVar.E();
            iVar.B();
            byte[] bArr2 = u3.b.f4761a;
            nVar.getClass();
            i4 -= 5;
        }
        List listT = t(f2.e.E(i4, i5, i7), i7, i5, i6);
        nVar.getClass();
        nVar.f167c.getClass();
        if (i6 != 0 && (i6 & 1) == 0) {
            z4 = true;
        }
        if (z4) {
            t tVar = nVar.f167c;
            tVar.getClass();
            tVar.f193k.c(new p(tVar.f187e + '[' + i6 + "] onHeaders", tVar, i6, listT, z5), 0L);
            return;
        }
        t tVar2 = nVar.f167c;
        synchronized (tVar2) {
            b0 b0VarH = tVar2.h(i6);
            if (b0VarH != null) {
                b0VarH.i(u3.b.u(listT), z5);
                return;
            }
            if (tVar2.f190h) {
                return;
            }
            if (i6 <= tVar2.f188f) {
                return;
            }
            if (i6 % 2 == tVar2.f189g % 2) {
                return;
            }
            b0 b0Var = new b0(i6, tVar2, false, z5, u3.b.u(listT));
            tVar2.f188f = i6;
            tVar2.f186d.put(Integer.valueOf(i6), b0Var);
            tVar2.f191i.f().c(new k(tVar2.f187e + '[' + i6 + "] onStream", tVar2, b0Var, i8), 0L);
        }
    }

    public final void z(n nVar, int i4, int i5, int i6) throws IOException {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte B = this.f225b.B();
            byte[] bArr = u3.b.f4761a;
            i7 = B & 255;
        } else {
            i7 = 0;
        }
        int iE = this.f225b.E() & Integer.MAX_VALUE;
        List listT = t(f2.e.E(i4 - 4, i5, i7), i7, i5, i6);
        nVar.getClass();
        t tVar = nVar.f167c;
        tVar.getClass();
        synchronized (tVar) {
            if (tVar.B.contains(Integer.valueOf(iE))) {
                tVar.F(iE, b.f80d);
                return;
            }
            tVar.B.add(Integer.valueOf(iE));
            tVar.f193k.c(new q(tVar.f187e + '[' + iE + "] onRequest", tVar, iE, listT, 2), 0L);
        }
    }
}
