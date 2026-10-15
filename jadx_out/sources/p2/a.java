package p2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.auth0.android.request.internal.i f3771c = new com.auth0.android.request.internal.i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3773b;

    public a(m2.m mVar, b0 b0Var, Class cls) {
        this.f3773b = new t(mVar, b0Var, cls);
        this.f3772a = cls;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        if (bVar.T() == 9) {
            bVar.P();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.a();
        while (bVar.G()) {
            arrayList.add(this.f3773b.f3831b.b(bVar));
        }
        bVar.x();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f3772a, size);
        for (int i4 = 0; i4 < size; i4++) {
            Array.set(objNewInstance, i4, arrayList.get(i4));
        }
        return objNewInstance;
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.f3773b.c(cVar, Array.get(obj, i4));
        }
        cVar.x();
    }
}
