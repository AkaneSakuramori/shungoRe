package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, t tVar, int i4, int i5) {
        super(str, true);
        this.f160e = tVar;
        this.f161f = i4;
        this.f162g = i5;
    }

    @Override // w3.a
    public final long a() {
        int i4 = this.f161f;
        int i5 = this.f162g;
        t tVar = this.f160e;
        tVar.getClass();
        try {
            tVar.f208z.x(i4, i5, true);
            return -1L;
        } catch (IOException e5) {
            tVar.e(e5);
            return -1L;
        }
    }
}
