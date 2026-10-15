package y0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new androidx.activity.result.a(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5341d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5339b);
        parcel.writeInt(this.f5340c);
        parcel.writeInt(this.f5341d ? 1 : 0);
    }
}
