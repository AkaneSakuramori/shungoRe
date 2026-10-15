package q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends j {
    public static boolean R2(CharSequence charSequence, String str, boolean z4) {
        c3.h.b0(charSequence, "<this>");
        return Z2(charSequence, str, 0, z4, 2) >= 0;
    }

    public static boolean S2(CharSequence charSequence, char c5) {
        return Y2(charSequence, c5, 0, false, 2) >= 0;
    }

    public static boolean T2(String str, String str2) {
        c3.h.b0(str, "<this>");
        return str.endsWith(str2);
    }

    public static boolean U2(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int V2(CharSequence charSequence) {
        c3.h.b0(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int W2(int i4, CharSequence charSequence, String str, boolean z4) {
        c3.h.b0(charSequence, "<this>");
        c3.h.b0(str, "string");
        return (z4 || !(charSequence instanceof String)) ? X2(charSequence, str, i4, charSequence.length(), z4, false) : ((String) charSequence).indexOf(str, i4);
    }

    public static final int X2(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5) {
        n3.a aVar;
        if (z5) {
            int iV2 = V2(charSequence);
            if (i4 > iV2) {
                i4 = iV2;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            aVar = new n3.a(i4, i5, -1);
        } else {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            aVar = new n3.c(i4, i5, 1);
        }
        boolean z6 = charSequence instanceof String;
        int i6 = aVar.f3567d;
        int i7 = aVar.f3566c;
        int i8 = aVar.f3565b;
        if (z6 && (charSequence2 instanceof String)) {
            if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
                while (!f3(0, i8, charSequence2.length(), (String) charSequence2, (String) charSequence, z4)) {
                    if (i8 != i7) {
                        i8 += i6;
                    }
                }
                return i8;
            }
        } else if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
            while (!g3(charSequence2, 0, charSequence, i8, charSequence2.length(), z4)) {
                if (i8 != i7) {
                    i8 += i6;
                }
            }
            return i8;
        }
        return -1;
    }

    public static int Y2(CharSequence charSequence, char c5, int i4, boolean z4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        c3.h.b0(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? a3(i4, charSequence, z4, new char[]{c5}) : ((String) charSequence).indexOf(c5, i4);
    }

    public static /* synthetic */ int Z2(CharSequence charSequence, String str, int i4, boolean z4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return W2(i4, charSequence, str, z4);
    }

    public static final int a3(int i4, CharSequence charSequence, boolean z4, char[] cArr) {
        c3.h.b0(charSequence, "<this>");
        c3.h.b0(cArr, "chars");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(a3.j.Z2(cArr), i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        n3.c cVar = new n3.c(i4, V2(charSequence), 1);
        n3.b bVar = new n3.b(i4, cVar.f3566c, cVar.f3567d);
        while (bVar.f3570c) {
            int iB = bVar.b();
            char cCharAt = charSequence.charAt(iB);
            for (char c5 : cArr) {
                if (c3.h.I0(c5, cCharAt, z4)) {
                    return iB;
                }
            }
        }
        return -1;
    }

    public static boolean b3(String str) {
        c3.h.b0(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        Iterable cVar = new n3.c(0, str.length() - 1, 1);
        if ((cVar instanceof Collection) && ((Collection) cVar).isEmpty()) {
            return true;
        }
        Iterator it = cVar.iterator();
        while (((n3.b) it).f3570c) {
            char cCharAt = str.charAt(((n3.b) it).b());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int c3(CharSequence charSequence, char c5, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = V2(charSequence);
        }
        c3.h.b0(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c5, i4);
        }
        char[] cArr = {c5};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(a3.j.Z2(cArr), i4);
        }
        int iV2 = V2(charSequence);
        if (i4 > iV2) {
            i4 = iV2;
        }
        while (-1 < i4) {
            if (c3.h.I0(cArr[0], charSequence.charAt(i4), false)) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static String d3(String str) {
        CharSequence charSequenceSubSequence;
        c3.h.b0(str, "<this>");
        if (3 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(3);
            n3.c cVar = new n3.c(1, 3 - str.length(), 1);
            n3.b bVar = new n3.b(1, cVar.f3566c, cVar.f3567d);
            while (bVar.f3570c) {
                bVar.b();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static c e3(CharSequence charSequence, String[] strArr, boolean z4, int i4) {
        j3(i4);
        return new c(charSequence, 0, i4, new k(a3.j.Q2(strArr), z4, 1));
    }

    public static final boolean f3(int i4, int i5, int i6, String str, String str2, boolean z4) {
        c3.h.b0(str, "<this>");
        c3.h.b0(str2, "other");
        return !z4 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z4, i4, str2, i5, i6);
    }

    public static final boolean g3(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z4) {
        c3.h.b0(charSequence, "<this>");
        c3.h.b0(charSequence2, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!c3.h.I0(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z4)) {
                return false;
            }
        }
        return true;
    }

    public static String h3(String str, String str2) {
        if (!o3(str2, str, false)) {
            return str2;
        }
        String strSubstring = str2.substring(str.length());
        c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String i3(String str, String str2, String str3) {
        c3.h.b0(str, "<this>");
        int iW2 = W2(0, str, str2, false);
        if (iW2 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, iW2);
            sb.append(str3);
            i5 = iW2 + length;
            if (iW2 >= str.length()) {
                break;
            }
            iW2 = W2(iW2 + i4, str, str2, false);
        } while (iW2 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String string = sb.toString();
        c3.h.a0(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static final void j3(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(defpackage.a.e("Limit must be non-negative, but was ", i4).toString());
        }
    }

    public static final List k3(int i4, CharSequence charSequence, String str, boolean z4) {
        j3(i4);
        int length = 0;
        int iW2 = W2(0, charSequence, str, z4);
        if (iW2 == -1 || i4 == 1) {
            return c3.h.u1(charSequence.toString());
        }
        boolean z5 = i4 > 0;
        int i5 = 10;
        if (z5 && i4 <= 10) {
            i5 = i4;
        }
        ArrayList arrayList = new ArrayList(i5);
        do {
            arrayList.add(charSequence.subSequence(length, iW2).toString());
            length = str.length() + iW2;
            if (z5 && arrayList.size() == i4 - 1) {
                break;
            }
            iW2 = W2(length, charSequence, str, z4);
        } while (iW2 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List l3(CharSequence charSequence, char[] cArr) {
        c3.h.b0(charSequence, "<this>");
        boolean z4 = false;
        Object[] objArr = 0;
        if (cArr.length == 1) {
            return k3(0, charSequence, String.valueOf(cArr[0]), false);
        }
        j3(0);
        c cVar = new c(charSequence, 0, 0, new k(cArr, z4, objArr == true ? 1 : 0));
        ArrayList arrayList = new ArrayList(a3.j.R2(new p3.f(cVar)));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(p3(charSequence, (n3.c) it.next()));
        }
        return arrayList;
    }

    public static List m3(CharSequence charSequence, String[] strArr) {
        c3.h.b0(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return k3(0, charSequence, str, false);
            }
        }
        c cVarE3 = e3(charSequence, strArr, false, 0);
        ArrayList arrayList = new ArrayList(a3.j.R2(new p3.f(cVarE3)));
        Iterator it = cVarE3.iterator();
        while (it.hasNext()) {
            arrayList.add(p3(charSequence, (n3.c) it.next()));
        }
        return arrayList;
    }

    public static boolean n3(String str, String str2, int i4, boolean z4) {
        c3.h.b0(str, "<this>");
        return !z4 ? str.startsWith(str2, i4) : f3(i4, 0, str2.length(), str, str2, z4);
    }

    public static boolean o3(String str, String str2, boolean z4) {
        c3.h.b0(str, "<this>");
        c3.h.b0(str2, "prefix");
        return !z4 ? str.startsWith(str2) : f3(0, 0, str2.length(), str, str2, z4);
    }

    public static final String p3(CharSequence charSequence, n3.c cVar) {
        c3.h.b0(charSequence, "<this>");
        c3.h.b0(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f3565b).intValue(), Integer.valueOf(cVar.f3566c).intValue() + 1).toString();
    }

    public static String q3(String str, String str2) {
        c3.h.b0(str2, "delimiter");
        int iZ2 = Z2(str, str2, 0, false, 6);
        if (iZ2 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iZ2, str.length());
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String r3(String str) {
        c3.h.b0(str, "<this>");
        c3.h.b0(str, "missingDelimiterValue");
        int iC3 = c3(str, '.', 0, 6);
        if (iC3 == -1) {
            return str;
        }
        String strSubstring = str.substring(iC3 + 1, str.length());
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String s3(String str, char c5) {
        int iY2 = Y2(str, c5, 0, false, 6);
        if (iY2 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iY2);
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static CharSequence t3(CharSequence charSequence) {
        c3.h.b0(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            char cCharAt = charSequence.charAt(!z4 ? i4 : length);
            boolean z5 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }
}
