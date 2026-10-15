package j1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new androidx.activity.result.a(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3199d;

    public m(boolean z4, int i4, j jVar) {
        this.f3197b = z4;
        this.f3198c = i4;
        this.f3199d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String a(PackageManager packageManager) {
        j jVar = this.f3199d;
        jVar.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? arrayList3 = jVar.f3182b;
        boolean z4 = arrayList3 != 0;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (!z4 || arrayList3.contains(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList2.add(resolveInfo.activityInfo.packageName);
                } else {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = new ArrayList();
            if (str != null) {
                arrayList3.add(str);
            }
            arrayList3.addAll(j.f3181c);
        }
        String strA = j.a(arrayList2, arrayList3, str);
        return strA != null ? strA : j.a(arrayList, arrayList3, str);
    }

    public final m.f b(Context context, Uri uri) {
        m.f fVar = new m.f(uri);
        int i4 = this.f3198c;
        if (i4 > 0) {
            l.a aVar = new l.a();
            Object obj = z.d.f5428a;
            aVar.f3353a = Integer.valueOf(z.c.a(context, i4) | (-16777216));
            l.a aVarA = aVar.a();
            l.c cVar = fVar.f3408b;
            cVar.getClass();
            cVar.f3359c = aVarA.b();
        }
        return fVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f3197b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3198c);
        parcel.writeParcelable(this.f3199d, i4);
    }

    public m(Parcel parcel) {
        this.f3197b = parcel.readByte() != 0;
        this.f3198c = parcel.readInt();
        this.f3199d = (j) parcel.readParcelable(j.class.getClassLoader());
    }
}
