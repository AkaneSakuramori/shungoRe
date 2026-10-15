package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f720h;

    public c1(int i4, int i5, n0 n0Var, e0.e eVar) {
        q qVar = n0Var.f819c;
        this.f716d = new ArrayList();
        this.f717e = new HashSet();
        this.f718f = false;
        this.f719g = false;
        this.f713a = i4;
        this.f714b = i5;
        this.f715c = qVar;
        eVar.b(new k(3, this));
        this.f720h = n0Var;
    }

    public final void a() {
        if (this.f718f) {
            return;
        }
        this.f718f = true;
        HashSet hashSet = this.f717e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((e0.e) it.next()).a();
        }
    }

    public final void b() {
        if (!this.f719g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f719g = true;
            Iterator it = this.f716d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f720h.k();
    }

    public final void c(int i4, int i5) {
        if (i5 == 0) {
            throw null;
        }
        int i6 = i5 - 1;
        q qVar = this.f715c;
        if (i6 == 0) {
            if (this.f713a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + qVar + " mFinalState = " + defpackage.a.q(this.f713a) + " -> " + defpackage.a.q(i4) + ". ");
                }
                this.f713a = i4;
                return;
            }
            return;
        }
        if (i6 == 1) {
            if (this.f713a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + qVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + defpackage.a.p(this.f714b) + " to ADDING.");
                }
                this.f713a = 2;
                this.f714b = 2;
                return;
            }
            return;
        }
        if (i6 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + qVar + " mFinalState = " + defpackage.a.q(this.f713a) + " -> REMOVED. mLifecycleImpact  = " + defpackage.a.p(this.f714b) + " to REMOVING.");
        }
        this.f713a = 1;
        this.f714b = 3;
    }

    public final void d() {
        if (this.f714b == 2) {
            n0 n0Var = this.f720h;
            q qVar = n0Var.f819c;
            View viewFindFocus = qVar.F.findFocus();
            if (viewFindFocus != null) {
                qVar.d().f836o = viewFindFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + qVar);
                }
            }
            View viewD = this.f715c.D();
            if (viewD.getParent() == null) {
                n0Var.b();
                viewD.setAlpha(0.0f);
            }
            if (viewD.getAlpha() == 0.0f && viewD.getVisibility() == 0) {
                viewD.setVisibility(4);
            }
            o oVar = qVar.I;
            viewD.setAlpha(oVar == null ? 1.0f : oVar.f835n);
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + defpackage.a.q(this.f713a) + "} {mLifecycleImpact = " + defpackage.a.p(this.f714b) + "} {mFragment = " + this.f715c + "}";
    }
}
