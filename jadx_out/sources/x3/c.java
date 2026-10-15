package x3;

import f4.u;
import f4.y;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f4940g;

    public c(e eVar, u uVar, long j4) {
        c3.h.b0(uVar, "delegate");
        this.f4940g = eVar;
        this.f4935b = uVar;
        this.f4936c = j4;
    }

    @Override // f4.u
    public final void D(f4.g gVar, long j4) throws IOException {
        c3.h.b0(gVar, "source");
        if (!(!this.f4939f)) {
            throw new IllegalStateException("closed".toString());
        }
        long j5 = this.f4936c;
        if (j5 == -1 || this.f4938e + j4 <= j5) {
            try {
                this.f4935b.D(gVar, j4);
                this.f4938e += j4;
                return;
            } catch (IOException e5) {
                throw e(e5);
            }
        }
        throw new ProtocolException("expected " + j5 + " bytes but received " + (this.f4938e + j4));
    }

    public final void a() {
        this.f4935b.close();
    }

    @Override // f4.u
    public final y b() {
        return this.f4935b.b();
    }

    @Override // f4.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4939f) {
            return;
        }
        this.f4939f = true;
        long j4 = this.f4936c;
        if (j4 != -1 && this.f4938e != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            e(null);
        } catch (IOException e5) {
            throw e(e5);
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f4937d) {
            return iOException;
        }
        this.f4937d = true;
        return this.f4940g.a(false, true, iOException);
    }

    @Override // f4.u, java.io.Flushable
    public final void flush() throws IOException {
        try {
            h();
        } catch (IOException e5) {
            throw e(e5);
        }
    }

    public final void h() {
        this.f4935b.flush();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f4935b + ')';
    }
}
