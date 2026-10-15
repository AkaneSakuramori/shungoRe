package e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, e0 e0Var) {
        Objects.requireNonNull(e0Var);
        androidx.activity.t tVar = new androidx.activity.t(1, e0Var);
        androidx.activity.o.g(obj).registerOnBackInvokedCallback(1000000, tVar);
        return tVar;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.o.g(obj).unregisterOnBackInvokedCallback(androidx.activity.o.d(obj2));
    }
}
