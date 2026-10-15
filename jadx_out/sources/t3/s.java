package t3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f4419j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4428i;

    public s(String str, String str2, String str3, String str4, int i4, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f4420a = str;
        this.f4421b = str2;
        this.f4422c = str3;
        this.f4423d = str4;
        this.f4424e = i4;
        this.f4425f = arrayList2;
        this.f4426g = str5;
        this.f4427h = str6;
        this.f4428i = c3.h.I(str, "https");
    }

    public final String a() {
        if (this.f4422c.length() == 0) {
            return "";
        }
        int length = this.f4420a.length() + 3;
        String str = this.f4427h;
        String strSubstring = str.substring(q3.l.Y2(str, ':', length, false, 4) + 1, q3.l.Y2(str, '@', 0, false, 6));
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f4420a.length() + 3;
        String str = this.f4427h;
        int iY2 = q3.l.Y2(str, '/', length, false, 4);
        String strSubstring = str.substring(iY2, u3.b.f(str, "?#", iY2, str.length()));
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f4420a.length() + 3;
        String str = this.f4427h;
        int iY2 = q3.l.Y2(str, '/', length, false, 4);
        int iF = u3.b.f(str, "?#", iY2, str.length());
        ArrayList arrayList = new ArrayList();
        while (iY2 < iF) {
            int i4 = iY2 + 1;
            int iE = u3.b.e(str, '/', i4, iF);
            String strSubstring = str.substring(i4, iE);
            c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iY2 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f4425f == null) {
            return null;
        }
        String str = this.f4427h;
        int iY2 = q3.l.Y2(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iY2, u3.b.e(str, '#', iY2, str.length()));
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f4421b.length() == 0) {
            return "";
        }
        int length = this.f4420a.length() + 3;
        String str = this.f4427h;
        String strSubstring = str.substring(length, u3.b.f(str, ":@", length, str.length()));
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && c3.h.I(((s) obj).f4427h, this.f4427h);
    }

    public final r f() {
        r rVar = new r();
        String str = this.f4420a;
        rVar.f4411a = str;
        rVar.f4412b = e();
        rVar.f4413c = a();
        rVar.f4414d = this.f4423d;
        int iJ = f2.e.j(str);
        int i4 = this.f4424e;
        if (i4 == iJ) {
            i4 = -1;
        }
        rVar.f4415e = i4;
        ArrayList arrayList = rVar.f4416f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        rVar.f4417g = strD != null ? f2.e.R(f2.e.e(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f4426g != null) {
            String str2 = this.f4427h;
            strSubstring = str2.substring(q3.l.Y2(str2, '#', 0, false, 6) + 1);
            c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        rVar.f4418h = strSubstring;
        return rVar;
    }

    public final String g() {
        r rVar;
        try {
            rVar = new r();
            rVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        c3.h.X(rVar);
        rVar.f4412b = f2.e.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        rVar.f4413c = f2.e.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return rVar.b().f4427h;
    }

    public final URI h() {
        String strReplaceAll;
        r rVarF = f();
        String str = rVarF.f4414d;
        if (str != null) {
            strReplaceAll = new q3.f("[\"<>^`{|}]").f3902b.matcher(str).replaceAll("");
            c3.h.a0(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            strReplaceAll = null;
        }
        rVarF.f4414d = strReplaceAll;
        ArrayList arrayList = rVarF.f4416f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.set(i4, f2.e.e((String) arrayList.get(i4), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = rVarF.f4417g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str2 = (String) arrayList2.get(i5);
                arrayList2.set(i5, str2 != null ? f2.e.e(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = rVarF.f4418h;
        rVarF.f4418h = str3 != null ? f2.e.e(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = rVarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            try {
                String strReplaceAll2 = new q3.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f3902b.matcher(string).replaceAll("");
                c3.h.a0(strReplaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI uriCreate = URI.create(strReplaceAll2);
                c3.h.a0(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    public final int hashCode() {
        return this.f4427h.hashCode();
    }

    public final String toString() {
        return this.f4427h;
    }
}
