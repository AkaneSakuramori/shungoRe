package i;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2740d;

    public o3(int i4) {
        if (i4 != 1) {
            return;
        }
        this.f2739c = new SparseIntArray();
        this.f2740d = new SparseIntArray();
        this.f2737a = false;
        this.f2738b = false;
    }

    public final int a(int i4, int i5) {
        if (!this.f2738b) {
            return c(i4, i5);
        }
        int i6 = ((SparseIntArray) this.f2740d).get(i4, -1);
        if (i6 != -1) {
            return i6;
        }
        int iC = c(i4, i5);
        ((SparseIntArray) this.f2740d).put(i4, iC);
        return iC;
    }

    public final int b(int i4, int i5) {
        if (!this.f2737a) {
            return i4 % i5;
        }
        int i6 = ((SparseIntArray) this.f2739c).get(i4, -1);
        if (i6 != -1) {
            return i6;
        }
        int i7 = i4 % i5;
        ((SparseIntArray) this.f2739c).put(i4, i7);
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    public final int c(int i4, int i5) {
        int iB;
        int i6;
        int i7;
        if (this.f2738b) {
            SparseIntArray sparseIntArray = (SparseIntArray) this.f2740d;
            int size = sparseIntArray.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                if (sparseIntArray.keyAt(i9) < i4) {
                    i8 = i9 + 1;
                } else {
                    size = i9 - 1;
                }
            }
            int i10 = i8 - 1;
            int iKeyAt = (i10 < 0 || i10 >= sparseIntArray.size()) ? -1 : sparseIntArray.keyAt(i10);
            if (iKeyAt != -1) {
                i6 = ((SparseIntArray) this.f2740d).get(iKeyAt);
                i7 = iKeyAt + 1;
                iB = b(iKeyAt, i5) + 1;
                if (iB == i5) {
                    i6++;
                    iB = 0;
                }
            } else {
                iB = 0;
                i6 = 0;
                i7 = 0;
            }
        } else {
            iB = 0;
            i6 = 0;
            i7 = 0;
        }
        while (i7 < i4) {
            iB++;
            if (iB == i5) {
                i6++;
                iB = 0;
            } else if (iB > i5) {
                i6++;
                iB = 1;
            }
            i7++;
        }
        return iB + 1 > i5 ? i6 + 1 : i6;
    }

    public final void d() {
        ((SparseIntArray) this.f2739c).clear();
    }
}
