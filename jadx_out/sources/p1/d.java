package p1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3766b = 0;

    public d() {
    }

    @Override // w.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        r(coordinatorLayout, view, i4);
        if (this.f3765a == null) {
            this.f3765a = new e(view);
        }
        e eVar = this.f3765a;
        View view2 = eVar.f3767a;
        eVar.f3768b = view2.getTop();
        eVar.f3769c = view2.getLeft();
        this.f3765a.a();
        int i5 = this.f3766b;
        if (i5 == 0) {
            return true;
        }
        e eVar2 = this.f3765a;
        if (eVar2.f3770d != i5) {
            eVar2.f3770d = i5;
            eVar2.a();
        }
        this.f3766b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.q(view, i4);
    }

    public d(int i4) {
    }
}
