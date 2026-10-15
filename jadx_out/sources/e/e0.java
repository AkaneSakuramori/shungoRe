package e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import i.b4;
import i.h1;
import i.p1;
import i.r1;
import i.s1;
import i.t3;
import i.w0;
import i.x3;
import i.z3;
import i0.c2;
import i0.d1;
import i0.v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r implements h.m, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final n.k f1812i0 = new n.k();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int[] f1813j0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f1814k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final boolean f1815l0 = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public d0[] M;
    public d0 N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public z X;
    public z Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1816a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1818c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Rect f1819d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Rect f1820e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public h0 f1821f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1822g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f1823h0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window f1826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f1827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f1828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s0 f1829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g.l f1830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r1 f1832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f1833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t f1834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g.c f1835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarContextView f1836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PopupWindow f1837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f1838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d1 f1839z = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final s f1817b0 = new s(this, 0);

    public e0(Context context, Window window, n nVar, Object obj) {
        m mVar;
        this.T = -100;
        this.f1825l = context;
        this.f1828o = nVar;
        this.f1824k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof m) {
                        mVar = (m) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                mVar = null;
                break;
            }
            if (mVar != null) {
                this.T = ((e0) mVar.l()).T;
            }
        }
        if (this.T == -100) {
            n.k kVar = f1812i0;
            Integer num = (Integer) kVar.getOrDefault(this.f1824k.getClass().getName(), null);
            if (num != null) {
                this.T = num.intValue();
                kVar.remove(this.f1824k.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        i.x.c();
    }

    public static e0.h p(Context context) {
        e0.h hVar;
        e0.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = r.f1909d) == null) {
            return null;
        }
        e0.h hVarB = w.b(context.getApplicationContext().getResources().getConfiguration());
        e0.i iVar = hVar.f1960a;
        if (((e0.j) iVar).f1961a.isEmpty()) {
            hVar2 = e0.h.f1959b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i4 = 0;
            while (i4 < ((e0.j) hVarB.f1960a).f1961a.size() + ((e0.j) iVar).f1961a.size()) {
                Locale locale = i4 < ((e0.j) iVar).f1961a.size() ? ((e0.j) iVar).f1961a.get(i4) : ((e0.j) hVarB.f1960a).f1961a.get(i4 - ((e0.j) iVar).f1961a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i4++;
            }
            hVar2 = new e0.h(new e0.j(e0.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ((e0.j) hVar2.f1960a).f1961a.isEmpty() ? hVarB : hVar2;
    }

    public static Configuration t(Context context, int i4, e0.h hVar, Configuration configuration, boolean z4) {
        int i5;
        if (i4 == 1) {
            i5 = 16;
        } else if (i4 != 2) {
            i5 = z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i5 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            w.d(configuration2, hVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.G && this.f1829p == null) {
            Object obj = this.f1824k;
            if (obj instanceof Activity) {
                this.f1829p = new s0((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f1829p = new s0((Dialog) obj);
            }
            s0 s0Var = this.f1829p;
            if (s0Var != null) {
                s0Var.T2(this.f1818c0);
            }
        }
    }

    public final void B(int i4) {
        this.f1816a0 = (1 << i4) | this.f1816a0;
        if (this.Z) {
            return;
        }
        View decorView = this.f1826m.getDecorView();
        WeakHashMap weakHashMap = v0.f2983a;
        i0.e0.m(decorView, this.f1817b0);
        this.Z = true;
    }

    public final int C(Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).d();
            }
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.Y == null) {
                    this.Y = new z(this, context);
                }
                return this.Y.d();
            }
        }
        return i4;
    }

    public final boolean D() {
        s1 s1Var;
        t3 t3Var;
        boolean z4 = this.O;
        this.O = false;
        d0 d0VarZ = z(0);
        if (d0VarZ.f1798m) {
            if (!z4) {
                s(d0VarZ, true);
            }
            return true;
        }
        g.c cVar = this.f1835v;
        if (cVar != null) {
            cVar.a();
            return true;
        }
        A();
        s0 s0Var = this.f1829p;
        if (s0Var == null || (s1Var = s0Var.f1927n) == null || (t3Var = ((x3) s1Var).f2837a.M) == null || t3Var.f2780c == null) {
            return false;
        }
        t3 t3Var2 = ((x3) s1Var).f2837a.M;
        h.q qVar = t3Var2 == null ? null : t3Var2.f2780c;
        if (qVar != null) {
            qVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0172, code lost:
    
        if (r3.f2418g.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(e.d0 r19, android.view.KeyEvent r20) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.E(e.d0, android.view.KeyEvent):void");
    }

    public final boolean F(d0 d0Var, int i4, KeyEvent keyEvent) {
        h.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((d0Var.f1796k || G(d0Var, keyEvent)) && (oVar = d0Var.f1793h) != null) {
            return oVar.performShortcut(i4, keyEvent, 1);
        }
        return false;
    }

    public final boolean G(d0 d0Var, KeyEvent keyEvent) {
        r1 r1Var;
        r1 r1Var2;
        Resources.Theme themeNewTheme;
        r1 r1Var3;
        r1 r1Var4;
        if (this.R) {
            return false;
        }
        if (d0Var.f1796k) {
            return true;
        }
        d0 d0Var2 = this.N;
        if (d0Var2 != null && d0Var2 != d0Var) {
            s(d0Var2, false);
        }
        Window.Callback callback = this.f1826m.getCallback();
        int i4 = d0Var.f1786a;
        if (callback != null) {
            d0Var.f1792g = callback.onCreatePanelView(i4);
        }
        boolean z4 = i4 == 0 || i4 == 108;
        if (z4 && (r1Var4 = this.f1832s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r1Var4;
            actionBarOverlayLayout.k();
            ((x3) actionBarOverlayLayout.f409f).f2848l = true;
        }
        if (d0Var.f1792g == null) {
            h.o oVar = d0Var.f1793h;
            if (oVar == null || d0Var.f1800o) {
                if (oVar == null) {
                    Context context = this.f1825l;
                    if ((i4 == 0 || i4 == 108) && this.f1832s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.shungo.app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.shungo.app.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.shungo.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            g.f fVar = new g.f(context, 0);
                            fVar.getTheme().setTo(themeNewTheme);
                            context = fVar;
                        }
                    }
                    h.o oVar2 = new h.o(context);
                    oVar2.f2430e = this;
                    h.o oVar3 = d0Var.f1793h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(d0Var.f1794i);
                        }
                        d0Var.f1793h = oVar2;
                        h.k kVar = d0Var.f1794i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f2426a);
                        }
                    }
                    if (d0Var.f1793h == null) {
                        return false;
                    }
                }
                if (z4 && (r1Var2 = this.f1832s) != null) {
                    if (this.f1833t == null) {
                        this.f1833t = new t(this, 3);
                    }
                    ((ActionBarOverlayLayout) r1Var2).l(d0Var.f1793h, this.f1833t);
                }
                d0Var.f1793h.w();
                if (!callback.onCreatePanelMenu(i4, d0Var.f1793h)) {
                    h.o oVar4 = d0Var.f1793h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(d0Var.f1794i);
                        }
                        d0Var.f1793h = null;
                    }
                    if (z4 && (r1Var = this.f1832s) != null) {
                        ((ActionBarOverlayLayout) r1Var).l(null, this.f1833t);
                    }
                    return false;
                }
                d0Var.f1800o = false;
            }
            d0Var.f1793h.w();
            Bundle bundle = d0Var.f1801p;
            if (bundle != null) {
                d0Var.f1793h.s(bundle);
                d0Var.f1801p = null;
            }
            if (!callback.onPreparePanel(0, d0Var.f1792g, d0Var.f1793h)) {
                if (z4 && (r1Var3 = this.f1832s) != null) {
                    ((ActionBarOverlayLayout) r1Var3).l(null, this.f1833t);
                }
                d0Var.f1793h.v();
                return false;
            }
            d0Var.f1793h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            d0Var.f1793h.v();
        }
        d0Var.f1796k = true;
        d0Var.f1797l = false;
        this.N = d0Var;
        return true;
    }

    public final void H() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f1822g0 != null && (z(0).f1798m || this.f1835v != null)) {
                z4 = true;
            }
            if (z4 && this.f1823h0 == null) {
                this.f1823h0 = x.b(this.f1822g0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f1823h0) == null) {
                    return;
                }
                x.c(this.f1822g0, onBackInvokedCallback);
            }
        }
    }

    public final int J(c2 c2Var, Rect rect) {
        int iD;
        boolean z4;
        boolean z5;
        int iA;
        if (c2Var != null) {
            iD = c2Var.d();
        } else {
            iD = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f1836w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1836w.getLayoutParams();
            boolean z6 = true;
            if (this.f1836w.isShown()) {
                if (this.f1819d0 == null) {
                    this.f1819d0 = new Rect();
                    this.f1820e0 = new Rect();
                }
                Rect rect2 = this.f1819d0;
                Rect rect3 = this.f1820e0;
                if (c2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c2Var.b(), c2Var.d(), c2Var.c(), c2Var.a());
                }
                ViewGroup viewGroup = this.B;
                Method method = b4.f2529a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e5) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                    }
                }
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                ViewGroup viewGroup2 = this.B;
                WeakHashMap weakHashMap = v0.f2983a;
                c2 c2VarA = i0.l0.a(viewGroup2);
                int iB = c2VarA == null ? 0 : c2VarA.b();
                int iC = c2VarA == null ? 0 : c2VarA.c();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z5 = true;
                }
                Context context = this.f1825l;
                if (i4 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z6 = view3 != null;
                if (z6 && view3.getVisibility() != 0) {
                    View view4 = this.D;
                    if ((i0.e0.g(view4) & 8192) != 0) {
                        Object obj = z.d.f5428a;
                        iA = z.c.a(context, com.shungo.app.R.color.abc_decor_view_status_guard_light);
                    } else {
                        Object obj2 = z.d.f5428a;
                        iA = z.c.a(context, com.shungo.app.R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(iA);
                }
                if (!this.I && z6) {
                    iD = 0;
                }
                z4 = z6;
                z6 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z6 = false;
            }
            if (z6) {
                this.f1836w.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.D;
        if (view5 != null) {
            view5.setVisibility(z4 ? 0 : 8);
        }
        return iD;
    }

    @Override // e.r
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1825l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof e0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.r
    public final void b() {
        if (this.f1829p != null) {
            A();
            this.f1829p.getClass();
            B(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // h.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(h.o r6) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.d(h.o):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // h.m
    public final boolean e(h.o oVar, MenuItem menuItem) {
        d0 d0Var;
        Window.Callback callback = this.f1826m.getCallback();
        if (callback != null && !this.R) {
            h.o oVarK = oVar.k();
            d0[] d0VarArr = this.M;
            int length = d0VarArr != null ? d0VarArr.length : 0;
            for (int i4 = 0; i4 < length; i4++) {
                d0Var = d0VarArr[i4];
                if (d0Var != null && d0Var.f1793h == oVarK) {
                    if (d0Var != null) {
                        return callback.onMenuItemSelected(d0Var.f1786a, menuItem);
                    }
                }
            }
            d0Var = null;
            if (d0Var != null) {
                return callback.onMenuItemSelected(d0Var.f1786a, menuItem);
            }
        }
        return false;
    }

    @Override // e.r
    public final void f() {
        String strK;
        this.P = true;
        n(false, true);
        x();
        Object obj = this.f1824k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strK = r3.q.k(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (IllegalArgumentException unused) {
                strK = null;
            }
            if (strK != null) {
                s0 s0Var = this.f1829p;
                if (s0Var == null) {
                    this.f1818c0 = true;
                } else {
                    s0Var.T2(true);
                }
            }
            synchronized (r.f1914i) {
                r.h(this);
                r.f1913h.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.f1825l.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // e.r
    public final void g() {
        if (this.f1824k instanceof Activity) {
            synchronized (r.f1914i) {
                r.h(this);
            }
        }
        if (this.Z) {
            this.f1826m.getDecorView().removeCallbacks(this.f1817b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.f1824k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1812i0.put(this.f1824k.getClass().getName(), Integer.valueOf(this.T));
            } else {
                f1812i0.remove(this.f1824k.getClass().getName());
            }
        } else {
            f1812i0.remove(this.f1824k.getClass().getName());
        }
        z zVar = this.X;
        if (zVar != null) {
            zVar.a();
        }
        z zVar2 = this.Y;
        if (zVar2 != null) {
            zVar2.a();
        }
    }

    @Override // e.r
    public final boolean i(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.K && i4 == 108) {
            return false;
        }
        if (this.G && i4 == 1) {
            this.G = false;
        }
        if (i4 == 1) {
            H();
            this.K = true;
            return true;
        }
        if (i4 == 2) {
            H();
            this.E = true;
            return true;
        }
        if (i4 == 5) {
            H();
            this.F = true;
            return true;
        }
        if (i4 == 10) {
            H();
            this.I = true;
            return true;
        }
        if (i4 == 108) {
            H();
            this.G = true;
            return true;
        }
        if (i4 != 109) {
            return this.f1826m.requestFeature(i4);
        }
        H();
        this.H = true;
        return true;
    }

    @Override // e.r
    public final void j(int i4) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1825l).inflate(i4, viewGroup);
        this.f1827n.a(this.f1826m.getCallback());
    }

    @Override // e.r
    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1827n.a(this.f1826m.getCallback());
    }

    @Override // e.r
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1827n.a(this.f1826m.getCallback());
    }

    @Override // e.r
    public final void m(CharSequence charSequence) {
        this.f1831r = charSequence;
        r1 r1Var = this.f1832s;
        if (r1Var != null) {
            r1Var.setWindowTitle(charSequence);
            return;
        }
        s0 s0Var = this.f1829p;
        if (s0Var != null) {
            s0Var.V2(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(boolean z4, boolean z5) {
        int i4;
        boolean z6;
        if (this.R) {
            return false;
        }
        int i5 = this.T;
        if (i5 == -100) {
            i5 = r.f1908c;
        }
        Context context = this.f1825l;
        int iC = C(context, i5);
        int i6 = Build.VERSION.SDK_INT;
        e0.h hVarP = i6 < 33 ? p(context) : null;
        if (!z5 && hVarP != null) {
            hVarP = w.b(context.getResources().getConfiguration());
        }
        Configuration configurationT = t(context, iC, hVarP, null, false);
        boolean z7 = this.W;
        boolean z8 = true;
        Object obj = this.f1824k;
        if (z7 || !(obj instanceof Activity)) {
            this.W = true;
            i4 = this.V;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i4 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i6 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.V = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e5);
                    this.V = 0;
                }
                this.W = true;
                i4 = this.V;
            }
        }
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i7 = configuration.uiMode & 48;
        int i8 = configurationT.uiMode & 48;
        e0.h hVarB = w.b(configuration);
        e0.h hVarB2 = hVarP == null ? null : w.b(configurationT);
        int i9 = i7 != i8 ? 512 : 0;
        if (hVarB2 != null && !hVarB.equals(hVarB2)) {
            i9 |= 8196;
        }
        int i10 = 4;
        if (((~i4) & i9) != 0 && z4 && this.P && ((f1814k0 || this.Q) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z6 = false;
            } else {
                int i11 = y.e.f5022b;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.d(i10, activity));
                }
                z6 = true;
            }
        } else {
            z6 = false;
        }
        if (z6 || i9 == 0) {
            z8 = z6;
        } else {
            boolean z9 = (i9 & i4) == i9;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
            if (hVarB2 != null) {
                w.d(configuration2, hVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i12 = this.U;
            if (i12 != 0) {
                context.setTheme(i12);
                context.getTheme().applyStyle(this.U, true);
            }
            if (z9 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof androidx.lifecycle.r) {
                    if (((androidx.lifecycle.r) activity2).t().f983f.compareTo(androidx.lifecycle.m.f968d) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.Q && !this.R) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z8 && (obj instanceof m)) {
            if ((i9 & 512) != 0) {
                ((m) obj).getClass();
            }
            if ((i9 & 4) != 0) {
                ((m) obj).getClass();
            }
        }
        if (z8 && hVarB2 != null) {
            w.c(w.b(context.getResources().getConfiguration()));
        }
        if (i5 == 0) {
            y(context).g();
        } else {
            z zVar = this.X;
            if (zVar != null) {
                zVar.a();
            }
        }
        if (i5 == 3) {
            if (this.Y == null) {
                this.Y = new z(this, context);
            }
            this.Y.g();
        } else {
            z zVar2 = this.Y;
            if (zVar2 != null) {
                zVar2.a();
            }
        }
        return z8;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final void o(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f1826m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof y) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        y yVar = new y(this, callback);
        this.f1827n = yVar;
        window.setCallback(yVar);
        int[] iArr = f1813j0;
        Context context = this.f1825l;
        c cVar = new c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        Drawable drawableI = cVar.i(0);
        if (drawableI != null) {
            window.setBackgroundDrawable(drawableI);
        }
        cVar.v();
        this.f1826m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1822g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1823h0) != null) {
            x.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1823h0 = null;
        }
        Object obj = this.f1824k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1822g0 = x.a(activity);
            } else {
                this.f1822g0 = null;
            }
        } else {
            this.f1822g0 = null;
        }
        I();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View j0Var;
        if (this.f1821f0 == null) {
            int[] iArr = d.a.f1663j;
            Context context2 = this.f1825l;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f1821f0 = new h0();
            } else {
                try {
                    this.f1821f0 = (h0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1821f0 = new h0();
                }
            }
        }
        h0 h0Var = this.f1821f0;
        int i4 = z3.f2883a;
        h0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1678y, 0, 0);
        byte b5 = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context fVar = (resourceId == 0 || ((context instanceof g.f) && ((g.f) context).f2211a == resourceId)) ? context : new g.f(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b5 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b5 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b5 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b5 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b5 = -1;
                }
                break;
            case -658531749:
                b5 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b5 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b5 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b5 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b5 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b5 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b5 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b5 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b5 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b5 = -1;
                break;
        }
        View view2 = null;
        switch (b5) {
            case 0:
                j0Var = new i.j0(fVar, attributeSet);
                break;
            case 1:
                j0Var = new i.u(fVar, attributeSet);
                break;
            case 2:
                j0Var = new i.f0(fVar, attributeSet);
                break;
            case 3:
                h1 h1VarE = h0Var.e(fVar, attributeSet);
                h0Var.g(h1VarE, str);
                j0Var = h1VarE;
                break;
            case 4:
                j0Var = new i.c0(fVar, attributeSet, com.shungo.app.R.attr.imageButtonStyle);
                break;
            case 5:
                j0Var = new i.l0(fVar, attributeSet);
                break;
            case 6:
                j0Var = new w0(fVar, attributeSet);
                break;
            case 7:
                i.i0 i0VarD = h0Var.d(fVar, attributeSet);
                h0Var.g(i0VarD, str);
                j0Var = i0VarD;
                break;
            case 8:
                j0Var = new p1(fVar, attributeSet);
                break;
            case 9:
                j0Var = new i.e0(fVar, attributeSet, 0);
                break;
            case 10:
                i.q qVarA = h0Var.a(fVar, attributeSet);
                h0Var.g(qVarA, str);
                j0Var = qVarA;
                break;
            case 11:
                i.t tVarC = h0Var.c(fVar, attributeSet);
                h0Var.g(tVarC, str);
                j0Var = tVarC;
                break;
            case 12:
                j0Var = new i.z(fVar, attributeSet);
                break;
            case 13:
                i.s sVarB = h0Var.b(fVar, attributeSet);
                h0Var.g(sVarB, str);
                j0Var = sVarB;
                break;
            default:
                j0Var = null;
                break;
        }
        if (j0Var == null && context != fVar) {
            Object[] objArr = h0Var.f1877a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = fVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr = h0.f1875g;
                        if (i5 < 3) {
                            View viewF = h0Var.f(fVar, str, strArr[i5]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i5++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = h0Var.f(fVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            j0Var = view2;
        }
        if (j0Var != null) {
            Context context3 = j0Var.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = v0.f2983a;
                if (i0.d0.a(j0Var)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, h0.f1871c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        j0Var.setOnClickListener(new g0(j0Var, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = fVar.obtainStyledAttributes(attributeSet, h0.f1872d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z4 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = v0.f2983a;
                    new i0.a0(com.shungo.app.R.id.tag_accessibility_heading, 3).b(j0Var, Boolean.valueOf(z4));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = fVar.obtainStyledAttributes(attributeSet, h0.f1873e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    v0.m(j0Var, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = fVar.obtainStyledAttributes(attributeSet, h0.f1874f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z5 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = v0.f2983a;
                    new i0.a0(com.shungo.app.R.id.tag_screen_reader_focusable, 0).b(j0Var, Boolean.valueOf(z5));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return j0Var;
    }

    public final void q(int i4, d0 d0Var, h.o oVar) {
        if (oVar == null) {
            if (d0Var == null && i4 >= 0) {
                d0[] d0VarArr = this.M;
                if (i4 < d0VarArr.length) {
                    d0Var = d0VarArr[i4];
                }
            }
            if (d0Var != null) {
                oVar = d0Var.f1793h;
            }
        }
        if ((d0Var == null || d0Var.f1798m) && !this.R) {
            y yVar = this.f1827n;
            Window.Callback callback = this.f1826m.getCallback();
            yVar.getClass();
            try {
                yVar.f1949e = true;
                callback.onPanelClosed(i4, oVar);
            } finally {
                yVar.f1949e = false;
            }
        }
    }

    public final void r(h.o oVar) {
        i.m mVar;
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1832s;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f409f).f2837a.f476b;
        if (actionMenuView != null && (mVar = actionMenuView.f434u) != null) {
            mVar.f();
            i.h hVar = mVar.f2675u;
            if (hVar != null && hVar.b()) {
                hVar.f2346j.dismiss();
            }
        }
        Window.Callback callback = this.f1826m.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, oVar);
        }
        this.L = false;
    }

    public final void s(d0 d0Var, boolean z4) {
        c0 c0Var;
        r1 r1Var;
        i.m mVar;
        if (z4 && d0Var.f1786a == 0 && (r1Var = this.f1832s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f409f).f2837a.f476b;
            if (actionMenuView != null && (mVar = actionMenuView.f434u) != null && mVar.h()) {
                r(d0Var.f1793h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1825l.getSystemService("window");
        if (windowManager != null && d0Var.f1798m && (c0Var = d0Var.f1790e) != null) {
            windowManager.removeView(c0Var);
            if (z4) {
                q(d0Var.f1786a, d0Var, null);
            }
        }
        d0Var.f1796k = false;
        d0Var.f1797l = false;
        d0Var.f1798m = false;
        d0Var.f1791f = null;
        d0Var.f1799n = true;
        if (this.N == d0Var) {
            this.N = null;
        }
        if (d0Var.f1786a == 0) {
            I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        ActionMenuView actionMenuView;
        i.m mVar;
        i.m mVar2;
        i.m mVar3;
        Object obj = this.f1824k;
        if (((obj instanceof i0.l) || (obj instanceof j)) && (decorView = this.f1826m.getDecorView()) != null && c3.h.G0(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            y yVar = this.f1827n;
            Window.Callback callback = this.f1826m.getCallback();
            yVar.getClass();
            try {
                yVar.f1948d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                yVar.f1948d = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                yVar.f1948d = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                d0 d0VarZ = z(0);
                if (d0VarZ.f1798m) {
                    return true;
                }
                G(d0VarZ, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f1835v != null) {
                    return true;
                }
                d0 d0VarZ2 = z(0);
                r1 r1Var = this.f1832s;
                Context context = this.f1825l;
                if (r1Var != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r1Var;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((x3) actionBarOverlayLayout.f409f).f2837a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f476b) == null || !actionMenuView.f433t || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        z4 = d0VarZ2.f1798m;
                        if (!z4 || d0VarZ2.f1797l) {
                            s(d0VarZ2, true);
                            if (!z4) {
                                return true;
                            }
                        } else {
                            if (!d0VarZ2.f1796k) {
                                return true;
                            }
                            if (d0VarZ2.f1800o) {
                                d0VarZ2.f1796k = false;
                                if (!G(d0VarZ2, keyEvent)) {
                                    return true;
                                }
                            }
                            E(d0VarZ2, keyEvent);
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1832s;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((x3) actionBarOverlayLayout2.f409f).f2837a.f476b;
                        if (actionMenuView2 != null && (mVar2 = actionMenuView2.f434u) != null && mVar2.h()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1832s;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView3 = ((x3) actionBarOverlayLayout3.f409f).f2837a.f476b;
                            if (actionMenuView3 == null || (mVar3 = actionMenuView3.f434u) == null || !mVar3.f()) {
                                return true;
                            }
                        } else {
                            if (this.R || !G(d0VarZ2, keyEvent)) {
                                return true;
                            }
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1832s;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((x3) actionBarOverlayLayout4.f409f).f2837a.f476b;
                            if (actionMenuView4 == null || (mVar = actionMenuView4.f434u) == null || !mVar.l()) {
                                return true;
                            }
                        }
                    }
                } else {
                    z4 = d0VarZ2.f1798m;
                    if (z4) {
                        s(d0VarZ2, true);
                        if (!z4) {
                            return true;
                        }
                    } else {
                        s(d0VarZ2, true);
                        if (!z4) {
                            return true;
                        }
                    }
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (D()) {
            return true;
        }
        return false;
    }

    public final void v(int i4) {
        d0 d0VarZ = z(i4);
        if (d0VarZ.f1793h != null) {
            Bundle bundle = new Bundle();
            d0VarZ.f1793h.t(bundle);
            if (bundle.size() > 0) {
                d0VarZ.f1801p = bundle;
            }
            d0VarZ.f1793h.w();
            d0VarZ.f1793h.clear();
        }
        d0VarZ.f1800o = true;
        d0VarZ.f1799n = true;
        if ((i4 == 108 || i4 == 0) && this.f1832s != null) {
            d0 d0VarZ2 = z(0);
            d0VarZ2.f1796k = false;
            G(d0VarZ2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        int[] iArr = d.a.f1663j;
        Context context = this.f1825l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i4 = 0;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.f1826m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i5 = 2;
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(com.shungo.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.shungo.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.shungo.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.shungo.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new g.f(context, typedValue.resourceId) : context).inflate(com.shungo.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            r1 r1Var = (r1) viewGroup.findViewById(com.shungo.app.R.id.decor_content_parent);
            this.f1832s = r1Var;
            r1Var.setWindowCallback(this.f1826m.getCallback());
            if (this.H) {
                ((ActionBarOverlayLayout) this.f1832s).j(109);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f1832s).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f1832s).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        t tVar = new t(this, i4);
        WeakHashMap weakHashMap = v0.f2983a;
        i0.k0.u(viewGroup, tVar);
        if (this.f1832s == null) {
            this.C = (TextView) viewGroup.findViewById(com.shungo.app.R.id.title);
        }
        Method method = b4.f2529a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.shungo.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1826m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1826m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new t(this, i5));
        this.B = viewGroup;
        Object obj = this.f1824k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1831r;
        if (!TextUtils.isEmpty(title)) {
            r1 r1Var2 = this.f1832s;
            if (r1Var2 != null) {
                r1Var2.setWindowTitle(title);
            } else {
                s0 s0Var = this.f1829p;
                if (s0Var != null) {
                    s0Var.V2(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f1826m.getDecorView();
        contentFrameLayout2.f450h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = v0.f2983a;
        if (i0.h0.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        d0 d0VarZ = z(0);
        if (this.R || d0VarZ.f1793h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.f1826m == null) {
            Object obj = this.f1824k;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f1826m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final b0 y(Context context) {
        if (this.X == null) {
            if (c.f1777f == null) {
                Context applicationContext = context.getApplicationContext();
                c.f1777f = new c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new z(this, c.f1777f);
        }
        return this.X;
    }

    public final d0 z(int i4) {
        d0[] d0VarArr = this.M;
        if (d0VarArr == null || d0VarArr.length <= i4) {
            d0[] d0VarArr2 = new d0[i4 + 1];
            if (d0VarArr != null) {
                System.arraycopy(d0VarArr, 0, d0VarArr2, 0, d0VarArr.length);
            }
            this.M = d0VarArr2;
            d0VarArr = d0VarArr2;
        }
        d0 d0Var = d0VarArr[i4];
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        d0Var2.f1786a = i4;
        d0Var2.f1799n = false;
        d0VarArr[i4] = d0Var2;
        return d0Var2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
