package e;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import i.s1;
import i.x3;
import i0.c1;
import i0.d1;
import i0.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c3.h implements i.f {
    public static final AccelerateInterpolator H = new AccelerateInterpolator();
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public boolean A;
    public g.n B;
    public boolean C;
    public boolean D;
    public final q0 E;
    public final q0 F;
    public final n0 G;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f1923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f1924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ActionBarOverlayLayout f1925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ActionBarContainer f1926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s1 f1927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionBarContextView f1928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f1929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r0 f1931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r0 f1932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g.b f1933t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1934u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f1935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1938y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1939z;

    public s0(Activity activity, boolean z4) {
        new ArrayList();
        this.f1935v = new ArrayList();
        this.f1936w = 0;
        int i4 = 1;
        this.f1937x = true;
        this.A = true;
        this.E = new q0(this, 0);
        this.F = new q0(this, i4);
        this.G = new n0(i4, this);
        View decorView = activity.getWindow().getDecorView();
        S2(decorView);
        if (z4) {
            return;
        }
        this.f1929p = decorView.findViewById(R.id.content);
    }

    public final void Q2(boolean z4) {
        d1 d1VarL;
        d1 d1VarL2;
        if (z4) {
            if (!this.f1939z) {
                this.f1939z = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1925l;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                W2(false);
            }
        } else if (this.f1939z) {
            this.f1939z = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1925l;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            W2(false);
        }
        ActionBarContainer actionBarContainer = this.f1926m;
        WeakHashMap weakHashMap = v0.f2983a;
        if (!i0.h0.c(actionBarContainer)) {
            if (z4) {
                ((x3) this.f1927n).f2837a.setVisibility(4);
                this.f1928o.setVisibility(0);
                return;
            } else {
                ((x3) this.f1927n).f2837a.setVisibility(0);
                this.f1928o.setVisibility(8);
                return;
            }
        }
        if (z4) {
            x3 x3Var = (x3) this.f1927n;
            d1VarL = v0.a(x3Var.f2837a);
            d1VarL.a(0.0f);
            d1VarL.c(100L);
            d1VarL.d(new g.m(x3Var, 4));
            d1VarL2 = this.f1928o.l(0, 200L);
        } else {
            x3 x3Var2 = (x3) this.f1927n;
            d1 d1VarA = v0.a(x3Var2.f2837a);
            d1VarA.a(1.0f);
            d1VarA.c(200L);
            d1VarA.d(new g.m(x3Var2, 0));
            d1VarL = this.f1928o.l(8, 100L);
            d1VarL2 = d1VarA;
        }
        g.n nVar = new g.n();
        ArrayList arrayList = nVar.f2268a;
        arrayList.add(d1VarL);
        View view = (View) d1VarL.f2904a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) d1VarL2.f2904a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(d1VarL2);
        nVar.b();
    }

    public final Context R2() {
        if (this.f1924k == null) {
            TypedValue typedValue = new TypedValue();
            this.f1923j.getTheme().resolveAttribute(com.shungo.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f1924k = new ContextThemeWrapper(this.f1923j, i4);
            } else {
                this.f1924k = this.f1923j;
            }
        }
        return this.f1924k;
    }

    public final void S2(View view) {
        s1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.shungo.app.R.id.decor_content_parent);
        this.f1925l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.shungo.app.R.id.action_bar);
        if (callbackFindViewById instanceof s1) {
            wrapper = (s1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1927n = wrapper;
        this.f1928o = (ActionBarContextView) view.findViewById(com.shungo.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.shungo.app.R.id.action_bar_container);
        this.f1926m = actionBarContainer;
        s1 s1Var = this.f1927n;
        if (s1Var == null || this.f1928o == null || actionBarContainer == null) {
            throw new IllegalStateException(s0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((x3) s1Var).f2837a.getContext();
        this.f1923j = context;
        if ((((x3) this.f1927n).f2838b & 4) != 0) {
            this.f1930q = true;
        }
        g.a aVar = new g.a(context, 0);
        int i4 = aVar.f2207a.getApplicationInfo().targetSdkVersion;
        this.f1927n.getClass();
        U2(aVar.f2207a.getResources().getBoolean(com.shungo.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1923j.obtainStyledAttributes(null, d.a.f1654a, com.shungo.app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1925l;
            if (!actionBarOverlayLayout2.f412i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.D = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1926m;
            WeakHashMap weakHashMap = v0.f2983a;
            i0.k0.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void T2(boolean z4) {
        if (this.f1930q) {
            return;
        }
        int i4 = z4 ? 4 : 0;
        x3 x3Var = (x3) this.f1927n;
        int i5 = x3Var.f2838b;
        this.f1930q = true;
        x3Var.a((i4 & 4) | (i5 & (-5)));
    }

    public final void U2(boolean z4) {
        if (z4) {
            this.f1926m.setTabContainer(null);
            ((x3) this.f1927n).getClass();
        } else {
            ((x3) this.f1927n).getClass();
            this.f1926m.setTabContainer(null);
        }
        this.f1927n.getClass();
        ((x3) this.f1927n).f2837a.setCollapsible(false);
        this.f1925l.setHasNonEmbeddedTabs(false);
    }

    public final void V2(CharSequence charSequence) {
        x3 x3Var = (x3) this.f1927n;
        if (x3Var.f2843g) {
            return;
        }
        x3Var.f2844h = charSequence;
        if ((x3Var.f2838b & 8) != 0) {
            Toolbar toolbar = x3Var.f2837a;
            toolbar.setTitle(charSequence);
            if (x3Var.f2843g) {
                v0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void W2(boolean z4) {
        boolean z5 = this.f1939z || !this.f1938y;
        final n0 n0Var = this.G;
        View view = this.f1929p;
        if (!z5) {
            if (this.A) {
                this.A = false;
                g.n nVar = this.B;
                if (nVar != null) {
                    nVar.a();
                }
                int i4 = this.f1936w;
                q0 q0Var = this.E;
                if (i4 != 0 || (!this.C && !z4)) {
                    q0Var.a();
                    return;
                }
                this.f1926m.setAlpha(1.0f);
                this.f1926m.setTransitioning(true);
                g.n nVar2 = new g.n();
                float f5 = -this.f1926m.getHeight();
                if (z4) {
                    int[] iArr = {0, 0};
                    this.f1926m.getLocationInWindow(iArr);
                    f5 -= iArr[1];
                }
                d1 d1VarA = v0.a(this.f1926m);
                d1VarA.e(f5);
                final View view2 = (View) d1VarA.f2904a.get();
                if (view2 != null) {
                    c1.a(view2.animate(), n0Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: i0.a1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((e.s0) this.f2886a.f1896c).f1926m.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z6 = nVar2.f2272e;
                ArrayList arrayList = nVar2.f2268a;
                if (!z6) {
                    arrayList.add(d1VarA);
                }
                if (this.f1937x && view != null) {
                    d1 d1VarA2 = v0.a(view);
                    d1VarA2.e(f5);
                    if (!nVar2.f2272e) {
                        arrayList.add(d1VarA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = H;
                boolean z7 = nVar2.f2272e;
                if (!z7) {
                    nVar2.f2270c = accelerateInterpolator;
                }
                if (!z7) {
                    nVar2.f2269b = 250L;
                }
                if (!z7) {
                    nVar2.f2271d = q0Var;
                }
                this.B = nVar2;
                nVar2.b();
                return;
            }
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        g.n nVar3 = this.B;
        if (nVar3 != null) {
            nVar3.a();
        }
        this.f1926m.setVisibility(0);
        int i5 = this.f1936w;
        q0 q0Var2 = this.F;
        if (i5 == 0 && (this.C || z4)) {
            this.f1926m.setTranslationY(0.0f);
            float f6 = -this.f1926m.getHeight();
            if (z4) {
                int[] iArr2 = {0, 0};
                this.f1926m.getLocationInWindow(iArr2);
                f6 -= iArr2[1];
            }
            this.f1926m.setTranslationY(f6);
            g.n nVar4 = new g.n();
            d1 d1VarA3 = v0.a(this.f1926m);
            d1VarA3.e(0.0f);
            final View view3 = (View) d1VarA3.f2904a.get();
            if (view3 != null) {
                c1.a(view3.animate(), n0Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: i0.a1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((e.s0) this.f2886a.f1896c).f1926m.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z8 = nVar4.f2272e;
            ArrayList arrayList2 = nVar4.f2268a;
            if (!z8) {
                arrayList2.add(d1VarA3);
            }
            if (this.f1937x && view != null) {
                view.setTranslationY(f6);
                d1 d1VarA4 = v0.a(view);
                d1VarA4.e(0.0f);
                if (!nVar4.f2272e) {
                    arrayList2.add(d1VarA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = I;
            boolean z9 = nVar4.f2272e;
            if (!z9) {
                nVar4.f2270c = decelerateInterpolator;
            }
            if (!z9) {
                nVar4.f2269b = 250L;
            }
            if (!z9) {
                nVar4.f2271d = q0Var2;
            }
            this.B = nVar4;
            nVar4.b();
        } else {
            this.f1926m.setAlpha(1.0f);
            this.f1926m.setTranslationY(0.0f);
            if (this.f1937x && view != null) {
                view.setTranslationY(0.0f);
            }
            q0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1925l;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = v0.f2983a;
            i0.i0.c(actionBarOverlayLayout);
        }
    }

    public s0(Dialog dialog) {
        new ArrayList();
        this.f1935v = new ArrayList();
        this.f1936w = 0;
        int i4 = 1;
        this.f1937x = true;
        this.A = true;
        this.E = new q0(this, 0);
        this.F = new q0(this, i4);
        this.G = new n0(i4, this);
        S2(dialog.getWindow().getDecorView());
    }
}
