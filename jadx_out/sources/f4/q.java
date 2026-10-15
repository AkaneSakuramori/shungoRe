package f4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class q implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f2187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2189d;

    public q(w wVar) {
        c3.h.b0(wVar, "source");
        this.f2187b = wVar;
        this.f2188c = new g();
    }

    @Override // f4.i
    public final f A() {
        return new f(this, 1);
    }

    @Override // f4.i
    public final byte B() throws EOFException {
        k(1L);
        return this.f2188c.B();
    }

    @Override // f4.i
    public final int E() throws EOFException {
        k(4L);
        return this.f2188c.E();
    }

    public final long a(byte b5, long j4, long j5) {
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        while (jMax < j5) {
            long jT = this.f2188c.t(b5, jMax, j5);
            if (jT != -1) {
                return jT;
            }
            g gVar = this.f2188c;
            long j6 = gVar.f2166c;
            if (j6 >= j5 || this.f2187b.f(gVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j6);
        }
        return -1L;
    }

    @Override // f4.w
    public final y b() {
        return this.f2187b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f2189d) {
            return;
        }
        this.f2189d = true;
        this.f2187b.close();
        g gVar = this.f2188c;
        gVar.q(gVar.f2166c);
    }

    public final int e() throws EOFException {
        k(4L);
        int iE = this.f2188c.E();
        return ((iE & 255) << 24) | (((-16777216) & iE) >>> 24) | ((16711680 & iE) >>> 8) | ((65280 & iE) << 8);
    }

    @Override // f4.w
    public final long f(g gVar, long j4) {
        c3.h.b0(gVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar2 = this.f2188c;
        if (gVar2.f2166c == 0 && this.f2187b.f(gVar2, 8192L) == -1) {
            return -1L;
        }
        return gVar2.f(gVar, Math.min(j4, gVar2.f2166c));
    }

    public final boolean h(long j4) {
        g gVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            gVar = this.f2188c;
            if (gVar.f2166c >= j4) {
                return true;
            }
        } while (this.f2187b.f(gVar, 8192L) != -1);
        return false;
    }

    @Override // f4.i
    public final String i() {
        return n(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2189d;
    }

    @Override // f4.i
    public final void k(long j4) throws EOFException {
        if (!h(j4)) {
            throw new EOFException();
        }
    }

    @Override // f4.i
    public final j l(long j4) throws EOFException {
        k(j4);
        return this.f2188c.l(j4);
    }

    @Override // f4.i
    public final String n(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long jA = a((byte) 10, 0L, j5);
        g gVar = this.f2188c;
        if (jA != -1) {
            return g4.a.a(gVar, jA);
        }
        if (j5 < Long.MAX_VALUE && h(j5) && gVar.h(j5 - 1) == 13 && h(1 + j5) && gVar.h(j5) == 10) {
            return g4.a.a(gVar, j5);
        }
        g gVar2 = new g();
        gVar.e(gVar2, 0L, Math.min(32, gVar.f2166c));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f2166c, j4) + " content=" + gVar2.l(gVar2.f2166c).d() + (char) 8230);
    }

    @Override // f4.i
    public final int o(o oVar) throws EOFException {
        g gVar;
        c3.h.b0(oVar, "options");
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            gVar = this.f2188c;
            int iB = g4.a.b(gVar, oVar, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                gVar.q(oVar.f2182b[iB].c());
                return iB;
            }
        } while (this.f2187b.f(gVar, 8192L) != -1);
        return -1;
    }

    @Override // f4.i
    public final g p() {
        return this.f2188c;
    }

    @Override // f4.i
    public final void q(long j4) throws EOFException {
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j4 > 0) {
            g gVar = this.f2188c;
            if (gVar.f2166c == 0 && this.f2187b.f(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, gVar.f2166c);
            gVar.q(jMin);
            j4 -= jMin;
        }
    }

    @Override // f4.i
    public final boolean r() {
        if (!(!this.f2189d)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f2188c;
        return gVar.r() && this.f2187b.f(gVar, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        c3.h.b0(byteBuffer, "sink");
        g gVar = this.f2188c;
        if (gVar.f2166c == 0 && this.f2187b.f(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f2187b + ')';
    }

    @Override // f4.i
    public final short u() throws EOFException {
        k(2L);
        return this.f2188c.u();
    }

    @Override // f4.i
    public final long w() throws EOFException {
        g gVar;
        k(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean zH = h(i5);
            gVar = this.f2188c;
            if (!zH) {
                break;
            }
            byte bH = gVar.h(i4);
            if ((bH < 48 || bH > 57) && ((bH < 97 || bH > 102) && (bH < 65 || bH > 70))) {
                if (i4 != 0) {
                    break;
                }
                c3.h.d0(16);
                c3.h.d0(16);
                String string = Integer.toString(bH, 16);
                c3.h.a0(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i4 = i5;
        }
        return gVar.w();
    }

    @Override // f4.i
    public final String y(Charset charset) {
        g gVar = this.f2188c;
        gVar.J(this.f2187b);
        return gVar.C(gVar.f2166c, charset);
    }
}
