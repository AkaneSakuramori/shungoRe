package y0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1 f5125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f5126e = new WeakHashMap();

    public e1(f1 f1Var) {
        this.f5125d = f1Var;
    }

    @Override // i0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        return cVar != null ? cVar.a(view, accessibilityEvent) : this.f2895a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // i0.c
    public final c.a b(View view) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        return cVar != null ? cVar.b(view) : super.b(view);
    }

    @Override // i0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // i0.c
    public final void d(View view, j0.o oVar) {
        f1 f1Var = this.f5125d;
        boolean zK = f1Var.f5133d.K();
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        if (!zK) {
            RecyclerView recyclerView = f1Var.f5133d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().S(view, oVar);
                i0.c cVar = (i0.c) this.f5126e.get(view);
                if (cVar != null) {
                    cVar.d(view, oVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // i0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // i0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        i0.c cVar = (i0.c) this.f5126e.get(viewGroup);
        return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : this.f2895a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // i0.c
    public final boolean g(View view, int i4, Bundle bundle) {
        f1 f1Var = this.f5125d;
        if (!f1Var.f5133d.K()) {
            RecyclerView recyclerView = f1Var.f5133d;
            if (recyclerView.getLayoutManager() != null) {
                i0.c cVar = (i0.c) this.f5126e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i4, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i4, bundle)) {
                    return true;
                }
                v0 v0Var = recyclerView.getLayoutManager().f5229b.f1022c;
                return false;
            }
        }
        return super.g(view, i4, bundle);
    }

    @Override // i0.c
    public final void h(View view, int i4) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        if (cVar != null) {
            cVar.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // i0.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        i0.c cVar = (i0.c) this.f5126e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
