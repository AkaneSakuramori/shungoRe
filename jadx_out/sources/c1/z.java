package c1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends z0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1233d = true;

    public float h(View view) {
        if (f1233d) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1233d = false;
            }
        }
        return view.getAlpha();
    }

    public void i(View view, float f5) {
        if (f1233d) {
            try {
                view.setTransitionAlpha(f5);
                return;
            } catch (NoSuchMethodError unused) {
                f1233d = false;
            }
        }
        view.setAlpha(f5);
    }
}
