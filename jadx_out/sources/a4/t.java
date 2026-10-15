package a4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {
    public static final g0 C;
    public final n A;
    public final LinkedHashSet B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w3.f f191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w3.c f192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w3.c f193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w3.c f194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g0 f201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g0 f202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Socket f207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c0 f208z;

    static {
        g0 g0Var = new g0();
        g0Var.c(7, 65535);
        g0Var.c(5, 16384);
        C = g0Var;
    }

    public t(h hVar) {
        boolean z4 = hVar.f146a;
        this.f184b = z4;
        this.f185c = hVar.f152g;
        this.f186d = new LinkedHashMap();
        String str = hVar.f149d;
        if (str == null) {
            c3.h.E2("connectionName");
            throw null;
        }
        this.f187e = str;
        this.f189g = z4 ? 3 : 2;
        w3.f fVar = hVar.f147b;
        this.f191i = fVar;
        w3.c cVarF = fVar.f();
        this.f192j = cVarF;
        this.f193k = fVar.f();
        this.f194l = fVar.f();
        this.f195m = hVar.f153h;
        g0 g0Var = new g0();
        if (z4) {
            g0Var.c(7, 16777216);
        }
        this.f201s = g0Var;
        g0 g0Var2 = C;
        this.f202t = g0Var2;
        this.f206x = g0Var2.a();
        Socket socket = hVar.f148c;
        if (socket == null) {
            c3.h.E2("socket");
            throw null;
        }
        this.f207y = socket;
        f4.h hVar2 = hVar.f151f;
        if (hVar2 == null) {
            c3.h.E2("sink");
            throw null;
        }
        this.f208z = new c0(hVar2, z4);
        f4.i iVar = hVar.f150e;
        if (iVar == null) {
            c3.h.E2("source");
            throw null;
        }
        this.A = new n(this, new w(iVar, z4));
        this.B = new LinkedHashSet();
        int i4 = hVar.f154i;
        if (i4 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i4);
            cVarF.c(new r(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final void C(int i4, boolean z4, f4.g gVar, long j4) {
        long j5;
        long j6;
        int iMin;
        long j7;
        if (j4 == 0) {
            this.f208z.e(z4, i4, gVar, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j5 = this.f205w;
                            j6 = this.f206x;
                            if (j5 >= j6) {
                                if (!this.f186d.containsKey(Integer.valueOf(i4))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j4, j6 - j5), this.f208z.f114e);
                j7 = iMin;
                this.f205w += j7;
            }
            j4 -= j7;
            this.f208z.e(z4 && j4 == 0, i4, gVar, iMin);
        }
    }

    public final void F(int i4, b bVar) {
        this.f192j.c(new q(this.f187e + '[' + i4 + "] writeSynReset", this, i4, bVar, 1), 0L);
    }

    public final void G(int i4, long j4) {
        this.f192j.c(new s(this.f187e + '[' + i4 + "] windowUpdate", this, i4, j4), 0L);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i4;
        Object[] array;
        byte[] bArr = u3.b.f4761a;
        try {
            x(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f186d.isEmpty()) {
                array = this.f186d.values().toArray(new b0[0]);
                this.f186d.clear();
            } else {
                array = null;
            }
        }
        b0[] b0VarArr = (b0[]) array;
        if (b0VarArr != null) {
            for (b0 b0Var : b0VarArr) {
                try {
                    b0Var.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f208z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f207y.close();
        } catch (IOException unused4) {
        }
        this.f192j.e();
        this.f193k.e();
        this.f194l.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.f79c, b.f84h, null);
    }

    public final void e(IOException iOException) {
        b bVar = b.f80d;
        a(bVar, bVar, iOException);
    }

    public final void flush() {
        this.f208z.flush();
    }

    public final synchronized b0 h(int i4) {
        return (b0) this.f186d.get(Integer.valueOf(i4));
    }

    public final synchronized b0 t(int i4) {
        b0 b0Var;
        b0Var = (b0) this.f186d.remove(Integer.valueOf(i4));
        notifyAll();
        return b0Var;
    }

    public final void x(b bVar) {
        synchronized (this.f208z) {
            k3.k kVar = new k3.k();
            synchronized (this) {
                if (this.f190h) {
                    return;
                }
                this.f190h = true;
                int i4 = this.f188f;
                kVar.f3274b = i4;
                this.f208z.t(i4, bVar, u3.b.f4761a);
            }
        }
    }

    public final synchronized void z(long j4) {
        long j5 = this.f203u + j4;
        this.f203u = j5;
        long j6 = j5 - this.f204v;
        if (j6 >= this.f201s.a() / 2) {
            G(0, j6);
            this.f204v += j6;
        }
    }
}
