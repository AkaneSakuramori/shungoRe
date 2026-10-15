package c4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final X509TrustManager f1279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X509TrustManagerExtensions f1280k;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1279j = x509TrustManager;
        this.f1280k = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f1279j == this.f1279j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1279j);
    }

    @Override // c3.h
    public final List i0(String str, List list) throws SSLPeerUnverifiedException {
        c3.h.b0(list, "chain");
        c3.h.b0(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f1280k.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            c3.h.a0(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e5) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e5.getMessage());
            sSLPeerUnverifiedException.initCause(e5);
            throw sSLPeerUnverifiedException;
        }
    }
}
