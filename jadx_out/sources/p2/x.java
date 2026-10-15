package p2;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final com.auth0.android.request.internal.i A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f3841a = a(Class.class, new m2.j(11).a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f3842b = a(BitSet.class, new m2.j(20).a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2.j f3843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f3844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f3845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f3846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f3847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f3848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f3849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f3850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m2.j f3851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f3852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m2.j f3853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m2.j f3854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f3855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f3856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f3857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f3858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f3859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f3860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u f3861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f3862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f3863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f3864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m2.j f3865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f3866z;

    static {
        m2.j jVar = new m2.j(21);
        f3843c = new m2.j(22);
        f3844d = b(Boolean.TYPE, Boolean.class, jVar);
        f3845e = b(Byte.TYPE, Byte.class, new m2.j(23));
        f3846f = b(Short.TYPE, Short.class, new m2.j(24));
        f3847g = b(Integer.TYPE, Integer.class, new m2.j(25));
        f3848h = a(AtomicInteger.class, new m2.j(26).a());
        f3849i = a(AtomicBoolean.class, new m2.j(27).a());
        int i4 = 1;
        f3850j = a(AtomicIntegerArray.class, new m2.j(i4).a());
        f3851k = new m2.j(2);
        f3852l = b(Character.TYPE, Character.class, new m2.j(5));
        m2.j jVar2 = new m2.j(6);
        f3853m = new m2.j(7);
        f3854n = new m2.j(8);
        f3855o = a(String.class, jVar2);
        f3856p = a(StringBuilder.class, new m2.j(9));
        f3857q = a(StringBuffer.class, new m2.j(10));
        f3858r = a(URL.class, new m2.j(12));
        f3859s = a(URI.class, new m2.j(13));
        f3860t = new u(InetAddress.class, new m2.j(14), i4);
        f3861u = a(UUID.class, new m2.j(15));
        f3862v = a(Currency.class, new m2.j(16).a());
        f3863w = new v(Calendar.class, GregorianCalendar.class, new m2.j(17), i4);
        f3864x = a(Locale.class, new m2.j(18));
        m2.j jVar3 = new m2.j(19);
        f3865y = jVar3;
        f3866z = new u(m2.q.class, jVar3, i4);
        A = new com.auth0.android.request.internal.i(3);
    }

    public static u a(Class cls, b0 b0Var) {
        return new u(cls, b0Var, 0);
    }

    public static v b(Class cls, Class cls2, b0 b0Var) {
        return new v(cls, cls2, b0Var, 0);
    }
}
