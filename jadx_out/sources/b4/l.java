package b4;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile l f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f1136b;

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[PHI: r1
      0x0092: PHI (r1v18 b4.l) = (r1v16 b4.l), (r1v21 b4.l) binds: [B:34:0x00b6, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    static {
        j jVar;
        l lVarG;
        l dVar;
        if (c3.h.I("Dalvik", System.getProperty("java.vm.name"))) {
            for (Map.Entry entry : c4.c.f1282b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (c4.c.f1281a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(c4.d.f1283a);
                }
            }
            lVarG = a.f1107d.g();
            if (lVarG == null) {
                lVarG = c.f1112e.g();
                c3.h.X(lVarG);
            }
        } else if (c3.h.I("Conscrypt", Security.getProviders()[0].getName())) {
            dVar = g.f1120d ? new g() : null;
            if (dVar != null) {
                lVarG = dVar;
            } else {
                if (c3.h.I("BC", Security.getProviders()[0].getName())) {
                    if (d.f1116d.l()) {
                        dVar = new d();
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        lVarG = dVar;
                    }
                }
                if (c3.h.I("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (k.f1132d.l()) {
                        lVarG = new k();
                    } else {
                        lVarG = null;
                    }
                    if (lVarG == null) {
                        if (j.f1131c) {
                        }
                        if (jVar != null) {
                            lVarG = jVar;
                        } else {
                            lVarG = i.f1125h.g();
                            if (lVarG == null) {
                                lVarG = new l();
                            }
                        }
                    }
                } else {
                    if (j.f1131c) {
                    }
                    if (jVar != null) {
                        lVarG = jVar;
                    } else {
                        lVarG = i.f1125h.g();
                        if (lVarG == null) {
                            lVarG = new l();
                        }
                    }
                }
            }
        } else {
            if (c3.h.I("BC", Security.getProviders()[0].getName())) {
                if (d.f1116d.l()) {
                    dVar = new d();
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    lVarG = dVar;
                }
            }
            if (c3.h.I("OpenJSSE", Security.getProviders()[0].getName())) {
                jVar = j.f1131c ? new j() : null;
                if (jVar != null) {
                    lVarG = jVar;
                } else {
                    lVarG = i.f1125h.g();
                    if (lVarG == null) {
                        lVarG = new l();
                    }
                }
            } else {
                if (k.f1132d.l()) {
                    lVarG = new k();
                } else {
                    lVarG = null;
                }
                if (lVarG == null) {
                    if (j.f1131c) {
                    }
                    if (jVar != null) {
                        lVarG = jVar;
                    } else {
                        lVarG = i.f1125h.g();
                        if (lVarG == null) {
                            lVarG = new l();
                        }
                    }
                }
            }
        }
        f1135a = lVarG;
        f1136b = Logger.getLogger(w.class.getName());
    }

    public static void i(String str, int i4, Throwable th) {
        c3.h.b0(str, "message");
        f1136b.log(i4 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(l lVar, String str, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 4;
        }
        lVar.getClass();
        i(str, i4, null);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c3.h b(X509TrustManager x509TrustManager) {
        return new e4.a(c(x509TrustManager));
    }

    public e4.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        c3.h.a0(acceptedIssuers, "trustManager.acceptedIssuers");
        return new e4.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i4) throws IOException {
        c3.h.b0(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i4);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f1136b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        c3.h.b0(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        c3.h.b0(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        c3.h.a0(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            c3.h.a0(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e5) {
            throw new AssertionError("No System TLS: " + e5, e5);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        c3.h.X(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                c3.h.Y(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        c3.h.a0(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
