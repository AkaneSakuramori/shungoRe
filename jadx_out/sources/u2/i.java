package u2;

import android.content.Context;
import com.shungo.app.InjectorService;
import java.io.BufferedWriter;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e3.g implements j3.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k3.m f4726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4730k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k3.m mVar, String str, String str2, String str3, InjectorService injectorService, c3.e eVar) {
        super(eVar);
        this.f4726g = mVar;
        this.f4727h = str;
        this.f4728i = str2;
        this.f4729j = str3;
        this.f4730k = injectorService;
    }

    @Override // e3.a
    public final c3.e a(c3.e eVar) {
        return new i(this.f4726g, this.f4727h, this.f4728i, this.f4729j, this.f4730k, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((i) a((c3.e) obj2)).h(z2.f.f5511a);
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        int i4;
        d3.a aVar = d3.a.f1765b;
        int i5 = this.f4725f;
        if (i5 == 0) {
            c3.h.D2(obj);
            t3.u uVar = w2.d.f4898a;
            Context context = (Context) this.f4726g.f3276b;
            String str = this.f4727h;
            c3.h.a0(str, "$path");
            String str2 = this.f4728i;
            c3.h.a0(str2, "$query");
            String str3 = this.f4729j;
            this.f4725f = 1;
            obj = w2.d.b(context, str, str2, str3, this, 16);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3.h.D2(obj);
        }
        w2.a aVar2 = (w2.a) obj;
        StringBuilder sb = new StringBuilder("custom request: ");
        sb.append(aVar2 != null ? new Integer(aVar2.f4888b) : null);
        String string = sb.toString();
        PrintStream printStream = System.out;
        printStream.println((Object) string);
        InjectorService injectorService = this.f4730k;
        if (aVar2 == null || (i4 = aVar2.f4888b) != 200) {
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
            if (injectorService.f1636d != null) {
                String str4 = "{\"error\": false,\"code\":" + new Integer(i4) + ", \"body\": " + aVar2.f4887a + '}';
                printStream.println((Object) "sending valid message");
                BufferedWriter bufferedWriter4 = injectorService.f1636d;
                if (bufferedWriter4 != null) {
                    bufferedWriter4.write(str4);
                }
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
