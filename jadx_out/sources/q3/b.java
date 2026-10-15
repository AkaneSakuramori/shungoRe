package q3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3889a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3.c f3892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3894f;

    public b(c cVar) {
        this.f3894f = cVar;
        int i4 = cVar.f3896b;
        int length = cVar.f3895a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > length) {
            i4 = length;
        }
        this.f3890b = i4;
        this.f3891c = i4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void a() {
        z2.a aVar;
        int i4 = this.f3891c;
        if (i4 < 0) {
            this.f3889a = 0;
            this.f3892d = null;
            return;
        }
        c cVar = this.f3894f;
        int i5 = cVar.f3897c;
        if (i5 > 0) {
            int i6 = this.f3893e + 1;
            this.f3893e = i6;
            if (i6 >= i5) {
                this.f3892d = new n3.c(this.f3890b, l.V2(cVar.f3895a), 1);
                this.f3891c = -1;
            } else if (i4 > cVar.f3895a.length() && (aVar = (z2.a) cVar.f3898d.c(cVar.f3895a, Integer.valueOf(this.f3891c))) != null) {
                int iIntValue = ((Number) aVar.f5504b).intValue();
                int iIntValue2 = ((Number) aVar.f5505c).intValue();
                this.f3892d = c3.h.I2(this.f3890b, iIntValue);
                int i7 = iIntValue + iIntValue2;
                this.f3890b = i7;
                this.f3891c = i7 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f3892d = new n3.c(this.f3890b, l.V2(cVar.f3895a), 1);
                this.f3891c = -1;
            }
        } else if (i4 > cVar.f3895a.length()) {
            this.f3892d = new n3.c(this.f3890b, l.V2(cVar.f3895a), 1);
            this.f3891c = -1;
        } else {
            int iIntValue3 = ((Number) aVar.f5504b).intValue();
            int iIntValue4 = ((Number) aVar.f5505c).intValue();
            this.f3892d = c3.h.I2(this.f3890b, iIntValue3);
            int i8 = iIntValue3 + iIntValue4;
            this.f3890b = i8;
            this.f3891c = i8 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f3889a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3889a == -1) {
            a();
        }
        return this.f3889a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3889a == -1) {
            a();
        }
        if (this.f3889a == 0) {
            throw new NoSuchElementException();
        }
        n3.c cVar = this.f3892d;
        c3.h.Y(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f3892d = null;
        this.f3889a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
