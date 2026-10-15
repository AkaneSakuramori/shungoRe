package a4;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f110h = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4.h f111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f4.g f113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f116g;

    public c0(f4.h hVar, boolean z4) {
        this.f111b = hVar;
        this.f112c = z4;
        f4.g gVar = new f4.g();
        this.f113d = gVar;
        this.f114e = 16384;
        this.f116g = new e(gVar);
    }

    public final synchronized void C(int i4, long j4) {
        if (this.f115f) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        h(i4, 4, 8, 0);
        this.f111b.d((int) j4);
        this.f111b.flush();
    }

    public final void F(int i4, long j4) {
        while (j4 > 0) {
            long jMin = Math.min(this.f114e, j4);
            j4 -= jMin;
            h(i4, (int) jMin, 9, j4 == 0 ? 4 : 0);
            this.f111b.D(this.f113d, jMin);
        }
    }

    public final synchronized void a(g0 g0Var) {
        try {
            c3.h.b0(g0Var, "peerSettings");
            if (this.f115f) {
                throw new IOException("closed");
            }
            int i4 = this.f114e;
            int i5 = g0Var.f144a;
            if ((i5 & 32) != 0) {
                i4 = g0Var.f145b[5];
            }
            this.f114e = i4;
            if (((i5 & 2) != 0 ? g0Var.f145b[1] : -1) != -1) {
                e eVar = this.f116g;
                int i6 = (i5 & 2) != 0 ? g0Var.f145b[1] : -1;
                eVar.getClass();
                int iMin = Math.min(i6, 16384);
                int i7 = eVar.f132e;
                if (i7 != iMin) {
                    if (iMin < i7) {
                        eVar.f130c = Math.min(eVar.f130c, iMin);
                    }
                    eVar.f131d = true;
                    eVar.f132e = iMin;
                    int i8 = eVar.f136i;
                    if (iMin < i8) {
                        if (iMin == 0) {
                            c[] cVarArr = eVar.f133f;
                            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
                            eVar.f134g = eVar.f133f.length - 1;
                            eVar.f135h = 0;
                            eVar.f136i = 0;
                        } else {
                            eVar.a(i8 - iMin);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.f111b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f115f = true;
        this.f111b.close();
    }

    public final synchronized void e(boolean z4, int i4, f4.g gVar, int i5) {
        if (this.f115f) {
            throw new IOException("closed");
        }
        h(i4, i5, 0, z4 ? 1 : 0);
        if (i5 > 0) {
            c3.h.X(gVar);
            this.f111b.D(gVar, i5);
        }
    }

    public final synchronized void flush() {
        if (this.f115f) {
            throw new IOException("closed");
        }
        this.f111b.flush();
    }

    public final void h(int i4, int i5, int i6, int i7) {
        Level level = Level.FINE;
        Logger logger = f110h;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i4, i5, i6, i7, false));
        }
        if (i5 > this.f114e) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f114e + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i4) != 0) {
            throw new IllegalArgumentException(defpackage.a.e("reserved bit set: ", i4).toString());
        }
        byte[] bArr = u3.b.f4761a;
        f4.h hVar = this.f111b;
        c3.h.b0(hVar, "<this>");
        hVar.s((i5 >>> 16) & 255);
        hVar.s((i5 >>> 8) & 255);
        hVar.s(i5 & 255);
        hVar.s(i6 & 255);
        hVar.s(i7 & 255);
        hVar.d(i4 & Integer.MAX_VALUE);
    }

    public final synchronized void t(int i4, b bVar, byte[] bArr) {
        try {
            if (this.f115f) {
                throw new IOException("closed");
            }
            if (bVar.f86b == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            h(0, bArr.length + 8, 7, 0);
            this.f111b.d(i4);
            this.f111b.d(bVar.f86b);
            if (!(bArr.length == 0)) {
                this.f111b.c(bArr);
            }
            this.f111b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void x(int i4, int i5, boolean z4) {
        if (this.f115f) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z4 ? 1 : 0);
        this.f111b.d(i4);
        this.f111b.d(i5);
        this.f111b.flush();
    }

    public final synchronized void z(int i4, b bVar) {
        c3.h.b0(bVar, "errorCode");
        if (this.f115f) {
            throw new IOException("closed");
        }
        if (bVar.f86b == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        h(i4, 4, 3, 0);
        this.f111b.d(bVar.f86b);
        this.f111b.flush();
    }
}
