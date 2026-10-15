package a4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f4.q f120d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f124h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f118b = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f119c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c[] f121e = new c[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f122f = 7;

    public d(v vVar) {
        this.f120d = new f4.q(vVar);
    }

    public final int a(int i4) {
        int i5;
        int i6 = 0;
        if (i4 > 0) {
            int length = this.f121e.length;
            while (true) {
                length--;
                i5 = this.f122f;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                c cVar = this.f121e[length];
                c3.h.X(cVar);
                int i7 = cVar.f109c;
                i4 -= i7;
                this.f124h -= i7;
                this.f123g--;
                i6++;
            }
            c[] cVarArr = this.f121e;
            System.arraycopy(cVarArr, i5 + 1, cVarArr, i5 + 1 + i6, this.f123g);
            this.f122f += i6;
        }
        return i6;
    }

    public final f4.j b(int i4) throws IOException {
        if (i4 >= 0) {
            c[] cVarArr = f.f137a;
            if (i4 <= cVarArr.length - 1) {
                return cVarArr[i4].f107a;
            }
        }
        int length = this.f122f + 1 + (i4 - f.f137a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.f121e;
            if (length < cVarArr2.length) {
                c cVar = cVarArr2[length];
                c3.h.X(cVar);
                return cVar.f107a;
            }
        }
        throw new IOException("Header index too large " + (i4 + 1));
    }

    public final void c(c cVar) {
        this.f119c.add(cVar);
        int i4 = this.f118b;
        int i5 = cVar.f109c;
        if (i5 > i4) {
            c[] cVarArr = this.f121e;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f122f = this.f121e.length - 1;
            this.f123g = 0;
            this.f124h = 0;
            return;
        }
        a((this.f124h + i5) - i4);
        int i6 = this.f123g + 1;
        c[] cVarArr2 = this.f121e;
        if (i6 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f122f = this.f121e.length - 1;
            this.f121e = cVarArr3;
        }
        int i7 = this.f122f;
        this.f122f = i7 - 1;
        this.f121e[i7] = cVar;
        this.f123g++;
        this.f124h += i5;
    }

    public final f4.j d() {
        f4.q qVar = this.f120d;
        byte B = qVar.B();
        byte[] bArr = u3.b.f4761a;
        int i4 = B & 255;
        int i5 = 0;
        boolean z4 = (B & 128) == 128;
        long jE = e(i4, 127);
        if (!z4) {
            return qVar.l(jE);
        }
        f4.g gVar = new f4.g();
        int[] iArr = d0.f125a;
        c3.h.b0(qVar, "source");
        r0.b bVar = d0.f127c;
        r0.b bVar2 = bVar;
        int i6 = 0;
        for (long j4 = 0; j4 < jE; j4++) {
            byte B2 = qVar.B();
            byte[] bArr2 = u3.b.f4761a;
            i5 = (i5 << 8) | (B2 & 255);
            i6 += 8;
            while (i6 >= 8) {
                r0.b[] bVarArr = (r0.b[]) bVar2.f4030c;
                c3.h.X(bVarArr);
                bVar2 = bVarArr[(i5 >>> (i6 - 8)) & 255];
                c3.h.X(bVar2);
                if (((r0.b[]) bVar2.f4030c) == null) {
                    gVar.K(bVar2.f4028a);
                    i6 -= bVar2.f4029b;
                    bVar2 = bVar;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            r0.b[] bVarArr2 = (r0.b[]) bVar2.f4030c;
            c3.h.X(bVarArr2);
            r0.b bVar3 = bVarArr2[(i5 << (8 - i6)) & 255];
            c3.h.X(bVar3);
            if (((r0.b[]) bVar3.f4030c) != null || bVar3.f4029b > i6) {
                break;
            }
            gVar.K(bVar3.f4028a);
            i6 -= bVar3.f4029b;
            bVar2 = bVar;
        }
        return gVar.l(gVar.f2166c);
    }

    public final int e(int i4, int i5) {
        int i6 = i4 & i5;
        if (i6 < i5) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte B = this.f120d.B();
            byte[] bArr = u3.b.f4761a;
            int i8 = B & 255;
            if ((B & 128) == 0) {
                return i5 + (i8 << i7);
            }
            i5 += (B & 127) << i7;
            i7 += 7;
        }
    }
}
