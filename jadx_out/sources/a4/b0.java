package a4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f88b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f89c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f90d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f91e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f92f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f93g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f94h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f95i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f96j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a0 f97k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f98l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f99m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f100n;

    public b0(int i4, t tVar, boolean z4, boolean z5, t3.q qVar) {
        this.f87a = i4;
        this.f88b = tVar;
        this.f92f = tVar.f202t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f93g = arrayDeque;
        this.f95i = new z(this, tVar.f201s.a(), z5);
        this.f96j = new y(this, z4);
        this.f97k = new a0(this);
        this.f98l = new a0(this);
        if (qVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(qVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z4;
        boolean zH;
        byte[] bArr = u3.b.f4761a;
        synchronized (this) {
            try {
                z zVar = this.f95i;
                if (zVar.f235c || !zVar.f238f) {
                    z4 = false;
                } else {
                    y yVar = this.f96j;
                    if (yVar.f230b || yVar.f232d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            c(b.f84h, null);
        } else {
            if (zH) {
                return;
            }
            this.f88b.t(this.f87a);
        }
    }

    public final void b() throws IOException {
        y yVar = this.f96j;
        if (yVar.f232d) {
            throw new IOException("stream closed");
        }
        if (yVar.f230b) {
            throw new IOException("stream finished");
        }
        if (this.f99m != null) {
            IOException iOException = this.f100n;
            if (iOException != null) {
                throw iOException;
            }
            b bVar = this.f99m;
            c3.h.X(bVar);
            throw new h0(bVar);
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            t tVar = this.f88b;
            tVar.getClass();
            tVar.f208z.z(this.f87a, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = u3.b.f4761a;
        synchronized (this) {
            if (this.f99m != null) {
                return false;
            }
            this.f99m = bVar;
            this.f100n = iOException;
            notifyAll();
            if (this.f95i.f235c && this.f96j.f230b) {
                return false;
            }
            this.f88b.t(this.f87a);
            return true;
        }
    }

    public final void e(b bVar) {
        if (d(bVar, null)) {
            this.f88b.F(this.f87a, bVar);
        }
    }

    public final y f() {
        synchronized (this) {
            if (!this.f94h && !g()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f96j;
    }

    public final boolean g() {
        return this.f88b.f184b == ((this.f87a & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f99m != null) {
            return false;
        }
        z zVar = this.f95i;
        if (zVar.f235c || zVar.f238f) {
            y yVar = this.f96j;
            if ((yVar.f230b || yVar.f232d) && this.f94h) {
                return false;
            }
        }
        return true;
    }

    public final void i(t3.q qVar, boolean z4) {
        boolean zH;
        c3.h.b0(qVar, "headers");
        byte[] bArr = u3.b.f4761a;
        synchronized (this) {
            try {
                if (this.f94h && z4) {
                    this.f95i.getClass();
                } else {
                    this.f94h = true;
                    this.f93g.add(qVar);
                }
                if (z4) {
                    this.f95i.f235c = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f88b.t(this.f87a);
    }

    public final synchronized void j(b bVar) {
        if (this.f99m == null) {
            this.f99m = bVar;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
