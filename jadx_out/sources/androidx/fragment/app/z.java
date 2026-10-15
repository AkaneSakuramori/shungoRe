package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f922b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f924d;

    public z(a0 a0Var, n0 n0Var) {
        this.f924d = a0Var;
        this.f923c = n0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f922b;
        Object obj = this.f924d;
        switch (i4) {
            case 0:
                n0 n0Var = this.f923c;
                q qVar = n0Var.f819c;
                n0Var.k();
                d1.f((ViewGroup) qVar.F.getParent(), ((a0) obj).f681b.C()).e();
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = i0.v0.f2983a;
                i0.i0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public z(n0 n0Var, View view) {
        this.f923c = n0Var;
        this.f924d = view;
    }
}
