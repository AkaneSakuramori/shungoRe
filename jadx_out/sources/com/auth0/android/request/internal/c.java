package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import m2.p;
import m2.q;
import m2.s;
import m2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {
    @Override // m2.p
    public final Object a(q qVar, Type type, c.a aVar) {
        c3.h.b0(type, "typeOfT");
        c3.h.b0(aVar, "context");
        if (!(qVar instanceof t) || (qVar instanceof s) || ((AbstractCollection) qVar.a().f3476b.entrySet()).isEmpty()) {
            throw new androidx.fragment.app.p("credentials json is not a valid json object");
        }
        t tVarA = qVar.a();
        String str = (String) aVar.b(tVarA.c("id_token"), String.class);
        String str2 = (String) aVar.b(tVarA.c("access_token"), String.class);
        String str3 = (String) aVar.b(tVarA.c("token_type"), String.class);
        String str4 = (String) aVar.b(tVarA.c("refresh_token"), String.class);
        Long l4 = (Long) aVar.b(tVarA.c("expires_in"), Long.TYPE);
        String str5 = (String) aVar.b(tVarA.c("scope"), String.class);
        String str6 = (String) aVar.b(tVarA.c("recovery_code"), String.class);
        Date date = (Date) aVar.b(tVarA.c("expires_at"), Date.class);
        if (date == null && l4 != null) {
            date = new Date((l4.longValue() * ((long) 1000)) + System.currentTimeMillis());
        }
        Date date2 = date;
        c3.h.a0(str, "idToken");
        c3.h.a0(str2, "accessToken");
        c3.h.a0(str3, "type");
        c3.h.a0(date2, "expiresAt");
        Credentials credentials = new Credentials(str, str2, str3, str4, date2, str5);
        credentials.g(str6);
        return credentials;
    }
}
