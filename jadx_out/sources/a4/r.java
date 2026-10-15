package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, t tVar, long j4) {
        super(str, true);
        this.f179e = tVar;
        this.f180f = j4;
    }

    @Override // w3.a
    public final long a() {
        t tVar;
        boolean z4;
        synchronized (this.f179e) {
            tVar = this.f179e;
            long j4 = tVar.f197o;
            long j5 = tVar.f196n;
            if (j4 < j5) {
                z4 = true;
            } else {
                tVar.f196n = j5 + 1;
                z4 = false;
            }
        }
        if (z4) {
            tVar.e(null);
            return -1L;
        }
        try {
            tVar.f208z.x(1, 0, false);
        } catch (IOException e5) {
            tVar.e(e5);
        }
        return this.f180f;
    }
}
