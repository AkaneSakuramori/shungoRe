package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.shungo.app.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.a0 f817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f820d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f821e = -1;

    public n0(i.a0 a0Var, o0 o0Var, q qVar) {
        this.f817a = a0Var;
        this.f818b = o0Var;
        this.f819c = qVar;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + qVar);
        }
        Bundle bundle = qVar.f849c;
        qVar.f867u.J();
        qVar.f848b = 3;
        qVar.D = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + qVar);
        }
        View view = qVar.F;
        if (view != null) {
            Bundle bundle2 = qVar.f849c;
            SparseArray<Parcelable> sparseArray = qVar.f850d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                qVar.f850d = null;
            }
            if (qVar.F != null) {
                qVar.O.f927d.b(qVar.f851e);
                qVar.f851e = null;
            }
            qVar.D = false;
            qVar.z(bundle2);
            if (!qVar.D) {
                throw new e1("Fragment " + qVar + " did not call through to super.onViewStateRestored()");
            }
            if (qVar.F != null) {
                qVar.O.b(androidx.lifecycle.l.ON_CREATE);
            }
        }
        qVar.f849c = null;
        i0 i0Var = qVar.f867u;
        i0Var.A = false;
        i0Var.B = false;
        i0Var.H.f792h = false;
        i0Var.s(4);
        this.f817a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        o0 o0Var = this.f818b;
        o0Var.getClass();
        q qVar = this.f819c;
        ViewGroup viewGroup = qVar.E;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = o0Var.f837a;
            int iIndexOf = arrayList.indexOf(qVar);
            for (int i4 = iIndexOf - 1; i4 >= 0; i4--) {
                q qVar2 = (q) arrayList.get(i4);
                if (qVar2.E == viewGroup && (view2 = qVar2.F) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                q qVar3 = (q) arrayList.get(iIndexOf);
                if (qVar3.E == viewGroup && (view = qVar3.F) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        qVar.E.addView(qVar.F, iIndexOfChild);
    }

    public final void c() {
        n0 n0Var;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + qVar);
        }
        q qVar2 = qVar.f854h;
        o0 o0Var = this.f818b;
        if (qVar2 != null) {
            n0Var = (n0) o0Var.f838b.get(qVar2.f852f);
            if (n0Var == null) {
                throw new IllegalStateException("Fragment " + qVar + " declared target fragment " + qVar.f854h + " that does not belong to this FragmentManager!");
            }
            qVar.f855i = qVar.f854h.f852f;
            qVar.f854h = null;
        } else {
            String str = qVar.f855i;
            if (str != null) {
                n0Var = (n0) o0Var.f838b.get(str);
                if (n0Var == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(qVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(defpackage.a.h(sb, qVar.f855i, " that does not belong to this FragmentManager!"));
                }
            } else {
                n0Var = null;
            }
        }
        if (n0Var != null) {
            n0Var.k();
        }
        i0 i0Var = qVar.f865s;
        qVar.f866t = i0Var.f764p;
        qVar.f868v = i0Var.f766r;
        i.a0 a0Var = this.f817a;
        a0Var.i(false);
        ArrayList arrayList = qVar.R;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
        arrayList.clear();
        qVar.f867u.b(qVar.f866t, qVar.b(), qVar);
        qVar.f848b = 0;
        qVar.D = false;
        qVar.p(qVar.f866t.f884k);
        if (!qVar.D) {
            throw new e1("Fragment " + qVar + " did not call through to super.onAttach()");
        }
        Iterator it2 = qVar.f865s.f762n.iterator();
        while (it2.hasNext()) {
            ((l0) it2.next()).z();
        }
        i0 i0Var2 = qVar.f867u;
        i0Var2.A = false;
        i0Var2.B = false;
        i0Var2.H.f792h = false;
        i0Var2.s(0);
        a0Var.b(false);
    }

    public final int d() {
        c1 c1Var;
        q qVar = this.f819c;
        if (qVar.f865s == null) {
            return qVar.f848b;
        }
        int iMin = this.f821e;
        int iOrdinal = qVar.M.ordinal();
        int i4 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (qVar.f860n) {
            if (qVar.f861o) {
                iMin = Math.max(this.f821e, 2);
                View view = qVar.F;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f821e < 4 ? Math.min(iMin, qVar.f848b) : Math.min(iMin, 1);
            }
        }
        if (!qVar.f858l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = qVar.E;
        if (viewGroup != null) {
            d1 d1VarF = d1.f(viewGroup, qVar.j().C());
            d1VarF.getClass();
            c1 c1VarD = d1VarF.d(qVar);
            i4 = c1VarD != null ? c1VarD.f714b : 0;
            Iterator it = d1VarF.f730c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1Var = null;
                    break;
                }
                c1Var = (c1) it.next();
                if (c1Var.f715c.equals(qVar) && !c1Var.f718f) {
                    break;
                }
            }
            if (c1Var != null && (i4 == 0 || i4 == 1)) {
                i4 = c1Var.f714b;
            }
        }
        if (i4 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i4 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (qVar.f859m) {
            iMin = qVar.f864r > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (qVar.G && qVar.f848b < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + qVar);
        }
        return iMin;
    }

    public final void e() {
        Parcelable parcelable;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        final q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + qVar);
        }
        if (qVar.L) {
            Bundle bundle = qVar.f849c;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                qVar.f867u.O(parcelable);
                i0 i0Var = qVar.f867u;
                i0Var.A = false;
                i0Var.B = false;
                i0Var.H.f792h = false;
                i0Var.s(1);
            }
            qVar.f848b = 1;
            return;
        }
        i.a0 a0Var = this.f817a;
        a0Var.j(false);
        Bundle bundle2 = qVar.f849c;
        qVar.f867u.J();
        qVar.f848b = 1;
        qVar.D = false;
        qVar.N.a(new androidx.lifecycle.p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                View view;
                if (lVar != androidx.lifecycle.l.ON_STOP || (view = qVar.F) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        qVar.Q.b(bundle2);
        qVar.q(bundle2);
        qVar.L = true;
        if (qVar.D) {
            qVar.N.e(androidx.lifecycle.l.ON_CREATE);
            a0Var.c(false);
        } else {
            throw new e1("Fragment " + qVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        q qVar = this.f819c;
        if (qVar.f860n) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + qVar);
        }
        LayoutInflater layoutInflaterV = qVar.v(qVar.f849c);
        ViewGroup viewGroup = qVar.E;
        if (viewGroup == null) {
            int i4 = qVar.f870x;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + qVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) qVar.f865s.f765q.F1(i4);
                if (viewGroup == null && !qVar.f862p) {
                    try {
                        resourceName = qVar.C().getResources().getResourceName(qVar.f870x);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(qVar.f870x) + " (" + resourceName + ") for fragment " + qVar);
                }
            }
        }
        qVar.E = viewGroup;
        qVar.A(layoutInflaterV, viewGroup, qVar.f849c);
        View view = qVar.F;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            qVar.F.setTag(R.id.fragment_container_view_tag, qVar);
            if (viewGroup != null) {
                b();
            }
            if (qVar.f872z) {
                qVar.F.setVisibility(8);
            }
            View view2 = qVar.F;
            WeakHashMap weakHashMap = i0.v0.f2983a;
            if (i0.h0.b(view2)) {
                i0.i0.c(qVar.F);
            } else {
                View view3 = qVar.F;
                view3.addOnAttachStateChangeListener(new z(this, view3));
            }
            qVar.f867u.s(2);
            this.f817a.o(false);
            int visibility = qVar.F.getVisibility();
            qVar.d().f835n = qVar.F.getAlpha();
            if (qVar.E != null && visibility == 0) {
                View viewFindFocus = qVar.F.findFocus();
                if (viewFindFocus != null) {
                    qVar.d().f836o = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + qVar);
                    }
                }
                qVar.F.setAlpha(0.0f);
            }
        }
        qVar.f848b = 2;
    }

    public final void g() {
        boolean z4;
        q qVarB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + qVar);
        }
        boolean z5 = qVar.f859m && qVar.f864r <= 0;
        o0 o0Var = this.f818b;
        if (!z5) {
            k0 k0Var = o0Var.f839c;
            if (k0Var.f787c.containsKey(qVar.f852f) && k0Var.f790f && !k0Var.f791g) {
                String str = qVar.f855i;
                if (str != null && (qVarB = o0Var.b(str)) != null && qVarB.B) {
                    qVar.f854h = qVarB;
                }
                qVar.f848b = 0;
                return;
            }
        }
        t tVar = qVar.f866t;
        if (tVar instanceof androidx.lifecycle.r0) {
            z4 = o0Var.f839c.f791g;
        } else {
            Context context = tVar.f884k;
            z4 = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if (z5 || z4) {
            k0 k0Var2 = o0Var.f839c;
            k0Var2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + qVar);
            }
            HashMap map = k0Var2.f788d;
            k0 k0Var3 = (k0) map.get(qVar.f852f);
            if (k0Var3 != null) {
                k0Var3.a();
                map.remove(qVar.f852f);
            }
            HashMap map2 = k0Var2.f789e;
            androidx.lifecycle.q0 q0Var = (androidx.lifecycle.q0) map2.get(qVar.f852f);
            if (q0Var != null) {
                q0Var.a();
                map2.remove(qVar.f852f);
            }
        }
        qVar.f867u.k();
        qVar.N.e(androidx.lifecycle.l.ON_DESTROY);
        qVar.f848b = 0;
        qVar.L = false;
        qVar.D = true;
        this.f817a.f(false);
        for (n0 n0Var : o0Var.d()) {
            if (n0Var != null) {
                String str2 = qVar.f852f;
                q qVar2 = n0Var.f819c;
                if (str2.equals(qVar2.f855i)) {
                    qVar2.f854h = qVar;
                    qVar2.f855i = null;
                }
            }
        }
        String str3 = qVar.f855i;
        if (str3 != null) {
            qVar.f854h = o0Var.b(str3);
        }
        o0Var.h(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + qVar);
        }
        ViewGroup viewGroup = qVar.E;
        if (viewGroup != null && (view = qVar.F) != null) {
            viewGroup.removeView(view);
        }
        qVar.B();
        this.f817a.p(false);
        qVar.E = null;
        qVar.F = null;
        qVar.O = null;
        qVar.P.e(null);
        qVar.f861o = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + qVar);
        }
        qVar.f848b = -1;
        qVar.D = false;
        qVar.u();
        if (!qVar.D) {
            throw new e1("Fragment " + qVar + " did not call through to super.onDetach()");
        }
        i0 i0Var = qVar.f867u;
        if (!i0Var.C) {
            i0Var.k();
            qVar.f867u = new i0();
        }
        this.f817a.g(false);
        qVar.f848b = -1;
        qVar.f866t = null;
        qVar.f868v = null;
        qVar.f865s = null;
        if (!qVar.f859m || qVar.f864r > 0) {
            k0 k0Var = this.f818b.f839c;
            if (k0Var.f787c.containsKey(qVar.f852f) && k0Var.f790f && !k0Var.f791g) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + qVar);
        }
        qVar.N = new androidx.lifecycle.t(qVar);
        qVar.Q = z0.c.b(qVar);
        qVar.f852f = UUID.randomUUID().toString();
        qVar.f858l = false;
        qVar.f859m = false;
        qVar.f860n = false;
        qVar.f861o = false;
        qVar.f862p = false;
        qVar.f864r = 0;
        qVar.f865s = null;
        qVar.f867u = new i0();
        qVar.f866t = null;
        qVar.f869w = 0;
        qVar.f870x = 0;
        qVar.f871y = null;
        qVar.f872z = false;
        qVar.A = false;
    }

    public final void j() {
        q qVar = this.f819c;
        if (qVar.f860n && qVar.f861o && !qVar.f863q) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + qVar);
            }
            qVar.A(qVar.v(qVar.f849c), null, qVar.f849c);
            View view = qVar.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                qVar.F.setTag(R.id.fragment_container_view_tag, qVar);
                if (qVar.f872z) {
                    qVar.F.setVisibility(8);
                }
                qVar.f867u.s(2);
                this.f817a.o(false);
                qVar.f848b = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z4 = this.f820d;
        q qVar = this.f819c;
        if (z4) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + qVar);
                return;
            }
            return;
        }
        try {
            this.f820d = true;
            while (true) {
                int iD = d();
                int i4 = qVar.f848b;
                if (iD == i4) {
                    if (qVar.J) {
                        if (qVar.F != null && (viewGroup = qVar.E) != null) {
                            d1 d1VarF = d1.f(viewGroup, qVar.j().C());
                            if (qVar.f872z) {
                                d1VarF.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + qVar);
                                }
                                d1VarF.a(3, 1, this);
                            } else {
                                d1VarF.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + qVar);
                                }
                                d1VarF.a(2, 1, this);
                            }
                        }
                        i0 i0Var = qVar.f865s;
                        if (i0Var != null && qVar.f858l && i0.E(qVar)) {
                            i0Var.f774z = true;
                        }
                        qVar.J = false;
                    }
                    return;
                }
                if (iD <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            qVar.f848b = 1;
                            break;
                        case 2:
                            qVar.f861o = false;
                            qVar.f848b = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + qVar);
                            }
                            if (qVar.F != null && qVar.f850d == null) {
                                o();
                            }
                            if (qVar.F != null && (viewGroup3 = qVar.E) != null) {
                                d1 d1VarF2 = d1.f(viewGroup3, qVar.j().C());
                                d1VarF2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + qVar);
                                }
                                d1VarF2.a(1, 3, this);
                            }
                            qVar.f848b = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            qVar.f848b = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (qVar.F != null && (viewGroup2 = qVar.E) != null) {
                                d1 d1VarF3 = d1.f(viewGroup2, qVar.j().C());
                                int iB = defpackage.a.b(qVar.F.getVisibility());
                                d1VarF3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + qVar);
                                }
                                d1VarF3.a(iB, 2, this);
                            }
                            qVar.f848b = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            qVar.f848b = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } finally {
            this.f820d = false;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + qVar);
        }
        qVar.f867u.s(5);
        if (qVar.F != null) {
            qVar.O.b(androidx.lifecycle.l.ON_PAUSE);
        }
        qVar.N.e(androidx.lifecycle.l.ON_PAUSE);
        qVar.f848b = 6;
        qVar.D = true;
        this.f817a.h(false);
    }

    public final void m(ClassLoader classLoader) {
        q qVar = this.f819c;
        Bundle bundle = qVar.f849c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        qVar.f850d = qVar.f849c.getSparseParcelableArray("android:view_state");
        qVar.f851e = qVar.f849c.getBundle("android:view_registry_state");
        String string = qVar.f849c.getString("android:target_state");
        qVar.f855i = string;
        if (string != null) {
            qVar.f856j = qVar.f849c.getInt("android:target_req_state", 0);
        }
        boolean z4 = qVar.f849c.getBoolean("android:user_visible_hint", true);
        qVar.H = z4;
        if (z4) {
            return;
        }
        qVar.G = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + qVar);
        }
        o oVar = qVar.I;
        View view = oVar == null ? null : oVar.f836o;
        if (view != null) {
            if (view == qVar.F) {
                zRequestFocus = view.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(qVar);
                    sb.append(" resulting in focused view ");
                    sb.append(qVar.F.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == qVar.F) {
                            zRequestFocus = view.requestFocus();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(qVar);
                                sb2.append(" resulting in focused view ");
                                sb2.append(qVar.F.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        qVar.d().f836o = null;
        qVar.f867u.J();
        qVar.f867u.x(true);
        qVar.f848b = 7;
        qVar.D = true;
        androidx.lifecycle.t tVar = qVar.N;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.e(lVar);
        if (qVar.F != null) {
            qVar.O.f926c.e(lVar);
        }
        i0 i0Var = qVar.f867u;
        i0Var.A = false;
        i0Var.B = false;
        i0Var.H.f792h = false;
        i0Var.s(7);
        this.f817a.k(false);
        qVar.f849c = null;
        qVar.f850d = null;
        qVar.f851e = null;
    }

    public final void o() {
        q qVar = this.f819c;
        if (qVar.F == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        qVar.F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            qVar.f850d = sparseArray;
        }
        Bundle bundle = new Bundle();
        qVar.O.f927d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        qVar.f851e = bundle;
    }

    public final void p() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + qVar);
        }
        qVar.f867u.J();
        qVar.f867u.x(true);
        qVar.f848b = 5;
        qVar.D = false;
        qVar.x();
        if (!qVar.D) {
            throw new e1("Fragment " + qVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = qVar.N;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
        tVar.e(lVar);
        if (qVar.F != null) {
            qVar.O.f926c.e(lVar);
        }
        i0 i0Var = qVar.f867u;
        i0Var.A = false;
        i0Var.B = false;
        i0Var.H.f792h = false;
        i0Var.s(5);
        this.f817a.m(false);
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        q qVar = this.f819c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + qVar);
        }
        i0 i0Var = qVar.f867u;
        i0Var.B = true;
        i0Var.H.f792h = true;
        i0Var.s(4);
        if (qVar.F != null) {
            qVar.O.b(androidx.lifecycle.l.ON_STOP);
        }
        qVar.N.e(androidx.lifecycle.l.ON_STOP);
        qVar.f848b = 4;
        qVar.D = false;
        qVar.y();
        if (qVar.D) {
            this.f817a.n(false);
            return;
        }
        throw new e1("Fragment " + qVar + " did not call through to super.onStop()");
    }

    public n0(i.a0 a0Var, o0 o0Var, ClassLoader classLoader, d0 d0Var, m0 m0Var) {
        this.f817a = a0Var;
        this.f818b = o0Var;
        q qVarA = d0Var.a(m0Var.f803b);
        this.f819c = qVarA;
        Bundle bundle = m0Var.f812k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        qVarA.F(bundle);
        qVarA.f852f = m0Var.f804c;
        qVarA.f860n = m0Var.f805d;
        qVarA.f862p = true;
        qVarA.f869w = m0Var.f806e;
        qVarA.f870x = m0Var.f807f;
        qVarA.f871y = m0Var.f808g;
        qVarA.B = m0Var.f809h;
        qVarA.f859m = m0Var.f810i;
        qVarA.A = m0Var.f811j;
        qVarA.f872z = m0Var.f813l;
        qVarA.M = androidx.lifecycle.m.values()[m0Var.f814m];
        Bundle bundle2 = m0Var.f815n;
        if (bundle2 != null) {
            qVarA.f849c = bundle2;
        } else {
            qVarA.f849c = new Bundle();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + qVarA);
        }
    }

    public n0(i.a0 a0Var, o0 o0Var, q qVar, m0 m0Var) {
        this.f817a = a0Var;
        this.f818b = o0Var;
        this.f819c = qVar;
        qVar.f850d = null;
        qVar.f851e = null;
        qVar.f864r = 0;
        qVar.f861o = false;
        qVar.f858l = false;
        q qVar2 = qVar.f854h;
        qVar.f855i = qVar2 != null ? qVar2.f852f : null;
        qVar.f854h = null;
        Bundle bundle = m0Var.f815n;
        if (bundle != null) {
            qVar.f849c = bundle;
        } else {
            qVar.f849c = new Bundle();
        }
    }
}
