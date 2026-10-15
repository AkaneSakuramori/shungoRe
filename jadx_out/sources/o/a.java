package o;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3574c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3575a;

    static {
        if (f.f3586d) {
            f3574c = null;
            f3573b = null;
        } else {
            f3574c = new a(null, false);
            f3573b = new a(null, true);
        }
    }

    public a(Throwable th, boolean z4) {
        this.f3575a = th;
    }
}
