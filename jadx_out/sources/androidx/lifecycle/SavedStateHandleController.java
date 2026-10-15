package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f934b;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f934b = false;
            rVar.t().b(this);
        }
    }
}
