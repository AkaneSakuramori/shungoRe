package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {
    public static final Parcelable.Creator<d> CREATOR = new androidx.activity.result.a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1445b;

    public d(long j4) {
        this.f1445b = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f1445b == ((d) obj).f1445b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1445b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1445b);
    }
}
