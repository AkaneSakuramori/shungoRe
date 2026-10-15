package c1;

import android.view.ViewGroup;
import com.shungo.app.R;
import i0.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f1221c;

    static {
        a aVar = new a();
        aVar.f1224z = false;
        aVar.H(new i(2));
        aVar.H(new g());
        aVar.H(new i(1));
        f1219a = aVar;
        f1220b = new ThreadLocal();
        f1221c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, q qVar) {
        ArrayList arrayList = f1221c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        if (i0.h0.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (qVar == null) {
                qVar = f1219a;
            }
            q qVarClone = qVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).u(viewGroup);
                }
            }
            if (qVarClone != null) {
                qVarClone.h(viewGroup, true);
            }
            defpackage.a.n(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (qVarClone != null) {
                s sVar = new s();
                sVar.f1217b = qVarClone;
                sVar.f1218c = viewGroup;
                viewGroup.addOnAttachStateChangeListener(sVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
            }
        }
    }

    public static n.b b() {
        n.b bVar;
        ThreadLocal threadLocal = f1220b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (n.b) weakReference.get()) != null) {
            return bVar;
        }
        n.b bVar2 = new n.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
