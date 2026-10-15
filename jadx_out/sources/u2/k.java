package u2;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.shungo.app.InjectorService;

/* JADX INFO: loaded from: classes.dex */
public final class k extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4738b;

    public k(InjectorService injectorService, String str) {
        this.f4737a = injectorService;
        this.f4738b = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) throws InterruptedException {
        InjectorService injectorService = this.f4737a;
        WebView webView2 = injectorService.f1635c;
        if (webView2 != null) {
            webView2.evaluateJavascript("document.body.style.backgroundColor = 'transparent';", null);
        }
        Thread.sleep(1000L);
        WebView webView3 = injectorService.f1635c;
        if (webView3 != null) {
            webView3.evaluateJavascript("setSettings(" + this.f4738b + ')', null);
        }
    }
}
