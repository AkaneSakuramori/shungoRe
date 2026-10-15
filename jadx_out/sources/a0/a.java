package a0;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7f;

    public a(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f2a = f5;
        this.f3b = f6;
        this.f4c = f7;
        this.f5d = f8;
        this.f6e = f9;
        this.f7f = f10;
    }

    public static a a(int i4) {
        r rVar = r.f41k;
        float fB = b.b(Color.red(i4));
        float fB2 = b.b(Color.green(i4));
        float fB3 = b.b(Color.blue(i4));
        float[][] fArr = b.f11d;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f7 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = b.f8a;
        float[] fArr6 = fArr5[0];
        float f8 = (fArr6[2] * f7) + (fArr6[1] * f6) + (fArr6[0] * f5);
        float[] fArr7 = fArr5[1];
        float f9 = (fArr7[2] * f7) + (fArr7[1] * f6) + (fArr7[0] * f5);
        float[] fArr8 = fArr5[2];
        float f10 = (f7 * fArr8[2]) + (f6 * fArr8[1]) + (f5 * fArr8[0]);
        float[] fArr9 = rVar.f48g;
        float f11 = fArr9[0] * f8;
        float f12 = fArr9[1] * f9;
        float f13 = fArr9[2] * f10;
        float fAbs = Math.abs(f11);
        float f14 = rVar.f49h;
        float fPow = (float) Math.pow(((double) (fAbs * f14)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f12) * f14)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f13) * f14)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f15 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f16 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f17)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (3.1415927f * f20) / 180.0f;
        float f22 = f19 * rVar.f43b;
        float f23 = rVar.f42a;
        float f24 = rVar.f45d;
        float fPow4 = ((float) Math.pow(f22 / f23, rVar.f51j * f24)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f25 = f23 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f47f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f20) < 20.14d ? 360.0f + f20 : f20)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f46e) * rVar.f44c) * ((float) Math.sqrt((f16 * f16) + (f15 * f15)))) / (f18 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f26 = rVar.f50i * fSqrt;
        Math.sqrt((fPow5 * f24) / f25);
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f26 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f21;
        return new a(f20, fSqrt, fPow4, f27, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static a b(float f5, float f6, float f7) {
        r rVar = r.f41k;
        float f8 = rVar.f45d;
        double d5 = ((double) f5) / 100.0d;
        Math.sqrt(d5);
        float f9 = rVar.f42a + 4.0f;
        float f10 = rVar.f50i * f6;
        Math.sqrt(((f6 / ((float) Math.sqrt(d5))) * rVar.f45d) / f9);
        float f11 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float fLog = ((float) Math.log((((double) f10) * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f7) / 180.0f;
        return new a(f7, f6, f5, f11, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(r rVar) {
        float fSqrt;
        float f5 = this.f3b;
        double d5 = f5;
        float f6 = this.f4c;
        if (d5 != 0.0d) {
            double d6 = f6;
            if (d6 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f5 / ((float) Math.sqrt(d6 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, rVar.f47f), 0.73d), 1.1111111111111112d);
        double d7 = (this.f2a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f;
        float fPow2 = rVar.f42a * ((float) Math.pow(((double) f6) / 100.0d, (1.0d / ((double) rVar.f45d)) / ((double) rVar.f51j)));
        float f7 = fCos * 3846.1538f * rVar.f46e * rVar.f44c;
        float f8 = fPow2 / rVar.f43b;
        float fSin = (float) Math.sin(d7);
        float fCos2 = (float) Math.cos(d7);
        float f9 = (((0.305f + f8) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f7 * 23.0f)));
        float f10 = fCos2 * f9;
        float f11 = f9 * fSin;
        float f12 = f8 * 460.0f;
        float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))));
        float fSignum = Math.signum(f13);
        float f16 = 100.0f / rVar.f49h;
        float fPow3 = fSignum * f16 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f14) * f16 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f15) * f16 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float[] fArr = rVar.f48g;
        float f17 = fPow3 / fArr[0];
        float f18 = fSignum2 / fArr[1];
        float f19 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f9b;
        float[] fArr3 = fArr2[0];
        float f20 = (fArr3[2] * f19) + (fArr3[1] * f18) + (fArr3[0] * f17);
        float[] fArr4 = fArr2[1];
        float f21 = (fArr4[2] * f19) + (fArr4[1] * f18) + (fArr4[0] * f17);
        float[] fArr5 = fArr2[2];
        return b0.a.a(f20, f21, (f19 * fArr5[2]) + (f18 * fArr5[1]) + (f17 * fArr5[0]));
    }
}
