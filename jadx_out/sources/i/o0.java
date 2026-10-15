package i;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i4) {
        view.setTextAlignment(i4);
    }

    public static void d(View view, int i4) {
        view.setTextDirection(i4);
    }
}
