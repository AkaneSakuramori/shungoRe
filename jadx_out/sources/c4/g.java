package c4;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l {
    @Override // c4.l
    public final boolean a(SSLSocket sSLSocket) {
        return b4.d.f1116d.l() && (sSLSocket instanceof BCSSLSocket);
    }

    @Override // c4.l
    public final n b(SSLSocket sSLSocket) {
        return new h();
    }
}
