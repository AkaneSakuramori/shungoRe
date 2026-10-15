package t2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reader f4256b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f4267m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f4269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f4270p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4257c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f4258d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4259e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4260f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4261g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4262h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4263i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4268n = 1;

    static {
        a.f4255a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f4267m = iArr;
        iArr[0] = 6;
        this.f4269o = new String[32];
        this.f4270p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f4256b = reader;
    }

    public final boolean C(int i4) throws IOException {
        int i5;
        int i6;
        int i7 = this.f4262h;
        int i8 = this.f4259e;
        this.f4262h = i7 - i8;
        int i9 = this.f4260f;
        char[] cArr = this.f4258d;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f4260f = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f4260f = 0;
        }
        this.f4259e = 0;
        do {
            int i11 = this.f4260f;
            int i12 = this.f4256b.read(cArr, i11, cArr.length - i11);
            if (i12 == -1) {
                return false;
            }
            i5 = this.f4260f + i12;
            this.f4260f = i5;
            if (this.f4261g == 0 && (i6 = this.f4262h) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f4259e++;
                this.f4262h = i6 + 1;
                i4++;
            }
        } while (i5 < i4);
        return true;
    }

    public String F() {
        StringBuilder sb = new StringBuilder("$");
        int i4 = this.f4268n;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f4267m[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(this.f4270p[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = this.f4269o[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean G() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        return (iT == 2 || iT == 4) ? false : true;
    }

    public final boolean H(char c5) throws d {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    final String I() {
        return " at line " + (this.f4261g + 1) + " column " + ((this.f4259e - this.f4262h) + 1) + " path " + F();
    }

    public boolean J() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 5) {
            this.f4263i = 0;
            int[] iArr = this.f4270p;
            int i4 = this.f4268n - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (iT != 6) {
            throw new IllegalStateException("Expected a boolean but was " + defpackage.a.s(T()) + I());
        }
        this.f4263i = 0;
        int[] iArr2 = this.f4270p;
        int i5 = this.f4268n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return false;
    }

    public double K() throws d {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 15) {
            this.f4263i = 0;
            int[] iArr = this.f4270p;
            int i4 = this.f4268n - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f4264j;
        }
        if (iT == 16) {
            this.f4266l = new String(this.f4258d, this.f4259e, this.f4265k);
            this.f4259e += this.f4265k;
        } else if (iT == 8 || iT == 9) {
            this.f4266l = Q(iT == 8 ? '\'' : '\"');
        } else if (iT == 10) {
            this.f4266l = S();
        } else if (iT != 11) {
            throw new IllegalStateException("Expected a double but was " + defpackage.a.s(T()) + I());
        }
        this.f4263i = 11;
        double d5 = Double.parseDouble(this.f4266l);
        if (!this.f4257c && (Double.isNaN(d5) || Double.isInfinite(d5))) {
            throw new d("JSON forbids NaN and infinities: " + d5 + I());
        }
        this.f4266l = null;
        this.f4263i = 0;
        int[] iArr2 = this.f4270p;
        int i5 = this.f4268n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return d5;
    }

    public int L() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 15) {
            long j4 = this.f4264j;
            int i4 = (int) j4;
            if (j4 != i4) {
                throw new NumberFormatException("Expected an int but was " + this.f4264j + I());
            }
            this.f4263i = 0;
            int[] iArr = this.f4270p;
            int i5 = this.f4268n - 1;
            iArr[i5] = iArr[i5] + 1;
            return i4;
        }
        if (iT == 16) {
            this.f4266l = new String(this.f4258d, this.f4259e, this.f4265k);
            this.f4259e += this.f4265k;
        } else {
            if (iT != 8 && iT != 9 && iT != 10) {
                throw new IllegalStateException("Expected an int but was " + defpackage.a.s(T()) + I());
            }
            if (iT == 10) {
                this.f4266l = S();
            } else {
                this.f4266l = Q(iT == 8 ? '\'' : '\"');
            }
            try {
                int i6 = Integer.parseInt(this.f4266l);
                this.f4263i = 0;
                int[] iArr2 = this.f4270p;
                int i7 = this.f4268n - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4263i = 11;
        double d5 = Double.parseDouble(this.f4266l);
        int i8 = (int) d5;
        if (i8 != d5) {
            throw new NumberFormatException("Expected an int but was " + this.f4266l + I());
        }
        this.f4266l = null;
        this.f4263i = 0;
        int[] iArr3 = this.f4270p;
        int i9 = this.f4268n - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }

    public long M() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 15) {
            this.f4263i = 0;
            int[] iArr = this.f4270p;
            int i4 = this.f4268n - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f4264j;
        }
        if (iT == 16) {
            this.f4266l = new String(this.f4258d, this.f4259e, this.f4265k);
            this.f4259e += this.f4265k;
        } else {
            if (iT != 8 && iT != 9 && iT != 10) {
                throw new IllegalStateException("Expected a long but was " + defpackage.a.s(T()) + I());
            }
            if (iT == 10) {
                this.f4266l = S();
            } else {
                this.f4266l = Q(iT == 8 ? '\'' : '\"');
            }
            try {
                long j4 = Long.parseLong(this.f4266l);
                this.f4263i = 0;
                int[] iArr2 = this.f4270p;
                int i5 = this.f4268n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return j4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4263i = 11;
        double d5 = Double.parseDouble(this.f4266l);
        long j5 = (long) d5;
        if (j5 != d5) {
            throw new NumberFormatException("Expected a long but was " + this.f4266l + I());
        }
        this.f4266l = null;
        this.f4263i = 0;
        int[] iArr3 = this.f4270p;
        int i6 = this.f4268n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j5;
    }

    public String N() throws d {
        String strQ;
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 14) {
            strQ = S();
        } else if (iT == 12) {
            strQ = Q('\'');
        } else {
            if (iT != 13) {
                throw new IllegalStateException("Expected a name but was " + defpackage.a.s(T()) + I());
            }
            strQ = Q('\"');
        }
        this.f4263i = 0;
        this.f4269o[this.f4268n - 1] = strQ;
        return strQ;
    }

    public final int O(boolean z4) throws IOException {
        int i4 = this.f4259e;
        int i5 = this.f4260f;
        while (true) {
            if (i4 == i5) {
                this.f4259e = i4;
                if (!C(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + I());
                }
                i4 = this.f4259e;
                i5 = this.f4260f;
            }
            int i6 = i4 + 1;
            char[] cArr = this.f4258d;
            char c5 = cArr[i4];
            if (c5 == '\n') {
                this.f4261g++;
                this.f4262h = i6;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.f4259e = i6;
                    if (i6 == i5) {
                        this.f4259e = i4;
                        boolean zC = C(2);
                        this.f4259e++;
                        if (!zC) {
                            return c5;
                        }
                    }
                    h();
                    int i7 = this.f4259e;
                    char c6 = cArr[i7];
                    if (c6 == '*') {
                        this.f4259e = i7 + 1;
                        while (true) {
                            if (this.f4259e + 2 > this.f4260f && !C(2)) {
                                Z("Unterminated comment");
                                throw null;
                            }
                            int i8 = this.f4259e;
                            if (cArr[i8] != '\n') {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= 2) {
                                        i4 = this.f4259e + 2;
                                        i5 = this.f4260f;
                                        break;
                                    }
                                    if (cArr[this.f4259e + i9] != "*/".charAt(i9)) {
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                this.f4261g++;
                                this.f4262h = i8 + 1;
                            }
                            this.f4259e++;
                        }
                    } else {
                        if (c6 != '/') {
                            return c5;
                        }
                        this.f4259e = i7 + 1;
                        X();
                        i4 = this.f4259e;
                        i5 = this.f4260f;
                    }
                } else {
                    if (c5 != '#') {
                        this.f4259e = i6;
                        return c5;
                    }
                    this.f4259e = i6;
                    h();
                    X();
                    i4 = this.f4259e;
                    i5 = this.f4260f;
                }
            }
            i4 = i6;
        }
    }

    public void P() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT != 7) {
            throw new IllegalStateException("Expected null but was " + defpackage.a.s(T()) + I());
        }
        this.f4263i = 0;
        int[] iArr = this.f4270p;
        int i4 = this.f4268n - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    public final String Q(char c5) throws d {
        int i4;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i5 = this.f4259e;
            int i6 = this.f4260f;
            while (true) {
                int i7 = i6;
                i4 = i5;
                while (true) {
                    cArr = this.f4258d;
                    if (i5 < i7) {
                        int i8 = i5 + 1;
                        char c6 = cArr[i5];
                        if (c6 == c5) {
                            this.f4259e = i8;
                            int i9 = (i8 - i4) - 1;
                            if (sb == null) {
                                return new String(cArr, i4, i9);
                            }
                            sb.append(cArr, i4, i9);
                            return sb.toString();
                        }
                        if (c6 == '\\') {
                            this.f4259e = i8;
                            int i10 = i8 - i4;
                            int i11 = i10 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i10 * 2, 16));
                            }
                            sb.append(cArr, i4, i11);
                            sb.append(V());
                            i5 = this.f4259e;
                            i6 = this.f4260f;
                        } else {
                            if (c6 == '\n') {
                                this.f4261g++;
                                this.f4262h = i8;
                            }
                            i5 = i8;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i5 - i4) * 2, 16));
            }
            sb.append(cArr, i4, i5 - i4);
            this.f4259e = i5;
        } while (C(1));
        Z("Unterminated string");
        throw null;
    }

    public String R() throws d {
        String str;
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 10) {
            str = S();
        } else if (iT == 8) {
            str = Q('\'');
        } else if (iT == 9) {
            str = Q('\"');
        } else if (iT == 11) {
            str = this.f4266l;
            this.f4266l = null;
        } else if (iT == 15) {
            str = Long.toString(this.f4264j);
        } else {
            if (iT != 16) {
                throw new IllegalStateException("Expected a string but was " + defpackage.a.s(T()) + I());
            }
            str = new String(this.f4258d, this.f4259e, this.f4265k);
            this.f4259e += this.f4265k;
        }
        this.f4263i = 0;
        int[] iArr = this.f4270p;
        int i4 = this.f4268n - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String S() throws d {
        String string;
        StringBuilder sb = null;
        int i4 = 0;
        while (true) {
            int i5 = 0;
            while (true) {
                int i6 = this.f4259e;
                int i7 = i6 + i5;
                int i8 = this.f4260f;
                char[] cArr = this.f4258d;
                if (i7 < i8) {
                    char c5 = cArr[i6 + i5];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    i4 = i5;
                } else if (i5 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i5, 16));
                    }
                    sb.append(cArr, this.f4259e, i5);
                    this.f4259e += i5;
                    if (!C(1)) {
                    }
                } else if (!C(i5 + 1)) {
                    i4 = i5;
                }
                if (sb == null) {
                    string = new String(cArr, this.f4259e, i4);
                } else {
                    sb.append(cArr, this.f4259e, i4);
                    string = sb.toString();
                }
                this.f4259e += i4;
                return string;
            }
        }
    }

    public int T() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        switch (iT) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void U(int i4) {
        int i5 = this.f4268n;
        int[] iArr = this.f4267m;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f4267m = Arrays.copyOf(iArr, i6);
            this.f4270p = Arrays.copyOf(this.f4270p, i6);
            this.f4269o = (String[]) Arrays.copyOf(this.f4269o, i6);
        }
        int[] iArr2 = this.f4267m;
        int i7 = this.f4268n;
        this.f4268n = i7 + 1;
        iArr2[i7] = i4;
    }

    public final char V() throws d {
        int i4;
        if (this.f4259e == this.f4260f && !C(1)) {
            Z("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f4259e;
        int i6 = i5 + 1;
        this.f4259e = i6;
        char[] cArr = this.f4258d;
        char c5 = cArr[i5];
        if (c5 == '\n') {
            this.f4261g++;
            this.f4262h = i6;
        } else if (c5 != '\"' && c5 != '\'' && c5 != '/' && c5 != '\\') {
            if (c5 == 'b') {
                return '\b';
            }
            if (c5 == 'f') {
                return '\f';
            }
            if (c5 == 'n') {
                return '\n';
            }
            if (c5 == 'r') {
                return '\r';
            }
            if (c5 == 't') {
                return '\t';
            }
            if (c5 != 'u') {
                Z("Invalid escape sequence");
                throw null;
            }
            if (i5 + 5 > this.f4260f && !C(4)) {
                Z("Unterminated escape sequence");
                throw null;
            }
            int i7 = this.f4259e;
            int i8 = i7 + 4;
            char c6 = 0;
            while (i7 < i8) {
                char c7 = cArr[i7];
                char c8 = (char) (c6 << 4);
                if (c7 >= '0' && c7 <= '9') {
                    i4 = c7 - '0';
                } else if (c7 >= 'a' && c7 <= 'f') {
                    i4 = c7 - 'W';
                } else {
                    if (c7 < 'A' || c7 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f4259e, 4)));
                    }
                    i4 = c7 - '7';
                }
                c6 = (char) (i4 + c8);
                i7++;
            }
            this.f4259e += 4;
            return c6;
        }
        return c5;
    }

    public final void W(char c5) throws d {
        do {
            int i4 = this.f4259e;
            int i5 = this.f4260f;
            while (i4 < i5) {
                int i6 = i4 + 1;
                char c6 = this.f4258d[i4];
                if (c6 == c5) {
                    this.f4259e = i6;
                    return;
                }
                if (c6 == '\\') {
                    this.f4259e = i6;
                    V();
                    i4 = this.f4259e;
                    i5 = this.f4260f;
                } else {
                    if (c6 == '\n') {
                        this.f4261g++;
                        this.f4262h = i6;
                    }
                    i4 = i6;
                }
            }
            this.f4259e = i4;
        } while (C(1));
        Z("Unterminated string");
        throw null;
    }

    public final void X() {
        char c5;
        do {
            if (this.f4259e >= this.f4260f && !C(1)) {
                return;
            }
            int i4 = this.f4259e;
            int i5 = i4 + 1;
            this.f4259e = i5;
            c5 = this.f4258d[i4];
            if (c5 == '\n') {
                this.f4261g++;
                this.f4262h = i5;
                return;
            }
        } while (c5 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009b. Please report as an issue. */
    public void Y() throws d {
        int i4 = 0;
        do {
            int iT = this.f4263i;
            if (iT == 0) {
                iT = t();
            }
            if (iT == 3) {
                U(1);
            } else {
                if (iT == 1) {
                    U(3);
                } else if (iT == 4 || iT == 2) {
                    this.f4268n--;
                    i4--;
                } else if (iT == 14 || iT == 10) {
                    while (true) {
                        int i5 = 0;
                        while (true) {
                            int i6 = this.f4259e + i5;
                            if (i6 < this.f4260f) {
                                char c5 = this.f4258d[i6];
                                if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                                    if (c5 != '#') {
                                        if (c5 != ',') {
                                            if (c5 != '/' && c5 != '=') {
                                                if (c5 != '{' && c5 != '}' && c5 != ':') {
                                                    if (c5 != ';') {
                                                        switch (c5) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i5++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h();
                                }
                                this.f4259e += i5;
                            } else {
                                this.f4259e = i6;
                                if (!C(1)) {
                                }
                            }
                        }
                    }
                } else if (iT == 8 || iT == 12) {
                    W('\'');
                } else if (iT == 9 || iT == 13) {
                    W('\"');
                } else if (iT == 16) {
                    this.f4259e += this.f4265k;
                }
                this.f4263i = 0;
            }
            i4++;
            this.f4263i = 0;
        } while (i4 != 0);
        int[] iArr = this.f4270p;
        int i7 = this.f4268n;
        int i8 = i7 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f4269o[i7 - 1] = "null";
    }

    public final void Z(String str) throws d {
        throw new d(str + I());
    }

    public void a() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 3) {
            U(1);
            this.f4270p[this.f4268n - 1] = 0;
            this.f4263i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + defpackage.a.s(T()) + I());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4263i = 0;
        this.f4267m[0] = 8;
        this.f4268n = 1;
        this.f4256b.close();
    }

    public void e() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT == 1) {
            U(3);
            this.f4263i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + defpackage.a.s(T()) + I());
        }
    }

    public final void h() throws d {
        if (this.f4257c) {
            return;
        }
        Z("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0190  */
    /* JADX WARN: Code duplicated, block: B:125:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1 A[PHI: r2 r4
      0x01a1: PHI (r2v46 int) = (r2v45 int), (r2v48 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x0188, B:125:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x0216  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:183:0x0239 A[DONT_INVERT, PHI: r1
      0x0239: PHI (r1v65 int) = (r1v64 int), (r1v68 int) binds: [B:169:0x0214, B:175:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023b  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0264  */
    /* JADX WARN: Code duplicated, block: B:202:0x0269  */
    /* JADX WARN: Code duplicated, block: B:207:0x0279 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x027a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0284  */
    /* JADX WARN: Code duplicated, block: B:212:0x028c  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:231:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:275:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    public final int t() {
        int iO;
        int i4;
        int iO2;
        int i5;
        String str;
        String str2;
        int i6;
        char c5;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        char c6;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f4267m;
        int i15 = 1;
        int i16 = this.f4268n - 1;
        int i17 = iArr[i16];
        char[] cArr = this.f4258d;
        if (i17 == 1) {
            iArr[i16] = 2;
        } else if (i17 == 2) {
            int iO3 = O(true);
            if (iO3 != 44) {
                if (iO3 != 59) {
                    if (iO3 == 93) {
                        this.f4263i = 4;
                        return 4;
                    }
                    Z("Unterminated array");
                    throw null;
                }
                h();
            }
        } else {
            if (i17 == 3 || i17 == 5) {
                iArr[i16] = 4;
                if (i17 == 5 && (iO = O(true)) != 44) {
                    if (iO != 59) {
                        if (iO == 125) {
                            this.f4263i = 2;
                            return 2;
                        }
                        Z("Unterminated object");
                        throw null;
                    }
                    h();
                }
                int iO4 = O(true);
                if (iO4 == 34) {
                    this.f4263i = 13;
                    return 13;
                }
                if (iO4 == 39) {
                    h();
                    this.f4263i = 12;
                    return 12;
                }
                if (iO4 == 125) {
                    if (i17 != 5) {
                        this.f4263i = 2;
                        return 2;
                    }
                    Z("Expected name");
                    throw null;
                }
                h();
                this.f4259e--;
                if (H((char) iO4)) {
                    this.f4263i = 14;
                    return 14;
                }
                Z("Expected name");
                throw null;
            }
            if (i17 != 4) {
                if (i17 == 6) {
                    if (this.f4257c) {
                        O(true);
                        int i18 = this.f4259e;
                        int i19 = i18 - 1;
                        this.f4259e = i19;
                        if ((i18 + 4 <= this.f4260f || C(5)) && cArr[i19] == ')' && cArr[i18] == ']' && cArr[i18 + 1] == '}' && cArr[i18 + 2] == '\'' && cArr[i18 + 3] == '\n') {
                            this.f4259e += 5;
                        }
                    }
                    this.f4267m[this.f4268n - 1] = 7;
                } else if (i17 == 7) {
                    i4 = 0;
                    if (O(false) == -1) {
                        this.f4263i = 17;
                        return 17;
                    }
                    h();
                    this.f4259e--;
                } else {
                    i4 = 0;
                    if (i17 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iO2 = O(true);
                if (iO2 != 34) {
                    this.f4263i = 9;
                    return 9;
                }
                if (iO2 != 39) {
                    h();
                    this.f4263i = 8;
                    return 8;
                }
                if (iO2 != 44 || iO2 == 59) {
                    i5 = 1;
                } else {
                    if (iO2 == 91) {
                        this.f4263i = 3;
                        return 3;
                    }
                    if (iO2 != 93) {
                        if (iO2 == 123) {
                            this.f4263i = 1;
                            return 1;
                        }
                        int i20 = this.f4259e - 1;
                        this.f4259e = i20;
                        char c7 = cArr[i20];
                        if (c7 == 't' || c7 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i6 = 5;
                        } else {
                            if (c7 != 'f' && c7 != 'F') {
                                if (c7 != 'n' && c7 != 'N') {
                                    i6 = i4;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i6 = 7;
                                if (i6 != 0) {
                                    return i6;
                                }
                                i7 = this.f4259e;
                                i8 = this.f4260f;
                                i9 = i4;
                                i10 = i9;
                                int i21 = i10;
                                z4 = true;
                                long j4 = 0;
                                while (true) {
                                    if (i7 + i10 != i8) {
                                        c6 = cArr[i7 + i10];
                                        if (c6 != '+') {
                                            if (c6 != 'E' || c6 == 'e') {
                                                i11 = i8;
                                                i12 = 6;
                                                if (i9 != 2 || i9 == 4) {
                                                    i9 = 5;
                                                    i10++;
                                                    i8 = i11;
                                                    i15 = 1;
                                                }
                                            } else if (c6 == '-') {
                                                i11 = i8;
                                                i12 = 6;
                                                if (i9 == 0) {
                                                    i9 = 1;
                                                    i21 = 1;
                                                } else {
                                                    if (i9 != 5) {
                                                    }
                                                    i9 = i12;
                                                }
                                                i10++;
                                                i8 = i11;
                                                i15 = 1;
                                            } else if (c6 == '.') {
                                                i11 = i8;
                                                i12 = 6;
                                                if (i9 == 2) {
                                                    i9 = 3;
                                                    i10++;
                                                    i8 = i11;
                                                    i15 = 1;
                                                }
                                            } else if (c6 >= '0' && c6 <= '9') {
                                                if (i9 == i15 || i9 == 0) {
                                                    i11 = i8;
                                                    i12 = 6;
                                                    j4 = -(c6 - '0');
                                                    i9 = 2;
                                                } else if (i9 != 2) {
                                                    i11 = i8;
                                                    if (i9 == 3) {
                                                        i12 = 6;
                                                        i9 = 4;
                                                    } else {
                                                        i12 = 6;
                                                        if (i9 == 5 || i9 == 6) {
                                                            i9 = 7;
                                                        }
                                                    }
                                                } else if (j4 != 0) {
                                                    i11 = i8;
                                                    long j5 = (10 * j4) - ((long) (c6 - '0'));
                                                    z4 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                                    j4 = j5;
                                                    i12 = 6;
                                                }
                                                i10++;
                                                i8 = i11;
                                                i15 = 1;
                                            } else if (!H(c6)) {
                                                i14 = 2;
                                                if (i9 != 2) {
                                                    if (i9 != i14 || i9 == 4 || i9 == 7) {
                                                        this.f4265k = i10;
                                                        i13 = 16;
                                                        this.f4263i = 16;
                                                    }
                                                } else if (z4 || ((j4 == Long.MIN_VALUE && i21 == 0) || (j4 == 0 && i21 != 0))) {
                                                    i14 = 2;
                                                    if (i9 != i14) {
                                                    }
                                                    this.f4265k = i10;
                                                    i13 = 16;
                                                    this.f4263i = 16;
                                                } else {
                                                    if (i21 == 0) {
                                                        j4 = -j4;
                                                    }
                                                    this.f4264j = j4;
                                                    this.f4259e += i10;
                                                    i13 = 15;
                                                    this.f4263i = 15;
                                                }
                                            }
                                            if (i13 != 0) {
                                                return i13;
                                            }
                                            if (H(cArr[this.f4259e])) {
                                                Z("Expected value");
                                                throw null;
                                            }
                                            h();
                                            this.f4263i = 10;
                                            return 10;
                                        }
                                        i11 = i8;
                                        i12 = 6;
                                        if (i9 != 5) {
                                        }
                                        i9 = i12;
                                        i10++;
                                        i8 = i11;
                                        i15 = 1;
                                    } else if (i10 != cArr.length) {
                                        if (!C(i10 + 1)) {
                                            int i22 = this.f4259e;
                                            i8 = this.f4260f;
                                            i7 = i22;
                                            c6 = cArr[i7 + i10];
                                            if (c6 != '+') {
                                                if (c6 != 'E') {
                                                    i11 = i8;
                                                    i12 = 6;
                                                    if (i9 != 2) {
                                                    }
                                                    i9 = 5;
                                                    i10++;
                                                    i8 = i11;
                                                    i15 = 1;
                                                } else {
                                                    i11 = i8;
                                                    i12 = 6;
                                                    if (i9 != 2) {
                                                    }
                                                    i9 = 5;
                                                    i10++;
                                                    i8 = i11;
                                                    i15 = 1;
                                                }
                                                if (i13 != 0) {
                                                    return i13;
                                                }
                                                if (H(cArr[this.f4259e])) {
                                                    Z("Expected value");
                                                    throw null;
                                                }
                                                h();
                                                this.f4263i = 10;
                                                return 10;
                                            }
                                            i11 = i8;
                                            i12 = 6;
                                            if (i9 != 5) {
                                            }
                                            i9 = i12;
                                            i10++;
                                            i8 = i11;
                                            i15 = 1;
                                        }
                                        i14 = 2;
                                        if (i9 != 2) {
                                            if (i9 != i14) {
                                            }
                                            this.f4265k = i10;
                                            i13 = 16;
                                            this.f4263i = 16;
                                        } else {
                                            if (z4) {
                                            }
                                            i14 = 2;
                                            if (i9 != i14) {
                                            }
                                            this.f4265k = i10;
                                            i13 = 16;
                                            this.f4263i = 16;
                                        }
                                        if (i13 != 0) {
                                            return i13;
                                        }
                                        if (H(cArr[this.f4259e])) {
                                            Z("Expected value");
                                            throw null;
                                        }
                                        h();
                                        this.f4263i = 10;
                                        return 10;
                                    }
                                    i13 = 0;
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (H(cArr[this.f4259e])) {
                                        Z("Expected value");
                                        throw null;
                                    }
                                    h();
                                    this.f4263i = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i6 = 6;
                        }
                        int length = str.length();
                        int i23 = 1;
                        while (true) {
                            if (i23 >= length) {
                                if ((this.f4259e + length >= this.f4260f && !C(length + 1)) || !H(cArr[this.f4259e + length])) {
                                    this.f4259e += length;
                                    this.f4263i = i6;
                                    break;
                                }
                                break;
                            }
                            if ((this.f4259e + i23 < this.f4260f || C(i23 + 1)) && ((c5 = cArr[this.f4259e + i23]) == str.charAt(i23) || c5 == str2.charAt(i23))) {
                                i23++;
                            }
                            i6 = i4;
                            break;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        i7 = this.f4259e;
                        i8 = this.f4260f;
                        i9 = i4;
                        i10 = i9;
                        int i24 = i10;
                        z4 = true;
                        long j6 = 0;
                        while (true) {
                            if (i7 + i10 != i8) {
                                c6 = cArr[i7 + i10];
                                if (c6 != '+') {
                                    if (c6 != 'E') {
                                        i11 = i8;
                                        i12 = 6;
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                        i8 = i11;
                                        i15 = 1;
                                    } else {
                                        i11 = i8;
                                        i12 = 6;
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                        i8 = i11;
                                        i15 = 1;
                                    }
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (H(cArr[this.f4259e])) {
                                        Z("Expected value");
                                        throw null;
                                    }
                                    h();
                                    this.f4263i = 10;
                                    return 10;
                                }
                                i11 = i8;
                                i12 = 6;
                                if (i9 != 5) {
                                }
                                i9 = i12;
                                i10++;
                                i8 = i11;
                                i15 = 1;
                            } else if (i10 != cArr.length) {
                                if (!C(i10 + 1)) {
                                    int i25 = this.f4259e;
                                    i8 = this.f4260f;
                                    i7 = i25;
                                    c6 = cArr[i7 + i10];
                                    if (c6 != '+') {
                                        if (c6 != 'E') {
                                            i11 = i8;
                                            i12 = 6;
                                            if (i9 != 2) {
                                            }
                                            i9 = 5;
                                            i10++;
                                            i8 = i11;
                                            i15 = 1;
                                        } else {
                                            i11 = i8;
                                            i12 = 6;
                                            if (i9 != 2) {
                                            }
                                            i9 = 5;
                                            i10++;
                                            i8 = i11;
                                            i15 = 1;
                                        }
                                        if (i13 != 0) {
                                            return i13;
                                        }
                                        if (H(cArr[this.f4259e])) {
                                            Z("Expected value");
                                            throw null;
                                        }
                                        h();
                                        this.f4263i = 10;
                                        return 10;
                                    }
                                    i11 = i8;
                                    i12 = 6;
                                    if (i9 != 5) {
                                    }
                                    i9 = i12;
                                    i10++;
                                    i8 = i11;
                                    i15 = 1;
                                }
                                i14 = 2;
                                if (i9 != 2) {
                                    if (i9 != i14) {
                                    }
                                    this.f4265k = i10;
                                    i13 = 16;
                                    this.f4263i = 16;
                                } else {
                                    if (z4) {
                                    }
                                    i14 = 2;
                                    if (i9 != i14) {
                                    }
                                    this.f4265k = i10;
                                    i13 = 16;
                                    this.f4263i = 16;
                                }
                                if (i13 != 0) {
                                    return i13;
                                }
                                if (H(cArr[this.f4259e])) {
                                    Z("Expected value");
                                    throw null;
                                }
                                h();
                                this.f4263i = 10;
                                return 10;
                            }
                            i13 = 0;
                            if (i13 != 0) {
                                return i13;
                            }
                            if (H(cArr[this.f4259e])) {
                                Z("Expected value");
                                throw null;
                            }
                            h();
                            this.f4263i = 10;
                            return 10;
                        }
                    }
                    i5 = 1;
                    if (i17 == 1) {
                        this.f4263i = 4;
                        return 4;
                    }
                }
                if (i17 == i5 && i17 != 2) {
                    Z("Unexpected value");
                    throw null;
                }
                h();
                this.f4259e -= i5;
                this.f4263i = 7;
                return 7;
            }
            iArr[i16] = 5;
            int iO5 = O(true);
            if (iO5 != 58) {
                if (iO5 != 61) {
                    Z("Expected ':'");
                    throw null;
                }
                h();
                if (this.f4259e < this.f4260f || C(1)) {
                    int i26 = this.f4259e;
                    if (cArr[i26] == '>') {
                        this.f4259e = i26 + 1;
                    }
                }
            }
        }
        i4 = 0;
        iO2 = O(true);
        if (iO2 != 34) {
            this.f4263i = 9;
            return 9;
        }
        if (iO2 != 39) {
            h();
            this.f4263i = 8;
            return 8;
        }
        if (iO2 != 44) {
            i5 = 1;
        } else {
            i5 = 1;
        }
        if (i17 == i5) {
        }
        h();
        this.f4259e -= i5;
        this.f4263i = 7;
        return 7;
    }

    public String toString() {
        return getClass().getSimpleName() + I();
    }

    public void x() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + defpackage.a.s(T()) + I());
        }
        int i4 = this.f4268n;
        this.f4268n = i4 - 1;
        int[] iArr = this.f4270p;
        int i5 = i4 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f4263i = 0;
    }

    public void z() {
        int iT = this.f4263i;
        if (iT == 0) {
            iT = t();
        }
        if (iT != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + defpackage.a.s(T()) + I());
        }
        int i4 = this.f4268n;
        int i5 = i4 - 1;
        this.f4268n = i5;
        this.f4269o[i5] = null;
        int[] iArr = this.f4270p;
        int i6 = i4 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f4263i = 0;
    }
}
