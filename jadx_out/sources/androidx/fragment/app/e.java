package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f735d;

    public e(c1 c1Var, c1 c1Var2, boolean z4, n.b bVar) {
        this.f733b = c1Var;
        this.f734c = c1Var2;
        this.f735d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.a(this.f733b.f715c, this.f734c.f715c, this.f735d);
    }
}
