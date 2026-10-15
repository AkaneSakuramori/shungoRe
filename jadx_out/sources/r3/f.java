package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4083b = AtomicIntegerFieldUpdater.newUpdater(f.class, "_handled");
    private volatile /* synthetic */ int _handled = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4084a;

    public f(Throwable th) {
        this.f4084a = th;
    }

    public final String toString() {
        return f.class.getSimpleName() + '[' + this.f4084a + ']';
    }
}
