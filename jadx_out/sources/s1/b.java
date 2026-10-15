package s1;

import android.os.Parcel;
import android.os.Parcelable;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o0.b {
    public static final Parcelable.Creator<b> CREATOR = new h3(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4199d;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f4199d = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeInt(this.f4199d ? 1 : 0);
    }
}
