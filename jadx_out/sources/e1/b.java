package e1;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f1967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1973k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new n.b(), new n.b(), new n.b());
    }

    @Override // e1.a
    public final b a() {
        Parcel parcel = this.f1967e;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.f1972j;
        if (i4 == this.f1968f) {
            i4 = this.f1969g;
        }
        return new b(parcel, iDataPosition, i4, defpackage.a.h(new StringBuilder(), this.f1970h, "  "), this.f1963a, this.f1964b, this.f1965c);
    }

    @Override // e1.a
    public final boolean e(int i4) {
        while (this.f1972j < this.f1969g) {
            int i5 = this.f1973k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f1972j;
            Parcel parcel = this.f1967e;
            parcel.setDataPosition(i6);
            int i7 = parcel.readInt();
            this.f1973k = parcel.readInt();
            this.f1972j += i7;
        }
        return this.f1973k == i4;
    }

    @Override // e1.a
    public final void h(int i4) {
        int i5 = this.f1971i;
        SparseIntArray sparseIntArray = this.f1966d;
        Parcel parcel = this.f1967e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.f1971i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public b(Parcel parcel, int i4, int i5, String str, n.b bVar, n.b bVar2, n.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1966d = new SparseIntArray();
        this.f1971i = -1;
        this.f1973k = -1;
        this.f1967e = parcel;
        this.f1968f = i4;
        this.f1969g = i5;
        this.f1972j = i4;
        this.f1970h = str;
    }
}
