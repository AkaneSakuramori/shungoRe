package i;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends o0.b {
    public static final Parcelable.Creator<w3> CREATOR = new h3(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2832e;

    public w3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2831d = parcel.readInt();
        this.f2832e = parcel.readInt() != 0;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeInt(this.f2831d);
        parcel.writeInt(this.f2832e ? 1 : 0);
    }
}
