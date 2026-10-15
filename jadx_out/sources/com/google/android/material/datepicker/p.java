package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new androidx.activity.result.a(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f1486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1492h;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = w.b(calendar);
        this.f1486b = calendarB;
        this.f1487c = calendarB.get(2);
        this.f1488d = calendarB.get(1);
        this.f1489e = calendarB.getMaximum(7);
        this.f1490f = calendarB.getActualMaximum(5);
        this.f1491g = calendarB.getTimeInMillis();
    }

    public static p a(int i4, int i5) {
        Calendar calendarD = w.d(null);
        calendarD.set(1, i4);
        calendarD.set(2, i5);
        return new p(calendarD);
    }

    public static p b(long j4) {
        Calendar calendarD = w.d(null);
        calendarD.setTimeInMillis(j4);
        return new p(calendarD);
    }

    public final String c() {
        if (this.f1492h == null) {
            this.f1492h = w.a("yMMMM", Locale.getDefault()).format(new Date(this.f1486b.getTimeInMillis()));
        }
        return this.f1492h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1486b.compareTo(((p) obj).f1486b);
    }

    public final int d(p pVar) {
        if (!(this.f1486b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (pVar.f1487c - this.f1487c) + ((pVar.f1488d - this.f1488d) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1487c == pVar.f1487c && this.f1488d == pVar.f1488d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1487c), Integer.valueOf(this.f1488d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1488d);
        parcel.writeInt(this.f1487c);
    }
}
