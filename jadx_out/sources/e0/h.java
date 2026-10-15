package e0;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1959b = new h(new j(g.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f1960a;

    public h(j jVar) {
        this.f1960a = jVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f1959b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = f.a(strArrSplit[i4]);
        }
        return new h(new j(g.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f1960a.equals(((h) obj).f1960a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1960a.hashCode();
    }

    public final String toString() {
        return this.f1960a.toString();
    }
}
