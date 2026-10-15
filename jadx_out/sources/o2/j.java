package o2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3626c;

    public /* synthetic */ j(m mVar, int i4) {
        this.f3625b = i4;
        this.f3626c = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i4 = this.f3625b;
        m mVar = this.f3626c;
        switch (i4) {
            case 0:
                mVar.clear();
                break;
            default:
                mVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        l lVarA;
        Object obj2;
        Object value;
        int i4 = this.f3625b;
        m mVar = this.f3626c;
        switch (i4) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mVar.getClass();
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        lVarA = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                        lVarA = null;
                    }
                    break;
                } else {
                    lVarA = null;
                }
                if (lVarA != null && ((obj2 = lVarA.f3637g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    lVar = lVarA;
                }
                return lVar != null;
            default:
                return mVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3625b) {
            case 0:
                return new i(this);
            default:
                return new i(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        l lVarA;
        Object obj2;
        Object value;
        l lVarA2 = null;
        int i4 = this.f3625b;
        m mVar = this.f3626c;
        switch (i4) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        lVarA = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                        lVarA = null;
                    }
                    break;
                } else {
                    lVarA = null;
                }
                if (lVarA != null && ((obj2 = lVarA.f3637g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    lVarA2 = lVarA;
                }
                if (lVarA2 == null) {
                    return false;
                }
                mVar.c(lVarA2, true);
                return true;
            default:
                mVar.getClass();
                if (obj != null) {
                    try {
                        lVarA2 = mVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVarA2 != null) {
                    mVar.c(lVarA2, true);
                }
                return lVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i4 = this.f3625b;
        m mVar = this.f3626c;
        switch (i4) {
            case 0:
                break;
        }
        return mVar.f3642d;
    }
}
