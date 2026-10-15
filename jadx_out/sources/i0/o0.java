package i0;

import android.view.View;
import android.view.autofill.AutofillId;
import com.shungo.app.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static void a(View view, t0 t0Var) {
        n.k kVar = (n.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new n.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(t0Var);
        View.OnUnhandledKeyEventListener n0Var = new n0();
        kVar.put(t0Var, n0Var);
        view.addOnUnhandledKeyEventListener(n0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, t0 t0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        n.k kVar = (n.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(t0Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i4) {
        return (T) view.requireViewById(i4);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
