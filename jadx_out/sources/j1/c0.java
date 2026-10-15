package j1;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.auth0.android.result.Credentials;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c3.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f3157t = c0.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.a f3158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i1.a f3159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f3161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f3162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f3163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1.b f3164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h0 f3165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f3166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f3167s;

    public c0(f1.a aVar, androidx.fragment.app.k kVar, LinkedHashMap linkedHashMap, m mVar) {
        c3.h.b0(aVar, "account");
        c3.h.b0(linkedHashMap, "parameters");
        c3.h.b0(mVar, "ctOptions");
        this.f3158j = aVar;
        this.f3159k = kVar;
        this.f3160l = false;
        this.f3162n = new HashMap();
        LinkedHashMap linkedHashMapD3 = a3.j.d3(linkedHashMap);
        this.f3161m = linkedHashMapD3;
        linkedHashMapD3.put("response_type", "code");
        this.f3164p = new g1.b(aVar);
        this.f3163o = mVar;
    }

    public static void Q2(String str, String str2) {
        if (str == null) {
            return;
        }
        Log.e(f3157t, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
        if (q3.l.U2("access_denied", str)) {
            if (str2 == null) {
                str2 = "Permissions were not granted. Try again.";
            }
            throw new g1.c("access_denied", str2);
        }
        if (q3.l.U2("unauthorized", str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new g1.c("unauthorized", str2);
        }
        if (c3.h.I("login_required", str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new g1.c(str, str2);
        }
        if (str2 == null) {
            str2 = "An unexpected error occurred.";
        }
        throw new g1.c(str, str2);
    }

    @Override // c3.h
    public final void J0(g1.c cVar) {
        this.f3159k.a(cVar);
    }

    @Override // c3.h
    public final boolean n2(g gVar) {
        Map map;
        int i4;
        boolean zA = gVar.a();
        String str = f3157t;
        if (!zA && gVar.f3172a != -1) {
            Log.d("g", "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one.");
            Log.w(str, "The Authorize Result is invalid.");
            return false;
        }
        boolean zA2 = gVar.a();
        i1.a aVar = this.f3159k;
        if (zA2) {
            aVar.a(new g1.c("a0.authentication_canceled", "The user closed the browser app and the authentication was canceled."));
            return true;
        }
        Intent intent = gVar.f3173b;
        Uri data = intent == null ? null : intent.getData();
        if (data == null) {
            map = Collections.emptyMap();
        } else {
            String query = data.getQuery() != null ? data.getQuery() : data.getFragment();
            if (query == null) {
                map = new HashMap();
            } else {
                String[] strArrSplit = query.length() > 0 ? query.split("&") : new String[0];
                HashMap map2 = new HashMap(strArrSplit.length);
                for (String str2 : strArrSplit) {
                    int iIndexOf = str2.indexOf("=");
                    String strSubstring = iIndexOf > 0 ? str2.substring(0, iIndexOf) : str2;
                    String strSubstring2 = (iIndexOf <= 0 || str2.length() <= (i4 = iIndexOf + 1)) ? null : str2.substring(i4);
                    if (strSubstring2 != null) {
                        map2.put(strSubstring, strSubstring2);
                    }
                }
                map = map2;
            }
        }
        c3.h.a0(map, "getValuesFromUri(result.intentData)");
        if (map.isEmpty()) {
            Log.w(str, "The response didn't contain any of these values: code, state");
            return false;
        }
        Log.d(str, "The parsed CallbackURI contains the following parameters: " + map.keySet());
        try {
            Q2((String) map.get("error"), (String) map.get("error_description"));
            Object obj = this.f3161m.get("state");
            c3.h.X(obj);
            y.a((String) obj, (String) map.get("state"));
            h0 h0Var = this.f3165q;
            c3.h.X(h0Var);
            String str3 = (String) map.get("code");
            androidx.fragment.app.k kVar = new androidx.fragment.app.k(2, this);
            g1.b bVar = h0Var.f3176a;
            bVar.getClass();
            c3.h.b0(str3, "authorizationCode");
            String str4 = h0Var.f3177b;
            c3.h.b0(str4, "codeVerifier");
            String str5 = h0Var.f3178c;
            c3.h.b0(str5, "redirectUri");
            int i5 = g1.d.f2308b;
            g1.d dVar = new g1.d(new LinkedHashMap());
            f1.a aVar2 = bVar.f2303a;
            String str6 = aVar2.f2025a;
            c3.h.b0(str6, "clientId");
            dVar.a("client_id", str6);
            dVar.a("grant_type", "authorization_code");
            dVar.a("code", str3);
            dVar.a("redirect_uri", str5);
            dVar.a("code_verifier", str4);
            Map mapB3 = a3.j.b3(dVar.f2309a);
            char[] cArr = t3.s.f4419j;
            t3.r rVarF = f2.e.q(String.valueOf(aVar2.f2026b)).f();
            rVarF.a("oauth");
            rVarF.a("token");
            t3.s sVarB = rVarF.b();
            com.auth0.android.request.internal.e eVar = new com.auth0.android.request.internal.e(Credentials.class, bVar.f2305c);
            com.auth0.android.request.internal.l lVar = bVar.f2304b;
            lVar.getClass();
            String str7 = sVarB.f4427h;
            c3.h.b0(str7, "url");
            com.auth0.android.request.internal.a aVarA = lVar.a(k1.b.f3251c, str7, eVar, lVar.f1334b);
            aVarA.b(mapB3);
            for (Map.Entry entry : h0Var.f3180e.entrySet()) {
                aVarA.a((String) entry.getKey(), (String) entry.getValue());
            }
            aVarA.d(kVar);
            return true;
        } catch (g1.c e5) {
            aVar.a(e5);
            return true;
        }
    }
}
