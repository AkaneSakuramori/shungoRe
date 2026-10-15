package y3;

import a3.p;
import a4.x;
import f4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q3.l;
import t3.b0;
import t3.k;
import t3.q;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        j jVar = j.f2167e;
        x.k("\"\\");
        x.k("\t ,=");
    }

    public static final boolean a(b0 b0Var) {
        if (c3.h.I((String) b0Var.f4307b.f2809c, "HEAD")) {
            return false;
        }
        int i4 = b0Var.f4310e;
        return (((i4 >= 100 && i4 < 200) || i4 == 204 || i4 == 304) && u3.b.j(b0Var) == -1 && !l.U2("chunked", b0.a(b0Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2 */
    public static final void b(k kVar, s sVar, q qVar) {
        List list;
        long j4;
        String str;
        int i4;
        String str2;
        t3.j jVar;
        c3.h.b0(kVar, "<this>");
        c3.h.b0(sVar, "url");
        c3.h.b0(qVar, "headers");
        if (kVar == k.f4398b) {
            return;
        }
        Pattern pattern = t3.j.f4385j;
        int size = qVar.size();
        int i5 = 0;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (l.U2("Set-Cookie", qVar.b(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(qVar.d(i6));
            }
        }
        List listUnmodifiableList = p.f75b;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            c3.h.a0(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < size2) {
            String str3 = (String) list.get(i7);
            c3.h.b0(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = u3.b.f4761a;
            char c5 = ';';
            int iE = u3.b.e(str3, ';', i5, str3.length());
            char c6 = '=';
            int iE2 = u3.b.e(str3, '=', i5, iE);
            if (iE2 == iE) {
                i4 = i5;
                jVar = null;
                break;
            }
            String strY = u3.b.y(i5, iE2, str3);
            if (strY.length() == 0 || u3.b.l(strY) != -1) {
                i4 = i5;
                jVar = null;
                break;
            }
            String strY2 = u3.b.y(iE2 + 1, iE, str3);
            if (u3.b.l(strY2) == -1) {
                int i8 = iE + 1;
                int length = str3.length();
                int i9 = i5;
                boolean z4 = i9 == true ? 1 : 0;
                boolean z5 = z4 ? 1 : 0;
                long j5 = -1;
                long jI = 253402300799999L;
                String str4 = null;
                boolean z6 = true;
                String str5 = null;
                boolean z7 = i9;
                while (true) {
                    if (i8 >= length) {
                        if (j5 == Long.MIN_VALUE) {
                            j4 = Long.MIN_VALUE;
                        } else if (j5 != -1) {
                            long j6 = jCurrentTimeMillis + (j5 <= 9223372036854775L ? j5 * ((long) 1000) : Long.MAX_VALUE);
                            j4 = (j6 < jCurrentTimeMillis || j6 > 253402300799999L) ? 253402300799999L : j6;
                        } else {
                            j4 = jI;
                        }
                        String str6 = sVar.f4423d;
                        if (str4 == null) {
                            str = str6;
                        } else if (c3.h.I(str6, str4) || (l.T2(str6, str4) && str6.charAt((str6.length() - str4.length()) - 1) == '.' && !u3.b.f4766f.a(str6))) {
                            str = str4;
                        } else {
                            i4 = 0;
                        }
                        if (str6.length() != str.length() && PublicSuffixDatabase.f3654g.a(str) == null) {
                            jVar = null;
                            i4 = 0;
                            break;
                        }
                        String strSubstring = "/";
                        String str7 = str5;
                        i4 = 0;
                        if (str7 == null || !l.o3(str7, "/", false)) {
                            String strB = sVar.b();
                            int iC3 = l.c3(strB, '/', 0, 6);
                            if (iC3 != 0) {
                                strSubstring = strB.substring(0, iC3);
                                c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            str2 = strSubstring;
                        } else {
                            str2 = str7;
                        }
                        jVar = new t3.j(strY, strY2, j4, str, str2, z7, z4, z5, z6);
                        break;
                    }
                    int iE3 = u3.b.e(str3, c5, i8, length);
                    int iE4 = u3.b.e(str3, c6, i8, iE3);
                    String strY3 = u3.b.y(i8, iE4, str3);
                    String strY4 = iE4 < iE3 ? u3.b.y(iE4 + 1, iE3, str3) : "";
                    if (l.U2(strY3, "expires")) {
                        try {
                            jI = f2.e.I(strY4.length(), strY4);
                            z5 = true;
                        } catch (NumberFormatException | IllegalArgumentException unused) {
                        }
                    } else if (l.U2(strY3, "max-age")) {
                        try {
                            long j7 = Long.parseLong(strY4);
                            j5 = j7 > 0 ? j7 : Long.MIN_VALUE;
                        } catch (NumberFormatException e5) {
                            if (!new q3.f("-?\\d+").a(strY4)) {
                                throw e5;
                            }
                            j5 = l.o3(strY4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        }
                        z5 = true;
                    } else if (l.U2(strY3, "domain")) {
                        if (!(!strY4.endsWith("."))) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        String strX = r3.q.x(l.h3(".", strY4));
                        if (strX == null) {
                            throw new IllegalArgumentException();
                        }
                        str4 = strX;
                        z6 = false;
                    } else if (l.U2(strY3, "path")) {
                        str5 = strY4;
                    } else if (l.U2(strY3, "secure")) {
                        z7 = 1;
                    } else if (l.U2(strY3, "httponly")) {
                        z4 = true;
                    }
                    i8 = iE3 + 1;
                    c5 = ';';
                    c6 = '=';
                    z7 = z7;
                }
            } else {
                i4 = i5;
            }
            jVar = null;
            break;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i7++;
            i5 = i4;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            c3.h.a0(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        listUnmodifiableList.isEmpty();
    }
}
