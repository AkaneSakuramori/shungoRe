package u2;

import com.shungo.app.InjectorService;
import r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k3.m f4722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k3.m mVar, String str, InjectorService injectorService, c3.e eVar) {
        super(eVar);
        this.f4722g = mVar;
        this.f4723h = str;
        this.f4724i = injectorService;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new h(this.f4722g, this.f4723h, this.f4724i, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((h) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4721f;
        if (i4 == 0) {
            c3.h.D2(obj);
            kotlinx.coroutines.scheduling.c cVar = x.f4129b;
            g gVar = new g(this.f4722g, this.f4723h, this.f4724i, null);
            this.f4721f = 1;
            if (c3.h.L2(cVar, gVar, this) == aVar) {
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
