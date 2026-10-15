package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k3.g implements j3.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f3307d = new q(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f3308e = new q(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f3309f = new q(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i4) {
        super(2);
        this.f3310c = i4;
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        switch (this.f3310c) {
            case 0:
                return obj;
            case 1:
                defpackage.a.n(obj);
                return null;
            default:
                return (r) obj;
        }
    }
}
