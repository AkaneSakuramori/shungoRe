package y0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f5095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5096b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5097c = new ArrayList();

    public d(f0 f0Var) {
        this.f5095a = f0Var;
    }

    public final void a(View view, int i4, boolean z4) {
        f0 f0Var = this.f5095a;
        int childCount = i4 < 0 ? f0Var.f5132a.getChildCount() : f(i4);
        this.f5096b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        f0Var.f5132a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public final void b(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        f0 f0Var = this.f5095a;
        int childCount = i4 < 0 ? f0Var.f5132a.getChildCount() : f(i4);
        this.f5096b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        f0Var.getClass();
        d1 d1VarI = RecyclerView.I(view);
        RecyclerView recyclerView = f0Var.f5132a;
        if (d1VarI != null) {
            if (!d1VarI.l() && !d1VarI.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + d1VarI + recyclerView.y());
            }
            d1VarI.f5112j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i4) {
        d1 d1VarI;
        int iF = f(i4);
        this.f5096b.f(iF);
        RecyclerView recyclerView = this.f5095a.f5132a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (d1VarI = RecyclerView.I(childAt)) != null) {
            if (d1VarI.l() && !d1VarI.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + d1VarI + recyclerView.y());
            }
            d1VarI.b(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i4) {
        return this.f5095a.f5132a.getChildAt(f(i4));
    }

    public final int e() {
        return this.f5095a.f5132a.getChildCount() - this.f5097c.size();
    }

    public final int f(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int childCount = this.f5095a.f5132a.getChildCount();
        int i5 = i4;
        while (i5 < childCount) {
            c cVar = this.f5096b;
            int iB = i4 - (i5 - cVar.b(i5));
            if (iB == 0) {
                while (cVar.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += iB;
        }
        return -1;
    }

    public final View g(int i4) {
        return this.f5095a.f5132a.getChildAt(i4);
    }

    public final int h() {
        return this.f5095a.f5132a.getChildCount();
    }

    public final void i(View view) {
        this.f5097c.add(view);
        f0 f0Var = this.f5095a;
        f0Var.getClass();
        d1 d1VarI = RecyclerView.I(view);
        if (d1VarI != null) {
            int i4 = d1VarI.f5119q;
            View view2 = d1VarI.f5103a;
            if (i4 != -1) {
                d1VarI.f5118p = i4;
            } else {
                WeakHashMap weakHashMap = i0.v0.f2983a;
                d1VarI.f5118p = i0.e0.c(view2);
            }
            RecyclerView recyclerView = f0Var.f5132a;
            if (recyclerView.L()) {
                d1VarI.f5119q = 4;
                recyclerView.f1051q0.add(d1VarI);
            } else {
                WeakHashMap weakHashMap2 = i0.v0.f2983a;
                i0.e0.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.f5097c.contains(view);
    }

    public final void k(View view) {
        if (this.f5097c.remove(view)) {
            f0 f0Var = this.f5095a;
            f0Var.getClass();
            d1 d1VarI = RecyclerView.I(view);
            if (d1VarI != null) {
                int i4 = d1VarI.f5118p;
                RecyclerView recyclerView = f0Var.f5132a;
                if (recyclerView.L()) {
                    d1VarI.f5119q = i4;
                    recyclerView.f1051q0.add(d1VarI);
                } else {
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    i0.e0.s(d1VarI.f5103a, i4);
                }
                d1VarI.f5118p = 0;
            }
        }
    }

    public final String toString() {
        return this.f5096b.toString() + ", hidden list:" + this.f5097c.size();
    }
}
