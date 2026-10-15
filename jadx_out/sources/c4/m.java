package c4;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f1299b;

    public m(l lVar) {
        this.f1298a = lVar;
    }

    @Override // c4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1298a.a(sSLSocket);
    }

    @Override // c4.n
    public final String b(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.b(sSLSocket);
        }
        return null;
    }

    @Override // c4.n
    public final boolean c() {
        return true;
    }

    @Override // c4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f1299b == null && this.f1298a.a(sSLSocket)) {
                this.f1299b = this.f1298a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1299b;
    }
}
