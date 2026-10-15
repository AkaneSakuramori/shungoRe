package r0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4030c;

    public b(int i4) {
        if (i4 != 2) {
            this.f4030c = new Object[16];
            return;
        }
        this.f4030c = new b[256];
        this.f4028a = 0;
        this.f4029b = 0;
    }
}
