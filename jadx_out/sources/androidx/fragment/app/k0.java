package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends androidx.lifecycle.n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a4.x f786i = new a4.x(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f790f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f787c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f788d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f789e = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f791g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f792h = false;

    public k0(boolean z4) {
        this.f790f = z4;
    }

    @Override // androidx.lifecycle.n0
    public final void a() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f791g = true;
    }

    public final void b(q qVar) {
        if (this.f792h) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f787c.remove(qVar.f852f) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + qVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f787c.equals(k0Var.f787c) && this.f788d.equals(k0Var.f788d) && this.f789e.equals(k0Var.f789e);
    }

    public final int hashCode() {
        return this.f789e.hashCode() + ((this.f788d.hashCode() + (this.f787c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f787c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f788d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f789e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
