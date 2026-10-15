package k;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f3234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3235d;

    public c(Object obj, Object obj2) {
        this.f3232a = obj;
        this.f3233b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3232a.equals(cVar.f3232a) && this.f3233b.equals(cVar.f3233b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3232a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3233b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3232a.hashCode() ^ this.f3233b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3232a + "=" + this.f3233b;
    }
}
