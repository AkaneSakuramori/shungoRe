package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p2.u;
import p2.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2.m f1315a;

    /* JADX WARN: Code duplicated, block: B:19:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:9:0x00aa A[PHI: r0
      0x00aa: PHI (r0v3 p2.u) = (r0v2 p2.u), (r0v8 p2.u) binds: [B:15:0x00bd, B:7:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i4;
        u uVarA;
        u uVarA2;
        int i5 = 0;
        Type type = TypeToken.getParameterized(Map.class, String.class, PublicKey.class).getType();
        m2.n nVar = new m2.n();
        i iVar = new i(i5);
        ArrayList arrayList = nVar.f3466e;
        arrayList.add(iVar);
        nVar.a(new n(), l1.a.class);
        nVar.a(new c(), Credentials.class);
        nVar.a(new j(), type);
        nVar.f3468g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        int size = arrayList.size();
        ArrayList arrayList2 = nVar.f3467f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        String str = nVar.f3468g;
        boolean z4 = s2.e.f4232a;
        p2.d dVar = p2.e.f3778b;
        u uVarA3 = null;
        if (str == null || str.trim().isEmpty()) {
            int i6 = nVar.f3469h;
            if (i6 != 2 && (i4 = nVar.f3470i) != 2) {
                uVarA = x.a(Date.class, new h(dVar, i6, i4, i5));
                if (z4) {
                    s2.d dVar2 = s2.e.f4234c;
                    dVar2.getClass();
                    uVarA3 = x.a(dVar2.f3779a, new h(dVar2, i6, i4, i5));
                    s2.d dVar3 = s2.e.f4233b;
                    dVar3.getClass();
                    uVarA2 = x.a(dVar3.f3779a, new h(dVar3, i6, i4, i5));
                } else {
                    uVarA2 = null;
                }
                arrayList3.add(uVarA);
                if (z4) {
                    arrayList3.add(uVarA3);
                    arrayList3.add(uVarA2);
                }
            }
        } else {
            uVarA = x.a(Date.class, new h(dVar, str, i5));
            if (z4) {
                s2.d dVar4 = s2.e.f4234c;
                dVar4.getClass();
                uVarA3 = x.a(dVar4.f3779a, new h(dVar4, str, i5));
                s2.d dVar5 = s2.e.f4233b;
                dVar5.getClass();
                uVarA2 = x.a(dVar5.f3779a, new h(dVar5, str, i5));
            } else {
                uVarA2 = null;
            }
            arrayList3.add(uVarA);
            if (z4) {
                arrayList3.add(uVarA3);
                arrayList3.add(uVarA2);
            }
        }
        f1315a = new m2.m(nVar.f3462a, nVar.f3464c, nVar.f3465d, nVar.f3471j, nVar.f3463b, arrayList3, nVar.f3472k, nVar.f3473l);
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
