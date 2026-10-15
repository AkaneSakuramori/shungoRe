package y0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Parcelable {
    public static final Parcelable.Creator<k1> CREATOR = new androidx.activity.result.a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f5193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f5195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f5196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5199k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5190b);
        parcel.writeInt(this.f5191c);
        parcel.writeInt(this.f5192d);
        if (this.f5192d > 0) {
            parcel.writeIntArray(this.f5193e);
        }
        parcel.writeInt(this.f5194f);
        if (this.f5194f > 0) {
            parcel.writeIntArray(this.f5195g);
        }
        parcel.writeInt(this.f5197i ? 1 : 0);
        parcel.writeInt(this.f5198j ? 1 : 0);
        parcel.writeInt(this.f5199k ? 1 : 0);
        parcel.writeList(this.f5196h);
    }
}
