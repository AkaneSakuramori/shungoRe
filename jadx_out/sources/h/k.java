package h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f2414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f2415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f2416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f2417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f2418g;

    public k(Context context) {
        this.f2413b = context;
        this.f2414c = LayoutInflater.from(context);
    }

    @Override // h.c0
    public final void b(o oVar, boolean z4) {
        b0 b0Var = this.f2417f;
        if (b0Var != null) {
            b0Var.b(oVar, z4);
        }
    }

    @Override // h.c0
    public final void c() {
        j jVar = this.f2418g;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // h.c0
    public final boolean d(q qVar) {
        return false;
    }

    @Override // h.c0
    public final void e(b0 b0Var) {
        this.f2417f = b0Var;
    }

    @Override // h.c0
    public final void g(Context context, o oVar) {
        if (this.f2413b != null) {
            this.f2413b = context;
            if (this.f2414c == null) {
                this.f2414c = LayoutInflater.from(context);
            }
        }
        this.f2415d = oVar;
        j jVar = this.f2418g;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // h.c0
    public final boolean i() {
        return false;
    }

    @Override // h.c0
    public final boolean j(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f2450b = i0Var;
        Context context = i0Var.f2426a;
        e.i iVar = new e.i(context);
        Object obj = iVar.f1879c;
        e.e eVar = (e.e) obj;
        k kVar = new k(eVar.f1802a);
        pVar.f2452d = kVar;
        kVar.f2417f = pVar;
        i0Var.b(kVar, context);
        k kVar2 = pVar.f2452d;
        if (kVar2.f2418g == null) {
            kVar2.f2418g = new j(kVar2);
        }
        eVar.f1808g = kVar2.f2418g;
        eVar.f1809h = pVar;
        View view = i0Var.f2440o;
        if (view != null) {
            eVar.f1806e = view;
        } else {
            eVar.f1804c = i0Var.f2439n;
            ((e.e) obj).f1805d = i0Var.f2438m;
        }
        eVar.f1807f = pVar;
        e.j jVarA = iVar.a();
        pVar.f2451c = jVarA;
        jVarA.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f2451c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f2451c.show();
        b0 b0Var = this.f2417f;
        if (b0Var == null) {
            return true;
        }
        b0Var.k(i0Var);
        return true;
    }

    @Override // h.c0
    public final boolean k(q qVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f2415d.q(this.f2418g.getItem(i4), this, 0);
    }
}
