package z3;

import f4.k;
import f4.w;
import f4.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f5516d;

    public b(h hVar) {
        this.f5516d = hVar;
        this.f5514b = new k(hVar.f5532c.b());
    }

    public final void a() {
        h hVar = this.f5516d;
        int i4 = hVar.f5534e;
        if (i4 == 6) {
            return;
        }
        if (i4 != 5) {
            throw new IllegalStateException("state: " + hVar.f5534e);
        }
        k kVar = this.f5514b;
        y yVar = kVar.f2171e;
        kVar.f2171e = y.f2203d;
        yVar.a();
        yVar.b();
        hVar.f5534e = 6;
    }

    @Override // f4.w
    public final y b() {
        return this.f5514b;
    }

    @Override // f4.w
    public long f(f4.g gVar, long j4) {
        h hVar = this.f5516d;
        c3.h.b0(gVar, "sink");
        try {
            return hVar.f5532c.f(gVar, j4);
        } catch (IOException e5) {
            hVar.f5531b.k();
            a();
            throw e5;
        }
    }
}
