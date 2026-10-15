package i0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 extends a2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2970h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f2971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f2972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f2973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f2974l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f2975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.c[] f2976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0.c f2977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f2978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0.c f2979g;

    public u1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var);
        this.f2977e = null;
        this.f2975c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private b0.c r(int i4, boolean z4) {
        b0.c cVarA = b0.c.f1080e;
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                cVarA = b0.c.a(cVarA, s(i5, z4));
            }
        }
        return cVarA;
    }

    private b0.c t() {
        c2 c2Var = this.f2978f;
        return c2Var != null ? c2Var.f2902a.h() : b0.c.f1080e;
    }

    private b0.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2970h) {
            v();
        }
        Method method = f2971i;
        if (method != null && f2972j != null && f2973k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2973k.get(f2974l.get(objInvoke));
                if (rect != null) {
                    return b0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f2971i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2972j = cls;
            f2973k = cls.getDeclaredField("mVisibleInsets");
            f2974l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2973k.setAccessible(true);
            f2974l.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f2970h = true;
    }

    @Override // i0.a2
    public void d(View view) {
        b0.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = b0.c.f1080e;
        }
        w(cVarU);
    }

    @Override // i0.a2
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2979g, ((u1) obj).f2979g);
        }
        return false;
    }

    @Override // i0.a2
    public b0.c f(int i4) {
        return r(i4, false);
    }

    @Override // i0.a2
    public final b0.c j() {
        if (this.f2977e == null) {
            WindowInsets windowInsets = this.f2975c;
            this.f2977e = b0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2977e;
    }

    @Override // i0.a2
    public c2 l(int i4, int i5, int i6, int i7) {
        e.n0 n0Var = new e.n0(c2.g(null, this.f2975c));
        ((t1) n0Var.f1896c).g(c2.e(j(), i4, i5, i6, i7));
        ((t1) n0Var.f1896c).e(c2.e(h(), i4, i5, i6, i7));
        return n0Var.v();
    }

    @Override // i0.a2
    public boolean n() {
        return this.f2975c.isRound();
    }

    @Override // i0.a2
    public void o(b0.c[] cVarArr) {
        this.f2976d = cVarArr;
    }

    @Override // i0.a2
    public void p(c2 c2Var) {
        this.f2978f = c2Var;
    }

    public b0.c s(int i4, boolean z4) {
        b0.c cVarH;
        int i5;
        if (i4 == 1) {
            return z4 ? b0.c.b(0, Math.max(t().f1082b, j().f1082b), 0, 0) : b0.c.b(0, j().f1082b, 0, 0);
        }
        if (i4 == 2) {
            if (z4) {
                b0.c cVarT = t();
                b0.c cVarH2 = h();
                return b0.c.b(Math.max(cVarT.f1081a, cVarH2.f1081a), 0, Math.max(cVarT.f1083c, cVarH2.f1083c), Math.max(cVarT.f1084d, cVarH2.f1084d));
            }
            b0.c cVarJ = j();
            c2 c2Var = this.f2978f;
            cVarH = c2Var != null ? c2Var.f2902a.h() : null;
            int iMin = cVarJ.f1084d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f1084d);
            }
            return b0.c.b(cVarJ.f1081a, 0, cVarJ.f1083c, iMin);
        }
        b0.c cVar = b0.c.f1080e;
        if (i4 == 8) {
            b0.c[] cVarArr = this.f2976d;
            cVarH = cVarArr != null ? cVarArr[c3.h.j1(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            b0.c cVarJ2 = j();
            b0.c cVarT2 = t();
            int i6 = cVarJ2.f1084d;
            if (i6 > cVarT2.f1084d) {
                return b0.c.b(0, 0, 0, i6);
            }
            b0.c cVar2 = this.f2979g;
            return (cVar2 == null || cVar2.equals(cVar) || (i5 = this.f2979g.f1084d) <= cVarT2.f1084d) ? cVar : b0.c.b(0, 0, 0, i5);
        }
        if (i4 == 16) {
            return i();
        }
        if (i4 == 32) {
            return g();
        }
        if (i4 == 64) {
            return k();
        }
        if (i4 != 128) {
            return cVar;
        }
        c2 c2Var2 = this.f2978f;
        j jVarE = c2Var2 != null ? c2Var2.f2902a.e() : e();
        if (jVarE == null) {
            return cVar;
        }
        int i7 = Build.VERSION.SDK_INT;
        DisplayCutout displayCutout = jVarE.f2926a;
        return b0.c.b(i7 >= 28 ? i.d(displayCutout) : 0, i7 >= 28 ? i.f(displayCutout) : 0, i7 >= 28 ? i.e(displayCutout) : 0, i7 >= 28 ? i.c(displayCutout) : 0);
    }

    public void w(b0.c cVar) {
        this.f2979g = cVar;
    }
}
