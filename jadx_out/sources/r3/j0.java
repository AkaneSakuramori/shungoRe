package r3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient i0 f4096b;

    public j0(String str, Throwable th, i0 i0Var) {
        super(str);
        this.f4096b = i0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (!c3.h.I(j0Var.getMessage(), getMessage()) || !c3.h.I(j0Var.f4096b, this.f4096b) || !c3.h.I(j0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        c3.h.X(message);
        int iHashCode = (this.f4096b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4096b;
    }
}
