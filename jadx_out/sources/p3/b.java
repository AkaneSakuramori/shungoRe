package p3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3869b;

    public b(c cVar, int i4) {
        c3.h.b0(cVar, "sequence");
        this.f3868a = cVar;
        this.f3869b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // p3.c
    public final Iterator iterator() {
        return new a3.c(this);
    }
}
