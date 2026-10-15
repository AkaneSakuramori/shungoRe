package i;

import android.app.Application;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2617d;

    public /* synthetic */ j(Object obj, int i4, Object obj2) {
        this.f2615b = i4;
        this.f2617d = obj;
        this.f2616c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.m mVar;
        Object obj = this.f2616c;
        int i4 = this.f2615b;
        Object obj2 = this.f2617d;
        switch (i4) {
            case 0:
                m mVar2 = (m) obj2;
                h.o oVar = mVar2.f2658d;
                if (oVar != null && (mVar = oVar.f2430e) != null) {
                    mVar.d(oVar);
                }
                View view = (View) mVar2.f2663i;
                if (view != null && view.getWindowToken() != null) {
                    h hVar = (h) obj;
                    if (hVar.b()) {
                        mVar2.f2674t = hVar;
                    } else if (hVar.f2342f != null) {
                        hVar.d(0, 0, false, false);
                        mVar2.f2674t = hVar;
                    }
                }
                mVar2.f2676v = null;
                return;
            case 1:
            default:
                ((androidx.fragment.app.d1) obj).c();
                return;
            case 2:
                ((y.f) obj).f5023a = obj2;
                return;
            case 3:
                ((Application) obj).unregisterActivityLifecycleCallbacks((y.f) obj2);
                return;
            case 4:
                try {
                    Method method = y.g.f5032d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        y.g.f5033e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e5) {
                    if (e5.getClass() == RuntimeException.class && e5.getMessage() != null && e5.getMessage().startsWith("Unable to stop")) {
                        throw e5;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 5:
                androidx.fragment.app.r0.b((ArrayList) obj, 4);
                return;
            case 6:
                ((androidx.fragment.app.g) obj).b();
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i4) {
        this.f2615b = i4;
        this.f2616c = obj;
        this.f2617d = obj2;
    }
}
