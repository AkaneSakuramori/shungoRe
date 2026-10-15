package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new androidx.activity.result.a(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f815n;

    public m0(q qVar) {
        this.f803b = qVar.getClass().getName();
        this.f804c = qVar.f852f;
        this.f805d = qVar.f860n;
        this.f806e = qVar.f869w;
        this.f807f = qVar.f870x;
        this.f808g = qVar.f871y;
        this.f809h = qVar.B;
        this.f810i = qVar.f859m;
        this.f811j = qVar.A;
        this.f812k = qVar.f853g;
        this.f813l = qVar.f872z;
        this.f814m = qVar.M.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f803b);
        sb.append(" (");
        sb.append(this.f804c);
        sb.append(")}:");
        if (this.f805d) {
            sb.append(" fromLayout");
        }
        int i4 = this.f807f;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.f808g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f809h) {
            sb.append(" retainInstance");
        }
        if (this.f810i) {
            sb.append(" removing");
        }
        if (this.f811j) {
            sb.append(" detached");
        }
        if (this.f813l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f803b);
        parcel.writeString(this.f804c);
        parcel.writeInt(this.f805d ? 1 : 0);
        parcel.writeInt(this.f806e);
        parcel.writeInt(this.f807f);
        parcel.writeString(this.f808g);
        parcel.writeInt(this.f809h ? 1 : 0);
        parcel.writeInt(this.f810i ? 1 : 0);
        parcel.writeInt(this.f811j ? 1 : 0);
        parcel.writeBundle(this.f812k);
        parcel.writeInt(this.f813l ? 1 : 0);
        parcel.writeBundle(this.f815n);
        parcel.writeInt(this.f814m);
    }

    public m0(Parcel parcel) {
        this.f803b = parcel.readString();
        this.f804c = parcel.readString();
        this.f805d = parcel.readInt() != 0;
        this.f806e = parcel.readInt();
        this.f807f = parcel.readInt();
        this.f808g = parcel.readString();
        this.f809h = parcel.readInt() != 0;
        this.f810i = parcel.readInt() != 0;
        this.f811j = parcel.readInt() != 0;
        this.f812k = parcel.readBundle();
        this.f813l = parcel.readInt() != 0;
        this.f815n = parcel.readBundle();
        this.f814m = parcel.readInt();
    }
}
