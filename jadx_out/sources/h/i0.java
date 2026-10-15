package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends o implements SubMenu {
    public final q A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f2410z;

    public i0(Context context, o oVar, q qVar) {
        super(context);
        this.f2410z = oVar;
        this.A = qVar;
    }

    @Override // h.o
    public final boolean d(q qVar) {
        return this.f2410z.d(qVar);
    }

    @Override // h.o
    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f2410z.e(oVar, menuItem);
    }

    @Override // h.o
    public final boolean f(q qVar) {
        return this.f2410z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // h.o
    public final String j() {
        q qVar = this.A;
        int i4 = qVar != null ? qVar.f2453a : 0;
        if (i4 == 0) {
            return null;
        }
        return defpackage.a.e("android:menu:actionviewstates:", i4);
    }

    @Override // h.o
    public final o k() {
        return this.f2410z.k();
    }

    @Override // h.o
    public final boolean m() {
        return this.f2410z.m();
    }

    @Override // h.o
    public final boolean n() {
        return this.f2410z.n();
    }

    @Override // h.o
    public final boolean o() {
        return this.f2410z.o();
    }

    @Override // h.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f2410z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // h.o, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f2410z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        u(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        u(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.A.setIcon(i4);
        return this;
    }
}
