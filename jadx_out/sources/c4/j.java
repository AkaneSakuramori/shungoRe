package c4;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    @Override // c4.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z4 = b4.g.f1120d;
        return b4.e.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // c4.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
