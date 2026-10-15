package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class m2 implements h.g0 {
    public static final Method B;
    public static final Method C;
    public final g0 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f2686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z1 f2687d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2691h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2695l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j2 f2698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f2699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2701r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f2706w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Rect f2708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2709z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2688e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2689f = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2692i = 1002;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2696m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2697n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f2 f2702s = new f2(this, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l2 f2703t = new l2(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k2 f2704u = new k2(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f2 f2705v = new f2(this, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f2707x = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public m2(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f2685b = context;
        this.f2706w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1668o, i4, i5);
        this.f2690g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2691h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2693j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        g0 g0Var = new g0(context, attributeSet, i4, i5);
        e.c cVar = new e.c(context, context.obtainStyledAttributes(attributeSet, d.a.f1672s, i4, i5));
        if (cVar.r(2)) {
            m0.n.c(g0Var, cVar.b(2, false));
        }
        g0Var.setBackgroundDrawable(cVar.h(0));
        cVar.v();
        this.A = g0Var;
        g0Var.setInputMethodMode(1);
    }

    @Override // h.g0
    public final boolean a() {
        return this.A.isShowing();
    }

    public final void c(int i4) {
        this.f2690g = i4;
    }

    public final int d() {
        return this.f2690g;
    }

    @Override // h.g0
    public final void dismiss() {
        g0 g0Var = this.A;
        g0Var.dismiss();
        g0Var.setContentView(null);
        this.f2687d = null;
        this.f2706w.removeCallbacks(this.f2702s);
    }

    @Override // h.g0
    public final z1 f() {
        return this.f2687d;
    }

    @Override // h.g0
    public final void h() {
        int i4;
        int iMakeMeasureSpec;
        int paddingBottom;
        z1 z1Var;
        z1 z1Var2 = this.f2687d;
        g0 g0Var = this.A;
        Context context = this.f2685b;
        if (z1Var2 == null) {
            z1 z1VarQ = q(context, !this.f2709z);
            this.f2687d = z1VarQ;
            z1VarQ.setAdapter(this.f2686c);
            this.f2687d.setOnItemClickListener(this.f2700q);
            this.f2687d.setFocusable(true);
            this.f2687d.setFocusableInTouchMode(true);
            this.f2687d.setOnItemSelectedListener(new g2(0, this));
            this.f2687d.setOnScrollListener(this.f2704u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2701r;
            if (onItemSelectedListener != null) {
                this.f2687d.setOnItemSelectedListener(onItemSelectedListener);
            }
            g0Var.setContentView(this.f2687d);
        }
        Drawable background = g0Var.getBackground();
        Rect rect = this.f2707x;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f2693j) {
                this.f2691h = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int iA = h2.a(g0Var, this.f2699p, this.f2691h, g0Var.getInputMethodMode() == 2);
        int i6 = this.f2688e;
        if (i6 == -1) {
            paddingBottom = iA + i4;
        } else {
            int i7 = this.f2689f;
            if (i7 != -2) {
                iMakeMeasureSpec = i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f2687d.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f2687d.getPaddingBottom() + this.f2687d.getPaddingTop() + i4 : 0);
        }
        boolean z4 = this.A.getInputMethodMode() == 2;
        m0.n.d(g0Var, this.f2692i);
        if (g0Var.isShowing()) {
            View view = this.f2699p;
            WeakHashMap weakHashMap = i0.v0.f2983a;
            if (i0.h0.b(view)) {
                int width = this.f2689f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2699p.getWidth();
                }
                if (i6 == -1) {
                    i6 = z4 ? paddingBottom : -1;
                    if (z4) {
                        g0Var.setWidth(this.f2689f == -1 ? -1 : 0);
                        g0Var.setHeight(0);
                    } else {
                        g0Var.setWidth(this.f2689f == -1 ? -1 : 0);
                        g0Var.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                g0Var.setOutsideTouchable(true);
                View view2 = this.f2699p;
                int i8 = this.f2690g;
                int i9 = this.f2691h;
                if (width < 0) {
                    width = -1;
                }
                g0Var.update(view2, i8, i9, width, i6 < 0 ? -1 : i6);
                return;
            }
            return;
        }
        int width2 = this.f2689f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2699p.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        g0Var.setWidth(width2);
        g0Var.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(g0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            i2.b(g0Var, true);
        }
        g0Var.setOutsideTouchable(true);
        g0Var.setTouchInterceptor(this.f2703t);
        if (this.f2695l) {
            m0.n.c(g0Var, this.f2694k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(g0Var, this.f2708y);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            i2.a(g0Var, this.f2708y);
        }
        m0.m.a(g0Var, this.f2699p, this.f2690g, this.f2691h, this.f2696m);
        this.f2687d.setSelection(-1);
        if ((!this.f2709z || this.f2687d.isInTouchMode()) && (z1Var = this.f2687d) != null) {
            z1Var.setListSelectionHidden(true);
            z1Var.requestLayout();
        }
        if (this.f2709z) {
            return;
        }
        this.f2706w.post(this.f2705v);
    }

    public final int j() {
        if (this.f2693j) {
            return this.f2691h;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    public final void l(int i4) {
        this.f2691h = i4;
        this.f2693j = true;
    }

    public final Drawable m() {
        return this.A.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        j2 j2Var = this.f2698o;
        if (j2Var == null) {
            this.f2698o = new j2(0, this);
        } else {
            ListAdapter listAdapter2 = this.f2686c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(j2Var);
            }
        }
        this.f2686c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2698o);
        }
        z1 z1Var = this.f2687d;
        if (z1Var != null) {
            z1Var.setAdapter(this.f2686c);
        }
    }

    public z1 q(Context context, boolean z4) {
        return new z1(context, z4);
    }

    public final void r(int i4) {
        Drawable background = this.A.getBackground();
        if (background == null) {
            this.f2689f = i4;
            return;
        }
        Rect rect = this.f2707x;
        background.getPadding(rect);
        this.f2689f = rect.left + rect.right + i4;
    }
}
