package z3;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import q3.l;
import t3.q;
import t3.s;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f5520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f5523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, s sVar) {
        super(hVar);
        c3.h.b0(sVar, "url");
        this.f5523h = hVar;
        this.f5520e = sVar;
        this.f5521f = -1L;
        this.f5522g = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5515c) {
            return;
        }
        if (this.f5522g && !u3.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f5523h.f5531b.k();
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
        if (!this.f5522g) {
            return -1L;
        }
        long j5 = this.f5521f;
        h hVar = this.f5523h;
        if (j5 == 0 || j5 == -1) {
            if (j5 != -1) {
                hVar.f5532c.i();
            }
            try {
                this.f5521f = hVar.f5532c.w();
                String string = l.t3(hVar.f5532c.i()).toString();
                if (this.f5521f < 0 || (string.length() > 0 && !l.o3(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5521f + string + '\"');
                }
                if (this.f5521f == 0) {
                    this.f5522g = false;
                    hVar.f5536g = hVar.f5535f.a();
                    w wVar = hVar.f5530a;
                    c3.h.X(wVar);
                    q qVar = hVar.f5536g;
                    c3.h.X(qVar);
                    y3.e.b(wVar.f4462k, this.f5520e, qVar);
                    a();
                }
                if (!this.f5522g) {
                    return -1L;
                }
            } catch (NumberFormatException e5) {
                throw new ProtocolException(e5.getMessage());
            }
        }
        long jF = super.f(gVar, Math.min(j4, this.f5521f));
        if (jF != -1) {
            this.f5521f -= jF;
            return jF;
        }
        hVar.f5531b.k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
