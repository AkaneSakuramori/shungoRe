package r3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k3.g implements j3.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f4093d = new i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4094e = new i(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i4) {
        super(1);
        this.f4095c = i4;
    }

    @Override // j3.l
    public final Object e(Object obj) {
        switch (this.f4095c) {
            case 0:
                c3.i iVar = (c3.i) obj;
                if (iVar instanceof k) {
                    return (k) iVar;
                }
                return null;
            default:
                c3.i iVar2 = (c3.i) obj;
                if (iVar2 instanceof d0) {
                    return (d0) iVar2;
                }
                return null;
        }
    }
}
