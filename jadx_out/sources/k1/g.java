package k1;

import c3.h;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import q3.l;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f3254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3255c;

    public g(int i4, InputStream inputStream, TreeMap treeMap) {
        h.b0(inputStream, "body");
        this.f3253a = i4;
        this.f3254b = inputStream;
        this.f3255c = treeMap;
    }

    public final boolean a() {
        Map map = this.f3255c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.x1(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Locale locale = Locale.getDefault();
            h.a0(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        List list = (List) linkedHashMap.get("content-type");
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (l.R2((String) it.next(), "application/json", true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3253a == gVar.f3253a && h.I(this.f3254b, gVar.f3254b) && h.I(this.f3255c, gVar.f3255c);
    }

    public final int hashCode() {
        return this.f3255c.hashCode() + ((this.f3254b.hashCode() + (Integer.hashCode(this.f3253a) * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(statusCode=" + this.f3253a + ", body=" + this.f3254b + ", headers=" + this.f3255c + ')';
    }
}
