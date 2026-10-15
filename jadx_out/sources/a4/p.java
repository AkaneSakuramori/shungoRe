package a4;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, t tVar, int i4, List list, boolean z4) {
        super(str, true);
        this.f172e = tVar;
        this.f173f = i4;
        this.f174g = list;
    }

    @Override // w3.a
    public final long a() {
        e0 e0Var = this.f172e.f195m;
        List list = this.f174g;
        e0Var.getClass();
        c3.h.b0(list, "responseHeaders");
        try {
            this.f172e.f208z.z(this.f173f, b.f84h);
            synchronized (this.f172e) {
                this.f172e.B.remove(Integer.valueOf(this.f173f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
