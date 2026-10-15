package i0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class v1 extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0.c f2989m;

    public v1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
        this.f2989m = null;
    }

    @Override // i0.a2
    public c2 b() {
        return c2.g(null, this.f2975c.consumeStableInsets());
    }

    @Override // i0.a2
    public c2 c() {
        return c2.g(null, this.f2975c.consumeSystemWindowInsets());
    }

    @Override // i0.a2
    public final b0.c h() {
        if (this.f2989m == null) {
            WindowInsets windowInsets = this.f2975c;
            this.f2989m = b0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2989m;
    }

    @Override // i0.a2
    public boolean m() {
        return this.f2975c.isConsumed();
    }

    @Override // i0.a2
    public void q(b0.c cVar) {
        this.f2989m = cVar;
    }
}
