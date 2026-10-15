package u2;

import android.content.Context;
import r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f4701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c3.e eVar) {
        super(eVar);
        this.f4701g = context;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new b(this.f4701g, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((b) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4700f;
        if (i4 == 0) {
            c3.h.D2(obj);
            kotlinx.coroutines.scheduling.c cVar = x.f4129b;
            a aVar2 = new a(this.f4701g, null);
            this.f4700f = 1;
            if (c3.h.L2(cVar, aVar2, this) == aVar) {
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
