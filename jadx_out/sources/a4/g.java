package a4;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4.j f140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f143d;

    static {
        f4.j jVar = f4.j.f2167e;
        f140a = x.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f141b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f142c = new String[64];
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            c3.h.a0(binaryString, "toBinaryString(it)");
            String strReplace = u3.b.h("%8s", binaryString).replace(' ', '0');
            c3.h.a0(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i4] = strReplace;
        }
        f143d = strArr;
        String[] strArr2 = f142c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = defpackage.a.h(new StringBuilder(), strArr2[i5], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f142c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i8]);
            sb.append('|');
            strArr3[i9 | 8] = defpackage.a.h(sb, strArr3[i7], "|PADDED");
        }
        int length = f142c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f142c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f143d[i10];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(int i4, int i5, int i6, int i7, boolean z4) {
        String strI3;
        String str;
        String[] strArr = f141b;
        String strH = i6 < strArr.length ? strArr[i6] : u3.b.h("0x%02x", Integer.valueOf(i6));
        if (i7 == 0) {
            strI3 = "";
        } else {
            String[] strArr2 = f143d;
            if (i6 == 2 || i6 == 3) {
                strI3 = strArr2[i7];
            } else if (i6 == 4 || i6 == 6) {
                strI3 = i7 == 1 ? "ACK" : strArr2[i7];
            } else if (i6 == 7 || i6 == 8) {
                strI3 = strArr2[i7];
            } else {
                String[] strArr3 = f142c;
                if (i7 < strArr3.length) {
                    str = strArr3[i7];
                    c3.h.X(str);
                } else {
                    str = strArr2[i7];
                }
                if (i6 != 5 || (i7 & 4) == 0) {
                    strI3 = (i6 != 0 || (i7 & 32) == 0) ? str : q3.l.i3(str, "PRIORITY", "COMPRESSED");
                } else {
                    strI3 = q3.l.i3(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return u3.b.h("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), strH, strI3);
    }
}
