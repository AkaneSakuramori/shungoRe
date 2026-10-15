package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f932c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f931b = obj;
        c cVar = c.f939c;
        Class<?> cls = obj.getClass();
        a aVar = (a) cVar.f940a.get(cls);
        this.f932c = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        HashMap map = this.f932c.f935a;
        List list = (List) map.get(lVar);
        Object obj = this.f931b;
        a.a(list, rVar, lVar, obj);
        a.a((List) map.get(l.ON_ANY), rVar, lVar, obj);
    }
}
