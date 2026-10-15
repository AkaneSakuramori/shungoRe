package i0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class r1 extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2962c;

    public r1() {
        this.f2962c = androidx.lifecycle.e0.e();
    }

    @Override // i0.t1
    public c2 b() {
        a();
        c2 c2VarG = c2.g(null, this.f2962c.build());
        c2VarG.f2902a.o(this.f2965b);
        return c2VarG;
    }

    @Override // i0.t1
    public void d(b0.c cVar) {
        this.f2962c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // i0.t1
    public void e(b0.c cVar) {
        this.f2962c.setStableInsets(cVar.d());
    }

    @Override // i0.t1
    public void f(b0.c cVar) {
        this.f2962c.setSystemGestureInsets(cVar.d());
    }

    @Override // i0.t1
    public void g(b0.c cVar) {
        this.f2962c.setSystemWindowInsets(cVar.d());
    }

    @Override // i0.t1
    public void h(b0.c cVar) {
        this.f2962c.setTappableElementInsets(cVar.d());
    }

    public r1(c2 c2Var) {
        WindowInsets.Builder builderE;
        super(c2Var);
        WindowInsets windowInsetsF = c2Var.f();
        if (windowInsetsF != null) {
            builderE = androidx.lifecycle.e0.f(windowInsetsF);
        } else {
            builderE = androidx.lifecycle.e0.e();
        }
        this.f2962c = builderE;
    }
}
