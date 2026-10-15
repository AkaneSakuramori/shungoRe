package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class y implements f4.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f4.g f231c = new f4.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f233e;

    public y(b0 b0Var, boolean z4) {
        this.f233e = b0Var;
        this.f230b = z4;
    }

    @Override // f4.u
    public final void D(f4.g gVar, long j4) throws IOException {
        c3.h.b0(gVar, "source");
        byte[] bArr = u3.b.f4761a;
        f4.g gVar2 = this.f231c;
        gVar2.D(gVar, j4);
        while (gVar2.f2166c >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z4) throws IOException {
        long jMin;
        boolean z5;
        b0 b0Var = this.f233e;
        synchronized (b0Var) {
            b0Var.f98l.h();
            while (b0Var.f91e >= b0Var.f92f && !this.f230b && !this.f232d) {
                try {
                    synchronized (b0Var) {
                        b bVar = b0Var.f99m;
                        if (bVar != null) {
                            break;
                        } else {
                            b0Var.k();
                        }
                    }
                } catch (Throwable th) {
                    b0Var.f98l.l();
                    throw th;
                }
            }
            b0Var.f98l.l();
            b0Var.b();
            jMin = Math.min(b0Var.f92f - b0Var.f91e, this.f231c.f2166c);
            b0Var.f91e += jMin;
            z5 = z4 && jMin == this.f231c.f2166c;
        }
        this.f233e.f98l.h();
        try {
            b0 b0Var2 = this.f233e;
            b0Var2.f88b.C(b0Var2.f87a, z5, this.f231c, jMin);
        } finally {
            this.f233e.f98l.l();
        }
    }

    @Override // f4.u
    public final f4.y b() {
        return this.f233e.f98l;
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z4;
        b0 b0Var = this.f233e;
        byte[] bArr = u3.b.f4761a;
        synchronized (b0Var) {
            if (this.f232d) {
                return;
            }
            synchronized (b0Var) {
                z4 = b0Var.f99m == null;
            }
            b0 b0Var2 = this.f233e;
            if (!b0Var2.f96j.f230b) {
                if (this.f231c.f2166c > 0) {
                    while (this.f231c.f2166c > 0) {
                        a(true);
                    }
                } else if (z4) {
                    b0Var2.f88b.C(b0Var2.f87a, true, null, 0L);
                }
            }
            synchronized (this.f233e) {
                this.f232d = true;
            }
            this.f233e.f88b.flush();
            this.f233e.a();
        }
    }

    @Override // f4.u, java.io.Flushable
    public final void flush() throws IOException {
        b0 b0Var = this.f233e;
        byte[] bArr = u3.b.f4761a;
        synchronized (b0Var) {
            b0Var.b();
        }
        while (this.f231c.f2166c > 0) {
            a(false);
            this.f233e.f88b.flush();
        }
    }
}
