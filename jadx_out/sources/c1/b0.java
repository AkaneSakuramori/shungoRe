package c1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f1142g = true;

    public void l(View view, int i4, int i5, int i6, int i7) {
        if (f1142g) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f1142g = false;
            }
        }
    }
}
