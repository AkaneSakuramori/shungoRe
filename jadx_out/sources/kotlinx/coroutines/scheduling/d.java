package kotlinx.coroutines.scheduling;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f3334e = new d(j.f3341b, j.f3342c, j.f3343d);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // r3.k
    public final String toString() {
        return "Dispatchers.Default";
    }
}
