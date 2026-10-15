package y0;

import android.os.Parcel;
import android.os.Parcelable;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends o0.b {
    public static final Parcelable.Creator<x0> CREATOR = new h3(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f5338d;

    public x0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5338d = parcel.readParcelable(classLoader == null ? o0.class.getClassLoader() : classLoader);
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeParcelable(this.f5338d, 0);
    }
}
