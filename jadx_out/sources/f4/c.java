package f4;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2149b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2151d;

    public c(OutputStream outputStream, v vVar) {
        this.f2150c = outputStream;
        this.f2151d = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[LOOP:1: B:12:0x0062->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[SYNTHETIC] */
    @Override // f4.u
    public final void D(g gVar, long j4) throws IOException {
        e eVar;
        int i4 = this.f2149b;
        Object obj = this.f2150c;
        Object obj2 = this.f2151d;
        switch (i4) {
            case 0:
                c3.h.b0(gVar, "source");
                c3.h.c0(gVar.f2166c, 0L, j4);
                while (j4 > 0) {
                    r rVar = gVar.f2165b;
                    c3.h.X(rVar);
                    long j5 = 0;
                    try {
                        try {
                            while (j5 < 65536) {
                                j5 += (long) (rVar.f2192c - rVar.f2191b);
                                if (j5 >= j4) {
                                    j5 = j4;
                                    eVar = (e) obj;
                                    u uVar = (u) obj2;
                                    eVar.h();
                                    uVar.D(gVar, j5);
                                    if (!eVar.i()) {
                                        throw eVar.j(null);
                                    }
                                    j4 -= j5;
                                } else {
                                    rVar = rVar.f2195f;
                                    c3.h.X(rVar);
                                }
                            }
                            uVar.D(gVar, j5);
                            if (!eVar.i()) {
                                throw eVar.j(null);
                            }
                            j4 -= j5;
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
                    eVar = (e) obj;
                    u uVar2 = (u) obj2;
                    eVar.h();
                }
                return;
            default:
                c3.h.b0(gVar, "source");
                c3.h.c0(gVar.f2166c, 0L, j4);
                while (j4 > 0) {
                    ((y) obj2).f();
                    r rVar2 = gVar.f2165b;
                    c3.h.X(rVar2);
                    int iMin = (int) Math.min(j4, rVar2.f2192c - rVar2.f2191b);
                    ((OutputStream) obj).write(rVar2.f2190a, rVar2.f2191b, iMin);
                    int i5 = rVar2.f2191b + iMin;
                    rVar2.f2191b = i5;
                    long j6 = iMin;
                    j4 -= j6;
                    gVar.f2166c -= j6;
                    if (i5 == rVar2.f2192c) {
                        gVar.f2165b = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    @Override // f4.u
    public final y b() {
        switch (this.f2149b) {
            case 0:
                return (e) this.f2150c;
            default:
                return (y) this.f2151d;
        }
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i4 = this.f2149b;
        Object obj = this.f2150c;
        switch (i4) {
            case 0:
                e eVar = (e) obj;
                u uVar = (u) this.f2151d;
                eVar.h();
                try {
                    try {
                        uVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // f4.u, java.io.Flushable
    public final void flush() throws IOException {
        int i4 = this.f2149b;
        Object obj = this.f2150c;
        switch (i4) {
            case 0:
                e eVar = (e) obj;
                u uVar = (u) this.f2151d;
                eVar.h();
                try {
                    try {
                        uVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f2149b) {
            case 0:
                return "AsyncTimeout.sink(" + ((u) this.f2151d) + ')';
            default:
                return "sink(" + ((OutputStream) this.f2150c) + ')';
        }
    }

    public c(v vVar, c cVar) {
        this.f2150c = vVar;
        this.f2151d = cVar;
    }
}
