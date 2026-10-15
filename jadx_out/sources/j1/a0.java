package j1;

import android.text.TextUtils;
import java.util.Date;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements i1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.a f3150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f3151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.auth0.android.request.internal.k f3152d;

    public a0(b0 b0Var, c0 c0Var, com.auth0.android.request.internal.k kVar) {
        this.f3150b = b0Var;
        this.f3151c = c0Var;
        this.f3152d = kVar;
    }

    @Override // i1.a
    public final void a(f1.b bVar) {
        this.f3150b.a((l0) bVar);
    }

    @Override // i1.a
    public final void b(Object obj) {
        a aVar = (a) obj;
        i1.a aVar2 = this.f3150b;
        c3.h.b0(aVar, "result");
        c0 c0Var = this.f3151c;
        String str = c0Var.f3167s;
        c3.h.X(str);
        s sVar = new s(str, c0Var.f3164p.f2303a.f2025a, aVar);
        LinkedHashMap linkedHashMap = c0Var.f3161m;
        String str2 = (String) linkedHashMap.get("max_age");
        if (!TextUtils.isEmpty(str2)) {
            c3.h.X(str2);
            sVar.f3218f = Integer.valueOf(str2);
        }
        sVar.f3219g = c0Var.f3166r;
        sVar.f3216d = (String) linkedHashMap.get("nonce");
        sVar.f3220h = new Date(System.currentTimeMillis());
        sVar.f3215c = (String) linkedHashMap.get("organization");
        try {
            c3.h.K2(this.f3152d, sVar);
            aVar2.b(null);
        } catch (l0 e5) {
            aVar2.a(e5);
        }
    }
}
