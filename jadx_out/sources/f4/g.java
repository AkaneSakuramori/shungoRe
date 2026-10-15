package f4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f2165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2166c;

    @Override // f4.i
    public final f A() {
        return new f(this, 0);
    }

    @Override // f4.i
    public final byte B() {
        if (this.f2166c == 0) {
            throw new EOFException();
        }
        r rVar = this.f2165b;
        c3.h.X(rVar);
        int i4 = rVar.f2191b;
        int i5 = rVar.f2192c;
        int i6 = i4 + 1;
        byte b5 = rVar.f2190a[i4];
        this.f2166c--;
        if (i6 == i5) {
            this.f2165b = rVar.a();
            s.a(rVar);
        } else {
            rVar.f2191b = i6;
        }
        return b5;
    }

    public final String C(long j4, Charset charset) throws EOFException {
        c3.h.b0(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2166c < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        r rVar = this.f2165b;
        c3.h.X(rVar);
        int i4 = rVar.f2191b;
        if (((long) i4) + j4 > rVar.f2192c) {
            return new String(z(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(rVar.f2190a, i4, i5, charset);
        int i6 = rVar.f2191b + i5;
        rVar.f2191b = i6;
        this.f2166c -= j4;
        if (i6 == rVar.f2192c) {
            this.f2165b = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    @Override // f4.u
    public final void D(g gVar, long j4) {
        r rVarB;
        c3.h.b0(gVar, "source");
        if (gVar == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        c3.h.c0(gVar.f2166c, 0L, j4);
        while (j4 > 0) {
            r rVar = gVar.f2165b;
            c3.h.X(rVar);
            int i4 = rVar.f2192c;
            r rVar2 = gVar.f2165b;
            c3.h.X(rVar2);
            long j5 = i4 - rVar2.f2191b;
            int i5 = 0;
            if (j4 < j5) {
                r rVar3 = this.f2165b;
                r rVar4 = rVar3 != null ? rVar3.f2196g : null;
                if (rVar4 != null && rVar4.f2194e) {
                    if ((((long) rVar4.f2192c) + j4) - ((long) (rVar4.f2193d ? 0 : rVar4.f2191b)) <= 8192) {
                        r rVar5 = gVar.f2165b;
                        c3.h.X(rVar5);
                        rVar5.d(rVar4, (int) j4);
                        gVar.f2166c -= j4;
                        this.f2166c += j4;
                        return;
                    }
                }
                r rVar6 = gVar.f2165b;
                c3.h.X(rVar6);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > rVar6.f2192c - rVar6.f2191b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i6 >= 1024) {
                    rVarB = rVar6.c();
                } else {
                    rVarB = s.b();
                    int i7 = rVar6.f2191b;
                    a3.j.S2(0, i7, i7 + i6, rVar6.f2190a, rVarB.f2190a);
                }
                rVarB.f2192c = rVarB.f2191b + i6;
                rVar6.f2191b += i6;
                r rVar7 = rVar6.f2196g;
                c3.h.X(rVar7);
                rVar7.b(rVarB);
                gVar.f2165b = rVarB;
            }
            r rVar8 = gVar.f2165b;
            c3.h.X(rVar8);
            long j6 = rVar8.f2192c - rVar8.f2191b;
            gVar.f2165b = rVar8.a();
            r rVar9 = this.f2165b;
            if (rVar9 == null) {
                this.f2165b = rVar8;
                rVar8.f2196g = rVar8;
                rVar8.f2195f = rVar8;
            } else {
                r rVar10 = rVar9.f2196g;
                c3.h.X(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f2196g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                c3.h.X(rVar11);
                if (rVar11.f2194e) {
                    int i8 = rVar8.f2192c - rVar8.f2191b;
                    r rVar12 = rVar8.f2196g;
                    c3.h.X(rVar12);
                    int i9 = 8192 - rVar12.f2192c;
                    r rVar13 = rVar8.f2196g;
                    c3.h.X(rVar13);
                    if (!rVar13.f2193d) {
                        r rVar14 = rVar8.f2196g;
                        c3.h.X(rVar14);
                        i5 = rVar14.f2191b;
                    }
                    if (i8 <= i9 + i5) {
                        r rVar15 = rVar8.f2196g;
                        c3.h.X(rVar15);
                        rVar8.d(rVar15, i8);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            gVar.f2166c -= j6;
            this.f2166c += j6;
            j4 -= j6;
        }
    }

    @Override // f4.i
    public final int E() throws EOFException {
        if (this.f2166c < 4) {
            throw new EOFException();
        }
        r rVar = this.f2165b;
        c3.h.X(rVar);
        int i4 = rVar.f2191b;
        int i5 = rVar.f2192c;
        if (i5 - i4 < 4) {
            return ((B() & 255) << 24) | ((B() & 255) << 16) | ((B() & 255) << 8) | (B() & 255);
        }
        byte[] bArr = rVar.f2190a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f2166c -= 4;
        if (i8 == i5) {
            this.f2165b = rVar.a();
            s.a(rVar);
        } else {
            rVar.f2191b = i8;
        }
        return i9;
    }

    public final j F(int i4) {
        if (i4 == 0) {
            return j.f2167e;
        }
        c3.h.c0(this.f2166c, 0L, i4);
        r rVar = this.f2165b;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            c3.h.X(rVar);
            int i8 = rVar.f2192c;
            int i9 = rVar.f2191b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            rVar = rVar.f2195f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        r rVar2 = this.f2165b;
        int i10 = 0;
        while (i5 < i4) {
            c3.h.X(rVar2);
            bArr[i10] = rVar2.f2190a;
            i5 += rVar2.f2192c - rVar2.f2191b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = rVar2.f2191b;
            rVar2.f2193d = true;
            i10++;
            rVar2 = rVar2.f2195f;
        }
        return new t(bArr, iArr);
    }

    public final r G(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        r rVar = this.f2165b;
        if (rVar == null) {
            r rVarB = s.b();
            this.f2165b = rVarB;
            rVarB.f2196g = rVarB;
            rVarB.f2195f = rVarB;
            return rVarB;
        }
        r rVar2 = rVar.f2196g;
        c3.h.X(rVar2);
        if (rVar2.f2192c + i4 <= 8192 && rVar2.f2194e) {
            return rVar2;
        }
        r rVarB2 = s.b();
        rVar2.b(rVarB2);
        return rVarB2;
    }

    public final void H(j jVar) {
        c3.h.b0(jVar, "byteString");
        jVar.k(this, jVar.c());
    }

    public final void I(byte[] bArr, int i4, int i5) {
        c3.h.b0(bArr, "source");
        long j4 = i5;
        c3.h.c0(bArr.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            r rVarG = G(1);
            int iMin = Math.min(i6 - i4, 8192 - rVarG.f2192c);
            int i7 = i4 + iMin;
            a3.j.S2(rVarG.f2192c, i4, i7, bArr, rVarG.f2190a);
            rVarG.f2192c += iMin;
            i4 = i7;
        }
        this.f2166c += j4;
    }

    public final void J(w wVar) {
        c3.h.b0(wVar, "source");
        while (wVar.f(this, 8192L) != -1) {
        }
    }

    public final void K(int i4) {
        r rVarG = G(1);
        int i5 = rVarG.f2192c;
        rVarG.f2192c = i5 + 1;
        rVarG.f2190a[i5] = (byte) i4;
        this.f2166c++;
    }

    public final void L(long j4) {
        if (j4 == 0) {
            K(48);
            return;
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i4 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        r rVarG = G(i4);
        int i5 = rVarG.f2192c;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            rVarG.f2190a[i6] = g4.a.f2319a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        rVarG.f2192c += i4;
        this.f2166c += (long) i4;
    }

    public final void M(int i4) {
        r rVarG = G(4);
        int i5 = rVarG.f2192c;
        byte[] bArr = rVarG.f2190a;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        rVarG.f2192c = i5 + 4;
        this.f2166c += 4;
    }

    public final void N(int i4) {
        r rVarG = G(2);
        int i5 = rVarG.f2192c;
        byte[] bArr = rVarG.f2190a;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        rVarG.f2192c = i5 + 2;
        this.f2166c += 2;
    }

    public final void O(int i4, int i5, String str) {
        char cCharAt;
        c3.h.b0(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(defpackage.a.e("beginIndex < 0: ", i4).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (i5 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        }
        while (i4 < i5) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128) {
                r rVarG = G(1);
                int i6 = rVarG.f2192c - i4;
                int iMin = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                byte[] bArr = rVarG.f2190a;
                bArr[i4 + i6] = (byte) cCharAt2;
                while (true) {
                    i4 = i7;
                    if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) cCharAt;
                }
                int i8 = rVarG.f2192c;
                int i9 = (i6 + i4) - i8;
                rVarG.f2192c = i8 + i9;
                this.f2166c += (long) i9;
            } else {
                if (cCharAt2 < 2048) {
                    r rVarG2 = G(2);
                    int i10 = rVarG2.f2192c;
                    byte[] bArr2 = rVarG2.f2190a;
                    bArr2[i10] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    rVarG2.f2192c = i10 + 2;
                    this.f2166c += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    r rVarG3 = G(3);
                    int i11 = rVarG3.f2192c;
                    byte[] bArr3 = rVarG3.f2190a;
                    bArr3[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    rVarG3.f2192c = i11 + 3;
                    this.f2166c += 3;
                } else {
                    int i12 = i4 + 1;
                    char cCharAt3 = i12 < i5 ? str.charAt(i12) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        K(63);
                        i4 = i12;
                    } else {
                        int i13 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        r rVarG4 = G(4);
                        int i14 = rVarG4.f2192c;
                        byte[] bArr4 = rVarG4.f2190a;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        rVarG4.f2192c = i14 + 4;
                        this.f2166c += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    public final void P(String str) {
        c3.h.b0(str, "string");
        O(0, str.length(), str);
    }

    public final void Q(int i4) {
        String str;
        if (i4 < 128) {
            K(i4);
            return;
        }
        if (i4 < 2048) {
            r rVarG = G(2);
            int i5 = rVarG.f2192c;
            byte[] bArr = rVarG.f2190a;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            rVarG.f2192c = i5 + 2;
            this.f2166c += 2;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            K(63);
            return;
        }
        if (i4 < 65536) {
            r rVarG2 = G(3);
            int i6 = rVarG2.f2192c;
            byte[] bArr2 = rVarG2.f2190a;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            rVarG2.f2192c = i6 + 3;
            this.f2166c += 3;
            return;
        }
        if (i4 <= 1114111) {
            r rVarG3 = G(4);
            int i7 = rVarG3.f2192c;
            byte[] bArr3 = rVarG3.f2190a;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            rVarG3.f2192c = i7 + 4;
            this.f2166c += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i4 != 0) {
            char[] cArr = g4.b.f2320a;
            int i8 = 0;
            char[] cArr2 = {cArr[(i4 >> 28) & 15], cArr[(i4 >> 24) & 15], cArr[(i4 >> 20) & 15], cArr[(i4 >> 16) & 15], cArr[(i4 >> 12) & 15], cArr[(i4 >> 8) & 15], cArr[(i4 >> 4) & 15], cArr[i4 & 15]};
            while (i8 < 8 && cArr2[i8] == '0') {
                i8++;
            }
            if (i8 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: 8, size: 8");
            }
            if (i8 > 8) {
                throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: 8");
            }
            str = new String(cArr2, i8, 8 - i8);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        g gVar = new g();
        if (this.f2166c != 0) {
            r rVar = this.f2165b;
            c3.h.X(rVar);
            r rVarC = rVar.c();
            gVar.f2165b = rVarC;
            rVarC.f2196g = rVarC;
            rVarC.f2195f = rVarC;
            for (r rVar2 = rVar.f2195f; rVar2 != rVar; rVar2 = rVar2.f2195f) {
                r rVar3 = rVarC.f2196g;
                c3.h.X(rVar3);
                c3.h.X(rVar2);
                rVar3.b(rVar2.c());
            }
            gVar.f2166c = this.f2166c;
        }
        return gVar;
    }

    @Override // f4.w
    public final y b() {
        return y.f2203d;
    }

    @Override // f4.h
    public final h c(byte[] bArr) {
        I(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, f4.u
    public final void close() {
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h d(int i4) {
        M(i4);
        return this;
    }

    public final void e(g gVar, long j4, long j5) {
        c3.h.b0(gVar, "out");
        c3.h.c0(this.f2166c, j4, j5);
        if (j5 == 0) {
            return;
        }
        gVar.f2166c += j5;
        r rVar = this.f2165b;
        while (true) {
            c3.h.X(rVar);
            long j6 = rVar.f2192c - rVar.f2191b;
            if (j4 < j6) {
                break;
            }
            j4 -= j6;
            rVar = rVar.f2195f;
        }
        while (j5 > 0) {
            c3.h.X(rVar);
            r rVarC = rVar.c();
            int i4 = rVarC.f2191b + ((int) j4);
            rVarC.f2191b = i4;
            rVarC.f2192c = Math.min(i4 + ((int) j5), rVarC.f2192c);
            r rVar2 = gVar.f2165b;
            if (rVar2 == null) {
                rVarC.f2196g = rVarC;
                rVarC.f2195f = rVarC;
                gVar.f2165b = rVarC;
            } else {
                r rVar3 = rVar2.f2196g;
                c3.h.X(rVar3);
                rVar3.b(rVarC);
            }
            j5 -= (long) (rVarC.f2192c - rVarC.f2191b);
            rVar = rVar.f2195f;
            j4 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                long j4 = this.f2166c;
                g gVar = (g) obj;
                if (j4 == gVar.f2166c) {
                    if (j4 != 0) {
                        r rVar = this.f2165b;
                        c3.h.X(rVar);
                        r rVar2 = gVar.f2165b;
                        c3.h.X(rVar2);
                        int i4 = rVar.f2191b;
                        int i5 = rVar2.f2191b;
                        long j5 = 0;
                        while (j5 < this.f2166c) {
                            long jMin = Math.min(rVar.f2192c - i4, rVar2.f2192c - i5);
                            long j6 = 0;
                            while (j6 < jMin) {
                                int i6 = i4 + 1;
                                byte b5 = rVar.f2190a[i4];
                                int i7 = i5 + 1;
                                if (b5 == rVar2.f2190a[i5]) {
                                    j6++;
                                    i5 = i7;
                                    i4 = i6;
                                }
                            }
                            if (i4 == rVar.f2192c) {
                                r rVar3 = rVar.f2195f;
                                c3.h.X(rVar3);
                                i4 = rVar3.f2191b;
                                rVar = rVar3;
                            }
                            if (i5 == rVar2.f2192c) {
                                rVar2 = rVar2.f2195f;
                                c3.h.X(rVar2);
                                i5 = rVar2.f2191b;
                            }
                            j5 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // f4.w
    public final long f(g gVar, long j4) {
        c3.h.b0(gVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j5 = this.f2166c;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        gVar.D(this, j4);
        return j4;
    }

    @Override // f4.h, f4.u, java.io.Flushable
    public final void flush() {
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h g(j jVar) {
        H(jVar);
        return this;
    }

    public final byte h(long j4) {
        c3.h.c0(this.f2166c, j4, 1L);
        r rVar = this.f2165b;
        if (rVar == null) {
            c3.h.X(null);
            throw null;
        }
        long j5 = this.f2166c;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                rVar = rVar.f2196g;
                c3.h.X(rVar);
                j5 -= (long) (rVar.f2192c - rVar.f2191b);
            }
            return rVar.f2190a[(int) ((((long) rVar.f2191b) + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i4 = rVar.f2192c;
            int i5 = rVar.f2191b;
            long j7 = ((long) (i4 - i5)) + j6;
            if (j7 > j4) {
                return rVar.f2190a[(int) ((((long) i5) + j4) - j6)];
            }
            rVar = rVar.f2195f;
            c3.h.X(rVar);
            j6 = j7;
        }
    }

    public final int hashCode() {
        r rVar = this.f2165b;
        if (rVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = rVar.f2192c;
            for (int i6 = rVar.f2191b; i6 < i5; i6++) {
                i4 = (i4 * 31) + rVar.f2190a[i6];
            }
            rVar = rVar.f2195f;
            c3.h.X(rVar);
        } while (rVar != this.f2165b);
        return i4;
    }

    @Override // f4.i
    public final String i() {
        return n(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h j(long j4) {
        L(j4);
        return this;
    }

    @Override // f4.i
    public final void k(long j4) throws EOFException {
        if (this.f2166c < j4) {
            throw new EOFException();
        }
    }

    @Override // f4.i
    public final j l(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2166c < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new j(z(j4));
        }
        j jVarF = F((int) j4);
        q(j4);
        return jVarF;
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h m(String str) {
        P(str);
        return this;
    }

    @Override // f4.i
    public final String n(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long jT = t((byte) 10, 0L, j5);
        if (jT != -1) {
            return g4.a.a(this, jT);
        }
        if (j5 < this.f2166c && h(j5 - 1) == 13 && h(j5) == 10) {
            return g4.a.a(this, j5);
        }
        g gVar = new g();
        e(gVar, 0L, Math.min(32, this.f2166c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2166c, j4) + " content=" + gVar.l(gVar.f2166c).d() + (char) 8230);
    }

    @Override // f4.i
    public final int o(o oVar) throws EOFException {
        c3.h.b0(oVar, "options");
        int iB = g4.a.b(this, oVar, false);
        if (iB == -1) {
            return -1;
        }
        q(oVar.f2182b[iB].c());
        return iB;
    }

    @Override // f4.i
    public final g p() {
        return this;
    }

    @Override // f4.i
    public final void q(long j4) throws EOFException {
        while (j4 > 0) {
            r rVar = this.f2165b;
            if (rVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, rVar.f2192c - rVar.f2191b);
            long j5 = iMin;
            this.f2166c -= j5;
            j4 -= j5;
            int i4 = rVar.f2191b + iMin;
            rVar.f2191b = i4;
            if (i4 == rVar.f2192c) {
                this.f2165b = rVar.a();
                s.a(rVar);
            }
        }
    }

    @Override // f4.i
    public final boolean r() {
        return this.f2166c == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        c3.h.b0(byteBuffer, "sink");
        r rVar = this.f2165b;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), rVar.f2192c - rVar.f2191b);
        byteBuffer.put(rVar.f2190a, rVar.f2191b, iMin);
        int i4 = rVar.f2191b + iMin;
        rVar.f2191b = i4;
        this.f2166c -= (long) iMin;
        if (i4 == rVar.f2192c) {
            this.f2165b = rVar.a();
            s.a(rVar);
        }
        return iMin;
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h s(int i4) {
        K(i4);
        return this;
    }

    public final long t(byte b5, long j4, long j5) {
        r rVar;
        long j6 = 0;
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("size=" + this.f2166c + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        long j7 = this.f2166c;
        if (j5 > j7) {
            j5 = j7;
        }
        if (j4 == j5 || (rVar = this.f2165b) == null) {
            return -1L;
        }
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                rVar = rVar.f2196g;
                c3.h.X(rVar);
                j7 -= (long) (rVar.f2192c - rVar.f2191b);
            }
            while (j7 < j5) {
                int iMin = (int) Math.min(rVar.f2192c, (((long) rVar.f2191b) + j5) - j7);
                for (int i4 = (int) ((((long) rVar.f2191b) + j4) - j7); i4 < iMin; i4++) {
                    if (rVar.f2190a[i4] == b5) {
                        return ((long) (i4 - rVar.f2191b)) + j7;
                    }
                }
                j7 += (long) (rVar.f2192c - rVar.f2191b);
                rVar = rVar.f2195f;
                c3.h.X(rVar);
                j4 = j7;
            }
            return -1L;
        }
        while (true) {
            long j8 = ((long) (rVar.f2192c - rVar.f2191b)) + j6;
            if (j8 > j4) {
                break;
            }
            rVar = rVar.f2195f;
            c3.h.X(rVar);
            j6 = j8;
        }
        while (j6 < j5) {
            int iMin2 = (int) Math.min(rVar.f2192c, (((long) rVar.f2191b) + j5) - j6);
            for (int i5 = (int) ((((long) rVar.f2191b) + j4) - j6); i5 < iMin2; i5++) {
                if (rVar.f2190a[i5] == b5) {
                    return ((long) (i5 - rVar.f2191b)) + j6;
                }
            }
            j6 += (long) (rVar.f2192c - rVar.f2191b);
            rVar = rVar.f2195f;
            c3.h.X(rVar);
            j4 = j6;
        }
        return -1L;
    }

    public final String toString() {
        long j4 = this.f2166c;
        if (j4 <= 2147483647L) {
            return F((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2166c).toString());
    }

    @Override // f4.i
    public final short u() throws EOFException {
        if (this.f2166c < 2) {
            throw new EOFException();
        }
        r rVar = this.f2165b;
        c3.h.X(rVar);
        int i4 = rVar.f2191b;
        int i5 = rVar.f2192c;
        if (i5 - i4 < 2) {
            return (short) (((B() & 255) << 8) | (B() & 255));
        }
        int i6 = i4 + 1;
        byte[] bArr = rVar.f2190a;
        int i7 = (bArr[i4] & 255) << 8;
        int i8 = i4 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.f2166c -= 2;
        if (i8 == i5) {
            this.f2165b = rVar.a();
            s.a(rVar);
        } else {
            rVar.f2191b = i8;
        }
        return (short) i9;
    }

    @Override // f4.h
    public final /* bridge */ /* synthetic */ h v(int i4) {
        N(i4);
        return this;
    }

    @Override // f4.i
    public final long w() throws EOFException {
        int i4;
        if (this.f2166c == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z4 = false;
        long j4 = 0;
        do {
            r rVar = this.f2165b;
            c3.h.X(rVar);
            int i6 = rVar.f2191b;
            int i7 = rVar.f2192c;
            while (i6 < i7) {
                byte b5 = rVar.f2190a[i6];
                if (b5 >= 48 && b5 <= 57) {
                    i4 = b5 - 48;
                } else if (b5 >= 97 && b5 <= 102) {
                    i4 = b5 - 87;
                } else {
                    if (b5 < 65 || b5 > 70) {
                        z4 = true;
                        if (i5 != 0) {
                            break;
                        }
                        char[] cArr = g4.b.f2320a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b5 >> 4) & 15], cArr[b5 & 15]})));
                    }
                    i4 = b5 - 55;
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    g gVar = new g();
                    gVar.L(j4);
                    gVar.K(b5);
                    throw new NumberFormatException("Number too large: ".concat(gVar.C(gVar.f2166c, q3.a.f3886a)));
                }
                j4 = (j4 << 4) | ((long) i4);
                i6++;
                i5++;
            }
            if (i6 == i7) {
                this.f2165b = rVar.a();
                s.a(rVar);
            } else {
                rVar.f2191b = i6;
            }
            if (z4) {
                break;
            }
        } while (this.f2165b != null);
        this.f2166c -= (long) i5;
        return j4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        c3.h.b0(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            r rVarG = G(1);
            int iMin = Math.min(i4, 8192 - rVarG.f2192c);
            byteBuffer.get(rVarG.f2190a, rVarG.f2192c, iMin);
            i4 -= iMin;
            rVarG.f2192c += iMin;
        }
        this.f2166c += (long) iRemaining;
        return iRemaining;
    }

    public final int x(byte[] bArr, int i4, int i5) {
        c3.h.b0(bArr, "sink");
        c3.h.c0(bArr.length, i4, i5);
        r rVar = this.f2165b;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(i5, rVar.f2192c - rVar.f2191b);
        int i6 = rVar.f2191b;
        a3.j.S2(i4, i6, i6 + iMin, rVar.f2190a, bArr);
        int i7 = rVar.f2191b + iMin;
        rVar.f2191b = i7;
        this.f2166c -= (long) iMin;
        if (i7 == rVar.f2192c) {
            this.f2165b = rVar.a();
            s.a(rVar);
        }
        return iMin;
    }

    @Override // f4.i
    public final String y(Charset charset) {
        return C(this.f2166c, charset);
    }

    public final byte[] z(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f2166c < j4) {
            throw new EOFException();
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int iX = x(bArr, i5, i4 - i5);
            if (iX == -1) {
                throw new EOFException();
            }
            i5 += iX;
        }
        return bArr;
    }
}
