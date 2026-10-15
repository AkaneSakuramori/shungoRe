package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.activity.result.a(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f698o;

    public b(a aVar) {
        int size = aVar.f663a.size();
        this.f685b = new int[size * 5];
        if (!aVar.f669g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f686c = new ArrayList(size);
        this.f687d = new int[size];
        this.f688e = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            p0 p0Var = (p0) aVar.f663a.get(i5);
            int i6 = i4 + 1;
            this.f685b[i4] = p0Var.f840a;
            ArrayList arrayList = this.f686c;
            q qVar = p0Var.f841b;
            arrayList.add(qVar != null ? qVar.f852f : null);
            int[] iArr = this.f685b;
            iArr[i6] = p0Var.f842c;
            iArr[i4 + 2] = p0Var.f843d;
            int i7 = i4 + 4;
            iArr[i4 + 3] = p0Var.f844e;
            i4 += 5;
            iArr[i7] = p0Var.f845f;
            this.f687d[i5] = p0Var.f846g.ordinal();
            this.f688e[i5] = p0Var.f847h.ordinal();
        }
        this.f689f = aVar.f668f;
        this.f690g = aVar.f670h;
        this.f691h = aVar.f680r;
        this.f692i = aVar.f671i;
        this.f693j = aVar.f672j;
        this.f694k = aVar.f673k;
        this.f695l = aVar.f674l;
        this.f696m = aVar.f675m;
        this.f697n = aVar.f676n;
        this.f698o = aVar.f677o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f685b);
        parcel.writeStringList(this.f686c);
        parcel.writeIntArray(this.f687d);
        parcel.writeIntArray(this.f688e);
        parcel.writeInt(this.f689f);
        parcel.writeString(this.f690g);
        parcel.writeInt(this.f691h);
        parcel.writeInt(this.f692i);
        TextUtils.writeToParcel(this.f693j, parcel, 0);
        parcel.writeInt(this.f694k);
        TextUtils.writeToParcel(this.f695l, parcel, 0);
        parcel.writeStringList(this.f696m);
        parcel.writeStringList(this.f697n);
        parcel.writeInt(this.f698o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f685b = parcel.createIntArray();
        this.f686c = parcel.createStringArrayList();
        this.f687d = parcel.createIntArray();
        this.f688e = parcel.createIntArray();
        this.f689f = parcel.readInt();
        this.f690g = parcel.readString();
        this.f691h = parcel.readInt();
        this.f692i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f693j = (CharSequence) creator.createFromParcel(parcel);
        this.f694k = parcel.readInt();
        this.f695l = (CharSequence) creator.createFromParcel(parcel);
        this.f696m = parcel.createStringArrayList();
        this.f697n = parcel.createStringArrayList();
        this.f698o = parcel.readInt() != 0;
    }
}
