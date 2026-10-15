package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new androidx.activity.result.a(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f783i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f776b);
        parcel.writeStringList(this.f777c);
        parcel.writeTypedArray(this.f778d, i4);
        parcel.writeInt(this.f779e);
        parcel.writeString(this.f780f);
        parcel.writeStringList(this.f781g);
        parcel.writeTypedList(this.f782h);
        parcel.writeTypedList(this.f783i);
    }
}
