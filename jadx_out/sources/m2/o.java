package m2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3474b = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f3474b.equals(this.f3474b));
    }

    public final int hashCode() {
        return this.f3474b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3474b.iterator();
    }
}
