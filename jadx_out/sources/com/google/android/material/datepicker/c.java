package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new androidx.activity.result.a(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f1439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f1440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f1441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1444h;

    public c(p pVar, p pVar2, b bVar, p pVar3, int i4) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f1438b = pVar;
        this.f1439c = pVar2;
        this.f1441e = pVar3;
        this.f1442f = i4;
        this.f1440d = bVar;
        if (pVar3 != null && pVar.f1486b.compareTo(pVar3.f1486b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.f1486b.compareTo(pVar2.f1486b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i4 < 0 || i4 > w.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1444h = pVar.d(pVar2) + 1;
        this.f1443g = (pVar2.f1488d - pVar.f1488d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1438b.equals(cVar.f1438b) && this.f1439c.equals(cVar.f1439c) && h0.b.a(this.f1441e, cVar.f1441e) && this.f1442f == cVar.f1442f && this.f1440d.equals(cVar.f1440d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1438b, this.f1439c, this.f1441e, Integer.valueOf(this.f1442f), this.f1440d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f1438b, 0);
        parcel.writeParcelable(this.f1439c, 0);
        parcel.writeParcelable(this.f1441e, 0);
        parcel.writeParcelable(this.f1440d, 0);
        parcel.writeInt(this.f1442f);
    }
}
