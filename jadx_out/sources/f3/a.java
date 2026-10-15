package f3;

import a3.f;
import c3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f implements Serializable {
    @Override // a3.b
    public final int a() {
        throw null;
    }

    @Override // a3.b, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        h.b0(r4, "element");
        int iOrdinal = r4.ordinal();
        h.b0(null, "<this>");
        if (iOrdinal < 0) {
            return false;
        }
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        throw null;
    }

    @Override // a3.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        h.b0(r4, "element");
        int iOrdinal = r4.ordinal();
        h.b0(null, "<this>");
        if (iOrdinal < 0) {
            return -1;
        }
        throw null;
    }

    @Override // a3.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        h.b0(r4, "element");
        return indexOf(r4);
    }
}
