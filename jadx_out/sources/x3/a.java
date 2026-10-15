package x3;

import java.io.IOException;
import t3.b0;
import t3.t;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4930a = new a();

    @Override // t3.t
    public final b0 a(y3.f fVar) throws IOException {
        j jVar = fVar.f5415a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f4984p) {
                    throw new IllegalStateException("released".toString());
                }
                if (!(!jVar.f4983o)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(!jVar.f4982n)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f4978j;
        c3.h.X(fVar2);
        w wVar = jVar.f4970b;
        c3.h.b0(wVar, "client");
        try {
            e eVar = new e(jVar, jVar.f4974f, fVar2, fVar2.a(fVar.f5420f, fVar.f5421g, fVar.f5422h, wVar.f4458g, !c3.h.I((String) fVar.f5419e.f2809c, "GET")).j(wVar, fVar));
            jVar.f4981m = eVar;
            jVar.f4986r = eVar;
            synchronized (jVar) {
                jVar.f4982n = true;
                jVar.f4983o = true;
            }
            if (jVar.f4985q) {
                throw new IOException("Canceled");
            }
            return y3.f.a(fVar, 0, eVar, null, 61).b(fVar.f5419e);
        } catch (IOException e5) {
            fVar2.c(e5);
            throw new n(e5);
        } catch (n e6) {
            fVar2.c(e6.f5011c);
            throw e6;
        }
    }
}
