package p2;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.n f3813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3814b;

    public p(o2.n nVar, LinkedHashMap linkedHashMap) {
        this.f3813a = nVar;
        this.f3814b = linkedHashMap;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) throws t2.d {
        if (bVar.T() == 9) {
            bVar.P();
            return null;
        }
        Object objD = this.f3813a.d();
        try {
            bVar.e();
            while (bVar.G()) {
                o oVar = (o) this.f3814b.get(bVar.N());
                if (oVar == null || !oVar.f3806c) {
                    bVar.Y();
                } else {
                    Object objB = oVar.f3809f.b(bVar);
                    if (objB != null || !oVar.f3812i) {
                        oVar.f3807d.set(objD, objB);
                    }
                }
            }
            bVar.z();
            return objD;
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (IllegalStateException e6) {
            throw new m2.r(e6);
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        cVar.h();
        try {
            for (o oVar : this.f3814b.values()) {
                boolean z4 = oVar.f3805b;
                Field field = oVar.f3807d;
                if (z4 && field.get(obj) != obj) {
                    cVar.C(oVar.f3804a);
                    Object obj2 = field.get(obj);
                    boolean z5 = oVar.f3808e;
                    b0 tVar = oVar.f3809f;
                    if (!z5) {
                        tVar = new t(oVar.f3810g, tVar, oVar.f3811h.getType());
                    }
                    tVar.c(cVar, obj2);
                }
            }
            cVar.z();
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }
}
