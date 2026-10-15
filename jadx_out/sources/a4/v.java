package a4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class v implements f4.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4.i f217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f222g;

    public v(f4.i iVar) {
        this.f217b = iVar;
    }

    @Override // f4.w
    public final f4.y b() {
        return this.f217b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // f4.w
    public final long f(f4.g gVar, long j4) throws IOException {
        int i4;
        int iE;
        c3.h.b0(gVar, "sink");
        do {
            int i5 = this.f221f;
            f4.i iVar = this.f217b;
            if (i5 != 0) {
                long jF = iVar.f(gVar, Math.min(j4, i5));
                if (jF == -1) {
                    return -1L;
                }
                this.f221f -= (int) jF;
                return jF;
            }
            iVar.q(this.f222g);
            this.f222g = 0;
            if ((this.f219d & 4) != 0) {
                return -1L;
            }
            i4 = this.f220e;
            int iS = u3.b.s(iVar);
            this.f221f = iS;
            this.f218c = iS;
            int iB = iVar.B() & 255;
            this.f219d = iVar.B() & 255;
            f2.e eVar = w.f223f;
            if (eVar.w().isLoggable(Level.FINE)) {
                Logger loggerW = eVar.w();
                f4.j jVar = g.f140a;
                loggerW.fine(g.a(this.f220e, this.f218c, iB, this.f219d, true));
            }
            iE = iVar.E() & Integer.MAX_VALUE;
            this.f220e = iE;
            if (iB != 9) {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        } while (iE == i4);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
