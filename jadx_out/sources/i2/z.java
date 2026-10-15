package i2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i.h3;

/* JADX INFO: loaded from: classes.dex */
public final class z extends o0.b {
    public static final Parcelable.Creator<z> CREATOR = new h3(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f3119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3120e;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3119d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3120e = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3119d) + "}";
    }

    @Override // o0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3594b, i4);
        TextUtils.writeToParcel(this.f3119d, parcel, i4);
        parcel.writeInt(this.f3120e ? 1 : 0);
    }
}
