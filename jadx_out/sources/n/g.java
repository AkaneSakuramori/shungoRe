package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3509d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h.d f3510e;

    public g(h.d dVar, int i4) {
        this.f3510e = dVar;
        this.f3506a = i4;
        this.f3507b = dVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3508c < this.f3507b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = this.f3510e.d(this.f3508c, this.f3506a);
        this.f3508c++;
        this.f3509d = true;
        return objD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3509d) {
            throw new IllegalStateException();
        }
        int i4 = this.f3508c - 1;
        this.f3508c = i4;
        this.f3507b--;
        this.f3509d = false;
        this.f3510e.j(i4);
    }
}
