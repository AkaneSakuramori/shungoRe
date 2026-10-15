package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f300c;

    public b(Intent intent, int i4) {
        this.f299b = i4;
        this.f300c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f299b;
        if (i4 != -1) {
            strValueOf = i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f300c);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f299b);
        Intent intent = this.f300c;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    public b(Parcel parcel) {
        this.f299b = parcel.readInt();
        this.f300c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
