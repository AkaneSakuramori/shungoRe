package i;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends o0.b {
    public static final Parcelable.Creator<i3> CREATOR = new h3(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2614d;

    public i3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2614d = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2614d + "}";
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        parcel.writeValue(Boolean.valueOf(this.f2614d));
    }
}
