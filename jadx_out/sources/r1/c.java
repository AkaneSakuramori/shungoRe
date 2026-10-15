package r1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o0.b {
    public static final Parcelable.Creator<c> CREATOR = new h3(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4059h;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4055d = parcel.readInt();
        this.f4056e = parcel.readInt();
        this.f4057f = parcel.readInt() == 1;
        this.f4058g = parcel.readInt() == 1;
        this.f4059h = parcel.readInt() == 1;
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeInt(this.f4055d);
        parcel.writeInt(this.f4056e);
        parcel.writeInt(this.f4057f ? 1 : 0);
        parcel.writeInt(this.f4058g ? 1 : 0);
        parcel.writeInt(this.f4059h ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4055d = bottomSheetBehavior.L;
        this.f4056e = bottomSheetBehavior.f1363e;
        this.f4057f = bottomSheetBehavior.f1357b;
        this.f4058g = bottomSheetBehavior.I;
        this.f4059h = bottomSheetBehavior.J;
    }
}
