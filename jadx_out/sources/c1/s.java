package c1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f1217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f1218c;

    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX WARN: Code duplicated, block: B:132:0x029d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec A[EDGE_INSN: B:137:0x01ec->B:92:0x01ec BREAK  A[LOOP:1: B:19:0x0088->B:91:0x01e2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:170:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        q qVar;
        int i4;
        g.h hVar;
        g.h hVar2;
        n.b bVar;
        n.b bVar2;
        int i5;
        int[] iArr;
        q qVar2;
        int i6;
        int i7;
        n.b bVarO;
        int i8;
        Animator animator;
        o oVar;
        View view;
        x xVar;
        x xVar2;
        int i9;
        q qVar3;
        int i10;
        View view2;
        x xVar3;
        n.b bVar3;
        int i11;
        int i12;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i13;
        View view5;
        View view6;
        n.e eVar;
        int iF;
        int i14;
        View view7;
        q qVar4;
        Iterator it;
        ViewGroup viewGroup = this.f1218c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = t.f1221c;
        ViewGroup viewGroup2 = this.f1218c;
        int i15 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        n.b bVarB = t.b();
        Long l4 = null;
        ArrayList arrayList3 = (ArrayList) bVarB.getOrDefault(viewGroup2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            qVar = this.f1217b;
            arrayList3.add(qVar);
            qVar.a(new h(this, 1, bVarB));
            i4 = 0;
            qVar.h(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).x(viewGroup2);
                }
            }
            qVar.f1207l = new ArrayList();
            qVar.f1208m = new ArrayList();
            hVar = qVar.f1203h;
            hVar2 = qVar.f1204i;
            bVar = new n.b((n.b) hVar.f2224c);
            bVar2 = new n.b((n.b) hVar2.f2224c);
            i5 = 0;
            while (true) {
                iArr = qVar.f1206k;
                if (i5 < iArr.length) {
                    break;
                }
                i9 = iArr[i5];
                if (i9 != i15) {
                    qVar3 = qVar;
                    for (i10 = bVar.f3524d - 1; i10 >= 0; i10--) {
                        view2 = (View) bVar.h(i10);
                        if (view2 == null && qVar3.s(view2) && (xVar3 = (x) bVar2.remove(view2)) != null && qVar3.s(xVar3.f1229b)) {
                            qVar3.f1207l.add((x) bVar.i(i10));
                            qVar3.f1208m.add(xVar3);
                        }
                    }
                } else if (i9 != 2) {
                    qVar3 = qVar;
                    bVar3 = (n.b) hVar.f2226e;
                    n.b bVar4 = (n.b) hVar2.f2226e;
                    i11 = bVar3.f3524d;
                    for (i12 = 0; i12 < i11; i12++) {
                        view3 = (View) bVar3.j(i12);
                        if (view3 == null && qVar3.s(view3) && (view4 = (View) bVar4.getOrDefault(bVar3.h(i12), null)) != null && qVar3.s(view4)) {
                            x xVar4 = (x) bVar.getOrDefault(view3, null);
                            x xVar5 = (x) bVar2.getOrDefault(view4, null);
                            if (xVar4 != null && xVar5 != null) {
                                qVar3.f1207l.add(xVar4);
                                qVar3.f1208m.add(xVar5);
                                bVar.remove(view3);
                                bVar2.remove(view4);
                            }
                        }
                    }
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        eVar = (n.e) hVar.f2225d;
                        n.e eVar2 = (n.e) hVar2.f2225d;
                        iF = eVar.f();
                        i14 = i4;
                        while (i14 < iF) {
                            view7 = (View) eVar.g(i14);
                            if (view7 == null && qVar.s(view7)) {
                                if (eVar.f3497b) {
                                    eVar.c();
                                }
                                View view8 = (View) eVar2.d(eVar.f3498c[i14], l4);
                                qVar4 = qVar;
                                if (view8 != null && qVar4.s(view8)) {
                                    x xVar6 = (x) bVar.getOrDefault(view7, l4);
                                    x xVar7 = (x) bVar2.getOrDefault(view8, l4);
                                    if (xVar6 != null && xVar7 != null) {
                                        qVar4.f1207l.add(xVar6);
                                        qVar4.f1208m.add(xVar7);
                                        bVar.remove(view7);
                                        bVar2.remove(view8);
                                    }
                                }
                            } else {
                                qVar4 = qVar;
                            }
                            i14++;
                            qVar = qVar4;
                            l4 = null;
                        }
                    }
                    qVar3 = qVar;
                } else {
                    qVar3 = qVar;
                    sparseArray = (SparseArray) hVar.f2223b;
                    SparseArray sparseArray2 = (SparseArray) hVar2.f2223b;
                    size = sparseArray.size();
                    for (i13 = 0; i13 < size; i13++) {
                        view5 = (View) sparseArray.valueAt(i13);
                        if (view5 == null && qVar3.s(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && qVar3.s(view6)) {
                            x xVar8 = (x) bVar.getOrDefault(view5, null);
                            x xVar9 = (x) bVar2.getOrDefault(view6, null);
                            if (xVar8 != null && xVar9 != null) {
                                qVar3.f1207l.add(xVar8);
                                qVar3.f1208m.add(xVar9);
                                bVar.remove(view5);
                                bVar2.remove(view6);
                            }
                        }
                    }
                }
                i5++;
                qVar = qVar3;
                i4 = 0;
                l4 = null;
                i15 = 1;
            }
            qVar2 = qVar;
            for (i6 = 0; i6 < bVar.f3524d; i6++) {
                xVar2 = (x) bVar.j(i6);
                if (qVar2.s(xVar2.f1229b)) {
                    qVar2.f1207l.add(xVar2);
                    qVar2.f1208m.add(null);
                }
            }
            for (i7 = 0; i7 < bVar2.f3524d; i7++) {
                xVar = (x) bVar2.j(i7);
                if (qVar2.s(xVar.f1229b)) {
                    qVar2.f1208m.add(xVar);
                    qVar2.f1207l.add(null);
                }
            }
            bVarO = q.o();
            int i16 = bVarO.f3524d;
            c0 c0Var = y.f1231a;
            h0 h0Var = new h0(viewGroup2);
            for (i8 = i16 - 1; i8 >= 0; i8--) {
                animator = (Animator) bVarO.h(i8);
                if (animator == null && (oVar = (o) bVarO.getOrDefault(animator, null)) != null && (view = oVar.f1189a) != null && h0Var.equals(oVar.f1192d)) {
                    x xVarQ = qVar2.q(view, true);
                    x xVarN = qVar2.n(view, true);
                    if (xVarQ == null && xVarN == null) {
                        xVarN = (x) ((n.b) qVar2.f1204i.f2224c).getOrDefault(view, null);
                    }
                    if ((xVarQ != null || xVarN != null) && oVar.f1193e.r(oVar.f1191c, xVarN)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            bVarO.remove(animator);
                        }
                    }
                }
            }
            qVar2.l(viewGroup2, qVar2.f1203h, qVar2.f1204i, qVar2.f1207l, qVar2.f1208m);
            qVar2.y();
            return true;
        }
        arrayList3 = new ArrayList();
        bVarB.put(viewGroup2, arrayList3);
        qVar = this.f1217b;
        arrayList3.add(qVar);
        qVar.a(new h(this, 1, bVarB));
        i4 = 0;
        qVar.h(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((q) it.next()).x(viewGroup2);
            }
        }
        qVar.f1207l = new ArrayList();
        qVar.f1208m = new ArrayList();
        hVar = qVar.f1203h;
        hVar2 = qVar.f1204i;
        bVar = new n.b((n.b) hVar.f2224c);
        bVar2 = new n.b((n.b) hVar2.f2224c);
        i5 = 0;
        while (true) {
            iArr = qVar.f1206k;
            if (i5 < iArr.length) {
                break;
                break;
            }
            i9 = iArr[i5];
            if (i9 != i15) {
                qVar3 = qVar;
                while (i10 >= 0) {
                    view2 = (View) bVar.h(i10);
                    if (view2 == null) {
                    }
                }
            } else if (i9 != 2) {
                qVar3 = qVar;
                bVar3 = (n.b) hVar.f2226e;
                n.b bVar5 = (n.b) hVar2.f2226e;
                i11 = bVar3.f3524d;
                while (i12 < i11) {
                    view3 = (View) bVar3.j(i12);
                    if (view3 == null) {
                    }
                }
            } else if (i9 != 3) {
                if (i9 == 4) {
                    eVar = (n.e) hVar.f2225d;
                    n.e eVar3 = (n.e) hVar2.f2225d;
                    iF = eVar.f();
                    i14 = i4;
                    while (i14 < iF) {
                        view7 = (View) eVar.g(i14);
                        if (view7 == null) {
                            qVar4 = qVar;
                        } else {
                            qVar4 = qVar;
                        }
                        i14++;
                        qVar = qVar4;
                        l4 = null;
                    }
                }
                qVar3 = qVar;
            } else {
                qVar3 = qVar;
                sparseArray = (SparseArray) hVar.f2223b;
                SparseArray sparseArray3 = (SparseArray) hVar2.f2223b;
                size = sparseArray.size();
                while (i13 < size) {
                    view5 = (View) sparseArray.valueAt(i13);
                    if (view5 == null) {
                    }
                }
            }
            i5++;
            qVar = qVar3;
            i4 = 0;
            l4 = null;
            i15 = 1;
        }
        qVar2 = qVar;
        while (i6 < bVar.f3524d) {
            xVar2 = (x) bVar.j(i6);
            if (qVar2.s(xVar2.f1229b)) {
                qVar2.f1207l.add(xVar2);
                qVar2.f1208m.add(null);
            }
        }
        while (i7 < bVar2.f3524d) {
            xVar = (x) bVar2.j(i7);
            if (qVar2.s(xVar.f1229b)) {
                qVar2.f1208m.add(xVar);
                qVar2.f1207l.add(null);
            }
        }
        bVarO = q.o();
        int i17 = bVarO.f3524d;
        c0 c0Var2 = y.f1231a;
        h0 h0Var2 = new h0(viewGroup2);
        while (i8 >= 0) {
            animator = (Animator) bVarO.h(i8);
            if (animator == null) {
            }
        }
        qVar2.l(viewGroup2, qVar2.f1203h, qVar2.f1204i, qVar2.f1207l, qVar2.f1208m);
        qVar2.y();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1218c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f1221c;
        ViewGroup viewGroup2 = this.f1218c;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((q) it.next()).x(viewGroup2);
            }
        }
        this.f1217b.i(true);
    }
}
