package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t tVar, int i4, long j4) {
        super(str, true);
        this.f181e = tVar;
        this.f182f = i4;
        this.f183g = j4;
    }

    @Override // w3.a
    public final long a() {
        t tVar = this.f181e;
        try {
            tVar.f208z.C(this.f182f, this.f183g);
            return -1L;
        } catch (IOException e5) {
            tVar.e(e5);
            return -1L;
        }
    }
}
