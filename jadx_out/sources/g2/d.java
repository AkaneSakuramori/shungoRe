package g2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o0.b {
    public static final Parcelable.Creator<d> CREATOR = new h3(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2317d;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2317d = parcel.readInt();
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeInt(this.f2317d);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f2317d = sideSheetBehavior.f1525h;
    }
}
