package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d1 {
    public static void i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (i0.y0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                i(arrayList, childAt);
            }
        }
    }

    public static void j(n.b bVar, View view) {
        WeakHashMap weakHashMap = i0.v0.f2983a;
        String strK = i0.k0.k(view);
        if (strK != null) {
            bVar.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(n.b bVar, Collection collection) {
        Iterator it = ((n.h) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            WeakHashMap weakHashMap = i0.v0.f2983a;
            if (!collection.contains(i0.k0.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x044c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0453  */
    /* JADX WARN: Code duplicated, block: B:154:0x0459  */
    /* JADX WARN: Code duplicated, block: B:157:0x0469  */
    /* JADX WARN: Code duplicated, block: B:158:0x0470  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    @Override // androidx.fragment.app.d1
    public final void b(ArrayList arrayList, boolean z4) {
        ArrayList<f> arrayList2;
        HashMap map;
        ArrayList arrayList3;
        h hVar;
        String str;
        boolean z5;
        String str2;
        c1 c1Var;
        Object obj;
        View view;
        Rect rect;
        View view2;
        View view3;
        String str3;
        ArrayList arrayList4;
        Rect rect2;
        HashMap map2;
        View view4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        View view5;
        boolean z6 = z4;
        Iterator it = arrayList.iterator();
        c1 c1Var2 = null;
        c1 c1Var3 = null;
        while (it.hasNext()) {
            c1 c1Var4 = (c1) it.next();
            int iC = defpackage.a.c(c1Var4.f715c.F);
            int iA = p.h.a(c1Var4.f713a);
            if (iA != 0) {
                if (iA != 1) {
                    if (iA == 2 || iA == 3) {
                    }
                } else if (iC != 2) {
                    c1Var3 = c1Var4;
                }
            }
            if (iC == 2 && c1Var2 == null) {
                c1Var2 = c1Var4;
            }
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList<g> arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z7 = false;
            if (!it2.hasNext()) {
                break;
            }
            c1 c1Var5 = (c1) it2.next();
            e0.e eVar = new e0.e();
            c1Var5.d();
            HashSet hashSet = c1Var5.f717e;
            hashSet.add(eVar);
            f fVar = new f(c1Var5, eVar);
            fVar.f738d = false;
            fVar.f737c = z6;
            arrayList9.add(fVar);
            e0.e eVar2 = new e0.e();
            c1Var5.d();
            hashSet.add(eVar2);
            if (z6) {
                if (c1Var5 == c1Var2) {
                    z7 = true;
                }
            } else if (c1Var5 == c1Var3) {
                z7 = true;
            }
            arrayList10.add(new g(c1Var5, eVar2, z6, z7));
            c1Var5.f716d.add(new q0(this, arrayList11, c1Var5));
        }
        HashMap map3 = new HashMap();
        Iterator it3 = arrayList10.iterator();
        y0 y0Var = null;
        while (it3.hasNext()) {
            g gVar = (g) it3.next();
            if (!gVar.e()) {
                Object obj2 = gVar.f742c;
                y0 y0VarH = gVar.h(obj2);
                Object obj3 = gVar.f744e;
                y0 y0VarH2 = gVar.h(obj3);
                Iterator it4 = it3;
                if (y0VarH != null && y0VarH2 != null && y0VarH != y0VarH2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((c1) gVar.f1775a).f715c + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj3);
                }
                if (y0VarH == null) {
                    y0VarH = y0VarH2;
                }
                if (y0Var == null) {
                    y0Var = y0VarH;
                } else if (y0VarH != null && y0Var != y0VarH) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((c1) gVar.f1775a).f715c + " returned Transition " + obj2 + " which uses a different Transition  type than other Fragments.");
                }
                it3 = it4;
            }
        }
        ViewGroup viewGroup = this.f728a;
        String str4 = "FragmentManager";
        if (y0Var == null) {
            for (g gVar2 : arrayList10) {
                map3.put((c1) gVar2.f1775a, Boolean.FALSE);
                gVar2.b();
            }
            arrayList3 = arrayList11;
            hVar = this;
            map = map3;
            arrayList2 = arrayList9;
            z5 = false;
            str = "FragmentManager";
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect3 = new Rect();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            n.b bVar = new n.b();
            Iterator it5 = arrayList10.iterator();
            Rect rect4 = rect3;
            ArrayList arrayList14 = arrayList11;
            Object obj4 = null;
            View view7 = null;
            boolean z8 = false;
            while (it5.hasNext()) {
                ArrayList arrayList15 = arrayList9;
                Object obj5 = ((g) it5.next()).f744e;
                if (obj5 == null || c1Var2 == null || c1Var3 == null) {
                    view3 = view7;
                    str3 = str4;
                    arrayList4 = arrayList10;
                    rect2 = rect4;
                    arrayList14 = arrayList14;
                    arrayList12 = arrayList12;
                    map2 = map3;
                    bVar = bVar;
                    view4 = view6;
                    arrayList13 = arrayList13;
                } else {
                    Object objT = y0Var.t(y0Var.f(obj5));
                    q qVar = c1Var3.f715c;
                    str3 = str4;
                    o oVar = qVar.I;
                    if (oVar == null || (arrayList5 = oVar.f830i) == null) {
                        arrayList5 = new ArrayList();
                    }
                    view3 = view7;
                    q qVar2 = c1Var2.f715c;
                    o oVar2 = qVar2.I;
                    if (oVar2 == null || (arrayList6 = oVar2.f830i) == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList4 = arrayList10;
                    o oVar3 = qVar2.I;
                    if (oVar3 == null || (arrayList7 = oVar3.f831j) == null) {
                        arrayList7 = new ArrayList();
                    }
                    HashMap map4 = map3;
                    view4 = view6;
                    int i4 = 0;
                    while (i4 < arrayList7.size()) {
                        int iIndexOf = arrayList5.indexOf(arrayList7.get(i4));
                        ArrayList arrayList16 = arrayList7;
                        if (iIndexOf != -1) {
                            arrayList5.set(iIndexOf, arrayList6.get(i4));
                        }
                        i4++;
                        arrayList7 = arrayList16;
                    }
                    o oVar4 = qVar.I;
                    if (oVar4 == null || (arrayList8 = oVar4.f831j) == null) {
                        arrayList8 = new ArrayList();
                    }
                    int i5 = 0;
                    for (int size = arrayList5.size(); i5 < size; size = size) {
                        bVar.put((String) arrayList5.get(i5), (String) arrayList8.get(i5));
                        i5++;
                    }
                    n.b bVar2 = new n.b();
                    j(bVar2, qVar2.F);
                    h.d.n(bVar2, arrayList5);
                    h.d.n(bVar, bVar2.keySet());
                    n.b bVar3 = new n.b();
                    j(bVar3, qVar.F);
                    h.d.n(bVar3, arrayList8);
                    h.d.n(bVar3, bVar.values());
                    w0 w0Var = r0.f878a;
                    int i6 = bVar.f3524d - 1;
                    while (i6 >= 0) {
                        ArrayList arrayList17 = arrayList8;
                        if (!bVar3.containsKey((String) bVar.j(i6))) {
                            bVar.i(i6);
                        }
                        i6--;
                        arrayList8 = arrayList17;
                    }
                    ArrayList arrayList18 = arrayList8;
                    k(bVar2, bVar.keySet());
                    k(bVar3, bVar.values());
                    if (bVar.isEmpty()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        bVar = bVar;
                        arrayList13 = arrayList13;
                        arrayList12 = arrayList12;
                        rect2 = rect4;
                        arrayList14 = arrayList14;
                        view7 = view3;
                        map2 = map4;
                        view4 = view4;
                        obj4 = null;
                    } else {
                        r0.a(qVar, qVar2, z6);
                        i0.v.a(viewGroup, new e(c1Var3, c1Var2, z6, bVar3));
                        arrayList12.addAll(bVar2.values());
                        if (!arrayList5.isEmpty()) {
                            View view8 = (View) bVar2.getOrDefault((String) arrayList5.get(0), null);
                            y0Var.n(view8, objT);
                            view3 = view8;
                        }
                        arrayList13.addAll(bVar3.values());
                        if (arrayList18.isEmpty() || (view5 = (View) bVar3.getOrDefault((String) arrayList18.get(0), null)) == null) {
                            rect2 = rect4;
                            y0Var = y0Var;
                        } else {
                            rect2 = rect4;
                            i0.v.a(viewGroup, new h.g(this, y0Var, view5, rect2, 1));
                            y0Var = y0Var;
                            z8 = true;
                        }
                        y0Var.r(objT, view4, arrayList12);
                        y0Var.m(objT, null, null, null, null, objT, arrayList13);
                        Boolean bool = Boolean.TRUE;
                        map2 = map4;
                        map2.put(c1Var2, bool);
                        map2.put(c1Var3, bool);
                        obj4 = objT;
                    }
                    rect4 = rect2;
                    arrayList14 = arrayList14;
                    arrayList13 = arrayList13;
                    arrayList9 = arrayList15;
                    str4 = str3;
                    z6 = z4;
                    view6 = view4;
                    bVar = bVar;
                    map3 = map2;
                    arrayList12 = arrayList12;
                    arrayList10 = arrayList4;
                }
                view7 = view3;
                rect4 = rect2;
                arrayList14 = arrayList14;
                arrayList13 = arrayList13;
                arrayList9 = arrayList15;
                str4 = str3;
                z6 = z4;
                view6 = view4;
                bVar = bVar;
                map3 = map2;
                arrayList12 = arrayList12;
                arrayList10 = arrayList4;
            }
            View view9 = view7;
            String str5 = str4;
            arrayList2 = arrayList9;
            ArrayList arrayList19 = arrayList10;
            Rect rect5 = rect4;
            ArrayList arrayList20 = arrayList14;
            ArrayList arrayList21 = arrayList12;
            map = map3;
            n.b bVar4 = bVar;
            View view10 = view6;
            ArrayList arrayList22 = arrayList13;
            ArrayList arrayList23 = new ArrayList();
            Iterator it6 = arrayList19.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it6.hasNext()) {
                g gVar3 = (g) it6.next();
                if (gVar3.e()) {
                    map.put((c1) gVar3.f1775a, Boolean.FALSE);
                    gVar3.b();
                    it6 = it6;
                    bVar4 = bVar4;
                } else {
                    Iterator it7 = it6;
                    n.b bVar5 = bVar4;
                    Object objF = y0Var.f(gVar3.f742c);
                    c1 c1Var6 = (c1) gVar3.f1775a;
                    boolean z9 = obj4 != null && (c1Var6 == c1Var2 || c1Var6 == c1Var3);
                    if (objF == null) {
                        if (!z9) {
                            map.put(c1Var6, Boolean.FALSE);
                            gVar3.b();
                        }
                        view = view10;
                        obj = obj4;
                        arrayList20 = arrayList20;
                        c1Var = c1Var3;
                        view2 = view9;
                        rect = rect5;
                    } else {
                        c1Var = c1Var3;
                        ArrayList arrayList24 = new ArrayList();
                        obj = obj4;
                        i(arrayList24, c1Var6.f715c.F);
                        if (z9) {
                            if (c1Var6 == c1Var2) {
                                arrayList24.removeAll(arrayList21);
                            } else {
                                arrayList24.removeAll(arrayList22);
                            }
                        }
                        if (arrayList24.isEmpty()) {
                            y0Var.a(view10, objF);
                            view = view10;
                        } else {
                            y0Var.b(objF, arrayList24);
                            y0Var.m(objF, objF, arrayList24, null, null, null, null);
                            view = view10;
                            if (c1Var6.f713a == 3) {
                                arrayList20.remove(c1Var6);
                                ArrayList arrayList25 = new ArrayList(arrayList24);
                                q qVar3 = c1Var6.f715c;
                                arrayList25.remove(qVar3.F);
                                y0Var.l(objF, qVar3.F, arrayList25);
                                i0.v.a(viewGroup, new i.j(this, 5, arrayList24));
                            }
                            if (c1Var6.f713a == 2) {
                                arrayList23.addAll(arrayList24);
                                rect = rect5;
                                if (z8) {
                                    y0Var.o(objF, rect);
                                }
                                view2 = view9;
                            } else {
                                rect = rect5;
                                view2 = view9;
                                y0Var.n(view2, objF);
                            }
                            map.put(c1Var6, Boolean.TRUE);
                            if (gVar3.f743d) {
                                objJ = y0Var.j(objJ, objF, null);
                            } else {
                                objJ2 = y0Var.j(objJ2, objF, null);
                            }
                        }
                        if (c1Var6.f713a == 2) {
                            arrayList23.addAll(arrayList24);
                            rect = rect5;
                            if (z8) {
                                y0Var.o(objF, rect);
                            }
                            view2 = view9;
                        } else {
                            rect = rect5;
                            view2 = view9;
                            y0Var.n(view2, objF);
                        }
                        map.put(c1Var6, Boolean.TRUE);
                        if (gVar3.f743d) {
                            objJ = y0Var.j(objJ, objF, null);
                        } else {
                            objJ2 = y0Var.j(objJ2, objF, null);
                        }
                    }
                    it6 = it7;
                    rect5 = rect;
                    view9 = view2;
                    view10 = view;
                    arrayList20 = arrayList20;
                    bVar4 = bVar5;
                    c1Var3 = c1Var;
                    obj4 = obj;
                }
            }
            Object obj6 = obj4;
            arrayList3 = arrayList20;
            c1 c1Var7 = c1Var3;
            n.b bVar6 = bVar4;
            hVar = this;
            Object objI = y0Var.i(objJ, objJ2, obj6);
            Iterator it8 = arrayList19.iterator();
            while (it8.hasNext()) {
                g gVar4 = (g) it8.next();
                if (!gVar4.e()) {
                    c1 c1Var8 = (c1) gVar4.f1775a;
                    c1 c1Var9 = c1Var7;
                    boolean z10 = obj6 != null && (c1Var8 == c1Var2 || c1Var8 == c1Var9);
                    if (gVar4.f742c != null || z10) {
                        WeakHashMap weakHashMap = i0.v0.f2983a;
                        if (i0.h0.c(viewGroup)) {
                            it8 = it8;
                            str2 = str5;
                            q qVar4 = ((c1) gVar4.f1775a).f715c;
                            y0Var.p(objI, new i.j(hVar, 6, gVar4));
                        } else {
                            str2 = str5;
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + c1Var8);
                            }
                            gVar4.b();
                        }
                    } else {
                        it8 = it8;
                        str2 = str5;
                    }
                    it8 = it8;
                    c1Var7 = c1Var9;
                    str5 = str2;
                }
            }
            str = str5;
            WeakHashMap weakHashMap2 = i0.v0.f2983a;
            if (i0.h0.c(viewGroup)) {
                r0.b(arrayList23, 4);
                ArrayList arrayListK = y0.k(arrayList22);
                y0Var.c(viewGroup, objI);
                y0.q(viewGroup, arrayList21, arrayList22, arrayListK, bVar6);
                z5 = false;
                r0.b(arrayList23, 0);
                y0Var.s(obj6, arrayList21, arrayList22);
            } else {
                z5 = false;
            }
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList<f> arrayList26 = new ArrayList();
        boolean z11 = z5;
        for (f fVar2 : arrayList2) {
            if (fVar2.e()) {
                fVar2.b();
            } else {
                x xVarH = fVar2.h(context);
                if (xVarH == null) {
                    fVar2.b();
                } else {
                    Animator animator = xVarH.f911b;
                    if (animator == null) {
                        arrayList26.add(fVar2);
                    } else {
                        c1 c1Var10 = (c1) fVar2.f1775a;
                        q qVar5 = c1Var10.f715c;
                        if (Boolean.TRUE.equals(map.get(c1Var10))) {
                            if (Log.isLoggable(str, 2)) {
                                Log.v(str, "Ignoring Animator set on " + qVar5 + " as this Fragment was involved in a Transition.");
                            }
                            fVar2.b();
                        } else {
                            boolean z12 = c1Var10.f713a == 3 ? true : z5;
                            ArrayList arrayList27 = arrayList3;
                            if (z12) {
                                arrayList27.remove(c1Var10);
                            }
                            View view11 = qVar5.F;
                            viewGroup.startViewTransition(view11);
                            animator.addListener(new c(viewGroup, view11, z12, c1Var10, fVar2));
                            animator.setTarget(view11);
                            animator.start();
                            ((e0.e) fVar2.f1776b).b(new i.a0(hVar, animator, 7));
                            arrayList3 = arrayList27;
                            z11 = true;
                        }
                    }
                }
            }
        }
        ArrayList<c1> arrayList28 = arrayList3;
        for (f fVar3 : arrayList26) {
            c1 c1Var11 = (c1) fVar3.f1775a;
            q qVar6 = c1Var11.f715c;
            if (zContainsValue) {
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Ignoring Animation set on " + qVar6 + " as Animations cannot run alongside Transitions.");
                }
                fVar3.b();
            } else if (z11) {
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Ignoring Animation set on " + qVar6 + " as Animations cannot run alongside Animators.");
                }
                fVar3.b();
            } else {
                View view12 = qVar6.F;
                x xVarH2 = fVar3.h(context);
                xVarH2.getClass();
                Animation animation = xVarH2.f910a;
                animation.getClass();
                if (c1Var11.f713a != 1) {
                    view12.startAnimation(animation);
                    fVar3.b();
                } else {
                    viewGroup.startViewTransition(view12);
                    y yVar = new y(animation, viewGroup, view12);
                    yVar.setAnimationListener(new d(view12, viewGroup, fVar3, hVar));
                    view12.startAnimation(yVar);
                }
                e0.e eVar3 = (e0.e) fVar3.f1776b;
                g.h hVar2 = new g.h();
                hVar2.f2226e = hVar;
                hVar2.f2224c = view12;
                hVar2.f2223b = viewGroup;
                hVar2.f2225d = fVar3;
                eVar3.b(hVar2);
            }
        }
        for (c1 c1Var12 : arrayList28) {
            defpackage.a.a(c1Var12.f713a, c1Var12.f715c.F);
        }
        arrayList28.clear();
    }
}
