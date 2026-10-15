package i0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.e f2922a;

    public h2(WindowInsetsController windowInsetsController) {
        this.f2922a = new g2(windowInsetsController, new e.n0(windowInsetsController));
    }

    public h2(Window window, View view) {
        e.n0 n0Var = new e.n0(view, 13);
        if (Build.VERSION.SDK_INT >= 30) {
            g2 g2Var = new g2(window.getInsetsController(), n0Var);
            g2Var.f2915f = window;
            this.f2922a = g2Var;
            return;
        }
        this.f2922a = new f2(window, n0Var);
    }
}
