package z1;

import android.os.Parcel;
import android.os.Parcelable;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o0.b {
    public static final Parcelable.Creator<a> CREATOR = new h3(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5442d;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5442d = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeInt(this.f5442d ? 1 : 0);
    }
}
