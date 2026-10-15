package t3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4429c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f4430d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f4432b;

    public u(String str, String[] strArr) {
        this.f4431a = str;
        this.f4432b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f4432b;
        int i4 = 0;
        int iZ0 = c3.h.Z0(0, strArr.length - 1, 2);
        if (iZ0 < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!q3.l.U2(strArr[i4], "charset")) {
                if (i4 == iZ0) {
                    str = null;
                    break;
                }
                i4 += 2;
            } else {
                str = strArr[i4 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && c3.h.I(((u) obj).f4431a, this.f4431a);
    }

    public final int hashCode() {
        return this.f4431a.hashCode();
    }

    public final String toString() {
        return this.f4431a;
    }
}
