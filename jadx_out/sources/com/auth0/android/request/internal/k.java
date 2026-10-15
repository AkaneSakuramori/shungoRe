package com.auth0.android.request.internal;

import a3.p;
import android.util.Base64;
import com.google.gson.reflect.TypeToken;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f1320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Date f1328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f1329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Date f1331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f1332m;

    public k(String str) {
        String[] strArr = (String[]) q3.l.m3(str, new String[]{"."}).toArray(new String[0]);
        if (strArr.length == 2 && str.endsWith(".")) {
            strArr = new String[]{strArr[0], strArr[1], ""};
        }
        if (strArr.length != 3) {
            String str2 = String.format("The token was expected to have 3 parts, but got %s.", Arrays.copyOf(new Object[]{Integer.valueOf(strArr.length)}, 1));
            c3.h.a0(str2, "format(format, *args)");
            throw new IllegalArgumentException(str2);
        }
        this.f1320a = strArr;
        String str3 = strArr[0];
        c3.h.b0(str3, "encoded");
        byte[] bArrDecode = Base64.decode(str3, 11);
        c3.h.a0(bArrDecode, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
        Charset charset = q3.a.f3886a;
        String str4 = new String(bArrDecode, charset);
        String str5 = strArr[1];
        c3.h.b0(str5, "encoded");
        byte[] bArrDecode2 = Base64.decode(str5, 11);
        c3.h.a0(bArrDecode2, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
        String str6 = new String(bArrDecode2, charset);
        b0 b0VarC = f.f1315a.c(new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.Jwt$mapAdapter$1
        });
        Object objB = b0VarC.b(new t2.b(new StringReader(str4)));
        c3.h.a0(objB, "mapAdapter.fromJson(jsonHeader)");
        Map map = (Map) objB;
        Object objB2 = b0VarC.b(new t2.b(new StringReader(str6)));
        c3.h.a0(objB2, "mapAdapter.fromJson(jsonPayload)");
        Map map2 = (Map) objB2;
        Object obj = map.get("alg");
        c3.h.Y(obj, "null cannot be cast to non-null type kotlin.String");
        this.f1321b = (String) obj;
        this.f1322c = (String) map.get("kid");
        this.f1323d = (String) map2.get("sub");
        this.f1324e = (String) map2.get("iss");
        this.f1325f = (String) map2.get("nonce");
        this.f1326g = (String) map2.get("org_id");
        this.f1327h = (String) map2.get("org_name");
        Object obj2 = map2.get("iat");
        Double d5 = obj2 instanceof Double ? (Double) obj2 : null;
        this.f1328i = d5 != null ? new Date(((long) d5.doubleValue()) * ((long) 1000)) : null;
        Object obj3 = map2.get("exp");
        Double d6 = obj3 instanceof Double ? (Double) obj3 : null;
        this.f1329j = d6 != null ? new Date(((long) d6.doubleValue()) * ((long) 1000)) : null;
        this.f1330k = (String) map2.get("azp");
        Object obj4 = map2.get("auth_time");
        Double d7 = obj4 instanceof Double ? (Double) obj4 : null;
        this.f1331l = d7 != null ? new Date(((long) d7.doubleValue()) * ((long) 1000)) : null;
        Object obj5 = map2.get("aud");
        this.f1332m = obj5 instanceof String ? c3.h.u1(obj5) : obj5 instanceof List ? (List) obj5 : p.f75b;
    }
}
