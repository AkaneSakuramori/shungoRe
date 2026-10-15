package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.shungo.app.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.r0, androidx.lifecycle.h, z0.g {
    public static final Object S = new Object();
    public boolean A;
    public boolean B;
    public boolean D;
    public ViewGroup E;
    public View F;
    public boolean G;
    public o I;
    public boolean J;
    public float K;
    public boolean L;
    public androidx.lifecycle.t N;
    public z0 O;
    public z0.f Q;
    public final ArrayList R;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f851e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f854h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f856j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i0 f865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f866t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f872z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f848b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f852f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f855i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f857k = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i0 f867u = new i0();
    public final boolean C = true;
    public boolean H = true;
    public androidx.lifecycle.m M = androidx.lifecycle.m.f970f;
    public final androidx.lifecycle.x P = new androidx.lifecycle.x();

    public q() {
        new AtomicInteger();
        this.R = new ArrayList();
        this.N = new androidx.lifecycle.t(this);
        this.Q = z0.c.b(this);
    }

    public void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f867u.J();
        this.f863q = true;
        this.O = new z0(h());
        View viewR = r(layoutInflater, viewGroup);
        this.F = viewR;
        if (viewR == null) {
            if (this.O.f926c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.O = null;
            return;
        }
        this.O.c();
        View view = this.F;
        z0 z0Var = this.O;
        c3.h.b0(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, z0Var);
        View view2 = this.F;
        z0 z0Var2 = this.O;
        c3.h.b0(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, z0Var2);
        View view3 = this.F;
        z0 z0Var3 = this.O;
        c3.h.b0(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, z0Var3);
        this.P.e(this.O);
    }

    public final void B() {
        this.f867u.s(1);
        if (this.F != null) {
            z0 z0Var = this.O;
            z0Var.c();
            if (z0Var.f926c.f983f.compareTo(androidx.lifecycle.m.f968d) >= 0) {
                this.O.b(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        this.f848b = 1;
        this.D = false;
        s();
        if (!this.D) {
            throw new e1("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        n.l lVar = new v0.b(this, h()).f4773k.f4771c;
        if (lVar.f3528d <= 0) {
            this.f863q = false;
        } else {
            defpackage.a.n(lVar.f3527c[0]);
            throw null;
        }
    }

    public final Context C() {
        Context contextG = g();
        if (contextG != null) {
            return contextG;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i4, int i5, int i6, int i7) {
        if (this.I == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        d().f825d = i4;
        d().f826e = i5;
        d().f827f = i6;
        d().f828g = i7;
    }

    public final void F(Bundle bundle) {
        i0 i0Var = this.f865s;
        if (i0Var != null && (i0Var.A || i0Var.B)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f853g = bundle;
    }

    public c3.h b() {
        return new n(this);
    }

    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f869w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f870x));
        printWriter.print(" mTag=");
        printWriter.println(this.f871y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f848b);
        printWriter.print(" mWho=");
        printWriter.print(this.f852f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f864r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f858l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f859m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f860n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f861o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f872z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.C);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.H);
        if (this.f865s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f865s);
        }
        if (this.f866t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f866t);
        }
        if (this.f868v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f868v);
        }
        if (this.f853g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f853g);
        }
        if (this.f849c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f849c);
        }
        if (this.f850d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f850d);
        }
        if (this.f851e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f851e);
        }
        q qVarB = this.f854h;
        if (qVarB == null) {
            i0 i0Var = this.f865s;
            qVarB = (i0Var == null || (str2 = this.f855i) == null) ? null : i0Var.f751c.b(str2);
        }
        if (qVarB != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(qVarB);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f856j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        o oVar = this.I;
        printWriter.println(oVar == null ? false : oVar.f824c);
        o oVar2 = this.I;
        if (oVar2 != null && oVar2.f825d != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            o oVar3 = this.I;
            printWriter.println(oVar3 == null ? 0 : oVar3.f825d);
        }
        o oVar4 = this.I;
        if (oVar4 != null && oVar4.f826e != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            o oVar5 = this.I;
            printWriter.println(oVar5 == null ? 0 : oVar5.f826e);
        }
        o oVar6 = this.I;
        if (oVar6 != null && oVar6.f827f != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            o oVar7 = this.I;
            printWriter.println(oVar7 == null ? 0 : oVar7.f827f);
        }
        o oVar8 = this.I;
        if (oVar8 != null && oVar8.f828g != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            o oVar9 = this.I;
            printWriter.println(oVar9 != null ? oVar9.f828g : 0);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.F);
        }
        o oVar10 = this.I;
        if ((oVar10 == null ? null : oVar10.f822a) != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            o oVar11 = this.I;
            printWriter.println(oVar11 != null ? oVar11.f822a : null);
        }
        if (g() != null) {
            new v0.b(this, h()).Q2(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f867u + ":");
        this.f867u.u(defpackage.a.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final o d() {
        if (this.I == null) {
            o oVar = new o();
            Object obj = S;
            oVar.f832k = obj;
            oVar.f833l = obj;
            oVar.f834m = obj;
            oVar.f835n = 1.0f;
            oVar.f836o = null;
            this.I = oVar;
        }
        return this.I;
    }

    @Override // z0.g
    public final z0.e e() {
        return this.Q.f5440b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final i0 f() {
        if (this.f866t != null) {
            return this.f867u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context g() {
        t tVar = this.f866t;
        if (tVar == null) {
            return null;
        }
        return tVar.f884k;
    }

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.q0 h() {
        if (this.f865s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f865s.H.f789e;
        androidx.lifecycle.q0 q0Var = (androidx.lifecycle.q0) map.get(this.f852f);
        if (q0Var != null) {
            return q0Var;
        }
        androidx.lifecycle.q0 q0Var2 = new androidx.lifecycle.q0();
        map.put(this.f852f, q0Var2);
        return q0Var2;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final int i() {
        androidx.lifecycle.m mVar = this.M;
        return (mVar == androidx.lifecycle.m.f967c || this.f868v == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.f868v.i());
    }

    public final i0 j() {
        i0 i0Var = this.f865s;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object k() {
        Object obj;
        o oVar = this.I;
        if (oVar == null || (obj = oVar.f833l) == S) {
            return null;
        }
        return obj;
    }

    public final Object l() {
        Object obj;
        o oVar = this.I;
        if (oVar == null || (obj = oVar.f832k) == S) {
            return null;
        }
        return obj;
    }

    public final Object m() {
        Object obj;
        o oVar = this.I;
        if (oVar == null || (obj = oVar.f834m) == S) {
            return null;
        }
        return obj;
    }

    public final boolean n() {
        q qVar = this.f868v;
        return qVar != null && (qVar.f859m || qVar.n());
    }

    public final void o(int i4, int i5, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        t tVar = this.f866t;
        u uVar = tVar == null ? null : (u) tVar.f883j;
        if (uVar != null) {
            uVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.D = true;
    }

    public void p(Context context) {
        this.D = true;
        t tVar = this.f866t;
        if ((tVar == null ? null : tVar.f883j) != null) {
            this.D = true;
        }
    }

    public void q(Bundle bundle) {
        Parcelable parcelable;
        this.D = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f867u.O(parcelable);
            i0 i0Var = this.f867u;
            i0Var.A = false;
            i0Var.B = false;
            i0Var.H.f792h = false;
            i0Var.s(1);
        }
        i0 i0Var2 = this.f867u;
        if (i0Var2.f763o >= 1) {
            return;
        }
        i0Var2.A = false;
        i0Var2.B = false;
        i0Var2.H.f792h = false;
        i0Var2.s(1);
    }

    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void s() {
        this.D = true;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t t() {
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f852f);
        if (this.f869w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f869w));
        }
        if (this.f871y != null) {
            sb.append(" tag=");
            sb.append(this.f871y);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.D = true;
    }

    public LayoutInflater v(Bundle bundle) {
        t tVar = this.f866t;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        u uVar = tVar.f887n;
        LayoutInflater layoutInflaterCloneInContext = uVar.getLayoutInflater().cloneInContext(uVar);
        layoutInflaterCloneInContext.setFactory2(this.f867u.f754f);
        return layoutInflaterCloneInContext;
    }

    public abstract void w(Bundle bundle);

    public void x() {
        this.D = true;
    }

    public void y() {
        this.D = true;
    }

    public void z(Bundle bundle) {
        this.D = true;
    }
}
