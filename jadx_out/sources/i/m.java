package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.shungo.app.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f2657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.o f2658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h.b0 f2660f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h.e0 f2663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f2664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f2665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2672r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f2674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f2675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f2676v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f2677w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2661g = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2662h = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f2673s = new SparseBooleanArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e.n0 f2678x = new e.n0(4, this);

    public m(Context context) {
        this.f2656b = context;
        this.f2659e = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(h.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.e()) {
            h.d0 d0Var = view instanceof h.d0 ? (h.d0) view : (h.d0) this.f2659e.inflate(this.f2662h, viewGroup, false);
            d0Var.c(qVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) d0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2663i);
            if (this.f2677w == null) {
                this.f2677w = new i(this);
            }
            actionMenuItemView.setPopupCallback(this.f2677w);
            actionView = (View) d0Var;
        }
        actionView.setVisibility(qVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // h.c0
    public final void b(h.o oVar, boolean z4) {
        f();
        h hVar = this.f2675u;
        if (hVar != null && hVar.b()) {
            hVar.f2346j.dismiss();
        }
        h.b0 b0Var = this.f2660f;
        if (b0Var != null) {
            b0Var.b(oVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c0
    public final void c() {
        int size;
        int i4;
        ViewGroup viewGroup = (ViewGroup) this.f2663i;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            h.o oVar = this.f2658d;
            if (oVar != null) {
                oVar.i();
                ArrayList arrayListL = this.f2658d.l();
                int size2 = arrayListL.size();
                i4 = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    h.q qVar = (h.q) arrayListL.get(i5);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i4);
                        h.q itemData = childAt instanceof h.d0 ? ((h.d0) childAt).getItemData() : null;
                        View viewA = a(qVar, childAt, viewGroup);
                        if (qVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f2663i).addView(viewA, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f2664j) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f2663i).requestLayout();
        h.o oVar2 = this.f2658d;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f2434i;
            int size3 = arrayList2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                h.r rVar = ((h.q) arrayList2.get(i6)).A;
            }
        }
        h.o oVar3 = this.f2658d;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f2435j;
        }
        if (!this.f2667m || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((h.q) arrayList.get(0)).C))) {
            l lVar = this.f2664j;
            if (lVar != null) {
                Object parent = lVar.getParent();
                Object obj = this.f2663i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2664j);
                }
            }
        } else {
            if (this.f2664j == null) {
                this.f2664j = new l(this, this.f2656b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2664j.getParent();
            if (viewGroup3 != this.f2663i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2664j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2663i;
                l lVar2 = this.f2664j;
                actionMenuView.getClass();
                o oVarL = ActionMenuView.l();
                oVarL.f2718a = true;
                actionMenuView.addView(lVar2, oVarL);
            }
        }
        ((ActionMenuView) this.f2663i).setOverflowReserved(this.f2667m);
    }

    @Override // h.c0
    public final /* bridge */ /* synthetic */ boolean d(h.q qVar) {
        return false;
    }

    @Override // h.c0
    public final void e(h.b0 b0Var) {
        this.f2660f = b0Var;
    }

    public final boolean f() {
        Object obj;
        j jVar = this.f2676v;
        if (jVar != null && (obj = this.f2663i) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.f2676v = null;
            return true;
        }
        h hVar = this.f2674t;
        if (hVar == null) {
            return false;
        }
        if (hVar.b()) {
            hVar.f2346j.dismiss();
        }
        return true;
    }

    @Override // h.c0
    public final void g(Context context, h.o oVar) {
        this.f2657c = context;
        LayoutInflater.from(context);
        this.f2658d = oVar;
        Resources resources = context.getResources();
        g.a aVar = new g.a(context, 0);
        if (!this.f2668n) {
            this.f2667m = true;
        }
        this.f2669o = aVar.f2207a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f2671q = aVar.b();
        int measuredWidth = this.f2669o;
        if (this.f2667m) {
            if (this.f2664j == null) {
                l lVar = new l(this, this.f2656b);
                this.f2664j = lVar;
                if (this.f2666l) {
                    lVar.setImageDrawable(this.f2665k);
                    this.f2665k = null;
                    this.f2666l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2664j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2664j.getMeasuredWidth();
        } else {
            this.f2664j = null;
        }
        this.f2670p = measuredWidth;
        float f5 = resources.getDisplayMetrics().density;
    }

    public final boolean h() {
        h hVar = this.f2674t;
        return hVar != null && hVar.b();
    }

    @Override // h.c0
    public final boolean i() {
        int size;
        ArrayList arrayListL;
        int i4;
        boolean z4;
        h.o oVar = this.f2658d;
        if (oVar != null) {
            arrayListL = oVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i5 = this.f2671q;
        int i6 = this.f2670p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f2663i;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z4 = true;
            if (i7 >= size) {
                break;
            }
            h.q qVar = (h.q) arrayListL.get(i7);
            int i10 = qVar.f2477y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z5 = true;
            }
            if (this.f2672r && qVar.C) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f2667m && (z5 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f2673s;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            h.q qVar2 = (h.q) arrayListL.get(i12);
            int i14 = qVar2.f2477y;
            boolean z6 = (i14 & 2) == i4 ? z4 : false;
            int i15 = qVar2.f2454b;
            if (z6) {
                View viewA = a(qVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z4);
                }
                qVar2.g(z4);
            } else {
                if ((i14 & 1) == z4) {
                    boolean z7 = sparseBooleanArray.get(i15);
                    boolean z8 = ((i11 > 0 || z7) && i6 > 0) ? z4 : false;
                    if (z8) {
                        View viewA2 = a(qVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i6 -= measuredWidth2;
                        if (i13 == 0) {
                            i13 = measuredWidth2;
                        }
                        z8 &= i6 + i13 > 0;
                    }
                    if (z8 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z7) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i12; i16++) {
                            h.q qVar3 = (h.q) arrayListL.get(i16);
                            if (qVar3.f2454b == i15) {
                                if (qVar3.f()) {
                                    i11++;
                                }
                                qVar3.g(false);
                            }
                        }
                    }
                    if (z8) {
                        i11--;
                    }
                    qVar2.g(z8);
                } else {
                    qVar2.g(false);
                }
                i12++;
                i4 = 2;
                z4 = true;
            }
            i12++;
            i4 = 2;
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c0
    public final boolean j(h.i0 i0Var) {
        boolean z4;
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        h.i0 i0Var2 = i0Var;
        while (true) {
            h.o oVar = i0Var2.f2410z;
            if (oVar == this.f2658d) {
                break;
            }
            i0Var2 = (h.i0) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f2663i;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if ((childAt instanceof h.d0) && ((h.d0) childAt).getItemData() == i0Var2.A) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        i0Var.A.getClass();
        int size = i0Var.f2431f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = i0Var.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i5++;
        }
        h hVar = new h(this, this.f2657c, i0Var, view);
        this.f2675u = hVar;
        hVar.f2344h = z4;
        h.x xVar = hVar.f2346j;
        if (xVar != null) {
            xVar.o(z4);
        }
        h hVar2 = this.f2675u;
        if (!hVar2.b()) {
            if (hVar2.f2342f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            hVar2.d(0, 0, false, false);
        }
        h.b0 b0Var = this.f2660f;
        if (b0Var != null) {
            b0Var.k(i0Var);
        }
        return true;
    }

    @Override // h.c0
    public final /* bridge */ /* synthetic */ boolean k(h.q qVar) {
        return false;
    }

    public final boolean l() {
        h.o oVar;
        if (this.f2667m && !h() && (oVar = this.f2658d) != null && this.f2663i != null && this.f2676v == null) {
            oVar.i();
            if (!oVar.f2435j.isEmpty()) {
                j jVar = new j(this, 0, new h(this, this.f2657c, this.f2658d, this.f2664j));
                this.f2676v = jVar;
                ((View) this.f2663i).post(jVar);
                return true;
            }
        }
        return false;
    }
}
