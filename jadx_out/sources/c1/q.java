package c1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import i0.k0;
import i0.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f1194v = {2, 1, 3, 4};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z0.c f1195w = new z0.c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f1196x = new ThreadLocal();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f1207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1208m;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c3.h f1215t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1197b = getClass().getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1198c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1199d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1200e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1201f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1202g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g.h f1203h = new g.h(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g.h f1204i = new g.h(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f1205j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f1206k = f1194v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f1209n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1210o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1211p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1212q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f1213r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f1214s = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z0.c f1216u = f1195w;

    public static void c(g.h hVar, View view, x xVar) {
        ((n.b) hVar.f2224c).put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) hVar.f2223b).indexOfKey(id) >= 0) {
                ((SparseArray) hVar.f2223b).put(id, null);
            } else {
                ((SparseArray) hVar.f2223b).put(id, view);
            }
        }
        WeakHashMap weakHashMap = v0.f2983a;
        String strK = k0.k(view);
        if (strK != null) {
            if (((n.b) hVar.f2226e).containsKey(strK)) {
                ((n.b) hVar.f2226e).put(strK, null);
            } else {
                ((n.b) hVar.f2226e).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                n.e eVar = (n.e) hVar.f2225d;
                if (eVar.f3497b) {
                    eVar.c();
                }
                if (n.d.b(eVar.f3498c, eVar.f3500e, itemIdAtPosition) < 0) {
                    i0.e0.r(view, true);
                    ((n.e) hVar.f2225d).e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((n.e) hVar.f2225d).d(itemIdAtPosition, null);
                if (view2 != null) {
                    i0.e0.r(view2, false);
                    ((n.e) hVar.f2225d).e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static n.b o() {
        ThreadLocal threadLocal = f1196x;
        n.b bVar = (n.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        n.b bVar2 = new n.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean t(x xVar, x xVar2, String str) {
        Object obj = xVar.f1228a.get(str);
        Object obj2 = xVar2.f1228a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(c3.h hVar) {
        this.f1215t = hVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f1200e = timeInterpolator;
    }

    public void C(z0.c cVar) {
        if (cVar == null) {
            this.f1216u = f1195w;
        } else {
            this.f1216u = cVar;
        }
    }

    public void D() {
    }

    public void E(long j4) {
        this.f1198c = j4;
    }

    public final void F() {
        if (this.f1210o == 0) {
            ArrayList arrayList = this.f1213r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1213r.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((p) arrayList2.get(i4)).c();
                }
            }
            this.f1212q = false;
        }
        this.f1210o++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1199d != -1) {
            str2 = str2 + "dur(" + this.f1199d + ") ";
        }
        if (this.f1198c != -1) {
            str2 = str2 + "dly(" + this.f1198c + ") ";
        }
        if (this.f1200e != null) {
            str2 = str2 + "interp(" + this.f1200e + ") ";
        }
        ArrayList arrayList = this.f1201f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1202g;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String strF = defpackage.a.f(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (i4 > 0) {
                    strF = defpackage.a.f(strF, ", ");
                }
                strF = strF + arrayList.get(i4);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                if (i5 > 0) {
                    strF = defpackage.a.f(strF, ", ");
                }
                strF = strF + arrayList2.get(i5);
            }
        }
        return defpackage.a.f(strF, ")");
    }

    public void a(p pVar) {
        if (this.f1213r == null) {
            this.f1213r = new ArrayList();
        }
        this.f1213r.add(pVar);
    }

    public void b(View view) {
        this.f1202g.add(view);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z4) {
                g(xVar);
            } else {
                d(xVar);
            }
            xVar.f1230c.add(this);
            f(xVar);
            if (z4) {
                c(this.f1203h, view, xVar);
            } else {
                c(this.f1204i, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), z4);
            }
        }
    }

    public void f(x xVar) {
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z4) {
        i(z4);
        ArrayList arrayList = this.f1201f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1202g;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z4);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z4) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f1230c.add(this);
                f(xVar);
                if (z4) {
                    c(this.f1203h, viewFindViewById, xVar);
                } else {
                    c(this.f1204i, viewFindViewById, xVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            x xVar2 = new x(view);
            if (z4) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f1230c.add(this);
            f(xVar2);
            if (z4) {
                c(this.f1203h, view, xVar2);
            } else {
                c(this.f1204i, view, xVar2);
            }
        }
    }

    public final void i(boolean z4) {
        if (z4) {
            ((n.b) this.f1203h.f2224c).clear();
            ((SparseArray) this.f1203h.f2223b).clear();
            ((n.e) this.f1203h.f2225d).a();
        } else {
            ((n.b) this.f1204i.f2224c).clear();
            ((SparseArray) this.f1204i.f2223b).clear();
            ((n.e) this.f1204i.f2225d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.f1214s = new ArrayList();
            qVar.f1203h = new g.h(6);
            qVar.f1204i = new g.h(6);
            qVar.f1207l = null;
            qVar.f1208m = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, g.h hVar, g.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i4;
        View view;
        x xVar;
        Animator animator;
        n.b bVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            x xVar2 = (x) arrayList.get(i5);
            x xVar3 = (x) arrayList2.get(i5);
            x xVar4 = null;
            if (xVar2 != null && !xVar2.f1230c.contains(this)) {
                xVar2 = null;
            }
            if (xVar3 != null && !xVar3.f1230c.contains(this)) {
                xVar3 = null;
            }
            if (!(xVar2 == null && xVar3 == null) && ((xVar2 == null || xVar3 == null || r(xVar2, xVar3)) && (animatorK = k(viewGroup, xVar2, xVar3)) != null)) {
                String str = this.f1197b;
                if (xVar3 != null) {
                    String[] strArrP = p();
                    view = xVar3.f1229b;
                    if (strArrP == null || strArrP.length <= 0) {
                        i4 = size;
                        xVar = null;
                    } else {
                        xVar = new x(view);
                        x xVar5 = (x) ((n.b) hVar2.f2224c).getOrDefault(view, null);
                        i4 = size;
                        if (xVar5 != null) {
                            int i6 = 0;
                            while (i6 < strArrP.length) {
                                HashMap map = xVar.f1228a;
                                String str2 = strArrP[i6];
                                map.put(str2, xVar5.f1228a.get(str2));
                                i6++;
                                strArrP = strArrP;
                            }
                        }
                        int i7 = bVarO.f3524d;
                        int i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                animator = null;
                                o oVar = (o) bVarO.getOrDefault((Animator) bVarO.h(i8), null);
                                if (oVar.f1191c != null && oVar.f1189a == view && oVar.f1190b.equals(str) && oVar.f1191c.equals(xVar)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        animatorK = animator;
                        xVar4 = xVar;
                    }
                    animator = animatorK;
                    animatorK = animator;
                    xVar4 = xVar;
                } else {
                    i4 = size;
                    view = xVar2.f1229b;
                }
                if (animatorK != null) {
                    c0 c0Var = y.f1231a;
                    h0 h0Var = new h0(viewGroup);
                    o oVar2 = new o();
                    oVar2.f1189a = view;
                    oVar2.f1190b = str;
                    oVar2.f1191c = xVar4;
                    oVar2.f1192d = h0Var;
                    oVar2.f1193e = this;
                    bVarO.put(animatorK, oVar2);
                    this.f1214s.add(animatorK);
                }
            } else {
                i4 = size;
            }
            i5++;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                Animator animator2 = (Animator) this.f1214s.get(sparseIntArray.keyAt(i9));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i4 = this.f1210o - 1;
        this.f1210o = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.f1213r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1213r.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((p) arrayList2.get(i5)).d(this);
                }
            }
            for (int i6 = 0; i6 < ((n.e) this.f1203h.f2225d).f(); i6++) {
                View view = (View) ((n.e) this.f1203h.f2225d).g(i6);
                if (view != null) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    i0.e0.r(view, false);
                }
            }
            for (int i7 = 0; i7 < ((n.e) this.f1204i.f2225d).f(); i7++) {
                View view2 = (View) ((n.e) this.f1204i.f2225d).g(i7);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = v0.f2983a;
                    i0.e0.r(view2, false);
                }
            }
            this.f1212q = true;
        }
    }

    public final x n(View view, boolean z4) {
        v vVar = this.f1205j;
        if (vVar != null) {
            return vVar.n(view, z4);
        }
        ArrayList arrayList = z4 ? this.f1207l : this.f1208m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i4);
            if (xVar == null) {
                return null;
            }
            if (xVar.f1229b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (x) (z4 ? this.f1208m : this.f1207l).get(i4);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final x q(View view, boolean z4) {
        v vVar = this.f1205j;
        if (vVar != null) {
            return vVar.q(view, z4);
        }
        return (x) ((n.b) (z4 ? this.f1203h : this.f1204i).f2224c).getOrDefault(view, null);
    }

    public boolean r(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] strArrP = p();
        if (strArrP == null) {
            Iterator it = xVar.f1228a.keySet().iterator();
            while (it.hasNext()) {
                if (t(xVar, xVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrP) {
            if (!t(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1201f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1202g;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        if (this.f1212q) {
            return;
        }
        n.b bVarO = o();
        int i4 = bVarO.f3524d;
        c0 c0Var = y.f1231a;
        h0 h0Var = new h0(view);
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            o oVar = (o) bVarO.j(i5);
            if (oVar.f1189a != null && h0Var.equals(oVar.f1192d)) {
                ((Animator) bVarO.h(i5)).pause();
            }
        }
        ArrayList arrayList = this.f1213r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1213r.clone();
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((p) arrayList2.get(i6)).b();
            }
        }
        this.f1211p = true;
    }

    public void v(p pVar) {
        ArrayList arrayList = this.f1213r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
        if (this.f1213r.size() == 0) {
            this.f1213r = null;
        }
    }

    public void w(View view) {
        this.f1202g.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.f1211p) {
            if (!this.f1212q) {
                n.b bVarO = o();
                int i4 = bVarO.f3524d;
                c0 c0Var = y.f1231a;
                h0 h0Var = new h0(viewGroup);
                for (int i5 = i4 - 1; i5 >= 0; i5--) {
                    o oVar = (o) bVarO.j(i5);
                    if (oVar.f1189a != null && h0Var.equals(oVar.f1192d)) {
                        ((Animator) bVarO.h(i5)).resume();
                    }
                }
                ArrayList arrayList = this.f1213r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1213r.clone();
                    int size = arrayList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((p) arrayList2.get(i6)).e();
                    }
                }
            }
            this.f1211p = false;
        }
    }

    public void y() {
        F();
        n.b bVarO = o();
        for (Animator animator : this.f1214s) {
            if (bVarO.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new n(this, bVarO));
                    long j4 = this.f1199d;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j5 = this.f1198c;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f1200e;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new i.d(1, this));
                    animator.start();
                }
            }
        }
        this.f1214s.clear();
        m();
    }

    public void z(long j4) {
        this.f1199d = j4;
    }
}
