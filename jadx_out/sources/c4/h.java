package c4;

import a4.x;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1291a = new x(13, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1292b = new g();

    @Override // c4.n
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // c4.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || c3.h.I(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // c4.n
    public final boolean c() {
        return b4.d.f1116d.l();
    }

    @Override // c4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            b4.l lVar = b4.l.f1135a;
            parameters.setApplicationProtocols((String[]) x.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
