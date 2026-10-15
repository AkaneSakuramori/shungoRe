package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f703d;

    public /* synthetic */ b1(d1 d1Var, c1 c1Var, int i4) {
        this.f701b = i4;
        this.f703d = d1Var;
        this.f702c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f701b;
        c1 c1Var = this.f702c;
        d1 d1Var = this.f703d;
        switch (i4) {
            case 0:
                if (d1Var.f729b.contains(c1Var)) {
                    defpackage.a.a(c1Var.f713a, c1Var.f715c.F);
                }
                break;
            default:
                d1Var.f729b.remove(c1Var);
                d1Var.f730c.remove(c1Var);
                break;
        }
    }
}
