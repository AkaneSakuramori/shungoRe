package f4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2152b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2154d;

    public d(InputStream inputStream, y yVar) {
        this.f2153c = inputStream;
        this.f2154d = yVar;
    }

    @Override // f4.w
    public final y b() {
        switch (this.f2152b) {
            case 0:
                return (e) this.f2153c;
            default:
                return (y) this.f2154d;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i4 = this.f2152b;
        Object obj = this.f2153c;
        switch (i4) {
            case 0:
                e eVar = (e) obj;
                w wVar = (w) this.f2154d;
                eVar.h();
                try {
                    try {
                        wVar.close();
                        if (eVar.i()) {
                            throw eVar.j(null);
                        }
                        return;
                    } catch (IOException e5) {
                        if (!eVar.i()) {
                            throw e5;
                        }
                        throw eVar.j(e5);
                    }
                } catch (Throwable th) {
                    eVar.i();
                    throw th;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // f4.w
    public final long f(g gVar, long j4) throws IOException {
        int i4 = this.f2152b;
        Object obj = this.f2153c;
        Object obj2 = this.f2154d;
        switch (i4) {
            case 0:
                c3.h.b0(gVar, "sink");
                e eVar = (e) obj;
                w wVar = (w) obj2;
                eVar.h();
                try {
                    try {
                        long jF = wVar.f(gVar, j4);
                        if (eVar.i()) {
                            throw eVar.j(null);
                        }
                        return jF;
                    } catch (IOException e5) {
                        if (eVar.i()) {
                            throw eVar.j(e5);
                        }
                        throw e5;
                    }
                } catch (Throwable th) {
                    eVar.i();
                    throw th;
                }
            default:
                c3.h.b0(gVar, "sink");
                if (j4 == 0) {
                    return 0L;
                }
                if (j4 < 0) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
                }
                try {
                    ((y) obj2).f();
                    r rVarG = gVar.G(1);
                    int i5 = ((InputStream) obj).read(rVarG.f2190a, rVarG.f2192c, (int) Math.min(j4, 8192 - rVarG.f2192c));
                    if (i5 == -1) {
                        if (rVarG.f2191b == rVarG.f2192c) {
                            gVar.f2165b = rVarG.a();
                            s.a(rVarG);
                        }
                        return -1L;
                    }
                    rVarG.f2192c += i5;
                    long j5 = i5;
                    gVar.f2166c += j5;
                    return j5;
                } catch (AssertionError e6) {
                    if (r3.q.m(e6)) {
                        throw new IOException(e6);
                    }
                    throw e6;
                }
        }
    }

    public final String toString() {
        switch (this.f2152b) {
            case 0:
                return "AsyncTimeout.source(" + ((w) this.f2154d) + ')';
            default:
                return "source(" + ((InputStream) this.f2153c) + ')';
        }
    }

    public d(v vVar, d dVar) {
        this.f2153c = vVar;
        this.f2154d = dVar;
    }
}
