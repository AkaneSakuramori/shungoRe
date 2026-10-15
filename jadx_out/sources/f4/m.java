package f4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class m implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f2178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2180e;

    public m(q qVar, Inflater inflater) {
        this.f2177b = qVar;
        this.f2178c = inflater;
    }

    @Override // f4.w
    public final y b() {
        return this.f2177b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2180e) {
            return;
        }
        this.f2178c.end();
        this.f2180e = true;
        this.f2177b.close();
    }

    @Override // f4.w
    public final long f(g gVar, long j4) throws IOException {
        long j5;
        c3.h.b0(gVar, "sink");
        while (j4 >= 0) {
            if (!(!this.f2180e)) {
                throw new IllegalStateException("closed".toString());
            }
            i iVar = this.f2177b;
            Inflater inflater = this.f2178c;
            if (j4 == 0) {
                j5 = 0;
            } else {
                try {
                    r rVarG = gVar.G(1);
                    int iMin = (int) Math.min(j4, 8192 - rVarG.f2192c);
                    if (inflater.needsInput() && !iVar.r()) {
                        r rVar = iVar.p().f2165b;
                        c3.h.X(rVar);
                        int i4 = rVar.f2192c;
                        int i5 = rVar.f2191b;
                        int i6 = i4 - i5;
                        this.f2179d = i6;
                        inflater.setInput(rVar.f2190a, i5, i6);
                    }
                    int iInflate = inflater.inflate(rVarG.f2190a, rVarG.f2192c, iMin);
                    int i7 = this.f2179d;
                    if (i7 != 0) {
                        int remaining = i7 - inflater.getRemaining();
                        this.f2179d -= remaining;
                        iVar.q(remaining);
                    }
                    if (iInflate > 0) {
                        rVarG.f2192c += iInflate;
                        j5 = iInflate;
                        gVar.f2166c += j5;
                    } else {
                        if (rVarG.f2191b == rVarG.f2192c) {
                            gVar.f2165b = rVarG.a();
                            s.a(rVarG);
                        }
                        j5 = 0;
                    }
                } catch (DataFormatException e5) {
                    throw new IOException(e5);
                }
            }
            if (j5 > 0) {
                return j5;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (iVar.r()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
    }
}
