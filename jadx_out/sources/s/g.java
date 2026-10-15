package s;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4166m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof k) {
            this.f4158e = 2;
        } else {
            this.f4158e = 3;
        }
    }

    @Override // s.f
    public final void d(int i4) {
        if (this.f4163j) {
            return;
        }
        this.f4163j = true;
        this.f4160g = i4;
        for (d dVar : this.f4164k) {
            dVar.a(dVar);
        }
    }
}
