package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f4566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f4568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f4569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f4571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f4572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4573l;

    public final void a(int i4, float f5) {
        int i5 = this.f4567f;
        int[] iArr = this.f4565d;
        if (i5 >= iArr.length) {
            this.f4565d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4566e;
            this.f4566e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4565d;
        int i6 = this.f4567f;
        iArr2[i6] = i4;
        float[] fArr2 = this.f4566e;
        this.f4567f = i6 + 1;
        fArr2[i6] = f5;
    }

    public final void b(int i4, int i5) {
        int i6 = this.f4564c;
        int[] iArr = this.f4562a;
        if (i6 >= iArr.length) {
            this.f4562a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4563b;
            this.f4563b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4562a;
        int i7 = this.f4564c;
        iArr3[i7] = i4;
        int[] iArr4 = this.f4563b;
        this.f4564c = i7 + 1;
        iArr4[i7] = i5;
    }

    public final void c(int i4, boolean z4) {
        int i5 = this.f4573l;
        int[] iArr = this.f4571j;
        if (i5 >= iArr.length) {
            this.f4571j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4572k;
            this.f4572k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4571j;
        int i6 = this.f4573l;
        iArr2[i6] = i4;
        boolean[] zArr2 = this.f4572k;
        this.f4573l = i6 + 1;
        zArr2[i6] = z4;
    }

    public final void d(String str, int i4) {
        int i5 = this.f4570i;
        int[] iArr = this.f4568g;
        if (i5 >= iArr.length) {
            this.f4568g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4569h;
            this.f4569h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4568g;
        int i6 = this.f4570i;
        iArr2[i6] = i4;
        String[] strArr2 = this.f4569h;
        this.f4570i = i6 + 1;
        strArr2[i6] = str;
    }
}
