package b4;

import a4.x;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c4.m;
import c4.n;
import c4.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f1112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f1113f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.i f1115d;

    static {
        boolean z4 = false;
        z4 = false;
        f1112e = new x(4, z4 ? 1 : 0);
        if (c3.h.I("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        f1113f = z4;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        c4.l lVar;
        c4.l lVar2;
        Method method;
        Method method2;
        n[] nVarArr = new n[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e5) {
            l.f1135a.getClass();
            l.i("unable to load android socket classes", 5, e5);
            oVar = null;
        }
        nVarArr[0] = oVar;
        nVarArr[1] = new m(c4.f.f1285f);
        switch (c4.k.f1296a.f229b) {
            case 13:
                lVar = c4.h.f1292b;
                break;
            default:
                lVar = c4.k.f1297b;
                break;
        }
        nVarArr[2] = new m(lVar);
        switch (c4.h.f1291a.f229b) {
            case 13:
                lVar2 = c4.h.f1292b;
                break;
            default:
                lVar2 = c4.k.f1297b;
                break;
        }
        nVarArr[3] = new m(lVar2);
        ArrayList arrayListW2 = a3.j.W2(nVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListW2) {
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f1114c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f1115d = new c4.i(method3, method2, method);
    }

    @Override // b4.l
    public final c3.h b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        c4.b bVar = x509TrustManagerExtensions != null ? new c4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new e4.a(c(x509TrustManager));
    }

    @Override // b4.l
    public final e4.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // b4.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        c3.h.b0(list, "protocols");
        Iterator it = this.f1114c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // b4.l
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i4) throws IOException {
        c3.h.b0(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i4);
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e5;
            }
            throw new IOException("Exception in connect", e5);
        }
    }

    @Override // b4.l
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1114c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // b4.l
    public final Object g() {
        c4.i iVar = this.f1115d;
        iVar.getClass();
        Method method = iVar.f1293a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = iVar.f1294b;
            c3.h.X(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // b4.l
    public final boolean h(String str) {
        c3.h.b0(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // b4.l
    public final void k(Object obj, String str) {
        c3.h.b0(str, "message");
        c4.i iVar = this.f1115d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f1295c;
                c3.h.X(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        l.j(this, str, 5, 4);
    }
}
