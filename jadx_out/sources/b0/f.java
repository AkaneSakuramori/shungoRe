package b0;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f1086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f1087b;

    public static void a(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z4, boolean z5) {
        double d5;
        double d6;
        double radians = Math.toRadians(f11);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d7 = f5;
        double d8 = f6;
        double d9 = (d8 * dSin) + (d7 * dCos);
        double d10 = d7;
        double d11 = f9;
        double d12 = d9 / d11;
        double d13 = f10;
        double d14 = ((d8 * dCos) + (((double) (-f5)) * dSin)) / d13;
        double d15 = d8;
        double d16 = f8;
        double d17 = ((d16 * dSin) + (((double) f7) * dCos)) / d11;
        double d18 = ((d16 * dCos) + (((double) (-f7)) * dSin)) / d13;
        double d19 = d12 - d17;
        double d20 = d14 - d18;
        double d21 = (d12 + d17) / 2.0d;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f5, f6, f7, f8, f9 * fSqrt, f10 * fSqrt, f11, z4, z5);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = d19 * dSqrt;
        double d26 = dSqrt * d20;
        if (z4 == z5) {
            d5 = d21 - d26;
            d6 = d22 + d25;
        } else {
            d5 = d21 + d26;
            d6 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d14 - d6, d12 - d5);
        double dAtan3 = Math.atan2(d18 - d6, d17 - d5) - dAtan2;
        if (z5 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d27 = d5 * d11;
        double d28 = d6 * d13;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d11;
        double d32 = d31 * dCos2;
        double d33 = d13 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d13 * dCos2;
        double d37 = (dCos3 * d36) + (dSin3 * d35);
        double d38 = d36;
        double d39 = dAtan3 / ((double) iCeil);
        int i4 = 0;
        while (i4 < iCeil) {
            double d40 = dAtan2 + d39;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            double d41 = d39;
            double d42 = (((d11 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d43 = d38;
            double d44 = d29;
            double d45 = (d43 * dSin4) + (d11 * dSin2 * dCos4) + d30;
            double d46 = (d32 * dSin4) - (d33 * dCos4);
            double d47 = (dCos4 * d43) + (dSin4 * d35);
            double d48 = d40 - dAtan2;
            double dTan = Math.tan(d48 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d10), (float) ((d37 * dSqrt2) + d15), (float) (d42 - (dSqrt2 * d46)), (float) (d45 - (dSqrt2 * d47)), (float) d42, (float) d45);
            i4++;
            dAtan2 = d40;
            d35 = d35;
            dCos2 = dCos2;
            iCeil = iCeil;
            d37 = d47;
            d11 = d11;
            d34 = d46;
            d10 = d42;
            d15 = d45;
            d29 = d44;
            d39 = d41;
            d38 = d43;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i4;
        int i5;
        float[] fArr;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i6 = 6;
        float[] fArr2 = new float[6];
        char c5 = 'm';
        int i7 = 0;
        char c6 = 'm';
        int i8 = 0;
        while (i8 < fVarArr.length) {
            f fVar = fVarArr[i8];
            char c7 = fVar.f1086a;
            float[] fArr3 = fVar.f1087b;
            float f19 = fArr2[i7];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            float f24 = fArr2[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = i6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i4 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i9 = i7;
            while (i9 < fArr3.length) {
                if (c7 != 'A') {
                    if (c7 != 'C') {
                        if (c7 == 'H') {
                            i5 = i9;
                            fArr = fArr3;
                            c7 = c7;
                            i8 = i8;
                            path.lineTo(fArr[i5], f28);
                            f27 = fArr[i5];
                        } else if (c7 == 'Q') {
                            i5 = i9;
                            fArr = fArr3;
                            int i10 = i5 + 1;
                            int i11 = i5 + 2;
                            int i12 = i5 + 3;
                            path.quadTo(fArr[i5], fArr[i10], fArr[i11], fArr[i12]);
                            f5 = fArr[i5];
                            f6 = fArr[i10];
                            f27 = fArr[i11];
                            f28 = fArr[i12];
                        } else if (c7 == 'V') {
                            i5 = i9;
                            fArr = fArr3;
                            c7 = c7;
                            i8 = i8;
                            path.lineTo(f27, fArr[i5]);
                            f28 = fArr[i5];
                        } else if (c7 != 'a') {
                            if (c7 != 'c') {
                                if (c7 == 'h') {
                                    i5 = i9;
                                    path.rLineTo(fArr3[i5], 0.0f);
                                    f27 += fArr3[i5];
                                } else if (c7 == 'q') {
                                    i5 = i9;
                                    float f29 = f28;
                                    float f30 = f27;
                                    int i13 = i5 + 1;
                                    int i14 = i5 + 2;
                                    int i15 = i5 + 3;
                                    path.rQuadTo(fArr3[i5], fArr3[i13], fArr3[i14], fArr3[i15]);
                                    float f31 = f30 + fArr3[i5];
                                    float f32 = fArr3[i13] + f29;
                                    float f33 = f30 + fArr3[i14];
                                    f28 = f29 + fArr3[i15];
                                    f22 = f32;
                                    f21 = f31;
                                    fArr = fArr3;
                                    c7 = c7;
                                    i8 = i8;
                                    f27 = f33;
                                } else if (c7 == 'v') {
                                    i5 = i9;
                                    path.rLineTo(0.0f, fArr3[i5]);
                                    f28 += fArr3[i5];
                                } else if (c7 == 'L') {
                                    i5 = i9;
                                    int i16 = i5 + 1;
                                    path.lineTo(fArr3[i5], fArr3[i16]);
                                    f27 = fArr3[i5];
                                    f28 = fArr3[i16];
                                } else if (c7 == 'M') {
                                    i5 = i9;
                                    f27 = fArr3[i5];
                                    f28 = fArr3[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f27, f28);
                                    } else {
                                        path.moveTo(f27, f28);
                                        f26 = f28;
                                        f25 = f27;
                                    }
                                } else if (c7 == 'S') {
                                    i5 = i9;
                                    float f34 = f28;
                                    float f35 = f27;
                                    if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                        f13 = (f34 * 2.0f) - f22;
                                        f14 = (f35 * 2.0f) - f21;
                                    } else {
                                        f14 = f35;
                                        f13 = f34;
                                    }
                                    int i17 = i5 + 1;
                                    int i18 = i5 + 2;
                                    int i19 = i5 + 3;
                                    path.cubicTo(f14, f13, fArr3[i5], fArr3[i17], fArr3[i18], fArr3[i19]);
                                    float f36 = fArr3[i5];
                                    float f37 = fArr3[i17];
                                    f27 = fArr3[i18];
                                    f28 = fArr3[i19];
                                    f22 = f37;
                                    f21 = f36;
                                } else if (c7 == 'T') {
                                    i5 = i9;
                                    float f38 = f28;
                                    float f39 = f27;
                                    if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                        f8 = (f39 * 2.0f) - f21;
                                        f9 = (f38 * 2.0f) - f22;
                                    } else {
                                        f8 = f39;
                                        f9 = f38;
                                    }
                                    int i20 = i5 + 1;
                                    path.quadTo(f8, f9, fArr3[i5], fArr3[i20]);
                                    f10 = fArr3[i5];
                                    f12 = fArr3[i20];
                                    f22 = f9;
                                    f21 = f8;
                                    fArr = fArr3;
                                    c7 = c7;
                                    i8 = i8;
                                    f27 = f10;
                                    f28 = f12;
                                } else if (c7 == 'l') {
                                    i5 = i9;
                                    int i21 = i5 + 1;
                                    path.rLineTo(fArr3[i5], fArr3[i21]);
                                    f27 += fArr3[i5];
                                    f28 += fArr3[i21];
                                } else if (c7 == c5) {
                                    i5 = i9;
                                    float f40 = fArr3[i5];
                                    f27 += f40;
                                    float f41 = fArr3[i5 + 1];
                                    f28 += f41;
                                    if (i5 > 0) {
                                        path.rLineTo(f40, f41);
                                    } else {
                                        path.rMoveTo(f40, f41);
                                        f26 = f28;
                                        f25 = f27;
                                    }
                                } else if (c7 == 's') {
                                    if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                        f15 = f28 - f22;
                                        f16 = f27 - f21;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i22 = i9 + 1;
                                    int i23 = i9 + 2;
                                    int i24 = i9 + 3;
                                    i5 = i9;
                                    f7 = f28;
                                    float f42 = f27;
                                    path.rCubicTo(f16, f15, fArr3[i9], fArr3[i22], fArr3[i23], fArr3[i24]);
                                    f8 = f42 + fArr3[i5];
                                    f9 = f7 + fArr3[i22];
                                    f10 = f42 + fArr3[i23];
                                    f11 = fArr3[i24];
                                } else if (c7 != 't') {
                                    i5 = i9;
                                } else {
                                    if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                        f17 = f27 - f21;
                                        f18 = f28 - f22;
                                    } else {
                                        f18 = 0.0f;
                                        f17 = 0.0f;
                                    }
                                    int i25 = i9 + 1;
                                    path.rQuadTo(f17, f18, fArr3[i9], fArr3[i25]);
                                    float f43 = f17 + f27;
                                    float f44 = f18 + f28;
                                    f27 += fArr3[i9];
                                    f28 += fArr3[i25];
                                    f22 = f44;
                                    i5 = i9;
                                    fArr = fArr3;
                                    c7 = c7;
                                    i8 = i8;
                                    f21 = f43;
                                }
                                fArr = fArr3;
                                c7 = c7;
                                i8 = i8;
                            } else {
                                i5 = i9;
                                f7 = f28;
                                float f45 = f27;
                                int i26 = i5 + 2;
                                int i27 = i5 + 3;
                                int i28 = i5 + 4;
                                int i29 = i5 + 5;
                                path.rCubicTo(fArr3[i5], fArr3[i5 + 1], fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                                f8 = f45 + fArr3[i26];
                                f9 = f7 + fArr3[i27];
                                f10 = f45 + fArr3[i28];
                                f11 = fArr3[i29];
                            }
                            f12 = f11 + f7;
                            f22 = f9;
                            f21 = f8;
                            fArr = fArr3;
                            c7 = c7;
                            i8 = i8;
                            f27 = f10;
                            f28 = f12;
                        } else {
                            i5 = i9;
                            float f46 = f28;
                            float f47 = f27;
                            int i30 = i5 + 5;
                            int i31 = i5 + 6;
                            fArr = fArr3;
                            a(path, f47, f46, fArr3[i30] + f47, fArr3[i31] + f46, fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3] != 0.0f, fArr3[i5 + 4] != 0.0f);
                            f27 = f47 + fArr[i30];
                            f28 = f46 + fArr[i31];
                        }
                        i9 = i5 + i4;
                        c6 = c7;
                        c7 = c6;
                        fArr3 = fArr;
                        i8 = i8;
                        c5 = 'm';
                        i7 = 0;
                    } else {
                        i5 = i9;
                        fArr = fArr3;
                        int i32 = i5 + 2;
                        int i33 = i5 + 3;
                        int i34 = i5 + 4;
                        int i35 = i5 + 5;
                        path.cubicTo(fArr[i5], fArr[i5 + 1], fArr[i32], fArr[i33], fArr[i34], fArr[i35]);
                        f27 = fArr[i34];
                        f28 = fArr[i35];
                        f5 = fArr[i32];
                        f6 = fArr[i33];
                    }
                    f21 = f5;
                    f22 = f6;
                    i9 = i5 + i4;
                    c6 = c7;
                    c7 = c6;
                    fArr3 = fArr;
                    i8 = i8;
                    c5 = 'm';
                    i7 = 0;
                } else {
                    i5 = i9;
                    fArr = fArr3;
                    int i36 = i5 + 5;
                    int i37 = i5 + 6;
                    a(path, f27, f28, fArr[i36], fArr[i37], fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3] != 0.0f, fArr[i5 + 4] != 0.0f);
                    f27 = fArr[i36];
                    f28 = fArr[i37];
                }
                f22 = f28;
                f21 = f27;
                i9 = i5 + i4;
                c6 = c7;
                c7 = c6;
                fArr3 = fArr;
                i8 = i8;
                c5 = 'm';
                i7 = 0;
            }
            int i38 = i8;
            int i39 = i7;
            fArr2[i39] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            i8 = i38 + 1;
            i6 = 6;
            c5 = 'm';
            i7 = i39;
            c6 = fVarArr[i38].f1086a;
        }
    }
}
