package k1;

import a3.q;
import c3.h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m2.m;
import q3.l;
import t3.b0;
import t3.c0;
import t3.d0;
import t3.r;
import t3.s;
import t3.u;
import t3.v;
import t3.w;
import t3.y;
import x3.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f3245d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3246a = q.f76b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3247b = com.auth0.android.request.internal.f.f1315a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f3248c;

    static {
        Pattern pattern = u.f4429c;
        f3245d = f2.e.r("application/json; charset=utf-8");
    }

    public a() {
        v vVar = new v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h.b0(timeUnit, "unit");
        vVar.f4450r = u3.b.b(10, timeUnit);
        vVar.f4451s = u3.b.b(10, timeUnit);
        this.f3248c = new w(vVar);
    }

    public final g a(String str, e.c cVar) {
        h.b0(str, "url");
        h.b0(cVar, "options");
        char[] cArr = s.f4419j;
        s sVarQ = f2.e.q(str);
        y yVar = new y();
        r rVarF = sVarQ.f();
        if (((d) cVar.f1779c) instanceof c) {
            Map map = (Map) cVar.f1780d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                Object value = entry2.getValue();
                h.Y(value, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) value;
                h.b0(str2, "name");
                if (rVarF.f4417g == null) {
                    rVarF.f4417g = new ArrayList();
                }
                ArrayList arrayList2 = rVarF.f4417g;
                h.X(arrayList2);
                char[] cArr2 = s.f4419j;
                arrayList2.add(f2.e.e(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
                ArrayList arrayList3 = rVarF.f4417g;
                h.X(arrayList3);
                arrayList3.add(f2.e.e(str3, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
                arrayList.add(rVarF);
            }
            yVar.d(((d) cVar.f1779c).toString(), null);
        } else {
            String strF = this.f3247b.f((Map) cVar.f1780d);
            h.a0(strF, "gson.toJson(options.parameters)");
            yVar.d(((d) cVar.f1779c).toString(), f2.e.h(strF, f3245d));
        }
        Map map2 = (Map) cVar.f1781e;
        Map map3 = this.f3246a;
        h.b0(map3, "<this>");
        h.b0(map2, "map");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
        linkedHashMap2.putAll(map2);
        String[] strArr = new String[linkedHashMap2.size() * 2];
        int i4 = 0;
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            String str4 = (String) entry3.getKey();
            String str5 = (String) entry3.getValue();
            String string = l.t3(str4).toString();
            String string2 = l.t3(str5).toString();
            f2.e.f(string);
            f2.e.g(string2, string);
            strArr[i4] = string;
            strArr[i4 + 1] = string2;
            i4 += 2;
        }
        t3.q qVar = new t3.q(strArr);
        yVar.f4486a = rVarF.b();
        yVar.f4488c = qVar.c();
        i.w wVarB = yVar.b();
        w wVar = this.f3248c;
        wVar.getClass();
        b0 b0VarE = new j(wVar, wVarB, false).e();
        d0 d0Var = b0VarE.f4313h;
        h.X(d0Var);
        f4.f fVarA = ((c0) d0Var).f4336d.A();
        t3.q qVar2 = b0VarE.f4312g;
        qVar2.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        h.a0(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = qVar2.size();
        for (int i5 = 0; i5 < size; i5++) {
            String strB = qVar2.b(i5);
            Locale locale = Locale.US;
            h.a0(locale, "US");
            String lowerCase = strB.toLowerCase(locale);
            h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList4 = (List) treeMap.get(lowerCase);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList(2);
                treeMap.put(lowerCase, arrayList4);
            }
            arrayList4.add(qVar2.d(i5));
        }
        return new g(b0VarE.f4310e, fVarA, treeMap);
    }
}
