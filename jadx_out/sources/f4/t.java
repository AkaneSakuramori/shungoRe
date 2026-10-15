package f4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class t extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f2200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f2201g;

    public t(byte[][] bArr, int[] iArr) {
        super(j.f2167e.f2168b);
        this.f2200f = bArr;
        this.f2201g = iArr;
    }

    @Override // f4.j
    public final String a() {
        throw null;
    }

    @Override // f4.j
    public final j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f2200f;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = this.f2201g;
            int i6 = iArr[length + i4];
            int i7 = iArr[i4];
            messageDigest.update(bArr[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
        byte[] bArrDigest = messageDigest.digest();
        c3.h.X(bArrDigest);
        return new j(bArrDigest);
    }

    @Override // f4.j
    public final int c() {
        return this.f2201g[this.f2200f.length - 1];
    }

    @Override // f4.j
    public final String d() {
        return new j(l()).d();
    }

    @Override // f4.j
    public final byte[] e() {
        return l();
    }

    @Override // f4.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.c() == c() && h(jVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.j
    public final byte f(int i4) {
        byte[][] bArr = this.f2200f;
        int length = bArr.length - 1;
        int[] iArr = this.f2201g;
        c3.h.c0(iArr[length], i4, 1L);
        int iQ = r3.q.q(this, i4);
        return bArr[iQ][(i4 - (iQ == 0 ? 0 : iArr[iQ - 1])) + iArr[bArr.length + iQ]];
    }

    @Override // f4.j
    public final boolean g(int i4, byte[] bArr, int i5, int i6) {
        c3.h.b0(bArr, "other");
        if (i4 < 0 || i4 > c() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iQ = r3.q.q(this, i4);
        while (i4 < i7) {
            int[] iArr = this.f2201g;
            int i8 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i9 = iArr[iQ] - i8;
            byte[][] bArr2 = this.f2200f;
            int i10 = iArr[bArr2.length + iQ];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!c3.h.J((i4 - i8) + i10, i5, iMin, bArr2[iQ], bArr)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iQ++;
        }
        return true;
    }

    @Override // f4.j
    public final boolean h(j jVar, int i4) {
        c3.h.b0(jVar, "other");
        if (c() - i4 < 0) {
            return false;
        }
        int iQ = r3.q.q(this, 0);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int[] iArr = this.f2201g;
            int i7 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i8 = iArr[iQ] - i7;
            byte[][] bArr = this.f2200f;
            int i9 = iArr[bArr.length + iQ];
            int iMin = Math.min(i4, i8 + i7) - i5;
            if (!jVar.g(i6, bArr[iQ], (i5 - i7) + i9, iMin)) {
                return false;
            }
            i6 += iMin;
            i5 += iMin;
            iQ++;
        }
        return true;
    }

    @Override // f4.j
    public final int hashCode() {
        int i4 = this.f2169c;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f2200f;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f2201g;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f2169c = i6;
        return i6;
    }

    @Override // f4.j
    public final j i() {
        return new j(l()).i();
    }

    @Override // f4.j
    public final void k(g gVar, int i4) {
        c3.h.b0(gVar, "buffer");
        int iQ = r3.q.q(this, 0);
        int i5 = 0;
        while (i5 < i4) {
            int[] iArr = this.f2201g;
            int i6 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i7 = iArr[iQ] - i6;
            byte[][] bArr = this.f2200f;
            int i8 = iArr[bArr.length + iQ];
            int iMin = Math.min(i4, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            r rVar = new r(bArr[iQ], i9, i9 + iMin, true);
            r rVar2 = gVar.f2165b;
            if (rVar2 == null) {
                rVar.f2196g = rVar;
                rVar.f2195f = rVar;
                gVar.f2165b = rVar;
            } else {
                r rVar3 = rVar2.f2196g;
                c3.h.X(rVar3);
                rVar3.b(rVar);
            }
            i5 += iMin;
            iQ++;
        }
        gVar.f2166c += (long) i4;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f2200f;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f2201g;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            int i9 = i8 - i5;
            a3.j.S2(i6, i7, i7 + i9, bArr2[i4], bArr);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // f4.j
    public final String toString() {
        return new j(l()).toString();
    }
}
