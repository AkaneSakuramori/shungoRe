package k3;

/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3271a;

    public h(Class cls) {
        c3.h.b0(cls, "jClass");
        this.f3271a = cls;
    }

    @Override // k3.b
    public final Class a() {
        return this.f3271a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (c3.h.I(this.f3271a, ((h) obj).f3271a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3271a.hashCode();
    }

    public final String toString() {
        return this.f3271a.toString() + " (Kotlin reflection is not available)";
    }
}
