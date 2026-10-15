package p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.h f3661c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3659a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3662d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3663e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3664f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3665g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3666h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3667i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3668j = false;

    public a(c cVar, g.h hVar) {
        this.f3660b = cVar;
        this.f3661c = hVar;
    }

    @Override // p.b
    public final float a(int i4) {
        int i5 = this.f3666h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3659a; i6++) {
            if (i6 == i4) {
                return this.f3665g[i5];
            }
            i5 = this.f3664f[i5];
        }
        return 0.0f;
    }

    @Override // p.b
    public final i b(int i4) {
        int i5 = this.f3666h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3659a; i6++) {
            if (i6 == i4) {
                return ((i[]) this.f3661c.f2226e)[this.f3663e[i5]];
            }
            i5 = this.f3664f[i5];
        }
        return null;
    }

    @Override // p.b
    public final float c(i iVar) {
        int i4 = this.f3666h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            if (this.f3663e[i4] == iVar.f3701c) {
                return this.f3665g[i4];
            }
            i4 = this.f3664f[i4];
        }
        return 0.0f;
    }

    @Override // p.b
    public final void clear() {
        int i4 = this.f3666h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            i iVar = ((i[]) this.f3661c.f2226e)[this.f3663e[i4]];
            if (iVar != null) {
                iVar.b(this.f3660b);
            }
            i4 = this.f3664f[i4];
        }
        this.f3666h = -1;
        this.f3667i = -1;
        this.f3668j = false;
        this.f3659a = 0;
    }

    @Override // p.b
    public final void d(i iVar, float f5) {
        if (f5 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i4 = this.f3666h;
        c cVar = this.f3660b;
        if (i4 == -1) {
            this.f3666h = 0;
            this.f3665g[0] = f5;
            this.f3663e[0] = iVar.f3701c;
            this.f3664f[0] = -1;
            iVar.f3710l++;
            iVar.a(cVar);
            this.f3659a++;
            if (this.f3668j) {
                return;
            }
            int i5 = this.f3667i + 1;
            this.f3667i = i5;
            int[] iArr = this.f3663e;
            if (i5 >= iArr.length) {
                this.f3668j = true;
                this.f3667i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f3659a; i7++) {
            int i8 = this.f3663e[i4];
            int i9 = iVar.f3701c;
            if (i8 == i9) {
                this.f3665g[i4] = f5;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f3664f[i4];
        }
        int length = this.f3667i;
        int i10 = length + 1;
        if (this.f3668j) {
            int[] iArr2 = this.f3663e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.f3663e;
        if (length >= iArr3.length && this.f3659a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f3663e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f3663e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.f3662d * 2;
            this.f3662d = i12;
            this.f3668j = false;
            this.f3667i = length - 1;
            this.f3665g = Arrays.copyOf(this.f3665g, i12);
            this.f3663e = Arrays.copyOf(this.f3663e, this.f3662d);
            this.f3664f = Arrays.copyOf(this.f3664f, this.f3662d);
        }
        this.f3663e[length] = iVar.f3701c;
        this.f3665g[length] = f5;
        if (i6 != -1) {
            int[] iArr6 = this.f3664f;
            iArr6[length] = iArr6[i6];
            iArr6[i6] = length;
        } else {
            this.f3664f[length] = this.f3666h;
            this.f3666h = length;
        }
        iVar.f3710l++;
        iVar.a(cVar);
        int i13 = this.f3659a + 1;
        this.f3659a = i13;
        if (!this.f3668j) {
            this.f3667i++;
        }
        int[] iArr7 = this.f3663e;
        if (i13 >= iArr7.length) {
            this.f3668j = true;
        }
        if (this.f3667i >= iArr7.length) {
            this.f3668j = true;
            this.f3667i = iArr7.length - 1;
        }
    }

    @Override // p.b
    public final float e(c cVar, boolean z4) {
        float fC = c(cVar.f3669a);
        g(cVar.f3669a, z4);
        b bVar = cVar.f3672d;
        int iK = bVar.k();
        for (int i4 = 0; i4 < iK; i4++) {
            i iVarB = bVar.b(i4);
            i(iVarB, bVar.c(iVarB) * fC, z4);
        }
        return fC;
    }

    @Override // p.b
    public final boolean f(i iVar) {
        int i4 = this.f3666h;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            if (this.f3663e[i4] == iVar.f3701c) {
                return true;
            }
            i4 = this.f3664f[i4];
        }
        return false;
    }

    @Override // p.b
    public final float g(i iVar, boolean z4) {
        int i4 = this.f3666h;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f3659a) {
            if (this.f3663e[i4] == iVar.f3701c) {
                if (i4 == this.f3666h) {
                    this.f3666h = this.f3664f[i4];
                } else {
                    int[] iArr = this.f3664f;
                    iArr[i6] = iArr[i4];
                }
                if (z4) {
                    iVar.b(this.f3660b);
                }
                iVar.f3710l--;
                this.f3659a--;
                this.f3663e[i4] = -1;
                if (this.f3668j) {
                    this.f3667i = i4;
                }
                return this.f3665g[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f3664f[i4];
        }
        return 0.0f;
    }

    @Override // p.b
    public final void h(float f5) {
        int i4 = this.f3666h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            float[] fArr = this.f3665g;
            fArr[i4] = fArr[i4] / f5;
            i4 = this.f3664f[i4];
        }
    }

    @Override // p.b
    public final void i(i iVar, float f5, boolean z4) {
        if (f5 <= -0.001f || f5 >= 0.001f) {
            int i4 = this.f3666h;
            c cVar = this.f3660b;
            if (i4 == -1) {
                this.f3666h = 0;
                this.f3665g[0] = f5;
                this.f3663e[0] = iVar.f3701c;
                this.f3664f[0] = -1;
                iVar.f3710l++;
                iVar.a(cVar);
                this.f3659a++;
                if (this.f3668j) {
                    return;
                }
                int i5 = this.f3667i + 1;
                this.f3667i = i5;
                int[] iArr = this.f3663e;
                if (i5 >= iArr.length) {
                    this.f3668j = true;
                    this.f3667i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f3659a; i7++) {
                int i8 = this.f3663e[i4];
                int i9 = iVar.f3701c;
                if (i8 == i9) {
                    float[] fArr = this.f3665g;
                    float f6 = fArr[i4] + f5;
                    if (f6 > -0.001f && f6 < 0.001f) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f3666h) {
                            this.f3666h = this.f3664f[i4];
                        } else {
                            int[] iArr2 = this.f3664f;
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z4) {
                            iVar.b(cVar);
                        }
                        if (this.f3668j) {
                            this.f3667i = i4;
                        }
                        iVar.f3710l--;
                        this.f3659a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i4;
                }
                i4 = this.f3664f[i4];
            }
            int length = this.f3667i;
            int i10 = length + 1;
            if (this.f3668j) {
                int[] iArr3 = this.f3663e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i10;
            }
            int[] iArr4 = this.f3663e;
            if (length >= iArr4.length && this.f3659a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f3663e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f3663e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i12 = this.f3662d * 2;
                this.f3662d = i12;
                this.f3668j = false;
                this.f3667i = length - 1;
                this.f3665g = Arrays.copyOf(this.f3665g, i12);
                this.f3663e = Arrays.copyOf(this.f3663e, this.f3662d);
                this.f3664f = Arrays.copyOf(this.f3664f, this.f3662d);
            }
            this.f3663e[length] = iVar.f3701c;
            this.f3665g[length] = f5;
            if (i6 != -1) {
                int[] iArr7 = this.f3664f;
                iArr7[length] = iArr7[i6];
                iArr7[i6] = length;
            } else {
                this.f3664f[length] = this.f3666h;
                this.f3666h = length;
            }
            iVar.f3710l++;
            iVar.a(cVar);
            this.f3659a++;
            if (!this.f3668j) {
                this.f3667i++;
            }
            int i13 = this.f3667i;
            int[] iArr8 = this.f3663e;
            if (i13 >= iArr8.length) {
                this.f3668j = true;
                this.f3667i = iArr8.length - 1;
            }
        }
    }

    @Override // p.b
    public final void j() {
        int i4 = this.f3666h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            float[] fArr = this.f3665g;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f3664f[i4];
        }
    }

    @Override // p.b
    public final int k() {
        return this.f3659a;
    }

    public final String toString() {
        int i4 = this.f3666h;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f3659a; i5++) {
            str = (defpackage.a.f(str, " -> ") + this.f3665g[i4] + " : ") + ((i[]) this.f3661c.f2226e)[this.f3663e[i4]];
            i4 = this.f3664f[i4];
        }
        return str;
    }
}
