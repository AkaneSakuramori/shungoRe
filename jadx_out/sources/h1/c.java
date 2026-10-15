package h1;

import android.text.TextUtils;
import c3.h;
import com.auth0.android.result.Credentials;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f2501d;

    public c(g1.b bVar, e eVar) {
        z0.c cVar = new z0.c(10);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        h.a0(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        super(bVar, eVar, cVar);
        this.f2501d = executorServiceNewSingleThreadExecutor;
    }

    public final void b() {
        f fVar = this.f2493b;
        ((e) fVar).a("com.auth0.access_token");
        ((e) fVar).a("com.auth0.refresh_token");
        ((e) fVar).a("com.auth0.id_token");
        ((e) fVar).a("com.auth0.token_type");
        ((e) fVar).a("com.auth0.expires_at");
        ((e) fVar).a("com.auth0.scope");
        ((e) fVar).a("com.auth0.cache_expires_at");
    }

    public final void c(Credentials credentials) {
        h.b0(credentials, "credentials");
        if (TextUtils.isEmpty(credentials.a()) && TextUtils.isEmpty(credentials.c())) {
            throw new d("Credentials must have a valid date of expiration and a valid access_token or id_token value.", null);
        }
        String strA = credentials.a();
        e eVar = (e) this.f2493b;
        eVar.d("com.auth0.access_token", strA);
        eVar.d("com.auth0.refresh_token", credentials.d());
        eVar.d("com.auth0.id_token", credentials.c());
        eVar.d("com.auth0.token_type", credentials.f());
        eVar.c("com.auth0.expires_at", Long.valueOf(credentials.b().getTime()));
        eVar.d("com.auth0.scope", credentials.e());
        eVar.c("com.auth0.cache_expires_at", Long.valueOf(credentials.b().getTime()));
    }
}
