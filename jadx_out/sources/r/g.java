package r;

import java.util.ArrayList;
import s.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j {
    public int A0;
    public s.b B0;
    public n C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public d[] f4007a1;
    public int b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f4008s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f4009t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f4010u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f4011v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f4012w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f4013x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f4014y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f4015z0;

    public final int T(int i4, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3969p0;
        if (iArr[1] == 3) {
            int i5 = dVar.f3972s;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f3979z * i4);
                if (i6 != dVar.l()) {
                    dVar.f3950g = true;
                    V(dVar, iArr[0], dVar.r(), 1, i6);
                }
                return i6;
            }
            if (i5 == 1) {
                return dVar.l();
            }
            if (i5 == 3) {
                return (int) ((dVar.r() * dVar.W) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final int U(int i4, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3969p0;
        if (iArr[0] == 3) {
            int i5 = dVar.f3971r;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f3976w * i4);
                if (i6 != dVar.r()) {
                    dVar.f3950g = true;
                    V(dVar, 1, i6, iArr[1], dVar.l());
                }
                return i6;
            }
            if (i5 == 1) {
                return dVar.r();
            }
            if (i5 == 3) {
                return (int) ((dVar.l() * dVar.W) + 0.5f);
            }
        }
        return dVar.r();
    }

    public final void V(d dVar, int i4, int i5, int i6, int i7) {
        n nVar;
        d dVar2;
        while (true) {
            nVar = this.C0;
            if (nVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f3983u0;
            }
        }
        s.b bVar = this.B0;
        bVar.f4134a = i4;
        bVar.f4135b = i6;
        bVar.f4136c = i5;
        bVar.f4137d = i7;
        nVar.b(dVar, bVar);
        dVar.P(this.B0.f4138e);
        dVar.M(this.B0.f4139f);
        s.b bVar2 = this.B0;
        dVar.E = bVar2.f4141h;
        dVar.J(bVar2.f4140g);
    }

    @Override // r.j, r.i
    public final void a() {
        for (int i4 = 0; i4 < this.f4023r0; i4++) {
            d dVar = this.f4022q0[i4];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    @Override // r.d
    public final void c(p.d dVar, boolean z4) {
        d dVar2;
        float f5;
        int i4;
        super.c(dVar, z4);
        d dVar3 = this.T;
        boolean z5 = dVar3 != null && ((e) dVar3).f3984v0;
        int i5 = this.T0;
        ArrayList arrayList = this.W0;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((f) arrayList.get(i6)).b(i6, z5, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        ((f) arrayList.get(i7)).b(i7, z5, i7 == size2 + (-1));
                        i7++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i8 = 0; i8 < this.b1; i8++) {
                    this.f4007a1[i8].E();
                }
                int[] iArr = this.Z0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                float f6 = this.J0;
                d dVar4 = null;
                int i11 = 0;
                while (i11 < i9) {
                    if (z5) {
                        i4 = (i9 - i11) - 1;
                        f5 = 1.0f - this.J0;
                    } else {
                        f5 = f6;
                        i4 = i11;
                    }
                    d dVar5 = this.Y0[i4];
                    if (dVar5 != null && dVar5.f3951g0 != 8) {
                        c cVar = dVar5.I;
                        if (i11 == 0) {
                            dVar5.g(cVar, this.I, this.f4012w0);
                            dVar5.f3955i0 = this.D0;
                            dVar5.f3945d0 = f5;
                        }
                        if (i11 == i9 - 1) {
                            dVar5.g(dVar5.K, this.K, this.f4013x0);
                        }
                        if (i11 > 0 && dVar4 != null) {
                            int i12 = this.P0;
                            c cVar2 = dVar4.K;
                            dVar5.g(cVar, cVar2, i12);
                            dVar4.g(cVar2, cVar, 0);
                        }
                        dVar4 = dVar5;
                    }
                    i11++;
                    f6 = f5;
                }
                for (int i13 = 0; i13 < i10; i13++) {
                    d dVar6 = this.X0[i13];
                    if (dVar6 != null && dVar6.f3951g0 != 8) {
                        c cVar3 = dVar6.J;
                        if (i13 == 0) {
                            dVar6.g(cVar3, this.J, this.f4008s0);
                            dVar6.f3957j0 = this.E0;
                            dVar6.f3947e0 = this.K0;
                        }
                        if (i13 == i10 - 1) {
                            dVar6.g(dVar6.L, this.L, this.f4009t0);
                        }
                        if (i13 > 0 && dVar4 != null) {
                            int i14 = this.Q0;
                            c cVar4 = dVar4.L;
                            dVar6.g(cVar3, cVar4, i14);
                            dVar4.g(cVar4, cVar3, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i15 = 0; i15 < i9; i15++) {
                    for (int i16 = 0; i16 < i10; i16++) {
                        int i17 = (i16 * i9) + i15;
                        if (this.V0 == 1) {
                            i17 = (i15 * i10) + i16;
                        }
                        d[] dVarArr = this.f4007a1;
                        if (i17 < dVarArr.length && (dVar2 = dVarArr[i17]) != null && dVar2.f3951g0 != 8) {
                            d dVar7 = this.Y0[i15];
                            d dVar8 = this.X0[i16];
                            if (dVar2 != dVar7) {
                                dVar2.g(dVar2.I, dVar7.I, 0);
                                dVar2.g(dVar2.K, dVar7.K, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.g(dVar2.J, dVar8.J, 0);
                                dVar2.g(dVar2.L, dVar8.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z5, true);
        }
        this.f4014y0 = false;
    }
}
