package c3;

import j3.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k3.g implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f1260d = new c(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f1261e = new c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4) {
        super(2);
        this.f1262c = i4;
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        d dVar;
        switch (this.f1262c) {
            case 0:
                String str = (String) obj;
                i iVar = (i) obj2;
                h.b0(str, "acc");
                h.b0(iVar, "element");
                if (str.length() == 0) {
                    return iVar.toString();
                }
                return str + ", " + iVar;
            default:
                k kVar = (k) obj;
                i iVar2 = (i) obj2;
                h.b0(kVar, "acc");
                h.b0(iVar2, "element");
                k kVarT = kVar.t(iVar2.getKey());
                l lVar = l.f1275b;
                if (kVarT == lVar) {
                    return iVar2;
                }
                f fVar = f.f1265b;
                g gVar = (g) kVarT.e(fVar);
                if (gVar == null) {
                    dVar = new d(iVar2, kVarT);
                } else {
                    k kVarT2 = kVarT.t(fVar);
                    if (kVarT2 == lVar) {
                        return new d(gVar, iVar2);
                    }
                    dVar = new d(gVar, new d(iVar2, kVarT2));
                }
                return dVar;
        }
    }
}
