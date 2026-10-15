package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new androidx.activity.result.a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f741c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f740b);
        parcel.writeInt(this.f741c);
    }
}
