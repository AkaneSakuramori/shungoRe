package s;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f4168k = new int[2];

    public static void m(int[] iArr, int i4, int i5, int i6, int i7, float f5, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f5) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f5) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f5) + 0.5f);
        int i12 = (int) ((i9 / f5) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x0276  */
    @Override // s.d
    public final void a(d dVar) {
        int iG;
        int i4;
        int iG2;
        float f5;
        float f6;
        float f7;
        int i5;
        if (p.h.a(this.f4196j) == 3) {
            r.d dVar2 = this.f4188b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f4191e;
        boolean z4 = gVar.f4163j;
        f fVar = this.f4194h;
        f fVar2 = this.f4195i;
        if (!z4 && this.f4190d == 3) {
            r.d dVar3 = this.f4188b;
            int i6 = dVar3.f3971r;
            if (i6 == 2) {
                r.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f3944d.f4191e;
                    if (gVar2.f4163j) {
                        gVar.d((int) ((gVar2.f4160g * dVar3.f3976w) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                int i7 = dVar3.f3972s;
                if (i7 == 0 || i7 == 3) {
                    m mVar = dVar3.f3946e;
                    f fVar3 = mVar.f4194h;
                    f fVar4 = mVar.f4195i;
                    boolean z5 = dVar3.I.f3934f != null;
                    boolean z6 = dVar3.J.f3934f != null;
                    boolean z7 = dVar3.K.f3934f != null;
                    boolean z8 = dVar3.L.f3934f != null;
                    int i8 = dVar3.X;
                    if (z5 && z6 && z7 && z8) {
                        float f8 = dVar3.W;
                        boolean z9 = fVar3.f4163j;
                        int[] iArr = f4168k;
                        if (z9 && fVar4.f4163j) {
                            if (fVar.f4156c && fVar2.f4156c) {
                                m(iArr, ((f) fVar.f4165l.get(0)).f4160g + fVar.f4159f, ((f) fVar2.f4165l.get(0)).f4160g - fVar2.f4159f, fVar3.f4160g + fVar3.f4159f, fVar4.f4160g - fVar4.f4159f, f8, i8);
                                gVar.d(iArr[0]);
                                this.f4188b.f3946e.f4191e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z10 = fVar.f4163j;
                        ArrayList arrayList = fVar3.f4165l;
                        if (z10 && fVar2.f4163j) {
                            if (!fVar3.f4156c || !fVar4.f4156c) {
                                return;
                            }
                            m(iArr, fVar.f4160g + fVar.f4159f, fVar2.f4160g - fVar2.f4159f, ((f) arrayList.get(0)).f4160g + fVar3.f4159f, ((f) fVar4.f4165l.get(0)).f4160g - fVar4.f4159f, f8, i8);
                            gVar.d(iArr[0]);
                            this.f4188b.f3946e.f4191e.d(iArr[1]);
                        }
                        if (!fVar.f4156c || !fVar2.f4156c || !fVar3.f4156c || !fVar4.f4156c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f4165l.get(0)).f4160g + fVar.f4159f, ((f) fVar2.f4165l.get(0)).f4160g - fVar2.f4159f, ((f) arrayList.get(0)).f4160g + fVar3.f4159f, ((f) fVar4.f4165l.get(0)).f4160g - fVar4.f4159f, f8, i8);
                        gVar.d(iArr[0]);
                        this.f4188b.f3946e.f4191e.d(iArr[1]);
                    } else if (z5 && z7) {
                        if (!fVar.f4156c || !fVar2.f4156c) {
                            return;
                        }
                        float f9 = dVar3.W;
                        int i9 = ((f) fVar.f4165l.get(0)).f4160g + fVar.f4159f;
                        int i10 = ((f) fVar2.f4165l.get(0)).f4160g - fVar2.f4159f;
                        if (i8 == -1 || i8 == 0) {
                            int iG3 = g(i10 - i9, 0);
                            int i11 = (int) ((iG3 * f9) + 0.5f);
                            int iG4 = g(i11, 1);
                            if (i11 != iG4) {
                                iG3 = (int) ((iG4 / f9) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f4188b.f3946e.f4191e.d(iG4);
                        } else if (i8 == 1) {
                            int iG5 = g(i10 - i9, 0);
                            int i12 = (int) ((iG5 / f9) + 0.5f);
                            int iG6 = g(i12, 1);
                            if (i12 != iG6) {
                                iG5 = (int) ((iG6 * f9) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f4188b.f3946e.f4191e.d(iG6);
                        }
                    } else if (z6 && z8) {
                        if (!fVar3.f4156c || !fVar4.f4156c) {
                            return;
                        }
                        float f10 = dVar3.W;
                        int i13 = ((f) fVar3.f4165l.get(0)).f4160g + fVar3.f4159f;
                        int i14 = ((f) fVar4.f4165l.get(0)).f4160g - fVar4.f4159f;
                        if (i8 == -1) {
                            iG = g(i14 - i13, 1);
                            i4 = (int) ((iG / f10) + 0.5f);
                            iG2 = g(i4, 0);
                            if (i4 != iG2) {
                                iG = (int) ((iG2 * f10) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f4188b.f3946e.f4191e.d(iG);
                        } else if (i8 == 0) {
                            int iG7 = g(i14 - i13, 1);
                            int i15 = (int) ((iG7 * f10) + 0.5f);
                            int iG8 = g(i15, 0);
                            if (i15 != iG8) {
                                iG7 = (int) ((iG8 / f10) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f4188b.f3946e.f4191e.d(iG7);
                        } else if (i8 == 1) {
                            iG = g(i14 - i13, 1);
                            i4 = (int) ((iG / f10) + 0.5f);
                            iG2 = g(i4, 0);
                            if (i4 != iG2) {
                                iG = (int) ((iG2 * f10) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f4188b.f3946e.f4191e.d(iG);
                        }
                    }
                } else {
                    int i16 = dVar3.X;
                    if (i16 != -1) {
                        if (i16 == 0) {
                            f7 = dVar3.f3946e.f4191e.f4160g / dVar3.W;
                            i5 = (int) (f7 + 0.5f);
                        } else if (i16 != 1) {
                            i5 = 0;
                        } else {
                            f5 = dVar3.f3946e.f4191e.f4160g;
                            f6 = dVar3.W;
                        }
                        gVar.d(i5);
                    } else {
                        f5 = dVar3.f3946e.f4191e.f4160g;
                        f6 = dVar3.W;
                    }
                    f7 = f5 * f6;
                    i5 = (int) (f7 + 0.5f);
                    gVar.d(i5);
                }
            }
        }
        if (fVar.f4156c && fVar2.f4156c) {
            if (fVar.f4163j && fVar2.f4163j && gVar.f4163j) {
                return;
            }
            if (!gVar.f4163j && this.f4190d == 3) {
                r.d dVar5 = this.f4188b;
                if (dVar5.f3971r == 0 && !dVar5.y()) {
                    f fVar5 = (f) fVar.f4165l.get(0);
                    f fVar6 = (f) fVar2.f4165l.get(0);
                    int i17 = fVar5.f4160g + fVar.f4159f;
                    int i18 = fVar6.f4160g + fVar2.f4159f;
                    fVar.d(i17);
                    fVar2.d(i18);
                    gVar.d(i18 - i17);
                    return;
                }
            }
            if (!gVar.f4163j && this.f4190d == 3 && this.f4187a == 1 && fVar.f4165l.size() > 0 && fVar2.f4165l.size() > 0) {
                int iMin = Math.min((((f) fVar2.f4165l.get(0)).f4160g + fVar2.f4159f) - (((f) fVar.f4165l.get(0)).f4160g + fVar.f4159f), gVar.f4166m);
                r.d dVar6 = this.f4188b;
                int i19 = dVar6.f3975v;
                int iMax = Math.max(dVar6.f3974u, iMin);
                if (i19 > 0) {
                    iMax = Math.min(i19, iMax);
                }
                gVar.d(iMax);
            }
            if (gVar.f4163j) {
                f fVar7 = (f) fVar.f4165l.get(0);
                f fVar8 = (f) fVar2.f4165l.get(0);
                int i20 = fVar7.f4160g;
                int i21 = fVar.f4159f + i20;
                int i22 = fVar8.f4160g;
                int i23 = fVar2.f4159f + i22;
                float f11 = this.f4188b.f3945d0;
                if (fVar7 == fVar8) {
                    f11 = 0.5f;
                } else {
                    i20 = i21;
                    i22 = i23;
                }
                fVar.d((int) ((((i22 - i20) - gVar.f4160g) * f11) + i20 + 0.5f));
                fVar2.d(fVar.f4160g + gVar.f4160g);
            }
        }
    }

    @Override // s.p
    public final void d() {
        r.d dVar;
        r.d dVar2;
        int i4;
        r.d dVar3;
        r.d dVar4;
        int i5;
        r.d dVar5 = this.f4188b;
        boolean z4 = dVar5.f3938a;
        g gVar = this.f4191e;
        if (z4) {
            gVar.d(dVar5.r());
        }
        boolean z5 = gVar.f4163j;
        f fVar = this.f4195i;
        f fVar2 = this.f4194h;
        if (!z5) {
            r.d dVar6 = this.f4188b;
            int i6 = dVar6.f3969p0[0];
            this.f4190d = i6;
            if (i6 != 3) {
                if (i6 == 4 && (dVar4 = dVar6.T) != null && ((i5 = dVar4.f3969p0[0]) == 1 || i5 == 4)) {
                    int iR = (dVar4.r() - this.f4188b.I.e()) - this.f4188b.K.e();
                    p.b(fVar2, dVar4.f3944d.f4194h, this.f4188b.I.e());
                    p.b(fVar, dVar4.f3944d.f4195i, -this.f4188b.K.e());
                    gVar.d(iR);
                    return;
                }
                if (i6 == 1) {
                    gVar.d(dVar6.r());
                }
            }
        } else if (this.f4190d == 4 && (dVar2 = (dVar = this.f4188b).T) != null && ((i4 = dVar2.f3969p0[0]) == 1 || i4 == 4)) {
            p.b(fVar2, dVar2.f3944d.f4194h, dVar.I.e());
            p.b(fVar, dVar2.f3944d.f4195i, -this.f4188b.K.e());
            return;
        }
        if (gVar.f4163j) {
            r.d dVar7 = this.f4188b;
            if (dVar7.f3938a) {
                r.c[] cVarArr = dVar7.Q;
                r.c cVar = cVarArr[0];
                r.c cVar2 = cVar.f3934f;
                if (cVar2 != null && cVarArr[1].f3934f != null) {
                    if (dVar7.y()) {
                        fVar2.f4159f = this.f4188b.Q[0].e();
                        fVar.f4159f = -this.f4188b.Q[1].e();
                        return;
                    }
                    f fVarH = p.h(this.f4188b.Q[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f4188b.Q[0].e());
                    }
                    f fVarH2 = p.h(this.f4188b.Q[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f4188b.Q[1].e());
                    }
                    fVar2.f4155b = true;
                    fVar.f4155b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f4188b.Q[0].e());
                        p.b(fVar, fVar2, gVar.f4160g);
                        return;
                    }
                    return;
                }
                r.c cVar3 = cVarArr[1];
                if (cVar3.f3934f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f4188b.Q[1].e());
                        p.b(fVar2, fVar, -gVar.f4160g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof r.i) || dVar7.T == null || dVar7.j(7).f3934f != null) {
                    return;
                }
                r.d dVar8 = this.f4188b;
                p.b(fVar2, dVar8.T.f3944d.f4194h, dVar8.s());
                p.b(fVar, fVar2, gVar.f4160g);
                return;
            }
        }
        if (this.f4190d == 3) {
            r.d dVar9 = this.f4188b;
            int i7 = dVar9.f3971r;
            if (i7 == 2) {
                r.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3946e.f4191e;
                    gVar.f4165l.add(gVar2);
                    gVar2.f4164k.add(gVar);
                    gVar.f4155b = true;
                    gVar.f4164k.add(fVar2);
                    gVar.f4164k.add(fVar);
                }
            } else if (i7 == 3) {
                if (dVar9.f3972s == 3) {
                    fVar2.f4154a = this;
                    fVar.f4154a = this;
                    m mVar = dVar9.f3946e;
                    mVar.f4194h.f4154a = this;
                    mVar.f4195i.f4154a = this;
                    gVar.f4154a = this;
                    if (dVar9.z()) {
                        gVar.f4165l.add(this.f4188b.f3946e.f4191e);
                        this.f4188b.f3946e.f4191e.f4164k.add(gVar);
                        m mVar2 = this.f4188b.f3946e;
                        mVar2.f4191e.f4154a = this;
                        gVar.f4165l.add(mVar2.f4194h);
                        gVar.f4165l.add(this.f4188b.f3946e.f4195i);
                        this.f4188b.f3946e.f4194h.f4164k.add(gVar);
                        this.f4188b.f3946e.f4195i.f4164k.add(gVar);
                    } else if (this.f4188b.y()) {
                        this.f4188b.f3946e.f4191e.f4165l.add(gVar);
                        gVar.f4164k.add(this.f4188b.f3946e.f4191e);
                    } else {
                        this.f4188b.f3946e.f4191e.f4165l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3946e.f4191e;
                    gVar.f4165l.add(gVar3);
                    gVar3.f4164k.add(gVar);
                    this.f4188b.f3946e.f4194h.f4164k.add(gVar);
                    this.f4188b.f3946e.f4195i.f4164k.add(gVar);
                    gVar.f4155b = true;
                    gVar.f4164k.add(fVar2);
                    gVar.f4164k.add(fVar);
                    fVar2.f4165l.add(gVar);
                    fVar.f4165l.add(gVar);
                }
            }
        }
        r.d dVar11 = this.f4188b;
        r.c[] cVarArr2 = dVar11.Q;
        r.c cVar4 = cVarArr2[0];
        r.c cVar5 = cVar4.f3934f;
        if (cVar5 != null && cVarArr2[1].f3934f != null) {
            if (dVar11.y()) {
                fVar2.f4159f = this.f4188b.Q[0].e();
                fVar.f4159f = -this.f4188b.Q[1].e();
                return;
            }
            f fVarH5 = p.h(this.f4188b.Q[0]);
            f fVarH6 = p.h(this.f4188b.Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f4196j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = p.h(cVar4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f4188b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        r.c cVar6 = cVarArr2[1];
        if (cVar6.f3934f != null) {
            f fVarH8 = p.h(cVar6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f4188b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof r.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        p.b(fVar2, dVar3.f3944d.f4194h, dVar11.s());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // s.p
    public final void e() {
        f fVar = this.f4194h;
        if (fVar.f4163j) {
            this.f4188b.Y = fVar.f4160g;
        }
    }

    @Override // s.p
    public final void f() {
        this.f4189c = null;
        this.f4194h.c();
        this.f4195i.c();
        this.f4191e.c();
        this.f4193g = false;
    }

    @Override // s.p
    public final boolean k() {
        return this.f4190d != 3 || this.f4188b.f3971r == 0;
    }

    public final void n() {
        this.f4193g = false;
        f fVar = this.f4194h;
        fVar.c();
        fVar.f4163j = false;
        f fVar2 = this.f4195i;
        fVar2.c();
        fVar2.f4163j = false;
        this.f4191e.f4163j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4188b.f3953h0;
    }
}
