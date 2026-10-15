package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f903c;

    public /* synthetic */ v(int i4, Object obj) {
        this.f902b = i4;
        this.f903c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f902b;
        Object obj = this.f903c;
        switch (i4) {
            case 0:
                d dVar = (d) obj;
                Object obj2 = dVar.f723c;
                o oVar = ((q) obj2).I;
                if ((oVar == null ? null : oVar.f822a) != null) {
                    ((q) obj2).d().f822a = null;
                    ((b0) dVar.f724d).c((q) dVar.f723c, (e0.e) dVar.f725e);
                }
                break;
            case 1:
                d dVar2 = (d) obj;
                dVar2.f722b.endViewTransition((View) dVar2.f723c);
                ((f) dVar2.f724d).b();
                break;
            case 2:
                m mVar = (m) obj;
                mVar.W.onDismiss(mVar.f799e0);
                break;
            case 3:
                ((i0) obj).x(true);
                break;
            default:
                r0.b((ArrayList) obj, 4);
                break;
        }
    }
}
