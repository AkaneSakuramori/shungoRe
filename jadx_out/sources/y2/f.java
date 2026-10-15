package y2;

import e.k0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements x2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f5387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f5388c;

    public /* synthetic */ f(g gVar, Executor executor, f fVar) {
        this.f5386a = gVar;
        this.f5387b = executor;
        this.f5388c = fVar;
    }

    @Override // x2.b
    public final void a(x2.d dVar) {
        g gVar = this.f5386a;
        boolean z4 = gVar.f5389r;
        Executor executor = this.f5387b;
        f fVar = this.f5388c;
        if (!z4 || dVar.e()) {
            if (gVar.f5379l instanceof e) {
                gVar.f5379l = fVar == null ? null : new ArrayList();
            }
            m mVar = (m) dVar;
            gVar.f5381n = mVar;
            mVar.f5400d.execute(new androidx.emoji2.text.n(gVar, executor, new f(gVar, executor, fVar), 3));
            return;
        }
        gVar.close();
        h hVar = h.f5391l;
        if (fVar != null) {
            if (executor == null) {
                fVar.b(hVar);
            } else {
                executor.execute(new k0(hVar, 12, fVar));
            }
        }
    }

    public final void b(c3.h hVar) {
        g gVar = this.f5386a;
        boolean z4 = gVar.f5390s;
        f fVar = this.f5388c;
        if (z4 && hVar == h.f5392m) {
            gVar.f5390s = false;
            d.b(null, new f(gVar, this.f5387b, fVar));
        } else if (fVar != null) {
            fVar.b(hVar);
        }
    }
}
