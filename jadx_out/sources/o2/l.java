package o2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f3632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f3634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f3635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3638h;

    public l() {
        this.f3636f = null;
        this.f3635e = this;
        this.f3634d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3636f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f3637g;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3636f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3637g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3636f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3637g;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3637g;
        this.f3637g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3636f + "=" + this.f3637g;
    }

    public l(l lVar, Object obj, l lVar2, l lVar3) {
        this.f3631a = lVar;
        this.f3636f = obj;
        this.f3638h = 1;
        this.f3634d = lVar2;
        this.f3635e = lVar3;
        lVar3.f3634d = this;
        lVar2.f3635e = this;
    }
}
