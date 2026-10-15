package i0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.shungo.app.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2932e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0.a f2933f = new t0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2934g = new DecelerateInterpolator();

    public static void e(View view) {
        r1.e eVarJ = j(view);
        if (eVarJ != null) {
            eVarJ.f4066b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z4) {
        r1.e eVarJ = j(view);
        if (eVarJ != null) {
            eVarJ.f4065a = windowInsets;
            if (!z4) {
                View view2 = eVarJ.f4066b;
                int[] iArr = eVarJ.f4069e;
                view2.getLocationOnScreen(iArr);
                z4 = true;
                eVarJ.f4067c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), windowInsets, z4);
            }
        }
    }

    public static void g(View view, c2 c2Var, List list) {
        r1.e eVarJ = j(view);
        if (eVarJ != null) {
            eVarJ.a(c2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), c2Var, list);
            }
        }
    }

    public static void h(View view, i.a0 a0Var) {
        r1.e eVarJ = j(view);
        if (eVarJ != null) {
            View view2 = eVarJ.f4066b;
            int[] iArr = eVarJ.f4069e;
            view2.getLocationOnScreen(iArr);
            int i4 = eVarJ.f4067c - iArr[1];
            eVarJ.f4068d = i4;
            view2.setTranslationY(i4);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                h(viewGroup.getChildAt(i5), a0Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static r1.e j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof j1) {
            return ((j1) tag).f2930a;
        }
        return null;
    }
}
