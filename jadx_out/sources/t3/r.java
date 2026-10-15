package t3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4411a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4414d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f4417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4418h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4412b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4413c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4415e = -1;

    public r() {
        ArrayList arrayList = new ArrayList();
        this.f4416f = arrayList;
        arrayList.add("");
    }

    public final void a(String str) {
        d(str, 0, str.length(), false, false);
    }

    public final s b() {
        ArrayList arrayList;
        String strJ;
        String str = this.f4411a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = s.f4419j;
        String strJ2 = f2.e.J(this.f4412b, 0, 0, false, 7);
        String strJ3 = f2.e.J(this.f4413c, 0, 0, false, 7);
        String str2 = this.f4414d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iJ = this.f4415e;
        if (iJ == -1) {
            String str3 = this.f4411a;
            c3.h.X(str3);
            iJ = f2.e.j(str3);
        }
        int i4 = iJ;
        ArrayList<String> arrayList2 = this.f4416f;
        ArrayList arrayList3 = new ArrayList(a3.j.R2(arrayList2));
        for (String str4 : arrayList2) {
            char[] cArr2 = s.f4419j;
            arrayList3.add(f2.e.J(str4, 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f4417g;
        String strJ4 = null;
        if (arrayList4 != null) {
            arrayList = new ArrayList(a3.j.R2(arrayList4));
            for (String str5 : arrayList4) {
                if (str5 != null) {
                    char[] cArr3 = s.f4419j;
                    strJ = f2.e.J(str5, 0, 0, true, 3);
                } else {
                    strJ = null;
                }
                arrayList.add(strJ);
            }
        } else {
            arrayList = null;
        }
        String str6 = this.f4418h;
        if (str6 != null) {
            char[] cArr4 = s.f4419j;
            strJ4 = f2.e.J(str6, 0, 0, false, 7);
        }
        return new s(str, strJ2, strJ3, str2, i4, arrayList3, arrayList, strJ4, toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0230  */
    /* JADX WARN: Code duplicated, block: B:105:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x023f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0251  */
    /* JADX WARN: Code duplicated, block: B:124:0x0288  */
    /* JADX WARN: Code duplicated, block: B:127:0x028e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0387  */
    /* JADX WARN: Code duplicated, block: B:192:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x023c A[EDGE_INSN: B:196:0x023c->B:107:0x023c BREAK  A[LOOP:4: B:103:0x0231->B:198:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final void c(s sVar, String str) {
        int i4;
        byte b5;
        byte b6;
        int i5;
        int iF;
        byte bCharAt;
        ArrayList arrayList;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        boolean z4;
        int i13;
        byte b7;
        boolean z5;
        ArrayList arrayListR;
        char cCharAt2;
        String str3 = str;
        c3.h.b0(str3, "input");
        byte[] bArr = u3.b.f4761a;
        int iM = u3.b.m(0, str.length(), str3);
        int iN = u3.b.n(iM, str.length(), str3);
        char c5 = ':';
        byte b8 = -1;
        if (iN - iM >= 2) {
            char cCharAt3 = str3.charAt(iM);
            if ((c3.h.n0(cCharAt3, 97) >= 0 && c3.h.n0(cCharAt3, 122) <= 0) || (c3.h.n0(cCharAt3, 65) >= 0 && c3.h.n0(cCharAt3, 90) <= 0)) {
                i4 = iM + 1;
                while (true) {
                    if (i4 < iN) {
                        char cCharAt4 = str3.charAt(i4);
                        if (('a' > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                            if (cCharAt4 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i4++;
                    }
                    i4 = -1;
                    break;
                }
            } else {
                i4 = -1;
                break;
            }
        } else {
            i4 = -1;
            break;
        }
        String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i4 != -1) {
            if (q3.l.n3(str3, "https:", iM, true)) {
                this.f4411a = "https";
                iM += 6;
            } else {
                if (!q3.l.n3(str3, "http:", iM, true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str3.substring(0, i4);
                    c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f4411a = "http";
                iM += 5;
            }
        } else {
            if (sVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? q3.m.u3(str3, 6).concat("...") : str3));
            }
            this.f4411a = sVar.f4420a;
        }
        int i14 = iM;
        int i15 = 0;
        while (true) {
            b5 = 47;
            b6 = 92;
            if (i14 >= iN || !((cCharAt2 = str3.charAt(i14)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i15++;
            i14++;
        }
        ArrayList arrayList2 = this.f4416f;
        byte b9 = 63;
        byte b10 = 35;
        if (i15 >= 2 || sVar == null) {
            i5 = iM + i15;
            boolean z6 = false;
            boolean z7 = false;
            while (true) {
                iF = u3.b.f(str3, "@/\\?#", i5, iN);
                if (iF != iN) {
                    bCharAt = str3.charAt(iF);
                } else {
                    bCharAt = b8;
                }
                if (bCharAt == b8 || bCharAt == b10 || bCharAt == b5 || bCharAt == b6 || bCharAt == b9) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z6) {
                        z4 = z6;
                        i13 = iF;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f4413c);
                        sb2.append("%40");
                        char[] cArr = s.f4419j;
                        b7 = b6;
                        sb2.append(f2.e.e(str, i5, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                        this.f4413c = sb2.toString();
                    } else {
                        int iE = u3.b.e(str3, c5, i5, iF);
                        char[] cArr2 = s.f4419j;
                        int i16 = i5;
                        byte b11 = b6;
                        boolean z8 = z6;
                        i13 = iF;
                        String strE = f2.e.e(str, i16, iE, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        if (z7) {
                            strE = this.f4412b + "%40" + strE;
                        }
                        this.f4412b = strE;
                        if (iE != i13) {
                            this.f4413c = f2.e.e(str, iE + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            z5 = true;
                        } else {
                            z5 = z8;
                        }
                        b7 = b11;
                        z4 = z5;
                        z7 = true;
                    }
                    i5 = i13 + 1;
                    b6 = b7;
                    z6 = z4;
                    arrayList2 = arrayList2;
                    str4 = str4;
                    b10 = 35;
                    b5 = 47;
                    b9 = 63;
                    b8 = -1;
                    c5 = ':';
                }
            }
            arrayList = arrayList2;
            str2 = str4;
            i6 = i5;
            while (true) {
                if (i6 >= iF) {
                    i7 = 1;
                    i8 = iF;
                    break;
                }
                cCharAt = str3.charAt(i6);
                if (cCharAt == '[') {
                    i7 = 1;
                    do {
                        i6++;
                        if (i6 < iF) {
                            break;
                        }
                    } while (str3.charAt(i6) != ']');
                } else {
                    i7 = 1;
                    if (cCharAt == ':') {
                        i8 = i6;
                        break;
                    }
                }
                i6 += i7;
            }
            i9 = i8 + 1;
            if (i9 < iF) {
                char[] cArr3 = s.f4419j;
                this.f4414d = r3.q.x(f2.e.J(str3, i5, i8, false, 4));
                i10 = i7;
                try {
                    i12 = Integer.parseInt(f2.e.e(str, i9, iF, "", false, false, false, false, 248));
                    if (i10 <= i12 || i12 >= 65536) {
                        i12 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f4415e = i12;
                if (i12 != -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str3.substring(i9, iF);
                    c3.h.a0(strSubstring2, str2);
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                i11 = 0;
            } else {
                i10 = i7;
                char[] cArr4 = s.f4419j;
                i11 = 0;
                this.f4414d = r3.q.x(f2.e.J(str3, i5, i8, false, 4));
                String str5 = this.f4411a;
                c3.h.X(str5);
                this.f4415e = f2.e.j(str5);
            }
            if (this.f4414d != null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str3.substring(i5, i8);
                c3.h.a0(strSubstring3, str2);
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iF;
        } else if (c3.h.I(sVar.f4420a, this.f4411a)) {
            this.f4412b = sVar.e();
            this.f4413c = sVar.a();
            this.f4414d = sVar.f4423d;
            this.f4415e = sVar.f4424e;
            arrayList2.clear();
            arrayList2.addAll(sVar.c());
            if (iM == iN || str3.charAt(iM) == '#') {
                String strD = sVar.d();
                if (strD != null) {
                    char[] cArr5 = s.f4419j;
                    arrayListR = f2.e.R(f2.e.e(strD, 0, 0, " \"'<>#", true, false, true, false, 211));
                } else {
                    arrayListR = null;
                }
                this.f4417g = arrayListR;
            }
            arrayList = arrayList2;
            i10 = 1;
            i11 = 0;
        } else {
            i5 = iM + i15;
            boolean z9 = false;
            boolean z10 = false;
            while (true) {
                iF = u3.b.f(str3, "@/\\?#", i5, iN);
                if (iF != iN) {
                    bCharAt = str3.charAt(iF);
                } else {
                    bCharAt = b8;
                }
                if (bCharAt == b8) {
                    break;
                } else {
                    break;
                }
            }
            arrayList = arrayList2;
            str2 = str4;
            i6 = i5;
            while (true) {
                if (i6 >= iF) {
                    i7 = 1;
                    i8 = iF;
                    break;
                }
                cCharAt = str3.charAt(i6);
                if (cCharAt == '[') {
                    i7 = 1;
                    do {
                        i6++;
                        if (i6 < iF) {
                            break;
                            break;
                        }
                    } while (str3.charAt(i6) != ']');
                } else {
                    i7 = 1;
                    if (cCharAt == ':') {
                        i8 = i6;
                        break;
                    }
                }
                i6 += i7;
            }
            i9 = i8 + 1;
            if (i9 < iF) {
                char[] cArr6 = s.f4419j;
                this.f4414d = r3.q.x(f2.e.J(str3, i5, i8, false, 4));
                i10 = i7;
                i12 = Integer.parseInt(f2.e.e(str, i9, iF, "", false, false, false, false, 248));
                if (i10 <= i12) {
                    i12 = -1;
                } else {
                    i12 = -1;
                }
                this.f4415e = i12;
                if (i12 != -1) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring4 = str3.substring(i9, iF);
                    c3.h.a0(strSubstring4, str2);
                    sb5.append(strSubstring4);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                i11 = 0;
            } else {
                i10 = i7;
                char[] cArr7 = s.f4419j;
                i11 = 0;
                this.f4414d = r3.q.x(f2.e.J(str3, i5, i8, false, 4));
                String str6 = this.f4411a;
                c3.h.X(str6);
                this.f4415e = f2.e.j(str6);
            }
            if (this.f4414d != null) {
                StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                String strSubstring5 = str3.substring(i5, i8);
                c3.h.a0(strSubstring5, str2);
                sb6.append(strSubstring5);
                sb6.append('\"');
                throw new IllegalArgumentException(sb6.toString().toString());
            }
            iM = iF;
        }
        int iF2 = u3.b.f(str3, "?#", iM, iN);
        if (iM != iF2) {
            char cCharAt5 = str3.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                ArrayList arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iM++;
            } else {
                arrayList.set(arrayList.size() - i10, "");
            }
            int i17 = iM;
            while (i17 < iF2) {
                int iF3 = u3.b.f(str3, "/\\", i17, iF2);
                int i18 = iF3 < iF2 ? i10 : i11;
                int i19 = iN;
                int i20 = i10;
                String str7 = str3;
                d(str, i17, iF3, i18, true);
                i17 = i18 != 0 ? iF3 + 1 : iF3;
                str3 = str7;
                iN = i19;
                i10 = i20;
            }
        }
        int i21 = iN;
        String str8 = str3;
        if (iF2 < i21 && str8.charAt(iF2) == '?') {
            int iE2 = u3.b.e(str8, '#', iF2, i21);
            char[] cArr8 = s.f4419j;
            this.f4417g = f2.e.R(f2.e.e(str, iF2 + 1, iE2, " \"'<>#", true, false, true, false, 208));
            iF2 = iE2;
        }
        if (iF2 >= i21 || str8.charAt(iF2) != '#') {
            return;
        }
        char[] cArr9 = s.f4419j;
        this.f4418h = f2.e.e(str, iF2 + 1, i21, "", true, false, false, true, 176);
    }

    public final void d(String str, int i4, int i5, boolean z4, boolean z5) {
        char[] cArr = s.f4419j;
        String strE = f2.e.e(str, i4, i5, " \"<>^`{}|/\\?#", z5, false, false, false, 240);
        if (c3.h.I(strE, ".") || q3.l.U2(strE, "%2e")) {
            return;
        }
        boolean zI = c3.h.I(strE, "..");
        ArrayList arrayList = this.f4416f;
        if (zI || q3.l.U2(strE, "%2e.") || q3.l.U2(strE, ".%2e") || q3.l.U2(strE, "%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0 && (!arrayList.isEmpty())) {
                arrayList.set(arrayList.size() - 1, "");
                return;
            } else {
                arrayList.add("");
                return;
            }
        }
        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strE);
        } else {
            arrayList.add(strE);
        }
        if (z4) {
            arrayList.add("");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4411a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f4412b.length() > 0 || this.f4413c.length() > 0) {
            sb.append(this.f4412b);
            if (this.f4413c.length() > 0) {
                sb.append(':');
                sb.append(this.f4413c);
            }
            sb.append('@');
        }
        String str2 = this.f4414d;
        if (str2 != null) {
            if (q3.l.S2(str2, ':')) {
                sb.append('[');
                sb.append(this.f4414d);
                sb.append(']');
            } else {
                sb.append(this.f4414d);
            }
        }
        int iJ = this.f4415e;
        if (iJ != -1 || this.f4411a != null) {
            if (iJ == -1) {
                char[] cArr = s.f4419j;
                String str3 = this.f4411a;
                c3.h.X(str3);
                iJ = f2.e.j(str3);
            }
            String str4 = this.f4411a;
            if (str4 != null) {
                char[] cArr2 = s.f4419j;
                if (iJ != f2.e.j(str4)) {
                    sb.append(':');
                    sb.append(iJ);
                }
            } else {
                sb.append(':');
                sb.append(iJ);
            }
        }
        char[] cArr3 = s.f4419j;
        ArrayList arrayList = this.f4416f;
        c3.h.b0(arrayList, "<this>");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append('/');
            sb.append((String) arrayList.get(i4));
        }
        if (this.f4417g != null) {
            sb.append('?');
            char[] cArr4 = s.f4419j;
            ArrayList arrayList2 = this.f4417g;
            c3.h.X(arrayList2);
            f2.e.S(arrayList2, sb);
        }
        if (this.f4418h != null) {
            sb.append('#');
            sb.append(this.f4418h);
        }
        String string = sb.toString();
        c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
