package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.shungo.app.R;
import e.n0;
import i.o2;
import i.p2;
import i.s2;
import i.z1;
import i0.v0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f2391h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f2394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f2395l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f2399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f2400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2405v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f2408y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f2409z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2392i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2393j = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n0 f2396m = new n0(2, this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2397n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2398o = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2406w = false;

    public i(Context context, View view, int i4, int i5, boolean z4) {
        int i6 = 0;
        this.f2394k = new e(i6, this);
        this.f2395l = new f(i6, this);
        this.f2386c = context;
        this.f2399p = view;
        this.f2388e = i4;
        this.f2389f = i5;
        this.f2390g = z4;
        WeakHashMap weakHashMap = v0.f2983a;
        this.f2401r = i0.f0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2387d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2391h = new Handler();
    }

    @Override // h.g0
    public final boolean a() {
        ArrayList arrayList = this.f2393j;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).f2363a.A.isShowing();
    }

    @Override // h.c0
    public final void b(o oVar, boolean z4) {
        ArrayList arrayList = this.f2393j;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (oVar == ((h) arrayList.get(i4)).f2364b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((h) arrayList.get(i5)).f2364b.c(false);
        }
        h hVar = (h) arrayList.remove(i4);
        hVar.f2364b.r(this);
        boolean z5 = this.B;
        s2 s2Var = hVar.f2363a;
        if (z5) {
            o2.b(s2Var.A, null);
            s2Var.A.setAnimationStyle(0);
        }
        s2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2401r = ((h) arrayList.get(size2 - 1)).f2365c;
        } else {
            View view = this.f2399p;
            WeakHashMap weakHashMap = v0.f2983a;
            this.f2401r = i0.f0.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((h) arrayList.get(0)).f2364b.c(false);
                return;
            }
            return;
        }
        dismiss();
        b0 b0Var = this.f2408y;
        if (b0Var != null) {
            b0Var.b(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2409z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2409z.removeGlobalOnLayoutListener(this.f2394k);
            }
            this.f2409z = null;
        }
        this.f2400q.removeOnAttachStateChangeListener(this.f2395l);
        this.A.onDismiss();
    }

    @Override // h.c0
    public final void c() {
        Iterator it = this.f2393j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f2363a.f2687d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // h.g0
    public final void dismiss() {
        ArrayList arrayList = this.f2393j;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                h hVar = hVarArr[i4];
                if (hVar.f2363a.A.isShowing()) {
                    hVar.f2363a.dismiss();
                }
            }
        }
    }

    @Override // h.c0
    public final void e(b0 b0Var) {
        this.f2408y = b0Var;
    }

    @Override // h.g0
    public final z1 f() {
        ArrayList arrayList = this.f2393j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).f2363a.f2687d;
    }

    @Override // h.g0
    public final void h() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2392i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((o) it.next());
        }
        arrayList.clear();
        View view = this.f2399p;
        this.f2400q = view;
        if (view != null) {
            boolean z4 = this.f2409z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2409z = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2394k);
            }
            this.f2400q.addOnAttachStateChangeListener(this.f2395l);
        }
    }

    @Override // h.c0
    public final boolean i() {
        return false;
    }

    @Override // h.c0
    public final boolean j(i0 i0Var) {
        for (h hVar : this.f2393j) {
            if (i0Var == hVar.f2364b) {
                hVar.f2363a.f2687d.requestFocus();
                return true;
            }
        }
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        l(i0Var);
        b0 b0Var = this.f2408y;
        if (b0Var != null) {
            b0Var.k(i0Var);
        }
        return true;
    }

    @Override // h.x
    public final void l(o oVar) {
        oVar.b(this, this.f2386c);
        if (a()) {
            v(oVar);
        } else {
            this.f2392i.add(oVar);
        }
    }

    @Override // h.x
    public final void n(View view) {
        if (this.f2399p != view) {
            this.f2399p = view;
            int i4 = this.f2397n;
            WeakHashMap weakHashMap = v0.f2983a;
            this.f2398o = Gravity.getAbsoluteGravity(i4, i0.f0.d(view));
        }
    }

    @Override // h.x
    public final void o(boolean z4) {
        this.f2406w = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f2393j;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                hVar = null;
                break;
            }
            hVar = (h) arrayList.get(i4);
            if (!hVar.f2363a.A.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (hVar != null) {
            hVar.f2364b.c(false);
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
        if (this.f2397n != i4) {
            this.f2397n = i4;
            View view = this.f2399p;
            WeakHashMap weakHashMap = v0.f2983a;
            this.f2398o = Gravity.getAbsoluteGravity(i4, i0.f0.d(view));
        }
    }

    @Override // h.x
    public final void q(int i4) {
        this.f2402s = true;
        this.f2404u = i4;
    }

    @Override // h.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // h.x
    public final void s(boolean z4) {
        this.f2407x = z4;
    }

    @Override // h.x
    public final void t(int i4) {
        this.f2403t = true;
        this.f2405v = i4;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void v(o oVar) {
        h hVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i4;
        i.g0 g0Var;
        z1 z1Var;
        int[] iArr;
        Rect rect3;
        int i5;
        boolean z4;
        Method method;
        MenuItem item;
        l lVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2386c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        l lVar2 = new l(oVar, layoutInflaterFrom, this.f2390g, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2406w) {
            lVar2.f2421d = true;
        } else if (a()) {
            lVar2.f2421d = x.u(oVar);
        }
        int iM = x.m(lVar2, context, this.f2387d);
        s2 s2Var = new s2(context, null, this.f2388e, this.f2389f);
        s2Var.D = this.f2396m;
        s2Var.f2700q = this;
        s2Var.A.setOnDismissListener(this);
        s2Var.f2699p = this.f2399p;
        s2Var.f2696m = this.f2398o;
        s2Var.f2709z = true;
        s2Var.A.setFocusable(true);
        s2Var.A.setInputMethodMode(2);
        s2Var.n(lVar2);
        s2Var.r(iM);
        s2Var.f2696m = this.f2398o;
        ArrayList arrayList = this.f2393j;
        if (arrayList.size() > 0) {
            hVar = (h) arrayList.get(arrayList.size() - 1);
            o oVar2 = hVar.f2364b;
            int size = oVar2.f2431f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = oVar2.getItem(i6);
                if (item.hasSubMenu() && oVar == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                z1 z1Var2 = hVar.f2363a.f2687d;
                ListAdapter adapter = z1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    lVar = (l) headerViewListAdapter.getWrappedAdapter();
                } else {
                    lVar = (l) adapter;
                    headersCount = 0;
                }
                int count = lVar.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == lVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - z1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < z1Var2.getChildCount()) {
                    childAt = z1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i4 = Build.VERSION.SDK_INT;
                g0Var = s2Var.A;
                if (i4 <= 28) {
                    method = s2.E;
                    if (method != null) {
                        try {
                            method.invoke(g0Var, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    p2.a(g0Var, false);
                }
                o2.a(s2Var.A, null);
                z1Var = ((h) arrayList.get(arrayList.size() - 1)).f2363a.f2687d;
                iArr = new int[2];
                z1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f2400q.getWindowVisibleDisplayFrame(rect3);
                if (this.f2401r == 1) {
                    if (z1Var.getWidth() + iArr[0] + iM > rect3.right) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i5 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f2401r = i5;
                s2Var.f2699p = childAt;
                if ((this.f2398o & 5) == 5) {
                    if (!z4) {
                        iM = 0 - childAt.getWidth();
                    }
                } else if (z4) {
                    iM = childAt.getWidth();
                } else {
                    iM = 0 - iM;
                }
                s2Var.f2690g = iM;
                s2Var.f2695l = true;
                s2Var.f2694k = true;
                s2Var.l(0);
            } else {
                if (this.f2402s) {
                    s2Var.f2690g = this.f2404u;
                }
                if (this.f2403t) {
                    s2Var.l(this.f2405v);
                }
                rect = this.f2489b;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                s2Var.f2708y = rect2;
            }
            arrayList.add(new h(s2Var, oVar, this.f2401r));
            s2Var.h();
            z1 z1Var3 = s2Var.f2687d;
            z1Var3.setOnKeyListener(this);
            if (hVar == null || !this.f2407x || oVar.f2438m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) z1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(oVar.f2438m);
            z1Var3.addHeaderView(frameLayout, null, false);
            s2Var.h();
            return;
        }
        hVar = null;
        childAt = null;
        if (childAt != null) {
            i4 = Build.VERSION.SDK_INT;
            g0Var = s2Var.A;
            if (i4 <= 28) {
                method = s2.E;
                if (method != null) {
                    method.invoke(g0Var, Boolean.FALSE);
                }
            } else {
                p2.a(g0Var, false);
            }
            o2.a(s2Var.A, null);
            z1Var = ((h) arrayList.get(arrayList.size() - 1)).f2363a.f2687d;
            iArr = new int[2];
            z1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f2400q.getWindowVisibleDisplayFrame(rect3);
            if (this.f2401r == 1) {
                if (z1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f2401r = i5;
            s2Var.f2699p = childAt;
            if ((this.f2398o & 5) == 5) {
                if (!z4) {
                    iM = 0 - childAt.getWidth();
                }
            } else if (z4) {
                iM = childAt.getWidth();
            } else {
                iM = 0 - iM;
            }
            s2Var.f2690g = iM;
            s2Var.f2695l = true;
            s2Var.f2694k = true;
            s2Var.l(0);
        } else {
            if (this.f2402s) {
                s2Var.f2690g = this.f2404u;
            }
            if (this.f2403t) {
                s2Var.l(this.f2405v);
            }
            rect = this.f2489b;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            s2Var.f2708y = rect2;
        }
        arrayList.add(new h(s2Var, oVar, this.f2401r));
        s2Var.h();
        z1 z1Var4 = s2Var.f2687d;
        z1Var4.setOnKeyListener(this);
        if (hVar == null) {
        }
    }
}
