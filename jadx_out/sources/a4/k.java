package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, t tVar, Object obj, int i4) {
        super(str, true);
        this.f157e = i4;
        this.f158f = tVar;
        this.f159g = obj;
    }

    @Override // w3.a
    public final long a() {
        switch (this.f157e) {
            case 0:
                t tVar = this.f158f;
                tVar.f185c.a(tVar, (g0) ((k3.m) this.f159g).f3276b);
                break;
            default:
                try {
                    this.f158f.f185c.b((b0) this.f159g);
                } catch (IOException e5) {
                    b4.l lVar = b4.l.f1135a;
                    b4.l lVar2 = b4.l.f1135a;
                    String str = "Http2Connection.Listener failure for " + this.f158f.f187e;
                    lVar2.getClass();
                    b4.l.i(str, 4, e5);
                    try {
                        ((b0) this.f159g).c(b.f80d, e5);
                    } catch (IOException unused) {
                    }
                }
                break;
        }
        return -1L;
    }
}
