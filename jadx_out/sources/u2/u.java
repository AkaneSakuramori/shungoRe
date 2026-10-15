package u2;

import com.shungo.app.MainActivity;
import e.k0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MainActivity mainActivity, c3.e eVar) {
        super(eVar);
        this.f4757g = mainActivity;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new u(this.f4757g, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((u) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4756f;
        MainActivity mainActivity = this.f4757g;
        if (i4 == 0) {
            c3.h.D2(obj);
            this.f4756f = 1;
            obj = mainActivity.n(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3.h.D2(obj);
        }
        mainActivity.runOnUiThread(new k0(mainActivity, 9, (String) obj));
        return z2.f.f5511a;
    }
}
