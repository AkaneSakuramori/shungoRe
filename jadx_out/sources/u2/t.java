package u2;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.shungo.app.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class t extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4755a;

    public t(MainActivity mainActivity) {
        this.f4755a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        MainActivity mainActivity = this.f4755a;
        if (mainActivity.C) {
            return;
        }
        mainActivity.q();
        mainActivity.C = true;
    }
}
