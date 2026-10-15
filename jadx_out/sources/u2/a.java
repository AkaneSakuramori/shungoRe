package u2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f4699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, c3.e eVar) {
        super(eVar);
        this.f4699g = context;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new a(this.f4699g, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((a) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4698f;
        if (i4 == 0) {
            c3.h.D2(obj);
            t3.u uVar = w2.d.f4898a;
            Context context = this.f4699g;
            this.f4698f = 1;
            obj = w2.d.b(context, "/api/shungo/stop", null, null, this, 28);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3.h.D2(obj);
        }
        w2.a aVar2 = (w2.a) obj;
        StringBuilder sb = new StringBuilder("stop attempt: ");
        sb.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
        System.out.println((Object) sb.toString());
        return z2.f.f5511a;
    }
}
