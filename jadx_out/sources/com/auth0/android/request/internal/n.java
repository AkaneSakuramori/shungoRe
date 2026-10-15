package com.auth0.android.request.internal;

import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import m2.p;
import m2.q;
import m2.s;
import m2.t;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.m f1336a;

    public n() {
        o2.f fVar = o2.f.f3619d;
        m2.a aVar = m2.g.f3445b;
        Map mapEmptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        this.f1336a = new m2.m(fVar, aVar, mapEmptyMap, true, 1, Collections.emptyList(), z.f3478b, z.f3479c);
    }

    @Override // m2.p
    public final Object a(q qVar, Type type, c.a aVar) {
        if (!(qVar instanceof t) || (qVar instanceof s) || ((AbstractCollection) qVar.a().f3476b.entrySet()).isEmpty()) {
            throw new androidx.fragment.app.p("user profile json is not a valid json object");
        }
        t tVarA = qVar.a();
        String str = (String) aVar.b(tVarA.c("user_id"), String.class);
        String str2 = (String) aVar.b(tVarA.c("name"), String.class);
        String str3 = (String) aVar.b(tVarA.c("nickname"), String.class);
        String str4 = (String) aVar.b(tVarA.c("picture"), String.class);
        String str5 = (String) aVar.b(tVarA.c("email"), String.class);
        String str6 = (String) aVar.b(tVarA.c("given_name"), String.class);
        Class cls = Boolean.class;
        if (tVarA.f3476b.containsKey("email_verified")) {
        }
        Object objB = this.f1336a.b(tVarA.c("created_at"), Date.class);
        if (Date.class == Integer.TYPE) {
            cls = Integer.class;
        } else if (Date.class == Float.TYPE) {
            cls = Float.class;
        } else if (Date.class == Byte.TYPE) {
            cls = Byte.class;
        } else if (Date.class == Double.TYPE) {
            cls = Double.class;
        } else if (Date.class == Long.TYPE) {
            cls = Long.class;
        } else if (Date.class == Character.TYPE) {
            cls = Character.class;
        } else if (Date.class != Boolean.TYPE) {
            if (Date.class == Short.TYPE) {
                cls = Short.class;
            } else {
                cls = Date.class == Void.TYPE ? Void.class : Date.class;
            }
        }
        Type type2 = new UserProfileDeserializer$2().getType();
        return new l1.a(str, str2, str3, str4, str5, (Map) aVar.b(tVarA, type2), str6);
    }
}
