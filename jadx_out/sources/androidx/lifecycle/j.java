package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static l a(m mVar) {
        c3.h.b0(mVar, "state");
        int iOrdinal = mVar.ordinal();
        if (iOrdinal == 1) {
            return l.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return l.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return l.ON_RESUME;
    }
}
