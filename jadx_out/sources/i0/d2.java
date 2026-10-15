package i0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window f2905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e.n0 f2906e;

    public d2(Window window, e.n0 n0Var) {
        super(9);
        this.f2905d = window;
        this.f2906e = n0Var;
    }

    @Override // f2.e
    public final void Q() {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((8 & i4) != 0) {
                if (i4 == 1) {
                    T(4);
                    this.f2905d.clearFlags(1024);
                } else if (i4 == 2) {
                    T(2);
                } else if (i4 == 8) {
                    ((f2.e) this.f2906e.f1896c).P();
                }
            }
        }
    }

    public final void T(int i4) {
        View decorView = this.f2905d.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
