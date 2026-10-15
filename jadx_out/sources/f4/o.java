package f4;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class o extends a3.f implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j[] f2182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2183c;

    public o(j[] jVarArr, int[] iArr) {
        this.f2182b = jVarArr;
        this.f2183c = iArr;
    }

    @Override // a3.b
    public final int a() {
        return this.f2182b.length;
    }

    @Override // a3.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.f2182b[i4];
    }

    @Override // a3.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // a3.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
