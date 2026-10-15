package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z implements f4.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f4.g f236d = new f4.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f4.g f237e = new f4.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f239g;

    public z(b0 b0Var, long j4, boolean z4) {
        this.f239g = b0Var;
        this.f234b = j4;
        this.f235c = z4;
    }

    @Override // f4.w
    public final f4.y b() {
        return this.f239g.f97k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        b0 b0Var = this.f239g;
        synchronized (b0Var) {
            this.f238f = true;
            f4.g gVar = this.f237e;
            j4 = gVar.f2166c;
            gVar.q(j4);
            b0Var.notifyAll();
        }
        if (j4 > 0) {
            byte[] bArr = u3.b.f4761a;
            this.f239g.f88b.z(j4);
        }
        this.f239g.a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[LOOP:0: B:4:0x0010->B:45:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x008d A[SYNTHETIC] */
    @Override // f4.w
    public final long f(f4.g gVar, long j4) throws Throwable {
        b bVar;
        Throwable h0Var;
        boolean z4;
        long jF;
        c3.h.b0(gVar, "sink");
        long j5 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        while (true) {
            b0 b0Var = this.f239g;
            synchronized (b0Var) {
                b0Var.f97k.h();
                try {
                    synchronized (b0Var) {
                        bVar = b0Var.f99m;
                    }
                    if (z4) {
                        if (jF != -1) {
                            return jF;
                        }
                        if (h0Var == null) {
                            return -1L;
                        }
                        throw h0Var;
                    }
                    j5 = 0;
                } catch (Throwable th) {
                    b0Var.f97k.l();
                    throw th;
                }
            }
            if (bVar == null || this.f235c) {
                h0Var = null;
            } else {
                h0Var = b0Var.f100n;
                if (h0Var == null) {
                    synchronized (b0Var) {
                        b bVar2 = b0Var.f99m;
                        c3.h.X(bVar2);
                        h0Var = new h0(bVar2);
                    }
                }
            }
            if (this.f238f) {
                throw new IOException("stream closed");
            }
            f4.g gVar2 = this.f237e;
            long j6 = gVar2.f2166c;
            z4 = false;
            if (j6 > j5) {
                jF = gVar2.f(gVar, Math.min(j4, j6));
                long j7 = b0Var.f89c + jF;
                b0Var.f89c = j7;
                long j8 = j7 - b0Var.f90d;
                if (h0Var == null && j8 >= b0Var.f88b.f201s.a() / 2) {
                    b0Var.f88b.G(b0Var.f87a, j8);
                    b0Var.f90d = b0Var.f89c;
                }
            } else {
                if (!this.f235c && h0Var == null) {
                    b0Var.k();
                    z4 = true;
                }
                jF = -1;
            }
            b0Var.f97k.l();
            if (z4) {
                if (jF != -1) {
                    return jF;
                }
                if (h0Var == null) {
                    return -1L;
                }
                throw h0Var;
            }
            j5 = 0;
        }
    }
}
