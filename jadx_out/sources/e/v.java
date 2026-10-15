package e;

import android.view.MenuItem;
import android.view.ViewGroup;
import i0.d1;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements g.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.b f1944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f1945c;

    public v(e0 e0Var, g.h hVar) {
        this.f1945c = e0Var;
        this.f1944b = hVar;
    }

    @Override // g.b
    public final boolean a(g.c cVar, h.o oVar) {
        ViewGroup viewGroup = this.f1945c.B;
        WeakHashMap weakHashMap = v0.f2983a;
        i0.i0.c(viewGroup);
        return this.f1944b.a(cVar, oVar);
    }

    @Override // g.b
    public final void b(g.c cVar) {
        this.f1944b.b(cVar);
        e0 e0Var = this.f1945c;
        if (e0Var.f1837x != null) {
            e0Var.f1826m.getDecorView().removeCallbacks(e0Var.f1838y);
        }
        if (e0Var.f1836w != null) {
            d1 d1Var = e0Var.f1839z;
            if (d1Var != null) {
                d1Var.b();
            }
            d1 d1VarA = v0.a(e0Var.f1836w);
            d1VarA.a(0.0f);
            e0Var.f1839z = d1VarA;
            d1VarA.d(new u(2, this));
        }
        n nVar = e0Var.f1828o;
        if (nVar != null) {
            nVar.c();
        }
        e0Var.f1835v = null;
        ViewGroup viewGroup = e0Var.B;
        WeakHashMap weakHashMap = v0.f2983a;
        i0.i0.c(viewGroup);
        e0Var.I();
    }

    @Override // g.b
    public final boolean c(g.c cVar, h.o oVar) {
        return this.f1944b.c(cVar, oVar);
    }

    @Override // g.b
    public final boolean f(g.c cVar, MenuItem menuItem) {
        return this.f1944b.f(cVar, menuItem);
    }
}
