package y0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f5133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f5134e;

    public f1(RecyclerView recyclerView) {
        this.f5133d = recyclerView;
        e1 e1Var = this.f5134e;
        if (e1Var != null) {
            this.f5134e = e1Var;
        } else {
            this.f5134e = new e1(this);
        }
    }

    @Override // i0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f5133d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().R(accessibilityEvent);
        }
    }

    @Override // i0.c
    public final void d(View view, j0.o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f5133d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        o0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5229b;
        v0 v0Var = recyclerView2.f1022c;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f5229b.canScrollHorizontally(-1)) {
            oVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f5229b.canScrollVertically(1) || layoutManager.f5229b.canScrollHorizontally(1)) {
            oVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        a1 a1Var = recyclerView2.f1025d0;
        oVar.h(new c.a(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.H(v0Var, a1Var), layoutManager.x(v0Var, a1Var), false, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i0.c
    public final boolean g(View view, int i4, Bundle bundle) {
        int iE;
        int iC;
        if (super.g(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5133d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        o0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5229b;
        v0 v0Var = recyclerView2.f1022c;
        if (i4 == 4096) {
            iE = recyclerView2.canScrollVertically(1) ? (layoutManager.f5242o - layoutManager.E()) - layoutManager.B() : 0;
            if (layoutManager.f5229b.canScrollHorizontally(1)) {
                iC = (layoutManager.f5241n - layoutManager.C()) - layoutManager.D();
            } else {
                iC = 0;
            }
        } else if (i4 != 8192) {
            iC = 0;
            iE = 0;
        } else {
            iE = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f5242o - layoutManager.E()) - layoutManager.B()) : 0;
            if (layoutManager.f5229b.canScrollHorizontally(-1)) {
                iC = -((layoutManager.f5241n - layoutManager.C()) - layoutManager.D());
            } else {
                iC = 0;
            }
        }
        if (iE == 0 && iC == 0) {
            return false;
        }
        layoutManager.f5229b.b0(iC, iE, true);
        return true;
    }
}
