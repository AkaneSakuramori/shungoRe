package r3;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends kotlinx.coroutines.scheduling.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4126d;

    public final void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            c3.h.F(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        c3.h.X(th);
        c3.h.g1(((kotlinx.coroutines.internal.c) this).f3284f.g(), new p("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        Object objA0 = z2.f.f5511a;
        f2.e eVar = this.f3338c;
        try {
            kotlinx.coroutines.internal.c cVar = (kotlinx.coroutines.internal.c) this;
            c3.e eVar2 = cVar.f3284f;
            Object obj = cVar.f3286h;
            c3.k kVarG = eVar2.g();
            Object objF = kotlinx.coroutines.internal.a.f(kVarG, obj);
            y0 y0VarJ2 = objF != kotlinx.coroutines.internal.a.f3281d ? c3.h.J2(eVar2, kVarG, objF) : null;
            try {
                c3.k kVarG2 = eVar2.g();
                kotlinx.coroutines.internal.c cVar2 = (kotlinx.coroutines.internal.c) this;
                Object obj2 = cVar2.f3285g;
                cVar2.f3285g = kotlinx.coroutines.internal.a.f3279b;
                f fVar = obj2 instanceof f ? (f) obj2 : null;
                Throwable th = fVar != null ? fVar.f4084a : null;
                i0 i0Var = (th == null && ((i4 = this.f4126d) == 1 || i4 == 2)) ? (i0) kVarG2.e(l.f4099c) : null;
                if (i0Var != null && !i0Var.a()) {
                    CancellationException cancellationExceptionP = ((p0) i0Var).p();
                    if (obj2 instanceof g) {
                        ((g) obj2).f4086b.e(cancellationExceptionP);
                    }
                    eVar2.b(c3.h.A0(cancellationExceptionP));
                } else if (th != null) {
                    eVar2.b(c3.h.A0(th));
                } else {
                    eVar2.b(obj2);
                }
                if (y0VarJ2 == null || y0VarJ2.H()) {
                    kotlinx.coroutines.internal.a.c(kVarG, objF);
                }
                try {
                    eVar.getClass();
                } catch (Throwable th2) {
                    objA0 = c3.h.A0(th2);
                }
                a(null, z2.c.a(objA0));
            } catch (Throwable th3) {
                if (y0VarJ2 == null || y0VarJ2.H()) {
                    kotlinx.coroutines.internal.a.c(kVarG, objF);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                eVar.getClass();
            } catch (Throwable th5) {
                objA0 = c3.h.A0(th5);
            }
            a(th4, z2.c.a(objA0));
        }
    }
}
