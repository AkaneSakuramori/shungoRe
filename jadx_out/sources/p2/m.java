package p2;

import java.io.IOException;
import m2.a0;
import m2.b0;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f3799b = new l(0, new m(z.f3479c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f3800a;

    public m(m2.w wVar) {
        this.f3800a = wVar;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        int iT = bVar.T();
        int iA = p.h.a(iT);
        if (iA == 5 || iA == 6) {
            return this.f3800a.a(bVar);
        }
        if (iA != 8) {
            throw new m2.r("Expecting number, got: ".concat(defpackage.a.s(iT)));
        }
        bVar.P();
        return null;
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        cVar.L((Number) obj);
    }
}
