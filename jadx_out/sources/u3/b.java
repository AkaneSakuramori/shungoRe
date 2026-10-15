package u3;

import a3.c;
import a3.h;
import a3.p;
import a4.x;
import f2.e;
import f4.g;
import f4.i;
import f4.j;
import f4.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import q3.f;
import q3.l;
import t3.b0;
import t3.c0;
import t3.q;
import t3.s;
import t3.u;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f4762b = e.F(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f4763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f4764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f4765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f4766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4767g;

    static {
        int i4;
        int iCompareTo;
        byte[] bArr = new byte[0];
        f4761a = bArr;
        g gVar = new g();
        gVar.I(bArr, 0, 0);
        long j4 = 0;
        f4763c = new c0(j4, (u) null, gVar);
        if ((j4 | j4) < 0 || j4 > j4 || j4 - j4 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        j jVar = j.f2167e;
        j[] jVarArr = {x.j("efbbbf"), x.j("feff"), x.j("fffe"), x.j("0000ffff"), x.j("ffff0000")};
        ArrayList arrayList = new ArrayList(new h(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            j jVar2 = jVarArr[i5];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        c3.h.b0(objArrCopyOf, "elements");
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new h(objArrCopyOf, true));
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            j jVar3 = jVarArr[i6];
            int i8 = i7 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i9 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 > i9) {
                    i4 = -(i10 + 1);
                    break;
                }
                i4 = (i10 + i9) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i4);
                if (comparable == jVar3) {
                    iCompareTo = 0;
                } else if (comparable == null) {
                    iCompareTo = -1;
                } else {
                    iCompareTo = jVar3 == null ? 1 : comparable.compareTo(jVar3);
                }
                if (iCompareTo < 0) {
                    i10 = i4 + 1;
                } else if (iCompareTo <= 0) {
                    break;
                } else {
                    i9 = i4 - 1;
                }
            }
            arrayList3.set(i4, Integer.valueOf(i7));
            i6++;
            i7 = i8;
        }
        if (((j) arrayList.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            j jVar4 = (j) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                j jVar5 = (j) arrayList.get(i13);
                jVar5.getClass();
                c3.h.b0(jVar4, "prefix");
                if (!jVar5.h(jVar4, jVar4.c())) {
                    break;
                }
                if (jVar5.c() == jVar4.c()) {
                    throw new IllegalArgumentException(("duplicate option: " + jVar5).toString());
                }
                if (((Number) arrayList3.get(i13)).intValue() > ((Number) arrayList3.get(i11)).intValue()) {
                    arrayList.remove(i13);
                    arrayList3.remove(i13);
                } else {
                    i13++;
                }
            }
            i11 = i12;
        }
        g gVar2 = new g();
        x.h(0L, gVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (gVar2.f2166c / ((long) 4))];
        int i14 = 0;
        while (!gVar2.r()) {
            iArr[i14] = gVar2.E();
            i14++;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(jVarArr, 5);
        c3.h.a0(objArrCopyOf2, "copyOf(this, size)");
        f4764d = new o((j[]) objArrCopyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        c3.h.X(timeZone);
        f4765e = timeZone;
        f4766f = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String strH3 = l.h3("okhttp3.", w.class.getName());
        if (strH3.endsWith("Client")) {
            strH3 = strH3.substring(0, strH3.length() - "Client".length());
            c3.h.a0(strH3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        f4767g = strH3;
    }

    public static final boolean a(s sVar, s sVar2) {
        c3.h.b0(sVar, "<this>");
        c3.h.b0(sVar2, "other");
        return c3.h.I(sVar.f4423d, sVar2.f4423d) && sVar.f4424e == sVar2.f4424e && c3.h.I(sVar.f4420a, sVar2.f4420a);
    }

    public static final int b(long j4, TimeUnit timeUnit) {
        if (j4 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        c3.h.b0(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e6) {
            if (!c3.h.I(e6.getMessage(), "bio == null")) {
                throw e6;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c5, int i4, int i5) {
        c3.h.b0(str, "<this>");
        while (i4 < i5) {
            if (str.charAt(i4) == c5) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int f(String str, String str2, int i4, int i5) {
        c3.h.b0(str, "<this>");
        while (i4 < i5) {
            if (l.S2(str2, str.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final boolean g(f4.w wVar, TimeUnit timeUnit) {
        c3.h.b0(wVar, "<this>");
        c3.h.b0(timeUnit, "timeUnit");
        try {
            return t(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        c3.h.b0(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        c3.h.a0(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        c3.h.b0(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                c cVar = new c(strArr2);
                while (cVar.hasNext()) {
                    if (comparator.compare(str, (String) cVar.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(b0 b0Var) {
        String strA = b0Var.f4312g.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        c3.h.b0(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        c3.h.b0(objArrCopyOf, "elements");
        List listUnmodifiableList = Collections.unmodifiableList(objArrCopyOf.length > 0 ? a3.j.Q2(objArrCopyOf) : p.f75b);
        c3.h.a0(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (c3.h.n0(cCharAt, 31) <= 0 || c3.h.n0(cCharAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int m(int i4, int i5, String str) {
        c3.h.b0(str, "<this>");
        while (i4 < i5) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int n(int i4, int i5, String str) {
        c3.h.b0(str, "<this>");
        int i6 = i5 - 1;
        if (i4 <= i6) {
            while (true) {
                char cCharAt = str.charAt(i6);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i6 + 1;
                }
                if (i6 != i4) {
                    i6--;
                }
            }
        }
        return i4;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        c3.h.b0(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        c3.h.b0(str, "name");
        return l.U2(str, "Authorization") || l.U2(str, "Cookie") || l.U2(str, "Proxy-Authorization") || l.U2(str, "Set-Cookie");
    }

    public static final int q(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' > c5 || c5 >= 'G') {
            return -1;
        }
        return c5 - '7';
    }

    public static final Charset r(i iVar, Charset charset) {
        Charset charsetForName;
        c3.h.b0(iVar, "<this>");
        c3.h.b0(charset, "default");
        int iO = iVar.o(f4764d);
        if (iO == -1) {
            return charset;
        }
        if (iO == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            c3.h.a0(charset2, "UTF_8");
            return charset2;
        }
        if (iO == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            c3.h.a0(charset3, "UTF_16BE");
            return charset3;
        }
        if (iO == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            c3.h.a0(charset4, "UTF_16LE");
            return charset4;
        }
        if (iO == 3) {
            Charset charset5 = q3.a.f3886a;
            charsetForName = q3.a.f3888c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                c3.h.a0(charsetForName, "forName(\"UTF-32BE\")");
                q3.a.f3888c = charsetForName;
            }
        } else {
            if (iO != 4) {
                throw new AssertionError();
            }
            Charset charset6 = q3.a.f3886a;
            charsetForName = q3.a.f3887b;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                c3.h.a0(charsetForName, "forName(\"UTF-32LE\")");
                q3.a.f3887b = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int s(i iVar) {
        c3.h.b0(iVar, "<this>");
        return (iVar.B() & 255) | ((iVar.B() & 255) << 16) | ((iVar.B() & 255) << 8);
    }

    public static final boolean t(f4.w wVar, int i4, TimeUnit timeUnit) {
        c3.h.b0(wVar, "<this>");
        c3.h.b0(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = wVar.b().e() ? wVar.b().c() - jNanoTime : Long.MAX_VALUE;
        wVar.b().d(Math.min(jC, timeUnit.toNanos(i4)) + jNanoTime);
        try {
            g gVar = new g();
            while (wVar.f(gVar, 8192L) != -1) {
                gVar.q(gVar.f2166c);
            }
            if (jC == Long.MAX_VALUE) {
                wVar.b().a();
            } else {
                wVar.b().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                wVar.b().a();
            } else {
                wVar.b().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                wVar.b().a();
            } else {
                wVar.b().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final q u(List list) {
        t3.p pVar = new t3.p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a4.c cVar = (a4.c) it.next();
            pVar.a(cVar.f107a.j(), cVar.f108b.j());
        }
        return pVar.b();
    }

    public static final String v(s sVar, boolean z4) {
        c3.h.b0(sVar, "<this>");
        String str = sVar.f4423d;
        if (l.R2(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i4 = sVar.f4424e;
        if (!z4) {
            char[] cArr = s.f4419j;
            if (i4 == e.j(sVar.f4420a)) {
                return str;
            }
        }
        return str + ':' + i4;
    }

    public static final List w(List list) {
        c3.h.b0(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        c3.h.a0(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(String str, int i4) {
        if (str != null) {
            try {
                long j4 = Long.parseLong(str);
                if (j4 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j4 < 0) {
                    return 0;
                }
                return (int) j4;
            } catch (NumberFormatException unused) {
            }
        }
        return i4;
    }

    public static final String y(int i4, int i5, String str) {
        int iM = m(i4, i5, str);
        String strSubstring = str.substring(iM, n(iM, i5, str));
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
