package r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3908s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f3909t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3910u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f3911v0;

    @Override // r.d
    public final boolean B() {
        return this.f3911v0;
    }

    @Override // r.d
    public final boolean C() {
        return this.f3911v0;
    }

    public final boolean T() {
        int i4;
        int i5;
        int i6;
        boolean z4 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f4023r0;
            if (i7 >= i4) {
                break;
            }
            d dVar = this.f4022q0[i7];
            if ((this.f3909t0 || dVar.d()) && ((((i5 = this.f3908s0) == 0 || i5 == 1) && !dVar.B()) || (((i6 = this.f3908s0) == 2 || i6 == 3) && !dVar.C()))) {
                z4 = false;
            }
            i7++;
        }
        if (!z4 || i4 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z5 = false;
        for (int i8 = 0; i8 < this.f4023r0; i8++) {
            d dVar2 = this.f4022q0[i8];
            if (this.f3909t0 || dVar2.d()) {
                if (!z5) {
                    int i9 = this.f3908s0;
                    if (i9 == 0) {
                        iMax = dVar2.j(2).d();
                    } else if (i9 == 1) {
                        iMax = dVar2.j(4).d();
                    } else if (i9 == 2) {
                        iMax = dVar2.j(3).d();
                    } else if (i9 == 3) {
                        iMax = dVar2.j(5).d();
                    }
                    z5 = true;
                }
                int i10 = this.f3908s0;
                if (i10 == 0) {
                    iMax = Math.min(iMax, dVar2.j(2).d());
                } else if (i10 == 1) {
                    iMax = Math.max(iMax, dVar2.j(4).d());
                } else if (i10 == 2) {
                    iMax = Math.min(iMax, dVar2.j(3).d());
                } else if (i10 == 3) {
                    iMax = Math.max(iMax, dVar2.j(5).d());
                }
            }
        }
        int i11 = iMax + this.f3910u0;
        int i12 = this.f3908s0;
        if (i12 == 0 || i12 == 1) {
            K(i11, i11);
        } else {
            L(i11, i11);
        }
        this.f3911v0 = true;
        return true;
    }

    public final int U() {
        int i4 = this.f3908s0;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    @Override // r.d
    public final void c(p.d dVar, boolean z4) {
        boolean z5;
        int i4;
        int i5;
        c[] cVarArr = this.Q;
        c cVar = this.I;
        cVarArr[0] = cVar;
        c cVar2 = this.J;
        int i6 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.K;
        cVarArr[1] = cVar3;
        c cVar4 = this.L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f3937i = dVar.k(cVar5);
        }
        int i7 = this.f3908s0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i7];
        if (!this.f3911v0) {
            T();
        }
        if (this.f3911v0) {
            this.f3911v0 = false;
            int i8 = this.f3908s0;
            if (i8 == 0 || i8 == 1) {
                dVar.d(cVar.f3937i, this.Y);
                dVar.d(cVar3.f3937i, this.Y);
                return;
            } else {
                if (i8 == 2 || i8 == 3) {
                    dVar.d(cVar2.f3937i, this.Z);
                    dVar.d(cVar4.f3937i, this.Z);
                    return;
                }
                return;
            }
        }
        int i9 = 0;
        while (true) {
            if (i9 >= this.f4023r0) {
                z5 = false;
                break;
            }
            d dVar2 = this.f4022q0[i9];
            if ((this.f3909t0 || dVar2.d()) && ((((i5 = this.f3908s0) == 0 || i5 == 1) && dVar2.f3969p0[0] == 3 && dVar2.I.f3934f != null && dVar2.K.f3934f != null) || ((i5 == 2 || i5 == 3) && dVar2.f3969p0[1] == 3 && dVar2.J.f3934f != null && dVar2.L.f3934f != null))) {
                z5 = true;
                break;
            }
            i9++;
        }
        boolean z6 = cVar.g() || cVar3.g();
        boolean z7 = cVar2.g() || cVar4.g();
        int i10 = (z5 || !(((i4 = this.f3908s0) == 0 && z6) || ((i4 == 2 && z7) || ((i4 == 1 && z6) || (i4 == 3 && z7))))) ? 4 : 5;
        int i11 = 0;
        while (i11 < this.f4023r0) {
            d dVar3 = this.f4022q0[i11];
            if (this.f3909t0 || dVar3.d()) {
                p.i iVarK = dVar.k(dVar3.Q[this.f3908s0]);
                int i12 = this.f3908s0;
                c cVar7 = dVar3.Q[i12];
                cVar7.f3937i = iVarK;
                c cVar8 = cVar7.f3934f;
                int i13 = (cVar8 == null || cVar8.f3932d != this) ? 0 : cVar7.f3935g;
                if (i12 == 0 || i12 == i6) {
                    p.i iVar = cVar6.f3937i;
                    int i14 = this.f3910u0 - i13;
                    p.c cVarL = dVar.l();
                    p.i iVarM = dVar.m();
                    iVarM.f3703e = 0;
                    cVarL.c(iVar, iVarK, iVarM, i14);
                    dVar.c(cVarL);
                } else {
                    p.i iVar2 = cVar6.f3937i;
                    int i15 = this.f3910u0 + i13;
                    p.c cVarL2 = dVar.l();
                    p.i iVarM2 = dVar.m();
                    iVarM2.f3703e = 0;
                    cVarL2.b(iVar2, iVarK, iVarM2, i15);
                    dVar.c(cVarL2);
                }
                dVar.e(cVar6.f3937i, iVarK, this.f3910u0 + i13, i10);
            }
            i11++;
            i6 = 2;
        }
        int i16 = this.f3908s0;
        if (i16 == 0) {
            dVar.e(cVar3.f3937i, cVar.f3937i, 0, 8);
            dVar.e(cVar.f3937i, this.T.K.f3937i, 0, 4);
            dVar.e(cVar.f3937i, this.T.I.f3937i, 0, 0);
            return;
        }
        if (i16 == 1) {
            dVar.e(cVar.f3937i, cVar3.f3937i, 0, 8);
            dVar.e(cVar.f3937i, this.T.I.f3937i, 0, 4);
            dVar.e(cVar.f3937i, this.T.K.f3937i, 0, 0);
        } else if (i16 == 2) {
            dVar.e(cVar4.f3937i, cVar2.f3937i, 0, 8);
            dVar.e(cVar2.f3937i, this.T.L.f3937i, 0, 4);
            dVar.e(cVar2.f3937i, this.T.J.f3937i, 0, 0);
        } else if (i16 == 3) {
            dVar.e(cVar2.f3937i, cVar4.f3937i, 0, 8);
            dVar.e(cVar2.f3937i, this.T.J.f3937i, 0, 4);
            dVar.e(cVar2.f3937i, this.T.L.f3937i, 0, 0);
        }
    }

    @Override // r.d
    public final boolean d() {
        return true;
    }

    @Override // r.d
    public final String toString() {
        String strH = defpackage.a.h(new StringBuilder("[Barrier] "), this.f3953h0, " {");
        for (int i4 = 0; i4 < this.f4023r0; i4++) {
            d dVar = this.f4022q0[i4];
            if (i4 > 0) {
                strH = defpackage.a.f(strH, ", ");
            }
            strH = strH + dVar.f3953h0;
        }
        return defpackage.a.f(strH, "}");
    }
}
