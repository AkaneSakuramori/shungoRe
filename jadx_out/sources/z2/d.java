package z2;

import androidx.lifecycle.k0;
import c3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j3.a f5507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f5508c = e.f5510a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5509d = this;

    public d(k0 k0Var) {
        this.f5507b = k0Var;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f5508c;
        e eVar = e.f5510a;
        if (obj != eVar) {
            return obj;
        }
        synchronized (this.f5509d) {
            objA = this.f5508c;
            if (objA == eVar) {
                j3.a aVar = this.f5507b;
                h.X(aVar);
                objA = aVar.a();
                this.f5508c = objA;
                this.f5507b = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f5508c != e.f5510a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
