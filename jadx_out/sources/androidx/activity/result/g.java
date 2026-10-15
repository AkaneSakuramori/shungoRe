package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f309a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f310b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f311c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f312d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f313e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f314f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f315g = new Bundle();

    public final boolean a(int i4, int i5, Intent intent) {
        c cVar;
        String str = (String) this.f309a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f313e.get(str);
        if (eVar == null || (cVar = eVar.f305a) == null || !this.f312d.contains(str)) {
            this.f314f.remove(str);
            this.f315g.putParcelable(str, new b(intent, i5));
            return true;
        }
        cVar.b(eVar.f306b.R1(intent, i5));
        this.f312d.remove(str);
        return true;
    }

    public abstract void b(int i4, c3.h hVar, Object obj);

    public final d c(final String str, r rVar, final c3.h hVar, final c cVar) {
        t tVarT = rVar.t();
        if (tVarT.f983f.compareTo(m.f969e) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + tVarT.f983f + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f311c;
        f fVar = (f) map.get(str);
        if (fVar == null) {
            fVar = new f(tVarT);
        }
        p pVar = new p() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.p
            public final void b(r rVar2, l lVar) {
                boolean zEquals = l.ON_START.equals(lVar);
                String str2 = str;
                g gVar = this.f297e;
                if (!zEquals) {
                    if (l.ON_STOP.equals(lVar)) {
                        gVar.f313e.remove(str2);
                        return;
                    } else {
                        if (l.ON_DESTROY.equals(lVar)) {
                            gVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = gVar.f313e;
                c cVar2 = cVar;
                c3.h hVar2 = hVar;
                map2.put(str2, new e(cVar2, hVar2));
                HashMap map3 = gVar.f314f;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    cVar2.b(obj);
                }
                Bundle bundle = gVar.f315g;
                b bVar = (b) bundle.getParcelable(str2);
                if (bVar != null) {
                    bundle.remove(str2);
                    cVar2.b(hVar2.R1(bVar.f300c, bVar.f299b));
                }
            }
        };
        fVar.f307a.a(pVar);
        fVar.f308b.add(pVar);
        map.put(str, fVar);
        return new d(this, str, hVar, 0);
    }

    public final d d(String str, c3.h hVar, b0 b0Var) {
        e(str);
        this.f313e.put(str, new e(b0Var, hVar));
        HashMap map = this.f314f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            b0Var.b(obj);
        }
        Bundle bundle = this.f315g;
        b bVar = (b) bundle.getParcelable(str);
        if (bVar != null) {
            bundle.remove(str);
            b0Var.b(hVar.R1(bVar.f300c, bVar.f299b));
        }
        return new d(this, str, hVar, 1);
    }

    public final void e(String str) {
        HashMap map = this.f310b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        l3.e.f3401b.getClass();
        int iNextInt = l3.e.f3402c.a().nextInt(2147418112);
        while (true) {
            int i4 = iNextInt + 65536;
            HashMap map2 = this.f309a;
            if (!map2.containsKey(Integer.valueOf(i4))) {
                map2.put(Integer.valueOf(i4), str);
                map.put(str, Integer.valueOf(i4));
                return;
            } else {
                l3.e.f3401b.getClass();
                iNextInt = l3.e.f3402c.a().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f312d.contains(str) && (num = (Integer) this.f310b.remove(str)) != null) {
            this.f309a.remove(num);
        }
        this.f313e.remove(str);
        HashMap map = this.f314f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f315g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f311c;
        f fVar = (f) map2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f308b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f307a.b((p) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
