package i0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static c2 b(View view, c2 c2Var, Rect rect) {
        WindowInsets windowInsetsF = c2Var.f();
        if (windowInsetsF != null) {
            return c2.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return c2Var;
    }

    public static boolean c(View view, float f5, float f6, boolean z4) {
        return view.dispatchNestedFling(f5, f6, z4);
    }

    public static boolean d(View view, float f5, float f6) {
        return view.dispatchNestedPreFling(f5, f6);
    }

    public static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    public static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static c2 j(View view) {
        if (!p1.f2953d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = p1.f2950a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) p1.f2951b.get(obj);
            Rect rect2 = (Rect) p1.f2952c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            e.n0 n0Var = new e.n0(14);
            ((t1) n0Var.f1896c).e(b0.c.b(rect.left, rect.top, rect.right, rect.bottom));
            ((t1) n0Var.f1896c).g(b0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            c2 c2VarV = n0Var.v();
            c2VarV.f2902a.p(c2VarV);
            c2VarV.f2902a.d(view.getRootView());
            return c2VarV;
        } catch (IllegalAccessException e5) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f5) {
        view.setElevation(f5);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, s sVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, sVar);
        }
        if (sVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new j0(view, sVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f5) {
        view.setTranslationZ(f5);
    }

    public static void x(View view, float f5) {
        view.setZ(f5);
    }

    public static boolean y(View view, int i4) {
        return view.startNestedScroll(i4);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
