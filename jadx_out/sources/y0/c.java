package y0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f5085b;

    public final void a(int i4) {
        if (i4 < 64) {
            this.f5084a &= ~(1 << i4);
            return;
        }
        c cVar = this.f5085b;
        if (cVar != null) {
            cVar.a(i4 - 64);
        }
    }

    public final int b(int i4) {
        c cVar = this.f5085b;
        if (cVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f5084a) : Long.bitCount(this.f5084a & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f5084a & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f5084a) + cVar.b(i4 - 64);
    }

    public final void c() {
        if (this.f5085b == null) {
            this.f5085b = new c();
        }
    }

    public final boolean d(int i4) {
        if (i4 < 64) {
            return (this.f5084a & (1 << i4)) != 0;
        }
        c();
        return this.f5085b.d(i4 - 64);
    }

    public final void e(int i4, boolean z4) {
        if (i4 >= 64) {
            c();
            this.f5085b.e(i4 - 64, z4);
            return;
        }
        long j4 = this.f5084a;
        boolean z5 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i4) - 1;
        this.f5084a = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z4) {
            h(i4);
        } else {
            a(i4);
        }
        if (z5 || this.f5085b != null) {
            c();
            this.f5085b.e(0, z5);
        }
    }

    public final boolean f(int i4) {
        if (i4 >= 64) {
            c();
            return this.f5085b.f(i4 - 64);
        }
        long j4 = 1 << i4;
        long j5 = this.f5084a;
        boolean z4 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f5084a = j6;
        long j7 = j4 - 1;
        this.f5084a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        c cVar = this.f5085b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f5085b.f(0);
        }
        return z4;
    }

    public final void g() {
        this.f5084a = 0L;
        c cVar = this.f5085b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i4) {
        if (i4 < 64) {
            this.f5084a |= 1 << i4;
        } else {
            c();
            this.f5085b.h(i4 - 64);
        }
    }

    public final String toString() {
        if (this.f5085b == null) {
            return Long.toBinaryString(this.f5084a);
        }
        return this.f5085b.toString() + "xx" + Long.toBinaryString(this.f5084a);
    }
}
