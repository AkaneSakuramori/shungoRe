package e;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.shungo.app.R;
import i0.d1;
import i0.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Window.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f1946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f1950f;

    public y(e0 e0Var, Window.Callback callback) {
        this.f1950f = e0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1946b = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1947c = true;
            callback.onContentChanged();
        } finally {
            this.f1947c = false;
        }
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1946b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1946b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f1946b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1946b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f1948d;
        Window.Callback callback = this.f1946b;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f1950f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        r0 r0Var;
        h.o oVar;
        if (this.f1946b.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        e0 e0Var = this.f1950f;
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (s0Var != null && (r0Var = s0Var.f1931r) != null && (oVar = r0Var.f1917e) != null) {
            oVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
            if (oVar.performShortcut(keyCode, keyEvent, 0)) {
                return true;
            }
        }
        d0 d0Var = e0Var.N;
        if (d0Var != null && e0Var.F(d0Var, keyEvent.getKeyCode(), keyEvent)) {
            d0 d0Var2 = e0Var.N;
            if (d0Var2 == null) {
                return true;
            }
            d0Var2.f1797l = true;
            return true;
        }
        if (e0Var.N == null) {
            d0 d0VarZ = e0Var.z(0);
            e0Var.G(d0VarZ, keyEvent);
            boolean zF = e0Var.F(d0VarZ, keyEvent.getKeyCode(), keyEvent);
            d0VarZ.f1796k = false;
            if (zF) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1946b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1946b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1946b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f1946b.onDetachedFromWindow();
    }

    public final boolean f(int i4, Menu menu) {
        return this.f1946b.onMenuOpened(i4, menu);
    }

    public final void g(int i4, Menu menu) {
        this.f1946b.onPanelClosed(i4, menu);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z4) {
        g.q.a(this.f1946b, z4);
    }

    public final void i(List list, Menu menu, int i4) {
        g.p.a(this.f1946b, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1946b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z4) {
        this.f1946b.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1947c) {
            this.f1946b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0 || (menu instanceof h.o)) {
            return this.f1946b.onCreatePanelMenu(i4, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        return this.f1946b.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f1946b.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        f(i4, menu);
        e0 e0Var = this.f1950f;
        if (i4 == 108) {
            e0Var.A();
            s0 s0Var = e0Var.f1829p;
            if (s0Var != null && true != s0Var.f1934u) {
                s0Var.f1934u = true;
                ArrayList arrayList = s0Var.f1935v;
                if (arrayList.size() > 0) {
                    defpackage.a.n(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            e0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.f1949e) {
            this.f1946b.onPanelClosed(i4, menu);
            return;
        }
        g(i4, menu);
        e0 e0Var = this.f1950f;
        if (i4 != 108) {
            if (i4 != 0) {
                e0Var.getClass();
                return;
            }
            d0 d0VarZ = e0Var.z(i4);
            if (d0VarZ.f1798m) {
                e0Var.s(d0VarZ, false);
                return;
            }
            return;
        }
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (s0Var == null || !s0Var.f1934u) {
            return;
        }
        s0Var.f1934u = false;
        ArrayList arrayList = s0Var.f1935v;
        if (arrayList.size() <= 0) {
            return;
        }
        defpackage.a.n(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        h.o oVar = menu instanceof h.o ? (h.o) menu : null;
        if (i4 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f2449x = true;
        }
        boolean zOnPreparePanel = this.f1946b.onPreparePanel(i4, view, menu);
        if (oVar != null) {
            oVar.f2449x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        h.o oVar = this.f1950f.z(0).f1793h;
        if (oVar != null) {
            i(list, oVar, i4);
        } else {
            i(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return g.o.a(this.f1946b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1946b.onSearchRequested();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        boolean z4;
        ViewGroup viewGroup;
        e0 e0Var = this.f1950f;
        e0Var.getClass();
        if (i4 != 0) {
            return g.o.b(this.f1946b, callback, i4);
        }
        Context context = e0Var.f1825l;
        g.h hVar = new g.h();
        hVar.f2223b = context;
        hVar.f2224c = callback;
        hVar.f2225d = new ArrayList();
        hVar.f2226e = new n.k();
        g.c cVar = e0Var.f1835v;
        if (cVar != null) {
            cVar.a();
        }
        v vVar = new v(e0Var, hVar);
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        int i5 = 1;
        n nVar = e0Var.f1828o;
        if (s0Var != null) {
            r0 r0Var = s0Var.f1931r;
            if (r0Var != null) {
                r0Var.a();
            }
            s0Var.f1925l.setHideOnContentScrollEnabled(false);
            s0Var.f1928o.e();
            r0 r0Var2 = new r0(s0Var, s0Var.f1928o.getContext(), vVar);
            h.o oVar = r0Var2.f1917e;
            oVar.w();
            try {
                boolean zC = r0Var2.f1918f.c(r0Var2, oVar);
                oVar.v();
                if (zC) {
                    s0Var.f1931r = r0Var2;
                    r0Var2.i();
                    s0Var.f1928o.c(r0Var2);
                    s0Var.Q2(true);
                } else {
                    r0Var2 = null;
                }
                e0Var.f1835v = r0Var2;
                if (r0Var2 != null && nVar != null) {
                    nVar.d();
                }
            } catch (Throwable th) {
                oVar.v();
                throw th;
            }
        }
        if (e0Var.f1835v == null) {
            d1 d1Var = e0Var.f1839z;
            if (d1Var != null) {
                d1Var.b();
            }
            g.c cVar2 = e0Var.f1835v;
            if (cVar2 != null) {
                cVar2.a();
            }
            if (nVar != null && !e0Var.R) {
                try {
                    nVar.b();
                } catch (AbstractMethodError unused) {
                }
            }
            if (e0Var.f1836w == null) {
                boolean z5 = e0Var.J;
                Context context2 = e0Var.f1825l;
                if (z5) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        g.f fVar = new g.f(context2, 0);
                        fVar.getTheme().setTo(themeNewTheme);
                        context2 = fVar;
                    }
                    e0Var.f1836w = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    e0Var.f1837x = popupWindow;
                    m0.n.d(popupWindow, 2);
                    e0Var.f1837x.setContentView(e0Var.f1836w);
                    e0Var.f1837x.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    e0Var.f1836w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    e0Var.f1837x.setHeight(-2);
                    e0Var.f1838y = new s(e0Var, i5);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) e0Var.B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        e0Var.A();
                        s0 s0Var2 = e0Var.f1829p;
                        Context contextR2 = s0Var2 != null ? s0Var2.R2() : null;
                        if (contextR2 != null) {
                            context2 = contextR2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        e0Var.f1836w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (e0Var.f1836w != null) {
                d1 d1Var2 = e0Var.f1839z;
                if (d1Var2 != null) {
                    d1Var2.b();
                }
                e0Var.f1836w.e();
                Context context3 = e0Var.f1836w.getContext();
                ActionBarContextView actionBarContextView = e0Var.f1836w;
                g.g gVar = new g.g();
                gVar.f2216d = context3;
                gVar.f2217e = actionBarContextView;
                gVar.f2218f = vVar;
                h.o oVar2 = new h.o(actionBarContextView.getContext());
                oVar2.f2437l = 1;
                gVar.f2221i = oVar2;
                oVar2.f2430e = gVar;
                if (vVar.f1944b.c(gVar, oVar2)) {
                    gVar.i();
                    e0Var.f1836w.c(gVar);
                    e0Var.f1835v = gVar;
                    if (!e0Var.A || (viewGroup = e0Var.B) == null) {
                        z4 = false;
                    } else {
                        WeakHashMap weakHashMap = v0.f2983a;
                        if (i0.h0.c(viewGroup)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        e0Var.f1836w.setAlpha(0.0f);
                        d1 d1VarA = v0.a(e0Var.f1836w);
                        d1VarA.a(1.0f);
                        e0Var.f1839z = d1VarA;
                        d1VarA.d(new u(i5, e0Var));
                    } else {
                        e0Var.f1836w.setAlpha(1.0f);
                        e0Var.f1836w.setVisibility(0);
                        if (e0Var.f1836w.getParent() instanceof View) {
                            View view = (View) e0Var.f1836w.getParent();
                            WeakHashMap weakHashMap2 = v0.f2983a;
                            i0.i0.c(view);
                        }
                    }
                    if (e0Var.f1837x != null) {
                        e0Var.f1826m.getDecorView().post(e0Var.f1838y);
                    }
                } else {
                    e0Var.f1835v = null;
                }
            }
            if (e0Var.f1835v != null && nVar != null) {
                nVar.d();
            }
            e0Var.I();
            e0Var.f1835v = e0Var.f1835v;
        }
        e0Var.I();
        g.c cVar3 = e0Var.f1835v;
        if (cVar3 != null) {
            return hVar.h(cVar3);
        }
        return null;
    }
}
