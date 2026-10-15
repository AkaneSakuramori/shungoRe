package i;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h3 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2608a;

    public /* synthetic */ h3(int i4) {
        this.f2608a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2608a) {
            case 0:
                return new i3(parcel, classLoader);
            case 1:
                return new w3(parcel, classLoader);
            case 2:
                return new w.f(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return o0.b.f3593c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new y0.x0(parcel, classLoader);
            case 5:
                return new p1.b(parcel, classLoader);
            case 6:
                return new r1.c(parcel, classLoader);
            case 7:
                return new s1.b(parcel, classLoader);
            case 8:
                return new z1.a(parcel, classLoader);
            case 9:
                return new g2.d(parcel, classLoader);
            default:
                return new i2.z(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f2608a) {
            case 0:
                return new i3[i4];
            case 1:
                return new w3[i4];
            case 2:
                return new w.f[i4];
            case 3:
                return new o0.b[i4];
            case 4:
                return new y0.x0[i4];
            case 5:
                return new p1.b[i4];
            case 6:
                return new r1.c[i4];
            case 7:
                return new s1.b[i4];
            case 8:
                return new z1.a[i4];
            case 9:
                return new g2.d[i4];
            default:
                return new i2.z[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2608a) {
            case 0:
                return new i3(parcel, null);
            case 1:
                return new w3(parcel, null);
            case 2:
                return new w.f(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return o0.b.f3593c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new y0.x0(parcel, null);
            case 5:
                return new p1.b(parcel, null);
            case 6:
                return new r1.c(parcel, (ClassLoader) null);
            case 7:
                return new s1.b(parcel, null);
            case 8:
                return new z1.a(parcel, null);
            case 9:
                return new g2.d(parcel, (ClassLoader) null);
            default:
                return new i2.z(parcel, null);
        }
    }
}
