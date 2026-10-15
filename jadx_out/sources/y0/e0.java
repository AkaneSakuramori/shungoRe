package y0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5124b;

    public /* synthetic */ e0(RecyclerView recyclerView) {
        this.f5124b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j4;
        RecyclerView recyclerView = this.f5124b;
        l0 l0Var = recyclerView.I;
        if (l0Var != null) {
            k kVar = (k) l0Var;
            ArrayList arrayList2 = kVar.f5175h;
            boolean z4 = !arrayList2.isEmpty();
            ArrayList arrayList3 = kVar.f5177j;
            boolean z5 = !arrayList3.isEmpty();
            ArrayList arrayList4 = kVar.f5178k;
            boolean z6 = !arrayList4.isEmpty();
            ArrayList arrayList5 = kVar.f5176i;
            boolean z7 = !arrayList5.isEmpty();
            if (z4 || z5 || z7 || z6) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = arrayList3;
                    j4 = kVar.f5205d;
                    if (!zHasNext) {
                        break;
                    }
                    d1 d1Var = (d1) it.next();
                    View view = d1Var.f5103a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    kVar.f5184q.add(d1Var);
                    viewPropertyAnimatorAnimate.setDuration(j4).alpha(0.0f).setListener(new f(kVar, d1Var, viewPropertyAnimatorAnimate, view)).start();
                    arrayList3 = arrayList;
                }
                arrayList2.clear();
                if (z5) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList);
                    kVar.f5180m.add(arrayList6);
                    arrayList.clear();
                    e eVar = new e(kVar, arrayList6, 0);
                    if (z4) {
                        View view2 = ((j) arrayList6.get(0)).f5164a.f5103a;
                        WeakHashMap weakHashMap = i0.v0.f2983a;
                        i0.e0.n(view2, eVar, j4);
                    } else {
                        eVar.run();
                    }
                }
                if (z6) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    kVar.f5181n.add(arrayList7);
                    arrayList4.clear();
                    e eVar2 = new e(kVar, arrayList7, 1);
                    if (z4) {
                        View view3 = ((i) arrayList7.get(0)).f5157a.f5103a;
                        WeakHashMap weakHashMap2 = i0.v0.f2983a;
                        i0.e0.n(view3, eVar2, j4);
                    } else {
                        eVar2.run();
                    }
                }
                if (z7) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList5);
                    kVar.f5179l.add(arrayList8);
                    arrayList5.clear();
                    e eVar3 = new e(kVar, arrayList8, 2);
                    if (z4 || z5 || z6) {
                        if (!z4) {
                            j4 = 0;
                        }
                        long jMax = Math.max(z5 ? kVar.f5206e : 0L, z6 ? kVar.f5207f : 0L) + j4;
                        View view4 = ((d1) arrayList8.get(0)).f5103a;
                        WeakHashMap weakHashMap3 = i0.v0.f2983a;
                        i0.e0.n(view4, eVar3, jMax);
                    } else {
                        eVar3.run();
                    }
                }
            }
        }
        recyclerView.f1037j0 = false;
    }
}
