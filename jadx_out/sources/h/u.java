package h;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class u implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2484b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2484b = wVar;
        this.f2483a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2483a.onMenuItemActionCollapse(this.f2484b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2483a.onMenuItemActionExpand(this.f2484b.m(menuItem));
    }
}
