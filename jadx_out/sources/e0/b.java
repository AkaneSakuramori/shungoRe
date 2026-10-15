package e0;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i4 = Build.VERSION.SDK_INT;
        a aVar = a.f1954a;
        if (i4 >= 30) {
            aVar.a(30);
        }
        if (i4 >= 30) {
            aVar.a(31);
        }
        if (i4 >= 30) {
            aVar.a(33);
        }
        if (i4 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 32) {
                String str = Build.VERSION.CODENAME;
                c3.h.a0(str, "CODENAME");
                if (!c3.h.I("REL", str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    c3.h.a0(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    c3.h.a0(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
