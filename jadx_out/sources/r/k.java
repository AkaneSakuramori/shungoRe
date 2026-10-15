package r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f4024a = new boolean[3];

    public static void a(e eVar, p.d dVar, d dVar2) {
        dVar2.f3966o = -1;
        dVar2.f3968p = -1;
        int i4 = eVar.f3969p0[0];
        int[] iArr = dVar2.f3969p0;
        if (i4 != 2 && iArr[0] == 4) {
            c cVar = dVar2.I;
            int i5 = cVar.f3935g;
            int iR = eVar.r();
            c cVar2 = dVar2.K;
            int i6 = iR - cVar2.f3935g;
            cVar.f3937i = dVar.k(cVar);
            cVar2.f3937i = dVar.k(cVar2);
            dVar.d(cVar.f3937i, i5);
            dVar.d(cVar2.f3937i, i6);
            dVar2.f3966o = 2;
            dVar2.Y = i5;
            int i7 = i6 - i5;
            dVar2.U = i7;
            int i8 = dVar2.f3941b0;
            if (i7 < i8) {
                dVar2.U = i8;
            }
        }
        if (eVar.f3969p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar3 = dVar2.J;
        int i9 = cVar3.f3935g;
        int iL = eVar.l();
        c cVar4 = dVar2.L;
        int i10 = iL - cVar4.f3935g;
        cVar3.f3937i = dVar.k(cVar3);
        cVar4.f3937i = dVar.k(cVar4);
        dVar.d(cVar3.f3937i, i9);
        dVar.d(cVar4.f3937i, i10);
        if (dVar2.f3939a0 > 0 || dVar2.f3951g0 == 8) {
            c cVar5 = dVar2.M;
            p.i iVarK = dVar.k(cVar5);
            cVar5.f3937i = iVarK;
            dVar.d(iVarK, dVar2.f3939a0 + i9);
        }
        dVar2.f3968p = 2;
        dVar2.Z = i9;
        int i11 = i10 - i9;
        dVar2.V = i11;
        int i12 = dVar2.f3943c0;
        if (i11 < i12) {
            dVar2.V = i12;
        }
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
