package u2;

import android.util.Log;
import com.shungo.app.InjectorService;
import java.io.BufferedWriter;

/* JADX INFO: loaded from: classes.dex */
public final class e extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4712i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InjectorService injectorService, String str, InjectorService injectorService2, c3.e eVar) {
        super(eVar);
        this.f4710g = injectorService;
        this.f4711h = str;
        this.f4712i = injectorService2;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new e(this.f4710g, this.f4711h, this.f4712i, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((e) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4709f;
        if (i4 == 0) {
            c3.h.D2(obj);
            t3.u uVar = w2.d.f4898a;
            InjectorService injectorService = this.f4710g;
            String str = this.f4711h;
            this.f4709f = 1;
            obj = w2.d.b(injectorService, "/api/shungo/catched", "", str, this, 16);
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
        StringBuilder sb = new StringBuilder("catch ");
        sb.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
        Log.i("Shungo", sb.toString());
        InjectorService injectorService2 = this.f4712i;
        BufferedWriter bufferedWriter = injectorService2.f1636d;
        if (bufferedWriter != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
            sb2.append('}');
            bufferedWriter.write(sb2.toString());
        }
        BufferedWriter bufferedWriter2 = injectorService2.f1636d;
        if (bufferedWriter2 != null) {
            bufferedWriter2.newLine();
        }
        BufferedWriter bufferedWriter3 = injectorService2.f1636d;
        if (bufferedWriter3 != null) {
            bufferedWriter3.flush();
        }
        return z2.f.f5511a;
    }
}
