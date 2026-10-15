package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3672d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f3669a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3670b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3671c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3673e = false;

    public c(g.h hVar) {
        this.f3672d = new a(this, hVar);
    }

    public final void a(d dVar, int i4) {
        this.f3672d.d(dVar.j(i4), 1.0f);
        this.f3672d.d(dVar.j(i4), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            } else {
                z4 = false;
            }
            this.f3670b = i4;
            if (z4) {
                this.f3672d.d(iVar, 1.0f);
                this.f3672d.d(iVar2, -1.0f);
                this.f3672d.d(iVar3, -1.0f);
                return;
            }
        }
        this.f3672d.d(iVar, -1.0f);
        this.f3672d.d(iVar2, 1.0f);
        this.f3672d.d(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            } else {
                z4 = false;
            }
            this.f3670b = i4;
            if (z4) {
                this.f3672d.d(iVar, 1.0f);
                this.f3672d.d(iVar2, -1.0f);
                this.f3672d.d(iVar3, 1.0f);
                return;
            }
        }
        this.f3672d.d(iVar, -1.0f);
        this.f3672d.d(iVar2, 1.0f);
        this.f3672d.d(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3669a == null && this.f3670b == 0.0f && this.f3672d.k() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i4;
        int iK = this.f3672d.k();
        i iVar2 = null;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < iK; i5++) {
            float fA = this.f3672d.a(i5);
            if (fA < 0.0f) {
                i iVarB = this.f3672d.b(i5);
                if ((zArr == null || !zArr[iVarB.f3701c]) && iVarB != iVar && (((i4 = iVarB.f3711m) == 3 || i4 == 4) && fA < f5)) {
                    f5 = fA;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f3669a;
        if (iVar2 != null) {
            this.f3672d.d(iVar2, -1.0f);
            this.f3669a.f3702d = -1;
            this.f3669a = null;
        }
        float fG = this.f3672d.g(iVar, true) * (-1.0f);
        this.f3669a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f3670b /= fG;
        this.f3672d.h(fG);
    }

    public final void h(d dVar, i iVar, boolean z4) {
        if (iVar == null || !iVar.f3705g) {
            return;
        }
        float fC = this.f3672d.c(iVar);
        this.f3670b = (iVar.f3704f * fC) + this.f3670b;
        this.f3672d.g(iVar, z4);
        if (z4) {
            iVar.b(this);
        }
        if (this.f3672d.k() == 0) {
            this.f3673e = true;
            dVar.f3676a = true;
        }
    }

    public void i(d dVar, c cVar, boolean z4) {
        float fE = this.f3672d.e(cVar, z4);
        this.f3670b = (cVar.f3670b * fE) + this.f3670b;
        if (z4) {
            cVar.f3669a.b(this);
        }
        if (this.f3669a == null || this.f3672d.k() != 0) {
            return;
        }
        this.f3673e = true;
        dVar.f3676a = true;
    }

    public String toString() {
        boolean z4;
        String strF = defpackage.a.f(this.f3669a == null ? "0" : "" + this.f3669a, " = ");
        if (this.f3670b != 0.0f) {
            strF = strF + this.f3670b;
            z4 = true;
        } else {
            z4 = false;
        }
        int iK = this.f3672d.k();
        for (int i4 = 0; i4 < iK; i4++) {
            i iVarB = this.f3672d.b(i4);
            if (iVarB != null) {
                float fA = this.f3672d.a(i4);
                if (fA != 0.0f) {
                    String string = iVarB.toString();
                    if (z4) {
                        if (fA > 0.0f) {
                            strF = defpackage.a.f(strF, " + ");
                        } else {
                            strF = defpackage.a.f(strF, " - ");
                            fA *= -1.0f;
                        }
                    } else if (fA < 0.0f) {
                        strF = defpackage.a.f(strF, "- ");
                        fA *= -1.0f;
                    }
                    strF = fA == 1.0f ? defpackage.a.f(strF, string) : strF + fA + " " + string;
                    z4 = true;
                }
            }
        }
        return !z4 ? defpackage.a.f(strF, "0.0") : strF;
    }
}
