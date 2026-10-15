package i;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2830h;

    public final void a(int i4, int i5) {
        this.f2825c = i4;
        this.f2826d = i5;
        this.f2830h = true;
        if (this.f2829g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f2823a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f2824b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2823a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f2824b = i5;
        }
    }
}
