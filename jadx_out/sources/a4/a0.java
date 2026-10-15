package a4;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends f4.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f78m;

    public a0(b0 b0Var) {
        this.f78m = b0Var;
    }

    @Override // f4.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // f4.e
    public final void k() {
        this.f78m.e(b.f84h);
        t tVar = this.f78m.f88b;
        synchronized (tVar) {
            long j4 = tVar.f199q;
            long j5 = tVar.f198p;
            if (j4 < j5) {
                return;
            }
            tVar.f198p = j5 + 1;
            tVar.f200r = System.nanoTime() + ((long) 1000000000);
            tVar.f192j.c(new w3.b(2, tVar, defpackage.a.h(new StringBuilder(), tVar.f187e, " ping")), 0L);
        }
    }

    public final void l() throws IOException {
        if (i()) {
            throw j(null);
        }
    }
}
