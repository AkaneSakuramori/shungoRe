package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f995j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.g f997b = new k.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f998c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f1000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f1001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1004i;

    public x() {
        Object obj = f995j;
        this.f1001f = obj;
        this.f1000e = obj;
        this.f1002g = -1;
    }

    public static void a(String str) {
        if (!j.b.Q2().f3124j.Q2()) {
            throw new IllegalStateException(defpackage.a.g("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(w wVar) {
        if (wVar.f992c) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i4 = wVar.f993d;
            int i5 = this.f1002g;
            if (i4 >= i5) {
                return;
            }
            wVar.f993d = i5;
            androidx.fragment.app.k kVar = wVar.f991b;
            Object obj = this.f1000e;
            kVar.getClass();
            if (((r) obj) != null) {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) kVar.f785c;
                if (mVar.f795a0) {
                    View viewD = mVar.D();
                    if (viewD.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (mVar.f799e0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + kVar + " setting the content view on " + mVar.f799e0);
                        }
                        mVar.f799e0.setContentView(viewD);
                    }
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.f1003h) {
            this.f1004i = true;
            return;
        }
        this.f1003h = true;
        do {
            this.f1004i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                k.g gVar = this.f997b;
                gVar.getClass();
                k.d dVar = new k.d(gVar);
                gVar.f3243d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1004i) {
                        break;
                    }
                }
            }
        } while (this.f1004i);
        this.f1003h = false;
    }

    public final void d(androidx.fragment.app.k kVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, kVar);
        k.g gVar = this.f997b;
        k.c cVarA = gVar.a(kVar);
        if (cVarA != null) {
            obj = cVarA.f3233b;
        } else {
            k.c cVar = new k.c(kVar, vVar);
            gVar.f3244e++;
            k.c cVar2 = gVar.f3242c;
            if (cVar2 == null) {
                gVar.f3241b = cVar;
                gVar.f3242c = cVar;
            } else {
                cVar2.f3234c = cVar;
                cVar.f3235d = cVar2;
                gVar.f3242c = cVar;
            }
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wVar != null) {
            return;
        }
        vVar.c(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1002g++;
        this.f1000e = obj;
        c(null);
    }
}
