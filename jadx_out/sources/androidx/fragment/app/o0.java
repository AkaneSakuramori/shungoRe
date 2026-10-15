package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f837a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f838b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f839c;

    public final void a(q qVar) {
        if (this.f837a.contains(qVar)) {
            throw new IllegalStateException("Fragment already added: " + qVar);
        }
        synchronized (this.f837a) {
            this.f837a.add(qVar);
        }
        qVar.f858l = true;
    }

    public final q b(String str) {
        n0 n0Var = (n0) this.f838b.get(str);
        if (n0Var != null) {
            return n0Var.f819c;
        }
        return null;
    }

    public final q c(String str) {
        for (n0 n0Var : this.f838b.values()) {
            if (n0Var != null) {
                q qVarC = n0Var.f819c;
                if (!str.equals(qVarC.f852f)) {
                    qVarC = qVarC.f867u.f751c.c(str);
                }
                if (qVarC != null) {
                    return qVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : this.f838b.values()) {
            if (n0Var != null) {
                arrayList.add(n0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : this.f838b.values()) {
            if (n0Var != null) {
                arrayList.add(n0Var.f819c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f837a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f837a) {
            arrayList = new ArrayList(this.f837a);
        }
        return arrayList;
    }

    public final void g(n0 n0Var) {
        q qVar = n0Var.f819c;
        String str = qVar.f852f;
        HashMap map = this.f838b;
        if (map.get(str) != null) {
            return;
        }
        map.put(qVar.f852f, n0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + qVar);
        }
    }

    public final void h(n0 n0Var) {
        q qVar = n0Var.f819c;
        if (qVar.B) {
            this.f839c.b(qVar);
        }
        if (((n0) this.f838b.put(qVar.f852f, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + qVar);
        }
    }
}
