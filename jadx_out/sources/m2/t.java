package m2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.m f3476b = new o2.m();

    public final q b(String str) {
        return (q) this.f3476b.get(str);
    }

    public final q c(String str) {
        return (q) this.f3476b.remove(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof t) && ((t) obj).f3476b.equals(this.f3476b));
    }

    public final int hashCode() {
        return this.f3476b.hashCode();
    }
}
