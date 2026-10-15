package c4;

import a4.x;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1296a = new x(15, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f1297b = new j();

    @Override // c4.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // c4.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // c4.n
    public final boolean c() {
        boolean z4 = b4.g.f1120d;
        return b4.g.f1120d;
    }

    @Override // c4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            b4.l lVar = b4.l.f1135a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) x.e(list).toArray(new String[0]));
        }
    }
}
