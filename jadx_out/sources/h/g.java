package h;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.y0;
import e.n0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2362f;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f2358b = i4;
        this.f2362f = obj;
        this.f2359c = obj2;
        this.f2360d = obj3;
        this.f2361e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2358b;
        Object obj = this.f2361e;
        Object obj2 = this.f2360d;
        Object obj3 = this.f2359c;
        switch (i4) {
            case 0:
                h hVar = (h) obj3;
                if (hVar != null) {
                    n0 n0Var = (n0) this.f2362f;
                    ((i) n0Var.f1896c).B = true;
                    hVar.f2364b.c(false);
                    ((i) n0Var.f1896c).B = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj).q(menuItem, null, 4);
                    break;
                }
                break;
            default:
                ((y0) obj3).getClass();
                y0.g((View) obj2, (Rect) obj);
                break;
        }
    }
}
