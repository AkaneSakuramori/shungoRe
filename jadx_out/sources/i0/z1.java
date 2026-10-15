package i0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends y1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c2 f2996q = c2.g(null, WindowInsets.CONSUMED);

    public z1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
    }

    @Override // i0.u1, i0.a2
    public final void d(View view) {
    }

    @Override // i0.u1, i0.a2
    public b0.c f(int i4) {
        return b0.c.c(this.f2975c.getInsets(b2.a(i4)));
    }
}
