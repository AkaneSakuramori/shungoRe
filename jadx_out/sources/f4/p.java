package f4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f2184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2186d;

    public p(u uVar) {
        c3.h.b0(uVar, "sink");
        this.f2184b = uVar;
        this.f2185c = new g();
    }

    @Override // f4.u
    public final void D(g gVar, long j4) {
        c3.h.b0(gVar, "source");
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.D(gVar, j4);
        a();
    }

    public final h a() {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f2185c;
        long j4 = gVar.f2166c;
        if (j4 == 0) {
            j4 = 0;
        } else {
            r rVar = gVar.f2165b;
            c3.h.X(rVar);
            r rVar2 = rVar.f2196g;
            c3.h.X(rVar2);
            int i4 = rVar2.f2192c;
            if (i4 < 8192 && rVar2.f2194e) {
                j4 -= (long) (i4 - rVar2.f2191b);
            }
        }
        if (j4 > 0) {
            this.f2184b.D(gVar, j4);
        }
        return this;
    }

    @Override // f4.u
    public final y b() {
        return this.f2184b.b();
    }

    @Override // f4.h
    public final h c(byte[] bArr) {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f2185c;
        gVar.getClass();
        gVar.I(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2184b;
        if (this.f2186d) {
            return;
        }
        g gVar = this.f2185c;
        long j4 = gVar.f2166c;
        if (j4 > 0) {
            uVar.D(gVar, j4);
        }
        th = null;
        try {
            uVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f2186d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f4.h
    public final h d(int i4) {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.M(i4);
        a();
        return this;
    }

    public final h e(byte[] bArr, int i4, int i5) {
        c3.h.b0(bArr, "source");
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.I(bArr, i4, i5);
        a();
        return this;
    }

    @Override // f4.h, f4.u, java.io.Flushable
    public final void flush() {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f2185c;
        long j4 = gVar.f2166c;
        u uVar = this.f2184b;
        if (j4 > 0) {
            uVar.D(gVar, j4);
        }
        uVar.flush();
    }

    @Override // f4.h
    public final h g(j jVar) {
        c3.h.b0(jVar, "byteString");
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.H(jVar);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2186d;
    }

    @Override // f4.h
    public final h j(long j4) {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.L(j4);
        a();
        return this;
    }

    @Override // f4.h
    public final h m(String str) {
        c3.h.b0(str, "string");
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.P(str);
        a();
        return this;
    }

    @Override // f4.h
    public final h s(int i4) {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.K(i4);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f2184b + ')';
    }

    @Override // f4.h
    public final h v(int i4) {
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2185c.N(i4);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        c3.h.b0(byteBuffer, "source");
        if (!(!this.f2186d)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f2185c.write(byteBuffer);
        a();
        return iWrite;
    }
}
