package f4;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class l implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f2172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f2174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f2175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CRC32 f2176f;

    public l(w wVar) {
        c3.h.b0(wVar, "source");
        q qVar = new q(wVar);
        this.f2173c = qVar;
        Inflater inflater = new Inflater(true);
        this.f2174d = inflater;
        this.f2175e = new m(qVar, inflater);
        this.f2176f = new CRC32();
    }

    public static void a(int i4, int i5, String str) throws IOException {
        if (i5 == i4) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i4)}, 3));
        c3.h.a0(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    @Override // f4.w
    public final y b() {
        return this.f2173c.f2187b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2175e.close();
    }

    public final void e(g gVar, long j4, long j5) {
        r rVar = gVar.f2165b;
        c3.h.X(rVar);
        while (true) {
            int i4 = rVar.f2192c;
            int i5 = rVar.f2191b;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= (long) (i4 - i5);
            rVar = rVar.f2195f;
            c3.h.X(rVar);
        }
        while (j5 > 0) {
            int i6 = (int) (((long) rVar.f2191b) + j4);
            int iMin = (int) Math.min(rVar.f2192c - i6, j5);
            this.f2176f.update(rVar.f2190a, i6, iMin);
            j5 -= (long) iMin;
            rVar = rVar.f2195f;
            c3.h.X(rVar);
            j4 = 0;
        }
    }

    @Override // f4.w
    public final long f(g gVar, long j4) throws IOException {
        q qVar;
        long j5;
        c3.h.b0(gVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        byte b5 = this.f2172b;
        CRC32 crc32 = this.f2176f;
        q qVar2 = this.f2173c;
        if (b5 == 0) {
            qVar2.k(10L);
            g gVar2 = qVar2.f2188c;
            byte bH = gVar2.h(3L);
            boolean z4 = ((bH >> 1) & 1) == 1;
            if (z4) {
                e(qVar2.f2188c, 0L, 10L);
            }
            a(8075, qVar2.u(), "ID1ID2");
            qVar2.q(8L);
            if (((bH >> 2) & 1) == 1) {
                qVar2.k(2L);
                if (z4) {
                    e(qVar2.f2188c, 0L, 2L);
                }
                short sU = gVar2.u();
                long j6 = ((short) (((sU & 255) << 8) | ((sU & 65280) >>> 8))) & 65535;
                qVar2.k(j6);
                if (z4) {
                    e(qVar2.f2188c, 0L, j6);
                    j5 = j6;
                } else {
                    j5 = j6;
                }
                qVar2.q(j5);
            }
            if (((bH >> 3) & 1) == 1) {
                qVar = qVar2;
                long jA = qVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    e(qVar.f2188c, 0L, jA + 1);
                }
                qVar.q(jA + 1);
            } else {
                qVar = qVar2;
            }
            if (((bH >> 4) & 1) == 1) {
                long jA2 = qVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    e(qVar.f2188c, 0L, jA2 + 1);
                }
                qVar.q(jA2 + 1);
            }
            if (z4) {
                qVar.k(2L);
                short sU2 = gVar2.u();
                a((short) (((sU2 & 255) << 8) | ((sU2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f2172b = (byte) 1;
        } else {
            qVar = qVar2;
        }
        if (this.f2172b == 1) {
            long j7 = gVar.f2166c;
            long jF = this.f2175e.f(gVar, j4);
            if (jF != -1) {
                e(gVar, j7, jF);
                return jF;
            }
            this.f2172b = (byte) 2;
        }
        if (this.f2172b != 2) {
            return -1L;
        }
        a(qVar.e(), (int) crc32.getValue(), "CRC");
        a(qVar.e(), (int) this.f2174d.getBytesWritten(), "ISIZE");
        this.f2172b = (byte) 3;
        if (qVar.r()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
