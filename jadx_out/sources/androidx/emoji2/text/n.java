package androidx.emoji2.text;

import android.webkit.WebView;
import com.shungo.app.InjectorService;
import e.k0;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f621e;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4) {
        this.f618b = i4;
        this.f619c = obj;
        this.f620d = obj2;
        this.f621e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f618b) {
            case 0:
                g.a aVar = (g.a) this.f619c;
                c3.h hVar = (c3.h) this.f620d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f621e;
                aVar.getClass();
                try {
                    v vVarW0 = c3.h.w0(aVar.f2207a);
                    if (vVarW0 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    u uVar = (u) vVarW0.f605a;
                    synchronized (uVar.f642d) {
                        uVar.f644f = threadPoolExecutor;
                        break;
                    }
                    vVarW0.f605a.a(new o(hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.E1(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((l2.g) this.f619c).b((m.f) this.f620d, (Runnable) this.f621e);
                return;
            case 2:
                InjectorService injectorService = (InjectorService) this.f619c;
                String str = (String) this.f620d;
                JSONObject jSONObject = (JSONObject) this.f621e;
                int i4 = InjectorService.f1633o;
                c3.h.b0(injectorService, "this$0");
                WebView webView = injectorService.f1635c;
                if (webView != null) {
                    webView.evaluateJavascript("sendInformations('" + str + "', '" + jSONObject + "')", null);
                    return;
                }
                return;
            default:
                y2.c cVar = (y2.c) this.f619c;
                Executor executor = (Executor) this.f620d;
                y2.f fVar = (y2.f) this.f621e;
                ArrayList arrayList = y2.c.f5374o;
                y2.h hVarQ2 = cVar.Q2();
                if (fVar != null) {
                    if (executor == null) {
                        fVar.b(hVarQ2);
                        return;
                    } else {
                        executor.execute(new k0(hVarQ2, 12, fVar));
                        return;
                    }
                }
                return;
        }
    }
}
