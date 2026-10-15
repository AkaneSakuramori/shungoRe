package e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1943k;

    public /* synthetic */ u(int i4, Object obj) {
        this.f1942j = i4;
        this.f1943k = obj;
    }

    @Override // c3.h, i0.e1
    public final void C() {
        int i4 = this.f1942j;
        Object obj = this.f1943k;
        switch (i4) {
            case 0:
                ((s) obj).f1922c.f1836w.setVisibility(0);
                break;
            case 1:
                e0 e0Var = (e0) obj;
                e0Var.f1836w.setVisibility(0);
                if (e0Var.f1836w.getParent() instanceof View) {
                    View view = (View) e0Var.f1836w.getParent();
                    WeakHashMap weakHashMap = v0.f2983a;
                    i0.i0.c(view);
                }
                break;
        }
    }

    @Override // i0.e1
    public final void a() {
        int i4 = this.f1942j;
        Object obj = this.f1943k;
        switch (i4) {
            case 0:
                s sVar = (s) obj;
                sVar.f1922c.f1836w.setAlpha(1.0f);
                e0 e0Var = sVar.f1922c;
                e0Var.f1839z.d(null);
                e0Var.f1839z = null;
                break;
            case 1:
                e0 e0Var2 = (e0) obj;
                e0Var2.f1836w.setAlpha(1.0f);
                e0Var2.f1839z.d(null);
                e0Var2.f1839z = null;
                break;
            default:
                v vVar = (v) obj;
                vVar.f1945c.f1836w.setVisibility(8);
                e0 e0Var3 = vVar.f1945c;
                PopupWindow popupWindow = e0Var3.f1837x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (e0Var3.f1836w.getParent() instanceof View) {
                    View view = (View) e0Var3.f1836w.getParent();
                    WeakHashMap weakHashMap = v0.f2983a;
                    i0.i0.c(view);
                }
                e0Var3.f1836w.e();
                e0Var3.f1839z.d(null);
                e0Var3.f1839z = null;
                ViewGroup viewGroup = e0Var3.B;
                WeakHashMap weakHashMap2 = v0.f2983a;
                i0.i0.c(viewGroup);
                break;
        }
    }
}
