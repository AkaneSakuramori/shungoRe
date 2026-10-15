package h;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n.j f2352c;

    public d(Context context) {
        this.f2350a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i4, int i5);

    public abstract n.b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i4);

    public abstract Object k(int i4, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof d0.b)) {
            return menuItem;
        }
        d0.b bVar = (d0.b) menuItem;
        if (((n.k) this.f2351b) == null) {
            this.f2351b = new n.k();
        }
        MenuItem menuItem2 = (MenuItem) ((n.k) this.f2351b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        w wVar = new w((Context) this.f2350a, bVar);
        ((n.k) this.f2351b).put(bVar, wVar);
        return wVar;
    }

    public final Object[] o(int i4, Object[] objArr) {
        int iF = f();
        if (objArr.length < iF) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iF);
        }
        for (int i5 = 0; i5 < iF; i5++) {
            objArr[i5] = d(i5, i4);
        }
        if (objArr.length > iF) {
            objArr[iF] = null;
        }
        return objArr;
    }
}
