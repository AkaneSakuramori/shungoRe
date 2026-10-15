package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3513a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.d f3516d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3515c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3514b = -1;

    public i(h.d dVar) {
        this.f3516d = dVar;
        this.f3513a = dVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3515c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f3514b;
        h.d dVar = this.f3516d;
        Object objD = dVar.d(i4, 0);
        if (key != objD && (key == null || !key.equals(objD))) {
            return false;
        }
        Object value = entry.getValue();
        Object objD2 = dVar.d(this.f3514b, 1);
        return value == objD2 || (value != null && value.equals(objD2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3515c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3516d.d(this.f3514b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3515c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3516d.d(this.f3514b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3514b < this.f3513a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3515c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f3514b;
        h.d dVar = this.f3516d;
        Object objD = dVar.d(i4, 0);
        Object objD2 = dVar.d(this.f3514b, 1);
        return (objD == null ? 0 : objD.hashCode()) ^ (objD2 != null ? objD2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3514b++;
        this.f3515c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3515c) {
            throw new IllegalStateException();
        }
        this.f3516d.j(this.f3514b);
        this.f3514b--;
        this.f3513a--;
        this.f3515c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3515c) {
            return this.f3516d.k(this.f3514b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
