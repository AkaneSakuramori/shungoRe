package androidx.activity;

import androidx.fragment.app.c0;
import androidx.lifecycle.j0;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.p, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f248e;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(z zVar, j0 j0Var, c0 c0Var) {
        c3.h.b0(c0Var, "onBackPressedCallback");
        this.f248e = zVar;
        this.f245b = j0Var;
        this.f246c = c0Var;
        j0Var.a(this);
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar != androidx.lifecycle.l.ON_START) {
            if (lVar != androidx.lifecycle.l.ON_STOP) {
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                x xVar = this.f247d;
                if (xVar != null) {
                    xVar.cancel();
                    return;
                }
                return;
            }
        }
        z zVar = this.f248e;
        zVar.getClass();
        c0 c0Var = this.f246c;
        c3.h.b0(c0Var, "onBackPressedCallback");
        zVar.f338b.addLast(c0Var);
        x xVar2 = new x(zVar, c0Var);
        c0Var.f710b.add(xVar2);
        zVar.d();
        c0Var.f711c = new y(1, zVar);
        this.f247d = xVar2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f245b.b(this);
        c0 c0Var = this.f246c;
        c0Var.getClass();
        c0Var.f710b.remove(this);
        x xVar = this.f247d;
        if (xVar != null) {
            xVar.cancel();
        }
        this.f247d = null;
    }
}
