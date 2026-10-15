package i0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f2913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e.n0 f2914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Window f2915f;

    public g2(WindowInsetsController windowInsetsController, e.n0 n0Var) {
        super(9);
        this.f2913d = windowInsetsController;
        this.f2914e = n0Var;
    }

    @Override // f2.e
    public final void M(boolean z4) {
        Window window = this.f2915f;
        WindowInsetsController windowInsetsController = this.f2913d;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // f2.e
    public final void N(boolean z4) {
        Window window = this.f2915f;
        WindowInsetsController windowInsetsController = this.f2913d;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // f2.e
    public final void Q() {
        ((f2.e) this.f2914e.f1896c).P();
        this.f2913d.show(0);
    }
}
