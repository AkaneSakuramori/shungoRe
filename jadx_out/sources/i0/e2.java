package i0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends d2 {
    @Override // f2.e
    public final void N(boolean z4) {
        if (!z4) {
            T(8192);
            return;
        }
        Window window = this.f2905d;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
