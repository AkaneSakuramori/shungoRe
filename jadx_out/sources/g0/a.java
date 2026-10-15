package g0;

import java.util.List;
import java.util.Locale;
import t3.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2276c;

    public a(int i4) {
        if (i4 == 1) {
            this.f2275b = false;
            this.f2274a = 0;
            List list = j1.j.f3181c;
            this.f2276c = new j1.j(new p(1).f4409a);
            return;
        }
        Locale locale = Locale.getDefault();
        int i5 = m.f2301a;
        this.f2275b = l.a(locale) == 1;
        this.f2276c = c.f2282d;
        this.f2274a = 2;
    }
}
