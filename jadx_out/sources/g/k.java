package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h.r;
import h.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ l E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f2232a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f2242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f2245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f2247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2252u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2253v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f2256y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f2257z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2233b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2234c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2235d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2236e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2237f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2238g = true;

    public k(l lVar, Menu menu) {
        this.E = lVar;
        this.f2232a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f2262c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f2250s).setVisible(this.f2251t).setEnabled(this.f2252u).setCheckable(this.f2249r >= 1).setTitleCondensed(this.f2243l).setIcon(this.f2244m);
        int i4 = this.f2253v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        String str = this.f2256y;
        l lVar = this.E;
        if (str != null) {
            if (lVar.f2262c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (lVar.f2263d == null) {
                lVar.f2263d = l.a(lVar.f2262c);
            }
            Object obj = lVar.f2263d;
            String str2 = this.f2256y;
            j jVar = new j();
            jVar.f2230a = obj;
            Class<?> cls = obj.getClass();
            try {
                jVar.f2231b = cls.getMethod(str2, j.f2229c);
                menuItem.setOnMenuItemClickListener(jVar);
            } catch (Exception e5) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f2249r >= 2) {
            if (menuItem instanceof h.q) {
                h.q qVar = (h.q) menuItem;
                qVar.f2476x = (qVar.f2476x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f2488e;
                    d0.b bVar = wVar.f2487d;
                    if (method == null) {
                        wVar.f2488e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f2488e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str3 = this.f2255x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, l.f2258e, lVar.f2260a));
            z4 = true;
        }
        int i5 = this.f2254w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        r rVar = this.f2257z;
        if (rVar != null) {
            if (menuItem instanceof d0.b) {
                ((d0.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z5 = menuItem instanceof d0.b;
        if (z5) {
            ((d0.b) menuItem).setContentDescription(charSequence);
        } else {
            i0.n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z5) {
            ((d0.b) menuItem).setTooltipText(charSequence2);
        } else {
            i0.n.m(menuItem, charSequence2);
        }
        char c5 = this.f2245n;
        int i6 = this.f2246o;
        if (z5) {
            ((d0.b) menuItem).setAlphabeticShortcut(c5, i6);
        } else {
            i0.n.g(menuItem, c5, i6);
        }
        char c6 = this.f2247p;
        int i7 = this.f2248q;
        if (z5) {
            ((d0.b) menuItem).setNumericShortcut(c6, i7);
        } else {
            i0.n.k(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z5) {
                ((d0.b) menuItem).setIconTintMode(mode);
            } else {
                i0.n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z5) {
                ((d0.b) menuItem).setIconTintList(colorStateList);
            } else {
                i0.n.i(menuItem, colorStateList);
            }
        }
    }
}
