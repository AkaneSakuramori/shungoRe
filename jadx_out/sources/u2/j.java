package u2;

import com.shungo.app.InjectorService;
import r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k3.m f4732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4736k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k3.m mVar, String str, String str2, String str3, InjectorService injectorService, c3.e eVar) {
        super(eVar);
        this.f4732g = mVar;
        this.f4733h = str;
        this.f4734i = str2;
        this.f4735j = str3;
        this.f4736k = injectorService;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new j(this.f4732g, this.f4733h, this.f4734i, this.f4735j, this.f4736k, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((j) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4731f;
        if (i4 == 0) {
            c3.h.D2(obj);
            kotlinx.coroutines.scheduling.c cVar = x.f4129b;
            i iVar = new i(this.f4732g, this.f4733h, this.f4734i, this.f4735j, this.f4736k, null);
            this.f4731f = 1;
            if (c3.h.L2(cVar, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3.h.D2(obj);
        }
        return z2.f.f5511a;
    }
}
