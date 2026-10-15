package a4;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f145b = new int[10];

    public final int a() {
        if ((this.f144a & 128) != 0) {
            return this.f145b[7];
        }
        return 65535;
    }

    public final void b(g0 g0Var) {
        c3.h.b0(g0Var, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (((1 << i4) & g0Var.f144a) != 0) {
                c(i4, g0Var.f145b[i4]);
            }
        }
    }

    public final void c(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f145b;
            if (i4 >= iArr.length) {
                return;
            }
            this.f144a = (1 << i4) | this.f144a;
            iArr[i4] = i5;
        }
    }
}
