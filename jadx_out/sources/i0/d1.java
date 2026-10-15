package i0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f2904a;

    public d1(View view) {
        this.f2904a = new WeakReference(view);
    }

    public final void a(float f5) {
        View view = (View) this.f2904a.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
    }

    public final void b() {
        View view = (View) this.f2904a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f2904a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(e1 e1Var) {
        View view = (View) this.f2904a.get();
        if (view != null) {
            if (e1Var != null) {
                view.animate().setListener(new b1(this, e1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f5) {
        View view = (View) this.f2904a.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
    }
}
