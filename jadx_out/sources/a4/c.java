package a4;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f4.j f101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f4.j f102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f4.j f103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f4.j f104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f4.j f105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f4.j f106i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4.j f107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4.j f108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109c;

    static {
        f4.j jVar = f4.j.f2167e;
        f101d = x.k(":");
        f102e = x.k(":status");
        f103f = x.k(":method");
        f104g = x.k(":path");
        f105h = x.k(":scheme");
        f106i = x.k(":authority");
    }

    public c(f4.j jVar, f4.j jVar2) {
        c3.h.b0(jVar, "name");
        c3.h.b0(jVar2, "value");
        this.f107a = jVar;
        this.f108b = jVar2;
        this.f109c = jVar2.c() + jVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return c3.h.I(this.f107a, cVar.f107a) && c3.h.I(this.f108b, cVar.f108b);
    }

    public final int hashCode() {
        return this.f108b.hashCode() + (this.f107a.hashCode() * 31);
    }

    public final String toString() {
        return this.f107a.j() + ": " + this.f108b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(x.k(str), x.k(str2));
        c3.h.b0(str, "name");
        c3.h.b0(str2, "value");
        f4.j jVar = f4.j.f2167e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f4.j jVar, String str) {
        this(jVar, x.k(str));
        c3.h.b0(jVar, "name");
        c3.h.b0(str, "value");
        f4.j jVar2 = f4.j.f2167e;
    }
}
