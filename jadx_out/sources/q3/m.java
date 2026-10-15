package q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public static String u3(String str, int i4) {
        c3.h.b0(str, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i4 > length) {
            i4 = length;
        }
        String strSubstring = str.substring(0, i4);
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
