package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import e1.a;
import e1.b;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i4 = iconCompat.f560a;
        if (aVar.e(1)) {
            i4 = ((b) aVar).f1967e.readInt();
        }
        iconCompat.f560a = i4;
        byte[] bArr = iconCompat.f562c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1967e;
            int i5 = parcel.readInt();
            if (i5 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i5];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f562c = bArr;
        iconCompat.f563d = aVar.f(iconCompat.f563d, 3);
        int i6 = iconCompat.f564e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f1967e.readInt();
        }
        iconCompat.f564e = i6;
        int i7 = iconCompat.f565f;
        if (aVar.e(5)) {
            i7 = ((b) aVar).f1967e.readInt();
        }
        iconCompat.f565f = i7;
        iconCompat.f566g = (ColorStateList) aVar.f(iconCompat.f566g, 6);
        String string = iconCompat.f568i;
        if (aVar.e(7)) {
            string = ((b) aVar).f1967e.readString();
        }
        iconCompat.f568i = string;
        String string2 = iconCompat.f569j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f1967e.readString();
        }
        iconCompat.f569j = string2;
        iconCompat.f567h = PorterDuff.Mode.valueOf(iconCompat.f568i);
        switch (iconCompat.f560a) {
            case -1:
                Parcelable parcelable = iconCompat.f563d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f561b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f563d;
                if (parcelable2 != null) {
                    iconCompat.f561b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f562c;
                    iconCompat.f561b = bArr3;
                    iconCompat.f560a = 3;
                    iconCompat.f564e = 0;
                    iconCompat.f565f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f562c, Charset.forName("UTF-16"));
                iconCompat.f561b = str;
                if (iconCompat.f560a == 2 && iconCompat.f569j == null) {
                    iconCompat.f569j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f561b = iconCompat.f562c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f568i = iconCompat.f567h.name();
        switch (iconCompat.f560a) {
            case -1:
                iconCompat.f563d = (Parcelable) iconCompat.f561b;
                break;
            case 1:
            case 5:
                iconCompat.f563d = (Parcelable) iconCompat.f561b;
                break;
            case 2:
                iconCompat.f562c = ((String) iconCompat.f561b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f562c = (byte[]) iconCompat.f561b;
                break;
            case 4:
            case 6:
                iconCompat.f562c = iconCompat.f561b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f560a;
        if (-1 != i4) {
            aVar.h(1);
            ((b) aVar).f1967e.writeInt(i4);
        }
        byte[] bArr = iconCompat.f562c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1967e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f563d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1967e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f564e;
        if (i5 != 0) {
            aVar.h(4);
            ((b) aVar).f1967e.writeInt(i5);
        }
        int i6 = iconCompat.f565f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f1967e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f566g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1967e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f568i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1967e.writeString(str);
        }
        String str2 = iconCompat.f569j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1967e.writeString(str2);
        }
    }
}
