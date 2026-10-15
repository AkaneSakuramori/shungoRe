package w2;

import android.content.Context;
import android.util.Log;
import b4.l;
import c3.e;
import c3.h;
import c3.m;
import com.auth0.android.result.Credentials;
import java.util.Iterator;
import t3.s;
import t3.w;
import t3.y;
import t3.z;
import x3.g;
import x3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f4894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f4895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f4897g;

    public c(String str, String str2, w wVar, Boolean bool, m mVar, Context context) {
        this.f4892b = str;
        this.f4893c = str2;
        this.f4894d = wVar;
        this.f4895e = bool;
        this.f4896f = mVar;
        this.f4897g = context;
    }

    @Override // i1.a
    public final void a(f1.b bVar) {
        Log.e("Shungo", "couldn't get credentials on authenticated request");
        this.f4896f.b(null);
    }

    @Override // i1.a
    public final void b(Object obj) {
        g gVar;
        Credentials credentials = (Credentials) obj;
        h.b0(credentials, "credentials");
        y yVar = new y();
        yVar.e(this.f4892b);
        yVar.a("Authorization", "Bearer " + credentials.a());
        yVar.a("Token", credentials.c());
        yVar.a("version", "1.7.2");
        String str = this.f4893c;
        if (str != null) {
            z zVarH = f2.e.h(str, d.f4898a);
            yVar.a("Content-Type", "application/json");
            yVar.d("POST", zVarH);
        }
        i.w wVarB = yVar.b();
        w wVar = this.f4894d;
        wVar.getClass();
        j jVar = new j(wVar, wVarB, false);
        b bVar = new b(this.f4895e, this.f4896f, this.f4897g);
        if (!jVar.f4976h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        l lVar = l.f1135a;
        jVar.f4977i = l.f1135a.g();
        jVar.f4974f.getClass();
        t3.l lVar2 = jVar.f4970b.f4453b;
        g gVar2 = new g(jVar, bVar);
        lVar2.getClass();
        synchronized (lVar2) {
            lVar2.f4400b.add(gVar2);
            if (!jVar.f4972d) {
                String str2 = ((s) jVar.f4971c.f2808b).f4423d;
                Iterator it = lVar2.f4401c.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = lVar2.f4400b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                gVar = null;
                                break;
                            }
                            gVar = (g) it2.next();
                        } while (!h.I(((s) gVar.f4967d.f4971c.f2808b).f4423d, str2));
                    } else {
                        gVar = (g) it.next();
                    }
                } while (!h.I(((s) gVar.f4967d.f4971c.f2808b).f4423d, str2));
                if (gVar != null) {
                    gVar2.f4966c = gVar.f4966c;
                }
            }
        }
        lVar2.c();
    }
}
