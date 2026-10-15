package z2;

import c3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f5506b;

    public b(Throwable th) {
        h.b0(th, "exception");
        this.f5506b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (h.I(this.f5506b, ((b) obj).f5506b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5506b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5506b + ')';
    }
}
