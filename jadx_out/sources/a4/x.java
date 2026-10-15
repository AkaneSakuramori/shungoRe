package a4;

import android.os.Build;
import androidx.fragment.app.k0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class x implements p0, o2.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f229b;

    public /* synthetic */ x(int i4) {
        this.f229b = i4;
    }

    public static final String c(byte[] bArr, byte[][] bArr2, int i4) {
        int i5;
        boolean z4;
        int i6;
        int i7;
        byte[] bArr3 = PublicSuffixDatabase.f3652e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > -1 && bArr[i9] != 10) {
                i9--;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i5 = i10 + i11;
                if (bArr[i5] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i5 - i10;
            int i13 = i4;
            boolean z5 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z5) {
                    i6 = 46;
                    z4 = false;
                } else {
                    byte b5 = bArr2[i13][i14];
                    byte[] bArr4 = u3.b.f4761a;
                    int i16 = b5 & 255;
                    z4 = z5;
                    i6 = i16;
                }
                byte b6 = bArr[i10 + i15];
                byte[] bArr5 = u3.b.f4761a;
                i7 = i6 - (b6 & 255);
                if (i7 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z5 = z4;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    i14 = -1;
                    z5 = true;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset charset = StandardCharsets.UTF_8;
                            c3.h.a0(charset, "UTF_8");
                            return new String(bArr, i10, i12, charset);
                        }
                    }
                }
                i8 = i5 + 1;
            }
            length = i9;
        }
        return null;
    }

    public static ArrayList e(List list) {
        c3.h.b0(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((t3.x) obj) != t3.x.f4478c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a3.j.R2(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t3.x) it.next()).f4485b);
        }
        return arrayList2;
    }

    public static f4.e f() throws InterruptedException {
        f4.e eVar = f4.e.f2159l;
        c3.h.X(eVar);
        f4.e eVar2 = eVar.f2161f;
        if (eVar2 == null) {
            long jNanoTime = System.nanoTime();
            f4.e.f2156i.await(f4.e.f2157j, TimeUnit.MILLISECONDS);
            f4.e eVar3 = f4.e.f2159l;
            c3.h.X(eVar3);
            if (eVar3.f2161f != null || System.nanoTime() - jNanoTime < f4.e.f2158k) {
                return null;
            }
            return f4.e.f2159l;
        }
        long jNanoTime2 = eVar2.f2162g - System.nanoTime();
        if (jNanoTime2 > 0) {
            f4.e.f2156i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        f4.e eVar4 = f4.e.f2159l;
        c3.h.X(eVar4);
        eVar4.f2161f = eVar2.f2161f;
        eVar2.f2161f = null;
        return eVar2;
    }

    public static void h(long j4, f4.g gVar, int i4, ArrayList arrayList, int i5, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        int i9;
        int i10 = i4;
        if (i5 >= i6) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i11 = i5; i11 < i6; i11++) {
            if (((f4.j) arrayList.get(i11)).c() < i10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        f4.j jVar = (f4.j) arrayList.get(i5);
        f4.j jVar2 = (f4.j) arrayList.get(i6 - 1);
        int i12 = -1;
        if (i10 == jVar.c()) {
            int iIntValue = ((Number) arrayList2.get(i5)).intValue();
            int i13 = i5 + 1;
            f4.j jVar3 = (f4.j) arrayList.get(i13);
            i7 = i13;
            i8 = iIntValue;
            jVar = jVar3;
        } else {
            i7 = i5;
            i8 = -1;
        }
        if (jVar.f(i10) == jVar2.f(i10)) {
            int iMin = Math.min(jVar.c(), jVar2.c());
            int i14 = 0;
            for (int i15 = i10; i15 < iMin && jVar.f(i15) == jVar2.f(i15); i15++) {
                i14++;
            }
            long j5 = 4;
            long j6 = (gVar.f2166c / j5) + j4 + ((long) 2) + ((long) i14) + 1;
            gVar.M(-i14);
            gVar.M(i8);
            int i16 = i14 + i10;
            while (i10 < i16) {
                gVar.M(jVar.f(i10) & 255);
                i10++;
            }
            if (i7 + 1 == i6) {
                if (i16 != ((f4.j) arrayList.get(i7)).c()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                gVar.M(((Number) arrayList2.get(i7)).intValue());
                return;
            } else {
                f4.g gVar2 = new f4.g();
                gVar.M(((int) ((gVar2.f2166c / j5) + j6)) * (-1));
                h(j6, gVar2, i16, arrayList, i7, i6, arrayList2);
                gVar.J(gVar2);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i7 + 1; i18 < i6; i18++) {
            if (((f4.j) arrayList.get(i18 - 1)).f(i10) != ((f4.j) arrayList.get(i18)).f(i10)) {
                i17++;
            }
        }
        long j7 = 4;
        long j8 = (gVar.f2166c / j7) + j4 + ((long) 2) + ((long) (i17 * 2));
        gVar.M(i17);
        gVar.M(i8);
        for (int i19 = i7; i19 < i6; i19++) {
            int iF = ((f4.j) arrayList.get(i19)).f(i10);
            if (i19 == i7 || iF != ((f4.j) arrayList.get(i19 - 1)).f(i10)) {
                gVar.M(iF & 255);
            }
        }
        f4.g gVar3 = new f4.g();
        int i20 = i7;
        while (i20 < i6) {
            byte bF = ((f4.j) arrayList.get(i20)).f(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i6) {
                    i9 = i6;
                    break;
                } else {
                    if (bF != ((f4.j) arrayList.get(i22)).f(i10)) {
                        i9 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i21 == i9 && i10 + 1 == ((f4.j) arrayList.get(i20)).c()) {
                gVar.M(((Number) arrayList2.get(i20)).intValue());
            } else {
                gVar.M(((int) ((gVar3.f2166c / j7) + j8)) * i12);
                h(j8, gVar3, i10 + 1, arrayList, i20, i9, arrayList2);
            }
            gVar3 = gVar3;
            i20 = i9;
            i12 = -1;
        }
        gVar.J(gVar3);
    }

    public static byte[] i(List list) {
        c3.h.b0(list, "protocols");
        f4.g gVar = new f4.g();
        for (String str : e(list)) {
            gVar.K(str.length());
            gVar.P(str);
        }
        return gVar.z(gVar.f2166c);
    }

    public static f4.j j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) (g4.b.a(str.charAt(i5 + 1)) + (g4.b.a(str.charAt(i5)) << 4));
        }
        return new f4.j(bArr);
    }

    public static f4.j k(String str) {
        c3.h.b0(str, "<this>");
        byte[] bytes = str.getBytes(q3.a.f3886a);
        c3.h.a0(bytes, "this as java.lang.String).getBytes(charset)");
        f4.j jVar = new f4.j(bytes);
        jVar.f2170d = str;
        return jVar;
    }

    public static f4.j m(byte[] bArr) {
        f4.j jVar = f4.j.f2167e;
        int length = bArr.length;
        c3.h.c0(bArr.length, 0, length);
        return new f4.j(a3.j.V2(bArr, 0, length));
    }

    @Override // androidx.lifecycle.p0
    public n0 a(Class cls) {
        switch (this.f229b) {
            case 0:
                return new k0(true);
            default:
                return new v0.a();
        }
    }

    @Override // o2.n
    public Object d() {
        switch (this.f229b) {
            case 0:
                return new ConcurrentHashMap();
            case 1:
                return new TreeMap();
            case 2:
                return new LinkedHashMap();
            case 3:
                return new o2.m();
            case 4:
                return new TreeSet();
            case 5:
                return new LinkedHashSet();
            case 6:
                return new ArrayDeque();
            case 7:
                return new ArrayList();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    public b4.l g() {
        switch (this.f229b) {
            case 3:
                if (l()) {
                    return new b4.a();
                }
                return null;
            case 4:
                if (l()) {
                    return new b4.c();
                }
                return null;
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    c3.h.a0(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    c3.h.a0(method, "putMethod");
                    c3.h.a0(method2, "getMethod");
                    c3.h.a0(method3, "removeMethod");
                    c3.h.a0(cls3, "clientProviderClass");
                    c3.h.a0(cls4, "serverProviderClass");
                    return new b4.i(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    public boolean l() {
        switch (this.f229b) {
            case 3:
                return b4.a.f1108e;
            case 4:
                return b4.c.f1113f;
            case 5:
                return b4.d.f1117e;
            case 6:
            case 7:
            default:
                b4.l lVar = b4.l.f1135a;
                return c3.h.I("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
            case 8:
                return b4.k.f1133e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i4, int i5) {
        this(0);
        this.f229b = i4;
        switch (i4) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            default:
                break;
        }
    }
}
