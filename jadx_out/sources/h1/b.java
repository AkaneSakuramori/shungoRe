package h1;

import a3.j;
import a3.q;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c3.h;
import com.auth0.android.result.Credentials;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import q3.l;
import t3.r;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.a f2496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f2500g;

    public /* synthetic */ b(c cVar, i1.a aVar) {
        q qVar = q.f76b;
        this.f2495b = cVar;
        this.f2496c = aVar;
        this.f2497d = 0;
        this.f2498e = null;
        this.f2499f = false;
        this.f2500g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        c cVar = this.f2495b;
        h.b0(cVar, "this$0");
        i1.a aVar = this.f2496c;
        h.b0(aVar, "$callback");
        Map map = this.f2500g;
        h.b0(map, "$parameters");
        e eVar = (e) cVar.f2493b;
        String strB = eVar.b("com.auth0.access_token");
        String strB2 = eVar.b("com.auth0.refresh_token");
        String strB3 = eVar.b("com.auth0.id_token");
        String strB4 = eVar.b("com.auth0.token_type");
        SharedPreferences sharedPreferences = eVar.f2502a;
        Long lValueOf = !sharedPreferences.contains("com.auth0.expires_at") ? null : Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
        String strB5 = eVar.b("com.auth0.scope");
        if ((TextUtils.isEmpty(strB) && TextUtils.isEmpty(strB3)) || lValueOf == null) {
            aVar.a(new d("No Credentials were previously set.", null));
            return;
        }
        long jLongValue = lValueOf.longValue();
        int i4 = this.f2497d;
        long j4 = i4;
        boolean zA = cVar.a(jLongValue, j4);
        String strI1 = this.f2498e;
        if (strI1 == null) {
            z4 = false;
        } else {
            String[] strArr = (String[]) l.m3(strB5 == null ? "" : strB5, new String[]{" "}).toArray(new String[0]);
            Arrays.sort(strArr);
            String[] strArr2 = (String[]) l.m3(strI1, new String[]{" "}).toArray(new String[0]);
            Arrays.sort(strArr2);
            z4 = !Arrays.equals(strArr, strArr2);
        }
        if (!this.f2499f && !zA && !z4) {
            if (strB3 == null) {
                strB3 = "";
            }
            aVar.b(new Credentials(strB3, strB == null ? "" : strB, strB4 == null ? "" : strB4, strB2, new Date(lValueOf.longValue()), strB5));
            return;
        }
        if (strB2 == null) {
            aVar.a(new d("Credentials need to be renewed but no Refresh Token is available to renew them.", null));
            return;
        }
        g1.b bVar = cVar.f2492a;
        bVar.getClass();
        int i5 = g1.d.f2308b;
        g1.d dVar = new g1.d(new LinkedHashMap());
        f1.a aVar2 = bVar.f2303a;
        String str = aVar2.f2025a;
        h.b0(str, "clientId");
        dVar.a("client_id", str);
        dVar.a("refresh_token", strB2);
        dVar.a("grant_type", "refresh_token");
        Map mapB3 = j.b3(dVar.f2309a);
        char[] cArr = s.f4419j;
        r rVarF = f2.e.q(String.valueOf(aVar2.f2026b)).f();
        rVarF.a("oauth");
        rVarF.a("token");
        s sVarB = rVarF.b();
        com.auth0.android.request.internal.e eVar2 = new com.auth0.android.request.internal.e(Credentials.class, bVar.f2305c);
        com.auth0.android.request.internal.l lVar = bVar.f2304b;
        lVar.getClass();
        String str2 = sVarB.f4427h;
        h.b0(str2, "url");
        com.auth0.android.request.internal.a aVarA = lVar.a(k1.b.f3251c, str2, eVar2, lVar.f1334b);
        aVarA.b(mapB3);
        aVarA.b(map);
        if (strI1 != null) {
            if (h.I("scope", "scope")) {
                strI1 = h.i1(strI1);
            }
            h.b0(strI1, "value");
            ((Map) aVarA.f1308f.f1780d).put("scope", strI1);
        }
        try {
            Credentials credentials = (Credentials) aVarA.c();
            long time = credentials.b().getTime();
            if (cVar.a(time, j4)) {
                cVar.f2494c.getClass();
                String str3 = String.format(Locale.getDefault(), "The lifetime of the renewed Access Token (%d) is less than the minTTL requested (%d). Increase the 'Token Expiration' setting of your Auth0 API in the dashboard, or request a lower minTTL.", Arrays.copyOf(new Object[]{Long.valueOf(((time - System.currentTimeMillis()) - ((long) (i4 * 1000))) / ((long) (-1000))), Integer.valueOf(i4)}, 2));
                h.a0(str3, "format(locale, format, *args)");
                aVar.a(new d(str3, null));
                return;
            }
            if (!TextUtils.isEmpty(credentials.d())) {
                strB2 = credentials.d();
            }
            Credentials credentials2 = new Credentials(credentials.c(), credentials.a(), credentials.f(), strB2, credentials.b(), credentials.e());
            cVar.c(credentials2);
            aVar.b(credentials2);
        } catch (g1.c e5) {
            aVar.a(new d("An error occurred while trying to use the Refresh Token to renew the Credentials.", e5));
        }
    }
}
