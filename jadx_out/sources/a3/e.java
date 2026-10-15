package a3;

import j1.y;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f63b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65d;

    public e(f fVar, int i4, int i5) {
        c3.h.b0(fVar, "list");
        this.f63b = fVar;
        this.f64c = i4;
        int iA = fVar.a();
        if (i4 < 0 || i5 > iA) {
            throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + iA);
        }
        if (i4 <= i5) {
            this.f65d = i5 - i4;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
    }

    @Override // a3.b
    public final int a() {
        return this.f65d;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        y.b(i4, this.f65d);
        return this.f63b.get(this.f64c + i4);
    }
}
