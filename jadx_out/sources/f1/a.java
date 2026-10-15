package f1;

import c3.h;
import f2.e;
import java.util.Arrays;
import java.util.Locale;
import q3.l;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f2026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.a f2027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1.a f2028d = new k1.a();

    public a(String str, String str2) {
        this.f2025a = str;
        s sVarA = a(str2);
        this.f2026b = sVarA;
        if (sVarA != null) {
            a(null);
            this.f2027c = new m1.a();
        } else {
            String str3 = String.format("Invalid domain url: '%s'", Arrays.copyOf(new Object[]{str2}, 1));
            h.a0(str3, "format(format, *args)");
            throw new IllegalArgumentException(str3.toString());
        }
    }

    public static s a(String str) {
        if (str == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        h.a0(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!(!l.o3(lowerCase, "http://", false))) {
            throw new IllegalArgumentException(defpackage.a.g("Invalid domain url: '", str, "'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used.").toString());
        }
        if (!l.o3(lowerCase, "https://", false)) {
            lowerCase = "https://".concat(lowerCase);
        }
        char[] cArr = s.f4419j;
        h.b0(lowerCase, "<this>");
        try {
            return e.q(lowerCase);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
