package i;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends View.BaseSavedState {
    public static final Parcelable.Creator<u0> CREATOR = new androidx.activity.result.a(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2786b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f2786b ? (byte) 1 : (byte) 0);
    }
}
