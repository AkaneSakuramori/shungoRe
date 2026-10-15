package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.shungo.app.R;
import i.s2;
import i.z1;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f2367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f2368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s2 f2373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f2374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f2375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f2377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f2378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0 f2379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f2380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2384u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2385v;

    public h0(int i4, int i5, Context context, View view, o oVar, boolean z4) {
        int i6 = 1;
        this.f2374k = new e(i6, this);
        this.f2375l = new f(i6, this);
        this.f2366c = context;
        this.f2367d = oVar;
        this.f2369f = z4;
        this.f2368e = new l(oVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f2371h = i4;
        this.f2372i = i5;
        Resources resources = context.getResources();
        this.f2370g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2377n = view;
        this.f2373j = new s2(context, null, i4, i5);
        oVar.b(this, context);
    }

    @Override // h.g0
    public final boolean a() {
        return !this.f2381r && this.f2373j.A.isShowing();
    }

    @Override // h.c0
    public final void b(o oVar, boolean z4) {
        if (oVar != this.f2367d) {
            return;
        }
        dismiss();
        b0 b0Var = this.f2379p;
        if (b0Var != null) {
            b0Var.b(oVar, z4);
        }
    }

    @Override // h.c0
    public final void c() {
        this.f2382s = false;
        l lVar = this.f2368e;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // h.g0
    public final void dismiss() {
        if (a()) {
            this.f2373j.dismiss();
        }
    }

    @Override // h.c0
    public final void e(b0 b0Var) {
        this.f2379p = b0Var;
    }

    @Override // h.g0
    public final z1 f() {
        return this.f2373j.f2687d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h.g0
    public final void h() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2381r || (view = this.f2377n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2378o = view;
        s2 s2Var = this.f2373j;
        s2Var.A.setOnDismissListener(this);
        s2Var.f2700q = this;
        s2Var.f2709z = true;
        s2Var.A.setFocusable(true);
        View view2 = this.f2378o;
        boolean z4 = this.f2380q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2380q = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2374k);
        }
        view2.addOnAttachStateChangeListener(this.f2375l);
        s2Var.f2699p = view2;
        s2Var.f2696m = this.f2384u;
        boolean z5 = this.f2382s;
        Context context = this.f2366c;
        l lVar = this.f2368e;
        if (!z5) {
            this.f2383t = x.m(lVar, context, this.f2370g);
            this.f2382s = true;
        }
        s2Var.r(this.f2383t);
        s2Var.A.setInputMethodMode(2);
        Rect rect = this.f2489b;
        s2Var.f2708y = rect != null ? new Rect(rect) : null;
        s2Var.h();
        z1 z1Var = s2Var.f2687d;
        z1Var.setOnKeyListener(this);
        if (this.f2385v) {
            o oVar = this.f2367d;
            if (oVar.f2438m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) z1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f2438m);
                }
                frameLayout.setEnabled(false);
                z1Var.addHeaderView(frameLayout, null, false);
            }
        }
        s2Var.n(lVar);
        s2Var.h();
    }

    @Override // h.c0
    public final boolean i() {
        return false;
    }

    @Override // h.c0
    public final boolean j(i0 i0Var) {
        if (i0Var.hasVisibleItems()) {
            a0 a0Var = new a0(this.f2371h, this.f2372i, this.f2366c, this.f2378o, i0Var, this.f2369f);
            b0 b0Var = this.f2379p;
            a0Var.f2345i = b0Var;
            x xVar = a0Var.f2346j;
            if (xVar != null) {
                xVar.e(b0Var);
            }
            boolean zU = x.u(i0Var);
            a0Var.f2344h = zU;
            x xVar2 = a0Var.f2346j;
            if (xVar2 != null) {
                xVar2.o(zU);
            }
            a0Var.f2347k = this.f2376m;
            this.f2376m = null;
            this.f2367d.c(false);
            s2 s2Var = this.f2373j;
            int width = s2Var.f2690g;
            int iJ = s2Var.j();
            int i4 = this.f2384u;
            View view = this.f2377n;
            WeakHashMap weakHashMap = v0.f2983a;
            if ((Gravity.getAbsoluteGravity(i4, i0.f0.d(view)) & 7) == 5) {
                width += this.f2377n.getWidth();
            }
            if (!a0Var.b()) {
                if (a0Var.f2342f != null) {
                    a0Var.d(width, iJ, true, true);
                }
            }
            b0 b0Var2 = this.f2379p;
            if (b0Var2 != null) {
                b0Var2.k(i0Var);
            }
            return true;
        }
        return false;
    }

    @Override // h.x
    public final void l(o oVar) {
    }

    @Override // h.x
    public final void n(View view) {
        this.f2377n = view;
    }

    @Override // h.x
    public final void o(boolean z4) {
        this.f2368e.f2421d = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2381r = true;
        this.f2367d.c(true);
        ViewTreeObserver viewTreeObserver = this.f2380q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2380q = this.f2378o.getViewTreeObserver();
            }
            this.f2380q.removeGlobalOnLayoutListener(this.f2374k);
            this.f2380q = null;
        }
        this.f2378o.removeOnAttachStateChangeListener(this.f2375l);
        PopupWindow.OnDismissListener onDismissListener = this.f2376m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // h.x
    public final void p(int i4) {
        this.f2384u = i4;
    }

    @Override // h.x
    public final void q(int i4) {
        this.f2373j.f2690g = i4;
    }

    @Override // h.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2376m = onDismissListener;
    }

    @Override // h.x
    public final void s(boolean z4) {
        this.f2385v = z4;
    }

    @Override // h.x
    public final void t(int i4) {
        this.f2373j.l(i4);
    }
}
