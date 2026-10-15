package u2;

import android.util.Log;
import android.widget.Toast;
import com.shungo.app.MainActivity;
import com.shungo.app.R;
import j1.o0;
import j1.p0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4745c;

    public /* synthetic */ o(MainActivity mainActivity, int i4) {
        this.f4744b = i4;
        this.f4745c = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f4744b;
        MainActivity mainActivity = this.f4745c;
        switch (i4) {
            case 0:
                int i5 = MainActivity.F;
                c3.h.b0(mainActivity, "this$0");
                try {
                    f1.a aVar = mainActivity.f1648y;
                    if (aVar == null) {
                        c3.h.E2("account");
                        throw null;
                    }
                    String str = p0.f3210a;
                    o0 o0Var = new o0(aVar);
                    String string = mainActivity.getString(R.string.com_auth0_scheme);
                    c3.h.a0(string, "getString(...)");
                    Locale locale = Locale.ROOT;
                    c3.h.a0(locale, "ROOT");
                    String lowerCase = string.toLowerCase(locale);
                    c3.h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!c3.h.I(string, lowerCase)) {
                        Log.w(p0.f3210a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
                    }
                    o0Var.f3206b = string;
                    o0Var.a(mainActivity, new androidx.fragment.app.k(1, mainActivity));
                    return;
                } catch (Exception e5) {
                    Log.e("Shungo", "logout failed", e5);
                    Toast.makeText(mainActivity, "Something went wrong while logging out", 0).show();
                    return;
                }
            case 1:
                int i6 = MainActivity.F;
                c3.h.b0(mainActivity, "this$0");
                mainActivity.o().loadUrl(mainActivity.getString(R.string.api_url) + "/app");
                return;
            case 2:
                int i7 = MainActivity.F;
                c3.h.b0(mainActivity, "this$0");
                mainActivity.o().evaluateJavascript("typeof onLogout === 'function' && onLogout()", null);
                return;
            case 3:
                c3.h.b0(mainActivity, "this$0");
                Toast.makeText(mainActivity, "Logout cancelled", 0).show();
                return;
            default:
                c3.h.b0(mainActivity, "this$0");
                mainActivity.o().evaluateJavascript("setLoading(false)", null);
                return;
        }
    }
}
