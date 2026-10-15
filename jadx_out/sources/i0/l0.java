package i0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static c2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c2 c2VarG = c2.g(null, rootWindowInsets);
        a2 a2Var = c2VarG.f2902a;
        a2Var.p(c2VarG);
        a2Var.d(view.getRootView());
        return c2VarG;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i4) {
        view.setScrollIndicators(i4);
    }

    public static void d(View view, int i4, int i5) {
        view.setScrollIndicators(i4, i5);
    }
}
