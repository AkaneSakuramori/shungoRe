package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f3241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f3242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f3243d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3244e = 0;

    public c a(Object obj) {
        c cVar = this.f3241b;
        while (cVar != null && !cVar.f3232a.equals(obj)) {
            cVar = cVar.f3234c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f3244e--;
        WeakHashMap weakHashMap = this.f3243d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f3235d;
        if (cVar != null) {
            cVar.f3234c = cVarA.f3234c;
        } else {
            this.f3241b = cVarA.f3234c;
        }
        c cVar2 = cVarA.f3234c;
        if (cVar2 != null) {
            cVar2.f3235d = cVar;
        } else {
            this.f3242c = cVar;
        }
        cVarA.f3234c = null;
        cVarA.f3235d = null;
        return cVarA.f3233b;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3244e != gVar.f3244e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f3241b, this.f3242c, 0);
        this.f3243d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
