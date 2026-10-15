package com.auth0.android.request.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1.f f1333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.a f1334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1335c;

    public l(k1.a aVar, g1.a aVar2) {
        c3.h.b0(aVar, "client");
        this.f1333a = aVar;
        this.f1334b = aVar2;
        z2.a[] aVarArr = new z2.a[1];
        String string = Locale.getDefault().toString();
        c3.h.a0(string, "getDefault().toString()");
        aVarArr[0] = new z2.a("Accept-Language", string.length() <= 0 ? "en_US" : string);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3.h.x1(1));
        z2.a aVar3 = aVarArr[0];
        linkedHashMap.put(aVar3.f5504b, aVar3.f5505c);
        this.f1335c = linkedHashMap;
    }

    public final a a(k1.d dVar, String str, e eVar, g1.a aVar) {
        b bVarD = b.f1309b.d();
        c3.h.b0(str, "url");
        k1.f fVar = this.f1333a;
        c3.h.b0(fVar, "client");
        c3.h.b0(aVar, "errorAdapter");
        a aVar2 = new a(dVar, str, fVar, eVar, aVar, bVarD);
        LinkedHashMap linkedHashMap = this.f1335c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aVar2.a((String) entry.getKey(), (String) entry.getValue());
            arrayList.add(aVar2);
        }
        return aVar2;
    }
}
