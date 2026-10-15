package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.lifecycle.d0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.InjectorService;
import com.shungo.app.R;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f255c;

    public /* synthetic */ d(int i4, Object obj) {
        this.f254b = i4;
        this.f255c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i4 = 2;
        switch (this.f254b) {
            case 0:
                ((n) this.f255c).invalidateOptionsMenu();
                return;
            case 1:
                m mVar = (m) this.f255c;
                Runnable runnable = mVar.f268c;
                if (runnable != null) {
                    runnable.run();
                    mVar.f268c = null;
                    return;
                }
                return;
            case 2:
                p.a((p) this.f255c);
                return;
            case 3:
            case 8:
            default:
                InjectorService injectorService = (InjectorService) this.f255c;
                int i5 = InjectorService.f1633o;
                c3.h.b0(injectorService, "this$0");
                WebView webView = injectorService.f1635c;
                if (webView != null) {
                    webView.loadUrl(injectorService.getString(R.string.api_url) + "/app/overlay");
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) this.f255c;
                int i6 = y.e.f5022b;
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = y.g.f5029a;
                    activity.recreate();
                    return;
                }
                Class cls2 = y.g.f5029a;
                boolean z4 = i7 == 26 || i7 == 27;
                Method method = y.g.f5034f;
                if ((!z4 || method != null) && (y.g.f5033e != null || y.g.f5032d != null)) {
                    try {
                        Object obj2 = y.g.f5031c.get(activity);
                        if (obj2 != null && (obj = y.g.f5030b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            y.f fVar = new y.f(activity);
                            application.registerActivityLifecycleCallbacks(fVar);
                            Handler handler = y.g.f5035g;
                            handler.post(new i.j(fVar, obj2, i4));
                            int i8 = 3;
                            try {
                                if (i7 == 26 || i7 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new i.j(application, fVar, i8));
                                return;
                            } catch (Throwable th) {
                                handler.post(new i.j(application, fVar, i8));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 5:
                View view = (View) this.f255c;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 6:
                d0 d0Var = (d0) this.f255c;
                d0 d0Var2 = d0.f943j;
                c3.h.b0(d0Var, "this$0");
                if (d0Var.f945c == 0) {
                    d0Var.f946d = true;
                    d0Var.f949g.e(androidx.lifecycle.l.ON_PAUSE);
                }
                if (d0Var.f944b == 0 && d0Var.f946d) {
                    d0Var.f949g.e(androidx.lifecycle.l.ON_STOP);
                    d0Var.f947e = true;
                    return;
                }
                return;
            case 7:
                ((CarouselLayoutManager) this.f255c).j0();
                return;
            case 9:
                r1.d dVar = (r1.d) this.f255c;
                dVar.f4062c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) dVar.f4064e;
                p0.e eVar = sideSheetBehavior.f1526i;
                if (eVar != null && eVar.f()) {
                    dVar.a(dVar.f4061b);
                    return;
                } else {
                    if (sideSheetBehavior.f1525h == 2) {
                        sideSheetBehavior.r(dVar.f4061b);
                        return;
                    }
                    return;
                }
            case 10:
                ((i2.d) this.f255c).t(true);
                return;
            case 11:
                i2.k kVar = (i2.k) this.f255c;
                boolean zIsPopupShowing = kVar.f3021h.isPopupShowing();
                kVar.t(zIsPopupShowing);
                kVar.f3026m = zIsPopupShowing;
                return;
            case 12:
                ((TextInputLayout) this.f255c).f1553e.requestLayout();
                return;
        }
    }
}
