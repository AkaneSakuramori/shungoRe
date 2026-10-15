package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f930c;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        c3.h.b0(dVar, "defaultLifecycleObserver");
        this.f929b = dVar;
        this.f930c = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        int i4 = e.f952a[lVar.ordinal()];
        d dVar = this.f929b;
        switch (i4) {
            case 1:
                dVar.getClass();
                break;
            case 2:
                dVar.getClass();
                break;
            case 3:
                dVar.a();
                break;
            case 4:
                dVar.getClass();
                break;
            case 5:
                dVar.getClass();
                break;
            case 6:
                dVar.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f930c;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}
