package f4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f2164c;

    public /* synthetic */ f(i iVar, int i4) {
        this.f2163b = i4;
        this.f2164c = iVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i4 = this.f2163b;
        i iVar = this.f2164c;
        switch (i4) {
            case 0:
                return (int) Math.min(((g) iVar).f2166c, Integer.MAX_VALUE);
            default:
                q qVar = (q) iVar;
                if (qVar.f2189d) {
                    throw new IOException("closed");
                }
                return (int) Math.min(qVar.f2188c.f2166c, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2163b) {
            case 0:
                break;
            default:
                ((q) this.f2164c).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = this.f2163b;
        i iVar = this.f2164c;
        switch (i6) {
            case 0:
                c3.h.b0(bArr, "sink");
                return ((g) iVar).x(bArr, i4, i5);
            default:
                c3.h.b0(bArr, "data");
                q qVar = (q) iVar;
                if (qVar.f2189d) {
                    throw new IOException("closed");
                }
                c3.h.c0(bArr.length, i4, i5);
                g gVar = qVar.f2188c;
                if (gVar.f2166c == 0 && qVar.f2187b.f(gVar, 8192L) == -1) {
                    return -1;
                }
                return gVar.x(bArr, i4, i5);
        }
    }

    public final String toString() {
        int i4 = this.f2163b;
        i iVar = this.f2164c;
        switch (i4) {
            case 0:
                return ((g) iVar) + ".inputStream()";
            default:
                return ((q) iVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i4 = this.f2163b;
        i iVar = this.f2164c;
        switch (i4) {
            case 0:
                g gVar = (g) iVar;
                if (gVar.f2166c > 0) {
                    return gVar.B() & 255;
                }
                return -1;
            default:
                q qVar = (q) iVar;
                if (!qVar.f2189d) {
                    g gVar2 = qVar.f2188c;
                    if (gVar2.f2166c == 0 && qVar.f2187b.f(gVar2, 8192L) == -1) {
                        return -1;
                    }
                    return gVar2.B() & 255;
                }
                throw new IOException("closed");
        }
    }
}
