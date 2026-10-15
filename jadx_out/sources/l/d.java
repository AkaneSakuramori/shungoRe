package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import g.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3362a;

    public abstract void a(h hVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.e eVar;
        if (this.f3362a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i4 = a.d.f1a;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a.e)) {
                a.c cVar = new a.c();
                cVar.f0a = iBinder;
                eVar = cVar;
            } else {
                eVar = (a.e) iInterfaceQueryLocalInterface;
            }
        }
        Context context = this.f3362a;
        h hVar = new h();
        hVar.f2226e = this;
        hVar.f2224c = eVar;
        hVar.f2225d = componentName;
        hVar.f2223b = context;
        a(hVar);
    }
}
