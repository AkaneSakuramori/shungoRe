package p3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3872b;

    public g(h hVar) {
        this.f3872b = hVar;
        this.f3871a = hVar.f3873a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3871a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3872b.f3874b.e(this.f3871a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
