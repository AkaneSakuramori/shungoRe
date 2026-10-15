package h;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2356c;

    public /* synthetic */ f(int i4, Object obj) {
        this.f2355b = i4;
        this.f2356c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2355b) {
            case 0:
            case 1:
                break;
            default:
                i2.n nVar = (i2.n) this.f2356c;
                int i4 = i2.n.f3034x;
                if (nVar.f3055v != null && (accessibilityManager = nVar.f3054u) != null) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    if (i0.h0.b(nVar)) {
                        j0.c.a(accessibilityManager, nVar.f3055v);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i4 = this.f2355b;
        Object obj = this.f2356c;
        switch (i4) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.f2409z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.f2409z = view.getViewTreeObserver();
                    }
                    iVar.f2409z.removeGlobalOnLayoutListener(iVar.f2394k);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                h0 h0Var = (h0) obj;
                ViewTreeObserver viewTreeObserver2 = h0Var.f2380q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h0Var.f2380q = view.getViewTreeObserver();
                    }
                    h0Var.f2380q.removeGlobalOnLayoutListener(h0Var.f2374k);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                i2.n nVar = (i2.n) obj;
                int i5 = i2.n.f3034x;
                j0.d dVar = nVar.f3055v;
                if (dVar != null && (accessibilityManager = nVar.f3054u) != null) {
                    j0.c.b(accessibilityManager, dVar);
                    break;
                }
                break;
        }
    }
}
