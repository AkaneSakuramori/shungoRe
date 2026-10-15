package n3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3571d;

    public b(int i4, int i5, int i6) {
        this.f3568a = i6;
        this.f3569b = i5;
        boolean z4 = true;
        if (i6 <= 0 ? i4 < i5 : i4 > i5) {
            z4 = false;
        }
        this.f3570c = z4;
        this.f3571d = z4 ? i4 : i5;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public final int b() {
        int i4 = this.f3571d;
        if (i4 != this.f3569b) {
            this.f3571d = this.f3568a + i4;
        } else {
            if (!this.f3570c) {
                throw new NoSuchElementException();
            }
            this.f3570c = false;
        }
        return i4;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3570c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
