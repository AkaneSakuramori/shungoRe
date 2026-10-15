package y;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Notification.Builder f5052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f5053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f5054c;

    public w(m mVar) {
        ArrayList arrayList;
        new ArrayList();
        Bundle bundle = new Bundle();
        this.f5054c = bundle;
        this.f5053b = mVar;
        Context context = mVar.f5039a;
        int i4 = Build.VERSION.SDK_INT;
        String str = mVar.f5048j;
        Notification.Builder builderA = u.a(context, str);
        this.f5052a = builderA;
        Notification notification = mVar.f5050l;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar.f5043e).setContentText(mVar.f5044f).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        s.b(builderA, null);
        n.b(n.d(n.c(builderA, null), false), mVar.f5045g);
        Iterator it = mVar.f5040b.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
        Bundle bundle2 = mVar.f5047i;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        o.a(builderA, mVar.f5046h);
        q.i(builderA, false);
        q.g(builderA, null);
        q.j(builderA, null);
        q.h(builderA, false);
        r.b(builderA, null);
        r.c(builderA, 0);
        r.f(builderA, 0);
        r.d(builderA, null);
        r.e(builderA, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = mVar.f5041c;
        ArrayList arrayList3 = mVar.f5051m;
        if (i4 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    defpackage.a.n(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    n.c cVar = new n.c(arrayList3.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                r.a(this.f5052a, (String) it3.next());
            }
        }
        ArrayList arrayList4 = mVar.f5042d;
        if (arrayList4.size() > 0) {
            if (mVar.f5047i == null) {
                mVar.f5047i = new Bundle();
            }
            Bundle bundle3 = mVar.f5047i.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList4.size() > 0) {
                Integer.toString(0);
                defpackage.a.n(arrayList4.get(0));
                Object obj = x.f5055a;
                new Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (mVar.f5047i == null) {
                mVar.f5047i = new Bundle();
            }
            mVar.f5047i.putBundle("android.car.EXTENSIONS", bundle3);
            this.f5054c.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i5 = Build.VERSION.SDK_INT;
        p.a(this.f5052a, mVar.f5047i);
        t.e(this.f5052a, null);
        u.b(this.f5052a, 0);
        u.e(this.f5052a, null);
        u.f(this.f5052a, null);
        u.g(this.f5052a, 0L);
        u.d(this.f5052a, 0);
        if (!TextUtils.isEmpty(str)) {
            this.f5052a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i5 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                defpackage.a.n(it4.next());
                throw null;
            }
        }
        if (i5 >= 29) {
            v.a(this.f5052a, mVar.f5049k);
            v.b(this.f5052a, null);
        }
    }
}
