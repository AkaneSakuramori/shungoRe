package s3;

import android.os.Handler;
import android.os.Looper;
import c3.h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.k;
import r3.i0;
import r3.l;
import r3.p0;
import r3.q0;
import r3.t;
import r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q0 implements t {
    private volatile c _immediate;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f4238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f4241g;

    public c(Handler handler, String str, boolean z4) {
        this.f4238d = handler;
        this.f4239e = str;
        this.f4240f = z4;
        this._immediate = z4 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f4241g = cVar;
    }

    @Override // r3.k
    public final boolean C() {
        return (this.f4240f && h.I(Looper.myLooper(), this.f4238d.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f4238d == this.f4238d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4238d);
    }

    @Override // r3.k
    public final String toString() {
        c cVar;
        String str;
        kotlinx.coroutines.scheduling.d dVar = x.f4128a;
        q0 q0Var = k.f3303a;
        if (this == q0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = ((c) q0Var).f4241g;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f4239e;
        if (string == null) {
            string = this.f4238d.toString();
        }
        return this.f4240f ? defpackage.a.f(string, ".immediate") : string;
    }

    @Override // r3.k
    public final void z(c3.k kVar, Runnable runnable) throws IllegalAccessException, InvocationTargetException {
        if (this.f4238d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        i0 i0Var = (i0) kVar.e(l.f4099c);
        if (i0Var != null) {
            ((p0) i0Var).j(cancellationException);
        }
        x.f4129b.z(kVar, runnable);
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
