package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f4.g f170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, t tVar, int i4, f4.g gVar, int i5, boolean z4) {
        super(str, true);
        this.f168e = tVar;
        this.f169f = i4;
        this.f170g = gVar;
        this.f171h = i5;
    }

    @Override // w3.a
    public final long a() {
        try {
            e0 e0Var = this.f168e.f195m;
            f4.g gVar = this.f170g;
            int i4 = this.f171h;
            e0Var.getClass();
            c3.h.b0(gVar, "source");
            gVar.q(i4);
            this.f168e.f208z.z(this.f169f, b.f84h);
            synchronized (this.f168e) {
                this.f168e.B.remove(Integer.valueOf(this.f169f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
