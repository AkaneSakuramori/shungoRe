package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentSender f320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f323e;

    public j(IntentSender intentSender, Intent intent, int i4, int i5) {
        c3.h.b0(intentSender, "intentSender");
        this.f320b = intentSender;
        this.f321c = intent;
        this.f322d = i4;
        this.f323e = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        c3.h.b0(parcel, "dest");
        parcel.writeParcelable(this.f320b, i4);
        parcel.writeParcelable(this.f321c, i4);
        parcel.writeInt(this.f322d);
        parcel.writeInt(this.f323e);
    }
}
