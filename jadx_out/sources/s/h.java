package s;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4167a = new b();

    public static boolean a(r.d dVar) {
        int[] iArr = dVar.f3969p0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        r.d dVar2 = dVar.T;
        r.e eVar = dVar2 != null ? (r.e) dVar2 : null;
        if (eVar != null) {
            int i6 = eVar.f3969p0[0];
        }
        if (eVar != null) {
            int i7 = eVar.f3969p0[1];
        }
        boolean z4 = i4 == 1 || dVar.B() || i4 == 2 || (i4 == 3 && dVar.f3971r == 0 && dVar.W == 0.0f && dVar.u(0)) || (i4 == 3 && dVar.f3971r == 1 && dVar.v(0, dVar.r()));
        boolean z5 = i5 == 1 || dVar.C() || i5 == 2 || (i5 == 3 && dVar.f3972s == 0 && dVar.W == 0.0f && dVar.u(1)) || (i5 == 3 && dVar.f3972s == 1 && dVar.v(1, dVar.l()));
        if (dVar.W <= 0.0f || !(z4 || z5)) {
            return z4 && z5;
        }
        return true;
    }

    public static void b(int i4, r.d dVar, n nVar, boolean z4) {
        r.c cVar;
        r.c cVar2;
        r.c cVar3;
        r.c cVar4;
        if (dVar.f3962m) {
            return;
        }
        if (!(dVar instanceof r.e) && dVar.A() && a(dVar)) {
            r.e.W(dVar, nVar, new b());
        }
        r.c cVarJ = dVar.j(2);
        r.c cVarJ2 = dVar.j(4);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<r.c> hashSet = cVarJ.f3929a;
        char c5 = 0;
        if (hashSet != null && cVarJ.f3931c) {
            for (r.c cVar5 : hashSet) {
                r.d dVar2 = cVar5.f3932d;
                int i5 = i4 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    r.e.W(dVar2, nVar, new b());
                }
                r.c cVar6 = dVar2.I;
                r.c cVar7 = dVar2.K;
                char c6 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3934f) != null && cVar4.f3931c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3934f) != null && cVar3.f3931c)) ? (char) 1 : c5;
                int i6 = dVar2.f3969p0[c5];
                if (i6 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f3934f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.r() + iE);
                            b(i5, dVar2, nVar, z4);
                        } else if (cVar5 == cVar7 && cVar6.f3934f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.r(), iE2);
                            b(i5, dVar2, nVar, z4);
                        } else if (c6 != 0 && !dVar2.y()) {
                            c(i5, dVar2, nVar, z4);
                        }
                    }
                } else if (i6 == 3 && dVar2.f3975v >= 0 && dVar2.f3974u >= 0 && ((dVar2.f3951g0 == 8 || (dVar2.f3971r == 0 && dVar2.W == 0.0f)) && !dVar2.y() && !dVar2.F && c6 != 0 && !dVar2.y())) {
                    d(i5, dVar, nVar, dVar2, z4);
                }
                c5 = 0;
            }
        }
        if (dVar instanceof r.h) {
            return;
        }
        HashSet<r.c> hashSet2 = cVarJ2.f3929a;
        if (hashSet2 != null && cVarJ2.f3931c) {
            for (r.c cVar8 : hashSet2) {
                r.d dVar3 = cVar8.f3932d;
                int i7 = i4 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    r.e.W(dVar3, nVar, new b());
                }
                r.c cVar9 = dVar3.I;
                r.c cVar10 = dVar3.K;
                boolean z5 = (cVar8 == cVar9 && (cVar2 = cVar10.f3934f) != null && cVar2.f3931c) || (cVar8 == cVar10 && (cVar = cVar9.f3934f) != null && cVar.f3931c);
                int i8 = dVar3.f3969p0[0];
                if (i8 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f3934f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.r() + iE3);
                            b(i7, dVar3, nVar, z4);
                        } else if (cVar8 == cVar10 && cVar9.f3934f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.r(), iE4);
                            b(i7, dVar3, nVar, z4);
                        } else if (z5 && !dVar3.y()) {
                            c(i7, dVar3, nVar, z4);
                        }
                    }
                } else if (i8 == 3 && dVar3.f3975v >= 0 && dVar3.f3974u >= 0) {
                    if (dVar3.f3951g0 != 8) {
                        if (dVar3.f3971r == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.F && z5 && !dVar3.y()) {
                        d(i7, dVar, nVar, dVar3, z4);
                    }
                }
            }
        }
        dVar.f3962m = true;
    }

    public static void c(int i4, r.d dVar, n nVar, boolean z4) {
        float f5 = dVar.f3945d0;
        r.c cVar = dVar.I;
        int iD = cVar.f3934f.d();
        r.c cVar2 = dVar.K;
        int iD2 = cVar2.f3934f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f5 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = dVar.r();
        int i5 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i5 = (iD - iD2) - iR;
        }
        int i6 = ((int) (i5 > 0 ? (f5 * i5) + 0.5f : f5 * i5)) + iD;
        int i7 = i6 + iR;
        if (iD > iD2) {
            i7 = i6 - iR;
        }
        dVar.K(i6, i7);
        b(i4 + 1, dVar, nVar, z4);
    }

    public static void d(int i4, r.d dVar, n nVar, r.d dVar2, boolean z4) {
        float f5 = dVar2.f3945d0;
        r.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f3934f.d();
        r.c cVar2 = dVar2.K;
        int iD = cVar2.f3934f.d() - cVar2.e();
        if (iD >= iE) {
            int iR = dVar2.r();
            if (dVar2.f3951g0 != 8) {
                int i5 = dVar2.f3971r;
                if (i5 == 2) {
                    iR = (int) (dVar2.f3945d0 * 0.5f * (dVar instanceof r.e ? dVar.r() : dVar.T.r()));
                } else if (i5 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(dVar2.f3974u, iR);
                int i6 = dVar2.f3975v;
                if (i6 > 0) {
                    iR = Math.min(i6, iR);
                }
            }
            int i7 = iE + ((int) ((f5 * ((iD - iE) - iR)) + 0.5f));
            dVar2.K(i7, iR + i7);
            b(i4 + 1, dVar2, nVar, z4);
        }
    }

    public static void e(int i4, r.d dVar, n nVar) {
        float f5 = dVar.f3947e0;
        r.c cVar = dVar.J;
        int iD = cVar.f3934f.d();
        r.c cVar2 = dVar.L;
        int iD2 = cVar2.f3934f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f5 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = dVar.l();
        int i5 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i5 = (iD - iD2) - iL;
        }
        int i6 = (int) (i5 > 0 ? (f5 * i5) + 0.5f : f5 * i5);
        int i7 = iD + i6;
        int i8 = i7 + iL;
        if (iD > iD2) {
            i7 = iD - i6;
            i8 = i7 - iL;
        }
        dVar.L(i7, i8);
        g(i4 + 1, dVar, nVar);
    }

    public static void f(int i4, r.d dVar, n nVar, r.d dVar2) {
        float f5 = dVar2.f3947e0;
        r.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f3934f.d();
        r.c cVar2 = dVar2.L;
        int iD = cVar2.f3934f.d() - cVar2.e();
        if (iD >= iE) {
            int iL = dVar2.l();
            if (dVar2.f3951g0 != 8) {
                int i5 = dVar2.f3972s;
                if (i5 == 2) {
                    iL = (int) (f5 * 0.5f * (dVar instanceof r.e ? dVar.l() : dVar.T.l()));
                } else if (i5 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(dVar2.f3977x, iL);
                int i6 = dVar2.f3978y;
                if (i6 > 0) {
                    iL = Math.min(i6, iL);
                }
            }
            int i7 = iE + ((int) ((f5 * ((iD - iE) - iL)) + 0.5f));
            dVar2.L(i7, iL + i7);
            g(i4 + 1, dVar2, nVar);
        }
    }

    public static void g(int i4, r.d dVar, n nVar) {
        r.c cVar;
        r.c cVar2;
        r.c cVar3;
        r.c cVar4;
        r.c cVar5;
        if (dVar.f3964n) {
            return;
        }
        if (!(dVar instanceof r.e) && dVar.A() && a(dVar)) {
            r.e.W(dVar, nVar, new b());
        }
        r.c cVarJ = dVar.j(3);
        r.c cVarJ2 = dVar.j(5);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<r.c> hashSet = cVarJ.f3929a;
        if (hashSet != null && cVarJ.f3931c) {
            for (r.c cVar6 : hashSet) {
                r.d dVar2 = cVar6.f3932d;
                int i5 = i4 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    r.e.W(dVar2, nVar, new b());
                }
                r.c cVar7 = dVar2.J;
                r.c cVar8 = dVar2.L;
                boolean z4 = (cVar6 == cVar7 && (cVar5 = cVar8.f3934f) != null && cVar5.f3931c) || (cVar6 == cVar8 && (cVar4 = cVar7.f3934f) != null && cVar4.f3931c);
                int i6 = dVar2.f3969p0[1];
                if (i6 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar6 == cVar7 && cVar8.f3934f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.L(iE, dVar2.l() + iE);
                            g(i5, dVar2, nVar);
                        } else if (cVar6 == cVar8 && cVar7.f3934f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.L(iE2 - dVar2.l(), iE2);
                            g(i5, dVar2, nVar);
                        } else if (z4 && !dVar2.z()) {
                            e(i5, dVar2, nVar);
                        }
                    }
                } else if (i6 == 3 && dVar2.f3978y >= 0 && dVar2.f3977x >= 0 && (dVar2.f3951g0 == 8 || (dVar2.f3972s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.z() && !dVar2.F && z4 && !dVar2.z()) {
                        f(i5, dVar, nVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof r.h) {
            return;
        }
        HashSet<r.c> hashSet2 = cVarJ2.f3929a;
        if (hashSet2 != null && cVarJ2.f3931c) {
            for (r.c cVar9 : hashSet2) {
                r.d dVar3 = cVar9.f3932d;
                int i7 = i4 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    r.e.W(dVar3, nVar, new b());
                }
                r.c cVar10 = dVar3.J;
                r.c cVar11 = dVar3.L;
                boolean z5 = (cVar9 == cVar10 && (cVar3 = cVar11.f3934f) != null && cVar3.f3931c) || (cVar9 == cVar11 && (cVar2 = cVar10.f3934f) != null && cVar2.f3931c);
                int i8 = dVar3.f3969p0[1];
                if (i8 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar9 == cVar10 && cVar11.f3934f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.L(iE3, dVar3.l() + iE3);
                            g(i7, dVar3, nVar);
                        } else if (cVar9 == cVar11 && cVar10.f3934f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.L(iE4 - dVar3.l(), iE4);
                            g(i7, dVar3, nVar);
                        } else if (z5 && !dVar3.z()) {
                            e(i7, dVar3, nVar);
                        }
                    }
                } else if (i8 == 3 && dVar3.f3978y >= 0 && dVar3.f3977x >= 0) {
                    if (dVar3.f3951g0 != 8) {
                        if (dVar3.f3972s == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.z() && !dVar3.F && z5 && !dVar3.z()) {
                        f(i7, dVar, nVar, dVar3);
                    }
                }
            }
        }
        r.c cVarJ3 = dVar.j(6);
        if (cVarJ3.f3929a != null && cVarJ3.f3931c) {
            int iD3 = cVarJ3.d();
            for (r.c cVar12 : cVarJ3.f3929a) {
                r.d dVar4 = cVar12.f3932d;
                int i9 = i4 + 1;
                boolean zA3 = a(dVar4);
                if (dVar4.A() && zA3) {
                    r.e.W(dVar4, nVar, new b());
                }
                if (dVar4.f3969p0[1] != 3 || zA3) {
                    if (!dVar4.A() && cVar12 == (cVar = dVar4.M)) {
                        int iE5 = cVar12.e() + iD3;
                        if (dVar4.E) {
                            int i10 = iE5 - dVar4.f3939a0;
                            int i11 = dVar4.V + i10;
                            dVar4.Z = i10;
                            dVar4.J.l(i10);
                            dVar4.L.l(i11);
                            cVar.l(iE5);
                            dVar4.f3960l = true;
                        }
                        g(i9, dVar4, nVar);
                    }
                }
            }
        }
        dVar.f3964n = true;
    }
}
