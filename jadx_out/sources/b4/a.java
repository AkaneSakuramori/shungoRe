package b4;

import a4.x;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c4.m;
import c4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f1107d = new x(3, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1108e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1109c;

    static {
        boolean z4 = false;
        if (c3.h.I("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z4 = true;
        }
        f1108e = z4;
    }

    public a() {
        c4.l lVar;
        c4.l lVar2;
        n[] nVarArr = new n[4];
        nVarArr[0] = c4.a.f1278a.l() ? new c4.a() : null;
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
        this.f1109c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        c3.h.b0(list, "protocols");
        Iterator it = this.f1109c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1109c.iterator();
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
    public final boolean h(String str) {
        c3.h.b0(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
