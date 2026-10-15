package r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s.m;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3939a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.c f3940b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f3941b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.c f3942c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f3943c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f3945d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f3947e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Object f3949f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f3951g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f3953h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f3955i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3956j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f3957j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3958k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final float[] f3959k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3960l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final d[] f3961l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3962m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final d[] f3963m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3964n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f3965n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3966o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f3967o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3968p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f3969p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f3973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f3976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f3979z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3938a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s.k f3944d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f3946e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f3948f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3950g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3952h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3954i = -1;

    public d() {
        new HashMap();
        this.f3958k = false;
        this.f3960l = false;
        this.f3962m = false;
        this.f3964n = false;
        this.f3966o = -1;
        this.f3968p = -1;
        this.f3970q = 0;
        this.f3971r = 0;
        this.f3972s = 0;
        this.f3973t = new int[2];
        this.f3974u = 0;
        this.f3975v = 0;
        this.f3976w = 1.0f;
        this.f3977x = 0;
        this.f3978y = 0;
        this.f3979z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f3969p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3939a0 = 0;
        this.f3945d0 = 0.5f;
        this.f3947e0 = 0.5f;
        this.f3951g0 = 0;
        this.f3953h0 = null;
        this.f3955i0 = 0;
        this.f3957j0 = 0;
        this.f3959k0 = new float[]{-1.0f, -1.0f};
        this.f3961l0 = new d[]{null, null};
        this.f3963m0 = new d[]{null, null};
        this.f3965n0 = -1;
        this.f3967o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void H(int i4, int i5, String str, StringBuilder sb) {
        if (i4 == i5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i4);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f5, float f6) {
        if (f5 == f6) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f5);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        H(i4, 0, "      size", sb);
        H(i5, 0, "      min", sb);
        H(i6, Integer.MAX_VALUE, "      max", sb);
        H(i7, 0, "      matchMin", sb);
        H(i8, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f5, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, c cVar) {
        if (cVar.f3934f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f3934f);
        sb.append("'");
        if (cVar.f3936h != Integer.MIN_VALUE || cVar.f3935g != 0) {
            sb.append(",");
            sb.append(cVar.f3935g);
            if (cVar.f3936h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f3936h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.f3950g && this.f3951g0 != 8;
    }

    public boolean B() {
        return this.f3958k || (this.I.f3931c && this.K.f3931c);
    }

    public boolean C() {
        return this.f3960l || (this.J.f3931c && this.L.f3931c);
    }

    public void D() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3939a0 = 0;
        this.f3941b0 = 0;
        this.f3943c0 = 0;
        this.f3945d0 = 0.5f;
        this.f3947e0 = 0.5f;
        int[] iArr = this.f3969p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3949f0 = null;
        this.f3951g0 = 0;
        this.f3955i0 = 0;
        this.f3957j0 = 0;
        float[] fArr = this.f3959k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3966o = -1;
        this.f3968p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3971r = 0;
        this.f3972s = 0;
        this.f3976w = 1.0f;
        this.f3979z = 1.0f;
        this.f3975v = Integer.MAX_VALUE;
        this.f3978y = Integer.MAX_VALUE;
        this.f3974u = 0;
        this.f3977x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f3948f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3950g = true;
        int[] iArr3 = this.f3973t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f3952h = -1;
        this.f3954i = -1;
    }

    public final void E() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).j();
        }
    }

    public final void F() {
        this.f3958k = false;
        this.f3960l = false;
        this.f3962m = false;
        this.f3964n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            cVar.f3931c = false;
            cVar.f3930b = 0;
        }
    }

    public void G(g.h hVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i4) {
        this.f3939a0 = i4;
        this.E = i4 > 0;
    }

    public final void K(int i4, int i5) {
        if (this.f3958k) {
            return;
        }
        this.I.l(i4);
        this.K.l(i5);
        this.Y = i4;
        this.U = i5 - i4;
        this.f3958k = true;
    }

    public final void L(int i4, int i5) {
        if (this.f3960l) {
            return;
        }
        this.J.l(i4);
        this.L.l(i5);
        this.Z = i4;
        this.V = i5 - i4;
        if (this.E) {
            this.M.l(i4 + this.f3939a0);
        }
        this.f3960l = true;
    }

    public final void M(int i4) {
        this.V = i4;
        int i5 = this.f3943c0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public final void N(int i4) {
        this.f3969p0[0] = i4;
    }

    public final void O(int i4) {
        this.f3969p0[1] = i4;
    }

    public final void P(int i4) {
        this.U = i4;
        int i5 = this.f3941b0;
        if (i4 < i5) {
            this.U = i5;
        }
    }

    public void Q(boolean z4, boolean z5) {
        int i4;
        int i5;
        s.k kVar = this.f3944d;
        boolean z6 = z4 & kVar.f4193g;
        m mVar = this.f3946e;
        boolean z7 = z5 & mVar.f4193g;
        int i6 = kVar.f4194h.f4160g;
        int i7 = mVar.f4194h.f4160g;
        int i8 = kVar.f4195i.f4160g;
        int i9 = mVar.f4195i.f4160g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i9 = 0;
            i6 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (z6) {
            this.Y = i6;
        }
        if (z7) {
            this.Z = i7;
        }
        if (this.f3951g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3969p0;
        if (z6) {
            if (iArr[0] == 1 && i11 < (i5 = this.U)) {
                i11 = i5;
            }
            this.U = i11;
            int i13 = this.f3941b0;
            if (i11 < i13) {
                this.U = i13;
            }
        }
        if (z7) {
            if (iArr[1] == 1 && i12 < (i4 = this.V)) {
                i12 = i4;
            }
            this.V = i12;
            int i14 = this.f3943c0;
            if (i12 < i14) {
                this.V = i14;
            }
        }
    }

    public void R(p.d dVar, boolean z4) {
        int i4;
        int i5;
        m mVar;
        s.k kVar;
        c cVar = this.I;
        dVar.getClass();
        int iN = p.d.n(cVar);
        int iN2 = p.d.n(this.J);
        int iN3 = p.d.n(this.K);
        int iN4 = p.d.n(this.L);
        if (z4 && (kVar = this.f3944d) != null) {
            s.f fVar = kVar.f4194h;
            if (fVar.f4163j) {
                s.f fVar2 = kVar.f4195i;
                if (fVar2.f4163j) {
                    iN = fVar.f4160g;
                    iN3 = fVar2.f4160g;
                }
            }
        }
        if (z4 && (mVar = this.f3946e) != null) {
            s.f fVar3 = mVar.f4194h;
            if (fVar3.f4163j) {
                s.f fVar4 = mVar.f4195i;
                if (fVar4.f4163j) {
                    iN2 = fVar3.f4160g;
                    iN4 = fVar4.f4160g;
                }
            }
        }
        int i6 = iN4 - iN2;
        if (iN3 - iN < 0 || i6 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i7 = iN3 - iN;
        int i8 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.f3951g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3969p0;
        int i9 = iArr[0];
        if (i9 == 1 && i7 < (i5 = this.U)) {
            i7 = i5;
        }
        if (iArr[1] == 1 && i8 < (i4 = this.V)) {
            i8 = i4;
        }
        this.U = i7;
        this.V = i8;
        int i10 = this.f3943c0;
        if (i8 < i10) {
            this.V = i10;
        }
        int i11 = this.f3941b0;
        if (i7 < i11) {
            this.U = i11;
        }
        int i12 = this.f3975v;
        if (i12 > 0 && i9 == 3) {
            this.U = Math.min(this.U, i12);
        }
        int i13 = this.f3978y;
        if (i13 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i13);
        }
        int i14 = this.U;
        if (i7 != i14) {
            this.f3952h = i14;
        }
        int i15 = this.V;
        if (i8 != i15) {
            this.f3954i = i15;
        }
    }

    public final void b(e eVar, p.d dVar, HashSet hashSet, int i4, boolean z4) {
        if (z4) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(eVar, dVar, this);
            hashSet.remove(this);
            c(dVar, eVar.X(64));
        }
        if (i4 == 0) {
            HashSet hashSet2 = this.I.f3929a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f3932d.b(eVar, dVar, hashSet, i4, true);
                }
            }
            HashSet hashSet3 = this.K.f3929a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f3932d.b(eVar, dVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f3929a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f3932d.b(eVar, dVar, hashSet, i4, true);
            }
        }
        HashSet hashSet5 = this.L.f3929a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f3932d.b(eVar, dVar, hashSet, i4, true);
            }
        }
        HashSet hashSet6 = this.M.f3929a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f3932d.b(eVar, dVar, hashSet, i4, true);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void c(p.d r63, boolean r64) {
        /*
            Method dump skipped, instruction units count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.c(p.d, boolean):void");
    }

    public boolean d() {
        return this.f3951g0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0207  */
    /* JADX WARN: Code duplicated, block: B:130:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:224:0x03af  */
    /* JADX WARN: Code duplicated, block: B:230:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:244:0x0422  */
    /* JADX WARN: Code duplicated, block: B:253:0x0444  */
    /* JADX WARN: Code duplicated, block: B:263:0x045c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0462  */
    /* JADX WARN: Code duplicated, block: B:267:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x046a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0473  */
    /* JADX WARN: Code duplicated, block: B:277:0x0477  */
    /* JADX WARN: Code duplicated, block: B:280:0x047d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0481  */
    /* JADX WARN: Code duplicated, block: B:284:0x0485  */
    /* JADX WARN: Code duplicated, block: B:285:0x0487  */
    /* JADX WARN: Code duplicated, block: B:288:0x048f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x049d  */
    /* JADX WARN: Code duplicated, block: B:295:0x049f  */
    /* JADX WARN: Code duplicated, block: B:298:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:301:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:303:0x04be  */
    /* JADX WARN: Code duplicated, block: B:305:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:317:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void e(p.d dVar, boolean z4, boolean z5, boolean z6, boolean z7, p.i iVar, p.i iVar2, int i4, boolean z8, c cVar, c cVar2, int i5, int i6, int i7, int i8, float f5, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10, int i11, int i12, float f6, boolean z14) {
        int iMin;
        int i13;
        int i14;
        p.i iVarK;
        p.i iVarK2;
        char c5;
        char c6;
        c cVar3;
        p.i iVar3;
        boolean z15;
        boolean z16;
        boolean z17;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        p.i iVar4;
        boolean z21;
        boolean z22;
        p.i iVar5;
        d dVar2;
        int iMax;
        int i17;
        int iE;
        int i18;
        int iMin2;
        int i19;
        HashSet hashSet;
        int i20;
        boolean z23;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z24;
        boolean z25;
        int i25;
        int i26 = i11;
        int i27 = i12;
        p.i iVarK3 = dVar.k(cVar);
        p.i iVarK4 = dVar.k(cVar2);
        p.i iVarK5 = dVar.k(cVar.f3934f);
        p.i iVarK6 = dVar.k(cVar2.f3934f);
        boolean zH = cVar.h();
        boolean zH2 = cVar2.h();
        boolean zH3 = this.P.h();
        int i28 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i28++;
        }
        int i29 = i28;
        int i30 = z9 ? 3 : i9;
        if (i4 == 0) {
            throw null;
        }
        int i31 = i4 - 1;
        boolean z26 = (i31 == 0 || i31 == 1 || i31 != 2 || i30 == 4) ? false : true;
        int i32 = this.f3952h;
        boolean z27 = z26;
        if (i32 != -1 && z4) {
            this.f3952h = -1;
            i6 = i32;
            z27 = false;
        }
        int i33 = this.f3954i;
        if (i33 == -1 || z4) {
            i33 = i6;
        } else {
            this.f3954i = -1;
            z27 = false;
        }
        int i34 = i33;
        if (this.f3951g0 == 8) {
            iMin = 0;
            z27 = false;
        } else {
            iMin = i34;
        }
        if (z14) {
            if (!zH && !zH2 && !zH3) {
                dVar.d(iVarK3, i5);
            } else if (zH && !zH2) {
                i13 = 8;
                dVar.e(iVarK3, iVarK5, cVar.e(), 8);
            }
            i13 = 8;
        } else {
            i13 = 8;
        }
        if (z27) {
            if (i29 == 2 || z9 || !(i30 == 1 || i30 == 0)) {
                if (i26 == -2) {
                    i26 = iMin;
                }
                if (i27 == -2) {
                    i27 = iMin;
                }
                if (iMin > 0 && i30 != 1) {
                    iMin = 0;
                }
                if (i26 > 0) {
                    dVar.f(iVarK4, iVarK3, i26, 8);
                    iMin = Math.max(iMin, i26);
                }
                if (i27 > 0) {
                    if (!z5 || i30 != 1) {
                        dVar.g(iVarK4, iVarK3, i27, 8);
                    }
                    iMin = Math.min(iMin, i27);
                }
                if (i30 == 1) {
                    if (z5) {
                        dVar.e(iVarK4, iVarK3, iMin, 8);
                    } else if (z11) {
                        dVar.e(iVarK4, iVarK3, iMin, 5);
                        dVar.g(iVarK4, iVarK3, iMin, 8);
                    } else {
                        dVar.e(iVarK4, iVarK3, iMin, 5);
                        dVar.g(iVarK4, iVarK3, iMin, 8);
                    }
                } else if (i30 == 2) {
                    int i35 = cVar.f3933e;
                    if (i35 == 3 || i35 == 5) {
                        iVarK = dVar.k(this.T.j(3));
                        iVarK2 = dVar.k(this.T.j(5));
                    } else {
                        iVarK = dVar.k(this.T.j(2));
                        iVarK2 = dVar.k(this.T.j(4));
                    }
                    p.c cVarL = dVar.l();
                    cVarL.f3672d.d(iVarK4, -1.0f);
                    cVarL.f3672d.d(iVarK3, 1.0f);
                    cVarL.f3672d.d(iVarK2, f6);
                    cVarL.f3672d.d(iVarK, -f6);
                    dVar.c(cVarL);
                    if (z5) {
                        z27 = false;
                    }
                    i14 = i26;
                } else {
                    i29 = i29 == true ? 1 : 0;
                    i14 = i26;
                    z7 = true;
                }
            } else {
                int iMax2 = Math.max(i26, iMin);
                if (i27 > 0) {
                    iMax2 = Math.min(i27, iMax2);
                }
                dVar.e(iVarK4, iVarK3, iMax2, 8);
                z7 = z7;
                i29 = i29 == true ? 1 : 0;
                i14 = i26;
                z27 = false;
            }
            if (z14) {
                c5 = 1;
                c6 = 2;
            } else {
                if (z11) {
                    if (!zH || zH2 || zH3) {
                        if (zH || zH2) {
                            if (zH && zH2) {
                                dVar.e(iVarK4, iVar3, -cVar2.e(), 8);
                                if (z5) {
                                    iVar3 = iVarK6;
                                    dVar.f(iVarK3, iVar, 0, 5);
                                    cVar2 = cVar2;
                                    i17 = 5;
                                    iVar5 = iVar3;
                                    iVarK4 = iVarK4;
                                    z7 = z7;
                                }
                                z22 = z5;
                                i25 = i17;
                            } else {
                                iVar3 = iVarK6;
                                if (!zH && zH2) {
                                    d dVar3 = cVar.f3934f.f3932d;
                                    cVar2 = cVar2;
                                    d dVar4 = cVar2.f3934f.f3932d;
                                    d dVar5 = this.T;
                                    int i36 = 6;
                                    if (z27) {
                                        if (i30 == 0) {
                                            if (i27 != 0 || i14 != 0) {
                                                i23 = 5;
                                                i24 = 5;
                                                z24 = true;
                                                z25 = false;
                                                z16 = true;
                                            } else if (iVarK5.f3705g && iVar3.f3705g) {
                                                dVar.e(iVarK3, iVarK5, cVar.e(), 8);
                                                dVar.e(iVarK4, iVar3, -cVar2.e(), 8);
                                                return;
                                            } else {
                                                i23 = 8;
                                                i24 = 8;
                                                z24 = false;
                                                z25 = true;
                                                z16 = false;
                                            }
                                            if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                i15 = i23;
                                                i30 = i30;
                                                z17 = z24;
                                                z18 = z25;
                                                z15 = true;
                                                i16 = 4;
                                                iVar2 = iVar2;
                                                i36 = 6;
                                            } else {
                                                i15 = i23;
                                                z17 = z24;
                                                z18 = z25;
                                                z15 = true;
                                                i36 = 6;
                                                i16 = i24;
                                                i30 = i30;
                                                iVar2 = iVar2;
                                            }
                                        } else {
                                            if (i30 == 2) {
                                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                    i15 = 5;
                                                } else {
                                                    i30 = i30;
                                                    i36 = 6;
                                                    i15 = 5;
                                                    z15 = true;
                                                    i16 = 5;
                                                }
                                                z16 = true;
                                                z17 = true;
                                                z18 = false;
                                                iVar2 = iVar2;
                                            } else if (i30 == 1) {
                                                i15 = 8;
                                            } else if (i30 == 3) {
                                                i30 = i30;
                                                if (this.A == -1) {
                                                    if (z12) {
                                                        iVar2 = iVar2;
                                                        i15 = 8;
                                                        z15 = true;
                                                        i36 = z5 ? 5 : 4;
                                                    } else {
                                                        iVar2 = iVar2;
                                                        i15 = 8;
                                                        z15 = true;
                                                        i36 = 8;
                                                    }
                                                    i16 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                } else if (z9) {
                                                    if (i10 != 2) {
                                                        z15 = true;
                                                        if (i10 != 1) {
                                                            i15 = 8;
                                                            i22 = 5;
                                                        }
                                                        i16 = i22;
                                                        z16 = z15;
                                                        z17 = z16;
                                                        z18 = z17;
                                                        i36 = 6;
                                                        iVar2 = iVar2;
                                                    } else {
                                                        z15 = true;
                                                    }
                                                    i15 = 5;
                                                    i22 = 4;
                                                    i16 = i22;
                                                    z16 = z15;
                                                    z17 = z16;
                                                    z18 = z17;
                                                    i36 = 6;
                                                    iVar2 = iVar2;
                                                } else {
                                                    z15 = true;
                                                    if (i27 > 0) {
                                                        iVar2 = iVar2;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        i36 = 6;
                                                        i15 = 5;
                                                        i16 = 5;
                                                    } else {
                                                        if (i27 != 0 || i14 != 0) {
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = true;
                                                            i15 = 5;
                                                        } else if (z12) {
                                                            i15 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = true;
                                                        } else {
                                                            iVar2 = iVar2;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = true;
                                                            i36 = 6;
                                                            i15 = 5;
                                                            i16 = 8;
                                                        }
                                                        i16 = 4;
                                                    }
                                                }
                                            } else {
                                                z15 = true;
                                                i15 = 5;
                                                i16 = 4;
                                                z16 = false;
                                                z17 = false;
                                            }
                                            z15 = true;
                                            i16 = 4;
                                            z16 = true;
                                            z17 = true;
                                            z18 = false;
                                            iVar2 = iVar2;
                                        }
                                        if (z16 || iVarK5 != iVar3 || dVar3 == dVar5) {
                                            z19 = z16;
                                            z20 = z15;
                                        } else {
                                            z20 = false;
                                            z19 = false;
                                        }
                                        if (z17) {
                                            if (z27 && !z10 && !z12 && iVarK5 == iVar && iVar3 == iVar2) {
                                                z22 = false;
                                                i21 = 8;
                                                i20 = 8;
                                                z23 = false;
                                            } else {
                                                i20 = i36;
                                                z23 = z20;
                                                z22 = z5;
                                                i21 = i15;
                                            }
                                            z21 = true;
                                            iVar4 = iVarK4;
                                            dVar.b(iVarK3, iVarK5, cVar.e(), f5, iVar3, iVarK4, cVar2.e(), i20);
                                            i15 = i21;
                                            z20 = z23;
                                        } else {
                                            iVar4 = iVarK4;
                                            z21 = z15;
                                            z22 = z5;
                                        }
                                        if (this.f3951g0 != 8 && ((hashSet = cVar2.f3929a) == null || hashSet.size() <= 0)) {
                                            return;
                                        }
                                        iVar5 = iVar3;
                                        if (z19) {
                                            if (z22 && iVarK5 != iVar5 && !z27 && ((dVar3 instanceof a) || (dVar4 instanceof a))) {
                                                i15 = 6;
                                            }
                                            dVar.f(iVarK3, iVarK5, cVar.e(), i15);
                                            iVarK4 = iVar4;
                                            dVar.g(iVarK4, iVar5, -cVar2.e(), i15);
                                        } else {
                                            iVarK4 = iVar4;
                                        }
                                        if (z22 || !z13 || (dVar3 instanceof a) || (dVar4 instanceof a)) {
                                            dVar2 = dVar5;
                                        } else {
                                            dVar2 = dVar5;
                                            if (dVar4 != dVar2) {
                                                i15 = 6;
                                                iMax = 6;
                                                z20 = z21;
                                            }
                                            if (z20) {
                                                if (z18 && (!z12 || z6)) {
                                                    if (dVar3 != dVar2 && dVar4 != dVar2) {
                                                        i36 = iMax;
                                                    }
                                                    if ((dVar3 instanceof h) || (dVar4 instanceof h)) {
                                                        i36 = 5;
                                                    }
                                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                        i36 = 5;
                                                    }
                                                    if (z12) {
                                                        i19 = 5;
                                                    } else {
                                                        i19 = i36;
                                                    }
                                                    iMax = Math.max(i19, iMax);
                                                }
                                                if (z22) {
                                                    iMin2 = Math.min(i15, iMax);
                                                    if (z9 || z12 || !(dVar3 == dVar2 || dVar4 == dVar2)) {
                                                        i18 = iMin2;
                                                    } else {
                                                        i18 = 4;
                                                    }
                                                } else {
                                                    i18 = iMax;
                                                }
                                                dVar.e(iVarK3, iVarK5, cVar.e(), i18);
                                                dVar.e(iVarK4, iVar5, -cVar2.e(), i18);
                                            }
                                            if (z22) {
                                                if (iVar == iVarK5) {
                                                    iE = cVar.e();
                                                } else {
                                                    iE = 0;
                                                }
                                                if (iVarK5 != iVar) {
                                                    dVar.f(iVarK3, iVar, iE, 5);
                                                }
                                            }
                                            if (z22 || !z27 || i7 != 0 || i14 != 0) {
                                                i17 = 5;
                                            } else if (z27 && i30 == 3) {
                                                dVar.f(iVarK4, iVarK3, 0, 8);
                                                i17 = 5;
                                            } else {
                                                i17 = 5;
                                                dVar.f(iVarK4, iVarK3, 0, 5);
                                            }
                                        }
                                        iMax = i16;
                                        if (z20) {
                                            if (z18) {
                                                if (dVar3 != dVar2) {
                                                    i36 = iMax;
                                                }
                                                if (dVar3 instanceof h) {
                                                    i36 = 5;
                                                } else {
                                                    i36 = 5;
                                                }
                                                if (dVar3 instanceof a) {
                                                    i36 = 5;
                                                } else {
                                                    i36 = 5;
                                                }
                                                if (z12) {
                                                    i19 = 5;
                                                } else {
                                                    i19 = i36;
                                                }
                                                iMax = Math.max(i19, iMax);
                                            }
                                            if (z22) {
                                                iMin2 = Math.min(i15, iMax);
                                                if (z9) {
                                                    i18 = iMin2;
                                                } else {
                                                    i18 = iMin2;
                                                }
                                            } else {
                                                i18 = iMax;
                                            }
                                            dVar.e(iVarK3, iVarK5, cVar.e(), i18);
                                            dVar.e(iVarK4, iVar5, -cVar2.e(), i18);
                                        }
                                        if (z22) {
                                            if (iVar == iVarK5) {
                                                iE = cVar.e();
                                            } else {
                                                iE = 0;
                                            }
                                            if (iVarK5 != iVar) {
                                                dVar.f(iVarK3, iVar, iE, 5);
                                            }
                                        }
                                        if (z22) {
                                            i17 = 5;
                                        } else {
                                            i17 = 5;
                                        }
                                    } else {
                                        z15 = true;
                                        if (iVarK5.f3705g && iVar3.f3705g) {
                                            dVar.b(iVarK3, iVarK5, cVar.e(), f5, iVar3, iVarK4, cVar2.e(), 8);
                                            if (z5 && z7) {
                                                int iE2 = cVar2.f3934f != null ? cVar2.e() : 0;
                                                if (iVar3 != iVar2) {
                                                    dVar.f(iVar2, iVarK4, iE2, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        z16 = true;
                                        z17 = true;
                                        i15 = 5;
                                        i16 = 4;
                                    }
                                    z18 = false;
                                    if (z16) {
                                        z19 = z16;
                                        z20 = z15;
                                    } else {
                                        z19 = z16;
                                        z20 = z15;
                                    }
                                    if (z17) {
                                        if (z27) {
                                            i20 = i36;
                                            z23 = z20;
                                            z22 = z5;
                                            i21 = i15;
                                        } else {
                                            i20 = i36;
                                            z23 = z20;
                                            z22 = z5;
                                            i21 = i15;
                                        }
                                        z21 = true;
                                        iVar4 = iVarK4;
                                        dVar.b(iVarK3, iVarK5, cVar.e(), f5, iVar3, iVarK4, cVar2.e(), i20);
                                        i15 = i21;
                                        z20 = z23;
                                    } else {
                                        iVar4 = iVarK4;
                                        z21 = z15;
                                        z22 = z5;
                                    }
                                    if (this.f3951g0 != 8) {
                                    }
                                    iVar5 = iVar3;
                                    if (z19) {
                                        if (z22) {
                                            i15 = 6;
                                        }
                                        dVar.f(iVarK3, iVarK5, cVar.e(), i15);
                                        iVarK4 = iVar4;
                                        dVar.g(iVarK4, iVar5, -cVar2.e(), i15);
                                    } else {
                                        iVarK4 = iVar4;
                                    }
                                    if (z22) {
                                        dVar2 = dVar5;
                                        iMax = i16;
                                    } else {
                                        dVar2 = dVar5;
                                        iMax = i16;
                                    }
                                    if (z20) {
                                        if (z18) {
                                            if (dVar3 != dVar2) {
                                                i36 = iMax;
                                            }
                                            if (dVar3 instanceof h) {
                                                i36 = 5;
                                            } else {
                                                i36 = 5;
                                            }
                                            if (dVar3 instanceof a) {
                                                i36 = 5;
                                            } else {
                                                i36 = 5;
                                            }
                                            if (z12) {
                                                i19 = 5;
                                            } else {
                                                i19 = i36;
                                            }
                                            iMax = Math.max(i19, iMax);
                                        }
                                        if (z22) {
                                            iMin2 = Math.min(i15, iMax);
                                            if (z9) {
                                                i18 = iMin2;
                                            } else {
                                                i18 = iMin2;
                                            }
                                        } else {
                                            i18 = iMax;
                                        }
                                        dVar.e(iVarK3, iVarK5, cVar.e(), i18);
                                        dVar.e(iVarK4, iVar5, -cVar2.e(), i18);
                                    }
                                    if (z22) {
                                        if (iVar == iVarK5) {
                                            iE = cVar.e();
                                        } else {
                                            iE = 0;
                                        }
                                        if (iVarK5 != iVar) {
                                            dVar.f(iVarK3, iVar, iE, 5);
                                        }
                                    }
                                    if (z22) {
                                        i17 = 5;
                                    } else {
                                        i17 = 5;
                                    }
                                }
                                i25 = i17;
                            }
                            iVar3 = iVarK6;
                            iVar5 = iVar3;
                        } else {
                            z22 = z5;
                            cVar2 = cVar2;
                            iVarK4 = iVarK4;
                            z7 = z7;
                            i25 = (z5 && (cVar.f3934f.f3932d instanceof a)) ? 8 : 5;
                            iVar5 = iVarK6;
                        }
                        if (z22 || !z7) {
                            return;
                        }
                        int iE3 = cVar2.f3934f != null ? cVar2.e() : 0;
                        if (iVar5 != iVar2) {
                            dVar.f(iVar2, iVarK4, iE3, i25);
                            return;
                        }
                        return;
                    }
                    iVar5 = iVarK6;
                    i17 = 5;
                    z22 = z5;
                    i25 = i17;
                    if (z22) {
                        return;
                    } else {
                        return;
                    }
                }
                c6 = 2;
                c5 = 1;
            }
            if (i29 >= c6 && z5 && z7) {
                dVar.f(iVarK3, iVar, 0, 8);
                c cVar4 = this.M;
                char c7 = (z4 || cVar4.f3934f == null) ? c5 : (char) 0;
                if (!z4 && (cVar3 = cVar4.f3934f) != null) {
                    d dVar6 = cVar3.f3932d;
                    if (dVar6.W == 0.0f) {
                        return;
                    }
                    int[] iArr = dVar6.f3969p0;
                    if (iArr[0] != 3 || iArr[c5] != 3) {
                        return;
                    }
                } else if (c7 == 0) {
                    return;
                }
                dVar.f(iVar2, iVarK4, 0, 8);
                return;
            }
            return;
        }
        if (z8) {
            dVar.e(iVarK4, iVarK3, 0, 3);
            if (i7 > 0) {
                dVar.f(iVarK4, iVarK3, i7, i13);
            }
            if (i8 < Integer.MAX_VALUE) {
                dVar.g(iVarK4, iVarK3, i8, i13);
            }
        } else {
            dVar.e(iVarK4, iVarK3, iMin, i13);
        }
        i14 = i26;
        if (z14) {
            c5 = 1;
            c6 = 2;
        } else {
            if (z11) {
                if (zH) {
                    if (zH) {
                    }
                    if (zH) {
                        iVar3 = iVarK6;
                        if (!zH) {
                        }
                        iVar3 = iVarK6;
                        iVar5 = iVar3;
                        i17 = 5;
                        z22 = z5;
                    } else {
                        iVar3 = iVarK6;
                        if (!zH) {
                        }
                        iVar3 = iVarK6;
                        iVar5 = iVar3;
                        i17 = 5;
                        z22 = z5;
                    }
                    i25 = i17;
                } else {
                    if (zH) {
                    }
                    if (zH) {
                        iVar3 = iVarK6;
                        if (!zH) {
                        }
                        iVar3 = iVarK6;
                        iVar5 = iVar3;
                        i17 = 5;
                        z22 = z5;
                    } else {
                        iVar3 = iVarK6;
                        if (!zH) {
                        }
                        iVar3 = iVarK6;
                        iVar5 = iVar3;
                        i17 = 5;
                        z22 = z5;
                    }
                    i25 = i17;
                }
                if (z22) {
                    return;
                } else {
                    return;
                }
            }
            c6 = 2;
            c5 = 1;
        }
        if (i29 >= c6) {
        }
    }

    public final void f(int i4, d dVar, int i5, int i6) {
        boolean z4;
        if (i4 == 7) {
            if (i5 != 7) {
                if (i5 == 2 || i5 == 4) {
                    f(2, dVar, i5, 0);
                    f(4, dVar, i5, 0);
                    j(7).a(dVar.j(i5), 0);
                    return;
                } else {
                    if (i5 == 3 || i5 == 5) {
                        f(3, dVar, i5, 0);
                        f(5, dVar, i5, 0);
                        j(7).a(dVar.j(i5), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarJ = j(2);
            c cVarJ2 = j(4);
            c cVarJ3 = j(3);
            c cVarJ4 = j(5);
            boolean z5 = true;
            if ((cVarJ == null || !cVarJ.h()) && (cVarJ2 == null || !cVarJ2.h())) {
                f(2, dVar, 2, 0);
                f(4, dVar, 4, 0);
                z4 = true;
            } else {
                z4 = false;
            }
            if ((cVarJ3 == null || !cVarJ3.h()) && (cVarJ4 == null || !cVarJ4.h())) {
                f(3, dVar, 3, 0);
                f(5, dVar, 5, 0);
            } else {
                z5 = false;
            }
            if (z4 && z5) {
                j(7).a(dVar.j(7), 0);
                return;
            } else if (z4) {
                j(8).a(dVar.j(8), 0);
                return;
            } else {
                if (z5) {
                    j(9).a(dVar.j(9), 0);
                    return;
                }
                return;
            }
        }
        if (i4 == 8 && (i5 == 2 || i5 == 4)) {
            c cVarJ5 = j(2);
            c cVarJ6 = dVar.j(i5);
            c cVarJ7 = j(4);
            cVarJ5.a(cVarJ6, 0);
            cVarJ7.a(cVarJ6, 0);
            j(8).a(cVarJ6, 0);
            return;
        }
        if (i4 == 9 && (i5 == 3 || i5 == 5)) {
            c cVarJ8 = dVar.j(i5);
            j(3).a(cVarJ8, 0);
            j(5).a(cVarJ8, 0);
            j(9).a(cVarJ8, 0);
            return;
        }
        if (i4 == 8 && i5 == 8) {
            j(2).a(dVar.j(2), 0);
            j(4).a(dVar.j(4), 0);
            j(8).a(dVar.j(i5), 0);
            return;
        }
        if (i4 == 9 && i5 == 9) {
            j(3).a(dVar.j(3), 0);
            j(5).a(dVar.j(5), 0);
            j(9).a(dVar.j(i5), 0);
            return;
        }
        c cVarJ9 = j(i4);
        c cVarJ10 = dVar.j(i5);
        if (cVarJ9.i(cVarJ10)) {
            if (i4 == 6) {
                c cVarJ11 = j(3);
                c cVarJ12 = j(5);
                if (cVarJ11 != null) {
                    cVarJ11.j();
                }
                if (cVarJ12 != null) {
                    cVarJ12.j();
                }
            } else if (i4 == 3 || i4 == 5) {
                c cVarJ13 = j(6);
                if (cVarJ13 != null) {
                    cVarJ13.j();
                }
                c cVarJ14 = j(7);
                if (cVarJ14.f3934f != cVarJ10) {
                    cVarJ14.j();
                }
                c cVarF = j(i4).f();
                c cVarJ15 = j(9);
                if (cVarJ15.h()) {
                    cVarF.j();
                    cVarJ15.j();
                }
            } else if (i4 == 2 || i4 == 4) {
                c cVarJ16 = j(7);
                if (cVarJ16.f3934f != cVarJ10) {
                    cVarJ16.j();
                }
                c cVarF2 = j(i4).f();
                c cVarJ17 = j(8);
                if (cVarJ17.h()) {
                    cVarF2.j();
                    cVarJ17.j();
                }
            }
            cVarJ9.a(cVarJ10, i6);
        }
    }

    public final void g(c cVar, c cVar2, int i4) {
        if (cVar.f3932d == this) {
            f(cVar.f3933e, cVar2.f3932d, cVar2.f3933e, i4);
        }
    }

    public final void h(p.d dVar) {
        dVar.k(this.I);
        dVar.k(this.J);
        dVar.k(this.K);
        dVar.k(this.L);
        if (this.f3939a0 > 0) {
            dVar.k(this.M);
        }
    }

    public final void i() {
        if (this.f3944d == null) {
            s.k kVar = new s.k(this);
            kVar.f4194h.f4158e = 4;
            kVar.f4195i.f4158e = 5;
            kVar.f4192f = 0;
            this.f3944d = kVar;
        }
        if (this.f3946e == null) {
            m mVar = new m(this);
            s.f fVar = new s.f(mVar);
            mVar.f4171k = fVar;
            mVar.f4172l = null;
            mVar.f4194h.f4158e = 6;
            mVar.f4195i.f4158e = 7;
            fVar.f4158e = 8;
            mVar.f4192f = 1;
            this.f3946e = mVar;
        }
    }

    public c j(int i4) {
        if (i4 == 0) {
            throw null;
        }
        switch (i4 - 1) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(defpackage.a.o(i4));
        }
    }

    public final int k(int i4) {
        int[] iArr = this.f3969p0;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int l() {
        if (this.f3951g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d m(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.L).f3934f) != null && cVar2.f3934f == cVar) {
                return cVar2.f3932d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3934f;
        if (cVar4 == null || cVar4.f3934f != cVar3) {
            return null;
        }
        return cVar4.f3932d;
    }

    public final d n(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.J).f3934f) != null && cVar2.f3934f == cVar) {
                return cVar2.f3932d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f3934f;
        if (cVar4 == null || cVar4.f3934f != cVar3) {
            return null;
        }
        return cVar4.f3932d;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.f3956j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        q(sb, "left", this.I);
        q(sb, "top", this.J);
        q(sb, "right", this.K);
        q(sb, "bottom", this.L);
        q(sb, "baseline", this.M);
        q(sb, "centerX", this.N);
        q(sb, "centerY", this.O);
        int i4 = this.U;
        int i5 = this.f3941b0;
        int[] iArr = this.C;
        int i6 = iArr[0];
        int i7 = this.f3974u;
        int i8 = this.f3971r;
        float f5 = this.f3976w;
        float[] fArr = this.f3959k0;
        float f6 = fArr[0];
        p(sb, "    width", i4, i5, i6, i7, i8, f5);
        int i9 = this.V;
        int i10 = this.f3943c0;
        int i11 = iArr[1];
        int i12 = this.f3977x;
        int i13 = this.f3972s;
        float f7 = this.f3979z;
        float f8 = fArr[1];
        p(sb, "    height", i9, i10, i11, i12, i13, f7);
        float f9 = this.W;
        int i14 = this.X;
        if (f9 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f9);
            sb.append(",");
            sb.append(i14);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f3945d0, 0.5f);
        I(sb, "    verticalBias", this.f3947e0, 0.5f);
        H(this.f3955i0, 0, "    horizontalChainStyle", sb);
        H(this.f3957j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.f3951g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f3986x0 + this.Y;
    }

    public final int t() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f3987y0 + this.Z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f3953h0 != null ? defpackage.a.h(new StringBuilder("id: "), this.f3953h0, " ") : "");
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i4) {
        if (i4 == 0) {
            return (this.I.f3934f != null ? 1 : 0) + (this.K.f3934f != null ? 1 : 0) < 2;
        }
        return ((this.J.f3934f != null ? 1 : 0) + (this.L.f3934f != null ? 1 : 0)) + (this.M.f3934f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i4, int i5) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i4 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f3934f;
            if (cVar6 != null && cVar6.f3931c && (cVar4 = (cVar3 = this.K).f3934f) != null && cVar4.f3931c) {
                return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f3934f.d()) >= i5;
            }
        } else {
            c cVar7 = this.J;
            c cVar8 = cVar7.f3934f;
            if (cVar8 != null && cVar8.f3931c && (cVar2 = (cVar = this.L).f3934f) != null && cVar2.f3931c) {
                return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f3934f.d()) >= i5;
            }
        }
        return false;
    }

    public final void w(int i4, d dVar, int i5, int i6, int i7) {
        j(i4).b(dVar.j(i5), i6, i7, true);
    }

    public final boolean x(int i4) {
        c cVar;
        c cVar2;
        int i5 = i4 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i5];
        c cVar4 = cVar3.f3934f;
        return (cVar4 == null || cVar4.f3934f == cVar3 || (cVar2 = (cVar = cVarArr[i5 + 1]).f3934f) == null || cVar2.f3934f != cVar) ? false : true;
    }

    public final boolean y() {
        c cVar = this.I;
        c cVar2 = cVar.f3934f;
        if (cVar2 != null && cVar2.f3934f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3934f;
        return cVar4 != null && cVar4.f3934f == cVar3;
    }

    public final boolean z() {
        c cVar = this.J;
        c cVar2 = cVar.f3934f;
        if (cVar2 != null && cVar2.f3934f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f3934f;
        return cVar4 != null && cVar4.f3934f == cVar3;
    }
}
