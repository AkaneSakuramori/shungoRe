package b4;

import a4.x;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f1131c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numQ2 = property != null ? q3.j.Q2(property) : null;
        boolean z4 = true;
        if (numQ2 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z4 = false;
            }
        } else if (numQ2.intValue() < 9) {
            z4 = false;
        }
        f1131c = z4;
    }

    @Override // b4.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) x.e(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // b4.l
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || c3.h.I(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
