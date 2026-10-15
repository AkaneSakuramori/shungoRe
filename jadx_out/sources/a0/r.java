package a0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f41k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f45d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f46e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f47f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f48g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f50i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f51j;

    static {
        float[] fArr = b.f10c;
        float fC = (float) ((((double) b.c()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f8a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = (fArr3[1] * f7) + f6;
        float f9 = fArr[2];
        float f10 = (fArr3[2] * f9) + f8;
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[2] * f9) + (fArr4[1] * f7) + (fArr4[0] * f5);
        float[] fArr5 = fArr2[2];
        float f12 = (f9 * fArr5[2]) + (f7 * fArr5[1]) + (f5 * fArr5[0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp};
        float f14 = 1.0f / ((5.0f * fC) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float fCbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(((double) fC) * 5.0d))) + (f15 * fC);
        float fC2 = b.c() / fArr[1];
        double d6 = fC2;
        float fSqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f12)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f11)) / 100.0d, 0.42d), fPow2};
        float f17 = fArr7[0];
        float f18 = fArr7[1];
        f41k = new r(fC2, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f17 * 400.0f) / (f17 + 27.13f)) * 2.0f) + ((f18 * 400.0f) / (f18 + 27.13f))) * fPow, fPow, fPow, f13, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public r(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f47f = f5;
        this.f42a = f6;
        this.f43b = f7;
        this.f44c = f8;
        this.f45d = f9;
        this.f46e = f10;
        this.f48g = fArr;
        this.f49h = f11;
        this.f50i = f12;
        this.f51j = f13;
    }
}
