package c1;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1144h = true;

    @Override // z0.c
    public void g(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i4);
        } else if (f1144h) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f1144h = false;
            }
        }
    }
}
