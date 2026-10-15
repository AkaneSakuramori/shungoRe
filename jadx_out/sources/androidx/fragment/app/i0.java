package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.shungo.app.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public k0 H;
    public final v I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f750b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f753e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.z f755g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i.a0 f761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c3.h f765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q f766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0 f768t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b0 f769u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.activity.result.d f770v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.activity.result.d f771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.activity.result.d f772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayDeque f773y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f774z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f749a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f751c = new o0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f754f = new a0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f756h = new c0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f757i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f758j = Collections.synchronizedMap(new HashMap());

    public i0() {
        Collections.synchronizedMap(new HashMap());
        this.f759k = Collections.synchronizedMap(new HashMap());
        this.f760l = new b0(this, 2);
        this.f761m = new i.a0(this);
        this.f762n = new CopyOnWriteArrayList();
        this.f763o = -1;
        this.f768t = new d0(this);
        int i4 = 3;
        this.f769u = new b0(this, i4);
        this.f773y = new ArrayDeque();
        this.I = new v(i4, this);
    }

    public static boolean E(q qVar) {
        qVar.getClass();
        boolean zE = false;
        for (q qVar2 : qVar.f867u.f751c.e()) {
            if (qVar2 != null) {
                zE = E(qVar2);
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(q qVar) {
        if (qVar == null) {
            return true;
        }
        return qVar.C && (qVar.f865s == null || F(qVar.f868v));
    }

    public static boolean G(q qVar) {
        if (qVar == null) {
            return true;
        }
        i0 i0Var = qVar.f865s;
        return qVar.equals(i0Var.f767s) && G(i0Var.f766r);
    }

    public static void V(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + qVar);
        }
        if (qVar.f872z) {
            qVar.f872z = false;
            qVar.J = !qVar.J;
        }
    }

    public final ViewGroup A(q qVar) {
        ViewGroup viewGroup = qVar.E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (qVar.f870x > 0 && this.f765q.J1()) {
            View viewF1 = this.f765q.F1(qVar.f870x);
            if (viewF1 instanceof ViewGroup) {
                return (ViewGroup) viewF1;
            }
        }
        return null;
    }

    public final d0 B() {
        q qVar = this.f766r;
        return qVar != null ? qVar.f865s.B() : this.f768t;
    }

    public final b0 C() {
        q qVar = this.f766r;
        return qVar != null ? qVar.f865s.C() : this.f769u;
    }

    public final void D(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + qVar);
        }
        if (qVar.f872z) {
            return;
        }
        qVar.f872z = true;
        qVar.J = true ^ qVar.J;
        U(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    public final void H(int i4, q qVar) {
        int i5;
        int i6;
        ViewGroup viewGroup;
        HashSet hashSet;
        String str = qVar.f852f;
        o0 o0Var = this.f751c;
        n0 n0Var = (n0) o0Var.f838b.get(str);
        i.a0 a0Var = this.f761m;
        int i7 = 1;
        if (n0Var == null) {
            n0Var = new n0(a0Var, o0Var, qVar);
            n0Var.f821e = 1;
        }
        n0 n0Var2 = n0Var;
        int iMin = Math.min((qVar.f860n && qVar.f861o && qVar.f848b == 2) ? Math.max(i4, 2) : i4, n0Var2.d());
        int i8 = qVar.f848b;
        x xVarV1 = null;
        if (i8 <= iMin) {
            if (i8 < iMin && !this.f759k.isEmpty() && (hashSet = (HashSet) this.f759k.get(qVar)) != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((e0.e) it.next()).a();
                }
                hashSet.clear();
                qVar.B();
                a0Var.p(false);
                qVar.E = null;
                qVar.F = null;
                qVar.O = null;
                qVar.P.e(null);
                qVar.f861o = false;
                this.f759k.remove(qVar);
            }
            int i9 = qVar.f848b;
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 4) {
                                if (i9 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                n0Var2.n();
                            }
                        }
                        if (iMin > 4) {
                            n0Var2.p();
                        }
                        if (iMin > 5) {
                            n0Var2.n();
                        }
                    }
                    if (iMin > 2) {
                        n0Var2.a();
                    }
                    if (iMin > 4) {
                        n0Var2.p();
                    }
                    if (iMin > 5) {
                        n0Var2.n();
                    }
                }
                if (iMin > -1) {
                    n0Var2.j();
                }
                if (iMin > 1) {
                    n0Var2.f();
                }
                if (iMin > 2) {
                    n0Var2.a();
                }
                if (iMin > 4) {
                    n0Var2.p();
                }
                if (iMin > 5) {
                    n0Var2.n();
                }
            } else if (iMin > -1) {
                n0Var2.c();
            }
            if (iMin > 0) {
                n0Var2.e();
            }
            if (iMin > -1) {
                n0Var2.j();
            }
            if (iMin > 1) {
                n0Var2.f();
            }
            if (iMin > 2) {
                n0Var2.a();
            }
            if (iMin > 4) {
                n0Var2.p();
            }
            if (iMin > 5) {
                n0Var2.n();
            }
        } else if (i8 > iMin) {
            if (i8 == 0) {
                i5 = iMin;
                if (i5 < 0) {
                    n0Var2.i();
                }
                iMin = i5;
            } else if (i8 == 1) {
                i6 = 1;
                if (iMin >= i6) {
                    i5 = iMin;
                } else if (this.f759k.get(qVar) != null) {
                    i5 = i6;
                } else {
                    n0Var2.g();
                    i5 = iMin;
                }
                if (i5 < 0) {
                    n0Var2.i();
                }
                iMin = i5;
            } else {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (i8 == 7) {
                                if (iMin < 7) {
                                    n0Var2.l();
                                }
                            }
                        }
                        if (iMin < 5) {
                            n0Var2.q();
                        }
                    }
                    if (iMin < 4) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + qVar);
                        }
                        if (qVar.F != null && (!this.f764p.f887n.isFinishing()) && qVar.f850d == null) {
                            n0Var2.o();
                        }
                    }
                }
                if (iMin < 2) {
                    View view = qVar.F;
                    if (view != null && (viewGroup = qVar.E) != null) {
                        viewGroup.endViewTransition(view);
                        qVar.F.clearAnimation();
                        if (!qVar.n()) {
                            if (this.f763o > -1 && !this.C && qVar.F.getVisibility() == 0 && qVar.K >= 0.0f) {
                                Context context = this.f764p.f884k;
                                o oVar = qVar.I;
                                xVarV1 = c3.h.v1(context, qVar, false, oVar == null ? false : oVar.f824c);
                            }
                            qVar.K = 0.0f;
                            ViewGroup viewGroup2 = qVar.E;
                            View view2 = qVar.F;
                            if (xVarV1 != null) {
                                viewGroup2.startViewTransition(view2);
                                e0.e eVar = new e0.e();
                                eVar.b(new k(i7, qVar));
                                b0 b0Var = this.f760l;
                                b0Var.d(qVar, eVar);
                                Animation animation = xVarV1.f910a;
                                if (animation != null) {
                                    y yVar = new y(animation, viewGroup2, view2);
                                    qVar.d().f822a = qVar.F;
                                    yVar.setAnimationListener(new d(viewGroup2, qVar, b0Var, eVar));
                                    qVar.F.startAnimation(yVar);
                                } else {
                                    o oVarD = qVar.d();
                                    Animator animator = xVarV1.f911b;
                                    oVarD.f823b = animator;
                                    animator.addListener(new w(viewGroup2, view2, qVar, b0Var, eVar));
                                    animator.setTarget(qVar.F);
                                    animator.start();
                                }
                            }
                            viewGroup2.removeView(view2);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + qVar + " from container " + viewGroup2);
                            }
                            if (viewGroup2 != qVar.E) {
                                return;
                            }
                        }
                    }
                    if (this.f759k.get(qVar) == null) {
                        n0Var2.h();
                    }
                    i6 = 1;
                } else {
                    i6 = 1;
                }
                if (iMin >= i6) {
                    i5 = iMin;
                } else if (this.f759k.get(qVar) != null) {
                    i5 = i6;
                } else {
                    n0Var2.g();
                    i5 = iMin;
                }
                if (i5 < 0) {
                    n0Var2.i();
                }
                iMin = i5;
            }
        }
        if (qVar.f848b != iMin) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + qVar + " not updated inline; expected state " + iMin + " found " + qVar.f848b);
            }
            qVar.f848b = iMin;
        }
    }

    public final void I(int i4, boolean z4) {
        HashMap map;
        t tVar;
        if (this.f764p == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i4 != this.f763o) {
            this.f763o = i4;
            o0 o0Var = this.f751c;
            Iterator it = o0Var.f837a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = o0Var.f838b;
                if (!zHasNext) {
                    break;
                }
                n0 n0Var = (n0) map.get(((q) it.next()).f852f);
                if (n0Var != null) {
                    n0Var.k();
                }
            }
            for (n0 n0Var2 : map.values()) {
                if (n0Var2 != null) {
                    n0Var2.k();
                    q qVar = n0Var2.f819c;
                    if (qVar.f859m && qVar.f864r <= 0) {
                        o0Var.h(n0Var2);
                    }
                }
            }
            W();
            if (this.f774z && (tVar = this.f764p) != null && this.f763o == 7) {
                ((e.m) tVar.f887n).l().b();
                this.f774z = false;
            }
        }
    }

    public final void J() {
        if (this.f764p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.f792h = false;
        for (q qVar : this.f751c.f()) {
            if (qVar != null) {
                qVar.f867u.J();
            }
        }
    }

    public final boolean K() {
        x(false);
        w(true);
        q qVar = this.f767s;
        if (qVar != null && qVar.f().K()) {
            return true;
        }
        boolean zL = L(this.E, this.F, null, -1, 0);
        if (zL) {
            this.f750b = true;
            try {
                N(this.E, this.F);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Y();
        t();
        this.f751c.f838b.values().removeAll(Collections.singleton(null));
        return zL;
    }

    public final boolean L(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i5) {
        int i6;
        ArrayList arrayList3 = this.f752d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i4 < 0 && (i5 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f752d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i4 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f752d.get(size2);
                    if ((str != null && str.equals(aVar.f670h)) || (i4 >= 0 && i4 == aVar.f680r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i5 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = (a) this.f752d.get(size2);
                        if (str == null || !str.equals(aVar2.f670h)) {
                            if (i4 < 0 || i4 != aVar2.f680r) {
                                break;
                            }
                        }
                    }
                }
                i6 = size2;
            } else {
                i6 = -1;
            }
            if (i6 == this.f752d.size() - 1) {
                return false;
            }
            for (int size3 = this.f752d.size() - 1; size3 > i6; size3--) {
                arrayList.add(this.f752d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void M(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + qVar + " nesting=" + qVar.f864r);
        }
        boolean z4 = !(qVar.f864r > 0);
        if (!qVar.A || z4) {
            o0 o0Var = this.f751c;
            synchronized (o0Var.f837a) {
                o0Var.f837a.remove(qVar);
            }
            qVar.f858l = false;
            if (E(qVar)) {
                this.f774z = true;
            }
            qVar.f859m = true;
            U(qVar);
        }
    }

    public final void N(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((a) arrayList.get(i4)).f677o) {
                if (i5 != i4) {
                    y(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((a) arrayList.get(i5)).f677o) {
                        i5++;
                    }
                }
                y(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            y(arrayList, arrayList2, i5, size);
        }
    }

    public final void O(Parcelable parcelable) {
        int i4;
        i.a0 a0Var;
        int i5;
        n0 n0Var;
        if (parcelable == null) {
            return;
        }
        j0 j0Var = (j0) parcelable;
        if (j0Var.f776b == null) {
            return;
        }
        o0 o0Var = this.f751c;
        o0Var.f838b.clear();
        Iterator it = j0Var.f776b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i4 = 2;
            a0Var = this.f761m;
            if (!zHasNext) {
                break;
            }
            m0 m0Var = (m0) it.next();
            if (m0Var != null) {
                q qVar = (q) this.H.f787c.get(m0Var.f804c);
                if (qVar != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + qVar);
                    }
                    n0Var = new n0(a0Var, o0Var, qVar, m0Var);
                } else {
                    n0Var = new n0(this.f761m, this.f751c, this.f764p.f884k.getClassLoader(), B(), m0Var);
                }
                q qVar2 = n0Var.f819c;
                qVar2.f865s = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + qVar2.f852f + "): " + qVar2);
                }
                n0Var.m(this.f764p.f884k.getClassLoader());
                o0Var.g(n0Var);
                n0Var.f821e = this.f763o;
            }
        }
        k0 k0Var = this.H;
        k0Var.getClass();
        for (q qVar3 : new ArrayList(k0Var.f787c.values())) {
            if (!(o0Var.f838b.get(qVar3.f852f) != null)) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + qVar3 + " that was not found in the set of active Fragments " + j0Var.f776b);
                }
                this.H.b(qVar3);
                qVar3.f865s = this;
                n0 n0Var2 = new n0(a0Var, o0Var, qVar3);
                n0Var2.f821e = 1;
                n0Var2.k();
                qVar3.f859m = true;
                n0Var2.k();
            }
        }
        ArrayList<String> arrayList = j0Var.f777c;
        o0Var.f837a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                q qVarB = o0Var.b(str);
                if (qVarB == null) {
                    throw new IllegalStateException(defpackage.a.g("No instantiated fragment for (", str, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + qVarB);
                }
                o0Var.a(qVarB);
            }
        }
        q qVar4 = null;
        if (j0Var.f778d != null) {
            this.f752d = new ArrayList(j0Var.f778d.length);
            int i6 = 0;
            while (true) {
                b[] bVarArr = j0Var.f778d;
                if (i6 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i6];
                bVar.getClass();
                a aVar = new a(this);
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    int[] iArr = bVar.f685b;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    p0 p0Var = new p0();
                    int i9 = i7 + 1;
                    p0Var.f840a = iArr[i7];
                    if (Log.isLoggable("FragmentManager", i4)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    String str2 = (String) bVar.f686c.get(i8);
                    if (str2 != null) {
                        p0Var.f841b = o0Var.b(str2);
                    } else {
                        p0Var.f841b = qVar4;
                    }
                    p0Var.f846g = androidx.lifecycle.m.values()[bVar.f687d[i8]];
                    p0Var.f847h = androidx.lifecycle.m.values()[bVar.f688e[i8]];
                    int i10 = iArr[i9];
                    p0Var.f842c = i10;
                    int i11 = iArr[i7 + 2];
                    p0Var.f843d = i11;
                    int i12 = i7 + 4;
                    int i13 = iArr[i7 + 3];
                    p0Var.f844e = i13;
                    i7 += 5;
                    int i14 = iArr[i12];
                    p0Var.f845f = i14;
                    aVar.f664b = i10;
                    aVar.f665c = i11;
                    aVar.f666d = i13;
                    aVar.f667e = i14;
                    aVar.b(p0Var);
                    i8++;
                    qVar4 = null;
                    i4 = 2;
                }
                aVar.f668f = bVar.f689f;
                aVar.f670h = bVar.f690g;
                aVar.f680r = bVar.f691h;
                aVar.f669g = true;
                aVar.f671i = bVar.f692i;
                aVar.f672j = bVar.f693j;
                aVar.f673k = bVar.f694k;
                aVar.f674l = bVar.f695l;
                aVar.f675m = bVar.f696m;
                aVar.f676n = bVar.f697n;
                aVar.f677o = bVar.f698o;
                aVar.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + aVar.f680r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new a1());
                    aVar.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f752d.add(aVar);
                i6++;
                i4 = 2;
                qVar4 = null;
            }
            i5 = 0;
        } else {
            i5 = 0;
            this.f752d = null;
        }
        this.f757i.set(j0Var.f779e);
        String str3 = j0Var.f780f;
        if (str3 != null) {
            q qVarB2 = o0Var.b(str3);
            this.f767s = qVarB2;
            p(qVarB2);
        }
        ArrayList arrayList2 = j0Var.f781g;
        if (arrayList2 != null) {
            while (i5 < arrayList2.size()) {
                Bundle bundle = (Bundle) j0Var.f782h.get(i5);
                bundle.setClassLoader(this.f764p.f884k.getClassLoader());
                this.f758j.put(arrayList2.get(i5), bundle);
                i5++;
            }
        }
        this.f773y = new ArrayDeque(j0Var.f783i);
    }

    public final j0 P() {
        int i4;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d1 d1Var = (d1) it.next();
            if (d1Var.f732e) {
                d1Var.f732e = false;
                d1Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((d1) it2.next()).e();
        }
        x(true);
        this.A = true;
        this.H.f792h = true;
        o0 o0Var = this.f751c;
        o0Var.getClass();
        HashMap map = o0Var.f838b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            n0 n0Var = (n0) it3.next();
            if (n0Var != null) {
                q qVar = n0Var.f819c;
                m0 m0Var = new m0(qVar);
                if (qVar.f848b <= -1 || m0Var.f815n != null) {
                    m0Var.f815n = qVar.f849c;
                } else {
                    Bundle bundle = new Bundle();
                    qVar.w(bundle);
                    qVar.Q.c(bundle);
                    j0 j0VarP = qVar.f867u.P();
                    if (j0VarP != null) {
                        bundle.putParcelable("android:support:fragments", j0VarP);
                    }
                    n0Var.f817a.l(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (qVar.F != null) {
                        n0Var.o();
                    }
                    if (qVar.f850d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", qVar.f850d);
                    }
                    if (qVar.f851e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", qVar.f851e);
                    }
                    if (!qVar.H) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", qVar.H);
                    }
                    m0Var.f815n = bundle2;
                    if (qVar.f855i != null) {
                        if (bundle2 == null) {
                            m0Var.f815n = new Bundle();
                        }
                        m0Var.f815n.putString("android:target_state", qVar.f855i);
                        int i5 = qVar.f856j;
                        if (i5 != 0) {
                            m0Var.f815n.putInt("android:target_req_state", i5);
                        }
                    }
                }
                arrayList2.add(m0Var);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + qVar + ": " + m0Var.f815n);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (!Log.isLoggable("FragmentManager", 2)) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        o0 o0Var2 = this.f751c;
        synchronized (o0Var2.f837a) {
            try {
                if (o0Var2.f837a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(o0Var2.f837a.size());
                    for (q qVar2 : o0Var2.f837a) {
                        arrayList.add(qVar2.f852f);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + qVar2.f852f + "): " + qVar2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList3 = this.f752d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            bVarArr = null;
        } else {
            bVarArr = new b[size];
            for (i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new b((a) this.f752d.get(i4));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f752d.get(i4));
                }
            }
        }
        j0 j0Var = new j0();
        j0Var.f780f = null;
        ArrayList arrayList4 = new ArrayList();
        j0Var.f781g = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        j0Var.f782h = arrayList5;
        j0Var.f776b = arrayList2;
        j0Var.f777c = arrayList;
        j0Var.f778d = bVarArr;
        j0Var.f779e = this.f757i.get();
        q qVar3 = this.f767s;
        if (qVar3 != null) {
            j0Var.f780f = qVar3.f852f;
        }
        arrayList4.addAll(this.f758j.keySet());
        arrayList5.addAll(this.f758j.values());
        j0Var.f783i = new ArrayList(this.f773y);
        return j0Var;
    }

    public final void Q() {
        synchronized (this.f749a) {
            try {
                if (this.f749a.size() == 1) {
                    this.f764p.f885l.removeCallbacks(this.I);
                    this.f764p.f885l.post(this.I);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R(q qVar, boolean z4) {
        ViewGroup viewGroupA = A(qVar);
        if (viewGroupA == null || !(viewGroupA instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupA).setDrawDisappearingViewsLast(!z4);
    }

    public final void S(q qVar, androidx.lifecycle.m mVar) {
        if (qVar.equals(this.f751c.b(qVar.f852f)) && (qVar.f866t == null || qVar.f865s == this)) {
            qVar.M = mVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void T(q qVar) {
        if (qVar != null) {
            if (!qVar.equals(this.f751c.b(qVar.f852f)) || (qVar.f866t != null && qVar.f865s != this)) {
                throw new IllegalArgumentException("Fragment " + qVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        q qVar2 = this.f767s;
        this.f767s = qVar;
        p(qVar2);
        p(this.f767s);
    }

    public final void U(q qVar) {
        ViewGroup viewGroupA = A(qVar);
        if (viewGroupA != null) {
            o oVar = qVar.I;
            if ((oVar == null ? 0 : oVar.f828g) + (oVar == null ? 0 : oVar.f827f) + (oVar == null ? 0 : oVar.f826e) + (oVar == null ? 0 : oVar.f825d) > 0) {
                if (viewGroupA.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupA.setTag(R.id.visible_removing_fragment_view_tag, qVar);
                }
                q qVar2 = (q) viewGroupA.getTag(R.id.visible_removing_fragment_view_tag);
                o oVar2 = qVar.I;
                boolean z4 = oVar2 != null ? oVar2.f824c : false;
                if (qVar2.I == null) {
                    return;
                }
                qVar2.d().f824c = z4;
            }
        }
    }

    public final void W() {
        for (n0 n0Var : this.f751c.d()) {
            q qVar = n0Var.f819c;
            if (qVar.G) {
                if (this.f750b) {
                    this.D = true;
                } else {
                    qVar.G = false;
                    n0Var.k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        q qVar = this.f766r;
        if (qVar != null) {
            sb.append(qVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f766r)));
            sb.append("}");
        } else {
            t tVar = this.f764p;
            if (tVar != null) {
                sb.append(tVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f764p)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void Y() {
        synchronized (this.f749a) {
            try {
                if (!this.f749a.isEmpty()) {
                    c0 c0Var = this.f756h;
                    c0Var.f709a = true;
                    j3.a aVar = c0Var.f711c;
                    if (aVar != null) {
                        aVar.a();
                    }
                    return;
                }
                c0 c0Var2 = this.f756h;
                ArrayList arrayList = this.f752d;
                c0Var2.f709a = arrayList != null && arrayList.size() > 0 && G(this.f766r);
                j3.a aVar2 = c0Var2.f711c;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n0 a(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + qVar);
        }
        n0 n0VarF = f(qVar);
        qVar.f865s = this;
        o0 o0Var = this.f751c;
        o0Var.g(n0VarF);
        if (!qVar.A) {
            o0Var.a(qVar);
            qVar.f859m = false;
            if (qVar.F == null) {
                qVar.J = false;
            }
            if (E(qVar)) {
                this.f774z = true;
            }
        }
        return n0VarF;
    }

    public final void b(t tVar, c3.h hVar, q qVar) {
        if (this.f764p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f764p = tVar;
        this.f765q = hVar;
        this.f766r = qVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f762n;
        if (qVar != null) {
            copyOnWriteArrayList.add(new e0(qVar));
        } else if (tVar instanceof l0) {
            copyOnWriteArrayList.add(tVar);
        }
        if (this.f766r != null) {
            Y();
        }
        if (tVar instanceof androidx.activity.a0) {
            androidx.activity.z zVarJ = tVar.f887n.j();
            this.f755g = zVarJ;
            zVarJ.a(qVar != null ? qVar : tVar, this.f756h);
        }
        int i4 = 0;
        if (qVar != null) {
            k0 k0Var = qVar.f865s.H;
            HashMap map = k0Var.f788d;
            k0 k0Var2 = (k0) map.get(qVar.f852f);
            if (k0Var2 == null) {
                k0Var2 = new k0(k0Var.f790f);
                map.put(qVar.f852f, k0Var2);
            }
            this.H = k0Var2;
        } else if (tVar instanceof androidx.lifecycle.r0) {
            e.c cVar = new e.c(tVar.f887n.h(), k0.f786i, 0);
            String canonicalName = k0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.H = (k0) cVar.a(k0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.H = new k0(false);
        }
        k0 k0Var3 = this.H;
        int i5 = 1;
        k0Var3.f792h = this.A || this.B;
        this.f751c.f839c = k0Var3;
        t tVar2 = this.f764p;
        if (tVar2 instanceof androidx.activity.result.h) {
            androidx.activity.i iVar = tVar2.f887n.f280l;
            String str = "FragmentManager:" + (qVar != null ? defpackage.a.h(new StringBuilder(), qVar.f852f, ":") : "");
            this.f770v = iVar.d(defpackage.a.f(str, "StartActivityForResult"), new c.d(), new b0(this, 4));
            this.f771w = iVar.d(defpackage.a.f(str, "StartIntentSenderForResult"), new c.c(i5), new b0(this, i4));
            this.f772x = iVar.d(defpackage.a.f(str, "RequestPermissions"), new c.b(), new b0(this, i5));
        }
    }

    public final void c(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + qVar);
        }
        if (qVar.A) {
            qVar.A = false;
            if (qVar.f858l) {
                return;
            }
            this.f751c.a(qVar);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + qVar);
            }
            if (E(qVar)) {
                this.f774z = true;
            }
        }
    }

    public final void d() {
        this.f750b = false;
        this.F.clear();
        this.E.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f751c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((n0) it.next()).f819c.E;
            if (viewGroup != null) {
                hashSet.add(d1.f(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final n0 f(q qVar) {
        String str = qVar.f852f;
        o0 o0Var = this.f751c;
        n0 n0Var = (n0) o0Var.f838b.get(str);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this.f761m, o0Var, qVar);
        n0Var2.m(this.f764p.f884k.getClassLoader());
        n0Var2.f821e = this.f763o;
        return n0Var2;
    }

    public final void g(q qVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + qVar);
        }
        if (qVar.A) {
            return;
        }
        qVar.A = true;
        if (qVar.f858l) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + qVar);
            }
            o0 o0Var = this.f751c;
            synchronized (o0Var.f837a) {
                o0Var.f837a.remove(qVar);
            }
            qVar.f858l = false;
            if (E(qVar)) {
                this.f774z = true;
            }
            U(qVar);
        }
    }

    public final void h(Configuration configuration) {
        for (q qVar : this.f751c.f()) {
            if (qVar != null) {
                qVar.onConfigurationChanged(configuration);
                qVar.f867u.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.f763o < 1) {
            return false;
        }
        for (q qVar : this.f751c.f()) {
            if (qVar != null && !qVar.f872z && qVar.f867u.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f763o < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (q qVar : this.f751c.f()) {
            if (qVar != null && F(qVar) && !qVar.f872z && qVar.f867u.j()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qVar);
                z4 = true;
            }
        }
        if (this.f753e != null) {
            for (int i4 = 0; i4 < this.f753e.size(); i4++) {
                q qVar2 = (q) this.f753e.get(i4);
                if (arrayList == null || !arrayList.contains(qVar2)) {
                    qVar2.getClass();
                }
            }
        }
        this.f753e = arrayList;
        return z4;
    }

    public final void k() {
        this.C = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((d1) it.next()).e();
        }
        s(-1);
        this.f764p = null;
        this.f765q = null;
        this.f766r = null;
        if (this.f755g != null) {
            Iterator it2 = this.f756h.f710b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.f755g = null;
        }
        androidx.activity.result.d dVar = this.f770v;
        if (dVar != null) {
            int i4 = dVar.f301j;
            String str = dVar.f302k;
            androidx.activity.result.g gVar = dVar.f304m;
            switch (i4) {
                case 0:
                    gVar.f(str);
                    break;
                default:
                    gVar.f(str);
                    break;
            }
            androidx.activity.result.d dVar2 = this.f771w;
            int i5 = dVar2.f301j;
            String str2 = dVar2.f302k;
            androidx.activity.result.g gVar2 = dVar2.f304m;
            switch (i5) {
                case 0:
                    gVar2.f(str2);
                    break;
                default:
                    gVar2.f(str2);
                    break;
            }
            androidx.activity.result.d dVar3 = this.f772x;
            int i6 = dVar3.f301j;
            String str3 = dVar3.f302k;
            androidx.activity.result.g gVar3 = dVar3.f304m;
            switch (i6) {
                case 0:
                    gVar3.f(str3);
                    break;
                default:
                    gVar3.f(str3);
                    break;
            }
        }
    }

    public final void l() {
        for (q qVar : this.f751c.f()) {
            if (qVar != null) {
                qVar.onLowMemory();
                qVar.f867u.l();
            }
        }
    }

    public final void m(boolean z4) {
        for (q qVar : this.f751c.f()) {
            if (qVar != null) {
                qVar.f867u.m(z4);
            }
        }
    }

    public final boolean n() {
        if (this.f763o < 1) {
            return false;
        }
        for (q qVar : this.f751c.f()) {
            if (qVar != null && !qVar.f872z && qVar.f867u.n()) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.f763o < 1) {
            return;
        }
        for (q qVar : this.f751c.f()) {
            if (qVar != null && !qVar.f872z) {
                qVar.f867u.o();
            }
        }
    }

    public final void p(q qVar) {
        if (qVar != null) {
            if (qVar.equals(this.f751c.b(qVar.f852f))) {
                qVar.f865s.getClass();
                boolean zG = G(qVar);
                Boolean bool = qVar.f857k;
                if (bool == null || bool.booleanValue() != zG) {
                    qVar.f857k = Boolean.valueOf(zG);
                    i0 i0Var = qVar.f867u;
                    i0Var.Y();
                    i0Var.p(i0Var.f767s);
                }
            }
        }
    }

    public final void q(boolean z4) {
        for (q qVar : this.f751c.f()) {
            if (qVar != null) {
                qVar.f867u.q(z4);
            }
        }
    }

    public final boolean r() {
        boolean z4 = false;
        if (this.f763o >= 1) {
            for (q qVar : this.f751c.f()) {
                if (qVar != null && F(qVar) && !qVar.f872z && qVar.f867u.r()) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void s(int i4) {
        try {
            this.f750b = true;
            for (n0 n0Var : this.f751c.f838b.values()) {
                if (n0Var != null) {
                    n0Var.f821e = i4;
                }
            }
            I(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((d1) it.next()).e();
            }
            this.f750b = false;
            x(true);
        } catch (Throwable th) {
            this.f750b = false;
            throw th;
        }
    }

    public final void t() {
        if (this.D) {
            this.D = false;
            W();
        }
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strF = defpackage.a.f(str, "    ");
        o0 o0Var = this.f751c;
        o0Var.getClass();
        String str2 = str + "    ";
        HashMap map = o0Var.f838b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (n0 n0Var : map.values()) {
                printWriter.print(str);
                if (n0Var != null) {
                    q qVar = n0Var.f819c;
                    printWriter.println(qVar);
                    qVar.c(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = o0Var.f837a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size3; i4++) {
                q qVar2 = (q) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(qVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f753e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                q qVar3 = (q) this.f753e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(qVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f752d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = (a) this.f752d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.e(strF, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f757i.get());
        synchronized (this.f749a) {
            try {
                int size4 = this.f749a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (g0) this.f749a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f764p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f765q);
        if (this.f766r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f766r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f763o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f774z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f774z);
        }
    }

    public final void v(g0 g0Var, boolean z4) {
        if (!z4) {
            if (this.f764p == null) {
                if (!this.C) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.A || this.B) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f749a) {
            try {
                if (this.f764p == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f749a.add(g0Var);
                    Q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z4) {
        if (this.f750b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f764p == null) {
            if (!this.C) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f764p.f885l.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.A || this.B)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.E == null) {
            this.E = new ArrayList();
            this.F = new ArrayList();
        }
        this.f750b = false;
    }

    public final boolean x(boolean z4) {
        w(z4);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.E;
            ArrayList arrayList2 = this.F;
            synchronized (this.f749a) {
                try {
                    if (this.f749a.isEmpty()) {
                        break;
                    }
                    int size = this.f749a.size();
                    boolean zA = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        zA |= ((g0) this.f749a.get(i4)).a(arrayList, arrayList2);
                    }
                    this.f749a.clear();
                    this.f764p.f885l.removeCallbacks(this.I);
                    if (!zA) {
                        break;
                    }
                    z5 = true;
                    this.f750b = true;
                    try {
                        N(this.E, this.F);
                        d();
                    } catch (Throwable th) {
                        d();
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Y();
        t();
        this.f751c.f838b.values().removeAll(Collections.singleton(null));
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        ViewGroup viewGroup;
        o0 o0Var;
        o0 o0Var2;
        int i6;
        boolean z4 = ((a) arrayList.get(i4)).f677o;
        ArrayList arrayList3 = this.G;
        if (arrayList3 == null) {
            this.G = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.G;
        o0 o0Var3 = this.f751c;
        arrayList4.addAll(o0Var3.f());
        q qVar = this.f767s;
        int i7 = i4;
        boolean z5 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i5) {
                o0 o0Var4 = o0Var3;
                this.G.clear();
                if (!z4 && this.f763o >= 1) {
                    for (int i9 = i4; i9 < i5; i9++) {
                        Iterator it = ((a) arrayList.get(i9)).f663a.iterator();
                        while (it.hasNext()) {
                            q qVar2 = ((p0) it.next()).f841b;
                            if (qVar2 == null || qVar2.f865s == null) {
                                o0Var = o0Var4;
                            } else {
                                o0Var = o0Var4;
                                o0Var.g(f(qVar2));
                            }
                            o0Var4 = o0Var;
                        }
                    }
                }
                for (int i10 = i4; i10 < i5; i10++) {
                    a aVar = (a) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        aVar.c(-1);
                        aVar.g();
                    } else {
                        aVar.c(1);
                        aVar.f();
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
                for (int i11 = i4; i11 < i5; i11++) {
                    a aVar2 = (a) arrayList.get(i11);
                    if (zBooleanValue) {
                        for (int size = aVar2.f663a.size() - 1; size >= 0; size--) {
                            q qVar3 = ((p0) aVar2.f663a.get(size)).f841b;
                            if (qVar3 != null) {
                                f(qVar3).k();
                            }
                        }
                    } else {
                        Iterator it2 = aVar2.f663a.iterator();
                        while (it2.hasNext()) {
                            q qVar4 = ((p0) it2.next()).f841b;
                            if (qVar4 != null) {
                                f(qVar4).k();
                            }
                        }
                    }
                }
                I(this.f763o, true);
                HashSet<d1> hashSet = new HashSet();
                for (int i12 = i4; i12 < i5; i12++) {
                    Iterator it3 = ((a) arrayList.get(i12)).f663a.iterator();
                    while (it3.hasNext()) {
                        q qVar5 = ((p0) it3.next()).f841b;
                        if (qVar5 != null && (viewGroup = qVar5.E) != null) {
                            hashSet.add(d1.f(viewGroup, C()));
                        }
                    }
                }
                for (d1 d1Var : hashSet) {
                    d1Var.f731d = zBooleanValue;
                    d1Var.g();
                    d1Var.c();
                }
                for (int i13 = i4; i13 < i5; i13++) {
                    a aVar3 = (a) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue() && aVar3.f680r >= 0) {
                        aVar3.f680r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                o0Var2 = o0Var3;
                int i14 = 1;
                ArrayList arrayList5 = this.G;
                int size2 = aVar4.f663a.size() - 1;
                while (size2 >= 0) {
                    p0 p0Var = (p0) aVar4.f663a.get(size2);
                    int i15 = p0Var.f840a;
                    if (i15 != i14) {
                        if (i15 != 3) {
                            switch (i15) {
                                case 6:
                                    arrayList5.add(p0Var.f841b);
                                    break;
                                case 8:
                                    qVar = null;
                                    break;
                                case 9:
                                    qVar = p0Var.f841b;
                                    break;
                                case 10:
                                    p0Var.f847h = p0Var.f846g;
                                    break;
                            }
                        } else {
                            arrayList5.add(p0Var.f841b);
                        }
                        size2--;
                        i14 = 1;
                    }
                    arrayList5.remove(p0Var.f841b);
                    size2--;
                    i14 = 1;
                }
            } else {
                ArrayList arrayList6 = this.G;
                int i16 = 0;
                while (i16 < aVar4.f663a.size()) {
                    p0 p0Var2 = (p0) aVar4.f663a.get(i16);
                    int i17 = p0Var2.f840a;
                    if (i17 != i8) {
                        if (i17 != 2) {
                            if (i17 == 3 || i17 == 6) {
                                arrayList6.remove(p0Var2.f841b);
                                q qVar6 = p0Var2.f841b;
                                if (qVar6 == qVar) {
                                    aVar4.f663a.add(i16, new p0(9, qVar6));
                                    i16++;
                                    o0Var3 = o0Var3;
                                    i6 = 1;
                                    qVar = null;
                                }
                            } else if (i17 == 7) {
                                i6 = 1;
                            } else if (i17 == 8) {
                                aVar4.f663a.add(i16, new p0(9, qVar));
                                i16++;
                                qVar = p0Var2.f841b;
                            }
                            o0Var3 = o0Var3;
                            i6 = 1;
                        } else {
                            q qVar7 = p0Var2.f841b;
                            int i18 = qVar7.f870x;
                            int size3 = arrayList6.size() - 1;
                            boolean z6 = false;
                            while (size3 >= 0) {
                                q qVar8 = (q) arrayList6.get(size3);
                                o0 o0Var5 = o0Var3;
                                if (qVar8.f870x != i18) {
                                    i18 = i18;
                                } else if (qVar8 == qVar7) {
                                    i18 = i18;
                                    z6 = true;
                                } else {
                                    if (qVar8 == qVar) {
                                        aVar4.f663a.add(i16, new p0(9, qVar8));
                                        i16++;
                                        qVar = null;
                                    }
                                    p0 p0Var3 = new p0(3, qVar8);
                                    p0Var3.f842c = p0Var2.f842c;
                                    p0Var3.f844e = p0Var2.f844e;
                                    p0Var3.f843d = p0Var2.f843d;
                                    p0Var3.f845f = p0Var2.f845f;
                                    aVar4.f663a.add(i16, p0Var3);
                                    arrayList6.remove(qVar8);
                                    i16++;
                                }
                                size3--;
                                o0Var3 = o0Var5;
                                i18 = i18;
                            }
                            o0Var3 = o0Var3;
                            if (z6) {
                                aVar4.f663a.remove(i16);
                                i16--;
                                i6 = 1;
                            } else {
                                i6 = 1;
                                p0Var2.f840a = 1;
                                arrayList6.add(qVar7);
                            }
                        }
                        i16 += i6;
                        i8 = i6;
                        o0Var3 = o0Var3;
                    } else {
                        i6 = i8;
                    }
                    arrayList6.add(p0Var2.f841b);
                    i16 += i6;
                    i8 = i6;
                    o0Var3 = o0Var3;
                }
                o0Var2 = o0Var3;
            }
            z5 = z5 || aVar4.f669g;
            i7++;
            o0Var3 = o0Var2;
        }
    }

    public final q z(int i4) {
        o0 o0Var = this.f751c;
        ArrayList arrayList = o0Var.f837a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q qVar = (q) arrayList.get(size);
            if (qVar != null && qVar.f869w == i4) {
                return qVar;
            }
        }
        for (n0 n0Var : o0Var.f838b.values()) {
            if (n0Var != null) {
                q qVar2 = n0Var.f819c;
                if (qVar2.f869w == i4) {
                    return qVar2;
                }
            }
        }
        return null;
    }
}
