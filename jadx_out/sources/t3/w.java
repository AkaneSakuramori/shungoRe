package t3;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Cloneable {
    public static final List A = u3.b.k(x.f4481f, x.f4479d);
    public static final List B = u3.b.k(i.f4379e, i.f4380f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f4453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f4454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0.b f4457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f4459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f4462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f4463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProxySelector f4464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f4465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f4466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f4467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f4468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f4469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f4470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4.c f4471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f4472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c3.h f4473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c.a f4477z;

    public w(v vVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f4453b = vVar.f4433a;
        this.f4454c = vVar.f4434b;
        this.f4455d = u3.b.w(vVar.f4435c);
        this.f4456e = u3.b.w(vVar.f4436d);
        this.f4457f = vVar.f4437e;
        this.f4458g = vVar.f4438f;
        this.f4459h = vVar.f4439g;
        this.f4460i = vVar.f4440h;
        this.f4461j = vVar.f4441i;
        this.f4462k = vVar.f4442j;
        this.f4463l = vVar.f4443k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f4464m = proxySelector == null ? d4.a.f1769a : proxySelector;
        this.f4465n = vVar.f4444l;
        this.f4466o = vVar.f4445m;
        List list = vVar.f4446n;
        this.f4469r = list;
        this.f4470s = vVar.f4447o;
        this.f4471t = vVar.f4448p;
        this.f4474w = vVar.f4450r;
        this.f4475x = vVar.f4451s;
        this.f4476y = vVar.f4452t;
        this.f4477z = new c.a(4);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f4467p = null;
                    this.f4473v = null;
                    this.f4468q = null;
                    this.f4472u = f.f4345c;
                    break;
                }
                if (((i) it.next()).f4381a) {
                    b4.l lVar = b4.l.f1135a;
                    X509TrustManager x509TrustManagerN = b4.l.f1135a.n();
                    this.f4468q = x509TrustManagerN;
                    b4.l lVar2 = b4.l.f1135a;
                    c3.h.X(x509TrustManagerN);
                    this.f4467p = lVar2.m(x509TrustManagerN);
                    c3.h hVarB = b4.l.f1135a.b(x509TrustManagerN);
                    this.f4473v = hVarB;
                    f fVar = vVar.f4449q;
                    c3.h.X(hVarB);
                    this.f4472u = c3.h.I(fVar.f4347b, hVarB) ? fVar : new f(fVar.f4346a, hVarB);
                    break;
                }
            }
        } else {
            this.f4467p = null;
            this.f4473v = null;
            this.f4468q = null;
            this.f4472u = f.f4345c;
            break;
        }
        List list2 = this.f4455d;
        c3.h.Y(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f4456e;
        c3.h.Y(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list4 = this.f4469r;
        boolean z4 = list4 instanceof Collection;
        X509TrustManager x509TrustManager = this.f4468q;
        c3.h hVar = this.f4473v;
        SSLSocketFactory sSLSocketFactory = this.f4467p;
        if (!z4 || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f4381a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (hVar != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!c3.h.I(this.f4472u, f.f4345c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
