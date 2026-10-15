package s;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4145l;

    public c(int i4, r.d dVar) {
        r.d dVar2;
        super(dVar);
        this.f4144k = new ArrayList();
        this.f4192f = i4;
        r.d dVar3 = this.f4188b;
        r.d dVarN = dVar3.n(i4);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarN;
            if (dVar3 == null) {
                break;
            } else {
                dVarN = dVar3.n(this.f4192f);
            }
        }
        this.f4188b = dVar2;
        int i5 = this.f4192f;
        p pVar = i5 == 0 ? dVar2.f3944d : i5 == 1 ? dVar2.f3946e : null;
        ArrayList<p> arrayList = this.f4144k;
        arrayList.add(pVar);
        r.d dVarM = dVar2.m(this.f4192f);
        while (dVarM != null) {
            int i6 = this.f4192f;
            arrayList.add(i6 == 0 ? dVarM.f3944d : i6 == 1 ? dVarM.f3946e : null);
            dVarM = dVarM.m(this.f4192f);
        }
        for (p pVar2 : arrayList) {
            int i7 = this.f4192f;
            if (i7 == 0) {
                pVar2.f4188b.f3940b = this;
            } else if (i7 == 1) {
                pVar2.f4188b.f3942c = this;
            }
        }
        if (this.f4192f == 0 && ((r.e) this.f4188b.T).f3984v0 && arrayList.size() > 1) {
            this.f4188b = ((p) arrayList.get(arrayList.size() - 1)).f4188b;
        }
        this.f4145l = this.f4192f == 0 ? this.f4188b.f3955i0 : this.f4188b.f3957j0;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    @Override // s.d
    public final void a(d dVar) {
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        int i9;
        float f5;
        int i10;
        boolean z4;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f6;
        f fVar = this.f4194h;
        if (fVar.f4163j) {
            f fVar2 = this.f4195i;
            if (fVar2.f4163j) {
                r.d dVar2 = this.f4188b.T;
                boolean z5 = dVar2 instanceof r.e ? ((r.e) dVar2).f3984v0 : false;
                int i19 = fVar2.f4160g - fVar.f4160g;
                ArrayList arrayList3 = this.f4144k;
                int size = arrayList3.size();
                int i20 = 0;
                while (true) {
                    i4 = -1;
                    i5 = 8;
                    if (i20 >= size) {
                        i20 = -1;
                        break;
                    } else if (((p) arrayList3.get(i20)).f4188b.f3951g0 != 8) {
                        break;
                    } else {
                        i20++;
                    }
                }
                int i21 = size - 1;
                for (int i22 = i21; i22 >= 0; i22--) {
                    if (((p) arrayList3.get(i22)).f4188b.f3951g0 != 8) {
                        i4 = i22;
                        break;
                    }
                }
                int i23 = 0;
                while (true) {
                    if (i23 >= 2) {
                        arrayList = arrayList3;
                        i6 = i20;
                        i7 = 0;
                        i8 = 0;
                        i9 = 0;
                        f5 = 0.0f;
                        break;
                    }
                    int i24 = 0;
                    i9 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    f5 = 0.0f;
                    while (i24 < size) {
                        p pVar = (p) arrayList3.get(i24);
                        r.d dVar3 = pVar.f4188b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar3.f3951g0 == i5) {
                            i17 = i20;
                        } else {
                            i26++;
                            if (i24 > 0 && i24 >= i20) {
                                i9 += pVar.f4194h.f4159f;
                            }
                            g gVar = pVar.f4191e;
                            int i27 = gVar.f4160g;
                            i17 = i20;
                            boolean z6 = pVar.f4190d != 3;
                            if (z6) {
                                int i28 = this.f4192f;
                                if (i28 == 0 && !dVar3.f3944d.f4191e.f4163j) {
                                    return;
                                }
                                if (i28 == 1 && !dVar3.f3946e.f4191e.f4163j) {
                                    return;
                                }
                            } else {
                                if (pVar.f4187a == 1 && i23 == 0) {
                                    i18 = gVar.f4166m;
                                    i25++;
                                } else {
                                    if (gVar.f4163j) {
                                        i18 = i27;
                                    }
                                    if (z6) {
                                        i9 += i18;
                                    } else {
                                        i25++;
                                        f6 = dVar3.f3959k0[this.f4192f];
                                        if (f6 >= 0.0f) {
                                            f5 += f6;
                                        }
                                    }
                                    if (i24 >= i21 && i24 < i4) {
                                        i9 += -pVar.f4195i.f4159f;
                                    }
                                }
                                z6 = true;
                                if (z6) {
                                    i25++;
                                    f6 = dVar3.f3959k0[this.f4192f];
                                    if (f6 >= 0.0f) {
                                        f5 += f6;
                                    }
                                } else {
                                    i9 += i18;
                                }
                                if (i24 >= i21) {
                                }
                            }
                            i18 = i27;
                            if (z6) {
                                i25++;
                                f6 = dVar3.f3959k0[this.f4192f];
                                if (f6 >= 0.0f) {
                                    f5 += f6;
                                }
                            } else {
                                i9 += i18;
                            }
                            if (i24 >= i21) {
                            }
                        }
                        i24++;
                        arrayList3 = arrayList4;
                        i20 = i17;
                        i5 = 8;
                    }
                    arrayList = arrayList3;
                    i6 = i20;
                    if (i9 < i19 || i25 == 0) {
                        i7 = i25;
                        i8 = i26;
                        break;
                    } else {
                        i23++;
                        arrayList3 = arrayList;
                        i20 = i6;
                        i5 = 8;
                    }
                }
                int i29 = fVar.f4160g;
                if (z5) {
                    i29 = fVar2.f4160g;
                }
                if (i9 > i19) {
                    i29 = z5 ? i29 + ((int) (((i9 - i19) / 2.0f) + 0.5f)) : i29 - ((int) (((i9 - i19) / 2.0f) + 0.5f));
                }
                if (i7 > 0) {
                    float f7 = i19 - i9;
                    int i30 = (int) ((f7 / i7) + 0.5f);
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < size) {
                        ArrayList arrayList5 = arrayList;
                        p pVar2 = (p) arrayList5.get(i31);
                        int i33 = i30;
                        r.d dVar4 = pVar2.f4188b;
                        int i34 = i9;
                        int i35 = i29;
                        if (dVar4.f3951g0 != 8 && pVar2.f4190d == 3) {
                            g gVar2 = pVar2.f4191e;
                            if (gVar2.f4163j) {
                                z5 = z5;
                            } else {
                                int i36 = f5 > 0.0f ? (int) (((dVar4.f3959k0[this.f4192f] * f7) / f5) + 0.5f) : i33;
                                if (this.f4192f == 0) {
                                    i15 = dVar4.f3975v;
                                    i16 = dVar4.f3974u;
                                } else {
                                    i15 = dVar4.f3978y;
                                    i16 = dVar4.f3977x;
                                }
                                int iMax = Math.max(i16, pVar2.f4187a == 1 ? Math.min(i36, gVar2.f4166m) : i36);
                                if (i15 > 0) {
                                    iMax = Math.min(i15, iMax);
                                }
                                if (iMax != i36) {
                                    i32++;
                                    i36 = iMax;
                                }
                                gVar2.d(i36);
                            }
                        } else {
                            z5 = z5;
                        }
                        i31++;
                        i30 = i33;
                        i9 = i34;
                        i29 = i35;
                        z5 = z5;
                        f7 = f7;
                        arrayList = arrayList5;
                    }
                    i10 = i29;
                    z4 = z5;
                    arrayList2 = arrayList;
                    int i37 = i9;
                    if (i32 > 0) {
                        i7 -= i32;
                        int i38 = 0;
                        i9 = 0;
                        while (i38 < size) {
                            p pVar3 = (p) arrayList2.get(i38);
                            if (pVar3.f4188b.f3951g0 == 8) {
                                i14 = i6;
                            } else {
                                i14 = i6;
                                if (i38 > 0 && i38 >= i14) {
                                    i9 += pVar3.f4194h.f4159f;
                                }
                                i9 += pVar3.f4191e.f4160g;
                                if (i38 < i21 && i38 < i4) {
                                    i9 += -pVar3.f4195i.f4159f;
                                }
                            }
                            i38++;
                            i6 = i14;
                        }
                        i11 = i6;
                    } else {
                        i11 = i6;
                        i9 = i37;
                    }
                    i13 = 2;
                    if (this.f4145l == 2 && i32 == 0) {
                        i12 = 0;
                        this.f4145l = 0;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i10 = i29;
                    z4 = z5;
                    arrayList2 = arrayList;
                    i11 = i6;
                    i12 = 0;
                    i13 = 2;
                }
                if (i9 > i19) {
                    this.f4145l = i13;
                }
                if (i8 > 0 && i7 == 0 && i11 == i4) {
                    this.f4145l = i13;
                }
                int i39 = this.f4145l;
                if (i39 == 1) {
                    int i40 = i8 > 1 ? (i19 - i9) / (i8 - 1) : i8 == 1 ? (i19 - i9) / 2 : i12;
                    if (i7 > 0) {
                        i40 = i12;
                    }
                    int i41 = i10;
                    for (int i42 = i12; i42 < size; i42++) {
                        p pVar4 = (p) arrayList2.get(z4 ? size - (i42 + 1) : i42);
                        int i43 = pVar4.f4188b.f3951g0;
                        f fVar3 = pVar4.f4195i;
                        f fVar4 = pVar4.f4194h;
                        if (i43 == 8) {
                            fVar4.d(i41);
                            fVar3.d(i41);
                        } else {
                            if (i42 > 0) {
                                i41 = z4 ? i41 - i40 : i41 + i40;
                            }
                            if (i42 > 0 && i42 >= i11) {
                                i41 = z4 ? i41 - fVar4.f4159f : i41 + fVar4.f4159f;
                            }
                            if (z4) {
                                fVar3.d(i41);
                            } else {
                                fVar4.d(i41);
                            }
                            g gVar3 = pVar4.f4191e;
                            int i44 = gVar3.f4160g;
                            if (pVar4.f4190d == 3 && pVar4.f4187a == 1) {
                                i44 = gVar3.f4166m;
                            }
                            i41 = z4 ? i41 - i44 : i41 + i44;
                            if (z4) {
                                fVar4.d(i41);
                            } else {
                                fVar3.d(i41);
                            }
                            pVar4.f4193g = true;
                            if (i42 < i21 && i42 < i4) {
                                i41 = z4 ? i41 - (-fVar3.f4159f) : i41 + (-fVar3.f4159f);
                            }
                        }
                    }
                    return;
                }
                if (i39 == 0) {
                    int i45 = (i19 - i9) / (i8 + 1);
                    if (i7 > 0) {
                        i45 = i12;
                    }
                    int i46 = i10;
                    for (int i47 = i12; i47 < size; i47++) {
                        p pVar5 = (p) arrayList2.get(z4 ? size - (i47 + 1) : i47);
                        int i48 = pVar5.f4188b.f3951g0;
                        f fVar5 = pVar5.f4195i;
                        f fVar6 = pVar5.f4194h;
                        if (i48 == 8) {
                            fVar6.d(i46);
                            fVar5.d(i46);
                        } else {
                            int i49 = z4 ? i46 - i45 : i46 + i45;
                            if (i47 > 0 && i47 >= i11) {
                                i49 = z4 ? i49 - fVar6.f4159f : i49 + fVar6.f4159f;
                            }
                            if (z4) {
                                fVar5.d(i49);
                            } else {
                                fVar6.d(i49);
                            }
                            g gVar4 = pVar5.f4191e;
                            int iMin = gVar4.f4160g;
                            if (pVar5.f4190d == 3 && pVar5.f4187a == 1) {
                                iMin = Math.min(iMin, gVar4.f4166m);
                            }
                            i46 = z4 ? i49 - iMin : i49 + iMin;
                            if (z4) {
                                fVar6.d(i46);
                            } else {
                                fVar5.d(i46);
                            }
                            if (i47 < i21 && i47 < i4) {
                                i46 = z4 ? i46 - (-fVar5.f4159f) : i46 + (-fVar5.f4159f);
                            }
                        }
                    }
                    return;
                }
                if (i39 == 2) {
                    float f8 = this.f4192f == 0 ? this.f4188b.f3945d0 : this.f4188b.f3947e0;
                    if (z4) {
                        f8 = 1.0f - f8;
                    }
                    int i50 = (int) (((i19 - i9) * f8) + 0.5f);
                    if (i50 < 0 || i7 > 0) {
                        i50 = i12;
                    }
                    int i51 = z4 ? i10 - i50 : i10 + i50;
                    for (int i52 = i12; i52 < size; i52++) {
                        p pVar6 = (p) arrayList2.get(z4 ? size - (i52 + 1) : i52);
                        int i53 = pVar6.f4188b.f3951g0;
                        f fVar7 = pVar6.f4195i;
                        f fVar8 = pVar6.f4194h;
                        if (i53 == 8) {
                            fVar8.d(i51);
                            fVar7.d(i51);
                        } else {
                            if (i52 > 0 && i52 >= i11) {
                                i51 = z4 ? i51 - fVar8.f4159f : i51 + fVar8.f4159f;
                            }
                            if (z4) {
                                fVar7.d(i51);
                            } else {
                                fVar8.d(i51);
                            }
                            g gVar5 = pVar6.f4191e;
                            int i54 = gVar5.f4160g;
                            if (pVar6.f4190d == 3 && pVar6.f4187a == 1) {
                                i54 = gVar5.f4166m;
                            }
                            i51 = z4 ? i51 - i54 : i51 + i54;
                            if (z4) {
                                fVar8.d(i51);
                            } else {
                                fVar7.d(i51);
                            }
                            if (i52 < i21 && i52 < i4) {
                                i51 = z4 ? i51 - (-fVar7.f4159f) : i51 + (-fVar7.f4159f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // s.p
    public final void d() {
        ArrayList arrayList = this.f4144k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        r.d dVar = ((p) arrayList.get(0)).f4188b;
        r.d dVar2 = ((p) arrayList.get(size - 1)).f4188b;
        int i4 = this.f4192f;
        f fVar = this.f4195i;
        f fVar2 = this.f4194h;
        if (i4 == 0) {
            r.c cVar = dVar.I;
            r.c cVar2 = dVar2.K;
            f fVarI = p.i(cVar, 0);
            int iE = cVar.e();
            r.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE);
            }
            f fVarI2 = p.i(cVar2, 0);
            int iE2 = cVar2.e();
            r.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE2);
            }
        } else {
            r.c cVar3 = dVar.J;
            r.c cVar4 = dVar2.L;
            f fVarI3 = p.i(cVar3, 1);
            int iE3 = cVar3.e();
            r.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = p.i(cVar4, 1);
            int iE4 = cVar4.e();
            r.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f4154a = this;
        fVar.f4154a = this;
    }

    @Override // s.p
    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4144k;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i4)).e();
            i4++;
        }
    }

    @Override // s.p
    public final void f() {
        this.f4189c = null;
        Iterator it = this.f4144k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // s.p
    public final long j() {
        ArrayList arrayList = this.f4144k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) arrayList.get(i4);
            j4 = ((long) pVar.f4195i.f4159f) + pVar.j() + j4 + ((long) pVar.f4194h.f4159f);
        }
        return j4;
    }

    @Override // s.p
    public final boolean k() {
        ArrayList arrayList = this.f4144k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((p) arrayList.get(i4)).k()) {
                return false;
            }
        }
        return true;
    }

    public final r.d m() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4144k;
            if (i4 >= arrayList.size()) {
                return null;
            }
            r.d dVar = ((p) arrayList.get(i4)).f4188b;
            if (dVar.f3951g0 != 8) {
                return dVar;
            }
            i4++;
        }
    }

    public final r.d n() {
        ArrayList arrayList = this.f4144k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r.d dVar = ((p) arrayList.get(size)).f4188b;
            if (dVar.f3951g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4192f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f4144k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
