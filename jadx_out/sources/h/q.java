package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import e.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q implements d0.b {
    public r A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f2459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f2460h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f2462j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f2464l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f2466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i0 f2467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f2469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f2470r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f2478z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2461i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2463k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2465m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f2471s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2472t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2473u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2474v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2475w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2476x = 16;
    public boolean C = false;

    public q(o oVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f2466n = oVar;
        this.f2453a = i5;
        this.f2454b = i4;
        this.f2455c = i6;
        this.f2456d = i7;
        this.f2457e = charSequence;
        this.f2477y = i8;
    }

    public static void c(int i4, int i5, String str, StringBuilder sb) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // d0.b
    public final r a() {
        return this.A;
    }

    @Override // d0.b
    public final d0.b b(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f2478z = null;
        this.A = rVar;
        this.f2466n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.d(new n0(3, this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2477y & 8) == 0) {
            return false;
        }
        if (this.f2478z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2466n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2475w && (this.f2473u || this.f2474v)) {
            drawable = drawable.mutate();
            if (this.f2473u) {
                c0.b.h(drawable, this.f2471s);
            }
            if (this.f2474v) {
                c0.b.i(drawable, this.f2472t);
            }
            this.f2475w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f2477y & 8) == 0) {
            return false;
        }
        if (this.f2478z == null && (rVar = this.A) != null) {
            this.f2478z = rVar.b(this);
        }
        return this.f2478z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2466n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2476x & 32) == 32;
    }

    public final void g(boolean z4) {
        if (z4) {
            this.f2476x |= 32;
        } else {
            this.f2476x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2478z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar == null) {
            return null;
        }
        View viewB = rVar.b(this);
        this.f2478z = viewB;
        return viewB;
    }

    @Override // d0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2463k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2462j;
    }

    @Override // d0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2469q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2454b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2464l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f2465m;
        if (i4 == 0) {
            return null;
        }
        Drawable drawableG = r3.q.g(this.f2466n.f2426a, i4);
        this.f2465m = 0;
        this.f2464l = drawableG;
        return d(drawableG);
    }

    @Override // d0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2471s;
    }

    @Override // d0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2472t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2459g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2453a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2461i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2460h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2455c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2467o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2457e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2458f;
        return charSequence != null ? charSequence : this.f2457e;
    }

    @Override // d0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2470r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2467o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2476x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2476x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2476x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        if (rVar == null || !rVar.c()) {
            return (this.f2476x & 8) == 0;
        }
        return (this.f2476x & 8) == 0 && this.A.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f2478z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f2453a) > 0) {
            view.setId(i4);
        }
        o oVar = this.f2466n;
        oVar.f2436k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f2462j == c5) {
            return this;
        }
        this.f2462j = Character.toLowerCase(c5);
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i4 = this.f2476x;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f2476x = i5;
        if (i4 != i5) {
            this.f2466n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i4 = this.f2476x;
        if ((i4 & 4) != 0) {
            o oVar = this.f2466n;
            oVar.getClass();
            ArrayList arrayList = oVar.f2431f;
            int size = arrayList.size();
            oVar.w();
            for (int i5 = 0; i5 < size; i5++) {
                q qVar = (q) arrayList.get(i5);
                if (qVar.f2454b == this.f2454b && (qVar.f2476x & 4) != 0 && qVar.isCheckable()) {
                    boolean z5 = qVar == this;
                    int i6 = qVar.f2476x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    qVar.f2476x = i7;
                    if (i6 != i7) {
                        qVar.f2466n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i8 = (i4 & (-3)) | (z4 ? 2 : 0);
            this.f2476x = i8;
            if (i4 != i8) {
                this.f2466n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f2476x |= 16;
        } else {
            this.f2476x &= -17;
        }
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2465m = 0;
        this.f2464l = drawable;
        this.f2475w = true;
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2471s = colorStateList;
        this.f2473u = true;
        this.f2475w = true;
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2472t = mode;
        this.f2474v = true;
        this.f2475w = true;
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2459g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.f2460h == c5) {
            return this;
        }
        this.f2460h = c5;
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2468p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f2460h = c5;
        this.f2462j = Character.toLowerCase(c6);
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2477y = i4;
        o oVar = this.f2466n;
        oVar.f2436k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2457e = charSequence;
        this.f2466n.p(false);
        i0 i0Var = this.f2467o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2458f = charSequence;
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i4 = this.f2476x;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f2476x = i5;
        if (i4 != i5) {
            o oVar = this.f2466n;
            oVar.f2433h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2457e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // d0.b, android.view.MenuItem
    public final d0.b setContentDescription(CharSequence charSequence) {
        this.f2469q = charSequence;
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f2464l = null;
        this.f2465m = i4;
        this.f2475w = true;
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i4) {
        if (this.f2460h == c5 && this.f2461i == i4) {
            return this;
        }
        this.f2460h = c5;
        this.f2461i = KeyEvent.normalizeMetaState(i4);
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final d0.b setTooltipText(CharSequence charSequence) {
        this.f2470r = charSequence;
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i4) {
        if (this.f2462j == c5 && this.f2463k == i4) {
            return this;
        }
        this.f2462j = Character.toLowerCase(c5);
        this.f2463k = KeyEvent.normalizeMetaState(i4);
        this.f2466n.p(false);
        return this;
    }

    @Override // d0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i4, int i5) {
        this.f2460h = c5;
        this.f2461i = KeyEvent.normalizeMetaState(i4);
        this.f2462j = Character.toLowerCase(c6);
        this.f2463k = KeyEvent.normalizeMetaState(i5);
        this.f2466n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f2466n.f2426a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        Context context = this.f2466n.f2426a;
        View viewInflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f2478z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i5 = this.f2453a) > 0) {
            viewInflate.setId(i5);
        }
        o oVar = this.f2466n;
        oVar.f2436k = true;
        oVar.p(true);
        return this;
    }
}
