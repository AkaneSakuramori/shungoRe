package j1;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3229a;

    public /* synthetic */ y(int i4) {
        this.f3229a = i4;
    }

    public static void a(String str, String str2) {
        if (c3.h.I(str, str2)) {
            return;
        }
        String str3 = c0.f3157t;
        String str4 = String.format("Received state doesn't match. Received %s but expected %s", Arrays.copyOf(new Object[]{str2, str}, 2));
        c3.h.a0(str4, "format(format, *args)");
        Log.e(str3, str4);
        throw new g1.c("access_denied", "The received state is invalid. Try again.");
    }

    public static void b(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }
    }

    public static void c(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x006a A[EDGE_INSN: B:132:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    public static t3.c f(t3.q qVar) {
        int i4;
        int i5;
        int length;
        int length2;
        String string;
        String string2;
        t3.q qVar2 = qVar;
        c3.h.b0(qVar2, "headers");
        int size = qVar.size();
        int i6 = 0;
        boolean z4 = true;
        String str = null;
        boolean z5 = false;
        boolean z6 = false;
        int iX = -1;
        int iX2 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int iX3 = -1;
        int iX4 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i6 < size) {
            String strB = qVar2.b(i6);
            String strD = qVar2.d(i6);
            if (q3.l.U2(strB, "Cache-Control")) {
                if (str == null) {
                    str = strD;
                }
                i5 = 0;
                while (i5 < strD.length()) {
                    length = strD.length();
                    length2 = i5;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            length2 = strD.length();
                            break;
                        }
                        size = size;
                        if (q3.l.S2("=,;", strD.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = size;
                    }
                    String strSubstring = strD.substring(i5, length2);
                    c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = q3.l.t3(strSubstring).toString();
                    if (length2 != strD.length() || strD.charAt(length2) == ',' || strD.charAt(length2) == ';') {
                        i5 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = u3.b.f4761a;
                        int length4 = strD.length();
                        while (true) {
                            if (length3 >= length4) {
                                length3 = strD.length();
                                break;
                            }
                            char cCharAt = strD.charAt(length3);
                            int i7 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length3++;
                            length4 = i7;
                        }
                        if (length3 >= strD.length() || strD.charAt(length3) != '\"') {
                            int length5 = strD.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strD.length();
                                    break;
                                }
                                int i8 = length5;
                                if (q3.l.S2(",;", strD.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i8;
                            }
                            String strSubstring2 = strD.substring(length3, length6);
                            c3.h.a0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            string2 = q3.l.t3(strSubstring2).toString();
                            i5 = length6;
                        } else {
                            int i9 = length3 + 1;
                            int iY2 = q3.l.Y2(strD, '\"', i9, false, 4);
                            string2 = strD.substring(i9, iY2);
                            c3.h.a0(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i5 = iY2 + 1;
                        }
                    }
                    if (q3.l.U2("no-cache", string)) {
                        z5 = true;
                    } else if (q3.l.U2("no-store", string)) {
                        z6 = true;
                    } else if (q3.l.U2("max-age", string)) {
                        iX = u3.b.x(string2, -1);
                    } else if (q3.l.U2("s-maxage", string)) {
                        iX2 = u3.b.x(string2, -1);
                    } else if (q3.l.U2("private", string)) {
                        z7 = true;
                    } else if (q3.l.U2("public", string)) {
                        z8 = true;
                    } else if (q3.l.U2("must-revalidate", string)) {
                        z9 = true;
                    } else if (q3.l.U2("max-stale", string)) {
                        iX3 = u3.b.x(string2, Integer.MAX_VALUE);
                    } else if (q3.l.U2("min-fresh", string)) {
                        iX4 = u3.b.x(string2, -1);
                    } else if (q3.l.U2("only-if-cached", string)) {
                        z10 = true;
                    } else if (q3.l.U2("no-transform", string)) {
                        z11 = true;
                    } else if (q3.l.U2("immutable", string)) {
                        z12 = true;
                    }
                }
                i4 = size;
                i6++;
                qVar2 = qVar;
                size = i4;
            } else {
                if (!q3.l.U2(strB, "Pragma")) {
                    i4 = size;
                }
                i6++;
                qVar2 = qVar;
                size = i4;
            }
            z4 = false;
            i5 = 0;
            while (i5 < strD.length()) {
                length = strD.length();
                length2 = i5;
                while (true) {
                    if (length2 < length) {
                        size = size;
                        length2 = strD.length();
                        break;
                    }
                    size = size;
                    if (q3.l.S2("=,;", strD.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = size;
                }
                String strSubstring3 = strD.substring(i5, length2);
                c3.h.a0(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = q3.l.t3(strSubstring3).toString();
                if (length2 != strD.length()) {
                    i5 = length2 + 1;
                    string2 = null;
                } else {
                    i5 = length2 + 1;
                    string2 = null;
                }
                if (q3.l.U2("no-cache", string)) {
                    z5 = true;
                } else if (q3.l.U2("no-store", string)) {
                    z6 = true;
                } else if (q3.l.U2("max-age", string)) {
                    iX = u3.b.x(string2, -1);
                } else if (q3.l.U2("s-maxage", string)) {
                    iX2 = u3.b.x(string2, -1);
                } else if (q3.l.U2("private", string)) {
                    z7 = true;
                } else if (q3.l.U2("public", string)) {
                    z8 = true;
                } else if (q3.l.U2("must-revalidate", string)) {
                    z9 = true;
                } else if (q3.l.U2("max-stale", string)) {
                    iX3 = u3.b.x(string2, Integer.MAX_VALUE);
                } else if (q3.l.U2("min-fresh", string)) {
                    iX4 = u3.b.x(string2, -1);
                } else if (q3.l.U2("only-if-cached", string)) {
                    z10 = true;
                } else if (q3.l.U2("no-transform", string)) {
                    z11 = true;
                } else if (q3.l.U2("immutable", string)) {
                    z12 = true;
                }
            }
            i4 = size;
            i6++;
            qVar2 = qVar;
            size = i4;
        }
        return new t3.c(z5, z6, iX, iX2, z7, z8, z9, iX3, iX4, z10, z11, z12, !z4 ? null : str);
    }

    public final com.auth0.android.request.internal.b d() {
        if (com.auth0.android.request.internal.b.f1310c != null) {
            com.auth0.android.request.internal.b bVar = com.auth0.android.request.internal.b.f1310c;
            c3.h.X(bVar);
            return bVar;
        }
        synchronized (this) {
            if (com.auth0.android.request.internal.b.f1310c == null) {
                com.auth0.android.request.internal.b.f1310c = new com.auth0.android.request.internal.b(new com.auth0.android.request.internal.d());
            }
        }
        com.auth0.android.request.internal.b bVar2 = com.auth0.android.request.internal.b.f1310c;
        c3.h.X(bVar2);
        return bVar2;
    }

    public final String e(String str, String str2) {
        switch (this.f3229a) {
            case 2:
                return "Organization Id (org_id) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
            default:
                return "Organization Name (org_name) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i4, int i5) {
        this(0);
        this.f3229a = i4;
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
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
