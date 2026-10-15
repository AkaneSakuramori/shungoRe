package com.auth0.android.request.internal;

import e.k0;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1.f f1304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1.e f1305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1.a f1306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f1307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.c f1308f;

    public a(k1.d dVar, String str, k1.f fVar, e eVar, g1.a aVar, b bVar) {
        c3.h.b0(str, "url");
        c3.h.b0(aVar, "errorAdapter");
        this.f1303a = str;
        this.f1304b = fVar;
        this.f1305c = eVar;
        this.f1306d = aVar;
        this.f1307e = bVar;
        this.f1308f = new e.c(dVar);
    }

    public final void a(String str, String str2) {
        c3.h.b0(str, "name");
        c3.h.b0(str2, "value");
        ((Map) this.f1308f.f1781e).put(str, str2);
    }

    public final void b(Map map) {
        LinkedHashMap linkedHashMapD3 = a3.j.d3(map);
        if (map.containsKey("scope")) {
            linkedHashMapD3.put("scope", c3.h.i1((String) a3.j.X2(map)));
        }
        ((Map) this.f1308f.f1780d).putAll(linkedHashMapD3);
    }

    public final Object c() throws IllegalAccessException, IOException, InvocationTargetException {
        g1.a aVar = this.f1306d;
        try {
            k1.g gVarA = ((k1.a) this.f1304b).a(this.f1303a, this.f1308f);
            InputStreamReader inputStreamReader = new InputStreamReader(gVarA.f3254b, StandardCharsets.UTF_8);
            int i4 = gVarA.f3253a;
            try {
                try {
                    if (200 <= i4 && i4 < 300) {
                        try {
                            b0 b0Var = ((e) this.f1305c).f1314a;
                            b0Var.getClass();
                            Object objB = b0Var.b(new t2.b(inputStreamReader));
                            c3.h.k0(inputStreamReader, null);
                            return objB;
                        } catch (Exception e5) {
                            aVar.getClass();
                            throw g1.a.a(e5);
                        }
                    }
                    try {
                        if (gVarA.a()) {
                            throw aVar.b(inputStreamReader);
                        }
                        String strD2 = c3.h.d2(inputStreamReader);
                        Map map = gVarA.f3255c;
                        aVar.getClass();
                        throw g1.a.c(strD2, map);
                    } catch (Exception e6) {
                        aVar.getClass();
                        throw g1.a.a(e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                c3.h.k0(inputStreamReader, th);
                throw th2;
            }
        } catch (IOException e7) {
            aVar.getClass();
            throw g1.a.a(e7);
        }
    }

    public final void d(i1.a aVar) {
        this.f1307e.a(new k0(this, 4, aVar));
    }
}
