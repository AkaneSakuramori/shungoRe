package o0;

import android.os.Parcel;
import android.os.Parcelable;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f3594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3593c = new a();
    public static final Parcelable.Creator<b> CREATOR = new h3(3);

    public b() {
        this.f3594b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f3594b = parcelable == f3593c ? null : parcelable;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3594b = parcelable == null ? f3593c : parcelable;
    }
}
