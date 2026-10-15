package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f933b;

    public SavedStateHandleAttacher(l0 l0Var) {
        this.f933b = l0Var;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.t().b(this);
        l0 l0Var = this.f933b;
        if (l0Var.f963b) {
            return;
        }
        l0Var.f964c = l0Var.f962a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        l0Var.f963b = true;
    }
}
