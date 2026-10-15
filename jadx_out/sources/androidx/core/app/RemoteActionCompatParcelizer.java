package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e1.a;
import e1.b;
import e1.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f553a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f553a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f554b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1967e);
        }
        remoteActionCompat.f554b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f555c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1967e);
        }
        remoteActionCompat.f555c = charSequence2;
        remoteActionCompat.f556d = (PendingIntent) aVar.f(remoteActionCompat.f556d, 4);
        boolean z4 = remoteActionCompat.f557e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f1967e.readInt() != 0;
        }
        remoteActionCompat.f557e = z4;
        boolean z5 = remoteActionCompat.f558f;
        if (aVar.e(6)) {
            z5 = ((b) aVar).f1967e.readInt() != 0;
        }
        remoteActionCompat.f558f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f553a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f554b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1967e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f555c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f556d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f557e;
        aVar.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f558f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
