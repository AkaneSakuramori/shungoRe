package y;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends Activity implements androidx.lifecycle.r, i0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.t f5036b;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c3.h.G0(decorView, keyEvent)) {
            return c3.h.H0(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c3.h.G0(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // i0.l
    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = h0.f953c;
        f2.e.A(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f5036b;
        tVar.getClass();
        tVar.d("markState");
        tVar.g();
        super.onSaveInstanceState(bundle);
    }
}
