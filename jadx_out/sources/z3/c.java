package z3;

import f4.k;
import f4.u;
import f4.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f5519d;

    public c(h hVar) {
        this.f5519d = hVar;
        this.f5517b = new k(hVar.f5533d.b());
    }

    @Override // f4.u
    public final void D(f4.g gVar, long j4) {
        c3.h.b0(gVar, "source");
        if (!(!this.f5518c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j4 == 0) {
            return;
        }
        h hVar = this.f5519d;
        hVar.f5533d.j(j4);
        f4.h hVar2 = hVar.f5533d;
        hVar2.m("\r\n");
        hVar2.D(gVar, j4);
        hVar2.m("\r\n");
    }

    @Override // f4.u
    public final y b() {
        return this.f5517b;
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5518c) {
            return;
        }
        this.f5518c = true;
        this.f5519d.f5533d.m("0\r\n\r\n");
        h hVar = this.f5519d;
        k kVar = this.f5517b;
        hVar.getClass();
        y yVar = kVar.f2171e;
        kVar.f2171e = y.f2203d;
        yVar.a();
        yVar.b();
        this.f5519d.f5534e = 3;
    }

    @Override // f4.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f5518c) {
            return;
        }
        this.f5519d.f5533d.flush();
    }
}
