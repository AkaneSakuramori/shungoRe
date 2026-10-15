package p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i[] f3696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i[] f3697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e.c f3699i;

    @Override // p.c
    public final i d(boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f3698h; i5++) {
            i[] iVarArr = this.f3696f;
            i iVar = iVarArr[i5];
            if (!zArr[iVar.f3701c]) {
                e.c cVar = this.f3699i;
                cVar.f1779c = iVar;
                int i6 = 8;
                if (i4 != -1) {
                    i iVar2 = iVarArr[i4];
                    while (i6 >= 0) {
                        float f5 = iVar2.f3707i[i6];
                        float f6 = ((i) cVar.f1779c).f3707i[i6];
                        if (f6 != f5) {
                            if (f6 >= f5) {
                                break;
                            }
                            i4 = i5;
                            break;
                            break;
                        }
                        i6--;
                    }
                } else {
                    while (i6 >= 0) {
                        float f7 = ((i) cVar.f1779c).f3707i[i6];
                        if (f7 > 0.0f) {
                            break;
                        }
                        if (f7 < 0.0f) {
                            i4 = i5;
                            break;
                        }
                        i6--;
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f3696f[i4];
    }

    @Override // p.c
    public final boolean e() {
        return this.f3698h == 0;
    }

    @Override // p.c
    public final void i(d dVar, c cVar, boolean z4) {
        i iVar = cVar.f3669a;
        if (iVar == null) {
            return;
        }
        b bVar = cVar.f3672d;
        int iK = bVar.k();
        for (int i4 = 0; i4 < iK; i4++) {
            i iVarB = bVar.b(i4);
            float fA = bVar.a(i4);
            e.c cVar2 = this.f3699i;
            cVar2.f1779c = iVarB;
            boolean z5 = iVarB.f3700b;
            float[] fArr = iVar.f3707i;
            if (z5) {
                boolean z6 = true;
                for (int i5 = 0; i5 < 9; i5++) {
                    float[] fArr2 = ((i) cVar2.f1779c).f3707i;
                    float f5 = (fArr[i5] * fA) + fArr2[i5];
                    fArr2[i5] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        ((i) cVar2.f1779c).f3707i[i5] = 0.0f;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    ((g) cVar2.f1781e).k((i) cVar2.f1779c);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f6 = fArr[i6];
                    if (f6 != 0.0f) {
                        float f7 = f6 * fA;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        ((i) cVar2.f1779c).f3707i[i6] = f7;
                    } else {
                        ((i) cVar2.f1779c).f3707i[i6] = 0.0f;
                    }
                }
                j(iVarB);
            }
            this.f3670b = (cVar.f3670b * fA) + this.f3670b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i4;
        int i5 = this.f3698h + 1;
        i[] iVarArr = this.f3696f;
        if (i5 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f3696f = iVarArr2;
            this.f3697g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f3696f;
        int i6 = this.f3698h;
        iVarArr3[i6] = iVar;
        int i7 = i6 + 1;
        this.f3698h = i7;
        if (i7 > 1 && iVarArr3[i6].f3701c > iVar.f3701c) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i4 = this.f3698h;
                if (i9 >= i4) {
                    break;
                }
                this.f3697g[i9] = this.f3696f[i9];
                i9++;
            }
            Arrays.sort(this.f3697g, 0, i4, new f(i8, this));
            while (i8 < this.f3698h) {
                this.f3696f[i8] = this.f3697g[i8];
                i8++;
            }
        }
        iVar.f3700b = true;
        iVar.a(this);
    }

    public final void k(i iVar) {
        int i4 = 0;
        while (i4 < this.f3698h) {
            if (this.f3696f[i4] == iVar) {
                while (true) {
                    int i5 = this.f3698h;
                    if (i4 >= i5 - 1) {
                        this.f3698h = i5 - 1;
                        iVar.f3700b = false;
                        return;
                    } else {
                        i[] iVarArr = this.f3696f;
                        int i6 = i4 + 1;
                        iVarArr[i4] = iVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // p.c
    public final String toString() {
        String str = " goal -> (" + this.f3670b + ") : ";
        for (int i4 = 0; i4 < this.f3698h; i4++) {
            i iVar = this.f3696f[i4];
            e.c cVar = this.f3699i;
            cVar.f1779c = iVar;
            str = str + cVar + " ";
        }
        return str;
    }
}
