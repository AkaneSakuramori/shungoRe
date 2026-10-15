package l2;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f3386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f3387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3388d;

    public f(g gVar) {
        this.f3388d = gVar;
    }

    @Override // l.d
    public final void a(g.h hVar) {
        Runnable runnable;
        Runnable runnable2;
        g gVar = this.f3388d;
        PackageManager packageManager = gVar.f3390a.getPackageManager();
        List list = a.f3375a;
        String str = gVar.f3391b;
        if (list.contains(str) && !a.a(packageManager, str, 368300000)) {
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
        }
        try {
            l.e eVarJ = hVar.j(PendingIntent.getActivity((Context) hVar.f2223b, gVar.f3393d, new Intent(), 67108864));
            gVar.f3395f = eVarJ;
            if (eVarJ != null && (runnable2 = this.f3386b) != null) {
                runnable2.run();
            } else if (eVarJ == null && (runnable = this.f3387c) != null) {
                runnable.run();
            }
        } catch (RuntimeException e5) {
            Log.w("TwaLauncher", e5);
            this.f3387c.run();
        }
        this.f3386b = null;
        this.f3387c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3388d.f3395f = null;
    }
}
