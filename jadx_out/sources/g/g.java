package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c implements h.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f2216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f2217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f2218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f2219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h.o f2221i;

    @Override // g.c
    public final void a() {
        if (this.f2220h) {
            return;
        }
        this.f2220h = true;
        this.f2218f.b(this);
    }

    @Override // g.c
    public final View b() {
        WeakReference weakReference = this.f2219g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // g.c
    public final h.o c() {
        return this.f2221i;
    }

    @Override // h.m
    public final void d(h.o oVar) {
        i();
        i.m mVar = this.f2217e.f388e;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // h.m
    public final boolean e(h.o oVar, MenuItem menuItem) {
        return this.f2218f.f(this, menuItem);
    }

    @Override // g.c
    public final MenuInflater f() {
        return new l(this.f2217e.getContext());
    }

    @Override // g.c
    public final CharSequence g() {
        return this.f2217e.getSubtitle();
    }

    @Override // g.c
    public final CharSequence h() {
        return this.f2217e.getTitle();
    }

    @Override // g.c
    public final void i() {
        this.f2218f.a(this, this.f2221i);
    }

    @Override // g.c
    public final boolean j() {
        return this.f2217e.f403t;
    }

    @Override // g.c
    public final void k(View view) {
        this.f2217e.setCustomView(view);
        this.f2219g = view != null ? new WeakReference(view) : null;
    }

    @Override // g.c
    public final void l(int i4) {
        m(this.f2216d.getString(i4));
    }

    @Override // g.c
    public final void m(CharSequence charSequence) {
        this.f2217e.setSubtitle(charSequence);
    }

    @Override // g.c
    public final void n(int i4) {
        o(this.f2216d.getString(i4));
    }

    @Override // g.c
    public final void o(CharSequence charSequence) {
        this.f2217e.setTitle(charSequence);
    }

    @Override // g.c
    public final void p(boolean z4) {
        this.f2209c = z4;
        this.f2217e.setTitleOptional(z4);
    }
}
