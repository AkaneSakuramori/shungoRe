package a4;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4.g f129b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f131d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f136i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c[] f133f = new c[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f134g = 7;

    public e(f4.g gVar) {
        this.f129b = gVar;
    }

    public final void a(int i4) {
        int i5;
        if (i4 > 0) {
            int length = this.f133f.length - 1;
            int i6 = 0;
            while (true) {
                i5 = this.f134g;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                c cVar = this.f133f[length];
                c3.h.X(cVar);
                i4 -= cVar.f109c;
                int i7 = this.f136i;
                c cVar2 = this.f133f[length];
                c3.h.X(cVar2);
                this.f136i = i7 - cVar2.f109c;
                this.f135h--;
                i6++;
                length--;
            }
            c[] cVarArr = this.f133f;
            int i8 = i5 + 1;
            System.arraycopy(cVarArr, i8, cVarArr, i8 + i6, this.f135h);
            c[] cVarArr2 = this.f133f;
            int i9 = this.f134g + 1;
            Arrays.fill(cVarArr2, i9, i9 + i6, (Object) null);
            this.f134g += i6;
        }
    }

    public final void b(c cVar) {
        int i4 = this.f132e;
        int i5 = cVar.f109c;
        if (i5 > i4) {
            c[] cVarArr = this.f133f;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f134g = this.f133f.length - 1;
            this.f135h = 0;
            this.f136i = 0;
            return;
        }
        a((this.f136i + i5) - i4);
        int i6 = this.f135h + 1;
        c[] cVarArr2 = this.f133f;
        if (i6 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f134g = this.f133f.length - 1;
            this.f133f = cVarArr3;
        }
        int i7 = this.f134g;
        this.f134g = i7 - 1;
        this.f133f[i7] = cVar;
        this.f135h++;
        this.f136i += i5;
    }

    public final void c(f4.j jVar) throws EOFException {
        c3.h.b0(jVar, "data");
        boolean z4 = this.f128a;
        f4.g gVar = this.f129b;
        if (z4) {
            int[] iArr = d0.f125a;
            int iC = jVar.c();
            long j4 = 0;
            for (int i4 = 0; i4 < iC; i4++) {
                byte bF = jVar.f(i4);
                byte[] bArr = u3.b.f4761a;
                j4 += (long) d0.f126b[bF & 255];
            }
            if (((int) ((j4 + ((long) 7)) >> 3)) < jVar.c()) {
                f4.g gVar2 = new f4.g();
                int[] iArr2 = d0.f125a;
                int iC2 = jVar.c();
                long j5 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < iC2; i6++) {
                    byte bF2 = jVar.f(i6);
                    byte[] bArr2 = u3.b.f4761a;
                    int i7 = bF2 & 255;
                    int i8 = d0.f125a[i7];
                    byte b5 = d0.f126b[i7];
                    j5 = (j5 << b5) | ((long) i8);
                    i5 += b5;
                    while (i5 >= 8) {
                        i5 -= 8;
                        gVar2.K((int) (j5 >> i5));
                    }
                }
                if (i5 > 0) {
                    gVar2.K((int) ((255 >>> i5) | (j5 << (8 - i5))));
                }
                f4.j jVarL = gVar2.l(gVar2.f2166c);
                e(jVarL.c(), 127, 128);
                gVar.H(jVarL);
                return;
            }
        }
        e(jVar.c(), 127, 0);
        gVar.H(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f131d) {
            int i4 = this.f130c;
            if (i4 < this.f132e) {
                e(i4, 31, 32);
            }
            this.f131d = false;
            this.f130c = Integer.MAX_VALUE;
            e(this.f132e, 31, 32);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = (c) arrayList.get(i5);
            f4.j jVarI = cVar.f107a.i();
            Integer num = (Integer) f.f138b.get(jVarI);
            f4.j jVar = cVar.f108b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    c[] cVarArr = f.f137a;
                    if (c3.h.I(cVarArr[iIntValue].f108b, jVar)) {
                        length = length2;
                    } else if (c3.h.I(cVarArr[length2].f108b, jVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f133f.length;
                for (int i6 = this.f134g + 1; i6 < length3; i6++) {
                    c cVar2 = this.f133f[i6];
                    c3.h.X(cVar2);
                    if (c3.h.I(cVar2.f107a, jVarI)) {
                        c cVar3 = this.f133f[i6];
                        c3.h.X(cVar3);
                        if (c3.h.I(cVar3.f108b, jVar)) {
                            length2 = f.f137a.length + (i6 - this.f134g);
                            break;
                        } else if (length == -1) {
                            length = (i6 - this.f134g) + f.f137a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f129b.K(64);
                c(jVarI);
                c(jVar);
                b(cVar);
            } else {
                f4.j jVar2 = c.f101d;
                jVarI.getClass();
                c3.h.b0(jVar2, "prefix");
                if (!jVarI.h(jVar2, jVar2.c()) || c3.h.I(c.f106i, jVarI)) {
                    e(length, 63, 64);
                    c(jVar);
                    b(cVar);
                } else {
                    e(length, 15, 0);
                    c(jVar);
                }
            }
        }
    }

    public final void e(int i4, int i5, int i6) {
        f4.g gVar = this.f129b;
        if (i4 < i5) {
            gVar.K(i4 | i6);
            return;
        }
        gVar.K(i6 | i5);
        int i7 = i4 - i5;
        while (i7 >= 128) {
            gVar.K(128 | (i7 & 127));
            i7 >>>= 7;
        }
        gVar.K(i7);
    }
}
