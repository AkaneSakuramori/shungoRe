package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import h.f0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2228b;

    public i(Context context, c cVar) {
        this.f2227a = context;
        this.f2228b = cVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2228b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2228b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new f0(this.f2227a, this.f2228b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2228b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2228b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2228b.f2208b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2228b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2228b.f2209c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2228b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2228b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2228b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2228b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2228b.f2208b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2228b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f2228b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f2228b.l(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f2228b.n(i4);
    }
}
