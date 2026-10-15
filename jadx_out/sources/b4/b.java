package b4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1111b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f1110a = x509TrustManager;
        this.f1111b = method;
    }

    @Override // e4.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f1111b.invoke(this.f1110a, x509Certificate);
            c3.h.Y(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e5) {
            throw new AssertionError("unable to get issues and signature", e5);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c3.h.I(this.f1110a, bVar.f1110a) && c3.h.I(this.f1111b, bVar.f1111b);
    }

    public final int hashCode() {
        return this.f1111b.hashCode() + (this.f1110a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1110a + ", findByIssuerAndSignatureMethod=" + this.f1111b + ')';
    }
}
