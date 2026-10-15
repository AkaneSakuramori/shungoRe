package y0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f5099b = new g1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f5100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f5101d;

    public static int b(View view, b0 b0Var) {
        return ((b0Var.c(view) / 2) + b0Var.d(view)) - ((b0Var.g() / 2) + b0Var.f());
    }

    public static View c(o0 o0Var, b0 b0Var) {
        int iV = o0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iG = (b0Var.g() / 2) + b0Var.f();
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = o0Var.u(i5);
            int iAbs = Math.abs(((b0Var.c(viewU) / 2) + b0Var.d(viewU)) - iG);
            if (iAbs < i4) {
                view = viewU;
                i4 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(o0 o0Var, View view) {
        int[] iArr = new int[2];
        if (o0Var.d()) {
            iArr[0] = b(view, d(o0Var));
        } else {
            iArr[0] = 0;
        }
        if (o0Var.e()) {
            iArr[1] = b(view, e(o0Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final b0 d(o0 o0Var) {
        a0 a0Var = this.f5101d;
        if (a0Var == null || a0Var.f5081a != o0Var) {
            this.f5101d = new a0(o0Var, 0);
        }
        return this.f5101d;
    }

    public final b0 e(o0 o0Var) {
        a0 a0Var = this.f5100c;
        if (a0Var == null || a0Var.f5081a != o0Var) {
            this.f5100c = new a0(o0Var, 1);
        }
        return this.f5100c;
    }

    public final void f() {
        o0 layoutManager;
        View viewC;
        RecyclerView recyclerView = this.f5098a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.e()) {
            viewC = c(layoutManager, e(layoutManager));
        } else {
            viewC = layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        }
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i4 = iArrA[0];
        if (i4 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f5098a.b0(i4, iArrA[1], false);
    }
}
