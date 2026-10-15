package androidx.activity;

import androidx.fragment.app.c0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f335c;

    public x(z zVar, c0 c0Var) {
        this.f335c = zVar;
        this.f334b = c0Var;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        z zVar = this.f335c;
        a3.i iVar = zVar.f338b;
        c0 c0Var = this.f334b;
        iVar.remove(c0Var);
        if (c3.h.I(zVar.f339c, c0Var)) {
            c0Var.getClass();
            zVar.f339c = null;
        }
        c0Var.getClass();
        c0Var.f710b.remove(this);
        j3.a aVar = c0Var.f711c;
        if (aVar != null) {
            aVar.a();
        }
        c0Var.f711c = null;
    }
}
