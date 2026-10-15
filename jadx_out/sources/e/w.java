package e;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static e0.h b(Configuration configuration) {
        return e0.h.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(e0.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((e0.j) hVar.f1960a).f1961a.toLanguageTags()));
    }

    public static void d(Configuration configuration, e0.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((e0.j) hVar.f1960a).f1961a.toLanguageTags()));
    }
}
