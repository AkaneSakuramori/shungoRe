package c4;

import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1284a = "com.google.android.gms.org.conscrypt";

    @Override // c4.l
    public final boolean a(SSLSocket sSLSocket) {
        return q3.l.o3(sSLSocket.getClass().getName(), this.f1284a + '.', false);
    }

    @Override // c4.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!c3.h.I(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(superclass);
    }
}
