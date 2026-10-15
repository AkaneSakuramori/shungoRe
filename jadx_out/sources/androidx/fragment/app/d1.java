package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import com.shungo.app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f729b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f730c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f731d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f732e = false;

    public d1(ViewGroup viewGroup) {
        this.f728a = viewGroup;
    }

    public static d1 f(ViewGroup viewGroup, b0 b0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof d1) {
            return (d1) tag;
        }
        b0Var.getClass();
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public final void a(int i4, int i5, n0 n0Var) {
        synchronized (this.f729b) {
            try {
                e0.e eVar = new e0.e();
                c1 c1VarD = d(n0Var.f819c);
                if (c1VarD != null) {
                    c1VarD.c(i4, i5);
                    return;
                }
                c1 c1Var = new c1(i4, i5, n0Var, eVar);
                this.f729b.add(c1Var);
                c1Var.f716d.add(new b1(this, c1Var, 0));
                c1Var.f716d.add(new b1(this, c1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z4);

    public final void c() {
        if (this.f732e) {
            return;
        }
        ViewGroup viewGroup = this.f728a;
        WeakHashMap weakHashMap = i0.v0.f2983a;
        if (!i0.h0.b(viewGroup)) {
            e();
            this.f731d = false;
            return;
        }
        synchronized (this.f729b) {
            try {
                if (!this.f729b.isEmpty()) {
                    ArrayList<c1> arrayList = new ArrayList(this.f730c);
                    this.f730c.clear();
                    for (c1 c1Var : arrayList) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1Var);
                        }
                        c1Var.a();
                        if (!c1Var.f719g) {
                            this.f730c.add(c1Var);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f729b);
                    this.f729b.clear();
                    this.f730c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((c1) it.next()).d();
                    }
                    b(arrayList2, this.f731d);
                    this.f731d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c1 d(q qVar) {
        for (c1 c1Var : this.f729b) {
            if (c1Var.f715c.equals(qVar) && !c1Var.f718f) {
                return c1Var;
            }
        }
        return null;
    }

    public final void e() {
        ViewGroup viewGroup = this.f728a;
        WeakHashMap weakHashMap = i0.v0.f2983a;
        boolean zB = i0.h0.b(viewGroup);
        synchronized (this.f729b) {
            try {
                h();
                Iterator it = this.f729b.iterator();
                while (it.hasNext()) {
                    ((c1) it.next()).d();
                }
                for (c1 c1Var : new ArrayList(this.f730c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zB ? "" : "Container " + this.f728a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(c1Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c1Var.a();
                }
                for (c1 c1Var2 : new ArrayList(this.f729b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zB ? "" : "Container " + this.f728a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c1Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f729b) {
            try {
                h();
                this.f732e = false;
                for (int size = this.f729b.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.f729b.get(size);
                    int iC = defpackage.a.c(c1Var.f715c.F);
                    if (c1Var.f713a == 2 && iC != 2) {
                        c1Var.f715c.getClass();
                        this.f732e = false;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        for (c1 c1Var : this.f729b) {
            if (c1Var.f714b == 2) {
                c1Var.c(defpackage.a.b(c1Var.f715c.D().getVisibility()), 1);
            }
        }
    }
}
