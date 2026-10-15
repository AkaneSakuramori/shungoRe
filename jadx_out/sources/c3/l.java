package c3;

import j3.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1275b = new l();

    @Override // c3.k
    public final i e(j jVar) {
        h.b0(jVar, "key");
        return null;
    }

    @Override // c3.k
    public final Object h(Object obj, p pVar) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // c3.k
    public final k t(j jVar) {
        h.b0(jVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // c3.k
    public final k x(k kVar) {
        h.b0(kVar, "context");
        return kVar;
    }
}
