package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.p;
import i.u0;
import j1.m;
import java.util.ArrayList;
import m0.l;
import y0.j1;
import y0.k1;
import y0.y;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f298a) {
            case 0:
                return new b(parcel);
            case 1:
                c3.h.b0(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                c3.h.X(parcelable);
                return new j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                u0 u0Var = new u0(parcel);
                u0Var.f2786b = parcel.readByte() != 0;
                return u0Var;
            case 3:
                l lVar = new l(parcel);
                lVar.f3437b = parcel.readInt();
                return lVar;
            case 4:
                return new androidx.fragment.app.b(parcel);
            case 5:
                f0 f0Var = new f0();
                f0Var.f740b = parcel.readString();
                f0Var.f741c = parcel.readInt();
                return f0Var;
            case 6:
                j0 j0Var = new j0();
                j0Var.f780f = null;
                j0Var.f781g = new ArrayList();
                j0Var.f782h = new ArrayList();
                j0Var.f776b = parcel.createTypedArrayList(m0.CREATOR);
                j0Var.f777c = parcel.createStringArrayList();
                j0Var.f778d = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                j0Var.f779e = parcel.readInt();
                j0Var.f780f = parcel.readString();
                j0Var.f781g = parcel.createStringArrayList();
                j0Var.f782h = parcel.createTypedArrayList(Bundle.CREATOR);
                j0Var.f783i = parcel.createTypedArrayList(f0.CREATOR);
                return j0Var;
            case 7:
                return new m0(parcel);
            case 8:
                y yVar = new y();
                yVar.f5339b = parcel.readInt();
                yVar.f5340c = parcel.readInt();
                yVar.f5341d = parcel.readInt() == 1;
                return yVar;
            case 9:
                j1 j1Var = new j1();
                j1Var.f5169b = parcel.readInt();
                j1Var.f5170c = parcel.readInt();
                j1Var.f5172e = parcel.readInt() == 1;
                int i4 = parcel.readInt();
                if (i4 > 0) {
                    int[] iArr = new int[i4];
                    j1Var.f5171d = iArr;
                    parcel.readIntArray(iArr);
                }
                return j1Var;
            case 10:
                k1 k1Var = new k1();
                k1Var.f5190b = parcel.readInt();
                k1Var.f5191c = parcel.readInt();
                int i5 = parcel.readInt();
                k1Var.f5192d = i5;
                if (i5 > 0) {
                    int[] iArr2 = new int[i5];
                    k1Var.f5193e = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i6 = parcel.readInt();
                k1Var.f5194f = i6;
                if (i6 > 0) {
                    int[] iArr3 = new int[i6];
                    k1Var.f5195g = iArr3;
                    parcel.readIntArray(iArr3);
                }
                k1Var.f5197i = parcel.readInt() == 1;
                k1Var.f5198j = parcel.readInt() == 1;
                k1Var.f5199k = parcel.readInt() == 1;
                k1Var.f5196h = parcel.readArrayList(j1.class.getClassLoader());
                return k1Var;
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                return new j1.j(parcel);
            case 13:
                return new m(parcel);
            case 14:
                u1.b bVar = new u1.b(parcel);
                bVar.f4676b = ((Integer) parcel.readValue(u1.b.class.getClassLoader())).intValue();
                return bVar;
            case 15:
                return new com.google.android.material.datepicker.c((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt());
            case 16:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 17:
                return p.a(parcel.readInt(), parcel.readInt());
            default:
                return new com.google.android.material.timepicker.g(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f298a) {
            case 0:
                return new b[i4];
            case 1:
                return new j[i4];
            case 2:
                return new u0[i4];
            case 3:
                return new l[i4];
            case 4:
                return new androidx.fragment.app.b[i4];
            case 5:
                return new f0[i4];
            case 6:
                return new j0[i4];
            case 7:
                return new m0[i4];
            case 8:
                return new y[i4];
            case 9:
                return new j1[i4];
            case 10:
                return new k1[i4];
            case 11:
                return new ParcelImpl[i4];
            case 12:
                return new j1.j[i4];
            case 13:
                return new m[i4];
            case 14:
                return new u1.b[i4];
            case 15:
                return new com.google.android.material.datepicker.c[i4];
            case 16:
                return new com.google.android.material.datepicker.d[i4];
            case 17:
                return new p[i4];
            default:
                return new com.google.android.material.timepicker.g[i4];
        }
    }
}
