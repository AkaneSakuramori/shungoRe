package m;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3403a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3403a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i4 = 0; i4 < Math.min(bArr.length, bArr2.length); i4++) {
                    byte b5 = bArr[i4];
                    byte b6 = bArr2[i4];
                    if (b5 != b6) {
                        return b5 - b6;
                    }
                }
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                return 0;
            default:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                if (bArr3.length != bArr4.length) {
                    return bArr3.length - bArr4.length;
                }
                for (int i5 = 0; i5 < bArr3.length; i5++) {
                    byte b7 = bArr3[i5];
                    byte b8 = bArr4[i5];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
        }
    }
}
