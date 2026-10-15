package s;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r.d f4188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f4189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4191e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4192f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4193g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f4194h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f4195i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4196j = 1;

    public p(r.d dVar) {
        this.f4188b = dVar;
    }

    public static void b(f fVar, f fVar2, int i4) {
        fVar.f4165l.add(fVar2);
        fVar.f4159f = i4;
        fVar2.f4164k.add(fVar);
    }

    public static f h(r.c cVar) {
        r.c cVar2 = cVar.f3934f;
        if (cVar2 == null) {
            return null;
        }
        int iA = p.h.a(cVar2.f3933e);
        r.d dVar = cVar2.f3932d;
        if (iA == 1) {
            return dVar.f3944d.f4194h;
        }
        if (iA == 2) {
            return dVar.f3946e.f4194h;
        }
        if (iA == 3) {
            return dVar.f3944d.f4195i;
        }
        if (iA == 4) {
            return dVar.f3946e.f4195i;
        }
        if (iA != 5) {
            return null;
        }
        return dVar.f3946e.f4171k;
    }

    public static f i(r.c cVar, int i4) {
        r.c cVar2 = cVar.f3934f;
        if (cVar2 == null) {
            return null;
        }
        r.d dVar = cVar2.f3932d;
        p pVar = i4 == 0 ? dVar.f3944d : dVar.f3946e;
        int iA = p.h.a(cVar2.f3933e);
        if (iA == 1 || iA == 2) {
            return pVar.f4194h;
        }
        if (iA == 3 || iA == 4) {
            return pVar.f4195i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f4165l.add(fVar2);
        fVar.f4165l.add(this.f4191e);
        fVar.f4161h = i4;
        fVar.f4162i = gVar;
        fVar2.f4164k.add(fVar);
        gVar.f4164k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i5) {
        int iMax;
        if (i5 == 0) {
            r.d dVar = this.f4188b;
            int i6 = dVar.f3975v;
            iMax = Math.max(dVar.f3974u, i4);
            if (i6 > 0) {
                iMax = Math.min(i6, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        } else {
            r.d dVar2 = this.f4188b;
            int i7 = dVar2.f3978y;
            iMax = Math.max(dVar2.f3977x, i4);
            if (i7 > 0) {
                iMax = Math.min(i7, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        }
        return iMax;
    }

    public long j() {
        g gVar = this.f4191e;
        if (gVar.f4163j) {
            return gVar.f4160g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(r.c cVar, r.c cVar2, int i4) {
        g gVar;
        float f5;
        int i5;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.f4163j && fVarH2.f4163j) {
            int iE = cVar.e() + fVarH.f4160g;
            int iE2 = fVarH2.f4160g - cVar2.e();
            int i6 = iE2 - iE;
            g gVar2 = this.f4191e;
            if (!gVar2.f4163j && this.f4190d == 3) {
                int i7 = this.f4187a;
                if (i7 == 0) {
                    gVar2.d(g(i6, i4));
                } else if (i7 == 1) {
                    gVar2.d(Math.min(g(gVar2.f4166m, i4), i6));
                } else if (i7 == 2) {
                    r.d dVar = this.f4188b;
                    r.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        g gVar3 = (i4 == 0 ? dVar2.f3944d : dVar2.f3946e).f4191e;
                        if (gVar3.f4163j) {
                            gVar2.d(g((int) ((gVar3.f4160g * (i4 == 0 ? dVar.f3976w : dVar.f3979z)) + 0.5f), i4));
                        }
                    }
                } else if (i7 == 3) {
                    r.d dVar3 = this.f4188b;
                    p pVar = dVar3.f3944d;
                    if (pVar.f4190d == 3 && pVar.f4187a == 3) {
                        m mVar = dVar3.f3946e;
                        if (mVar.f4190d != 3 || mVar.f4187a != 3) {
                            if (i4 == 0) {
                                pVar = dVar3.f3946e;
                            }
                            gVar = pVar.f4191e;
                            if (gVar.f4163j) {
                                f5 = dVar3.W;
                                if (i4 == 1) {
                                    i5 = (int) ((gVar.f4160g / f5) + 0.5f);
                                } else {
                                    i5 = (int) ((f5 * gVar.f4160g) + 0.5f);
                                }
                                gVar2.d(i5);
                            }
                        }
                    } else {
                        if (i4 == 0) {
                            pVar = dVar3.f3946e;
                        }
                        gVar = pVar.f4191e;
                        if (gVar.f4163j) {
                            f5 = dVar3.W;
                            if (i4 == 1) {
                                i5 = (int) ((gVar.f4160g / f5) + 0.5f);
                            } else {
                                i5 = (int) ((f5 * gVar.f4160g) + 0.5f);
                            }
                            gVar2.d(i5);
                        }
                    }
                }
            }
            if (gVar2.f4163j) {
                int i8 = gVar2.f4160g;
                f fVar = this.f4195i;
                f fVar2 = this.f4194h;
                if (i8 == i6) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                r.d dVar4 = this.f4188b;
                float f6 = i4 == 0 ? dVar4.f3945d0 : dVar4.f3947e0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f4160g;
                    iE2 = fVarH2.f4160g;
                    f6 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i8) * f6) + iE + 0.5f));
                fVar.d(fVar2.f4160g + gVar2.f4160g);
            }
        }
    }
}
