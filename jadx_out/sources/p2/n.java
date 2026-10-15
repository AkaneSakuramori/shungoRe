package p2;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import m2.a0;
import m2.b0;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f3801c = new l(1, z.f3478b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.m f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f3803b;

    public n(m2.m mVar, a0 a0Var) {
        this.f3802a = mVar;
        this.f3803b = a0Var;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        int iA = p.h.a(bVar.T());
        if (iA == 0) {
            ArrayList arrayList = new ArrayList();
            bVar.a();
            while (bVar.G()) {
                arrayList.add(b(bVar));
            }
            bVar.x();
            return arrayList;
        }
        if (iA == 2) {
            o2.m mVar = new o2.m();
            bVar.e();
            while (bVar.G()) {
                mVar.put(bVar.N(), b(bVar));
            }
            bVar.z();
            return mVar;
        }
        if (iA == 5) {
            return bVar.R();
        }
        if (iA == 6) {
            return this.f3803b.a(bVar);
        }
        if (iA == 7) {
            return Boolean.valueOf(bVar.J());
        }
        if (iA != 8) {
            throw new IllegalStateException();
        }
        bVar.P();
        return null;
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        Class<?> cls = obj.getClass();
        m2.m mVar = this.f3802a;
        mVar.getClass();
        b0 b0VarC = mVar.c(TypeToken.get((Class) cls));
        if (!(b0VarC instanceof n)) {
            b0VarC.c(cVar, obj);
        } else {
            cVar.h();
            cVar.z();
        }
    }
}
