package r;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f4016q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f4017r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f4018s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f4019t0 = this.J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f4020u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f4021v0;

    public h() {
        this.R.clear();
        this.R.add(this.f4019t0);
        int length = this.Q.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.Q[i4] = this.f4019t0;
        }
    }

    @Override // r.d
    public final boolean B() {
        return this.f4021v0;
    }

    @Override // r.d
    public final boolean C() {
        return this.f4021v0;
    }

    @Override // r.d
    public final void R(p.d dVar, boolean z4) {
        if (this.T == null) {
            return;
        }
        c cVar = this.f4019t0;
        dVar.getClass();
        int iN = p.d.n(cVar);
        if (this.f4020u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            M(this.T.l());
            P(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        P(this.T.r());
        M(0);
    }

    public final void S(int i4) {
        this.f4019t0.l(i4);
        this.f4021v0 = true;
    }

    public final void T(int i4) {
        if (this.f4020u0 == i4) {
            return;
        }
        this.f4020u0 = i4;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f4020u0 == 1) {
            this.f4019t0 = this.I;
        } else {
            this.f4019t0 = this.J;
        }
        arrayList.add(this.f4019t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            cVarArr[i5] = this.f4019t0;
        }
    }

    @Override // r.d
    public final void c(p.d dVar, boolean z4) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objJ = eVar.j(2);
        Object objJ2 = eVar.j(4);
        d dVar2 = this.T;
        boolean z5 = dVar2 != null && dVar2.f3969p0[0] == 2;
        if (this.f4020u0 == 0) {
            objJ = eVar.j(3);
            objJ2 = eVar.j(5);
            d dVar3 = this.T;
            z5 = dVar3 != null && dVar3.f3969p0[1] == 2;
        }
        if (this.f4021v0) {
            c cVar = this.f4019t0;
            if (cVar.f3931c) {
                p.i iVarK = dVar.k(cVar);
                dVar.d(iVarK, this.f4019t0.d());
                if (this.f4017r0 != -1) {
                    if (z5) {
                        dVar.f(dVar.k(objJ2), iVarK, 0, 5);
                    }
                } else if (this.f4018s0 != -1 && z5) {
                    p.i iVarK2 = dVar.k(objJ2);
                    dVar.f(iVarK, dVar.k(objJ), 0, 5);
                    dVar.f(iVarK2, iVarK, 0, 5);
                }
                this.f4021v0 = false;
                return;
            }
        }
        if (this.f4017r0 != -1) {
            p.i iVarK3 = dVar.k(this.f4019t0);
            dVar.e(iVarK3, dVar.k(objJ), this.f4017r0, 8);
            if (z5) {
                dVar.f(dVar.k(objJ2), iVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4018s0 != -1) {
            p.i iVarK4 = dVar.k(this.f4019t0);
            p.i iVarK5 = dVar.k(objJ2);
            dVar.e(iVarK4, iVarK5, -this.f4018s0, 8);
            if (z5) {
                dVar.f(iVarK4, dVar.k(objJ), 0, 5);
                dVar.f(iVarK5, iVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4016q0 != -1.0f) {
            p.i iVarK6 = dVar.k(this.f4019t0);
            p.i iVarK7 = dVar.k(objJ2);
            float f5 = this.f4016q0;
            p.c cVarL = dVar.l();
            cVarL.f3672d.d(iVarK6, -1.0f);
            cVarL.f3672d.d(iVarK7, f5);
            dVar.c(cVarL);
        }
    }

    @Override // r.d
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0011  */
    /* JADX WARN: Code duplicated, block: B:15:0x0015  */
    /* JADX WARN: Code duplicated, block: B:17:0x0018  */
    /* JADX WARN: Code duplicated, block: B:19:0x001c  */
    @Override // r.d
    public final c j(int i4) {
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 1) {
            if (this.f4020u0 == 1) {
                return this.f4019t0;
            }
        } else if (i5 == 2) {
            if (this.f4020u0 == 0) {
                return this.f4019t0;
            }
        } else if (i5 != 3) {
            if (i5 == 4) {
                if (this.f4020u0 == 0) {
                    return this.f4019t0;
                }
            }
        } else if (this.f4020u0 == 1) {
            return this.f4019t0;
        }
        return null;
    }
}
