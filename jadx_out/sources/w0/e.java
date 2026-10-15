package w0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2.e f4861a = new f2.e(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2.e f4862b = new f2.e(27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f4863c = {112, 114, 111, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f4864d = {112, 114, 109, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f4865e = {48, 49, 53, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f4866f = {48, 49, 48, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f4867g = {48, 48, 57, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4868h = {48, 48, 53, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4869i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f4870j = {48, 48, 49, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f4871k = {48, 48, 50, 0};

    public static byte[] a(c[] cVarArr, byte[] bArr) throws IOException {
        int i4 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f4858g * 2) + 7) & (-8)) / 8) + (cVar.f4856e * 2) + b(cVar.f4852a, cVar.f4853b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f4857f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f4867g)) {
            int length2 = cVarArr.length;
            while (i4 < length2) {
                c cVar2 = cVarArr[i4];
                m(byteArrayOutputStream, cVar2, b(cVar2.f4852a, cVar2.f4853b, bArr));
                o(byteArrayOutputStream, cVar2);
                l(byteArrayOutputStream, cVar2);
                n(byteArrayOutputStream, cVar2);
                i4++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                m(byteArrayOutputStream, cVar3, b(cVar3.f4852a, cVar3.f4853b, bArr));
            }
            int length3 = cVarArr.length;
            while (i4 < length3) {
                c cVar4 = cVarArr[i4];
                o(byteArrayOutputStream, cVar4);
                l(byteArrayOutputStream, cVar4);
                n(byteArrayOutputStream, cVar4);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f4869i;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4868h;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return defpackage.a.h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int c(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i4 == 2) {
            return i5;
        }
        if (i4 == 4) {
            return i5 + i6;
        }
        throw new IllegalStateException(defpackage.a.e("Unexpected flag: ", i4));
    }

    public static void d(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static int[] e(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int iE2 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            iE2 += (int) c3.h.e2(byteArrayInputStream, 2);
            iArr[i5] = iE2;
        }
        return iArr;
    }

    public static c[] f(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f4870j;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f4871k)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iE2 = (int) c3.h.e2(fileInputStream, 2);
            byte[] bArrC2 = c3.h.c2(fileInputStream, (int) c3.h.e2(fileInputStream, 4), (int) c3.h.e2(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC2);
            try {
                c[] cVarArrH = h(byteArrayInputStream, bArr2, iE2, cVarArr);
                byteArrayInputStream.close();
                return cVarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f4865e, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iE3 = (int) c3.h.e2(fileInputStream, 1);
        byte[] bArrC3 = c3.h.c2(fileInputStream, (int) c3.h.e2(fileInputStream, 4), (int) c3.h.e2(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC3);
        try {
            c[] cVarArrG = g(byteArrayInputStream2, iE3, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] g(ByteArrayInputStream byteArrayInputStream, int i4, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iE2 = (int) c3.h.e2(byteArrayInputStream, 2);
            iArr[i5] = (int) c3.h.e2(byteArrayInputStream, 2);
            strArr[i5] = new String(c3.h.a2(byteArrayInputStream, iE2), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            c cVar = cVarArr[i6];
            if (!cVar.f4853b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            cVar.f4856e = i7;
            cVar.f4859h = e(byteArrayInputStream, i7);
        }
        return cVarArr;
    }

    public static c[] h(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            c3.h.e2(byteArrayInputStream, 2);
            String str = new String(c3.h.a2(byteArrayInputStream, (int) c3.h.e2(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jE2 = c3.h.e2(byteArrayInputStream, 4);
            int iE2 = (int) c3.h.e2(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i6 = 0; i6 < cVarArr.length; i6++) {
                    if (cVarArr[i6].f4853b.equals(strSubstring)) {
                        cVar = cVarArr[i6];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f4855d = jE2;
            int[] iArrE = e(byteArrayInputStream, iE2);
            if (Arrays.equals(bArr, f4869i)) {
                cVar.f4856e = iE2;
                cVar.f4859h = iArrE;
            }
        }
        return cVarArr;
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f4866f)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iE2 = (int) c3.h.e2(fileInputStream, 1);
        byte[] bArrC2 = c3.h.c2(fileInputStream, (int) c3.h.e2(fileInputStream, 4), (int) c3.h.e2(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream, str, iE2);
            byteArrayInputStream.close();
            return cVarArrJ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, String str, int i4) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iE2 = (int) c3.h.e2(byteArrayInputStream, 2);
            int iE3 = (int) c3.h.e2(byteArrayInputStream, 2);
            cVarArr[i5] = new c(str, new String(c3.h.a2(byteArrayInputStream, iE2), StandardCharsets.UTF_8), c3.h.e2(byteArrayInputStream, 4), iE3, (int) c3.h.e2(byteArrayInputStream, 4), (int) c3.h.e2(byteArrayInputStream, 4), new int[iE3], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            c cVar = cVarArr[i6];
            int iAvailable = byteArrayInputStream.available() - cVar.f4857f;
            int iE4 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f4860i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iE4 += (int) c3.h.e2(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iE4), 1);
                for (int iE5 = (int) c3.h.e2(byteArrayInputStream, 2); iE5 > 0; iE5--) {
                    c3.h.e2(byteArrayInputStream, 2);
                    int iE6 = (int) c3.h.e2(byteArrayInputStream, 1);
                    if (iE6 != 6 && iE6 != 7) {
                        while (iE6 > 0) {
                            c3.h.e2(byteArrayInputStream, 1);
                            for (int iE7 = (int) c3.h.e2(byteArrayInputStream, 1); iE7 > 0; iE7--) {
                                c3.h.e2(byteArrayInputStream, 2);
                            }
                            iE6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f4859h = e(byteArrayInputStream, cVar.f4856e);
            int i7 = cVar.f4858g;
            BitSet bitSetValueOf = BitSet.valueOf(c3.h.a2(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = bitSetValueOf.get(c(2, i8, i7)) ? 2 : 0;
                if (bitSetValueOf.get(c(4, i8, i7))) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean k(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f4865e;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f4866f;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(cVarArr, bArr3);
                c3.h.O2(byteArrayOutputStream, cVarArr.length, 1);
                c3.h.O2(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrO0 = c3.h.o0(bArrA);
                c3.h.O2(byteArrayOutputStream, bArrO0.length, 4);
                byteArrayOutputStream.write(bArrO0);
                return true;
            }
            byte[] bArr4 = f4868h;
            if (Arrays.equals(bArr, bArr4)) {
                c3.h.O2(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f4860i.size() * 4;
                    String strB = b(cVar.f4852a, cVar.f4853b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    c3.h.P2(byteArrayOutputStream, strB.getBytes(charset).length);
                    c3.h.P2(byteArrayOutputStream, cVar.f4859h.length);
                    c3.h.O2(byteArrayOutputStream, size, 4);
                    c3.h.O2(byteArrayOutputStream, cVar.f4854c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = cVar.f4860i.keySet().iterator();
                    while (it.hasNext()) {
                        c3.h.P2(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        c3.h.P2(byteArrayOutputStream, 0);
                    }
                    for (int i5 : cVar.f4859h) {
                        c3.h.P2(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f4867g;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(cVarArr, bArr5);
                c3.h.O2(byteArrayOutputStream, cVarArr.length, 1);
                c3.h.O2(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrO1 = c3.h.o0(bArrA2);
                c3.h.O2(byteArrayOutputStream, bArrO1.length, 4);
                byteArrayOutputStream.write(bArrO1);
                return true;
            }
            byte[] bArr6 = f4869i;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            c3.h.P2(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strB2 = b(cVar2.f4852a, cVar2.f4853b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                c3.h.P2(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f4860i;
                c3.h.P2(byteArrayOutputStream, treeMap.size());
                c3.h.P2(byteArrayOutputStream, cVar2.f4859h.length);
                c3.h.O2(byteArrayOutputStream, cVar2.f4854c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    c3.h.P2(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : cVar2.f4859h) {
                    c3.h.P2(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            c3.h.P2(byteArrayOutputStream2, cVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (c cVar3 : cVarArr) {
                c3.h.O2(byteArrayOutputStream2, cVar3.f4854c, 4);
                c3.h.O2(byteArrayOutputStream2, cVar3.f4855d, 4);
                c3.h.O2(byteArrayOutputStream2, cVar3.f4858g, 4);
                String strB3 = b(cVar3.f4852a, cVar3.f4853b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                c3.h.P2(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < cVarArr.length; i10++) {
                try {
                    c cVar4 = cVarArr[i10];
                    c3.h.P2(byteArrayOutputStream3, i10);
                    c3.h.P2(byteArrayOutputStream3, cVar4.f4856e);
                    i9 = i9 + 4 + (cVar4.f4856e * 2);
                    l(byteArrayOutputStream3, cVar4);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i11];
                    Iterator it3 = cVar5.f4860i.entrySet().iterator();
                    int iIntValue = i4;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        n(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            o(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            c3.h.P2(byteArrayOutputStream4, i11);
                            int length3 = byteArray3.length + i7 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            c3.h.O2(byteArrayOutputStream4, length3, 4);
                            c3.h.P2(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length3;
                            i11++;
                            arrayList3 = arrayList4;
                            i4 = 0;
                            i7 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(lVar3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + ((long) (arrayList2.size() * 16));
            c3.h.O2(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i14);
                c3.h.O2(byteArrayOutputStream, defpackage.a.d(lVar4.f4880a), 4);
                c3.h.O2(byteArrayOutputStream, size2, 4);
                boolean z4 = lVar4.f4882c;
                byte[] bArr7 = lVar4.f4881b;
                if (z4) {
                    long length4 = bArr7.length;
                    byte[] bArrO2 = c3.h.o0(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrO2);
                    c3.h.O2(byteArrayOutputStream, bArrO2.length, 4);
                    c3.h.O2(byteArrayOutputStream, length4, 4);
                    length = bArrO2.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    c3.h.O2(byteArrayOutputStream, bArr7.length, 4);
                    c3.h.O2(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int iIntValue = 0;
        for (int i4 : cVar.f4859h) {
            Integer numValueOf = Integer.valueOf(i4);
            c3.h.P2(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        c3.h.P2(byteArrayOutputStream, str.getBytes(charset).length);
        c3.h.P2(byteArrayOutputStream, cVar.f4856e);
        c3.h.O2(byteArrayOutputStream, cVar.f4857f, 4);
        c3.h.O2(byteArrayOutputStream, cVar.f4854c, 4);
        c3.h.O2(byteArrayOutputStream, cVar.f4858g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f4858g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f4860i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = iIntValue2 & 2;
            int i5 = cVar.f4858g;
            if (i4 != 0) {
                int iC = c(2, iIntValue, i5);
                int i6 = iC / 8;
                bArr[i6] = (byte) ((1 << (iC % 8)) | bArr[i6]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iC2 = c(4, iIntValue, i5);
                int i7 = iC2 / 8;
                bArr[i7] = (byte) ((1 << (iC2 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i4 = 0;
        for (Map.Entry entry : cVar.f4860i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                c3.h.P2(byteArrayOutputStream, iIntValue - i4);
                c3.h.P2(byteArrayOutputStream, 0);
                i4 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018c A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #19 {all -> 0x0189, blocks: (B:91:0x0167, B:93:0x0173, B:104:0x018c, B:105:0x0191), top: B:247:0x0167, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x019e A[Catch: IllegalStateException -> 0x0182, IOException -> 0x0184, FileNotFoundException -> 0x0187, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x0187, IOException -> 0x0184, IllegalStateException -> 0x0182, blocks: (B:89:0x015f, B:94:0x017d, B:113:0x019e, B:111:0x019b, B:110:0x0198, B:91:0x0167, B:93:0x0173, B:104:0x018c, B:105:0x0191, B:106:0x0192), top: B:263:0x015f, inners: #19, #27 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d8 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #2 {all -> 0x01e7, blocks: (B:130:0x01cc, B:132:0x01d8, B:141:0x01ea), top: B:228:0x01cc, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ea A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01e7, blocks: (B:130:0x01cc, B:132:0x01d8, B:141:0x01ea), top: B:228:0x01cc, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0208  */
    /* JADX WARN: Code duplicated, block: B:157:0x0212  */
    /* JADX WARN: Code duplicated, block: B:158:0x0216  */
    /* JADX WARN: Code duplicated, block: B:166:0x0230 A[Catch: all -> 0x0253, TRY_LEAVE, TryCatch #25 {all -> 0x0253, blocks: (B:163:0x0228, B:164:0x022a, B:166:0x0230), top: B:250:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0282  */
    /* JADX WARN: Code duplicated, block: B:211:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x028b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0295  */
    /* JADX WARN: Code duplicated, block: B:247:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #19 {all -> 0x0189, blocks: (B:91:0x0167, B:93:0x0173, B:104:0x018c, B:105:0x0191), top: B:247:0x0167, outer: #29 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void p(Context context, j.a aVar, d dVar, boolean z4) throws Throwable {
        ?? A;
        IOException iOException;
        int i4;
        c[] cVarArrI;
        c[] cVarArr;
        b bVar;
        d dVar2;
        c[] cVarArr2;
        ?? r6;
        byte[] bArr;
        ?? r7;
        boolean z5;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr2;
        int i5;
        ?? r8;
        ?? r11;
        byte[] bArr3;
        ByteArrayOutputStream byteArrayOutputStream;
        int i6;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j4 = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z6 = j4 == packageInfo.lastUpdateTime;
                            if (z6) {
                                dVar.t(2, null);
                            }
                            if (z6) {
                                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                                k.c(context, false);
                                return;
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i7 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, aVar, dVar, name, file2);
            byte[] bArr4 = bVar2.f4846c;
            if (bArr4 == null) {
                bVar2.b(3, Integer.valueOf(i7));
            } else if (file2.canWrite()) {
                bVar2.f4849f = true;
                byte[] bArr5 = f4863c;
                try {
                    A = bVar2.a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e5) {
                    dVar.t(6, e5);
                    A = 0;
                } catch (IOException e6) {
                    dVar.t(7, e6);
                    A = 0;
                }
                try {
                    if (A != 0) {
                        try {
                            if (!Arrays.equals(bArr5, c3.h.a2(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArrI = i(A, c3.h.a2(A, 4), bVar2.f4848e);
                            try {
                                A.close();
                                A = A;
                            } catch (IOException e7) {
                                IOException iOException2 = e7;
                                dVar.t(7, iOException2);
                                A = iOException2;
                            }
                            bVar2.f4850g = cVarArrI;
                        } catch (IOException e8) {
                            i4 = 7;
                            dVar.t(7, e8);
                            try {
                                A.close();
                            } catch (IOException e9) {
                                iOException = e9;
                                dVar.t(i4, iOException);
                                cVarArrI = null;
                                A = A;
                                bVar2.f4850g = cVarArrI;
                                cVarArr = bVar2.f4850g;
                                if (cVarArr != null) {
                                    i6 = Build.VERSION.SDK_INT;
                                    A = 33;
                                    A = 33;
                                    A = 33;
                                    if (i6 <= 33) {
                                        switch (i6) {
                                            case 31:
                                            case 32:
                                            case 33:
                                                try {
                                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        try {
                                                            zEquals = Arrays.equals(f4864d, c3.h.a2(fileInputStreamA, 4));
                                                            if (!zEquals) {
                                                                throw new IllegalStateException("Invalid magic");
                                                            }
                                                            bVar2.f4850g = f(fileInputStreamA, c3.h.a2(fileInputStreamA, 4), bArr4, cVarArr);
                                                            fileInputStreamA.close();
                                                            bVar = bVar2;
                                                            A = zEquals;
                                                        } catch (Throwable th4) {
                                                            try {
                                                                fileInputStreamA.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        bVar = null;
                                                    }
                                                } catch (FileNotFoundException e10) {
                                                    dVar.t(9, e10);
                                                    bVar = null;
                                                } catch (IOException e11) {
                                                    dVar.t(7, e11);
                                                    bVar = null;
                                                } catch (IllegalStateException e12) {
                                                    bVar2.f4850g = null;
                                                    dVar.t(8, e12);
                                                    bVar = null;
                                                }
                                                if (bVar == null) {
                                                    bVar = bVar2;
                                                }
                                                break;
                                            default:
                                                bVar = bVar2;
                                                break;
                                        }
                                    } else {
                                        bVar = bVar2;
                                    }
                                } else {
                                    bVar = bVar2;
                                }
                                dVar2 = bVar.f4845b;
                                cVarArr2 = bVar.f4850g;
                                r6 = A;
                                if (cVarArr2 != null) {
                                    if (!bVar.f4849f) {
                                        r6 = bArr3;
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        r6 = bArr3;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr5);
                                            byteArrayOutputStream.write(bArr3);
                                            if (k(byteArrayOutputStream, bArr3, cVarArr2)) {
                                                bVar.f4851h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bVar.f4850g = null;
                                                r6 = bArr3;
                                            } else {
                                                dVar2.t(5, null);
                                                bVar.f4850g = null;
                                                byteArrayOutputStream.close();
                                                r6 = bArr3;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e13) {
                                        dVar2.t(7, e13);
                                    } catch (IllegalStateException e14) {
                                        dVar2.t(8, e14);
                                    }
                                }
                                r6 = bArr3;
                                bArr = bVar.f4851h;
                                if (bArr == null) {
                                    z5 = false;
                                    r8 = 1;
                                } else {
                                    try {
                                        if (!bVar.f4849f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    fileOutputStream = new FileOutputStream(bVar.f4847d);
                                                    try {
                                                        try {
                                                            bArr2 = new byte[512];
                                                            while (true) {
                                                                i5 = byteArrayInputStream.read(bArr2);
                                                                if (i5 > 0) {
                                                                    fileOutputStream.write(bArr2, 0, i5);
                                                                } else {
                                                                    r8 = 1;
                                                                    try {
                                                                        bVar.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar.f4851h = null;
                                                                        bVar.f4850g = null;
                                                                        z5 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e15) {
                                                e = e15;
                                                r6 = 1;
                                                bVar.b(6, e);
                                                r7 = r6;
                                                bVar.f4851h = null;
                                                bVar.f4850g = null;
                                                z5 = false;
                                                r8 = r7;
                                            } catch (IOException e16) {
                                                e = e16;
                                                r6 = 1;
                                                bVar.b(7, e);
                                                r7 = r6;
                                                bVar.f4851h = null;
                                                bVar.f4850g = null;
                                                z5 = false;
                                                r8 = r7;
                                            }
                                        } catch (FileNotFoundException e17) {
                                            e = e17;
                                            bVar.b(6, e);
                                            r7 = r6;
                                            bVar.f4851h = null;
                                            bVar.f4850g = null;
                                            z5 = false;
                                            r8 = r7;
                                        } catch (IOException e18) {
                                            e = e18;
                                            bVar.b(7, e);
                                            r7 = r6;
                                            bVar.f4851h = null;
                                            bVar.f4850g = null;
                                            z5 = false;
                                            r8 = r7;
                                        }
                                    } catch (Throwable th15) {
                                        bVar.f4851h = null;
                                        bVar.f4850g = null;
                                        throw th15;
                                    }
                                }
                                if (z5) {
                                    d(packageInfo, filesDir);
                                }
                                if (!z5) {
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                }
                                k.c(context, r11);
                            }
                            cVarArrI = null;
                            A = A;
                        } catch (IllegalStateException e19) {
                            try {
                                dVar.t(8, e19);
                                try {
                                    A.close();
                                } catch (IOException e20) {
                                    iOException = e20;
                                    i4 = 7;
                                    dVar.t(i4, iOException);
                                    cVarArrI = null;
                                    A = A;
                                    bVar2.f4850g = cVarArrI;
                                    cVarArr = bVar2.f4850g;
                                    if (cVarArr != null) {
                                        i6 = Build.VERSION.SDK_INT;
                                        A = 33;
                                        A = 33;
                                        A = 33;
                                        if (i6 <= 33) {
                                            switch (i6) {
                                                case 31:
                                                case 32:
                                                case 33:
                                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        zEquals = Arrays.equals(f4864d, c3.h.a2(fileInputStreamA, 4));
                                                        if (!zEquals) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        bVar2.f4850g = f(fileInputStreamA, c3.h.a2(fileInputStreamA, 4), bArr4, cVarArr);
                                                        fileInputStreamA.close();
                                                        bVar = bVar2;
                                                        A = zEquals;
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        bVar = null;
                                                    }
                                                    if (bVar == null) {
                                                        bVar = bVar2;
                                                    }
                                                    break;
                                                default:
                                                    bVar = bVar2;
                                                    break;
                                            }
                                        } else {
                                            bVar = bVar2;
                                        }
                                    } else {
                                        bVar = bVar2;
                                    }
                                    dVar2 = bVar.f4845b;
                                    cVarArr2 = bVar.f4850g;
                                    r6 = A;
                                    if (cVarArr2 != null) {
                                        if (!bVar.f4849f) {
                                            r6 = bArr3;
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        r6 = bArr3;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr5);
                                        byteArrayOutputStream.write(bArr3);
                                        if (k(byteArrayOutputStream, bArr3, cVarArr2)) {
                                            dVar2.t(5, null);
                                            bVar.f4850g = null;
                                            byteArrayOutputStream.close();
                                            r6 = bArr3;
                                        } else {
                                            bVar.f4851h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bVar.f4850g = null;
                                            r6 = bArr3;
                                        }
                                    }
                                    r6 = bArr3;
                                    bArr = bVar.f4851h;
                                    if (bArr == null) {
                                        if (!bVar.f4849f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        fileOutputStream = new FileOutputStream(bVar.f4847d);
                                        bArr2 = new byte[512];
                                        while (true) {
                                            i5 = byteArrayInputStream.read(bArr2);
                                            if (i5 > 0) {
                                                fileOutputStream.write(bArr2, 0, i5);
                                            } else {
                                                r8 = 1;
                                                bVar.b(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                bVar.f4851h = null;
                                                bVar.f4850g = null;
                                                z5 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z5 = false;
                                    r8 = 1;
                                    if (z5) {
                                        d(packageInfo, filesDir);
                                    }
                                    if (!z5) {
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                    }
                                    k.c(context, r11);
                                }
                                cVarArrI = null;
                                A = A;
                            } catch (Throwable th16) {
                                th = th16;
                                Throwable th17 = th;
                                try {
                                    A.close();
                                    throw th17;
                                } catch (IOException e21) {
                                    dVar.t(7, e21);
                                    throw th17;
                                }
                            }
                        }
                    }
                    cVarArr = bVar2.f4850g;
                    if (cVarArr != null) {
                        i6 = Build.VERSION.SDK_INT;
                        A = 33;
                        A = 33;
                        A = 33;
                        if (i6 <= 33) {
                            switch (i6) {
                                case 31:
                                case 32:
                                case 33:
                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA != null) {
                                        zEquals = Arrays.equals(f4864d, c3.h.a2(fileInputStreamA, 4));
                                        if (!zEquals) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f4850g = f(fileInputStreamA, c3.h.a2(fileInputStreamA, 4), bArr4, cVarArr);
                                        fileInputStreamA.close();
                                        bVar = bVar2;
                                        A = zEquals;
                                    } else {
                                        if (fileInputStreamA != null) {
                                            fileInputStreamA.close();
                                        }
                                        bVar = null;
                                    }
                                    if (bVar == null) {
                                        bVar = bVar2;
                                    }
                                    break;
                                default:
                                    bVar = bVar2;
                                    break;
                            }
                        } else {
                            bVar = bVar2;
                        }
                    } else {
                        bVar = bVar2;
                    }
                    dVar2 = bVar.f4845b;
                    cVarArr2 = bVar.f4850g;
                    r6 = A;
                    if (cVarArr2 != null && (bArr3 = bVar.f4846c) != null) {
                        if (!bVar.f4849f) {
                            r6 = bArr3;
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        r6 = bArr3;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr5);
                        byteArrayOutputStream.write(bArr3);
                        if (k(byteArrayOutputStream, bArr3, cVarArr2)) {
                            dVar2.t(5, null);
                            bVar.f4850g = null;
                            byteArrayOutputStream.close();
                            r6 = bArr3;
                        } else {
                            bVar.f4851h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar.f4850g = null;
                            r6 = bArr3;
                        }
                    }
                    r6 = bArr3;
                    bArr = bVar.f4851h;
                    if (bArr == null) {
                        if (!bVar.f4849f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        fileOutputStream = new FileOutputStream(bVar.f4847d);
                        bArr2 = new byte[512];
                        while (true) {
                            i5 = byteArrayInputStream.read(bArr2);
                            if (i5 > 0) {
                                fileOutputStream.write(bArr2, 0, i5);
                            } else {
                                r8 = 1;
                                bVar.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                bVar.f4851h = null;
                                bVar.f4850g = null;
                                z5 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z5 = false;
                    r8 = 1;
                    if (z5) {
                        d(packageInfo, filesDir);
                    }
                    if (!z5 && z4) {
                        r11 = r8;
                    }
                    k.c(context, r11);
                } catch (Throwable th18) {
                    th = th18;
                }
            } else {
                bVar2.b(4, null);
            }
            r11 = 0;
            k.c(context, r11);
        } catch (PackageManager.NameNotFoundException e22) {
            dVar.t(7, e22);
            k.c(context, false);
        }
    }
}
