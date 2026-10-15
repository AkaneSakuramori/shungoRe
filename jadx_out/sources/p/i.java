package p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3700b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3704f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3711m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3701c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3702d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3703e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3705g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f3706h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f3707i = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c[] f3708j = new c[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3709k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3710l = 0;

    public i(int i4) {
        this.f3711m = i4;
    }

    public final void a(c cVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f3709k;
            if (i4 >= i5) {
                c[] cVarArr = this.f3708j;
                if (i5 >= cVarArr.length) {
                    this.f3708j = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f3708j;
                int i6 = this.f3709k;
                cVarArr2[i6] = cVar;
                this.f3709k = i6 + 1;
                return;
            }
            if (this.f3708j[i4] == cVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void b(c cVar) {
        int i4 = this.f3709k;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f3708j[i5] == cVar) {
                while (i5 < i4 - 1) {
                    c[] cVarArr = this.f3708j;
                    int i6 = i5 + 1;
                    cVarArr[i5] = cVarArr[i6];
                    i5 = i6;
                }
                this.f3709k--;
                return;
            }
            i5++;
        }
    }

    public final void c() {
        this.f3711m = 5;
        this.f3703e = 0;
        this.f3701c = -1;
        this.f3702d = -1;
        this.f3704f = 0.0f;
        this.f3705g = false;
        int i4 = this.f3709k;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3708j[i5] = null;
        }
        this.f3709k = 0;
        this.f3710l = 0;
        this.f3700b = false;
        Arrays.fill(this.f3707i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3701c - ((i) obj).f3701c;
    }

    public final void d(d dVar, float f5) {
        this.f3704f = f5;
        this.f3705g = true;
        int i4 = this.f3709k;
        this.f3702d = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3708j[i5].h(dVar, this, false);
        }
        this.f3709k = 0;
    }

    public final void e(d dVar, c cVar) {
        int i4 = this.f3709k;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3708j[i5].i(dVar, cVar, false);
        }
        this.f3709k = 0;
    }

    public final String toString() {
        return "" + this.f3701c;
    }
}
