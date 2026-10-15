package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r.e f4146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r.e f4149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f4151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f4152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f4153h;

    public final void a(f fVar, int i4, ArrayList arrayList, l lVar) {
        p pVar = fVar.f4157d;
        if (pVar.f4189c == null) {
            r.e eVar = this.f4146a;
            if (pVar == eVar.f3944d || pVar == eVar.f3946e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f4169a = null;
                lVar.f4170b = new ArrayList();
                lVar.f4169a = pVar;
                arrayList.add(lVar);
            }
            pVar.f4189c = lVar;
            lVar.f4170b.add(pVar);
            f fVar2 = pVar.f4194h;
            for (d dVar : fVar2.f4164k) {
                if (dVar instanceof f) {
                    a((f) dVar, i4, arrayList, lVar);
                }
            }
            f fVar3 = pVar.f4195i;
            for (d dVar2 : fVar3.f4164k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i4, arrayList, lVar);
                }
            }
            if (i4 == 1 && (pVar instanceof m)) {
                for (d dVar3 : ((m) pVar).f4171k.f4164k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, arrayList, lVar);
                    }
                }
            }
            Iterator it = fVar2.f4165l.iterator();
            while (it.hasNext()) {
                a((f) it.next(), i4, arrayList, lVar);
            }
            Iterator it2 = fVar3.f4165l.iterator();
            while (it2.hasNext()) {
                a((f) it2.next(), i4, arrayList, lVar);
            }
            if (i4 == 1 && (pVar instanceof m)) {
                Iterator it3 = ((m) pVar).f4171k.f4165l.iterator();
                while (it3.hasNext()) {
                    a((f) it3.next(), i4, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:114:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0235 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    public final void b(r.e eVar) {
        int iR;
        int iL;
        int i4;
        int i5;
        int i6;
        int i7;
        float f5;
        for (r.d dVar : eVar.f4025q0) {
            int[] iArr = dVar.f3969p0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            if (dVar.f3951g0 == 8) {
                dVar.f3938a = true;
            } else {
                float f6 = dVar.f3976w;
                if (f6 < 1.0f && i8 == 3) {
                    dVar.f3971r = 2;
                }
                float f7 = dVar.f3979z;
                if (f7 < 1.0f && i9 == 3) {
                    dVar.f3972s = 2;
                }
                int i10 = 1;
                if (dVar.W > 0.0f) {
                    if (i8 == 3 && (i9 == 2 || i9 == 1)) {
                        dVar.f3971r = 3;
                    } else if (i9 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3972s = 3;
                    } else if (i8 == 3 && i9 == 3) {
                        if (dVar.f3971r == 0) {
                            dVar.f3971r = 3;
                        }
                        if (dVar.f3972s == 0) {
                            dVar.f3972s = 3;
                        }
                    }
                }
                r.c cVar = dVar.K;
                r.c cVar2 = dVar.I;
                if (i8 == 3 && dVar.f3971r == 1 && (cVar2.f3934f == null || cVar.f3934f == null)) {
                    i8 = 2;
                }
                r.c cVar3 = dVar.L;
                r.c cVar4 = dVar.J;
                int i11 = (i9 == 3 && dVar.f3972s == 1 && (cVar4.f3934f == null || cVar3.f3934f == null)) ? 2 : i9;
                k kVar = dVar.f3944d;
                kVar.f4190d = i8;
                int i12 = dVar.f3971r;
                kVar.f4187a = i12;
                m mVar = dVar.f3946e;
                mVar.f4190d = i11;
                int i13 = dVar.f3972s;
                mVar.f4187a = i13;
                if ((i8 == 4 || i8 == 1 || i8 == 2) && (i11 == 4 || i11 == 1 || i11 == 2)) {
                    int iR2 = dVar.r();
                    if (i8 == 4) {
                        iR = (eVar.r() - cVar2.f3935g) - cVar.f3935g;
                        i8 = 1;
                    } else {
                        iR = iR2;
                    }
                    int iL2 = dVar.l();
                    if (i11 == 4) {
                        iL = (eVar.l() - cVar4.f3935g) - cVar3.f3935g;
                    } else {
                        iL = iL2;
                        i10 = i11;
                    }
                    f(dVar, i8, iR, i10, iL);
                    dVar.f3944d.f4191e.d(dVar.r());
                    dVar.f3946e.f4191e.d(dVar.l());
                    dVar.f3938a = true;
                } else {
                    int[] iArr2 = eVar.f3969p0;
                    r.c[] cVarArr = dVar.Q;
                    if (i8 != 3 || (i11 != 2 && i11 != 1)) {
                        i4 = 3;
                        if (i11 == i4) {
                            if (i8 == 2 && i8 != 1) {
                                i6 = i4;
                                i5 = 1;
                                if (i8 != i6 && i11 == i6) {
                                    if (i12 == i5 || i13 == i5) {
                                        f(dVar, 2, 0, 2, 0);
                                        dVar.f3944d.f4191e.f4166m = dVar.r();
                                        dVar.f3946e.f4191e.f4166m = dVar.l();
                                    } else if (i13 == 2 && i12 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                        f(dVar, 1, (int) ((f6 * eVar.r()) + 0.5f), 1, (int) ((f7 * eVar.l()) + 0.5f));
                                        dVar.f3944d.f4191e.d(dVar.r());
                                        dVar.f3946e.f4191e.d(dVar.l());
                                        dVar.f3938a = true;
                                    }
                                }
                            } else if (i13 == i4) {
                                if (i8 == 2) {
                                    f(dVar, 2, 0, 2, 0);
                                }
                                int iR3 = dVar.r();
                                f5 = dVar.W;
                                if (dVar.X == -1) {
                                    f5 = 1.0f / f5;
                                }
                                f(dVar, 1, iR3, 1, (int) ((iR3 * f5) + 0.5f));
                                dVar.f3944d.f4191e.d(dVar.r());
                                dVar.f3946e.f4191e.d(dVar.l());
                                dVar.f3938a = true;
                            } else if (i13 == 1) {
                                f(dVar, i8, 0, 2, 0);
                                dVar.f3946e.f4191e.f4166m = dVar.l();
                            } else if (i13 == 2) {
                                i7 = iArr2[1];
                                if (i7 != 1 || i7 == 4) {
                                    f(dVar, i8, dVar.r(), 1, (int) ((f7 * eVar.l()) + 0.5f));
                                    dVar.f3944d.f4191e.d(dVar.r());
                                    dVar.f3946e.f4191e.d(dVar.l());
                                    dVar.f3938a = true;
                                }
                            } else if (cVarArr[2].f3934f != null || cVarArr[3].f3934f == null) {
                                f(dVar, 2, 0, i11, 0);
                                dVar.f3944d.f4191e.d(dVar.r());
                                dVar.f3946e.f4191e.d(dVar.l());
                                dVar.f3938a = true;
                            }
                        }
                        i5 = 1;
                        i6 = 3;
                        if (i8 != i6) {
                        }
                    } else if (i12 == 3) {
                        if (i11 == 2) {
                            f(dVar, 2, 0, 2, 0);
                        }
                        int iL3 = dVar.l();
                        f(dVar, 1, (int) ((iL3 * dVar.W) + 0.5f), 1, iL3);
                        dVar.f3944d.f4191e.d(dVar.r());
                        dVar.f3946e.f4191e.d(dVar.l());
                        dVar.f3938a = true;
                    } else if (i12 == 1) {
                        f(dVar, 2, 0, i11, 0);
                        dVar.f3944d.f4191e.f4166m = dVar.r();
                    } else if (i12 == 2) {
                        int i14 = iArr2[0];
                        if (i14 == 1 || i14 == 4) {
                            f(dVar, 1, (int) ((f6 * eVar.r()) + 0.5f), i11, dVar.l());
                            dVar.f3944d.f4191e.d(dVar.r());
                            dVar.f3946e.f4191e.d(dVar.l());
                            dVar.f3938a = true;
                        } else {
                            i4 = 3;
                            if (i11 == i4) {
                                if (i8 == 2) {
                                }
                                if (i13 == i4) {
                                    if (i8 == 2) {
                                        f(dVar, 2, 0, 2, 0);
                                    }
                                    int iR4 = dVar.r();
                                    f5 = dVar.W;
                                    if (dVar.X == -1) {
                                        f5 = 1.0f / f5;
                                    }
                                    f(dVar, 1, iR4, 1, (int) ((iR4 * f5) + 0.5f));
                                    dVar.f3944d.f4191e.d(dVar.r());
                                    dVar.f3946e.f4191e.d(dVar.l());
                                    dVar.f3938a = true;
                                } else if (i13 == 1) {
                                    f(dVar, i8, 0, 2, 0);
                                    dVar.f3946e.f4191e.f4166m = dVar.l();
                                } else if (i13 == 2) {
                                    i7 = iArr2[1];
                                    if (i7 != 1) {
                                    }
                                    f(dVar, i8, dVar.r(), 1, (int) ((f7 * eVar.l()) + 0.5f));
                                    dVar.f3944d.f4191e.d(dVar.r());
                                    dVar.f3946e.f4191e.d(dVar.l());
                                    dVar.f3938a = true;
                                } else {
                                    if (cVarArr[2].f3934f != null) {
                                    }
                                    f(dVar, 2, 0, i11, 0);
                                    dVar.f3944d.f4191e.d(dVar.r());
                                    dVar.f3946e.f4191e.d(dVar.l());
                                    dVar.f3938a = true;
                                }
                            }
                            i5 = 1;
                            i6 = 3;
                            if (i8 != i6) {
                            }
                        }
                    } else if (cVarArr[0].f3934f == null || cVarArr[1].f3934f == null) {
                        f(dVar, 2, 0, i11, 0);
                        dVar.f3944d.f4191e.d(dVar.r());
                        dVar.f3946e.f4191e.d(dVar.l());
                        dVar.f3938a = true;
                    } else {
                        i4 = 3;
                        if (i11 == i4) {
                            if (i8 == 2) {
                            }
                            if (i13 == i4) {
                                if (i8 == 2) {
                                    f(dVar, 2, 0, 2, 0);
                                }
                                int iR5 = dVar.r();
                                f5 = dVar.W;
                                if (dVar.X == -1) {
                                    f5 = 1.0f / f5;
                                }
                                f(dVar, 1, iR5, 1, (int) ((iR5 * f5) + 0.5f));
                                dVar.f3944d.f4191e.d(dVar.r());
                                dVar.f3946e.f4191e.d(dVar.l());
                                dVar.f3938a = true;
                            } else if (i13 == 1) {
                                f(dVar, i8, 0, 2, 0);
                                dVar.f3946e.f4191e.f4166m = dVar.l();
                            } else if (i13 == 2) {
                                i7 = iArr2[1];
                                if (i7 != 1) {
                                }
                                f(dVar, i8, dVar.r(), 1, (int) ((f7 * eVar.l()) + 0.5f));
                                dVar.f3944d.f4191e.d(dVar.r());
                                dVar.f3946e.f4191e.d(dVar.l());
                                dVar.f3938a = true;
                            } else {
                                if (cVarArr[2].f3934f != null) {
                                }
                                f(dVar, 2, 0, i11, 0);
                                dVar.f3944d.f4191e.d(dVar.r());
                                dVar.f3946e.f4191e.d(dVar.l());
                                dVar.f3938a = true;
                            }
                        }
                        i5 = 1;
                        i6 = 3;
                        if (i8 != i6) {
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f4150e;
        arrayList.clear();
        r.e eVar = this.f4149d;
        eVar.f3944d.f();
        eVar.f3946e.f();
        arrayList.add(eVar.f3944d);
        arrayList.add(eVar.f3946e);
        HashSet hashSet = null;
        for (r.d dVar : eVar.f4025q0) {
            if (dVar instanceof r.h) {
                i iVar = new i(dVar);
                dVar.f3944d.f();
                dVar.f3946e.f();
                iVar.f4192f = ((r.h) dVar).f4020u0;
                arrayList.add(iVar);
            } else {
                if (dVar.y()) {
                    if (dVar.f3940b == null) {
                        dVar.f3940b = new c(0, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3940b);
                } else {
                    arrayList.add(dVar.f3944d);
                }
                if (dVar.z()) {
                    if (dVar.f3942c == null) {
                        dVar.f3942c = new c(1, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3942c);
                } else {
                    arrayList.add(dVar.f3946e);
                }
                if (dVar instanceof r.j) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        for (p pVar : arrayList) {
            if (pVar.f4188b != eVar) {
                pVar.d();
            }
        }
        ArrayList arrayList2 = this.f4153h;
        arrayList2.clear();
        r.e eVar2 = this.f4146a;
        e(eVar2.f3944d, 0, arrayList2);
        e(eVar2.f3946e, 1, arrayList2);
        this.f4147b = false;
    }

    public final int d(r.e eVar, int i4) {
        ArrayList arrayList;
        int i5;
        int i6;
        long j4;
        float f5;
        long j5;
        ArrayList arrayList2 = this.f4153h;
        int size = arrayList2.size();
        int i7 = 0;
        long jMax = 0;
        while (i7 < size) {
            p pVar = ((l) arrayList2.get(i7)).f4169a;
            if (!(pVar instanceof c) ? !(i4 != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((c) pVar).f4192f != i4) {
                f fVar = (i4 == 0 ? eVar.f3944d : eVar.f3946e).f4194h;
                f fVar2 = (i4 == 0 ? eVar.f3944d : eVar.f3946e).f4195i;
                boolean zContains = pVar.f4194h.f4165l.contains(fVar);
                f fVar3 = pVar.f4195i;
                boolean zContains2 = fVar3.f4165l.contains(fVar2);
                long j6 = pVar.j();
                f fVar4 = pVar.f4194h;
                if (zContains && zContains2) {
                    long jB = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i5 = size;
                    long jA = l.a(fVar3, 0L);
                    long j7 = jB - j6;
                    int i8 = fVar3.f4159f;
                    arrayList = arrayList3;
                    i6 = i7;
                    if (j7 >= (-i8)) {
                        j7 += (long) i8;
                    }
                    long j8 = (-jA) - j6;
                    long j9 = fVar4.f4159f;
                    long j10 = j8 - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    r.d dVar = pVar.f4188b;
                    if (i4 == 0) {
                        f5 = dVar.f3945d0;
                    } else if (i4 == 1) {
                        f5 = dVar.f3947e0;
                    } else {
                        dVar.getClass();
                        f5 = -1.0f;
                    }
                    if (f5 > 0.0f) {
                        j5 = (long) ((j7 / (1.0f - f5)) + (j10 / f5));
                    } else {
                        j5 = 0;
                    }
                    float f6 = j5;
                    j4 = (((long) fVar4.f4159f) + ((((long) ((f6 * f5) + 0.5f)) + j6) + ((long) (((1.0f - f5) * f6) + 0.5f)))) - ((long) fVar3.f4159f);
                } else {
                    arrayList = arrayList2;
                    i5 = size;
                    i6 = i7;
                    if (zContains) {
                        j4 = Math.max(l.b(fVar4, fVar4.f4159f), ((long) fVar4.f4159f) + j6);
                    } else if (zContains2) {
                        j4 = Math.max(-l.a(fVar3, fVar3.f4159f), ((long) (-fVar3.f4159f)) + j6);
                    } else {
                        j4 = (pVar.j() + ((long) fVar4.f4159f)) - ((long) fVar3.f4159f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i5 = size;
                i6 = i7;
                j4 = 0;
            }
            jMax = Math.max(jMax, j4);
            i7 = i6 + 1;
            size = i5;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(p pVar, int i4, ArrayList arrayList) {
        f fVar;
        Iterator it = pVar.f4194h.f4164k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.f4195i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i4, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f4194h, i4, arrayList, null);
            }
        }
        for (d dVar2 : fVar.f4164k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f4195i, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            for (d dVar3 : ((m) pVar).f4171k.f4164k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, arrayList, null);
                }
            }
        }
    }

    public final void f(r.d dVar, int i4, int i5, int i6, int i7) {
        b bVar = this.f4152g;
        bVar.f4134a = i4;
        bVar.f4135b = i6;
        bVar.f4136c = i5;
        bVar.f4137d = i7;
        this.f4151f.b(dVar, bVar);
        dVar.P(bVar.f4138e);
        dVar.M(bVar.f4139f);
        dVar.E = bVar.f4141h;
        dVar.J(bVar.f4140g);
    }

    public final void g() {
        a aVar;
        for (r.d dVar : this.f4146a.f4025q0) {
            if (!dVar.f3938a) {
                int[] iArr = dVar.f3969p0;
                boolean z4 = false;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = dVar.f3971r;
                int i7 = dVar.f3972s;
                boolean z5 = i4 == 2 || (i4 == 3 && i6 == 1);
                if (i5 == 2 || (i5 == 3 && i7 == 1)) {
                    z4 = true;
                }
                g gVar = dVar.f3944d.f4191e;
                boolean z6 = gVar.f4163j;
                g gVar2 = dVar.f3946e.f4191e;
                boolean z7 = gVar2.f4163j;
                if (z6 && z7) {
                    f(dVar, 1, gVar.f4160g, 1, gVar2.f4160g);
                    dVar.f3938a = true;
                } else if (z6 && z4) {
                    f(dVar, 1, gVar.f4160g, 2, gVar2.f4160g);
                    if (i5 == 3) {
                        dVar.f3946e.f4191e.f4166m = dVar.l();
                    } else {
                        dVar.f3946e.f4191e.d(dVar.l());
                        dVar.f3938a = true;
                    }
                } else if (z7 && z5) {
                    f(dVar, 2, gVar.f4160g, 1, gVar2.f4160g);
                    if (i4 == 3) {
                        dVar.f3944d.f4191e.f4166m = dVar.r();
                    } else {
                        dVar.f3944d.f4191e.d(dVar.r());
                        dVar.f3938a = true;
                    }
                }
                if (dVar.f3938a && (aVar = dVar.f3946e.f4172l) != null) {
                    aVar.d(dVar.f3939a0);
                }
            }
        }
    }
}
