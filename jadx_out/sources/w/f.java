package w;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o0.b {
    public static final Parcelable.Creator<f> CREATOR = new h3(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f4836d;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i4 = parcel.readInt();
        int[] iArr = new int[i4];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f4836d = new SparseArray(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f4836d.append(iArr[i5], parcelableArray[i5]);
        }
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        SparseArray sparseArray = this.f4836d;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = this.f4836d.keyAt(i5);
            parcelableArr[i5] = (Parcelable) this.f4836d.valueAt(i5);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
