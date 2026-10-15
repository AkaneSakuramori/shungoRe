package p1;

import android.os.Parcel;
import android.os.Parcelable;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o0.b {
    public static final Parcelable.Creator<b> CREATOR = new h3(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3759h;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3755d = parcel.readByte() != 0;
        this.f3756e = parcel.readByte() != 0;
        this.f3757f = parcel.readInt();
        this.f3758g = parcel.readFloat();
        this.f3759h = parcel.readByte() != 0;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeByte(this.f3755d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3756e ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3757f);
        parcel.writeFloat(this.f3758g);
        parcel.writeByte(this.f3759h ? (byte) 1 : (byte) 0);
    }
}
