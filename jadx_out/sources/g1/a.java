package g1;

import android.util.Log;
import c3.h;
import java.io.InputStreamReader;
import java.util.Map;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.auth0.android.request.internal.e f2302a;

    public a(com.auth0.android.request.internal.e eVar) {
        this.f2302a = eVar;
    }

    public static c a(Exception exc) {
        return new c("Something went wrong", new f1.b("Something went wrong", exc));
    }

    public static c c(String str, Map map) {
        h.b0(map, "headers");
        c cVar = new c();
        cVar.f2306b = "a0.sdk.internal_error.plain";
        cVar.f2307c = str;
        return cVar;
    }

    public final c b(InputStreamReader inputStreamReader) {
        b0 b0Var = this.f2302a.f1314a;
        b0Var.getClass();
        Map map = (Map) b0Var.b(new t2.b(inputStreamReader));
        h.b0(map, "values");
        c cVar = new c();
        String str = (String) map.get(map.containsKey("error") ? "error" : "code");
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        cVar.f2306b = str;
        if (map.containsKey("description")) {
            Object obj = map.get("description");
            if (obj instanceof String) {
                cVar.f2307c = (String) obj;
            } else if ((obj instanceof Map) && h.I("invalid_password", str) && h.I("PasswordStrengthError", map.get("name"))) {
                cVar.f2307c = new e((Map) obj).f2311b;
            }
        } else {
            cVar.f2307c = (String) map.get("error_description");
            String str2 = cVar.f2306b;
            if (h.I("invalid_request", str2 != null ? str2 : "a0.sdk.internal_error.unknown") && (h.I("OIDC conformant clients cannot use /oauth/access_token", cVar.a()) || h.I("OIDC conformant clients cannot use /oauth/ro", cVar.a()))) {
                Log.w(b.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
            }
        }
        return cVar;
    }
}
