package u2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.shungo.app.MainActivity;
import i0.h2;
import i0.q0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f4747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4748d;

    public /* synthetic */ p(KeyEvent.Callback callback, boolean z4, int i4) {
        this.f4746b = i4;
        this.f4747c = callback;
        this.f4748d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f4746b;
        h2 h2Var = null;
        boolean z4 = this.f4748d;
        KeyEvent.Callback callback = this.f4747c;
        switch (i4) {
            case 0:
                MainActivity mainActivity = (MainActivity) callback;
                int i5 = MainActivity.F;
                c3.h.b0(mainActivity, "this$0");
                mainActivity.o().evaluateJavascript("setLoading(" + z4 + ')', null);
                break;
            case 1:
                MainActivity mainActivity2 = (MainActivity) callback;
                int i6 = MainActivity.F;
                c3.h.b0(mainActivity2, "this$0");
                mainActivity2.o().evaluateJavascript("setOverlayPermission(" + z4 + ')', null);
                break;
            default:
                View view = (View) callback;
                if (z4) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        h2Var = q0.c(view);
                    } else {
                        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                            if (context instanceof Activity) {
                                Window window = ((Activity) context).getWindow();
                                if (window != null) {
                                    h2Var = new h2(window, view);
                                }
                            }
                        }
                    }
                    if (h2Var != null) {
                        h2Var.f2922a.Q();
                    }
                }
                Context context2 = view.getContext();
                Object obj = z.d.f5428a;
                ((InputMethodManager) z.c.b(context2, InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
