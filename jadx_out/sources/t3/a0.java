package t3;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i.w f4293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f4294b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f4297e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f4299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f4300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f4301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f4302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x3.e f4305m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4295c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f4298f = new p();

    public static void b(String str, b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.f4313h != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (b0Var.f4314i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b0Var.f4315j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b0Var.f4316k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final b0 a() {
        int i4 = this.f4295c;
        if (i4 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f4295c).toString());
        }
        i.w wVar = this.f4293a;
        if (wVar == null) {
            throw new IllegalStateException("request == null".toString());
        }
        x xVar = this.f4294b;
        if (xVar == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.f4296d;
        if (str != null) {
            return new b0(wVar, xVar, str, i4, this.f4297e, this.f4298f.b(), this.f4299g, this.f4300h, this.f4301i, this.f4302j, this.f4303k, this.f4304l, this.f4305m);
        }
        throw new IllegalStateException("message == null".toString());
    }
}
