package f4;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f2167e = new j(new byte[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f2169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient String f2170d;

    public j(byte[] bArr) {
        c3.h.b0(bArr, "data");
        this.f2168b = bArr;
    }

    public String a() {
        byte[] bArr = a.f2148a;
        byte[] bArr2 = this.f2168b;
        c3.h.b0(bArr2, "<this>");
        c3.h.b0(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b5 = bArr2[i4];
            int i6 = i4 + 2;
            byte b6 = bArr2[i4 + 1];
            i4 += 3;
            byte b7 = bArr2[i6];
            bArr3[i5] = bArr[(b5 & 255) >> 2];
            bArr3[i5 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr3[i5 + 2] = bArr[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i5 += 4;
            bArr3[i7] = bArr[b7 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b8 = bArr2[i4];
            bArr3[i5] = bArr[(b8 & 255) >> 2];
            bArr3[i5 + 1] = bArr[(b8 & 3) << 4];
            bArr3[i5 + 2] = 61;
            bArr3[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i4 + 1;
            byte b9 = bArr2[i4];
            byte b10 = bArr2[i8];
            bArr3[i5] = bArr[(b9 & 255) >> 2];
            bArr3[i5 + 1] = bArr[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr3[i5 + 2] = bArr[(b10 & 15) << 2];
            bArr3[i5 + 3] = 61;
        }
        return new String(bArr3, q3.a.f3886a);
    }

    public j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f2168b, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        c3.h.X(bArrDigest);
        return new j(bArrDigest);
    }

    public int c() {
        return this.f2168b.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            f4.j r10 = (f4.j) r10
            java.lang.String r0 = "other"
            c3.h.b0(r10, r0)
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.j.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f2168b;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b5 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = g4.b.f2320a;
            cArr[i4] = cArr2[(b5 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f2168b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iC = jVar.c();
            byte[] bArr = this.f2168b;
            if (iC == bArr.length && jVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i4) {
        return this.f2168b[i4];
    }

    public boolean g(int i4, byte[] bArr, int i5, int i6) {
        c3.h.b0(bArr, "other");
        if (i4 >= 0) {
            byte[] bArr2 = this.f2168b;
            if (i4 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && c3.h.J(i4, i5, i6, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(j jVar, int i4) {
        c3.h.b0(jVar, "other");
        return jVar.g(0, this.f2168b, 0, i4);
    }

    public int hashCode() {
        int i4 = this.f2169c;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(this.f2168b);
        this.f2169c = iHashCode;
        return iHashCode;
    }

    public j i() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f2168b;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b5 = bArr[i4];
            if (b5 >= 65 && b5 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                c3.h.a0(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b5 + 32);
                for (int i5 = i4 + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b6 = bArrCopyOf[i5];
                    if (b6 >= 65 && b6 <= 90) {
                        bArrCopyOf[i5] = (byte) (b6 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i4++;
        }
    }

    public final String j() {
        String str = this.f2170d;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        c3.h.b0(bArrE, "<this>");
        String str2 = new String(bArrE, q3.a.f3886a);
        this.f2170d = str2;
        return str2;
    }

    public void k(g gVar, int i4) {
        c3.h.b0(gVar, "buffer");
        gVar.I(this.f2168b, 0, i4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:238:0x000f]] */
    public String toString() {
        byte b5;
        int i4;
        byte[] bArr = this.f2168b;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (i5 < length) {
            byte b6 = bArr[i5];
            if (b6 < 0) {
                if ((b6 >> 5) != -2) {
                    if ((b6 >> 4) != -2) {
                        if ((b6 >> 3) != -2) {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                        int i8 = i5 + 3;
                        if (length > i8) {
                            byte b7 = bArr[i5 + 1];
                            if ((b7 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b8 = bArr[i5 + 2];
                            if ((b8 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b9 = bArr[i8];
                            if ((b9 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            int i9 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b6 << 18);
                            if (i9 <= 1114111) {
                                if (55296 <= i9 && i9 < 57344) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                                if (i9 >= 65536) {
                                    i4 = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        i6 = -1;
                                        break;
                                    }
                                    i6 += i9 < 65536 ? 1 : 2;
                                    i5 += 4;
                                    i7 = i4;
                                } else {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                            } else {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    } else {
                        int i10 = i5 + 2;
                        if (length > i10) {
                            byte b10 = bArr[i5 + 1];
                            if ((b10 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b11 = bArr[i10];
                            if ((b11 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            int i11 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b6 << 12);
                            if (i11 >= 2048) {
                                if (55296 <= i11 && i11 < 57344) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                                i4 = i7 + 1;
                                if (i7 == 64) {
                                    break;
                                }
                                if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                    i6 = -1;
                                    break;
                                }
                                i6 += i11 < 65536 ? 1 : 2;
                                i5 += 3;
                                i7 = i4;
                            } else {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    }
                } else {
                    int i12 = i5 + 1;
                    if (length > i12) {
                        byte b12 = bArr[i12];
                        if ((b12 & 192) != 128) {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                        int i13 = (b12 ^ 3968) ^ (b6 << 6);
                        if (i13 >= 128) {
                            i4 = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                i6 = -1;
                                break;
                            }
                            i6 += i13 < 65536 ? 1 : 2;
                            i5 += 2;
                            i7 = i4;
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    } else {
                        if (i7 == 64) {
                            break;
                        }
                        i6 = -1;
                        break;
                    }
                }
            } else {
                int i14 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b6 == 10 || b6 == 13 || ((b6 < 0 || b6 >= 32) && (127 > b6 || b6 >= 160))) && b6 != 65533) {
                    i6 += b6 < 65536 ? 1 : 2;
                    i5++;
                    while (true) {
                        i7 = i14;
                        if (i5 < length && (b5 = bArr[i5]) >= 0) {
                            i5++;
                            i14 = i7 + 1;
                            if (i7 == 64) {
                                break loop0;
                            }
                            if ((b5 == 10 || b5 == 13 || ((b5 < 0 || b5 >= 32) && (127 > b5 || b5 >= 160))) && b5 != 65533) {
                                i6 += b5 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i6 = -1;
                break;
            }
        }
        if (i6 != -1) {
            String strJ = j();
            String strSubstring = strJ.substring(0, i6);
            c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strI3 = q3.l.i3(q3.l.i3(q3.l.i3(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= strJ.length()) {
                return "[text=" + strI3 + ']';
            }
            return "[size=" + bArr.length + " text=" + strI3 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new j(a3.j.V2(bArr, 0, 64))).d());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
