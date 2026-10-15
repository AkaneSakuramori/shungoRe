package j1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w extends c3.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f3222o = w.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.a f3223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i1.a f3224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f3226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f3227n;

    public w(f1.a aVar, androidx.fragment.app.k kVar, String str, m mVar) {
        c3.h.b0(aVar, "account");
        c3.h.b0(mVar, "ctOptions");
        this.f3223j = aVar;
        this.f3224k = kVar;
        this.f3225l = false;
        HashMap map = new HashMap();
        this.f3226m = map;
        map.put("returnTo", str);
        this.f3227n = mVar;
    }

    @Override // c3.h
    public final void J0(g1.c cVar) {
        this.f3224k.a(cVar);
    }

    @Override // c3.h
    public final boolean n2(g gVar) {
        boolean zA = gVar.a();
        i1.a aVar = this.f3224k;
        if (zA) {
            aVar.a(new g1.c("a0.authentication_canceled", "The user closed the browser app so the logout was cancelled."));
            return true;
        }
        aVar.b(null);
        return true;
    }
}
