package y0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5132a;

    public /* synthetic */ f0(RecyclerView recyclerView) {
        this.f5132a = recyclerView;
    }

    public final void a(a aVar) {
        int i4 = aVar.f5057a;
        RecyclerView recyclerView = this.f5132a;
        if (i4 == 1) {
            recyclerView.f1042m.U(aVar.f5058b, aVar.f5060d);
            return;
        }
        if (i4 == 2) {
            recyclerView.f1042m.X(aVar.f5058b, aVar.f5060d);
        } else if (i4 == 4) {
            recyclerView.f1042m.Y(aVar.f5058b, aVar.f5060d);
        } else {
            if (i4 != 8) {
                return;
            }
            recyclerView.f1042m.W(aVar.f5058b, aVar.f5060d);
        }
    }

    public final d1 b(int i4) {
        RecyclerView recyclerView = this.f5132a;
        int iH = recyclerView.f1028f.h();
        d1 d1Var = null;
        for (int i5 = 0; i5 < iH; i5++) {
            d1 d1VarI = RecyclerView.I(recyclerView.f1028f.g(i5));
            if (d1VarI != null && !d1VarI.j() && d1VarI.f5105c == i4) {
                if (!recyclerView.f1028f.j(d1VarI.f5103a)) {
                    d1Var = d1VarI;
                    break;
                }
                d1Var = d1VarI;
            }
        }
        if (d1Var == null || recyclerView.f1028f.j(d1Var.f5103a)) {
            return null;
        }
        return d1Var;
    }

    public final void c(int i4, int i5, Object obj) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f5132a;
        int iH = recyclerView.f1028f.h();
        int i8 = i5 + i4;
        for (int i9 = 0; i9 < iH; i9++) {
            View viewG = recyclerView.f1028f.g(i9);
            d1 d1VarI = RecyclerView.I(viewG);
            if (d1VarI != null && !d1VarI.q() && (i7 = d1VarI.f5105c) >= i4 && i7 < i8) {
                d1VarI.b(2);
                d1VarI.a(obj);
                ((p0) viewG.getLayoutParams()).f5275c = true;
            }
        }
        v0 v0Var = recyclerView.f1022c;
        ArrayList arrayList = v0Var.f5316c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList.get(size);
            if (d1Var != null && (i6 = d1Var.f5105c) >= i4 && i6 < i8) {
                d1Var.b(2);
                v0Var.f(size);
            }
        }
        recyclerView.f1033h0 = true;
    }

    public final void d(int i4, int i5) {
        RecyclerView recyclerView = this.f5132a;
        int iH = recyclerView.f1028f.h();
        for (int i6 = 0; i6 < iH; i6++) {
            d1 d1VarI = RecyclerView.I(recyclerView.f1028f.g(i6));
            if (d1VarI != null && !d1VarI.q() && d1VarI.f5105c >= i4) {
                d1VarI.n(i5, false);
                recyclerView.f1025d0.f5067f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1022c.f5316c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            d1 d1Var = (d1) arrayList.get(i7);
            if (d1Var != null && d1Var.f5105c >= i4) {
                d1Var.n(i5, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1031g0 = true;
    }

    public final void e(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f5132a;
        int iH = recyclerView.f1028f.h();
        int i13 = -1;
        if (i4 < i5) {
            i7 = i4;
            i6 = i5;
            i8 = -1;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i14 = 0; i14 < iH; i14++) {
            d1 d1VarI = RecyclerView.I(recyclerView.f1028f.g(i14));
            if (d1VarI != null && (i12 = d1VarI.f5105c) >= i7 && i12 <= i6) {
                if (i12 == i4) {
                    d1VarI.n(i5 - i4, false);
                } else {
                    d1VarI.n(i8, false);
                }
                recyclerView.f1025d0.f5067f = true;
            }
        }
        v0 v0Var = recyclerView.f1022c;
        v0Var.getClass();
        if (i4 < i5) {
            i10 = i4;
            i9 = i5;
        } else {
            i9 = i4;
            i10 = i5;
            i13 = 1;
        }
        ArrayList arrayList = v0Var.f5316c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            d1 d1Var = (d1) arrayList.get(i15);
            if (d1Var != null && (i11 = d1Var.f5105c) >= i10 && i11 <= i9) {
                if (i11 == i4) {
                    d1Var.n(i5 - i4, false);
                } else {
                    d1Var.n(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1031g0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public final void f(d1 d1Var, k0 k0Var, k0 k0Var2) {
        RecyclerView recyclerView = this.f5132a;
        recyclerView.getClass();
        d1Var.p(false);
        k kVar = (k) recyclerView.I;
        if (k0Var != null) {
            kVar.getClass();
            int i4 = k0Var.f5186a;
            int i5 = k0Var2.f5186a;
            if (i4 == i5 && k0Var.f5187b == k0Var2.f5187b) {
                kVar.l(d1Var);
                d1Var.f5103a.setAlpha(0.0f);
                kVar.f5176i.add(d1Var);
            } else if (!kVar.g(d1Var, i4, k0Var.f5187b, i5, k0Var2.f5187b)) {
                return;
            }
        } else {
            kVar.l(d1Var);
            d1Var.f5103a.setAlpha(0.0f);
            kVar.f5176i.add(d1Var);
        }
        recyclerView.S();
    }

    public final void g(d1 d1Var, k0 k0Var, k0 k0Var2) {
        RecyclerView recyclerView = this.f5132a;
        recyclerView.f1022c.k(d1Var);
        recyclerView.f(d1Var);
        d1Var.p(false);
        k kVar = (k) recyclerView.I;
        kVar.getClass();
        int i4 = k0Var.f5186a;
        int i5 = k0Var.f5187b;
        View view = d1Var.f5103a;
        int left = k0Var2 == null ? view.getLeft() : k0Var2.f5186a;
        int top = k0Var2 == null ? view.getTop() : k0Var2.f5187b;
        if (d1Var.j() || (i4 == left && i5 == top)) {
            kVar.l(d1Var);
            kVar.f5175h.add(d1Var);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!kVar.g(d1Var, i4, i5, left, top)) {
                return;
            }
        }
        recyclerView.S();
    }

    public final void h(int i4) {
        RecyclerView recyclerView = this.f5132a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
