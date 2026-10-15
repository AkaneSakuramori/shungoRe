package c4;

import a4.x;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1278a = new x(10, 0);

    @Override // c4.n
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // c4.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || c3.h.I(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // c4.n
    public final boolean c() {
        return f1278a.l();
    }

    @Override // c4.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        c3.h.b0(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            b4.l lVar = b4.l.f1135a;
            sSLParameters.setApplicationProtocols((String[]) x.e(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e5) {
            throw new IOException("Android internal error", e5);
        }
    }
}
