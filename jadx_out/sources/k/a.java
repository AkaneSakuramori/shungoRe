package k;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3230f = new HashMap();

    @Override // k.g
    public final c a(Object obj) {
        return (c) this.f3230f.get(obj);
    }

    @Override // k.g
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f3230f.remove(obj);
        return objB;
    }

    public final Object c(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f3233b;
        }
        HashMap map = this.f3230f;
        c cVar = new c(obj, obj2);
        this.f3244e++;
        c cVar2 = this.f3242c;
        if (cVar2 == null) {
            this.f3241b = cVar;
            this.f3242c = cVar;
        } else {
            cVar2.f3234c = cVar;
            cVar.f3235d = cVar2;
            this.f3242c = cVar;
        }
        map.put(obj, cVar);
        return null;
    }
}
