package i0;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static int a() {
        return View.generateViewId();
    }

    public static Display b(View view) {
        return view.getDisplay();
    }

    public static int c(View view) {
        return view.getLabelFor();
    }

    public static int d(View view) {
        return view.getLayoutDirection();
    }

    public static int e(View view) {
        return view.getPaddingEnd();
    }

    public static int f(View view) {
        return view.getPaddingStart();
    }

    public static boolean g(View view) {
        return view.isPaddingRelative();
    }

    public static void h(View view, int i4) {
        view.setLabelFor(i4);
    }

    public static void i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void j(View view, int i4) {
        view.setLayoutDirection(i4);
    }

    public static void k(View view, int i4, int i5, int i6, int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }
}
