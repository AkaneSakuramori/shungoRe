package h;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2486b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2486b = wVar;
        this.f2485a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2485a.onMenuItemClick(this.f2486b.m(menuItem));
    }
}
