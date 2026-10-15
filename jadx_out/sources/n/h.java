package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.d f3512c;

    public /* synthetic */ h(h.d dVar, int i4) {
        this.f3511b = i4;
        this.f3512c = dVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3511b) {
            case 0:
                h.d dVar = this.f3512c;
                int iF = dVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    dVar.i(entry.getKey(), entry.getValue());
                }
                return iF != dVar.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                dVar.c();
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iG = dVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object objD = dVar.d(iG, 1);
                Object value = entry.getValue();
                return objD == value || (objD != null && objD.equals(value));
            default:
                return dVar.g(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3511b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                b bVarE = this.f3512c.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!bVarE.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3511b) {
            case 0:
                break;
        }
        return h.d.l(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                int iHashCode = 0;
                for (int iF = dVar.f() - 1; iF >= 0; iF--) {
                    Object objD = dVar.d(iF, 0);
                    Object objD2 = dVar.d(iF, 1);
                    iHashCode += (objD == null ? 0 : objD.hashCode()) ^ (objD2 == null ? 0 : objD2.hashCode());
                }
                return iHashCode;
            default:
                int iHashCode2 = 0;
                for (int iF2 = dVar.f() - 1; iF2 >= 0; iF2--) {
                    Object objD3 = dVar.d(iF2, 0);
                    iHashCode2 += objD3 == null ? 0 : objD3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                return dVar.f() == 0;
            default:
                return dVar.f() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                return new i(dVar);
            default:
                return new g(dVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                h.d dVar = this.f3512c;
                int iG = dVar.g(obj);
                if (iG < 0) {
                    return false;
                }
                dVar.j(iG);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                b bVarE = this.f3512c.e();
                int i4 = bVarE.f3524d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bVarE.remove(it.next());
                }
                return i4 != bVarE.f3524d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return h.d.n(this.f3512c.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i4 = this.f3511b;
        h.d dVar = this.f3512c;
        switch (i4) {
            case 0:
                break;
        }
        return dVar.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3512c.o(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3511b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                h.d dVar = this.f3512c;
                int iF = dVar.f();
                Object[] objArr = new Object[iF];
                for (int i4 = 0; i4 < iF; i4++) {
                    objArr[i4] = dVar.d(i4, 0);
                }
                return objArr;
        }
    }
}
