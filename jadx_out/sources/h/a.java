package h;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f2321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f2323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f2324d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f2326f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f2328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f2329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f2331k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2325e = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2327g = 4096;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f2332l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2333m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2334n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2335o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2336p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f2329i = context;
        this.f2321a = charSequence;
    }

    @Override // d0.b
    public final r a() {
        return null;
    }

    @Override // d0.b
    public final d0.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f2328h;
        if (drawable != null) {
            if (this.f2334n || this.f2335o) {
                this.f2328h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f2328h = drawableMutate;
                if (this.f2334n) {
                    c0.b.h(drawableMutate, this.f2332l);
                }
                if (this.f2335o) {
                    c0.b.i(this.f2328h, this.f2333m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // d0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2327g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2326f;
    }

    @Override // d0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2330j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f2328h;
    }

    @Override // d0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2332l;
    }

    @Override // d0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2333m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2323c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2325e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2324d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2321a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2322b;
        return charSequence != null ? charSequence : this.f2321a;
    }

    @Override // d0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2331k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2336p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2336p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2336p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2336p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        this.f2326f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f2336p = (z4 ? 1 : 0) | (this.f2336p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f2336p = (z4 ? 2 : 0) | (this.f2336p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2330j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f2336p = (z4 ? 16 : 0) | (this.f2336p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2328h = drawable;
        c();
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2332l = colorStateList;
        this.f2334n = true;
        c();
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2333m = mode;
        this.f2335o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2323c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        this.f2324d = c5;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f2324d = c5;
        this.f2326f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2321a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2322b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2331k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f2336p = (this.f2336p & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i4) {
        this.f2326f = Character.toLowerCase(c5);
        this.f2327g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final d0.b setContentDescription(CharSequence charSequence) {
        this.f2330j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        Context context = this.f2329i;
        Object obj = z.d.f5428a;
        this.f2328h = z.b.b(context, i4);
        c();
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i4) {
        this.f2324d = c5;
        this.f2325e = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i4, int i5) {
        this.f2324d = c5;
        this.f2325e = KeyEvent.normalizeMetaState(i4);
        this.f2326f = Character.toLowerCase(c6);
        this.f2327g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f2321a = this.f2329i.getResources().getString(i4);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final d0.b setTooltipText(CharSequence charSequence) {
        this.f2331k = charSequence;
        return this;
    }
}
