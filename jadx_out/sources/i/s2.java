package i;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends m2 implements n2 {
    public static final Method E;
    public n2 D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // i.n2
    public final void i(h.o oVar, MenuItem menuItem) {
        n2 n2Var = this.D;
        if (n2Var != null) {
            n2Var.i(oVar, menuItem);
        }
    }

    @Override // i.n2
    public final void o(h.o oVar, h.q qVar) {
        n2 n2Var = this.D;
        if (n2Var != null) {
            n2Var.o(oVar, qVar);
        }
    }

    @Override // i.m2
    public final z1 q(Context context, boolean z4) {
        r2 r2Var = new r2(context, z4);
        r2Var.setHoverListener(this);
        return r2Var;
    }
}
