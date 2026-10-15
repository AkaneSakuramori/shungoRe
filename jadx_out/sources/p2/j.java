package p2;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2.n f3793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f3794d;

    public j(k kVar, m2.m mVar, Type type, b0 b0Var, Type type2, b0 b0Var2, o2.n nVar) {
        this.f3794d = kVar;
        this.f3791a = new t(mVar, b0Var, type);
        this.f3792b = new t(mVar, b0Var2, type2);
        this.f3793c = nVar;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        int iT = bVar.T();
        if (iT == 9) {
            bVar.P();
            return null;
        }
        Map map = (Map) this.f3793c.d();
        t tVar = this.f3792b;
        t tVar2 = this.f3791a;
        if (iT == 1) {
            bVar.a();
            while (bVar.G()) {
                bVar.a();
                Object objB = tVar2.f3831b.b(bVar);
                if (map.put(objB, tVar.f3831b.b(bVar)) != null) {
                    throw new m2.r("duplicate key: " + objB);
                }
                bVar.x();
            }
            bVar.x();
        } else {
            bVar.e();
            while (bVar.G()) {
                t2.a.f4255a.getClass();
                t2.a.a(bVar);
                Object objB2 = tVar2.f3831b.b(bVar);
                if (map.put(objB2, tVar.f3831b.b(bVar)) != null) {
                    throw new m2.r("duplicate key: " + objB2);
                }
            }
            bVar.z();
        }
        return map;
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        String strD;
        Map map = (Map) obj;
        if (map == null) {
            cVar.G();
            return;
        }
        boolean z4 = this.f3794d.f3796c;
        t tVar = this.f3792b;
        if (!z4) {
            cVar.h();
            for (Map.Entry entry : map.entrySet()) {
                cVar.C(String.valueOf(entry.getKey()));
                tVar.c(cVar, entry.getValue());
            }
            cVar.z();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i4 = 0;
        boolean z5 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            t tVar2 = this.f3791a;
            tVar2.getClass();
            try {
                i iVar = new i();
                tVar2.c(iVar, key);
                ArrayList arrayList3 = iVar.f3788m;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                m2.q qVar = iVar.f3790o;
                arrayList.add(qVar);
                arrayList2.add(entry2.getValue());
                qVar.getClass();
                z5 |= (qVar instanceof m2.o) || (qVar instanceof m2.t);
            } catch (IOException e5) {
                throw new m2.r(e5);
            }
        }
        if (z5) {
            cVar.e();
            int size = arrayList.size();
            while (i4 < size) {
                cVar.e();
                c3.h.N2((m2.q) arrayList.get(i4), cVar);
                tVar.c(cVar, arrayList2.get(i4));
                cVar.x();
                i4++;
            }
            cVar.x();
            return;
        }
        cVar.h();
        int size2 = arrayList.size();
        while (i4 < size2) {
            m2.q qVar2 = (m2.q) arrayList.get(i4);
            qVar2.getClass();
            boolean z6 = qVar2 instanceof m2.u;
            if (z6) {
                if (!z6) {
                    throw new IllegalStateException("Not a JSON Primitive: " + qVar2);
                }
                m2.u uVar = (m2.u) qVar2;
                Serializable serializable = uVar.f3477b;
                if (serializable instanceof Number) {
                    strD = String.valueOf(uVar.c());
                } else if (serializable instanceof Boolean) {
                    strD = Boolean.toString(uVar.b());
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    strD = uVar.d();
                }
            } else {
                if (!(qVar2 instanceof m2.s)) {
                    throw new AssertionError();
                }
                strD = "null";
            }
            cVar.C(strD);
            tVar.c(cVar, arrayList2.get(i4));
            i4++;
        }
        cVar.z();
    }
}
