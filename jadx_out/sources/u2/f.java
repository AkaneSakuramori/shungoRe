package u2;

import com.shungo.app.InjectorService;
import r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InjectorService injectorService, String str, InjectorService injectorService2, c3.e eVar) {
        super(eVar);
        this.f4714g = injectorService;
        this.f4715h = str;
        this.f4716i = injectorService2;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new f(this.f4714g, this.f4715h, this.f4716i, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((f) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4713f;
        if (i4 == 0) {
            c3.h.D2(obj);
            kotlinx.coroutines.scheduling.c cVar = x.f4129b;
            e eVar = new e(this.f4714g, this.f4715h, this.f4716i, null);
            this.f4713f = 1;
            if (c3.h.L2(cVar, eVar, this) == aVar) {
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
