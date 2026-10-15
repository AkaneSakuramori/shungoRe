package q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends i {
    public static Integer Q2(String str) {
        boolean z4;
        int i4;
        int i5;
        c3.h.d0(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char cCharAt = str.charAt(0);
        int i7 = -2147483647;
        if (c3.h.n0(cCharAt, 48) < 0) {
            i4 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i7 = Integer.MIN_VALUE;
                z4 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z4 = false;
            }
        } else {
            z4 = false;
            i4 = 0;
        }
        int i8 = -59652323;
        while (i4 < length) {
            int iDigit = Character.digit((int) str.charAt(i4), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i6 < i8 && (i8 != -59652323 || i6 < (i8 = i7 / 10))) || (i5 = i6 * 10) < i7 + iDigit) {
                return null;
            }
            i6 = i5 - iDigit;
            i4++;
        }
        return z4 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }
}
