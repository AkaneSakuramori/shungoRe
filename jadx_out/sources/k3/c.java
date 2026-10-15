package k3;

import j3.p;
import j3.q;
import j3.r;
import j3.s;
import j3.t;
import j3.u;
import j3.v;
import j3.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o3.b, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f3264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f3265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3266a;

    static {
        int i4 = 0;
        List listQ2 = a3.j.Q2(new Class[]{j3.a.class, j3.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, j3.b.class, j3.c.class, j3.d.class, j3.e.class, j3.f.class, j3.g.class, j3.h.class, j3.i.class, j3.j.class, j3.k.class, j3.m.class, j3.n.class, j3.o.class});
        ArrayList arrayList = new ArrayList(a3.j.R2(listQ2));
        for (Object obj : listQ2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new z2.a((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f3264b = a3.j.a3(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        c3.h.a0(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            c3.h.a0(str, "kotlinName");
            sb.append(q3.l.r3(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3264b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3.h.x1(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), q3.l.r3((String) entry2.getValue()));
        }
        f3265c = linkedHashMap;
    }

    public c(Class cls) {
        c3.h.b0(cls, "jClass");
        this.f3266a = cls;
    }

    @Override // k3.b
    public final Class a() {
        return this.f3266a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && c3.h.I(c3.h.V0(this), c3.h.V0((o3.b) obj));
    }

    public final int hashCode() {
        return c3.h.V0(this).hashCode();
    }

    public final String toString() {
        return this.f3266a.toString() + " (Kotlin reflection is not available)";
    }
}
