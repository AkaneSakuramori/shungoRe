package z3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5529e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5515c) {
            return;
        }
        if (!this.f5529e) {
            a();
        }
        this.f5515c = true;
    }

    @Override // z3.b, f4.w
    public final long f(f4.g gVar, long j4) {
        c3.h.b0(gVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!this.f5515c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f5529e) {
            return -1L;
        }
        long jF = super.f(gVar, j4);
        if (jF != -1) {
            return jF;
        }
        this.f5529e = true;
        a();
        return -1L;
    }
}
