package z3;

import f4.k;
import f4.u;
import f4.y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f5528d;

    public f(h hVar) {
        this.f5528d = hVar;
        this.f5526b = new k(hVar.f5533d.b());
    }

    @Override // f4.u
    public final void D(f4.g gVar, long j4) {
        c3.h.b0(gVar, "source");
        if (!(!this.f5527c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j5 = gVar.f2166c;
        byte[] bArr = u3.b.f4761a;
        if (j4 < 0 || 0 > j5 || j5 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f5528d.f5533d.D(gVar, j4);
    }

    @Override // f4.u
    public final y b() {
        return this.f5526b;
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5527c) {
            return;
        }
        this.f5527c = true;
        h hVar = this.f5528d;
        hVar.getClass();
        k kVar = this.f5526b;
        y yVar = kVar.f2171e;
        kVar.f2171e = y.f2203d;
        yVar.a();
        yVar.b();
        hVar.f5534e = 3;
    }

    @Override // f4.u, java.io.Flushable
    public final void flush() {
        if (this.f5527c) {
            return;
        }
        this.f5528d.f5533d.flush();
    }
}
