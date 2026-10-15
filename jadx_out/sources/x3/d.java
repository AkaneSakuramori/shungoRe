package x3;

import f4.w;
import f4.y;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f4947h;

    public d(e eVar, w wVar, long j4) {
        c3.h.b0(wVar, "delegate");
        this.f4947h = eVar;
        this.f4941b = wVar;
        this.f4942c = j4;
        this.f4944e = true;
        if (j4 == 0) {
            e(null);
        }
    }

    public final void a() throws IOException {
        this.f4941b.close();
    }

    @Override // f4.w
    public final y b() {
        return this.f4941b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4946g) {
            return;
        }
        this.f4946g = true;
        try {
            a();
            e(null);
        } catch (IOException e5) {
            throw e(e5);
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f4945f) {
            return iOException;
        }
        this.f4945f = true;
        e eVar = this.f4947h;
        if (iOException == null && this.f4944e) {
            this.f4944e = false;
            eVar.f4949b.getClass();
            c3.h.b0(eVar.f4948a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // f4.w
    public final long f(f4.g gVar, long j4) throws IOException {
        c3.h.b0(gVar, "sink");
        if (!(!this.f4946g)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long jF = this.f4941b.f(gVar, j4);
            if (this.f4944e) {
                this.f4944e = false;
                e eVar = this.f4947h;
                t3.n nVar = eVar.f4949b;
                j jVar = eVar.f4948a;
                nVar.getClass();
                c3.h.b0(jVar, "call");
            }
            if (jF == -1) {
                e(null);
                return -1L;
            }
            long j5 = this.f4943d + jF;
            long j6 = this.f4942c;
            if (j6 == -1 || j5 <= j6) {
                this.f4943d = j5;
                if (j5 == j6) {
                    e(null);
                }
                return jF;
            }
            throw new ProtocolException("expected " + j6 + " bytes but received " + j5);
        } catch (IOException e5) {
            throw e(e5);
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f4941b + ')';
    }
}
