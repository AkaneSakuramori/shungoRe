package n3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3572e = new c(1, 0, 1);

    @Override // n3.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3565b == cVar.f3565b) {
                    if (this.f3566c == cVar.f3566c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // n3.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3565b * 31) + this.f3566c;
    }

    @Override // n3.a
    public final boolean isEmpty() {
        return this.f3565b > this.f3566c;
    }

    @Override // n3.a
    public final String toString() {
        return this.f3565b + ".." + this.f3566c;
    }
}
