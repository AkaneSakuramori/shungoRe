package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.j;
import com.shungo.app.R;
import g.l;
import h.o;
import h.q;
import i.b4;
import i.c0;
import i.e0;
import i.h1;
import i.m;
import i.q3;
import i.r3;
import i.s1;
import i.s3;
import i.t3;
import i.u3;
import i.v3;
import i.w2;
import i.w3;
import i.x3;
import i.y3;
import i0.f0;
import i0.h0;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final int[] G;
    public final e.c H;
    public ArrayList I;
    public final r3 J;
    public x3 K;
    public m L;
    public t3 M;
    public boolean N;
    public OnBackInvokedCallback O;
    public OnBackInvokedDispatcher P;
    public boolean Q;
    public final j R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1 f477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0 f483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w2 f495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f500z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new l(getContext());
    }

    public static u3 h() {
        u3 u3Var = new u3(-2, -2);
        u3Var.f2795b = 0;
        u3Var.f1771a = 8388627;
        return u3Var;
    }

    public static u3 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof u3) {
            u3 u3Var = (u3) layoutParams;
            u3 u3Var2 = new u3(u3Var);
            u3Var2.f2795b = 0;
            u3Var2.f2795b = u3Var.f2795b;
            return u3Var2;
        }
        if (layoutParams instanceof e.a) {
            u3 u3Var3 = new u3((e.a) layoutParams);
            u3Var3.f2795b = 0;
            return u3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            u3 u3Var4 = new u3(layoutParams);
            u3Var4.f2795b = 0;
            return u3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        u3 u3Var5 = new u3(marginLayoutParams);
        u3Var5.f2795b = 0;
        ((ViewGroup.MarginLayoutParams) u3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) u3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) u3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) u3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return u3Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return i0.m.b(marginLayoutParams) + i0.m.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z4 = f0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, f0.d(this));
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                u3 u3Var = (u3) childAt.getLayoutParams();
                if (u3Var.f2795b == 0 && u(childAt) && j(u3Var.f1771a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            u3 u3Var2 = (u3) childAt2.getLayoutParams();
            if (u3Var2.f2795b == 0 && u(childAt2) && j(u3Var2.f1771a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z4) {
        u3 u3VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u3VarI = h();
        } else {
            u3VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (u3) layoutParams;
        }
        u3VarI.f2795b = 1;
        if (!z4 || this.f484j == null) {
            addView(view, u3VarI);
        } else {
            view.setLayoutParams(u3VarI);
            this.F.add(view);
        }
    }

    public final void c() {
        if (this.f483i == null) {
            c0 c0Var = new c0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f483i = c0Var;
            c0Var.setImageDrawable(this.f481g);
            this.f483i.setContentDescription(this.f482h);
            u3 u3VarH = h();
            u3VarH.f1771a = (this.f489o & 112) | 8388611;
            u3VarH.f2795b = 2;
            this.f483i.setLayoutParams(u3VarH);
            this.f483i.setOnClickListener(new e.b(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof u3);
    }

    public final void d() {
        if (this.f495u == null) {
            w2 w2Var = new w2();
            w2Var.f2823a = 0;
            w2Var.f2824b = 0;
            w2Var.f2825c = Integer.MIN_VALUE;
            w2Var.f2826d = Integer.MIN_VALUE;
            w2Var.f2827e = 0;
            w2Var.f2828f = 0;
            w2Var.f2829g = false;
            w2Var.f2830h = false;
            this.f495u = w2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f476b;
        if (actionMenuView.f430q == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new t3(this);
            }
            this.f476b.setExpandedActionViewsExclusive(true);
            oVar.b(this.M, this.f485k);
            v();
        }
    }

    public final void f() {
        if (this.f476b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f476b = actionMenuView;
            actionMenuView.setPopupTheme(this.f486l);
            this.f476b.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f476b;
            r3 r3Var = new r3(this);
            actionMenuView2.f435v = null;
            actionMenuView2.f436w = r3Var;
            u3 u3VarH = h();
            u3VarH.f1771a = (this.f489o & 112) | 8388613;
            this.f476b.setLayoutParams(u3VarH);
            b(this.f476b, false);
        }
    }

    public final void g() {
        if (this.f479e == null) {
            this.f479e = new c0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            u3 u3VarH = h();
            u3VarH.f1771a = (this.f489o & 112) | 8388611;
            this.f479e.setLayoutParams(u3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        c0 c0Var = this.f483i;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        c0 c0Var = this.f483i;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        w2 w2Var = this.f495u;
        if (w2Var != null) {
            return w2Var.f2829g ? w2Var.f2823a : w2Var.f2824b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f497w;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        w2 w2Var = this.f495u;
        if (w2Var != null) {
            return w2Var.f2823a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        w2 w2Var = this.f495u;
        if (w2Var != null) {
            return w2Var.f2824b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        w2 w2Var = this.f495u;
        if (w2Var != null) {
            return w2Var.f2829g ? w2Var.f2824b : w2Var.f2823a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f496v;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f476b;
        return (actionMenuView == null || (oVar = actionMenuView.f430q) == null || !oVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f497w, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = v0.f2983a;
        return f0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = v0.f2983a;
        return f0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f496v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        e0 e0Var = this.f480f;
        if (e0Var != null) {
            return e0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        e0 e0Var = this.f480f;
        if (e0Var != null) {
            return e0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f476b.getMenu();
    }

    public View getNavButtonView() {
        return this.f479e;
    }

    public CharSequence getNavigationContentDescription() {
        c0 c0Var = this.f479e;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        c0 c0Var = this.f479e;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public m getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f476b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f485k;
    }

    public int getPopupTheme() {
        return this.f486l;
    }

    public CharSequence getSubtitle() {
        return this.f500z;
    }

    public final TextView getSubtitleTextView() {
        return this.f478d;
    }

    public CharSequence getTitle() {
        return this.f499y;
    }

    public int getTitleMarginBottom() {
        return this.f494t;
    }

    public int getTitleMarginEnd() {
        return this.f492r;
    }

    public int getTitleMarginStart() {
        return this.f491q;
    }

    public int getTitleMarginTop() {
        return this.f493s;
    }

    public final TextView getTitleTextView() {
        return this.f477c;
    }

    public s1 getWrapper() {
        Drawable drawable;
        if (this.K == null) {
            x3 x3Var = new x3();
            x3Var.f2850n = 0;
            x3Var.f2837a = this;
            x3Var.f2844h = getTitle();
            x3Var.f2845i = getSubtitle();
            x3Var.f2843g = x3Var.f2844h != null;
            x3Var.f2842f = getNavigationIcon();
            e.c cVarU = e.c.u(getContext(), null, d.a.f1654a, R.attr.actionBarStyle);
            x3Var.f2851o = cVarU.h(15);
            CharSequence charSequenceQ = cVarU.q(27);
            if (!TextUtils.isEmpty(charSequenceQ)) {
                x3Var.f2843g = true;
                x3Var.f2844h = charSequenceQ;
                if ((x3Var.f2838b & 8) != 0) {
                    Toolbar toolbar = x3Var.f2837a;
                    toolbar.setTitle(charSequenceQ);
                    if (x3Var.f2843g) {
                        v0.m(toolbar.getRootView(), charSequenceQ);
                    }
                }
            }
            CharSequence charSequenceQ2 = cVarU.q(25);
            if (!TextUtils.isEmpty(charSequenceQ2)) {
                x3Var.f2845i = charSequenceQ2;
                if ((x3Var.f2838b & 8) != 0) {
                    setSubtitle(charSequenceQ2);
                }
            }
            Drawable drawableH = cVarU.h(20);
            if (drawableH != null) {
                x3Var.f2841e = drawableH;
                x3Var.c();
            }
            Drawable drawableH2 = cVarU.h(17);
            if (drawableH2 != null) {
                x3Var.f2840d = drawableH2;
                x3Var.c();
            }
            if (x3Var.f2842f == null && (drawable = x3Var.f2851o) != null) {
                x3Var.f2842f = drawable;
                int i4 = x3Var.f2838b & 4;
                Toolbar toolbar2 = x3Var.f2837a;
                if (i4 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            x3Var.a(cVarU.k(10, 0));
            int iN = cVarU.n(9, 0);
            if (iN != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(iN, (ViewGroup) this, false);
                View view = x3Var.f2839c;
                if (view != null && (x3Var.f2838b & 16) != 0) {
                    removeView(view);
                }
                x3Var.f2839c = viewInflate;
                if (viewInflate != null && (x3Var.f2838b & 16) != 0) {
                    addView(viewInflate);
                }
                x3Var.a(x3Var.f2838b | 16);
            }
            int layoutDimension = ((TypedArray) cVarU.f1780d).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int iD = cVarU.d(7, -1);
            int iD2 = cVarU.d(3, -1);
            if (iD >= 0 || iD2 >= 0) {
                int iMax = Math.max(iD, 0);
                int iMax2 = Math.max(iD2, 0);
                d();
                this.f495u.a(iMax, iMax2);
            }
            int iN2 = cVarU.n(28, 0);
            if (iN2 != 0) {
                Context context = getContext();
                this.f487m = iN2;
                h1 h1Var = this.f477c;
                if (h1Var != null) {
                    h1Var.setTextAppearance(context, iN2);
                }
            }
            int iN3 = cVarU.n(26, 0);
            if (iN3 != 0) {
                Context context2 = getContext();
                this.f488n = iN3;
                h1 h1Var2 = this.f478d;
                if (h1Var2 != null) {
                    h1Var2.setTextAppearance(context2, iN3);
                }
            }
            int iN4 = cVarU.n(22, 0);
            if (iN4 != 0) {
                setPopupTheme(iN4);
            }
            cVarU.v();
            if (R.string.abc_action_bar_up_description != x3Var.f2850n) {
                x3Var.f2850n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = x3Var.f2850n;
                    x3Var.f2846j = i5 != 0 ? getContext().getString(i5) : null;
                    x3Var.b();
                }
            }
            x3Var.f2846j = getNavigationContentDescription();
            setNavigationOnClickListener(new i.c(x3Var));
            this.K = x3Var;
        }
        return this.K;
    }

    public final int j(int i4) {
        WeakHashMap weakHashMap = v0.f2983a;
        int iD = f0.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, iD) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return iD == 1 ? 5 : 3;
    }

    public final int k(View view, int i4) {
        u3 u3Var = (u3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = u3Var.f1771a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f498x & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u3Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) u3Var).topMargin;
        if (iMax < i7) {
            iMax = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) u3Var).bottomMargin;
            if (i8 < i9) {
                iMax = Math.max(0, iMax - (i9 - i8));
            }
        }
        return paddingTop + iMax;
    }

    public void n(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public final void o() {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.H.f1780d).iterator();
        if (it2.hasNext()) {
            defpackage.a.n(it2.next());
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0281  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293 A[LOOP:0: B:104:0x0291->B:105:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02af A[LOOP:1: B:107:0x02ad->B:108:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ce A[LOOP:2: B:110:0x02cc->B:111:0x02ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x030f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0311  */
    /* JADX WARN: Code duplicated, block: B:117:0x0315  */
    /* JADX WARN: Code duplicated, block: B:120:0x031c A[LOOP:3: B:119:0x031a->B:120:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x0214  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0223  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    /* JADX WARN: Code duplicated, block: B:99:0x025c  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        h1 h1Var;
        h1 h1Var2;
        u3 u3Var;
        u3 u3Var2;
        boolean z5;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax2;
        int i16;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i20;
        int i21;
        int size2;
        int i22;
        int i23;
        int size3;
        int i24;
        int i25;
        int measuredWidth;
        int i26;
        int i27;
        int i28;
        int size4;
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z6 = f0.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i29 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = i0.e0.d(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i7 - i5) : 0;
        if (u(this.f479e)) {
            if (z6) {
                iR = r(this.f479e, i29, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.f479e, paddingLeft, iMin2, iArr);
            }
            if (u(this.f483i)) {
                if (z6) {
                    iR = r(this.f483i, iR, iMin2, iArr);
                } else {
                    iQ = q(this.f483i, iQ, iMin2, iArr);
                }
            }
            if (u(this.f476b)) {
                if (z6) {
                    iQ = q(this.f476b, iQ, iMin2, iArr);
                } else {
                    iR = r(this.f476b, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i29 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i29 - currentContentInsetRight);
            if (u(this.f484j)) {
                if (z6) {
                    iMin = r(this.f484j, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f484j, iMax, iMin2, iArr);
                }
            }
            if (u(this.f480f)) {
                if (z6) {
                    iMin = r(this.f480f, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f480f, iMax, iMin2, iArr);
                }
            }
            zU = u(this.f477c);
            zU2 = u(this.f478d);
            if (zU) {
                u3 u3Var3 = (u3) this.f477c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) u3Var3).bottomMargin + this.f477c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u3Var3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                u3 u3Var4 = (u3) this.f478d.getLayoutParams();
                measuredHeight += this.f478d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u3Var4).topMargin + ((ViewGroup.MarginLayoutParams) u3Var4).bottomMargin;
            }
            if (!zU || zU2) {
                if (zU) {
                    h1Var = this.f477c;
                } else {
                    h1Var = this.f478d;
                }
                if (zU2) {
                    h1Var2 = this.f478d;
                } else {
                    h1Var2 = this.f477c;
                }
                u3Var = (u3) h1Var.getLayoutParams();
                u3Var2 = (u3) h1Var2.getLayoutParams();
                z5 = (!zU && this.f477c.getMeasuredWidth() > 0) || (zU2 && this.f478d.getMeasuredWidth() > 0);
                i8 = this.f498x & 112;
                i9 = paddingLeft;
                if (i8 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
                } else if (i8 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i16 = ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
                    if (iMax2 < i16) {
                        iMax2 = i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) u3Var).bottomMargin;
                        i19 = this.f494t;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin) - this.f494t) - measuredHeight;
                }
                if (z6) {
                    if (z5) {
                        i13 = this.f491q;
                    } else {
                        i13 = 0;
                    }
                    int i30 = i13 - iArr[1];
                    iMin -= Math.max(0, i30);
                    iArr[1] = Math.max(0, -i30);
                    if (zU) {
                        u3 u3Var5 = (u3) this.f477c.getLayoutParams();
                        int measuredWidth2 = iMin - this.f477c.getMeasuredWidth();
                        int measuredHeight2 = this.f477c.getMeasuredHeight() + paddingTop;
                        this.f477c.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i14 = measuredWidth2 - this.f492r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) u3Var5).bottomMargin;
                    } else {
                        i14 = iMin;
                    }
                    if (zU2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                        this.f478d.layout(iMin - this.f478d.getMeasuredWidth(), i31, iMin, this.f478d.getMeasuredHeight() + i31);
                        i15 = iMin - this.f492r;
                    } else {
                        i15 = iMin;
                    }
                    if (z5) {
                        iMin = Math.min(i14, i15);
                    }
                } else {
                    if (z5) {
                        i10 = this.f491q;
                    } else {
                        i10 = 0;
                    }
                    int i32 = i10 - iArr[0];
                    iMax += Math.max(0, i32);
                    iArr[0] = Math.max(0, -i32);
                    if (zU) {
                        u3 u3Var6 = (u3) this.f477c.getLayoutParams();
                        int measuredWidth3 = this.f477c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f477c.getMeasuredHeight() + paddingTop;
                        this.f477c.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i11 = measuredWidth3 + this.f492r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) u3Var6).bottomMargin;
                    } else {
                        i11 = iMax;
                    }
                    if (zU2) {
                        int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f478d.getMeasuredWidth() + iMax;
                        this.f478d.layout(iMax, i33, measuredWidth4, this.f478d.getMeasuredHeight() + i33);
                        i12 = measuredWidth4 + this.f492r;
                    } else {
                        i12 = iMax;
                    }
                    if (z5) {
                        iMax = Math.max(i11, i12);
                    }
                }
            } else {
                i9 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.E;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i20 = 0; i20 < size; i20++) {
                iQ2 = q((View) arrayList.get(i20), iQ2, iMin2, iArr);
            }
            i21 = iMin2;
            a(5, arrayList);
            size2 = arrayList.size();
            for (i22 = 0; i22 < size2; i22++) {
                iMin = r((View) arrayList.get(i22), iMin, i21, iArr);
            }
            a(1, arrayList);
            int i34 = iArr[0];
            i23 = iArr[1];
            size3 = arrayList.size();
            i24 = i34;
            i25 = 0;
            measuredWidth = 0;
            while (i25 < size3) {
                View view = (View) arrayList.get(i25);
                u3 u3Var7 = (u3) view.getLayoutParams();
                int i35 = ((ViewGroup.MarginLayoutParams) u3Var7).leftMargin - i24;
                int i36 = ((ViewGroup.MarginLayoutParams) u3Var7).rightMargin - i23;
                int iMax3 = Math.max(0, i35);
                int iMax4 = Math.max(0, i36);
                int iMax5 = Math.max(0, -i35);
                int iMax6 = Math.max(0, -i36);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i25++;
                i23 = iMax6;
                i24 = iMax5;
            }
            i27 = ((((width - i9) - paddingRight) / 2) + i9) - (measuredWidth / 2);
            i28 = measuredWidth + i27;
            if (i27 >= iQ2) {
                if (i28 > iMin) {
                    iQ2 = i27 - (i28 - iMin);
                } else {
                    iQ2 = i27;
                }
            }
            size4 = arrayList.size();
            for (i26 = 0; i26 < size4; i26++) {
                iQ2 = q((View) arrayList.get(i26), iQ2, i21, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i29;
        if (u(this.f483i)) {
            if (z6) {
                iR = r(this.f483i, iR, iMin2, iArr);
            } else {
                iQ = q(this.f483i, iQ, iMin2, iArr);
            }
        }
        if (u(this.f476b)) {
            if (z6) {
                iQ = q(this.f476b, iQ, iMin2, iArr);
            } else {
                iR = r(this.f476b, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i29 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i29 - currentContentInsetRight2);
        if (u(this.f484j)) {
            if (z6) {
                iMin = r(this.f484j, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f484j, iMax, iMin2, iArr);
            }
        }
        if (u(this.f480f)) {
            if (z6) {
                iMin = r(this.f480f, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f480f, iMax, iMin2, iArr);
            }
        }
        zU = u(this.f477c);
        zU2 = u(this.f478d);
        if (zU) {
            u3 u3Var8 = (u3) this.f477c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) u3Var8).bottomMargin + this.f477c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u3Var8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            u3 u3Var9 = (u3) this.f478d.getLayoutParams();
            measuredHeight += this.f478d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u3Var9).topMargin + ((ViewGroup.MarginLayoutParams) u3Var9).bottomMargin;
        }
        if (zU) {
            if (zU) {
                h1Var = this.f477c;
            } else {
                h1Var = this.f478d;
            }
            if (zU2) {
                h1Var2 = this.f478d;
            } else {
                h1Var2 = this.f477c;
            }
            u3Var = (u3) h1Var.getLayoutParams();
            u3Var2 = (u3) h1Var2.getLayoutParams();
            if (zU) {
            }
            i8 = this.f498x & 112;
            i9 = paddingLeft;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) u3Var).bottomMargin;
                    i19 = this.f494t;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin) - this.f494t) - measuredHeight;
            }
            if (z6) {
                if (z5) {
                    i13 = this.f491q;
                } else {
                    i13 = 0;
                }
                int i37 = i13 - iArr[1];
                iMin -= Math.max(0, i37);
                iArr[1] = Math.max(0, -i37);
                if (zU) {
                    u3 u3Var10 = (u3) this.f477c.getLayoutParams();
                    int measuredWidth5 = iMin - this.f477c.getMeasuredWidth();
                    int measuredHeight4 = this.f477c.getMeasuredHeight() + paddingTop;
                    this.f477c.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i14 = measuredWidth5 - this.f492r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) u3Var10).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zU2) {
                    int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                    this.f478d.layout(iMin - this.f478d.getMeasuredWidth(), i38, iMin, this.f478d.getMeasuredHeight() + i38);
                    i15 = iMin - this.f492r;
                } else {
                    i15 = iMin;
                }
                if (z5) {
                    iMin = Math.min(i14, i15);
                }
            } else {
                if (z5) {
                    i10 = this.f491q;
                } else {
                    i10 = 0;
                }
                int i39 = i10 - iArr[0];
                iMax += Math.max(0, i39);
                iArr[0] = Math.max(0, -i39);
                if (zU) {
                    u3 u3Var11 = (u3) this.f477c.getLayoutParams();
                    int measuredWidth6 = this.f477c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f477c.getMeasuredHeight() + paddingTop;
                    this.f477c.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i11 = measuredWidth6 + this.f492r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) u3Var11).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zU2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f478d.getMeasuredWidth() + iMax;
                    this.f478d.layout(iMax, i310, measuredWidth7, this.f478d.getMeasuredHeight() + i310);
                    i12 = measuredWidth7 + this.f492r;
                } else {
                    i12 = iMax;
                }
                if (z5) {
                    iMax = Math.max(i11, i12);
                }
            }
        } else {
            if (zU) {
                h1Var = this.f477c;
            } else {
                h1Var = this.f478d;
            }
            if (zU2) {
                h1Var2 = this.f478d;
            } else {
                h1Var2 = this.f477c;
            }
            u3Var = (u3) h1Var.getLayoutParams();
            u3Var2 = (u3) h1Var2.getLayoutParams();
            if (zU) {
            }
            i8 = this.f498x & 112;
            i9 = paddingLeft;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) u3Var).topMargin + this.f493s;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) u3Var).bottomMargin;
                    i19 = this.f494t;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u3Var2).bottomMargin) - this.f494t) - measuredHeight;
            }
            if (z6) {
                if (z5) {
                    i13 = this.f491q;
                } else {
                    i13 = 0;
                }
                int i311 = i13 - iArr[1];
                iMin -= Math.max(0, i311);
                iArr[1] = Math.max(0, -i311);
                if (zU) {
                    u3 u3Var12 = (u3) this.f477c.getLayoutParams();
                    int measuredWidth8 = iMin - this.f477c.getMeasuredWidth();
                    int measuredHeight6 = this.f477c.getMeasuredHeight() + paddingTop;
                    this.f477c.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i14 = measuredWidth8 - this.f492r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) u3Var12).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zU2) {
                    int i312 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                    this.f478d.layout(iMin - this.f478d.getMeasuredWidth(), i312, iMin, this.f478d.getMeasuredHeight() + i312);
                    i15 = iMin - this.f492r;
                } else {
                    i15 = iMin;
                }
                if (z5) {
                    iMin = Math.min(i14, i15);
                }
            } else {
                if (z5) {
                    i10 = this.f491q;
                } else {
                    i10 = 0;
                }
                int i313 = i10 - iArr[0];
                iMax += Math.max(0, i313);
                iArr[0] = Math.max(0, -i313);
                if (zU) {
                    u3 u3Var13 = (u3) this.f477c.getLayoutParams();
                    int measuredWidth9 = this.f477c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f477c.getMeasuredHeight() + paddingTop;
                    this.f477c.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i11 = measuredWidth9 + this.f492r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) u3Var13).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zU2) {
                    int i314 = paddingTop + ((ViewGroup.MarginLayoutParams) ((u3) this.f478d.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f478d.getMeasuredWidth() + iMax;
                    this.f478d.layout(iMax, i314, measuredWidth10, this.f478d.getMeasuredHeight() + i314);
                    i12 = measuredWidth10 + this.f492r;
                } else {
                    i12 = iMax;
                }
                if (z5) {
                    iMax = Math.max(i11, i12);
                }
            }
        }
        arrayList = this.E;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i20 < size) {
            iQ2 = q((View) arrayList.get(i20), iQ2, iMin2, iArr);
        }
        i21 = iMin2;
        a(5, arrayList);
        size2 = arrayList.size();
        while (i22 < size2) {
            iMin = r((View) arrayList.get(i22), iMin, i21, iArr);
        }
        a(1, arrayList);
        int i315 = iArr[0];
        i23 = iArr[1];
        size3 = arrayList.size();
        i24 = i315;
        i25 = 0;
        measuredWidth = 0;
        while (i25 < size3) {
            View view2 = (View) arrayList.get(i25);
            u3 u3Var14 = (u3) view2.getLayoutParams();
            int i316 = ((ViewGroup.MarginLayoutParams) u3Var14).leftMargin - i24;
            int i317 = ((ViewGroup.MarginLayoutParams) u3Var14).rightMargin - i23;
            int iMax7 = Math.max(0, i316);
            int iMax8 = Math.max(0, i317);
            int iMax9 = Math.max(0, -i316);
            int iMax10 = Math.max(0, -i317);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i25++;
            i23 = iMax10;
            i24 = iMax9;
        }
        i27 = ((((width - i9) - paddingRight) / 2) + i9) - (measuredWidth / 2);
        i28 = measuredWidth + i27;
        if (i27 >= iQ2) {
            if (i28 > iMin) {
                iQ2 = i27 - (i28 - iMin);
            } else {
                iQ2 = i27;
            }
        }
        size4 = arrayList.size();
        while (i26 < size4) {
            iQ2 = q((View) arrayList.get(i26), iQ2, i21, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iM;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = b4.a(this);
        int i6 = !zA ? 1 : 0;
        int i7 = 0;
        if (u(this.f479e)) {
            t(this.f479e, i4, 0, i5, this.f490p);
            iL = l(this.f479e) + this.f479e.getMeasuredWidth();
            iMax = Math.max(0, m(this.f479e) + this.f479e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f479e.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f483i)) {
            t(this.f483i, i4, 0, i5, this.f490p);
            iL = l(this.f483i) + this.f483i.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f483i) + this.f483i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f483i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL);
        int iMax4 = Math.max(0, currentContentInsetStart - iL);
        int[] iArr = this.G;
        iArr[zA ? 1 : 0] = iMax4;
        if (u(this.f476b)) {
            t(this.f476b, i4, iMax3, i5, this.f490p);
            iL2 = l(this.f476b) + this.f476b.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f476b) + this.f476b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f476b.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = Math.max(currentContentInsetEnd, iL2) + iMax3;
        iArr[i6] = Math.max(0, currentContentInsetEnd - iL2);
        if (u(this.f484j)) {
            iMax5 += s(this.f484j, i4, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, m(this.f484j) + this.f484j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f484j.getMeasuredState());
        }
        if (u(this.f480f)) {
            iMax5 += s(this.f480f, i4, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, m(this.f480f) + this.f480f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f480f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (((u3) childAt.getLayoutParams()).f2795b == 0 && u(childAt)) {
                iMax5 += s(childAt, i4, iMax5, i5, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i9 = this.f493s + this.f494t;
        int i10 = this.f491q + this.f492r;
        if (u(this.f477c)) {
            s(this.f477c, i4, iMax5 + i10, i5, i9, iArr);
            int iL3 = l(this.f477c) + this.f477c.getMeasuredWidth();
            iM = m(this.f477c) + this.f477c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f477c.getMeasuredState());
            iMax2 = iL3;
        } else {
            iM = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f478d)) {
            iMax2 = Math.max(iMax2, s(this.f478d, i4, iMax5 + i10, i5, iM + i9, iArr));
            iM += m(this.f478d) + this.f478d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f478d.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i4, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16);
        if (!this.N) {
            i7 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i7 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof w3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w3 w3Var = (w3) parcelable;
        super.onRestoreInstanceState(w3Var.f3594b);
        ActionMenuView actionMenuView = this.f476b;
        o oVar = actionMenuView != null ? actionMenuView.f430q : null;
        int i4 = w3Var.f2831d;
        if (i4 != 0 && this.M != null && oVar != null && (menuItemFindItem = oVar.findItem(i4)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (w3Var.f2832e) {
            j jVar = this.R;
            removeCallbacks(jVar);
            post(jVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        w2 w2Var = this.f495u;
        boolean z4 = i4 == 1;
        if (z4 == w2Var.f2829g) {
            return;
        }
        w2Var.f2829g = z4;
        if (!w2Var.f2830h) {
            w2Var.f2823a = w2Var.f2827e;
            w2Var.f2824b = w2Var.f2828f;
            return;
        }
        if (z4) {
            int i5 = w2Var.f2826d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = w2Var.f2827e;
            }
            w2Var.f2823a = i5;
            int i6 = w2Var.f2825c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = w2Var.f2828f;
            }
            w2Var.f2824b = i6;
            return;
        }
        int i7 = w2Var.f2825c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = w2Var.f2827e;
        }
        w2Var.f2823a = i7;
        int i8 = w2Var.f2826d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = w2Var.f2828f;
        }
        w2Var.f2824b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar;
        q qVar;
        w3 w3Var = new w3(super.onSaveInstanceState());
        t3 t3Var = this.M;
        if (t3Var != null && (qVar = t3Var.f2780c) != null) {
            w3Var.f2831d = qVar.f2453a;
        }
        ActionMenuView actionMenuView = this.f476b;
        w3Var.f2832e = (actionMenuView == null || (mVar = actionMenuView.f434u) == null || !mVar.h()) ? false : true;
        return w3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public final int q(View view, int i4, int i5, int[] iArr) {
        u3 u3Var = (u3) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) u3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int iK = k(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u3Var).rightMargin + iMax;
    }

    public final int r(View view, int i4, int i5, int[] iArr) {
        u3 u3Var = (u3) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) u3Var).rightMargin - iArr[1];
        int iMax = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iK = k(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) u3Var).leftMargin);
    }

    public final int s(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.Q != z4) {
            this.Q = z4;
            v();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(r3.q.g(getContext(), i4));
    }

    public void setCollapsible(boolean z4) {
        this.N = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f497w) {
            this.f497w = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f496v) {
            this.f496v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(r3.q.g(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(r3.q.g(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f479e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(v3 v3Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f476b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f486l != i4) {
            this.f486l = i4;
            if (i4 == 0) {
                this.f485k = getContext();
            } else {
                this.f485k = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f494t = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f492r = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f491q = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f493s = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final void t(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = s3.a(this);
            t3 t3Var = this.M;
            boolean z4 = false;
            int i4 = 1;
            if (((t3Var == null || t3Var.f2780c == null) ? false : true) && onBackInvokedDispatcherA != null) {
                WeakHashMap weakHashMap = v0.f2983a;
                if (h0.b(this) && this.Q) {
                    z4 = true;
                }
            }
            if (z4 && this.P == null) {
                if (this.O == null) {
                    this.O = s3.b(new q3(this, i4));
                }
                s3.c(onBackInvokedDispatcherA, this.O);
                this.P = onBackInvokedDispatcherA;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.P) == null) {
                return;
            }
            s3.d(onBackInvokedDispatcher, this.O);
            this.P = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f498x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.H = new e.c(new q3(this, 0));
        this.I = new ArrayList();
        this.J = new r3(this);
        this.R = new j(3, this);
        Context context2 = getContext();
        int[] iArr = d.a.f1677x;
        e.c cVarU = e.c.u(context2, attributeSet, iArr, R.attr.toolbarStyle);
        v0.k(this, context, iArr, attributeSet, (TypedArray) cVarU.f1780d, R.attr.toolbarStyle);
        this.f487m = cVarU.n(28, 0);
        this.f488n = cVarU.n(19, 0);
        this.f498x = ((TypedArray) cVarU.f1780d).getInteger(0, 8388627);
        this.f489o = ((TypedArray) cVarU.f1780d).getInteger(2, 48);
        int iD = cVarU.d(22, 0);
        iD = cVarU.r(27) ? cVarU.d(27, iD) : iD;
        this.f494t = iD;
        this.f493s = iD;
        this.f492r = iD;
        this.f491q = iD;
        int iD2 = cVarU.d(25, -1);
        if (iD2 >= 0) {
            this.f491q = iD2;
        }
        int iD3 = cVarU.d(24, -1);
        if (iD3 >= 0) {
            this.f492r = iD3;
        }
        int iD4 = cVarU.d(26, -1);
        if (iD4 >= 0) {
            this.f493s = iD4;
        }
        int iD5 = cVarU.d(23, -1);
        if (iD5 >= 0) {
            this.f494t = iD5;
        }
        this.f490p = cVarU.e(13, -1);
        int iD6 = cVarU.d(9, Integer.MIN_VALUE);
        int iD7 = cVarU.d(5, Integer.MIN_VALUE);
        int iE = cVarU.e(7, 0);
        int iE2 = cVarU.e(8, 0);
        d();
        w2 w2Var = this.f495u;
        w2Var.f2830h = false;
        if (iE != Integer.MIN_VALUE) {
            w2Var.f2827e = iE;
            w2Var.f2823a = iE;
        }
        if (iE2 != Integer.MIN_VALUE) {
            w2Var.f2828f = iE2;
            w2Var.f2824b = iE2;
        }
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            w2Var.a(iD6, iD7);
        }
        this.f496v = cVarU.d(10, Integer.MIN_VALUE);
        this.f497w = cVarU.d(6, Integer.MIN_VALUE);
        this.f481g = cVarU.h(4);
        this.f482h = cVarU.q(3);
        CharSequence charSequenceQ = cVarU.q(21);
        if (!TextUtils.isEmpty(charSequenceQ)) {
            setTitle(charSequenceQ);
        }
        CharSequence charSequenceQ2 = cVarU.q(18);
        if (!TextUtils.isEmpty(charSequenceQ2)) {
            setSubtitle(charSequenceQ2);
        }
        this.f485k = getContext();
        setPopupTheme(cVarU.n(17, 0));
        Drawable drawableH = cVarU.h(16);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence charSequenceQ3 = cVarU.q(15);
        if (!TextUtils.isEmpty(charSequenceQ3)) {
            setNavigationContentDescription(charSequenceQ3);
        }
        Drawable drawableH2 = cVarU.h(11);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence charSequenceQ4 = cVarU.q(12);
        if (!TextUtils.isEmpty(charSequenceQ4)) {
            setLogoDescription(charSequenceQ4);
        }
        if (cVarU.r(29)) {
            setTitleTextColor(cVarU.c(29));
        }
        if (cVarU.r(20)) {
            setSubtitleTextColor(cVarU.c(20));
        }
        if (cVarU.r(14)) {
            n(cVarU.n(14, 0));
        }
        cVarU.v();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        u3 u3Var = new u3(context, attributeSet);
        u3Var.f1771a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1655b);
        u3Var.f1771a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        u3Var.f2795b = 0;
        return u3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        c0 c0Var = this.f483i;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f483i.setImageDrawable(drawable);
        } else {
            c0 c0Var = this.f483i;
            if (c0Var != null) {
                c0Var.setImageDrawable(this.f481g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f480f == null) {
                this.f480f = new e0(getContext(), null, 0);
            }
            if (!p(this.f480f)) {
                b(this.f480f, true);
            }
        } else {
            e0 e0Var = this.f480f;
            if (e0Var != null && p(e0Var)) {
                removeView(this.f480f);
                this.F.remove(this.f480f);
            }
        }
        e0 e0Var2 = this.f480f;
        if (e0Var2 != null) {
            e0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f480f == null) {
            this.f480f = new e0(getContext(), null, 0);
        }
        e0 e0Var = this.f480f;
        if (e0Var != null) {
            e0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        c0 c0Var = this.f479e;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
            y3.a(this.f479e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f479e)) {
                b(this.f479e, true);
            }
        } else {
            c0 c0Var = this.f479e;
            if (c0Var != null && p(c0Var)) {
                removeView(this.f479e);
                this.F.remove(this.f479e);
            }
        }
        c0 c0Var2 = this.f479e;
        if (c0Var2 != null) {
            c0Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            h1 h1Var = this.f478d;
            if (h1Var != null && p(h1Var)) {
                removeView(this.f478d);
                this.F.remove(this.f478d);
            }
        } else {
            if (this.f478d == null) {
                Context context = getContext();
                h1 h1Var2 = new h1(context, null);
                this.f478d = h1Var2;
                h1Var2.setSingleLine();
                this.f478d.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f488n;
                if (i4 != 0) {
                    this.f478d.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f478d.setTextColor(colorStateList);
                }
            }
            if (!p(this.f478d)) {
                b(this.f478d, true);
            }
        }
        h1 h1Var3 = this.f478d;
        if (h1Var3 != null) {
            h1Var3.setText(charSequence);
        }
        this.f500z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        h1 h1Var = this.f478d;
        if (h1Var != null) {
            h1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            h1 h1Var = this.f477c;
            if (h1Var != null && p(h1Var)) {
                removeView(this.f477c);
                this.F.remove(this.f477c);
            }
        } else {
            if (this.f477c == null) {
                Context context = getContext();
                h1 h1Var2 = new h1(context, null);
                this.f477c = h1Var2;
                h1Var2.setSingleLine();
                this.f477c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f487m;
                if (i4 != 0) {
                    this.f477c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f477c.setTextColor(colorStateList);
                }
            }
            if (!p(this.f477c)) {
                b(this.f477c, true);
            }
        }
        h1 h1Var3 = this.f477c;
        if (h1Var3 != null) {
            h1Var3.setText(charSequence);
        }
        this.f499y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        h1 h1Var = this.f477c;
        if (h1Var != null) {
            h1Var.setTextColor(colorStateList);
        }
    }
}
