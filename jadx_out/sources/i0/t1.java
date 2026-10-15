package i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f2964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.c[] f2965b;

    public t1() {
        this(new c2());
    }

    public final void a() {
        b0.c[] cVarArr = this.f2965b;
        if (cVarArr != null) {
            b0.c cVarF = cVarArr[c3.h.j1(1)];
            b0.c cVarF2 = this.f2965b[c3.h.j1(2)];
            c2 c2Var = this.f2964a;
            if (cVarF2 == null) {
                cVarF2 = c2Var.f2902a.f(2);
            }
            if (cVarF == null) {
                cVarF = c2Var.f2902a.f(1);
            }
            g(b0.c.a(cVarF, cVarF2));
            b0.c cVar = this.f2965b[c3.h.j1(16)];
            if (cVar != null) {
                f(cVar);
            }
            b0.c cVar2 = this.f2965b[c3.h.j1(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            b0.c cVar3 = this.f2965b[c3.h.j1(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract c2 b();

    public void c(int i4, b0.c cVar) {
        if (this.f2965b == null) {
            this.f2965b = new b0.c[9];
        }
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                this.f2965b[c3.h.j1(i5)] = cVar;
            }
        }
    }

    public void d(b0.c cVar) {
    }

    public abstract void e(b0.c cVar);

    public void f(b0.c cVar) {
    }

    public abstract void g(b0.c cVar);

    public void h(b0.c cVar) {
    }

    public t1(c2 c2Var) {
        this.f2964a = c2Var;
    }
}
