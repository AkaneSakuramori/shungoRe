package x3;

import a3.p;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3.a f5012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a f5013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t3.d f5014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t3.n f5015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f5016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f5018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f5019h;

    public o(t3.a aVar, c.a aVar2, j jVar, t3.n nVar) {
        List listK;
        c3.h.b0(aVar, "address");
        c3.h.b0(aVar2, "routeDatabase");
        c3.h.b0(jVar, "call");
        c3.h.b0(nVar, "eventListener");
        this.f5012a = aVar;
        this.f5013b = aVar2;
        this.f5014c = jVar;
        this.f5015d = nVar;
        p pVar = p.f75b;
        this.f5016e = pVar;
        this.f5018g = pVar;
        this.f5019h = new ArrayList();
        s sVar = aVar.f4290i;
        c3.h.b0(sVar, "url");
        Proxy proxy = aVar.f4288g;
        if (proxy != null) {
            listK = c3.h.u1(proxy);
        } else {
            URI uriH = sVar.h();
            if (uriH.getHost() == null) {
                listK = u3.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = aVar.f4289h.select(uriH);
                listK = (listSelect == null || listSelect.isEmpty()) ? u3.b.k(Proxy.NO_PROXY) : u3.b.w(listSelect);
            }
        }
        this.f5016e = listK;
        this.f5017f = 0;
    }

    public final boolean a() {
        return (this.f5017f < this.f5016e.size()) || (this.f5019h.isEmpty() ^ true);
    }
}
