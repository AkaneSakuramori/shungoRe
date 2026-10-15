package a3;

import j1.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f62d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i4) {
        super(fVar);
        this.f62d = fVar;
        y.c(i4, fVar.a());
        this.f60b = i4;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f60b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f60b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f60b - 1;
        this.f60b = i4;
        return this.f62d.get(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f60b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
