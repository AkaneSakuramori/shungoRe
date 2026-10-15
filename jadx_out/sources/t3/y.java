package t3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f4486a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f4489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f4490e = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4487b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f4488c = new p();

    public final void a(String str, String str2) {
        c3.h.b0(str2, "value");
        p pVar = this.f4488c;
        pVar.getClass();
        f2.e.f(str);
        f2.e.g(str2, str);
        pVar.a(str, str2);
    }

    public final i.w b() {
        Map mapUnmodifiableMap;
        s sVar = this.f4486a;
        if (sVar == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = this.f4487b;
        q qVarB = this.f4488c.b();
        z zVar = this.f4489d;
        LinkedHashMap linkedHashMap = this.f4490e;
        byte[] bArr = u3.b.f4761a;
        c3.h.b0(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = a3.q.f76b;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            c3.h.a0(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new i.w(sVar, str, qVarB, zVar, mapUnmodifiableMap);
    }

    public final void c(String str, String str2) {
        c3.h.b0(str2, "value");
        p pVar = this.f4488c;
        pVar.getClass();
        f2.e.f(str);
        f2.e.g(str2, str);
        pVar.c(str);
        pVar.a(str, str2);
    }

    public final void d(String str, z zVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (zVar == null) {
            if (!(!(c3.h.I(str, "POST") || c3.h.I(str, "PUT") || c3.h.I(str, "PATCH") || c3.h.I(str, "PROPPATCH") || c3.h.I(str, "REPORT")))) {
                throw new IllegalArgumentException(defpackage.a.g("method ", str, " must have a request body.").toString());
            }
        } else if (!c3.h.T1(str)) {
            throw new IllegalArgumentException(defpackage.a.g("method ", str, " must not have a request body.").toString());
        }
        this.f4487b = str;
        this.f4489d = zVar;
    }

    public final void e(String str) {
        c3.h.b0(str, "url");
        if (q3.l.o3(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (q3.l.o3(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            c3.h.a0(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        char[] cArr = s.f4419j;
        this.f4486a = f2.e.q(str);
    }
}
