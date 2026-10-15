package g;

import android.view.View;
import android.view.animation.Interpolator;
import i0.d1;
import i0.e1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f2270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f2271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2272e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2269b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f2273f = new m(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2268a = new ArrayList();

    public final void a() {
        if (this.f2272e) {
            Iterator it = this.f2268a.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).b();
            }
            this.f2272e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2272e) {
            return;
        }
        for (d1 d1Var : this.f2268a) {
            long j4 = this.f2269b;
            if (j4 >= 0) {
                d1Var.c(j4);
            }
            Interpolator interpolator = this.f2270c;
            if (interpolator != null && (view = (View) d1Var.f2904a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f2271d != null) {
                d1Var.d(this.f2273f);
            }
            View view2 = (View) d1Var.f2904a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2272e = true;
    }
}
