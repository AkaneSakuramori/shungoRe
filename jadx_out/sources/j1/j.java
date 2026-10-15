package j1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f3181c = Arrays.asList("com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta", "com.android.chrome.dev");
    public static final Parcelable.Creator<j> CREATOR = new androidx.activity.result.a(12);

    public j(ArrayList arrayList) {
        this.f3182b = arrayList;
    }

    public static String a(ArrayList arrayList, List list, String str) {
        if (str != null && list.contains(str) && arrayList.contains(str)) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (arrayList.contains(str2)) {
                return str2;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f3182b);
    }

    public j(Parcel parcel) {
        this.f3182b = parcel.createStringArrayList();
    }
}
