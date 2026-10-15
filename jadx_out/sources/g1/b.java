package g1;

import c3.h;
import com.auth0.android.request.internal.f;
import com.auth0.android.request.internal.l;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import m2.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.a f2303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2305c;

    public b(f1.a aVar) {
        h.b0(aVar, "auth0");
        k1.a aVar2 = aVar.f2028d;
        m mVar = f.f1315a;
        h.b0(mVar, "gson");
        l lVar = new l(aVar2, new a(new com.auth0.android.request.internal.e(mVar.c(new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.GsonAdapter$Companion$forMap$1
        }))));
        this.f2303a = aVar;
        this.f2304b = lVar;
        this.f2305c = mVar;
        String str = aVar.f2027c.f3444a;
        h.b0(str, "clientInfo");
        lVar.f1335c.put("Auth0-Client", str);
    }
}
