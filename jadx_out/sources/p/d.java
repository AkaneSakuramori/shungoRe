package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f3674p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f3675q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3678c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c[] f3681f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g.h f3687l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f3690o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3676a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3677b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3679d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3680e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3682g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f3683h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3684i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3685j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3686k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f3688m = new i[f3675q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3689n = 0;

    public d() {
        this.f3681f = null;
        this.f3681f = new c[32];
        s();
        g.h hVar = new g.h(2);
        this.f3687l = hVar;
        g gVar = new g(hVar);
        gVar.f3696f = new i[128];
        gVar.f3697g = new i[128];
        gVar.f3698h = 0;
        gVar.f3699i = new e.c(gVar, gVar);
        this.f3678c = gVar;
        this.f3690o = new c(hVar);
    }

    public static int n(r.c cVar) {
        i iVar = cVar.f3937i;
        if (iVar != null) {
            return (int) (iVar.f3704f + 0.5f);
        }
        return 0;
    }

    public final i a(int i4) {
        i iVar = (i) ((e) this.f3687l.f2225d).a();
        if (iVar == null) {
            iVar = new i(i4);
            iVar.f3711m = i4;
        } else {
            iVar.c();
            iVar.f3711m = i4;
        }
        int i5 = this.f3689n;
        int i6 = f3675q;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f3675q = i7;
            this.f3688m = (i[]) Arrays.copyOf(this.f3688m, i7);
        }
        i[] iVarArr = this.f3688m;
        int i8 = this.f3689n;
        this.f3689n = i8 + 1;
        iVarArr[i8] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i4, float f5, i iVar3, i iVar4, int i5, int i6) {
        c cVarL = l();
        if (iVar2 == iVar3) {
            cVarL.f3672d.d(iVar, 1.0f);
            cVarL.f3672d.d(iVar4, 1.0f);
            cVarL.f3672d.d(iVar2, -2.0f);
        } else if (f5 == 0.5f) {
            cVarL.f3672d.d(iVar, 1.0f);
            cVarL.f3672d.d(iVar2, -1.0f);
            cVarL.f3672d.d(iVar3, -1.0f);
            cVarL.f3672d.d(iVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                cVarL.f3670b = (-i4) + i5;
            }
        } else if (f5 <= 0.0f) {
            cVarL.f3672d.d(iVar, -1.0f);
            cVarL.f3672d.d(iVar2, 1.0f);
            cVarL.f3670b = i4;
        } else if (f5 >= 1.0f) {
            cVarL.f3672d.d(iVar4, -1.0f);
            cVarL.f3672d.d(iVar3, 1.0f);
            cVarL.f3670b = -i5;
        } else {
            float f6 = 1.0f - f5;
            cVarL.f3672d.d(iVar, f6 * 1.0f);
            cVarL.f3672d.d(iVar2, f6 * (-1.0f));
            cVarL.f3672d.d(iVar3, (-1.0f) * f5);
            cVarL.f3672d.d(iVar4, 1.0f * f5);
            if (i4 > 0 || i5 > 0) {
                cVarL.f3670b = (i5 * f5) + ((-i4) * f6);
            }
        }
        if (i6 != 8) {
            cVarL.a(this, i6);
        }
        c(cVarL);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0195  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    public final void c(c cVar) {
        boolean z4;
        boolean z5;
        i iVarF;
        ArrayList arrayList;
        if (this.f3685j + 1 >= this.f3686k || this.f3684i + 1 >= this.f3680e) {
            o();
        }
        if (!cVar.f3673e) {
            if (this.f3681f.length != 0) {
                boolean z6 = false;
                while (!z6) {
                    int iK = cVar.f3672d.k();
                    int i4 = 0;
                    while (true) {
                        arrayList = cVar.f3671c;
                        if (i4 >= iK) {
                            break;
                        }
                        i iVarB = cVar.f3672d.b(i4);
                        if (iVarB.f3702d != -1 || iVarB.f3705g) {
                            arrayList.add(iVarB);
                        }
                        i4++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i5 = 0; i5 < size; i5++) {
                            i iVar = (i) arrayList.get(i5);
                            if (iVar.f3705g) {
                                cVar.h(this, iVar, true);
                            } else {
                                cVar.i(this, this.f3681f[iVar.f3702d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z6 = true;
                    }
                }
                if (cVar.f3669a != null && cVar.f3672d.k() == 0) {
                    cVar.f3673e = true;
                    this.f3676a = true;
                }
            }
            if (cVar.e()) {
                return;
            }
            float f5 = cVar.f3670b;
            if (f5 < 0.0f) {
                cVar.f3670b = f5 * (-1.0f);
                cVar.f3672d.j();
            }
            int iK2 = cVar.f3672d.k();
            float f6 = 0.0f;
            float f7 = 0.0f;
            i iVar2 = null;
            i iVar3 = null;
            boolean z7 = false;
            boolean z8 = false;
            for (int i6 = 0; i6 < iK2; i6++) {
                float fA = cVar.f3672d.a(i6);
                i iVarB2 = cVar.f3672d.b(i6);
                if (iVarB2.f3711m == 1) {
                    if (iVar2 == null) {
                        if (iVarB2.f3710l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        iVar2 = iVarB2;
                        f6 = fA;
                    } else {
                        if (f6 > fA) {
                            if (iVarB2.f3710l > 1) {
                                z7 = false;
                            }
                            iVar2 = iVarB2;
                            f6 = fA;
                        } else if (z7 || iVarB2.f3710l > 1) {
                        }
                        z7 = true;
                        iVar2 = iVarB2;
                        f6 = fA;
                    }
                } else if (iVar2 == null && fA < 0.0f) {
                    if (iVar3 == null) {
                        if (iVarB2.f3710l <= 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        iVar3 = iVarB2;
                        f7 = fA;
                    } else {
                        if (f7 > fA) {
                            if (iVarB2.f3710l > 1) {
                                z8 = false;
                            }
                            iVar3 = iVarB2;
                            f7 = fA;
                        } else if (z8 || iVarB2.f3710l > 1) {
                        }
                        z8 = true;
                        iVar3 = iVarB2;
                        f7 = fA;
                    }
                }
            }
            if (iVar2 == null) {
                iVar2 = iVar3;
            }
            if (iVar2 == null) {
                z4 = true;
            } else {
                cVar.g(iVar2);
                z4 = false;
            }
            if (cVar.f3672d.k() == 0) {
                cVar.f3673e = true;
            }
            if (z4) {
                if (this.f3684i + 1 >= this.f3680e) {
                    o();
                }
                i iVarA = a(3);
                int i7 = this.f3677b + 1;
                this.f3677b = i7;
                this.f3684i++;
                iVarA.f3701c = i7;
                g.h hVar = this.f3687l;
                ((i[]) hVar.f2226e)[i7] = iVarA;
                cVar.f3669a = iVarA;
                int i8 = this.f3685j;
                h(cVar);
                if (this.f3685j == i8 + 1) {
                    c cVar2 = this.f3690o;
                    cVar2.getClass();
                    cVar2.f3669a = null;
                    cVar2.f3672d.clear();
                    for (int i9 = 0; i9 < cVar.f3672d.k(); i9++) {
                        cVar2.f3672d.i(cVar.f3672d.b(i9), cVar.f3672d.a(i9), true);
                    }
                    r(this.f3690o);
                    if (iVarA.f3702d == -1) {
                        if (cVar.f3669a == iVarA && (iVarF = cVar.f(null, iVarA)) != null) {
                            cVar.g(iVarF);
                        }
                        if (!cVar.f3673e) {
                            cVar.f3669a.e(this, cVar);
                        }
                        ((e) hVar.f2223b).b(cVar);
                        this.f3685j--;
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            i iVar4 = cVar.f3669a;
            if (iVar4 == null) {
                return;
            }
            if ((iVar4.f3711m != 1 && cVar.f3670b < 0.0f) || z5) {
                return;
            }
        }
        h(cVar);
    }

    public final void d(i iVar, int i4) {
        int i5 = iVar.f3702d;
        if (i5 == -1) {
            iVar.d(this, i4);
            for (int i6 = 0; i6 < this.f3677b + 1; i6++) {
                i iVar2 = ((i[]) this.f3687l.f2226e)[i6];
            }
            return;
        }
        if (i5 == -1) {
            c cVarL = l();
            cVarL.f3669a = iVar;
            float f5 = i4;
            iVar.f3704f = f5;
            cVarL.f3670b = f5;
            cVarL.f3673e = true;
            c(cVarL);
            return;
        }
        c cVar = this.f3681f[i5];
        if (cVar.f3673e) {
            cVar.f3670b = i4;
            return;
        }
        if (cVar.f3672d.k() == 0) {
            cVar.f3673e = true;
            cVar.f3670b = i4;
            return;
        }
        c cVarL2 = l();
        if (i4 < 0) {
            cVarL2.f3670b = i4 * (-1);
            cVarL2.f3672d.d(iVar, 1.0f);
        } else {
            cVarL2.f3670b = i4;
            cVarL2.f3672d.d(iVar, -1.0f);
        }
        c(cVarL2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public final void e(i iVar, i iVar2, int i4, int i5) {
        boolean z4;
        if (i5 == 8 && iVar2.f3705g && iVar.f3702d == -1) {
            iVar.d(this, iVar2.f3704f + i4);
            return;
        }
        c cVarL = l();
        if (i4 == 0) {
            cVarL.f3672d.d(iVar, -1.0f);
            cVarL.f3672d.d(iVar2, 1.0f);
        } else {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            } else {
                z4 = false;
            }
            cVarL.f3670b = i4;
            if (z4) {
                cVarL.f3672d.d(iVar, 1.0f);
                cVarL.f3672d.d(iVar2, -1.0f);
            } else {
                cVarL.f3672d.d(iVar, -1.0f);
                cVarL.f3672d.d(iVar2, 1.0f);
            }
        }
        if (i5 != 8) {
            cVarL.a(this, i5);
        }
        c(cVarL);
    }

    public final void f(i iVar, i iVar2, int i4, int i5) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f3703e = 0;
        cVarL.b(iVar, iVar2, iVarM, i4);
        if (i5 != 8) {
            cVarL.f3672d.d(j(i5), (int) (cVarL.f3672d.c(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void g(i iVar, i iVar2, int i4, int i5) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f3703e = 0;
        cVarL.c(iVar, iVar2, iVarM, i4);
        if (i5 != 8) {
            cVarL.f3672d.d(j(i5), (int) (cVarL.f3672d.c(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void h(c cVar) {
        int i4;
        if (cVar.f3673e) {
            cVar.f3669a.d(this, cVar.f3670b);
        } else {
            c[] cVarArr = this.f3681f;
            int i5 = this.f3685j;
            cVarArr[i5] = cVar;
            i iVar = cVar.f3669a;
            iVar.f3702d = i5;
            this.f3685j = i5 + 1;
            iVar.e(this, cVar);
        }
        if (this.f3676a) {
            int i6 = 0;
            while (i6 < this.f3685j) {
                if (this.f3681f[i6] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f3681f[i6];
                if (cVar2 != null && cVar2.f3673e) {
                    cVar2.f3669a.d(this, cVar2.f3670b);
                    ((e) this.f3687l.f2223b).b(cVar2);
                    this.f3681f[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f3685j;
                        if (i7 >= i4) {
                            break;
                        }
                        c[] cVarArr2 = this.f3681f;
                        int i9 = i7 - 1;
                        c cVar3 = cVarArr2[i7];
                        cVarArr2[i9] = cVar3;
                        i iVar2 = cVar3.f3669a;
                        if (iVar2.f3702d == i7) {
                            iVar2.f3702d = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.f3681f[i8] = null;
                    }
                    this.f3685j = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f3676a = false;
        }
    }

    public final void i() {
        for (int i4 = 0; i4 < this.f3685j; i4++) {
            c cVar = this.f3681f[i4];
            cVar.f3669a.f3704f = cVar.f3670b;
        }
    }

    public final i j(int i4) {
        if (this.f3684i + 1 >= this.f3680e) {
            o();
        }
        i iVarA = a(4);
        int i5 = this.f3677b + 1;
        this.f3677b = i5;
        this.f3684i++;
        iVarA.f3701c = i5;
        iVarA.f3703e = i4;
        ((i[]) this.f3687l.f2226e)[i5] = iVarA;
        g gVar = this.f3678c;
        gVar.f3699i.f1779c = iVarA;
        float[] fArr = iVarA.f3707i;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f3703e] = 1.0f;
        gVar.j(iVarA);
        return iVarA;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f3684i + 1 >= this.f3680e) {
            o();
        }
        if (obj instanceof r.c) {
            r.c cVar = (r.c) obj;
            iVar = cVar.f3937i;
            if (iVar == null) {
                cVar.k();
                iVar = cVar.f3937i;
            }
            int i4 = iVar.f3701c;
            g.h hVar = this.f3687l;
            if (i4 == -1 || i4 > this.f3677b || ((i[]) hVar.f2226e)[i4] == null) {
                if (i4 != -1) {
                    iVar.c();
                }
                int i5 = this.f3677b + 1;
                this.f3677b = i5;
                this.f3684i++;
                iVar.f3701c = i5;
                iVar.f3711m = 1;
                ((i[]) hVar.f2226e)[i5] = iVar;
            }
        }
        return iVar;
    }

    public final c l() {
        g.h hVar = this.f3687l;
        c cVar = (c) ((e) hVar.f2223b).a();
        if (cVar == null) {
            return new c(hVar);
        }
        cVar.f3669a = null;
        cVar.f3672d.clear();
        cVar.f3670b = 0.0f;
        cVar.f3673e = false;
        return cVar;
    }

    public final i m() {
        if (this.f3684i + 1 >= this.f3680e) {
            o();
        }
        i iVarA = a(3);
        int i4 = this.f3677b + 1;
        this.f3677b = i4;
        this.f3684i++;
        iVarA.f3701c = i4;
        ((i[]) this.f3687l.f2226e)[i4] = iVarA;
        return iVarA;
    }

    public final void o() {
        int i4 = this.f3679d * 2;
        this.f3679d = i4;
        this.f3681f = (c[]) Arrays.copyOf(this.f3681f, i4);
        g.h hVar = this.f3687l;
        hVar.f2226e = (i[]) Arrays.copyOf((i[]) hVar.f2226e, this.f3679d);
        int i5 = this.f3679d;
        this.f3683h = new boolean[i5];
        this.f3680e = i5;
        this.f3686k = i5;
    }

    public final void p() {
        g gVar = this.f3678c;
        if (gVar.e()) {
            i();
            return;
        }
        if (!this.f3682g) {
            q(gVar);
            return;
        }
        for (int i4 = 0; i4 < this.f3685j; i4++) {
            if (!this.f3681f[i4].f3673e) {
                q(gVar);
                return;
            }
        }
        i();
    }

    public final void q(g gVar) {
        for (int i4 = 0; i4 < this.f3685j; i4++) {
            c cVar = this.f3681f[i4];
            int i5 = 1;
            if (cVar.f3669a.f3711m != 1) {
                float f5 = 0.0f;
                if (cVar.f3670b < 0.0f) {
                    boolean z4 = false;
                    int i6 = 0;
                    while (!z4) {
                        i6 += i5;
                        float f6 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f3685j) {
                            c cVar2 = this.f3681f[i9];
                            if (cVar2.f3669a.f3711m != i5 && !cVar2.f3673e && cVar2.f3670b < f5) {
                                int iK = cVar2.f3672d.k();
                                int i11 = 0;
                                while (i11 < iK) {
                                    i iVarB = cVar2.f3672d.b(i11);
                                    float fC = cVar2.f3672d.c(iVarB);
                                    if (fC > f5) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f7 = iVarB.f3706h[i12] / fC;
                                            if ((f7 < f6 && i12 == i10) || i12 > i10) {
                                                i10 = i12;
                                                i8 = iVarB.f3701c;
                                                i7 = i9;
                                                f6 = f7;
                                            }
                                        }
                                    }
                                    i11++;
                                    f5 = 0.0f;
                                }
                            }
                            i9++;
                            f5 = 0.0f;
                            i5 = 1;
                        }
                        if (i7 != -1) {
                            c cVar3 = this.f3681f[i7];
                            cVar3.f3669a.f3702d = -1;
                            cVar3.g(((i[]) this.f3687l.f2226e)[i8]);
                            i iVar = cVar3.f3669a;
                            iVar.f3702d = i7;
                            iVar.e(this, cVar3);
                        } else {
                            z4 = true;
                        }
                        if (i6 > this.f3684i / 2) {
                            z4 = true;
                        }
                        f5 = 0.0f;
                        i5 = 1;
                    }
                    break;
                }
            }
        }
        r(gVar);
        i();
    }

    public final void r(c cVar) {
        for (int i4 = 0; i4 < this.f3684i; i4++) {
            this.f3683h[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            i5++;
            if (i5 >= this.f3684i * 2) {
                return;
            }
            i iVar = cVar.f3669a;
            if (iVar != null) {
                this.f3683h[iVar.f3701c] = true;
            }
            i iVarD = cVar.d(this.f3683h);
            if (iVarD != null) {
                boolean[] zArr = this.f3683h;
                int i6 = iVarD.f3701c;
                if (zArr[i6]) {
                    return;
                } else {
                    zArr[i6] = true;
                }
            }
            if (iVarD != null) {
                float f5 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f3685j; i8++) {
                    c cVar2 = this.f3681f[i8];
                    if (cVar2.f3669a.f3711m != 1 && !cVar2.f3673e && cVar2.f3672d.f(iVarD)) {
                        float fC = cVar2.f3672d.c(iVarD);
                        if (fC < 0.0f) {
                            float f6 = (-cVar2.f3670b) / fC;
                            if (f6 < f5) {
                                i7 = i8;
                                f5 = f6;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    c cVar3 = this.f3681f[i7];
                    cVar3.f3669a.f3702d = -1;
                    cVar3.g(iVarD);
                    i iVar2 = cVar3.f3669a;
                    iVar2.f3702d = i7;
                    iVar2.e(this, cVar3);
                }
            } else {
                z4 = true;
            }
        }
    }

    public final void s() {
        for (int i4 = 0; i4 < this.f3685j; i4++) {
            c cVar = this.f3681f[i4];
            if (cVar != null) {
                ((e) this.f3687l.f2223b).b(cVar);
            }
            this.f3681f[i4] = null;
        }
    }

    public final void t() {
        g.h hVar;
        int i4 = 0;
        while (true) {
            hVar = this.f3687l;
            i[] iVarArr = (i[]) hVar.f2226e;
            if (i4 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i4];
            if (iVar != null) {
                iVar.c();
            }
            i4++;
        }
        e eVar = (e) hVar.f2225d;
        i[] iVarArr2 = this.f3688m;
        int length = this.f3689n;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i5 = 0; i5 < length; i5++) {
            i iVar2 = iVarArr2[i5];
            int i6 = eVar.f3693c;
            Object[] objArr = eVar.f3692b;
            if (i6 < objArr.length) {
                objArr[i6] = iVar2;
                eVar.f3693c = i6 + 1;
            }
        }
        this.f3689n = 0;
        Arrays.fill((i[]) hVar.f2226e, (Object) null);
        this.f3677b = 0;
        g gVar = this.f3678c;
        gVar.f3698h = 0;
        gVar.f3670b = 0.0f;
        this.f3684i = 1;
        for (int i7 = 0; i7 < this.f3685j; i7++) {
            c cVar = this.f3681f[i7];
        }
        s();
        this.f3685j = 0;
        this.f3690o = new c(hVar);
    }
}
