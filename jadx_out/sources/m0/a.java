package m0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3418i;

    public final float a(long j4) {
        long j5 = this.f3414e;
        if (j4 < j5) {
            return 0.0f;
        }
        long j6 = this.f3416g;
        if (j6 < 0 || j4 < j6) {
            return g.b((j4 - j5) / this.f3410a, 0.0f, 1.0f) * 0.5f;
        }
        float f5 = this.f3417h;
        return (g.b((j4 - j6) / this.f3418i, 0.0f, 1.0f) * f5) + (1.0f - f5);
    }
}
