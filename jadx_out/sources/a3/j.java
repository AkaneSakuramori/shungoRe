package a3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends c3.h {
    public static List Q2(Object[] objArr) {
        c3.h.b0(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        c3.h.a0(listAsList, "asList(this)");
        return listAsList;
    }

    public static int R2(Iterable iterable) {
        c3.h.b0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static void S2(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        c3.h.b0(bArr, "<this>");
        c3.h.b0(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
    }

    public static final void T2(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        c3.h.b0(objArr, "<this>");
        c3.h.b0(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    public static /* synthetic */ void U2(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        T2(objArr, objArr2, i4, i5, i6);
    }

    public static byte[] V2(byte[] bArr, int i4, int i5) {
        c3.h.b0(bArr, "<this>");
        int length = bArr.length;
        if (i5 <= length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            c3.h.a0(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is greater than size (" + length + ").");
    }

    public static ArrayList W2(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object X2(Map map) {
        Object obj = map.get("scope");
        if (obj != null || map.containsKey("scope")) {
            return obj;
        }
        throw new NoSuchElementException("Key scope is missing in the map.");
    }

    public static String Y2(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) ", ");
            }
            c3.h.G(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        c3.h.a0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static char Z2(char[] cArr) {
        c3.h.b0(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Map a3(ArrayList arrayList) {
        q qVar = q.f76b;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c3.h.x1(arrayList.size()));
            c3(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        z2.a aVar = (z2.a) arrayList.get(0);
        c3.h.b0(aVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(aVar.f5504b, aVar.f5505c);
        c3.h.a0(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static Map b3(Map map) {
        c3.h.b0(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? d3(map) : c3.h.F2(map);
        }
        return q.f76b;
    }

    public static final void c3(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2.a aVar = (z2.a) it.next();
            linkedHashMap.put(aVar.f5504b, aVar.f5505c);
        }
    }

    public static LinkedHashMap d3(Map map) {
        c3.h.b0(map, "<this>");
        return new LinkedHashMap(map);
    }
}
