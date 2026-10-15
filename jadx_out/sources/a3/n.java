package a3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends l {
    public static final void f3(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, j3.l lVar) {
        c3.h.b0(iterable, "<this>");
        c3.h.b0(charSequence, "separator");
        c3.h.b0(charSequence2, "prefix");
        c3.h.b0(charSequence3, "postfix");
        c3.h.b0(charSequence4, "truncated");
        sb.append(charSequence2);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            } else {
                c3.h.G(sb, obj, lVar);
            }
        }
        if (i4 >= 0 && i5 > i4) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String g3(Iterable iterable, String str, String str2, String str3, j3.l lVar, int i4) {
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i4 & 2) != 0 ? "" : str2;
        String str6 = (i4 & 4) != 0 ? "" : str3;
        int i5 = (i4 & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i4 & 16) != 0 ? "..." : null;
        j3.l lVar2 = (i4 & 32) != 0 ? null : lVar;
        c3.h.b0(iterable, "<this>");
        c3.h.b0(str5, "prefix");
        c3.h.b0(str6, "postfix");
        c3.h.b0(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        f3(iterable, sb, str4, str5, str6, i5, charSequence, lVar2);
        String string = sb.toString();
        c3.h.a0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static ArrayList h3(Collection collection, Serializable serializable) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(serializable);
        return arrayList;
    }

    public static final void i3(Iterable iterable, AbstractCollection abstractCollection) {
        c3.h.b0(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List j3(Iterable iterable) {
        ArrayList arrayList;
        c3.h.b0(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        p pVar = p.f75b;
        if (z4) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return pVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return c3.h.u1(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z4) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            i3(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : c3.h.u1(arrayList.get(0));
        }
        return pVar;
    }

    public static Set k3(ArrayList arrayList) {
        c3.h.b0(arrayList, "<this>");
        r rVar = r.f77b;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(c3.h.x1(arrayList.size()));
            i3(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(arrayList.get(0));
        c3.h.a0(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
