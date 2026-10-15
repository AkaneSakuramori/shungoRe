package j1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l extends l.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3189i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f3190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f3191c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f3192d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l2.g f3194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f3195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3196h;

    public l(Context context, m mVar, l2.g gVar) {
        this.f3190b = new WeakReference(context);
        this.f3195g = mVar;
        this.f3193e = mVar.a(context.getPackageManager());
        this.f3194f = gVar;
    }

    @Override // l.d
    public final void a(g.h hVar) {
        Log.d("l", "CustomTabs Service connected");
        try {
            a.c cVar = (a.c) ((a.e) hVar.f2224c);
            cVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcelObtain.writeLong(0L);
                if (!cVar.f0a.transact(2, parcelObtain, parcelObtain2, 0)) {
                    int i4 = a.d.f1a;
                }
                parcelObtain2.readException();
                parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        } catch (RemoteException unused) {
        }
        this.f3191c.set(hVar.j(null));
        this.f3192d.countDown();
    }

    public final void b() {
        Log.v("l", "Trying to bind the service");
        Context context = (Context) this.f3190b.get();
        boolean zBindService = false;
        this.f3196h = false;
        String str = this.f3193e;
        if (context != null && str != null) {
            this.f3196h = true;
            this.f3362a = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            zBindService = context.bindService(intent, this, 33);
        }
        Log.v("l", String.format("Bind request result (%s): %s", str, Boolean.valueOf(zBindService)));
    }

    public final void c(Context context, Uri uri) {
        boolean zAwait;
        b();
        try {
            zAwait = this.f3192d.await(this.f3193e == null ? 0L : 1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zAwait = false;
        }
        Log.d("l", "Launching URI. Custom Tabs available: " + zAwait);
        l.e eVar = (l.e) this.f3191c.get();
        m mVar = this.f3195g;
        mVar.getClass();
        l.c cVar = new l.c(eVar);
        Intent intent = cVar.f3357a;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", mVar.f3197b ? 1 : 0);
        cVar.f3360d = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        int i4 = mVar.f3198c;
        if (i4 > 0) {
            l.a aVar = new l.a();
            Object obj = z.d.f5428a;
            aVar.f3353a = Integer.valueOf(z.c.a(context, i4) | (-16777216));
            cVar.f3359c = aVar.a().b();
        }
        Intent intent2 = (Intent) cVar.a().f2519c;
        intent2.setData(uri);
        context.startActivity(intent2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("l", "CustomTabs Service disconnected");
        this.f3191c.set(null);
    }
}
