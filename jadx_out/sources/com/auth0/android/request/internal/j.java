package com.auth0.android.request.internal;

import android.util.Base64;
import android.util.Log;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m2.o;
import m2.p;
import m2.q;
import m2.s;
import m2.t;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p {
    @Override // m2.p
    public final Object a(q qVar, Type type, c.a aVar) {
        c3.h.b0(type, "typeOfT");
        c3.h.b0(aVar, "context");
        if (!(qVar instanceof t) || (qVar instanceof s) || ((AbstractCollection) qVar.a().f3476b.entrySet()).isEmpty()) {
            throw new androidx.fragment.app.p("jwks json must be a valid and non-empty json object");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((o) qVar.a().f3476b.get("keys")).f3474b.iterator();
        while (it.hasNext()) {
            t tVarA = ((q) it.next()).a();
            String str = (String) aVar.b(tVarA.b("alg"), String.class);
            String str2 = (String) aVar.b(tVarA.b("use"), String.class);
            if (c3.h.I("RS256", str) && c3.h.I("sig", str2)) {
                String str3 = (String) aVar.b(tVarA.b("kty"), String.class);
                String str4 = (String) aVar.b(tVarA.b("kid"), String.class);
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str3).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) aVar.b(tVarA.b("n"), String.class), 11)), new BigInteger(1, Base64.decode((String) aVar.b(tVarA.b("e"), String.class), 11))));
                    c3.h.a0(str4, "keyId");
                    c3.h.a0(publicKeyGeneratePublic, "pub");
                    linkedHashMap.put(str4, publicKeyGeneratePublic);
                } catch (NoSuchAlgorithmException e5) {
                    Log.e(j.class.getSimpleName(), "Could not parse the JWK with ID " + str4, e5);
                } catch (InvalidKeySpecException e6) {
                    Log.e(j.class.getSimpleName(), "Could not parse the JWK with ID " + str4, e6);
                }
            }
        }
        return a3.j.b3(linkedHashMap);
    }
}
