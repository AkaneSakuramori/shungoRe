package a4;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f138b;

    static {
        c cVar = new c(c.f106i, "");
        f4.j jVar = c.f103f;
        c cVar2 = new c(jVar, "GET");
        c cVar3 = new c(jVar, "POST");
        f4.j jVar2 = c.f104g;
        c cVar4 = new c(jVar2, "/");
        c cVar5 = new c(jVar2, "/index.html");
        f4.j jVar3 = c.f105h;
        c cVar6 = new c(jVar3, "http");
        c cVar7 = new c(jVar3, "https");
        f4.j jVar4 = c.f102e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f137a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i4 = 0; i4 < 61; i4++) {
            if (!linkedHashMap.containsKey(cVarArr[i4].f107a)) {
                linkedHashMap.put(cVarArr[i4].f107a, Integer.valueOf(i4));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        c3.h.a0(mapUnmodifiableMap, "unmodifiableMap(result)");
        f138b = mapUnmodifiableMap;
    }

    public static void a(f4.j jVar) {
        c3.h.b0(jVar, "name");
        int iC = jVar.c();
        for (int i4 = 0; i4 < iC; i4++) {
            byte bF = jVar.f(i4);
            if (65 <= bF && bF < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.j()));
            }
        }
    }
}
