package y0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f5202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f5203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5207f;

    public static void b(d1 d1Var) {
        RecyclerView recyclerView;
        int i4 = d1Var.f5112j;
        if (d1Var.h() || (i4 & 4) != 0 || (recyclerView = d1Var.f5120r) == null) {
            return;
        }
        recyclerView.F(d1Var);
    }

    public abstract boolean a(d1 d1Var, d1 d1Var2, k0 k0Var, k0 k0Var2);

    public final void c(d1 d1Var) {
        f0 f0Var = this.f5202a;
        if (f0Var != null) {
            boolean z4 = true;
            d1Var.p(true);
            if (d1Var.f5110h != null && d1Var.f5111i == null) {
                d1Var.f5110h = null;
            }
            d1Var.f5111i = null;
            if ((d1Var.f5112j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = f0Var.f5132a;
            recyclerView.c0();
            d dVar = recyclerView.f1028f;
            f0 f0Var2 = dVar.f5095a;
            RecyclerView recyclerView2 = f0Var2.f5132a;
            View view = d1Var.f5103a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                dVar.k(view);
            } else {
                c cVar = dVar.f5096b;
                if (cVar.d(iIndexOfChild)) {
                    cVar.f(iIndexOfChild);
                    dVar.k(view);
                    f0Var2.h(iIndexOfChild);
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                d1 d1VarI = RecyclerView.I(view);
                v0 v0Var = recyclerView.f1022c;
                v0Var.k(d1VarI);
                v0Var.h(d1VarI);
            }
            recyclerView.d0(!z4);
            if (z4 || !d1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(d1 d1Var);

    public abstract void e();

    public abstract boolean f();
}
