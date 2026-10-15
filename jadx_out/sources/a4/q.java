package a4;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f178h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, t tVar, int i4, Object obj, int i5) {
        super(str, true);
        this.f175e = i5;
        this.f176f = tVar;
        this.f177g = i4;
        this.f178h = obj;
    }

    @Override // w3.a
    public final long a() {
        switch (this.f175e) {
            case 0:
                e0 e0Var = this.f176f.f195m;
                b bVar = (b) this.f178h;
                e0Var.getClass();
                c3.h.b0(bVar, "errorCode");
                synchronized (this.f176f) {
                    this.f176f.B.remove(Integer.valueOf(this.f177g));
                }
                return -1L;
            case 1:
                t tVar = this.f176f;
                try {
                    int i4 = this.f177g;
                    b bVar2 = (b) this.f178h;
                    tVar.getClass();
                    c3.h.b0(bVar2, "statusCode");
                    tVar.f208z.z(i4, bVar2);
                    break;
                } catch (IOException e5) {
                    tVar.e(e5);
                }
                return -1L;
            default:
                e0 e0Var2 = this.f176f.f195m;
                List list = (List) this.f178h;
                e0Var2.getClass();
                c3.h.b0(list, "requestHeaders");
                try {
                    this.f176f.f208z.z(this.f177g, b.f84h);
                    synchronized (this.f176f) {
                        this.f176f.B.remove(Integer.valueOf(this.f177g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
