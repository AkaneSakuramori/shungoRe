package t3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f4344c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        c3.h.b0(aVar, "address");
        c3.h.b0(inetSocketAddress, "socketAddress");
        this.f4342a = aVar;
        this.f4343b = proxy;
        this.f4344c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (c3.h.I(e0Var.f4342a, this.f4342a) && c3.h.I(e0Var.f4343b, this.f4343b) && c3.h.I(e0Var.f4344c, this.f4344c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4344c.hashCode() + ((this.f4343b.hashCode() + ((this.f4342a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f4344c + '}';
    }
}
