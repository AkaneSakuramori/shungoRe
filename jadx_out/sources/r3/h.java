package r3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k3.g implements j3.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f4088d = new h(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f4089e = new h(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i4) {
        super(2);
        this.f4090c = i4;
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        switch (this.f4090c) {
            case 0:
                return ((c3.k) obj).x((c3.i) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }
}
