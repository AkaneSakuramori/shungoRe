package r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import r3.q;
import s.n;
import s.o;
import s.p;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final s.b L0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e.c f3980r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s.e f3981s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3982t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n f3983u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f3984v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p.d f3985w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f3986x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f3987y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f3988z0;

    public e() {
        this.f4025q0 = new ArrayList();
        this.f3980r0 = new e.c(this);
        s.e eVar = new s.e();
        eVar.f4147b = true;
        eVar.f4148c = true;
        eVar.f4150e = new ArrayList();
        new ArrayList();
        eVar.f4151f = null;
        eVar.f4152g = new s.b();
        eVar.f4153h = new ArrayList();
        eVar.f4146a = this;
        eVar.f4149d = this;
        this.f3981s0 = eVar;
        this.f3983u0 = null;
        this.f3984v0 = false;
        this.f3985w0 = new p.d();
        this.f3988z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new s.b();
    }

    public static void W(d dVar, n nVar, s.b bVar) {
        int i4;
        int i5;
        if (nVar == null) {
            return;
        }
        if (dVar.f3951g0 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f4138e = 0;
            bVar.f4139f = 0;
            return;
        }
        int[] iArr = dVar.f3969p0;
        bVar.f4134a = iArr[0];
        bVar.f4135b = iArr[1];
        bVar.f4136c = dVar.r();
        bVar.f4137d = dVar.l();
        bVar.f4142i = false;
        bVar.f4143j = 0;
        boolean z4 = bVar.f4134a == 3;
        boolean z5 = bVar.f4135b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        if (z4 && dVar.u(0) && dVar.f3971r == 0 && !z6) {
            bVar.f4134a = 2;
            if (z5 && dVar.f3972s == 0) {
                bVar.f4134a = 1;
            }
            z4 = false;
        }
        if (z5 && dVar.u(1) && dVar.f3972s == 0 && !z7) {
            bVar.f4135b = 2;
            if (z4 && dVar.f3971r == 0) {
                bVar.f4135b = 1;
            }
            z5 = false;
        }
        if (dVar.B()) {
            bVar.f4134a = 1;
            z4 = false;
        }
        if (dVar.C()) {
            bVar.f4135b = 1;
            z5 = false;
        }
        int[] iArr2 = dVar.f3973t;
        if (z6) {
            if (iArr2[0] == 4) {
                bVar.f4134a = 1;
            } else if (!z5) {
                if (bVar.f4135b == 1) {
                    i5 = bVar.f4137d;
                } else {
                    bVar.f4134a = 2;
                    nVar.b(dVar, bVar);
                    i5 = bVar.f4139f;
                }
                bVar.f4134a = 1;
                bVar.f4136c = (int) (dVar.W * i5);
            }
        }
        if (z7) {
            if (iArr2[1] == 4) {
                bVar.f4135b = 1;
            } else if (!z4) {
                if (bVar.f4134a == 1) {
                    i4 = bVar.f4136c;
                } else {
                    bVar.f4135b = 2;
                    nVar.b(dVar, bVar);
                    i4 = bVar.f4138e;
                }
                bVar.f4135b = 1;
                if (dVar.X == -1) {
                    bVar.f4137d = (int) (i4 / dVar.W);
                } else {
                    bVar.f4137d = (int) (dVar.W * i4);
                }
            }
        }
        nVar.b(dVar, bVar);
        dVar.P(bVar.f4138e);
        dVar.M(bVar.f4139f);
        dVar.E = bVar.f4141h;
        dVar.J(bVar.f4140g);
        bVar.f4143j = 0;
    }

    @Override // r.l, r.d
    public final void D() {
        this.f3985w0.t();
        this.f3986x0 = 0;
        this.f3987y0 = 0;
        super.D();
    }

    @Override // r.d
    public final void Q(boolean z4, boolean z5) {
        super.Q(z4, z5);
        int size = this.f4025q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f4025q0.get(i4)).Q(z4, z5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:349:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:352:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:360:0x0604  */
    /* JADX WARN: Code duplicated, block: B:361:0x060b  */
    /* JADX WARN: Code duplicated, block: B:367:0x061f  */
    /* JADX WARN: Code duplicated, block: B:373:0x0638  */
    /* JADX WARN: Code duplicated, block: B:376:0x063e  */
    /* JADX WARN: Code duplicated, block: B:378:0x0646 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:380:0x064f  */
    /* JADX WARN: Code duplicated, block: B:381:0x0654  */
    /* JADX WARN: Code duplicated, block: B:386:0x0662  */
    /* JADX WARN: Code duplicated, block: B:390:0x066d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0678 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x067e  */
    /* JADX WARN: Code duplicated, block: B:398:0x0686  */
    /* JADX WARN: Code duplicated, block: B:402:0x068d  */
    /* JADX WARN: Code duplicated, block: B:405:0x0697  */
    /* JADX WARN: Code duplicated, block: B:407:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:411:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:414:0x06c5 A[Catch: Exception -> 0x06d3, LOOP:12: B:413:0x06c3->B:414:0x06c5, LOOP_END, TryCatch #7 {Exception -> 0x06d3, blocks: (B:412:0x06b7, B:414:0x06c5, B:418:0x06da), top: B:556:0x06b7 }] */
    /* JADX WARN: Code duplicated, block: B:423:0x06e7 A[Catch: Exception -> 0x0712, TRY_LEAVE, TryCatch #9 {Exception -> 0x0712, blocks: (B:421:0x06e1, B:423:0x06e7), top: B:560:0x06e1 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0716  */
    /* JADX WARN: Code duplicated, block: B:438:0x071c A[Catch: Exception -> 0x0708, TRY_ENTER, TryCatch #3 {Exception -> 0x0708, blocks: (B:427:0x0701, B:438:0x071c, B:440:0x0722, B:443:0x0742, B:445:0x0748, B:449:0x0760), top: B:548:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0742 A[Catch: Exception -> 0x0708, TRY_ENTER, TryCatch #3 {Exception -> 0x0708, blocks: (B:427:0x0701, B:438:0x071c, B:440:0x0722, B:443:0x0742, B:445:0x0748, B:449:0x0760), top: B:548:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x076f A[Catch: Exception -> 0x079a, TryCatch #1 {Exception -> 0x079a, blocks: (B:436:0x0718, B:441:0x073e, B:453:0x076b, B:455:0x076f, B:457:0x0775), top: B:544:0x0718 }] */
    /* JADX WARN: Code duplicated, block: B:471:0x079e  */
    /* JADX WARN: Code duplicated, block: B:473:0x07a3 A[PHI: r21 r22 r24
      0x07a3: PHI (r21v4 ??) = (r21v32 ??), (r21v33 ??) binds: [B:477:0x07c0, B:472:0x07a0] A[DONT_GENERATE, DONT_INLINE]
      0x07a3: PHI (r22v3 r.c) = (r22v5 r.c), (r22v11 r.c) binds: [B:477:0x07c0, B:472:0x07a0] A[DONT_GENERATE, DONT_INLINE]
      0x07a3: PHI (r24v3 r.c) = (r24v5 r.c), (r24v12 r.c) binds: [B:477:0x07c0, B:472:0x07a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:481:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:483:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:485:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:488:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:490:0x0803 A[LOOP:13: B:489:0x0801->B:490:0x0803, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:494:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:509:0x087c  */
    /* JADX WARN: Code duplicated, block: B:512:0x088e  */
    /* JADX WARN: Code duplicated, block: B:513:0x0899  */
    /* JADX WARN: Code duplicated, block: B:516:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:517:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:519:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:521:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:524:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:527:0x08d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:534:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:535:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:539:0x0900  */
    /* JADX WARN: Code duplicated, block: B:560:0x06e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x06a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32 */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r30v0, types: [r.d, r.e, r.l] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r5v41, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v71, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [int] */
    @Override // r.l
    public final void S() {
        int iL;
        ?? r23;
        c cVar;
        int i4;
        int i5;
        int i6;
        c cVar2;
        p.d dVar;
        int i7;
        boolean z4;
        boolean z5;
        char c5;
        boolean z6;
        int i8;
        int i9;
        ?? r12;
        int i10;
        boolean z7;
        ?? r21;
        int i11;
        ?? r22;
        ?? r24;
        boolean zX;
        int size;
        int i12;
        boolean z8;
        d dVar2;
        ?? r25;
        boolean z9;
        boolean z10;
        int iMax;
        ?? r6;
        ?? r17;
        boolean z11;
        int iMax2;
        ?? r4;
        boolean z12;
        boolean z13;
        ?? r5;
        int i13;
        boolean z14;
        ?? r7;
        boolean z15;
        boolean z16;
        ?? r8;
        ?? r9;
        ?? r26;
        boolean z17;
        int i14;
        boolean z18;
        int i15;
        ?? r27;
        WeakReference weakReference;
        c cVar3;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        d dVar3;
        int i16;
        int i17;
        int i18;
        char c6;
        o oVar;
        o oVar2;
        int i19;
        int iR;
        int i20;
        int iB;
        o oVar3;
        o oVar4;
        int[] iArr;
        boolean[] zArr = k.f4024a;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size2 = this.f4025q0.size();
        int iMax3 = Math.max(0, r());
        int iMax4 = Math.max(0, l());
        int[] iArr2 = this.f3969p0;
        int i21 = iArr2[1];
        int i22 = iArr2[0];
        int i23 = this.f3982t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i23 == 0 && k.b(this.D0, 1)) {
            n nVar = this.f3983u0;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            F();
            ArrayList arrayList = this.f4025q0;
            int size3 = arrayList.size();
            for (int i26 = 0; i26 < size3; i26++) {
                ((d) arrayList.get(i26)).F();
            }
            boolean z19 = this.f3984v0;
            if (i24 == 1) {
                K(0, r());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i27 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i27 < size3) {
                c cVar7 = cVar6;
                d dVar4 = (d) arrayList.get(i27);
                int i28 = iMax4;
                if (dVar4 instanceof h) {
                    h hVar = (h) dVar4;
                    iArr = iArr2;
                    if (hVar.f4020u0 == 1) {
                        int i29 = hVar.f4017r0;
                        if (i29 != -1) {
                            hVar.S(i29);
                        } else if (hVar.f4018s0 != -1 && B()) {
                            hVar.S(r() - hVar.f4018s0);
                        } else if (B()) {
                            hVar.S((int) ((hVar.f4016q0 * r()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar4 instanceof a) && ((a) dVar4).U() == 0) {
                        z21 = true;
                    }
                }
                i27++;
                iMax4 = i28;
                cVar6 = cVar7;
                iArr2 = iArr;
            }
            iL = iMax4;
            r23 = iArr2;
            cVar = cVar6;
            if (z20) {
                for (int i30 = 0; i30 < size3; i30++) {
                    d dVar5 = (d) arrayList.get(i30);
                    if (dVar5 instanceof h) {
                        h hVar2 = (h) dVar5;
                        if (hVar2.f4020u0 == 1) {
                            s.h.b(0, hVar2, nVar, z19);
                        }
                    }
                }
            }
            s.h.b(0, this, nVar, z19);
            if (z21) {
                for (int i31 = 0; i31 < size3; i31++) {
                    d dVar6 = (d) arrayList.get(i31);
                    if (dVar6 instanceof a) {
                        a aVar = (a) dVar6;
                        if (aVar.U() == 0 && aVar.T()) {
                            s.h.b(1, aVar, nVar, z19);
                        }
                    }
                }
            }
            if (i25 == 1) {
                L(0, l());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            boolean z22 = false;
            boolean z23 = false;
            for (int i32 = 0; i32 < size3; i32++) {
                d dVar7 = (d) arrayList.get(i32);
                if (dVar7 instanceof h) {
                    h hVar3 = (h) dVar7;
                    if (hVar3.f4020u0 == 0) {
                        int i33 = hVar3.f4017r0;
                        if (i33 != -1) {
                            hVar3.S(i33);
                        } else if (hVar3.f4018s0 != -1 && C()) {
                            hVar3.S(l() - hVar3.f4018s0);
                        } else if (C()) {
                            hVar3.S((int) ((hVar3.f4016q0 * l()) + 0.5f));
                        }
                        z22 = true;
                    }
                } else if ((dVar7 instanceof a) && ((a) dVar7).U() == 1) {
                    z23 = true;
                }
            }
            if (z22) {
                for (int i34 = 0; i34 < size3; i34++) {
                    d dVar8 = (d) arrayList.get(i34);
                    if (dVar8 instanceof h) {
                        h hVar4 = (h) dVar8;
                        if (hVar4.f4020u0 == 0) {
                            s.h.g(1, hVar4, nVar);
                        }
                    }
                }
            }
            s.h.g(0, this, nVar);
            if (z23) {
                for (int i35 = 0; i35 < size3; i35++) {
                    d dVar9 = (d) arrayList.get(i35);
                    if (dVar9 instanceof a) {
                        a aVar2 = (a) dVar9;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            s.h.g(1, aVar2, nVar);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size3; i36++) {
                d dVar10 = (d) arrayList.get(i36);
                if (dVar10.A() && s.h.a(dVar10)) {
                    W(dVar10, nVar, s.h.f4167a);
                    if (!(dVar10 instanceof h)) {
                        s.h.b(0, dVar10, nVar, z19);
                        s.h.g(0, dVar10, nVar);
                    } else if (((h) dVar10).f4020u0 == 0) {
                        s.h.g(0, dVar10, nVar);
                    } else {
                        s.h.b(0, dVar10, nVar, z19);
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                d dVar11 = (d) this.f4025q0.get(i37);
                if (dVar11.A() && !(dVar11 instanceof h) && !(dVar11 instanceof a) && !(dVar11 instanceof g) && !dVar11.F) {
                    int iK = dVar11.k(0);
                    int iK2 = dVar11.k(1);
                    if (iK != 3 || dVar11.f3971r == 1 || iK2 != 3 || dVar11.f3972s == 1) {
                        W(dVar11, this.f3983u0, new s.b());
                    }
                }
            }
        } else {
            iL = iMax4;
            r23 = iArr2;
            cVar = cVar6;
        }
        p.d dVar12 = this.f3985w0;
        if (size2 <= 2 || !((i22 == 2 || i21 == 2) && k.b(this.D0, 1024))) {
            i4 = iMax3;
            i5 = size2;
            i6 = i21;
            cVar2 = cVar5;
            dVar = dVar12;
            i7 = i22;
        } else {
            n nVar2 = this.f3983u0;
            ArrayList arrayList2 = this.f4025q0;
            int size4 = arrayList2.size();
            int i38 = 0;
            while (true) {
                if (i38 < size4) {
                    d dVar13 = (d) arrayList2.get(i38);
                    ?? r10 = r23[0];
                    ?? r11 = r23[1];
                    int[] iArr3 = dVar13.f3969p0;
                    cVar2 = cVar5;
                    if (q.y(r10, r11, iArr3[0], iArr3[1]) && !(dVar13 instanceof g)) {
                        i38++;
                        cVar5 = cVar2;
                    } else {
                        i16 = iMax3;
                        i5 = size2;
                        i17 = i21;
                        i18 = i22;
                        dVar = dVar12;
                    }
                } else {
                    cVar2 = cVar5;
                    int i39 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList<j> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<j> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i39 < size4) {
                        int i40 = size2;
                        d dVar14 = (d) arrayList2.get(i39);
                        int i41 = i21;
                        ?? r13 = r23[0];
                        int i42 = iMax3;
                        ?? r14 = r23[1];
                        int i43 = i22;
                        int[] iArr4 = dVar14.f3969p0;
                        p.d dVar15 = dVar12;
                        if (!q.y(r13, r14, iArr4[0], iArr4[1])) {
                            W(dVar14, nVar2, this.L0);
                        }
                        boolean z24 = dVar14 instanceof h;
                        if (z24) {
                            h hVar5 = (h) dVar14;
                            if (hVar5.f4020u0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(hVar5);
                            }
                            if (hVar5.f4020u0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(hVar5);
                            }
                        }
                        if (dVar14 instanceof j) {
                            if (dVar14 instanceof a) {
                                a aVar3 = (a) dVar14;
                                if (aVar3.U() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(aVar3);
                                }
                                if (aVar3.U() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(aVar3);
                                }
                            } else {
                                j jVar = (j) dVar14;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(jVar);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(jVar);
                            }
                        }
                        if (dVar14.I.f3934f == null && dVar14.K.f3934f == null && !z24 && !(dVar14 instanceof a)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(dVar14);
                        }
                        if (dVar14.J.f3934f == null && dVar14.L.f3934f == null && dVar14.M.f3934f == null && !z24 && !(dVar14 instanceof a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(dVar14);
                        }
                        i39++;
                        i21 = i41;
                        size2 = i40;
                        iMax3 = i42;
                        i22 = i43;
                        dVar12 = dVar15;
                    }
                    i16 = iMax3;
                    p.d dVar16 = dVar12;
                    i5 = size2;
                    i17 = i21;
                    i18 = i22;
                    ArrayList<o> arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            q.d((h) it.next(), 0, arrayList9, null);
                        }
                    }
                    int i44 = 0;
                    o oVar5 = null;
                    if (arrayList4 != null) {
                        for (j jVar2 : arrayList4) {
                            o oVarD = q.d(jVar2, i44, arrayList9, oVar5);
                            jVar2.S(i44, oVarD, arrayList9);
                            oVarD.a(arrayList9);
                            i44 = 0;
                            oVar5 = null;
                        }
                    }
                    HashSet hashSet = j(2).f3929a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            q.d(((c) it2.next()).f3932d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = j(4).f3929a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            q.d(((c) it3.next()).f3932d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = j(7).f3929a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            q.d(((c) it4.next()).f3932d, 0, arrayList9, null);
                        }
                    }
                    o oVar6 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            q.d((d) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            q.d((h) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i45 = 1;
                    if (arrayList6 != null) {
                        for (j jVar3 : arrayList6) {
                            o oVarD2 = q.d(jVar3, i45, arrayList9, oVar6);
                            jVar3.S(i45, oVarD2, arrayList9);
                            oVarD2.a(arrayList9);
                            i45 = 1;
                            oVar6 = null;
                        }
                    }
                    HashSet hashSet4 = j(3).f3929a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            q.d(((c) it7.next()).f3932d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = j(6).f3929a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            q.d(((c) it8.next()).f3932d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = j(5).f3929a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            q.d(((c) it9.next()).f3932d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = j(7).f3929a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            q.d(((c) it10.next()).f3932d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            q.d((d) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i46 = 0; i46 < size4; i46++) {
                        d dVar17 = (d) arrayList2.get(i46);
                        int[] iArr5 = dVar17.f3969p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i47 = dVar17.f3965n0;
                            int size5 = arrayList9.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size5) {
                                    oVar3 = null;
                                    break;
                                }
                                oVar3 = (o) arrayList9.get(i48);
                                if (i47 == oVar3.f4183b) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            int i49 = dVar17.f3967o0;
                            int size6 = arrayList9.size();
                            int i50 = 0;
                            while (true) {
                                if (i50 >= size6) {
                                    oVar4 = null;
                                    break;
                                }
                                oVar4 = (o) arrayList9.get(i50);
                                if (i49 == oVar4.f4183b) {
                                    break;
                                } else {
                                    i50++;
                                }
                            }
                            if (oVar3 != null && oVar4 != null) {
                                oVar3.c(0, oVar4);
                                oVar4.f4184c = 2;
                                arrayList9.remove(oVar3);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (r23[0] == 2) {
                            int i51 = 0;
                            oVar = null;
                            for (o oVar7 : arrayList9) {
                                if (oVar7.f4184c != 1) {
                                    p.d dVar18 = dVar16;
                                    int iB2 = oVar7.b(dVar18, 0);
                                    if (iB2 > i51) {
                                        oVar = oVar7;
                                        i51 = iB2;
                                    }
                                    dVar16 = dVar18;
                                }
                            }
                            dVar = dVar16;
                            c6 = 1;
                            if (oVar != null) {
                                N(1);
                                P(i51);
                            }
                            if (r23[c6] == 2) {
                                i20 = 0;
                                oVar2 = null;
                                for (o oVar8 : arrayList9) {
                                    if (oVar8.f4184c != 0 && (iB = oVar8.b(dVar, 1)) > i20) {
                                        oVar2 = oVar8;
                                        i20 = iB;
                                    }
                                }
                                if (oVar2 != null) {
                                    O(1);
                                    M(i20);
                                } else {
                                    oVar2 = null;
                                }
                            } else {
                                oVar2 = null;
                            }
                            if (oVar == null || oVar2 != null) {
                                i7 = i18;
                                if (i7 == 2) {
                                    i19 = i16;
                                    if (i19 < r() || i19 <= 0) {
                                        iR = r();
                                    } else {
                                        P(i19);
                                        this.E0 = true;
                                    }
                                    i6 = i17;
                                    if (i6 == 2) {
                                        iL = iL;
                                        if (iL < l() || iL <= 0) {
                                            iL = l();
                                        } else {
                                            M(iL);
                                            this.F0 = true;
                                        }
                                    } else {
                                        iL = iL;
                                    }
                                    i4 = iR;
                                    z4 = true;
                                } else {
                                    i19 = i16;
                                }
                                iR = i19;
                                i6 = i17;
                                if (i6 == 2) {
                                    iL = iL;
                                    if (iL < l()) {
                                        iL = l();
                                    } else {
                                        iL = l();
                                    }
                                } else {
                                    iL = iL;
                                }
                                i4 = iR;
                                z4 = true;
                            }
                            if (!X(64) || X(128)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            dVar.getClass();
                            dVar.f3682g = false;
                            if (this.D0 == 0 && z5) {
                                c5 = 1;
                                dVar.f3682g = true;
                            } else {
                                c5 = 1;
                            }
                            ArrayList arrayList10 = this.f4025q0;
                            if (r23[0] != 2 || r23[c5] == 2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.f3988z0 = 0;
                            this.A0 = 0;
                            i8 = i5;
                            for (i9 = 0; i9 < i8; i9++) {
                                dVar3 = (d) this.f4025q0.get(i9);
                                if (dVar3 instanceof l) {
                                    ((l) dVar3).S();
                                }
                            }
                            boolean zX2 = X(64);
                            r12 = z4;
                            i10 = 0;
                            z7 = true;
                            while (z7) {
                                i11 = i10 + 1;
                                try {
                                    dVar.t();
                                    this.f3988z0 = 0;
                                    this.A0 = 0;
                                    h(dVar);
                                    for (i15 = 0; i15 < i8; i15++) {
                                        ((d) this.f4025q0.get(i15)).h(dVar);
                                    }
                                    U(dVar);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    c cVar8 = (c) this.G0.get();
                                                    cVar3 = cVar2;
                                                    try {
                                                        p.i iVarK = dVar.k(cVar3);
                                                        p.d dVar19 = this.f3985w0;
                                                        r27 = r12;
                                                        cVar2 = cVar3;
                                                        try {
                                                            dVar19.f(dVar19.k(cVar8), iVarK, 0, 5);
                                                            this.G0 = null;
                                                            r27 = r27;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            z18 = true;
                                                            r22 = r27;
                                                            z17 = z18;
                                                            r26 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            r24 = r26;
                                                            if (z17) {
                                                                zArr[2] = false;
                                                                zX = X(64);
                                                                R(dVar, zX);
                                                                size = this.f4025q0.size();
                                                                i12 = 0;
                                                                z8 = false;
                                                                while (i12 < size) {
                                                                    dVar2 = (d) this.f4025q0.get(i12);
                                                                    dVar2.R(dVar, zX);
                                                                    boolean z25 = zX;
                                                                    int i52 = size;
                                                                    if (dVar2.f3952h == -1) {
                                                                        z8 = true;
                                                                    } else {
                                                                        z8 = true;
                                                                    }
                                                                    i12++;
                                                                    zX = z25;
                                                                    size = i52;
                                                                    z8 = z8;
                                                                }
                                                                z9 = z8;
                                                                r25 = r24;
                                                            } else {
                                                                R(dVar, zX2);
                                                                for (i14 = 0; i14 < i8; i14++) {
                                                                    ((d) this.f4025q0.get(i14)).R(dVar, zX2);
                                                                }
                                                                z9 = false;
                                                                r25 = r26;
                                                            }
                                                            if (z6) {
                                                                z10 = z6;
                                                            } else {
                                                                z10 = z6;
                                                            }
                                                            iMax = Math.max(this.f3941b0, r());
                                                            if (iMax > r()) {
                                                                P(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z11 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r17 = r25;
                                                                z11 = z9;
                                                            }
                                                            iMax2 = Math.max(this.f3943c0, l());
                                                            if (iMax2 > l()) {
                                                                M(iMax2);
                                                                r23[r6] = r6;
                                                                r9 = r6;
                                                                z12 = r9 == true ? 1 : 0;
                                                            } else {
                                                                r4 = r17;
                                                            }
                                                            if (r4 == 0) {
                                                                z12 = z11;
                                                                if (r23[0] == 2) {
                                                                    r8 = r4;
                                                                    z16 = z12;
                                                                    if (r() > i4) {
                                                                        this.E0 = r6;
                                                                        r23[0] = r6;
                                                                        P(i4);
                                                                        ?? r15 = r6;
                                                                        z16 = r15 == true ? 1 : 0;
                                                                        r8 = r15;
                                                                    }
                                                                }
                                                                r4 = r9;
                                                                r8 = r4;
                                                                r8 = r4;
                                                                z16 = z12;
                                                                z16 = z12;
                                                                r5 = r8;
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z13 = z16;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i11 > i13) {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = false;
                                                                } else {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = z14;
                                                                }
                                                                r12 = r7;
                                                                i10 = i11;
                                                                z6 = z10;
                                                                z7 = z15;
                                                            } else {
                                                                z12 = z11;
                                                                r4 = r9;
                                                                r5 = r4;
                                                                z13 = z12;
                                                            }
                                                            r5 = r8;
                                                            z13 = z16;
                                                            i13 = 8;
                                                            r7 = r5;
                                                            z14 = z13;
                                                            if (i11 > i13) {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = false;
                                                            } else {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = z14;
                                                            }
                                                            r12 = r7;
                                                            i10 = i11;
                                                            z6 = z10;
                                                            z7 = z15;
                                                        }
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        r27 = r12;
                                                        cVar2 = cVar3;
                                                    }
                                                } else {
                                                    r27 = r12;
                                                }
                                                try {
                                                    weakReference2 = this.I0;
                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                        c cVar9 = (c) this.I0.get();
                                                        p.i iVarK2 = dVar.k(this.L);
                                                        p.d dVar20 = this.f3985w0;
                                                        dVar20.f(iVarK2, dVar20.k(cVar9), 0, 5);
                                                        this.I0 = null;
                                                    }
                                                    weakReference3 = this.H0;
                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                        c cVar10 = (c) this.H0.get();
                                                        cVar4 = cVar;
                                                        try {
                                                            p.i iVarK3 = dVar.k(cVar4);
                                                            p.d dVar21 = this.f3985w0;
                                                            cVar = cVar4;
                                                            dVar21.f(dVar21.k(cVar10), iVarK3, 0, 5);
                                                            this.H0 = null;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            cVar = cVar4;
                                                            z18 = true;
                                                            r22 = r27;
                                                            z17 = z18;
                                                            r26 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            r24 = r26;
                                                            if (z17) {
                                                                R(dVar, zX2);
                                                                while (i14 < i8) {
                                                                    ((d) this.f4025q0.get(i14)).R(dVar, zX2);
                                                                }
                                                                z9 = false;
                                                                r25 = r26;
                                                            }
                                                            if (z6) {
                                                                z10 = z6;
                                                            } else {
                                                                z10 = z6;
                                                            }
                                                            iMax = Math.max(this.f3941b0, r());
                                                            if (iMax > r()) {
                                                                P(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z11 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r17 = r25;
                                                                z11 = z9;
                                                            }
                                                            iMax2 = Math.max(this.f3943c0, l());
                                                            if (iMax2 > l()) {
                                                                M(iMax2);
                                                                r23[r6] = r6;
                                                                r9 = r6;
                                                                z12 = r9 == true ? 1 : 0;
                                                            } else {
                                                                r4 = r17;
                                                            }
                                                            if (r4 == 0) {
                                                                z12 = z11;
                                                                if (r23[0] == 2) {
                                                                    r8 = r4;
                                                                    z16 = z12;
                                                                    if (r() > i4) {
                                                                        this.E0 = r6;
                                                                        r23[0] = r6;
                                                                        P(i4);
                                                                        ?? r16 = r6;
                                                                        z16 = r16 == true ? 1 : 0;
                                                                        r8 = r16;
                                                                    }
                                                                }
                                                                r4 = r9;
                                                                r8 = r4;
                                                                r8 = r4;
                                                                z16 = z12;
                                                                z16 = z12;
                                                                r5 = r8;
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z13 = z16;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i11 > i13) {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = false;
                                                                } else {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = z14;
                                                                }
                                                                r12 = r7;
                                                                i10 = i11;
                                                                z6 = z10;
                                                                z7 = z15;
                                                            } else {
                                                                z12 = z11;
                                                                r4 = r9;
                                                                r5 = r4;
                                                                z13 = z12;
                                                            }
                                                            r5 = r8;
                                                            z13 = z16;
                                                            i13 = 8;
                                                            r7 = r5;
                                                            z14 = z13;
                                                            if (i11 > i13) {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = false;
                                                            } else {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = z14;
                                                            }
                                                            r12 = r7;
                                                            i10 = i11;
                                                            z6 = z10;
                                                            z7 = z15;
                                                        }
                                                    }
                                                    weakReference4 = this.J0;
                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                        c cVar11 = (c) this.J0.get();
                                                        p.i iVarK4 = dVar.k(this.K);
                                                        try {
                                                            p.d dVar22 = this.f3985w0;
                                                            try {
                                                                dVar22.f(iVarK4, dVar22.k(cVar11), 0, 5);
                                                                try {
                                                                    this.J0 = null;
                                                                } catch (Exception e8) {
                                                                    e = e8;
                                                                    z17 = true;
                                                                    r26 = r27;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    r24 = r26;
                                                                    if (z17) {
                                                                        R(dVar, zX2);
                                                                        while (i14 < i8) {
                                                                            ((d) this.f4025q0.get(i14)).R(dVar, zX2);
                                                                        }
                                                                        z9 = false;
                                                                        r25 = r26;
                                                                    }
                                                                    if (z6) {
                                                                        z10 = z6;
                                                                    } else {
                                                                        z10 = z6;
                                                                    }
                                                                    iMax = Math.max(this.f3941b0, r());
                                                                    if (iMax > r()) {
                                                                        P(iMax);
                                                                        r6 = 1;
                                                                        r23[0] = 1;
                                                                        z11 = true;
                                                                        r17 = 1;
                                                                    } else {
                                                                        r6 = 1;
                                                                        r17 = r25;
                                                                        z11 = z9;
                                                                    }
                                                                    iMax2 = Math.max(this.f3943c0, l());
                                                                    if (iMax2 > l()) {
                                                                        M(iMax2);
                                                                        r23[r6] = r6;
                                                                        r9 = r6;
                                                                        z12 = r9 == true ? 1 : 0;
                                                                    } else {
                                                                        r4 = r17;
                                                                    }
                                                                    if (r4 == 0) {
                                                                        z12 = z11;
                                                                        if (r23[0] == 2) {
                                                                            r8 = r4;
                                                                            z16 = z12;
                                                                            if (r() > i4) {
                                                                                this.E0 = r6;
                                                                                r23[0] = r6;
                                                                                P(i4);
                                                                                ?? r18 = r6;
                                                                                z16 = r18 == true ? 1 : 0;
                                                                                r8 = r18;
                                                                            }
                                                                        }
                                                                        r4 = r9;
                                                                        r8 = r4;
                                                                        r8 = r4;
                                                                        z16 = z12;
                                                                        z16 = z12;
                                                                        r5 = r8;
                                                                        r5 = r8;
                                                                        z13 = z16;
                                                                        z13 = z16;
                                                                        if (r23[r6] != 2) {
                                                                        }
                                                                        if (i11 > i13) {
                                                                            r5 = r8;
                                                                            z13 = z16;
                                                                            z15 = false;
                                                                        } else {
                                                                            r5 = r8;
                                                                            z13 = z16;
                                                                            z15 = z14;
                                                                        }
                                                                        r12 = r7;
                                                                        i10 = i11;
                                                                        z6 = z10;
                                                                        z7 = z15;
                                                                    } else {
                                                                        z12 = z11;
                                                                        r4 = r9;
                                                                        r5 = r4;
                                                                        z13 = z12;
                                                                    }
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    i13 = 8;
                                                                    r7 = r5;
                                                                    z14 = z13;
                                                                    if (i11 > i13) {
                                                                        r5 = r8;
                                                                        z13 = z16;
                                                                        z15 = false;
                                                                    } else {
                                                                        r5 = r8;
                                                                        z13 = z16;
                                                                        z15 = z14;
                                                                    }
                                                                    r12 = r7;
                                                                    i10 = i11;
                                                                    z6 = z10;
                                                                    z7 = z15;
                                                                }
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z17 = true;
                                                            r26 = r27;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            r24 = r26;
                                                            if (z17) {
                                                                zArr[2] = false;
                                                                zX = X(64);
                                                                R(dVar, zX);
                                                                size = this.f4025q0.size();
                                                                i12 = 0;
                                                                z8 = false;
                                                                while (i12 < size) {
                                                                    dVar2 = (d) this.f4025q0.get(i12);
                                                                    dVar2.R(dVar, zX);
                                                                    boolean z26 = zX;
                                                                    int i53 = size;
                                                                    if (dVar2.f3952h == -1) {
                                                                        z8 = true;
                                                                    } else {
                                                                        z8 = true;
                                                                    }
                                                                    i12++;
                                                                    zX = z26;
                                                                    size = i53;
                                                                    z8 = z8;
                                                                }
                                                                z9 = z8;
                                                                r25 = r24;
                                                            } else {
                                                                R(dVar, zX2);
                                                                while (i14 < i8) {
                                                                    ((d) this.f4025q0.get(i14)).R(dVar, zX2);
                                                                }
                                                                z9 = false;
                                                                r25 = r26;
                                                            }
                                                            if (z6) {
                                                                z10 = z6;
                                                            } else {
                                                                z10 = z6;
                                                            }
                                                            iMax = Math.max(this.f3941b0, r());
                                                            if (iMax > r()) {
                                                                P(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z11 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r17 = r25;
                                                                z11 = z9;
                                                            }
                                                            iMax2 = Math.max(this.f3943c0, l());
                                                            if (iMax2 > l()) {
                                                                M(iMax2);
                                                                r23[r6] = r6;
                                                                r9 = r6;
                                                                z12 = r9 == true ? 1 : 0;
                                                            } else {
                                                                r4 = r17;
                                                            }
                                                            if (r4 == 0) {
                                                                z12 = z11;
                                                                if (r23[0] == 2) {
                                                                    r8 = r4;
                                                                    z16 = z12;
                                                                    if (r() > i4) {
                                                                        this.E0 = r6;
                                                                        r23[0] = r6;
                                                                        P(i4);
                                                                        ?? r19 = r6;
                                                                        z16 = r19 == true ? 1 : 0;
                                                                        r8 = r19;
                                                                    }
                                                                }
                                                                r4 = r9;
                                                                r8 = r4;
                                                                r8 = r4;
                                                                z16 = z12;
                                                                z16 = z12;
                                                                r5 = r8;
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z13 = z16;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i11 > i13) {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = false;
                                                                } else {
                                                                    r5 = r8;
                                                                    z13 = z16;
                                                                    z15 = z14;
                                                                }
                                                                r12 = r7;
                                                                i10 = i11;
                                                                z6 = z10;
                                                                z7 = z15;
                                                            } else {
                                                                z12 = z11;
                                                                r4 = r9;
                                                                r5 = r4;
                                                                z13 = z12;
                                                            }
                                                            r5 = r8;
                                                            z13 = z16;
                                                            i13 = 8;
                                                            r7 = r5;
                                                            z14 = z13;
                                                            if (i11 > i13) {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = false;
                                                            } else {
                                                                r5 = r8;
                                                                z13 = z16;
                                                                z15 = z14;
                                                            }
                                                            r12 = r7;
                                                            i10 = i11;
                                                            z6 = z10;
                                                            z7 = z15;
                                                        }
                                                    }
                                                    dVar.p();
                                                    r24 = r27;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                r27 = r12;
                                            }
                                            zArr[2] = false;
                                            zX = X(64);
                                            R(dVar, zX);
                                            size = this.f4025q0.size();
                                            i12 = 0;
                                            z8 = false;
                                            while (i12 < size) {
                                                dVar2 = (d) this.f4025q0.get(i12);
                                                dVar2.R(dVar, zX);
                                                boolean z27 = zX;
                                                int i54 = size;
                                                if (dVar2.f3952h == -1 || dVar2.f3954i != -1) {
                                                    z8 = true;
                                                }
                                                i12++;
                                                zX = z27;
                                                size = i54;
                                                z8 = z8;
                                            }
                                            z9 = z8;
                                            r25 = r24;
                                        } else {
                                            r27 = r12;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                c cVar12 = (c) this.I0.get();
                                                p.i iVarK5 = dVar.k(this.L);
                                                p.d dVar23 = this.f3985w0;
                                                dVar23.f(iVarK5, dVar23.k(cVar12), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                c cVar13 = (c) this.H0.get();
                                                cVar4 = cVar;
                                                p.i iVarK6 = dVar.k(cVar4);
                                                p.d dVar24 = this.f3985w0;
                                                cVar = cVar4;
                                                dVar24.f(dVar24.k(cVar13), iVarK6, 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            dVar.p();
                                            r24 = r27;
                                            zArr[2] = false;
                                            zX = X(64);
                                            R(dVar, zX);
                                            size = this.f4025q0.size();
                                            i12 = 0;
                                            z8 = false;
                                            while (i12 < size) {
                                                dVar2 = (d) this.f4025q0.get(i12);
                                                dVar2.R(dVar, zX);
                                                boolean z28 = zX;
                                                int i55 = size;
                                                if (dVar2.f3952h == -1) {
                                                    z8 = true;
                                                } else {
                                                    z8 = true;
                                                }
                                                i12++;
                                                zX = z28;
                                                size = i55;
                                                z8 = z8;
                                            }
                                            z9 = z8;
                                            r25 = r24;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        r27 = r12;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    r22 = r12;
                                    z18 = z7;
                                }
                                if (z6 || i11 >= 8 || !zArr[2]) {
                                    z10 = z6;
                                } else {
                                    int i56 = 0;
                                    int iMax5 = 0;
                                    int iMax6 = 0;
                                    while (i56 < i8) {
                                        d dVar25 = (d) this.f4025q0.get(i56);
                                        iMax6 = Math.max(iMax6, dVar25.r() + dVar25.Y);
                                        iMax5 = Math.max(iMax5, dVar25.l() + dVar25.Z);
                                        i56++;
                                        z6 = z6;
                                    }
                                    z10 = z6;
                                    int iMax7 = Math.max(this.f3941b0, iMax6);
                                    int iMax8 = Math.max(this.f3943c0, iMax5);
                                    z9 = z9;
                                    r25 = r25;
                                    if (i7 == 2 && r() < iMax7) {
                                        z9 = z9;
                                        r25 = r25;
                                        P(iMax7);
                                        r23[0] = 2;
                                        z9 = true;
                                        r25 = 1;
                                    }
                                    if (i6 == 2 && l() < iMax8) {
                                        M(iMax8);
                                        r23[1] = 2;
                                        z9 = true;
                                        r25 = 1;
                                    }
                                }
                                iMax = Math.max(this.f3941b0, r());
                                if (iMax > r()) {
                                    P(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z11 = true;
                                    r17 = 1;
                                } else {
                                    r6 = 1;
                                    r17 = r25;
                                    z11 = z9;
                                }
                                iMax2 = Math.max(this.f3943c0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r23[r6] = r6;
                                    r9 = r6;
                                    z12 = r9 == true ? 1 : 0;
                                } else {
                                    r4 = r17;
                                }
                                if (r4 == 0) {
                                    z12 = z11;
                                    if (r23[0] == 2 && i4 > 0) {
                                        r8 = r4;
                                        z16 = z12;
                                        if (r() > i4) {
                                            this.E0 = r6;
                                            r23[0] = r6;
                                            P(i4);
                                            ?? r110 = r6;
                                            z16 = r110 == true ? 1 : 0;
                                            r8 = r110;
                                        }
                                    }
                                    r4 = r9;
                                    r8 = r4;
                                    r8 = r4;
                                    z16 = z12;
                                    z16 = z12;
                                    r5 = r8;
                                    r5 = r8;
                                    z13 = z16;
                                    z13 = z16;
                                    if (r23[r6] != 2 && iL > 0 && l() > iL) {
                                        this.F0 = r6;
                                        r23[r6] = r6;
                                        M(iL);
                                        r7 = 1;
                                        i13 = 8;
                                        z14 = true;
                                    }
                                    if (i11 > i13) {
                                        r5 = r8;
                                        z13 = z16;
                                        z15 = false;
                                    } else {
                                        r5 = r8;
                                        z13 = z16;
                                        z15 = z14;
                                    }
                                    r12 = r7;
                                    i10 = i11;
                                    z6 = z10;
                                    z7 = z15;
                                } else {
                                    z12 = z11;
                                    r4 = r9;
                                    r5 = r4;
                                    z13 = z12;
                                }
                                r5 = r8;
                                z13 = z16;
                                i13 = 8;
                                r7 = r5;
                                z14 = z13;
                                if (i11 > i13) {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = false;
                                } else {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = z14;
                                }
                                r12 = r7;
                                i10 = i11;
                                z6 = z10;
                                z7 = z15;
                            }
                            r21 = r12;
                            this.f4025q0 = arrayList10;
                            if (r21 != 0) {
                                r23[0] = i7;
                                r23[1] = i6;
                            }
                            G(dVar.f3687l);
                        }
                        dVar = dVar16;
                        c6 = 1;
                        oVar = null;
                        if (r23[c6] == 2) {
                            i20 = 0;
                            oVar2 = null;
                            while (r0.hasNext()) {
                                if (oVar8.f4184c != 0) {
                                    oVar2 = oVar8;
                                    i20 = iB;
                                }
                            }
                            if (oVar2 != null) {
                                O(1);
                                M(i20);
                            } else {
                                oVar2 = null;
                            }
                        } else {
                            oVar2 = null;
                        }
                        if (oVar == null) {
                        }
                        i7 = i18;
                        if (i7 == 2) {
                            i19 = i16;
                            if (i19 < r()) {
                            }
                            iR = r();
                            i6 = i17;
                            if (i6 == 2) {
                                iL = iL;
                                if (iL < l()) {
                                    iL = l();
                                } else {
                                    iL = l();
                                }
                            } else {
                                iL = iL;
                            }
                            i4 = iR;
                            z4 = true;
                            if (X(64)) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            dVar.getClass();
                            dVar.f3682g = false;
                            if (this.D0 == 0) {
                                c5 = 1;
                            } else {
                                c5 = 1;
                            }
                            ArrayList arrayList11 = this.f4025q0;
                            if (r23[0] != 2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            this.f3988z0 = 0;
                            this.A0 = 0;
                            i8 = i5;
                            while (i9 < i8) {
                                dVar3 = (d) this.f4025q0.get(i9);
                                if (dVar3 instanceof l) {
                                    ((l) dVar3).S();
                                }
                            }
                            boolean zX3 = X(64);
                            r12 = z4;
                            i10 = 0;
                            z7 = true;
                            while (z7) {
                                i11 = i10 + 1;
                                dVar.t();
                                this.f3988z0 = 0;
                                this.A0 = 0;
                                h(dVar);
                                while (i15 < i8) {
                                    ((d) this.f4025q0.get(i15)).h(dVar);
                                }
                                U(dVar);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        c cVar14 = (c) this.G0.get();
                                        cVar3 = cVar2;
                                        p.i iVarK7 = dVar.k(cVar3);
                                        p.d dVar110 = this.f3985w0;
                                        r27 = r12;
                                        cVar2 = cVar3;
                                        dVar110.f(dVar110.k(cVar14), iVarK7, 0, 5);
                                        this.G0 = null;
                                        r27 = r27;
                                    } else {
                                        r27 = r12;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        c cVar15 = (c) this.I0.get();
                                        p.i iVarK8 = dVar.k(this.L);
                                        p.d dVar26 = this.f3985w0;
                                        dVar26.f(iVarK8, dVar26.k(cVar15), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        c cVar16 = (c) this.H0.get();
                                        cVar4 = cVar;
                                        p.i iVarK9 = dVar.k(cVar4);
                                        p.d dVar27 = this.f3985w0;
                                        cVar = cVar4;
                                        dVar27.f(dVar27.k(cVar16), iVarK9, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    dVar.p();
                                    r24 = r27;
                                    zArr[2] = false;
                                    zX = X(64);
                                    R(dVar, zX);
                                    size = this.f4025q0.size();
                                    i12 = 0;
                                    z8 = false;
                                    while (i12 < size) {
                                        dVar2 = (d) this.f4025q0.get(i12);
                                        dVar2.R(dVar, zX);
                                        boolean z29 = zX;
                                        int i57 = size;
                                        if (dVar2.f3952h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i12++;
                                        zX = z29;
                                        size = i57;
                                        z8 = z8;
                                    }
                                    z9 = z8;
                                    r25 = r24;
                                } else {
                                    r27 = r12;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        c cVar17 = (c) this.I0.get();
                                        p.i iVarK10 = dVar.k(this.L);
                                        p.d dVar28 = this.f3985w0;
                                        dVar28.f(iVarK10, dVar28.k(cVar17), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        c cVar18 = (c) this.H0.get();
                                        cVar4 = cVar;
                                        p.i iVarK11 = dVar.k(cVar4);
                                        p.d dVar29 = this.f3985w0;
                                        cVar = cVar4;
                                        dVar29.f(dVar29.k(cVar18), iVarK11, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    dVar.p();
                                    r24 = r27;
                                    zArr[2] = false;
                                    zX = X(64);
                                    R(dVar, zX);
                                    size = this.f4025q0.size();
                                    i12 = 0;
                                    z8 = false;
                                    while (i12 < size) {
                                        dVar2 = (d) this.f4025q0.get(i12);
                                        dVar2.R(dVar, zX);
                                        boolean z210 = zX;
                                        int i58 = size;
                                        if (dVar2.f3952h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i12++;
                                        zX = z210;
                                        size = i58;
                                        z8 = z8;
                                    }
                                    z9 = z8;
                                    r25 = r24;
                                }
                                if (z6) {
                                    z10 = z6;
                                } else {
                                    z10 = z6;
                                }
                                iMax = Math.max(this.f3941b0, r());
                                if (iMax > r()) {
                                    P(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z11 = true;
                                    r17 = 1;
                                } else {
                                    r6 = 1;
                                    r17 = r25;
                                    z11 = z9;
                                }
                                iMax2 = Math.max(this.f3943c0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r23[r6] = r6;
                                    r9 = r6;
                                    z12 = r9 == true ? 1 : 0;
                                } else {
                                    r4 = r17;
                                }
                                if (r4 == 0) {
                                    z12 = z11;
                                    if (r23[0] == 2) {
                                        r8 = r4;
                                        z16 = z12;
                                        if (r() > i4) {
                                            this.E0 = r6;
                                            r23[0] = r6;
                                            P(i4);
                                            ?? r111 = r6;
                                            z16 = r111 == true ? 1 : 0;
                                            r8 = r111;
                                        }
                                    }
                                    r4 = r9;
                                    r8 = r4;
                                    r8 = r4;
                                    z16 = z12;
                                    z16 = z12;
                                    r5 = r8;
                                    r5 = r8;
                                    z13 = z16;
                                    z13 = z16;
                                    if (r23[r6] != 2) {
                                    }
                                    if (i11 > i13) {
                                        r5 = r8;
                                        z13 = z16;
                                        z15 = false;
                                    } else {
                                        r5 = r8;
                                        z13 = z16;
                                        z15 = z14;
                                    }
                                    r12 = r7;
                                    i10 = i11;
                                    z6 = z10;
                                    z7 = z15;
                                } else {
                                    z12 = z11;
                                    r4 = r9;
                                    r5 = r4;
                                    z13 = z12;
                                }
                                r5 = r8;
                                z13 = z16;
                                i13 = 8;
                                r7 = r5;
                                z14 = z13;
                                if (i11 > i13) {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = false;
                                } else {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = z14;
                                }
                                r12 = r7;
                                i10 = i11;
                                z6 = z10;
                                z7 = z15;
                            }
                            r21 = r12;
                            this.f4025q0 = arrayList11;
                            if (r21 != 0) {
                                r23[0] = i7;
                                r23[1] = i6;
                            }
                            G(dVar.f3687l);
                        }
                        i19 = i16;
                        iR = i19;
                        i6 = i17;
                        if (i6 == 2) {
                            iL = iL;
                            if (iL < l()) {
                                iL = l();
                            } else {
                                iL = l();
                            }
                        } else {
                            iL = iL;
                        }
                        i4 = iR;
                        z4 = true;
                        if (X(64)) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        dVar.getClass();
                        dVar.f3682g = false;
                        if (this.D0 == 0) {
                            c5 = 1;
                        } else {
                            c5 = 1;
                        }
                        ArrayList arrayList12 = this.f4025q0;
                        if (r23[0] != 2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        this.f3988z0 = 0;
                        this.A0 = 0;
                        i8 = i5;
                        while (i9 < i8) {
                            dVar3 = (d) this.f4025q0.get(i9);
                            if (dVar3 instanceof l) {
                                ((l) dVar3).S();
                            }
                        }
                        boolean zX4 = X(64);
                        r12 = z4;
                        i10 = 0;
                        z7 = true;
                        while (z7) {
                            i11 = i10 + 1;
                            dVar.t();
                            this.f3988z0 = 0;
                            this.A0 = 0;
                            h(dVar);
                            while (i15 < i8) {
                                ((d) this.f4025q0.get(i15)).h(dVar);
                            }
                            U(dVar);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    c cVar19 = (c) this.G0.get();
                                    cVar3 = cVar2;
                                    p.i iVarK12 = dVar.k(cVar3);
                                    p.d dVar111 = this.f3985w0;
                                    r27 = r12;
                                    cVar2 = cVar3;
                                    dVar111.f(dVar111.k(cVar19), iVarK12, 0, 5);
                                    this.G0 = null;
                                    r27 = r27;
                                } else {
                                    r27 = r12;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    c cVar110 = (c) this.I0.get();
                                    p.i iVarK13 = dVar.k(this.L);
                                    p.d dVar210 = this.f3985w0;
                                    dVar210.f(iVarK13, dVar210.k(cVar110), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    c cVar111 = (c) this.H0.get();
                                    cVar4 = cVar;
                                    p.i iVarK14 = dVar.k(cVar4);
                                    p.d dVar211 = this.f3985w0;
                                    cVar = cVar4;
                                    dVar211.f(dVar211.k(cVar111), iVarK14, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                dVar.p();
                                r24 = r27;
                                zArr[2] = false;
                                zX = X(64);
                                R(dVar, zX);
                                size = this.f4025q0.size();
                                i12 = 0;
                                z8 = false;
                                while (i12 < size) {
                                    dVar2 = (d) this.f4025q0.get(i12);
                                    dVar2.R(dVar, zX);
                                    boolean z211 = zX;
                                    int i59 = size;
                                    if (dVar2.f3952h == -1) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    i12++;
                                    zX = z211;
                                    size = i59;
                                    z8 = z8;
                                }
                                z9 = z8;
                                r25 = r24;
                            } else {
                                r27 = r12;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    c cVar112 = (c) this.I0.get();
                                    p.i iVarK15 = dVar.k(this.L);
                                    p.d dVar212 = this.f3985w0;
                                    dVar212.f(iVarK15, dVar212.k(cVar112), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    c cVar113 = (c) this.H0.get();
                                    cVar4 = cVar;
                                    p.i iVarK16 = dVar.k(cVar4);
                                    p.d dVar213 = this.f3985w0;
                                    cVar = cVar4;
                                    dVar213.f(dVar213.k(cVar113), iVarK16, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                dVar.p();
                                r24 = r27;
                                zArr[2] = false;
                                zX = X(64);
                                R(dVar, zX);
                                size = this.f4025q0.size();
                                i12 = 0;
                                z8 = false;
                                while (i12 < size) {
                                    dVar2 = (d) this.f4025q0.get(i12);
                                    dVar2.R(dVar, zX);
                                    boolean z212 = zX;
                                    int i510 = size;
                                    if (dVar2.f3952h == -1) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    i12++;
                                    zX = z212;
                                    size = i510;
                                    z8 = z8;
                                }
                                z9 = z8;
                                r25 = r24;
                            }
                            if (z6) {
                                z10 = z6;
                            } else {
                                z10 = z6;
                            }
                            iMax = Math.max(this.f3941b0, r());
                            if (iMax > r()) {
                                P(iMax);
                                r6 = 1;
                                r23[0] = 1;
                                z11 = true;
                                r17 = 1;
                            } else {
                                r6 = 1;
                                r17 = r25;
                                z11 = z9;
                            }
                            iMax2 = Math.max(this.f3943c0, l());
                            if (iMax2 > l()) {
                                M(iMax2);
                                r23[r6] = r6;
                                r9 = r6;
                                z12 = r9 == true ? 1 : 0;
                            } else {
                                r4 = r17;
                            }
                            if (r4 == 0) {
                                z12 = z11;
                                if (r23[0] == 2) {
                                    r8 = r4;
                                    z16 = z12;
                                    if (r() > i4) {
                                        this.E0 = r6;
                                        r23[0] = r6;
                                        P(i4);
                                        ?? r112 = r6;
                                        z16 = r112 == true ? 1 : 0;
                                        r8 = r112;
                                    }
                                }
                                r4 = r9;
                                r8 = r4;
                                r8 = r4;
                                z16 = z12;
                                z16 = z12;
                                r5 = r8;
                                r5 = r8;
                                z13 = z16;
                                z13 = z16;
                                if (r23[r6] != 2) {
                                }
                                if (i11 > i13) {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = false;
                                } else {
                                    r5 = r8;
                                    z13 = z16;
                                    z15 = z14;
                                }
                                r12 = r7;
                                i10 = i11;
                                z6 = z10;
                                z7 = z15;
                            } else {
                                z12 = z11;
                                r4 = r9;
                                r5 = r4;
                                z13 = z12;
                            }
                            r5 = r8;
                            z13 = z16;
                            i13 = 8;
                            r7 = r5;
                            z14 = z13;
                            if (i11 > i13) {
                                r5 = r8;
                                z13 = z16;
                                z15 = false;
                            } else {
                                r5 = r8;
                                z13 = z16;
                                z15 = z14;
                            }
                            r12 = r7;
                            i10 = i11;
                            z6 = z10;
                            z7 = z15;
                        }
                        r21 = r12;
                        this.f4025q0 = arrayList12;
                        if (r21 != 0) {
                            r23[0] = i7;
                            r23[1] = i6;
                        }
                        G(dVar.f3687l);
                    }
                    dVar = dVar16;
                }
                i6 = i17;
                i4 = i16;
                i7 = i18;
            }
        }
        z4 = false;
        if (X(64)) {
            z5 = true;
        } else {
            z5 = true;
        }
        dVar.getClass();
        dVar.f3682g = false;
        if (this.D0 == 0) {
            c5 = 1;
        } else {
            c5 = 1;
        }
        ArrayList arrayList13 = this.f4025q0;
        if (r23[0] != 2) {
            z6 = true;
        } else {
            z6 = true;
        }
        this.f3988z0 = 0;
        this.A0 = 0;
        i8 = i5;
        while (i9 < i8) {
            dVar3 = (d) this.f4025q0.get(i9);
            if (dVar3 instanceof l) {
                ((l) dVar3).S();
            }
        }
        boolean zX5 = X(64);
        r12 = z4;
        i10 = 0;
        z7 = true;
        while (z7) {
            i11 = i10 + 1;
            dVar.t();
            this.f3988z0 = 0;
            this.A0 = 0;
            h(dVar);
            while (i15 < i8) {
                ((d) this.f4025q0.get(i15)).h(dVar);
            }
            U(dVar);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    c cVar114 = (c) this.G0.get();
                    cVar3 = cVar2;
                    p.i iVarK17 = dVar.k(cVar3);
                    p.d dVar112 = this.f3985w0;
                    r27 = r12;
                    cVar2 = cVar3;
                    dVar112.f(dVar112.k(cVar114), iVarK17, 0, 5);
                    this.G0 = null;
                    r27 = r27;
                } else {
                    r27 = r12;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    c cVar115 = (c) this.I0.get();
                    p.i iVarK18 = dVar.k(this.L);
                    p.d dVar214 = this.f3985w0;
                    dVar214.f(iVarK18, dVar214.k(cVar115), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    c cVar116 = (c) this.H0.get();
                    cVar4 = cVar;
                    p.i iVarK19 = dVar.k(cVar4);
                    p.d dVar215 = this.f3985w0;
                    cVar = cVar4;
                    dVar215.f(dVar215.k(cVar116), iVarK19, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                dVar.p();
                r24 = r27;
                zArr[2] = false;
                zX = X(64);
                R(dVar, zX);
                size = this.f4025q0.size();
                i12 = 0;
                z8 = false;
                while (i12 < size) {
                    dVar2 = (d) this.f4025q0.get(i12);
                    dVar2.R(dVar, zX);
                    boolean z213 = zX;
                    int i511 = size;
                    if (dVar2.f3952h == -1) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    i12++;
                    zX = z213;
                    size = i511;
                    z8 = z8;
                }
                z9 = z8;
                r25 = r24;
            } else {
                r27 = r12;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    c cVar117 = (c) this.I0.get();
                    p.i iVarK110 = dVar.k(this.L);
                    p.d dVar216 = this.f3985w0;
                    dVar216.f(iVarK110, dVar216.k(cVar117), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    c cVar118 = (c) this.H0.get();
                    cVar4 = cVar;
                    p.i iVarK111 = dVar.k(cVar4);
                    p.d dVar217 = this.f3985w0;
                    cVar = cVar4;
                    dVar217.f(dVar217.k(cVar118), iVarK111, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                dVar.p();
                r24 = r27;
                zArr[2] = false;
                zX = X(64);
                R(dVar, zX);
                size = this.f4025q0.size();
                i12 = 0;
                z8 = false;
                while (i12 < size) {
                    dVar2 = (d) this.f4025q0.get(i12);
                    dVar2.R(dVar, zX);
                    boolean z214 = zX;
                    int i512 = size;
                    if (dVar2.f3952h == -1) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    i12++;
                    zX = z214;
                    size = i512;
                    z8 = z8;
                }
                z9 = z8;
                r25 = r24;
            }
            if (z6) {
                z10 = z6;
            } else {
                z10 = z6;
            }
            iMax = Math.max(this.f3941b0, r());
            if (iMax > r()) {
                P(iMax);
                r6 = 1;
                r23[0] = 1;
                z11 = true;
                r17 = 1;
            } else {
                r6 = 1;
                r17 = r25;
                z11 = z9;
            }
            iMax2 = Math.max(this.f3943c0, l());
            if (iMax2 > l()) {
                M(iMax2);
                r23[r6] = r6;
                r9 = r6;
                z12 = r9 == true ? 1 : 0;
            } else {
                r4 = r17;
            }
            if (r4 == 0) {
                z12 = z11;
                if (r23[0] == 2) {
                    r8 = r4;
                    z16 = z12;
                    if (r() > i4) {
                        this.E0 = r6;
                        r23[0] = r6;
                        P(i4);
                        ?? r113 = r6;
                        z16 = r113 == true ? 1 : 0;
                        r8 = r113;
                    }
                }
                r4 = r9;
                r8 = r4;
                r8 = r4;
                z16 = z12;
                z16 = z12;
                r5 = r8;
                r5 = r8;
                z13 = z16;
                z13 = z16;
                if (r23[r6] != 2) {
                }
                if (i11 > i13) {
                    r5 = r8;
                    z13 = z16;
                    z15 = false;
                } else {
                    r5 = r8;
                    z13 = z16;
                    z15 = z14;
                }
                r12 = r7;
                i10 = i11;
                z6 = z10;
                z7 = z15;
            } else {
                z12 = z11;
                r4 = r9;
                r5 = r4;
                z13 = z12;
            }
            r5 = r8;
            z13 = z16;
            i13 = 8;
            r7 = r5;
            z14 = z13;
            if (i11 > i13) {
                r5 = r8;
                z13 = z16;
                z15 = false;
            } else {
                r5 = r8;
                z13 = z16;
                z15 = z14;
            }
            r12 = r7;
            i10 = i11;
            z6 = z10;
            z7 = z15;
        }
        r21 = r12;
        this.f4025q0 = arrayList13;
        if (r21 != 0) {
            r23[0] = i7;
            r23[1] = i6;
        }
        G(dVar.f3687l);
    }

    public final void T(int i4, d dVar) {
        if (i4 == 0) {
            int i5 = this.f3988z0 + 1;
            b[] bVarArr = this.C0;
            if (i5 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i6 = this.f3988z0;
            bVarArr2[i6] = new b(dVar, 0, this.f3984v0);
            this.f3988z0 = i6 + 1;
            return;
        }
        if (i4 == 1) {
            int i7 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i7 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i8 = this.A0;
            bVarArr4[i8] = new b(dVar, 1, this.f3984v0);
            this.A0 = i8 + 1;
        }
    }

    public final void U(p.d dVar) {
        boolean zX = X(64);
        c(dVar, zX);
        int size = this.f4025q0.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar2 = (d) this.f4025q0.get(i4);
            boolean[] zArr = dVar2.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                d dVar3 = (d) this.f4025q0.get(i5);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i6 = 0; i6 < aVar.f4023r0; i6++) {
                        d dVar4 = aVar.f4022q0[i6];
                        if (aVar.f3909t0 || dVar4.d()) {
                            int i7 = aVar.f3908s0;
                            if (i7 == 0 || i7 == 1) {
                                dVar4.S[0] = true;
                            } else if (i7 == 2 || i7 == 3) {
                                dVar4.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar5 = (d) this.f4025q0.get(i8);
            dVar5.getClass();
            boolean z5 = dVar5 instanceof g;
            if (z5 || (dVar5 instanceof h)) {
                if (z5) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.c(dVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i9 = 0; i9 < gVar.f4023r0; i9++) {
                    if (hashSet.contains(gVar.f4022q0[i9])) {
                        gVar.c(dVar, zX);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).c(dVar, zX);
                }
                hashSet.clear();
            }
        }
        if (p.d.f3674p) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar6 = (d) this.f4025q0.get(i10);
                dVar6.getClass();
                if (!(dVar6 instanceof g) && !(dVar6 instanceof h)) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, this.f3969p0[0] == 2 ? 0 : 1, false);
            for (d dVar7 : hashSet2) {
                k.a(this, dVar, dVar7);
                dVar7.c(dVar, zX);
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar8 = (d) this.f4025q0.get(i11);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.f3969p0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        dVar8.N(1);
                    }
                    if (i13 == 2) {
                        dVar8.O(1);
                    }
                    dVar8.c(dVar, zX);
                    if (i12 == 2) {
                        dVar8.N(i12);
                    }
                    if (i13 == 2) {
                        dVar8.O(i13);
                    }
                } else {
                    k.a(this, dVar, dVar8);
                    if (!(dVar8 instanceof g) && !(dVar8 instanceof h)) {
                        dVar8.c(dVar, zX);
                    }
                }
            }
        }
        if (this.f3988z0 > 0) {
            q.b(this, dVar, null, 0);
        }
        if (this.A0 > 0) {
            q.b(this, dVar, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    public final boolean V(int i4, boolean z4) {
        boolean z5;
        boolean z6 = true;
        boolean z7 = z4 & true;
        s.e eVar = this.f3981s0;
        e eVar2 = eVar.f4146a;
        int iK = eVar2.k(0);
        int iK2 = eVar2.k(1);
        int iS = eVar2.s();
        int iT = eVar2.t();
        ArrayList<p> arrayList = eVar.f4150e;
        if (z7 && (iK == 2 || iK2 == 2)) {
            for (p pVar : arrayList) {
                if (pVar.f4192f == i4 && !pVar.k()) {
                    z7 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z7 && iK == 2) {
                    eVar2.N(1);
                    eVar2.P(eVar.d(eVar2, 0));
                    eVar2.f3944d.f4191e.d(eVar2.r());
                }
            } else if (z7 && iK2 == 2) {
                eVar2.O(1);
                eVar2.M(eVar.d(eVar2, 1));
                eVar2.f3946e.f4191e.d(eVar2.l());
            }
        }
        int[] iArr = eVar2.f3969p0;
        if (i4 == 0) {
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iR = eVar2.r() + iS;
                eVar2.f3944d.f4195i.d(iR);
                eVar2.f3944d.f4191e.d(iR - iS);
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int iL = eVar2.l() + iT;
                eVar2.f3946e.f4195i.d(iL);
                eVar2.f3946e.f4191e.d(iL - iT);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        eVar.g();
        for (p pVar2 : arrayList) {
            if (pVar2.f4192f == i4 && (pVar2.f4188b != eVar2 || pVar2.f4193g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : arrayList) {
            if (pVar3.f4192f == i4 && (z5 || pVar3.f4188b != eVar2)) {
                if (!pVar3.f4194h.f4163j || !pVar3.f4195i.f4163j || (!(pVar3 instanceof s.c) && !pVar3.f4191e.f4163j)) {
                    z6 = false;
                    break;
                }
            }
        }
        eVar2.N(iK);
        eVar2.O(iK2);
        return z6;
    }

    public final boolean X(int i4) {
        return (this.D0 & i4) == i4;
    }

    @Override // r.d
    public final void o(StringBuilder sb) {
        sb.append(this.f3956j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.f4025q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
