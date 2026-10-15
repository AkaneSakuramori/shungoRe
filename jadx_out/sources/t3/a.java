package t3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f4283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f4284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f4285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f4286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f4287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f4288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f4289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f4290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f4291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f4292k;

    public a(String str, int i4, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, e4.c cVar, f fVar, n nVar2, List list, List list2, ProxySelector proxySelector) {
        c3.h.b0(str, "uriHost");
        c3.h.b0(nVar, "dns");
        c3.h.b0(socketFactory, "socketFactory");
        c3.h.b0(nVar2, "proxyAuthenticator");
        c3.h.b0(list, "protocols");
        c3.h.b0(list2, "connectionSpecs");
        c3.h.b0(proxySelector, "proxySelector");
        this.f4282a = nVar;
        this.f4283b = socketFactory;
        this.f4284c = sSLSocketFactory;
        this.f4285d = cVar;
        this.f4286e = fVar;
        this.f4287f = nVar2;
        this.f4288g = null;
        this.f4289h = proxySelector;
        r rVar = new r();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (q3.l.U2(str2, "http")) {
            rVar.f4411a = "http";
        } else {
            if (!q3.l.U2(str2, "https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            rVar.f4411a = "https";
        }
        char[] cArr = s.f4419j;
        String strX = r3.q.x(f2.e.J(str, 0, 0, false, 7));
        if (strX == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        rVar.f4414d = strX;
        if (1 > i4 || i4 >= 65536) {
            throw new IllegalArgumentException(defpackage.a.e("unexpected port: ", i4).toString());
        }
        rVar.f4415e = i4;
        this.f4290i = rVar.b();
        this.f4291j = u3.b.w(list);
        this.f4292k = u3.b.w(list2);
    }

    public final boolean a(a aVar) {
        c3.h.b0(aVar, "that");
        return c3.h.I(this.f4282a, aVar.f4282a) && c3.h.I(this.f4287f, aVar.f4287f) && c3.h.I(this.f4291j, aVar.f4291j) && c3.h.I(this.f4292k, aVar.f4292k) && c3.h.I(this.f4289h, aVar.f4289h) && c3.h.I(this.f4288g, aVar.f4288g) && c3.h.I(this.f4284c, aVar.f4284c) && c3.h.I(this.f4285d, aVar.f4285d) && c3.h.I(this.f4286e, aVar.f4286e) && this.f4290i.f4424e == aVar.f4290i.f4424e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (c3.h.I(this.f4290i, aVar.f4290i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4286e) + ((Objects.hashCode(this.f4285d) + ((Objects.hashCode(this.f4284c) + ((Objects.hashCode(this.f4288g) + ((this.f4289h.hashCode() + ((this.f4292k.hashCode() + ((this.f4291j.hashCode() + ((this.f4287f.hashCode() + ((this.f4282a.hashCode() + ((this.f4290i.f4427h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        s sVar = this.f4290i;
        sb.append(sVar.f4423d);
        sb.append(':');
        sb.append(sVar.f4424e);
        sb.append(", ");
        Proxy proxy = this.f4288g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f4289h;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
