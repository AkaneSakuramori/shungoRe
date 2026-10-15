package y0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new androidx.activity.result.a(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5172e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5169b + ", mGapDir=" + this.f5170c + ", mHasUnwantedGapAfter=" + this.f5172e + ", mGapPerSpan=" + Arrays.toString(this.f5171d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5169b);
        parcel.writeInt(this.f5170c);
        parcel.writeInt(this.f5172e ? 1 : 0);
        int[] iArr = this.f5171d;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5171d);
        }
    }
}
