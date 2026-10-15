package r3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.l f4086b;

    public g(Object obj, j3.l lVar) {
        this.f4085a = obj;
        this.f4086b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c3.h.I(this.f4085a, gVar.f4085a) && c3.h.I(this.f4086b, gVar.f4086b);
    }

    public final int hashCode() {
        Object obj = this.f4085a;
        return this.f4086b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4085a + ", onCancellation=" + this.f4086b + ')';
    }
}
