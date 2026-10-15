package r;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3989a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f3994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f3995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3999k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4006r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f3990b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3991c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4000l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4001m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4002n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4003o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4004p = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.f4006r = gVar;
        this.f3996h = 0;
        this.f3997i = 0;
        this.f3998j = 0;
        this.f3999k = 0;
        this.f4005q = 0;
        this.f3989a = i4;
        this.f3992d = cVar;
        this.f3993e = cVar2;
        this.f3994f = cVar3;
        this.f3995g = cVar4;
        this.f3996h = gVar.f4012w0;
        this.f3997i = gVar.f4008s0;
        this.f3998j = gVar.f4013x0;
        this.f3999k = gVar.f4009t0;
        this.f4005q = i5;
    }

    public final void a(d dVar) {
        int i4 = this.f3989a;
        g gVar = this.f4006r;
        if (i4 == 0) {
            int iU = gVar.U(this.f4005q, dVar);
            if (dVar.f3969p0[0] == 3) {
                this.f4004p++;
                iU = 0;
            }
            this.f4000l = iU + (dVar.f3951g0 != 8 ? gVar.P0 : 0) + this.f4000l;
            int iT = gVar.T(this.f4005q, dVar);
            if (this.f3990b == null || this.f3991c < iT) {
                this.f3990b = dVar;
                this.f3991c = iT;
                this.f4001m = iT;
            }
        } else {
            int iU2 = gVar.U(this.f4005q, dVar);
            int iT2 = gVar.T(this.f4005q, dVar);
            if (dVar.f3969p0[1] == 3) {
                this.f4004p++;
                iT2 = 0;
            }
            this.f4001m = iT2 + (dVar.f3951g0 != 8 ? gVar.Q0 : 0) + this.f4001m;
            if (this.f3990b == null || this.f3991c < iU2) {
                this.f3990b = dVar;
                this.f3991c = iU2;
                this.f4000l = iU2;
            }
        }
        this.f4003o++;
    }

    public final void b(int i4, boolean z4, boolean z5) {
        g gVar;
        int i5;
        int i6;
        d dVar;
        char c5;
        int i7;
        float f5;
        int i8;
        int i9;
        int i10 = this.f4003o;
        int i11 = 0;
        while (true) {
            gVar = this.f4006r;
            if (i11 >= i10 || (i9 = this.f4002n + i11) >= gVar.b1) {
                break;
            }
            d dVar2 = gVar.f4007a1[i9];
            if (dVar2 != null) {
                dVar2.E();
            }
            i11++;
        }
        if (i10 == 0 || this.f3990b == null) {
            return;
        }
        boolean z6 = z5 && i4 == 0;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = this.f4002n + (z4 ? (i10 - 1) - i14 : i14);
            if (i15 >= gVar.b1) {
                break;
            }
            d dVar3 = gVar.f4007a1[i15];
            if (dVar3 != null && dVar3.f3951g0 == 0) {
                if (i12 == -1) {
                    i12 = i14;
                }
                i13 = i14;
            }
        }
        if (this.f3989a != 0) {
            d dVar4 = this.f3990b;
            dVar4.f3955i0 = gVar.D0;
            int i16 = this.f3996h;
            if (i4 > 0) {
                i16 += gVar.P0;
            }
            c cVar = dVar4.I;
            c cVar2 = dVar4.K;
            if (z4) {
                cVar2.a(this.f3994f, i16);
                if (z5) {
                    cVar.a(this.f3992d, this.f3998j);
                }
                if (i4 > 0) {
                    this.f3994f.f3932d.I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f3992d, i16);
                if (z5) {
                    cVar2.a(this.f3994f, this.f3998j);
                }
                if (i4 > 0) {
                    this.f3992d.f3932d.K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = this.f4002n + i17;
                if (i18 >= gVar.b1) {
                    return;
                }
                d dVar6 = gVar.f4007a1[i18];
                if (dVar6 != null) {
                    c cVar3 = dVar6.J;
                    if (i17 == 0) {
                        dVar6.g(cVar3, this.f3993e, this.f3997i);
                        int i19 = gVar.E0;
                        float f6 = gVar.K0;
                        if (this.f4002n == 0) {
                            i6 = gVar.G0;
                            i5 = -1;
                            if (i6 != -1) {
                                f6 = gVar.M0;
                            }
                            dVar6.f3957j0 = i6;
                            dVar6.f3947e0 = f6;
                        } else {
                            i5 = -1;
                        }
                        if (!z5 || (i6 = gVar.I0) == i5) {
                            i6 = i19;
                        } else {
                            f6 = gVar.O0;
                        }
                        dVar6.f3957j0 = i6;
                        dVar6.f3947e0 = f6;
                    }
                    if (i17 == i10 - 1) {
                        dVar6.g(dVar6.L, this.f3995g, this.f3999k);
                    }
                    if (dVar5 != null) {
                        int i20 = gVar.Q0;
                        c cVar4 = dVar5.L;
                        cVar3.a(cVar4, i20);
                        if (i17 == i12) {
                            int i21 = this.f3997i;
                            if (cVar3.h()) {
                                cVar3.f3936h = i21;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i17 == i13 + 1) {
                            int i22 = this.f3999k;
                            if (cVar4.h()) {
                                cVar4.f3936h = i22;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.K;
                        c cVar6 = dVar6.I;
                        if (z4) {
                            int i23 = gVar.R0;
                            if (i23 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i23 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i23 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i24 = gVar.R0;
                            if (i24 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i24 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i24 == 2) {
                                if (z6) {
                                    cVar6.a(this.f3992d, this.f3996h);
                                    cVar5.a(this.f3994f, this.f3998j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f3990b;
        dVar7.f3957j0 = gVar.E0;
        int i25 = this.f3997i;
        if (i4 > 0) {
            i25 += gVar.Q0;
        }
        c cVar7 = this.f3993e;
        c cVar8 = dVar7.J;
        cVar8.a(cVar7, i25);
        c cVar9 = dVar7.L;
        if (z5) {
            cVar9.a(this.f3995g, this.f3999k);
        }
        if (i4 > 0) {
            this.f3993e.f3932d.L.a(cVar8, 0);
        }
        if (gVar.S0 != 3 || dVar7.E) {
            dVar = dVar7;
            break;
        }
        int i26 = 0;
        while (true) {
            if (i26 < i10) {
                int i27 = this.f4002n + (z4 ? (i10 - 1) - i26 : i26);
                if (i27 < gVar.b1) {
                    dVar = gVar.f4007a1[i27];
                    if (dVar.E) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
            dVar = dVar7;
            break;
        }
        int i28 = 0;
        d dVar8 = null;
        while (i28 < i10) {
            int i29 = z4 ? (i10 - 1) - i28 : i28;
            int i30 = this.f4002n + i29;
            if (i30 >= gVar.b1) {
                return;
            }
            d dVar9 = gVar.f4007a1[i30];
            if (dVar9 == null) {
                i10 = i10;
                c5 = 3;
            } else {
                c cVar10 = dVar9.I;
                if (i28 == 0) {
                    dVar9.g(cVar10, this.f3992d, this.f3996h);
                }
                if (i29 == 0) {
                    int i31 = gVar.D0;
                    float f7 = z4 ? 1.0f - gVar.J0 : gVar.J0;
                    if (this.f4002n == 0 && (i8 = gVar.F0) != -1) {
                        f5 = z4 ? 1.0f - gVar.L0 : gVar.L0;
                        i7 = i8;
                    } else if (!z5 || (i7 = gVar.H0) == -1) {
                        i7 = i31;
                        f5 = f7;
                    } else {
                        f5 = z4 ? 1.0f - gVar.N0 : gVar.N0;
                    }
                    dVar9.f3955i0 = i7;
                    dVar9.f3945d0 = f5;
                }
                if (i28 == i10 - 1) {
                    dVar9.g(dVar9.K, this.f3994f, this.f3998j);
                }
                if (dVar8 != null) {
                    int i32 = gVar.P0;
                    c cVar11 = dVar8.K;
                    cVar10.a(cVar11, i32);
                    if (i28 == i12) {
                        int i33 = this.f3996h;
                        if (cVar10.h()) {
                            cVar10.f3936h = i33;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i28 == i13 + 1) {
                        int i34 = this.f3998j;
                        if (cVar11.h()) {
                            cVar11.f3936h = i34;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i35 = gVar.S0;
                    c5 = 3;
                    if (i35 == 3 && dVar.E && dVar9 != dVar && dVar9.E) {
                        dVar9.M.a(dVar.M, 0);
                    } else {
                        c cVar12 = dVar9.J;
                        if (i35 != 0) {
                            c cVar13 = dVar9.L;
                            if (i35 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z6) {
                                cVar12.a(this.f3993e, this.f3997i);
                                cVar13.a(this.f3995g, this.f3999k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c5 = 3;
                }
                dVar8 = dVar9;
            }
            i28++;
            i10 = i10;
        }
    }

    public final int c() {
        return this.f3989a == 1 ? this.f4001m - this.f4006r.Q0 : this.f4001m;
    }

    public final int d() {
        return this.f3989a == 0 ? this.f4000l - this.f4006r.P0 : this.f4000l;
    }

    public final void e(int i4) {
        g gVar;
        int i5;
        int i6 = this.f4004p;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f4003o;
        int i8 = i4 / i6;
        int i9 = 0;
        while (true) {
            gVar = this.f4006r;
            if (i9 >= i7 || (i5 = this.f4002n + i9) >= gVar.b1) {
                break;
            }
            d dVar = gVar.f4007a1[i5];
            if (this.f3989a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f3969p0;
                    if (iArr[0] == 3 && dVar.f3971r == 0) {
                        gVar.V(dVar, 1, i8, iArr[1], dVar.l());
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f3969p0;
                if (iArr2[1] == 3 && dVar.f3972s == 0) {
                    gVar.V(dVar, iArr2[0], dVar.r(), 1, i8);
                }
            }
            i9++;
        }
        this.f4000l = 0;
        this.f4001m = 0;
        this.f3990b = null;
        this.f3991c = 0;
        int i10 = this.f4003o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f4002n + i11;
            if (i12 >= gVar.b1) {
                return;
            }
            d dVar2 = gVar.f4007a1[i12];
            if (this.f3989a == 0) {
                int iR = dVar2.r();
                int i13 = gVar.P0;
                if (dVar2.f3951g0 == 8) {
                    i13 = 0;
                }
                this.f4000l = iR + i13 + this.f4000l;
                int iT = gVar.T(this.f4005q, dVar2);
                if (this.f3990b == null || this.f3991c < iT) {
                    this.f3990b = dVar2;
                    this.f3991c = iT;
                    this.f4001m = iT;
                }
            } else {
                int iU = gVar.U(this.f4005q, dVar2);
                int iT2 = gVar.T(this.f4005q, dVar2);
                int i14 = gVar.Q0;
                if (dVar2.f3951g0 == 8) {
                    i14 = 0;
                }
                this.f4001m = iT2 + i14 + this.f4001m;
                if (this.f3990b == null || this.f3991c < iU) {
                    this.f3990b = dVar2;
                    this.f3991c = iU;
                    this.f4000l = iU;
                }
            }
        }
    }

    public final void f(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i6, int i7, int i8, int i9) {
        this.f3989a = i4;
        this.f3992d = cVar;
        this.f3993e = cVar2;
        this.f3994f = cVar3;
        this.f3995g = cVar4;
        this.f3996h = i5;
        this.f3997i = i6;
        this.f3998j = i7;
        this.f3999k = i8;
        this.f4005q = i9;
    }
}
