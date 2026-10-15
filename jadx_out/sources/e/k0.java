package e;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.auth0.android.provider.AuthenticationActivity;
import com.shungo.app.MainActivity;
import java.util.Random;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1888d;

    public /* synthetic */ k0(Object obj, int i4, Object obj2) {
        this.f1886b = i4;
        this.f1887c = obj;
        this.f1888d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f1886b;
        int i5 = 1;
        Object obj = this.f1888d;
        Object obj2 = this.f1887c;
        switch (i4) {
            case 0:
                l0 l0Var = (l0) obj2;
                Runnable runnable = (Runnable) obj;
                l0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    l0Var.a();
                }
            case 1:
                ((c3.h) obj2).H1((Typeface) obj);
                return;
            case 2:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? w0.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(context, i5), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                j1.f fVar = (j1.f) obj2;
                g1.c cVar = (g1.c) obj;
                fVar.getClass();
                c3.h.b0(cVar, "error");
                AuthenticationActivity authenticationActivity = fVar.f3170a;
                authenticationActivity.getClass();
                c3.h hVar = j1.p0.f3211b;
                c3.h.X(hVar);
                hVar.J0(cVar);
                authenticationActivity.finish();
                return;
            case 4:
                com.auth0.android.request.internal.a aVar = (com.auth0.android.request.internal.a) obj2;
                i1.a aVar2 = (i1.a) obj;
                c3.h.b0(aVar, "this$0");
                com.auth0.android.request.internal.m mVar = aVar.f1307e;
                c3.h.b0(aVar2, "$callback");
                try {
                    mVar.b(new k0(aVar2, 5, aVar.c()));
                    return;
                } catch (f1.b e5) {
                    mVar.b(new k0(aVar2, 6, e5));
                    return;
                }
            case 5:
                i1.a aVar3 = (i1.a) obj2;
                c3.h.b0(aVar3, "$callback");
                aVar3.b(obj);
                return;
            case 6:
                i1.a aVar4 = (i1.a) obj2;
                f1.b bVar = (f1.b) obj;
                c3.h.b0(aVar4, "$callback");
                c3.h.b0(bVar, "$uError");
                aVar4.a(bVar);
                return;
            case 7:
                Context context2 = (Context) obj2;
                w2.a aVar5 = (w2.a) obj;
                StringBuilder sb = new StringBuilder("Download Error ");
                sb.append(aVar5 != null ? Integer.valueOf(aVar5.f4888b) : null);
                Toast.makeText(context2, sb.toString(), 1).show();
                return;
            case 8:
                Toast.makeText((Context) obj2, String.valueOf((String) obj), 1).show();
                return;
            case 9:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.o().evaluateJavascript("setUserInfo(" + ((String) obj) + ')', null);
                mainActivity.o().post(new u2.p(mainActivity, Settings.canDrawOverlays(mainActivity), i5));
                return;
            case 10:
                Executor executor = (Executor) obj2;
                x2.b bVar2 = (x2.b) obj;
                try {
                    y2.m mVarA = y2.d.a();
                    if (executor == null) {
                        bVar2.a(mVarA);
                    } else {
                        executor.execute(new k0(bVar2, 11, mVarA));
                    }
                    return;
                } catch (x2.a unused) {
                    return;
                }
            case 11:
                ((x2.b) obj2).a((x2.d) obj);
                return;
            default:
                y2.h hVar2 = (y2.h) obj2;
                hVar2.getClass();
                ((y2.f) obj).b(hVar2);
                return;
        }
    }
}
