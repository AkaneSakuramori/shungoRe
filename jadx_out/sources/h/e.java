package h;

import android.view.View;
import android.view.ViewTreeObserver;
import i.n0;
import i.o0;
import i.s2;
import i.t0;
import i.w0;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2354c;

    public /* synthetic */ e(int i4, Object obj) {
        this.f2353b = i4;
        this.f2354c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i4 = this.f2353b;
        Object obj = this.f2354c;
        switch (i4) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f2393j;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f2363a.f2709z) {
                        View view = iVar.f2400q;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).f2363a.h();
                            }
                        } else {
                            iVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                h0 h0Var = (h0) obj;
                if (h0Var.a()) {
                    s2 s2Var = h0Var.f2373j;
                    if (!s2Var.f2709z) {
                        View view2 = h0Var.f2378o;
                        if (view2 != null && view2.isShown()) {
                            s2Var.h();
                        } else {
                            h0Var.dismiss();
                        }
                    }
                }
                break;
            case 2:
                w0 w0Var = (w0) obj;
                if (!w0Var.getInternalPopup().a()) {
                    w0Var.f2820g.e(o0.b(w0Var), o0.a(w0Var));
                }
                ViewTreeObserver viewTreeObserver = w0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    n0.a(viewTreeObserver, this);
                }
                break;
            default:
                t0 t0Var = (t0) obj;
                w0 w0Var2 = t0Var.H;
                WeakHashMap weakHashMap = v0.f2983a;
                if (i0.h0.b(w0Var2) && w0Var2.getGlobalVisibleRect(t0Var.F)) {
                    t0Var.s();
                    t0Var.h();
                } else {
                    t0Var.dismiss();
                }
                break;
        }
    }
}
