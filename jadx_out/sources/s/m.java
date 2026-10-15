package s;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f4171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f4172l;

    @Override // s.d
    public final void a(d dVar) {
        float f5;
        float f6;
        float f7;
        int i4;
        if (p.h.a(this.f4196j) == 3) {
            r.d dVar2 = this.f4188b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f4191e;
        if (gVar.f4156c && !gVar.f4163j && this.f4190d == 3) {
            r.d dVar3 = this.f4188b;
            int i5 = dVar3.f3972s;
            if (i5 == 2) {
                r.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f3946e.f4191e;
                    if (gVar2.f4163j) {
                        gVar.d((int) ((gVar2.f4160g * dVar3.f3979z) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                g gVar3 = dVar3.f3944d.f4191e;
                if (gVar3.f4163j) {
                    int i6 = dVar3.X;
                    if (i6 != -1) {
                        if (i6 == 0) {
                            f7 = gVar3.f4160g * dVar3.W;
                            i4 = (int) (f7 + 0.5f);
                        } else if (i6 != 1) {
                            i4 = 0;
                        } else {
                            f5 = gVar3.f4160g;
                            f6 = dVar3.W;
                        }
                        gVar.d(i4);
                    } else {
                        f5 = gVar3.f4160g;
                        f6 = dVar3.W;
                    }
                    f7 = f5 / f6;
                    i4 = (int) (f7 + 0.5f);
                    gVar.d(i4);
                }
            }
        }
        f fVar = this.f4194h;
        if (fVar.f4156c) {
            f fVar2 = this.f4195i;
            if (fVar2.f4156c) {
                if (fVar.f4163j && fVar2.f4163j && gVar.f4163j) {
                    return;
                }
                if (!gVar.f4163j && this.f4190d == 3) {
                    r.d dVar5 = this.f4188b;
                    if (dVar5.f3971r == 0 && !dVar5.z()) {
                        f fVar3 = (f) fVar.f4165l.get(0);
                        f fVar4 = (f) fVar2.f4165l.get(0);
                        int i7 = fVar3.f4160g + fVar.f4159f;
                        int i8 = fVar4.f4160g + fVar2.f4159f;
                        fVar.d(i7);
                        fVar2.d(i8);
                        gVar.d(i8 - i7);
                        return;
                    }
                }
                if (!gVar.f4163j && this.f4190d == 3 && this.f4187a == 1 && fVar.f4165l.size() > 0 && fVar2.f4165l.size() > 0) {
                    f fVar5 = (f) fVar.f4165l.get(0);
                    int i9 = (((f) fVar2.f4165l.get(0)).f4160g + fVar2.f4159f) - (fVar5.f4160g + fVar.f4159f);
                    int i10 = gVar.f4166m;
                    if (i9 < i10) {
                        gVar.d(i9);
                    } else {
                        gVar.d(i10);
                    }
                }
                if (gVar.f4163j && fVar.f4165l.size() > 0 && fVar2.f4165l.size() > 0) {
                    f fVar6 = (f) fVar.f4165l.get(0);
                    f fVar7 = (f) fVar2.f4165l.get(0);
                    int i11 = fVar6.f4160g;
                    int i12 = fVar.f4159f + i11;
                    int i13 = fVar7.f4160g;
                    int i14 = fVar2.f4159f + i13;
                    float f8 = this.f4188b.f3947e0;
                    if (fVar6 == fVar7) {
                        f8 = 0.5f;
                    } else {
                        i11 = i12;
                        i13 = i14;
                    }
                    fVar.d((int) ((((i13 - i11) - gVar.f4160g) * f8) + i11 + 0.5f));
                    fVar2.d(fVar.f4160g + gVar.f4160g);
                }
            }
        }
    }

    @Override // s.p
    public final void d() {
        r.d dVar;
        r.d dVar2;
        r.d dVar3;
        r.d dVar4;
        r.d dVar5 = this.f4188b;
        boolean z4 = dVar5.f3938a;
        g gVar = this.f4191e;
        if (z4) {
            gVar.d(dVar5.l());
        }
        boolean z5 = gVar.f4163j;
        f fVar = this.f4195i;
        f fVar2 = this.f4194h;
        if (!z5) {
            r.d dVar6 = this.f4188b;
            this.f4190d = dVar6.f3969p0[1];
            if (dVar6.E) {
                this.f4172l = new a(this);
            }
            int i4 = this.f4190d;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.f4188b.T) != null && dVar4.f3969p0[1] == 1) {
                    int iL = (dVar4.l() - this.f4188b.J.e()) - this.f4188b.L.e();
                    p.b(fVar2, dVar4.f3946e.f4194h, this.f4188b.J.e());
                    p.b(fVar, dVar4.f3946e.f4195i, -this.f4188b.L.e());
                    gVar.d(iL);
                    return;
                }
                if (i4 == 1) {
                    gVar.d(this.f4188b.l());
                }
            }
        } else if (this.f4190d == 4 && (dVar2 = (dVar = this.f4188b).T) != null && dVar2.f3969p0[1] == 1) {
            p.b(fVar2, dVar2.f3946e.f4194h, dVar.J.e());
            p.b(fVar, dVar2.f3946e.f4195i, -this.f4188b.L.e());
            return;
        }
        boolean z6 = gVar.f4163j;
        f fVar3 = this.f4171k;
        if (z6) {
            r.d dVar7 = this.f4188b;
            if (dVar7.f3938a) {
                r.c[] cVarArr = dVar7.Q;
                r.c cVar = cVarArr[2];
                r.c cVar2 = cVar.f3934f;
                if (cVar2 != null && cVarArr[3].f3934f != null) {
                    if (dVar7.z()) {
                        fVar2.f4159f = this.f4188b.Q[2].e();
                        fVar.f4159f = -this.f4188b.Q[3].e();
                    } else {
                        f fVarH = p.h(this.f4188b.Q[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f4188b.Q[2].e());
                        }
                        f fVarH2 = p.h(this.f4188b.Q[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f4188b.Q[3].e());
                        }
                        fVar2.f4155b = true;
                        fVar.f4155b = true;
                    }
                    r.d dVar8 = this.f4188b;
                    if (dVar8.E) {
                        p.b(fVar3, fVar2, dVar8.f3939a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f4188b.Q[2].e());
                        p.b(fVar, fVar2, gVar.f4160g);
                        r.d dVar9 = this.f4188b;
                        if (dVar9.E) {
                            p.b(fVar3, fVar2, dVar9.f3939a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r.c cVar3 = cVarArr[3];
                if (cVar3.f3934f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f4188b.Q[3].e());
                        p.b(fVar2, fVar, -gVar.f4160g);
                    }
                    r.d dVar10 = this.f4188b;
                    if (dVar10.E) {
                        p.b(fVar3, fVar2, dVar10.f3939a0);
                        return;
                    }
                    return;
                }
                r.c cVar4 = cVarArr[4];
                if (cVar4.f3934f != null) {
                    f fVarH5 = p.h(cVar4);
                    if (fVarH5 != null) {
                        p.b(fVar3, fVarH5, 0);
                        p.b(fVar2, fVar3, -this.f4188b.f3939a0);
                        p.b(fVar, fVar2, gVar.f4160g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof r.i) || dVar7.T == null || dVar7.j(7).f3934f != null) {
                    return;
                }
                r.d dVar11 = this.f4188b;
                p.b(fVar2, dVar11.T.f3946e.f4194h, dVar11.t());
                p.b(fVar, fVar2, gVar.f4160g);
                r.d dVar12 = this.f4188b;
                if (dVar12.E) {
                    p.b(fVar3, fVar2, dVar12.f3939a0);
                    return;
                }
                return;
            }
        }
        if (z6 || this.f4190d != 3) {
            gVar.b(this);
        } else {
            r.d dVar13 = this.f4188b;
            int i5 = dVar13.f3972s;
            if (i5 == 2) {
                r.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3946e.f4191e;
                    gVar.f4165l.add(gVar2);
                    gVar2.f4164k.add(gVar);
                    gVar.f4155b = true;
                    gVar.f4164k.add(fVar2);
                    gVar.f4164k.add(fVar);
                }
            } else if (i5 == 3 && !dVar13.z()) {
                r.d dVar15 = this.f4188b;
                if (dVar15.f3971r != 3) {
                    g gVar3 = dVar15.f3944d.f4191e;
                    gVar.f4165l.add(gVar3);
                    gVar3.f4164k.add(gVar);
                    gVar.f4155b = true;
                    gVar.f4164k.add(fVar2);
                    gVar.f4164k.add(fVar);
                }
            }
        }
        r.d dVar16 = this.f4188b;
        r.c[] cVarArr2 = dVar16.Q;
        r.c cVar5 = cVarArr2[2];
        r.c cVar6 = cVar5.f3934f;
        if (cVar6 != null && cVarArr2[3].f3934f != null) {
            if (dVar16.z()) {
                fVar2.f4159f = this.f4188b.Q[2].e();
                fVar.f4159f = -this.f4188b.Q[3].e();
            } else {
                f fVarH6 = p.h(this.f4188b.Q[2]);
                f fVarH7 = p.h(this.f4188b.Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f4196j = 4;
            }
            if (this.f4188b.E) {
                c(fVar3, fVar2, 1, this.f4172l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = p.h(cVar5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f4188b.Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f4188b.E) {
                    c(fVar3, fVar2, 1, this.f4172l);
                }
                if (this.f4190d == 3) {
                    r.d dVar17 = this.f4188b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f3944d;
                        if (kVar.f4190d == 3) {
                            kVar.f4191e.f4164k.add(gVar);
                            gVar.f4165l.add(this.f4188b.f3944d.f4191e);
                            gVar.f4154a = this;
                        }
                    }
                }
            }
        } else {
            r.c cVar7 = cVarArr2[3];
            if (cVar7.f3934f != null) {
                f fVarH9 = p.h(cVar7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f4188b.Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f4188b.E) {
                        c(fVar3, fVar2, 1, this.f4172l);
                    }
                }
            } else {
                r.c cVar8 = cVarArr2[4];
                if (cVar8.f3934f != null) {
                    f fVarH10 = p.h(cVar8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f4172l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof r.i) && (dVar3 = dVar16.T) != null) {
                    p.b(fVar2, dVar3.f3946e.f4194h, dVar16.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f4188b.E) {
                        c(fVar3, fVar2, 1, this.f4172l);
                    }
                    if (this.f4190d == 3) {
                        r.d dVar18 = this.f4188b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f3944d;
                            if (kVar2.f4190d == 3) {
                                kVar2.f4191e.f4164k.add(gVar);
                                gVar.f4165l.add(this.f4188b.f3944d.f4191e);
                                gVar.f4154a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f4165l.size() == 0) {
            gVar.f4156c = true;
        }
    }

    @Override // s.p
    public final void e() {
        f fVar = this.f4194h;
        if (fVar.f4163j) {
            this.f4188b.Z = fVar.f4160g;
        }
    }

    @Override // s.p
    public final void f() {
        this.f4189c = null;
        this.f4194h.c();
        this.f4195i.c();
        this.f4171k.c();
        this.f4191e.c();
        this.f4193g = false;
    }

    @Override // s.p
    public final boolean k() {
        return this.f4190d != 3 || this.f4188b.f3972s == 0;
    }

    public final void m() {
        this.f4193g = false;
        f fVar = this.f4194h;
        fVar.c();
        fVar.f4163j = false;
        f fVar2 = this.f4195i;
        fVar2.c();
        fVar2.f4163j = false;
        f fVar3 = this.f4171k;
        fVar3.c();
        fVar3.f4163j = false;
        this.f4191e.f4163j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4188b.f3953h0;
    }
}
