package i0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends e2 {
    @Override // f2.e
    public final void M(boolean z4) {
        if (!z4) {
            T(16);
            return;
        }
        Window window = this.f2905d;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
