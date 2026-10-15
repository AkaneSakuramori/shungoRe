package e;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1898c;

    public /* synthetic */ o(Context context, int i4) {
        this.f1897b = i4;
        this.f1898c = context;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        e0.h hVar;
        Object systemService;
        Context context;
        int i4 = this.f1897b;
        Context context2 = this.f1898c;
        switch (i4) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (e0.b.a()) {
                            Iterator it = r.f1913h.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    r rVar = (r) ((WeakReference) it.next()).get();
                                    if (rVar != null && (context = ((e0) rVar).f1825l) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                hVar = new e0.h(new e0.j(q.a(systemService)));
                            } else {
                                hVar = e0.h.f1959b;
                            }
                        } else {
                            hVar = r.f1909d;
                            if (hVar == null) {
                                hVar = e0.h.f1959b;
                            }
                        }
                        if (((e0.j) hVar.f1960a).f1961a.isEmpty()) {
                            String strP = r3.q.p(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                q.b(systemService2, p.a(strP));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                r.f1912g = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new o(context2, 2));
                break;
            case 2:
                w0.e.p(context2, new j.a(5), w0.e.f4861a, false);
                break;
            default:
                Toast.makeText(context2, "Error downloading", 1).show();
                break;
        }
    }
}
