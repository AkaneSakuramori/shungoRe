package h;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import e.n0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f2481c;

    @Override // h.r
    public final boolean a() {
        return this.f2479a.isVisible();
    }

    @Override // h.r
    public final View b(MenuItem menuItem) {
        return this.f2479a.onCreateActionView(menuItem);
    }

    @Override // h.r
    public final boolean c() {
        return this.f2479a.overridesItemVisibility();
    }

    @Override // h.r
    public final void d(n0 n0Var) {
        this.f2481c = n0Var;
        this.f2479a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        n0 n0Var = this.f2481c;
        if (n0Var != null) {
            o oVar = ((q) n0Var.f1896c).f2466n;
            oVar.f2433h = true;
            oVar.p(true);
        }
    }
}
