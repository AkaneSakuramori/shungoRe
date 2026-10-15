package z2;

import c3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5505c;

    public a(Object obj, Object obj2) {
        this.f5504b = obj;
        this.f5505c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.I(this.f5504b, aVar.f5504b) && h.I(this.f5505c, aVar.f5505c);
    }

    public final int hashCode() {
        Object obj = this.f5504b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5505c;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5504b + ", " + this.f5505c + ')';
    }
}
