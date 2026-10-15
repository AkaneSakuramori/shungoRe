package r3;

/* JADX INFO: loaded from: classes.dex */
public final class u extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3.k f4124b;

    public u(c3.k kVar) {
        this.f4124b = kVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f4124b.toString();
    }
}
