package u2;

import android.content.Context;
import com.shungo.app.InjectorService;
import java.io.BufferedWriter;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k3.m f4718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4720i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k3.m mVar, String str, InjectorService injectorService, c3.e eVar) {
        super(eVar);
        this.f4718g = mVar;
        this.f4719h = str;
        this.f4720i = injectorService;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new g(this.f4718g, this.f4719h, this.f4720i, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((g) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        d3.a aVar = d3.a.f1765b;
        int i4 = this.f4717f;
        if (i4 == 0) {
            c3.h.D2(obj);
            t3.u uVar = w2.d.f4898a;
            Context context = (Context) this.f4718g.f3276b;
            String str = this.f4719h;
            c3.h.a0(str, "$query");
            this.f4717f = 1;
            obj = w2.d.b(context, "/api/shungo/pokemons", str, null, this, 24);
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
        StringBuilder sb = new StringBuilder("get pokemons request: ");
        sb.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
        String string = sb.toString();
        PrintStream printStream = System.out;
        printStream.println((Object) string);
        InjectorService injectorService = this.f4720i;
        if (aVar2 == null || aVar2.f4888b != 200) {
            StringBuilder sb2 = new StringBuilder("{\"error\": true,\"code\":");
            sb2.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
            sb2.append(", \"body\": ");
            sb2.append(aVar2 != null ? aVar2.f4887a : null);
            sb2.append('}');
            String string2 = sb2.toString();
            printStream.println((Object) ("sending " + string2));
            BufferedWriter bufferedWriter = injectorService.f1636d;
            if (bufferedWriter != null) {
                bufferedWriter.write(string2);
            }
            BufferedWriter bufferedWriter2 = injectorService.f1636d;
            if (bufferedWriter2 != null) {
                bufferedWriter2.newLine();
            }
            BufferedWriter bufferedWriter3 = injectorService.f1636d;
            if (bufferedWriter3 != null) {
                bufferedWriter3.flush();
            }
        } else {
            BufferedWriter bufferedWriter4 = injectorService.f1636d;
            if (bufferedWriter4 != null) {
                bufferedWriter4.write(aVar2.f4887a);
                BufferedWriter bufferedWriter5 = injectorService.f1636d;
                if (bufferedWriter5 != null) {
                    bufferedWriter5.newLine();
                }
                BufferedWriter bufferedWriter6 = injectorService.f1636d;
                if (bufferedWriter6 != null) {
                    bufferedWriter6.flush();
                }
            }
            printStream.println((Object) "connection with server ended");
        }
        return z2.f.f5511a;
    }
}
