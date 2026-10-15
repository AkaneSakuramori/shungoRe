package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new androidx.activity.result.a(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1628e;

    public g(Parcel parcel) {
        int i4 = parcel.readInt();
        int i5 = parcel.readInt();
        int i6 = parcel.readInt();
        int i7 = parcel.readInt();
        this.f1626c = i4;
        this.f1627d = i5;
        this.f1628e = i6;
        this.f1625b = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1626c == gVar.f1626c && this.f1627d == gVar.f1627d && this.f1625b == gVar.f1625b && this.f1628e == gVar.f1628e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1625b), Integer.valueOf(this.f1626c), Integer.valueOf(this.f1627d), Integer.valueOf(this.f1628e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1626c);
        parcel.writeInt(this.f1627d);
        parcel.writeInt(this.f1628e);
        parcel.writeInt(this.f1625b);
    }
}
