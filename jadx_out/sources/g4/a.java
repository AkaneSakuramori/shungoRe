package g4;

import c3.h;
import f4.g;
import f4.o;
import f4.r;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f2319a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(q3.a.f3886a);
        h.a0(bytes, "this as java.lang.String).getBytes(charset)");
        f2319a = bytes;
    }

    public static final String a(g gVar, long j4) throws EOFException {
        h.b0(gVar, "<this>");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (gVar.h(j5) == 13) {
                String strC = gVar.C(j5, q3.a.f3886a);
                gVar.q(2L);
                return strC;
            }
        }
        String strC2 = gVar.C(j4, q3.a.f3886a);
        gVar.q(1L);
        return strC2;
    }

    public static final int b(g gVar, o oVar, boolean z4) {
        int i4;
        int i5;
        r rVar;
        byte[] bArr;
        int i6;
        h.b0(gVar, "<this>");
        h.b0(oVar, "options");
        r rVar2 = gVar.f2165b;
        int i7 = -2;
        if (rVar2 == null) {
            return z4 ? -2 : -1;
        }
        int i8 = rVar2.f2191b;
        int i9 = rVar2.f2192c;
        byte[] bArr2 = rVar2.f2190a;
        r rVar3 = rVar2;
        int i10 = -1;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11 + 1;
            int[] iArr = oVar.f2183c;
            int i13 = iArr[i11];
            int i14 = i11 + 2;
            int i15 = iArr[i12];
            if (i15 != -1) {
                i10 = i15;
            }
            if (rVar3 == null) {
                break;
            }
            if (i13 >= 0) {
                int i16 = i8 + 1;
                int i17 = bArr2[i8] & 255;
                int i18 = i14 + i13;
                while (i14 != i18) {
                    if (i17 == iArr[i14]) {
                        i4 = iArr[i14 + i13];
                        if (i16 == i9) {
                            rVar3 = rVar3.f2195f;
                            h.X(rVar3);
                            i5 = rVar3.f2191b;
                            i9 = rVar3.f2192c;
                            bArr2 = rVar3.f2190a;
                            if (rVar3 == rVar2) {
                                rVar3 = null;
                            }
                        } else {
                            i5 = i16;
                        }
                    } else {
                        i14++;
                    }
                }
                return i10;
            }
            int i19 = (i13 * (-1)) + i14;
            while (true) {
                int i20 = i8 + 1;
                int i21 = i14 + 1;
                if ((bArr2[i8] & 255) != iArr[i14]) {
                    return i10;
                }
                boolean z5 = i21 == i19;
                if (i20 == i9) {
                    h.X(rVar3);
                    r rVar4 = rVar3.f2195f;
                    h.X(rVar4);
                    i6 = rVar4.f2191b;
                    int i22 = rVar4.f2192c;
                    bArr = rVar4.f2190a;
                    if (rVar4 != rVar2) {
                        rVar = rVar4;
                        i9 = i22;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        i9 = i22;
                        rVar = null;
                    }
                } else {
                    rVar = rVar3;
                    bArr = bArr2;
                    i6 = i20;
                }
                if (z5) {
                    i4 = iArr[i21];
                    i5 = i6;
                    bArr2 = bArr;
                    rVar3 = rVar;
                    break;
                }
                i8 = i6;
                bArr2 = bArr;
                rVar3 = rVar;
                i14 = i21;
            }
            if (i4 >= 0) {
                return i4;
            }
            i11 = -i4;
            i8 = i5;
            i7 = -2;
        }
        return z4 ? i7 : i10;
    }
}
