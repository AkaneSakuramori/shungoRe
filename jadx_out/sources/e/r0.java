package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends g.c implements h.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h.o f1917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.b f1918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f1919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f1920h;

    public r0(s0 s0Var, Context context, v vVar) {
        this.f1920h = s0Var;
        this.f1916d = context;
        this.f1918f = vVar;
        h.o oVar = new h.o(context);
        oVar.f2437l = 1;
        this.f1917e = oVar;
        oVar.f2430e = this;
    }

    @Override // g.c
    public final void a() {
        s0 s0Var = this.f1920h;
        if (s0Var.f1931r != this) {
            return;
        }
        if (s0Var.f1938y) {
            s0Var.f1932s = this;
            s0Var.f1933t = this.f1918f;
        } else {
            this.f1918f.b(this);
        }
        this.f1918f = null;
        s0Var.Q2(false);
        ActionBarContextView actionBarContextView = s0Var.f1928o;
        if (actionBarContextView.f395l == null) {
            actionBarContextView.e();
        }
        s0Var.f1925l.setHideOnContentScrollEnabled(s0Var.D);
        s0Var.f1931r = null;
    }

    @Override // g.c
    public final View b() {
        WeakReference weakReference = this.f1919g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // g.c
    public final h.o c() {
        return this.f1917e;
    }

    @Override // h.m
    public final void d(h.o oVar) {
        if (this.f1918f == null) {
            return;
        }
        i();
        i.m mVar = this.f1920h.f1928o.f388e;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // h.m
    public final boolean e(h.o oVar, MenuItem menuItem) {
        g.b bVar = this.f1918f;
        if (bVar != null) {
            return bVar.f(this, menuItem);
        }
        return false;
    }

    @Override // g.c
    public final MenuInflater f() {
        return new g.l(this.f1916d);
    }

    @Override // g.c
    public final CharSequence g() {
        return this.f1920h.f1928o.getSubtitle();
    }

    @Override // g.c
    public final CharSequence h() {
        return this.f1920h.f1928o.getTitle();
    }

    @Override // g.c
    public final void i() {
        if (this.f1920h.f1931r != this) {
            return;
        }
        h.o oVar = this.f1917e;
        oVar.w();
        try {
            this.f1918f.a(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // g.c
    public final boolean j() {
        return this.f1920h.f1928o.f403t;
    }

    @Override // g.c
    public final void k(View view) {
        this.f1920h.f1928o.setCustomView(view);
        this.f1919g = new WeakReference(view);
    }

    @Override // g.c
    public final void l(int i4) {
        m(this.f1920h.f1923j.getResources().getString(i4));
    }

    @Override // g.c
    public final void m(CharSequence charSequence) {
        this.f1920h.f1928o.setSubtitle(charSequence);
    }

    @Override // g.c
    public final void n(int i4) {
        o(this.f1920h.f1923j.getResources().getString(i4));
    }

    @Override // g.c
    public final void o(CharSequence charSequence) {
        this.f1920h.f1928o.setTitle(charSequence);
    }

    @Override // g.c
    public final void p(boolean z4) {
        this.f2209c = z4;
        this.f1920h.f1928o.setTitleOptional(z4);
    }
}
