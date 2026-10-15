package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f1907b = new l0(new m0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1908c = -100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e0.h f1909d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e0.h f1910e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f1911f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f1912g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n.c f1913h = new n.c(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f1914i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f1915j = new Object();

    public static boolean c(Context context) {
        if (f1911f == null) {
            try {
                int i4 = j0.f1883b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) j0.class), i0.a() | 128).metaData;
                if (bundle != null) {
                    f1911f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1911f = Boolean.FALSE;
            }
        }
        return f1911f.booleanValue();
    }

    public static void h(r rVar) {
        synchronized (f1914i) {
            try {
                Iterator it = f1913h.iterator();
                while (it.hasNext()) {
                    r rVar2 = (r) ((WeakReference) it.next()).get();
                    if (rVar2 == rVar || rVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i4);

    public abstract void j(int i4);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
