package e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0 f1906k;

    public /* synthetic */ q0(s0 s0Var, int i4) {
        this.f1905j = i4;
        this.f1906k = s0Var;
    }

    @Override // i0.e1
    public final void a() {
        View view;
        int i4 = this.f1905j;
        s0 s0Var = this.f1906k;
        switch (i4) {
            case 0:
                if (s0Var.f1937x && (view = s0Var.f1929p) != null) {
                    view.setTranslationY(0.0f);
                    s0Var.f1926m.setTranslationY(0.0f);
                }
                s0Var.f1926m.setVisibility(8);
                s0Var.f1926m.setTransitioning(false);
                s0Var.B = null;
                g.b bVar = s0Var.f1933t;
                if (bVar != null) {
                    bVar.b(s0Var.f1932s);
                    s0Var.f1932s = null;
                    s0Var.f1933t = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = s0Var.f1925l;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    i0.i0.c(actionBarOverlayLayout);
                }
                break;
            default:
                s0Var.B = null;
                s0Var.f1926m.requestLayout();
                break;
        }
    }
}
