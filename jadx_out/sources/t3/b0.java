package t3;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.w f4307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f4308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f4311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f4312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f4313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f4314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f4315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f4316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f4317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x3.e f4319n;

    public b0(i.w wVar, x xVar, String str, int i4, o oVar, q qVar, d0 d0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j4, long j5, x3.e eVar) {
        this.f4307b = wVar;
        this.f4308c = xVar;
        this.f4309d = str;
        this.f4310e = i4;
        this.f4311f = oVar;
        this.f4312g = qVar;
        this.f4313h = d0Var;
        this.f4314i = b0Var;
        this.f4315j = b0Var2;
        this.f4316k = b0Var3;
        this.f4317l = j4;
        this.f4318m = j5;
        this.f4319n = eVar;
    }

    public static String a(b0 b0Var, String str) {
        b0Var.getClass();
        String strA = b0Var.f4312g.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d0 d0Var = this.f4313h;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        d0Var.close();
    }

    public final a0 e() {
        a0 a0Var = new a0();
        a0Var.f4293a = this.f4307b;
        a0Var.f4294b = this.f4308c;
        a0Var.f4295c = this.f4310e;
        a0Var.f4296d = this.f4309d;
        a0Var.f4297e = this.f4311f;
        a0Var.f4298f = this.f4312g.c();
        a0Var.f4299g = this.f4313h;
        a0Var.f4300h = this.f4314i;
        a0Var.f4301i = this.f4315j;
        a0Var.f4302j = this.f4316k;
        a0Var.f4303k = this.f4317l;
        a0Var.f4304l = this.f4318m;
        a0Var.f4305m = this.f4319n;
        return a0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4308c + ", code=" + this.f4310e + ", message=" + this.f4309d + ", url=" + ((s) this.f4307b.f2808b) + '}';
    }
}
