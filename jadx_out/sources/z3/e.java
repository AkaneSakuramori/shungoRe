package z3;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j4) {
        super(hVar);
        this.f5525f = hVar;
        this.f5524e = j4;
        if (j4 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5515c) {
            return;
        }
        if (this.f5524e != 0 && !u3.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f5525f.f5531b.k();
            a();
        }
        this.f5515c = true;
    }

    @Override // z3.b, f4.w
    public final long f(f4.g gVar, long j4) throws ProtocolException {
        c3.h.b0(gVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!this.f5515c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j5 = this.f5524e;
        if (j5 == 0) {
            return -1L;
        }
        long jF = super.f(gVar, Math.min(j5, j4));
        if (jF == -1) {
            this.f5525f.f5531b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j6 = this.f5524e - jF;
        this.f5524e = j6;
        if (j6 == 0) {
            a();
        }
        return jF;
    }
}
