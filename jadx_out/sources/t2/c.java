package t2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f4271k = new String[128];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f4272l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Writer f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4281j;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f4271k[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f4271k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4272l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f4274c = iArr;
        this.f4275d = 0;
        if (iArr.length == 0) {
            this.f4274c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4274c;
        int i4 = this.f4275d;
        this.f4275d = i4 + 1;
        iArr2[i4] = 6;
        this.f4277f = ":";
        this.f4281j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f4273b = writer;
    }

    public void C(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f4280i != null) {
            throw new IllegalStateException();
        }
        if (this.f4275d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4280i = str;
    }

    public final void F() throws IOException {
        if (this.f4276e == null) {
            return;
        }
        Writer writer = this.f4273b;
        writer.write(10);
        int i4 = this.f4275d;
        for (int i5 = 1; i5 < i4; i5++) {
            writer.write(this.f4276e);
        }
    }

    public c G() throws IOException {
        if (this.f4280i != null) {
            if (!this.f4281j) {
                this.f4280i = null;
                return this;
            }
            O();
        }
        a();
        this.f4273b.write("null");
        return this;
    }

    public final int H() {
        int i4 = this.f4275d;
        if (i4 != 0) {
            return this.f4274c[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void I(String str) throws IOException {
        String str2;
        String[] strArr = this.f4279h ? f4272l : f4271k;
        Writer writer = this.f4273b;
        writer.write(34);
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i4 < i5) {
                        writer.write(str, i4, i5 - i4);
                    }
                    writer.write(str2);
                    i4 = i5 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i5) {
                    writer.write(str, i4, i5 - i4);
                }
                writer.write(str2);
                i4 = i5 + 1;
            }
        }
        if (i4 < length) {
            writer.write(str, i4, length - i4);
        }
        writer.write(34);
    }

    public void J(long j4) throws IOException {
        O();
        a();
        this.f4273b.write(Long.toString(j4));
    }

    public void K(Boolean bool) throws IOException {
        if (bool == null) {
            G();
            return;
        }
        O();
        a();
        this.f4273b.write(bool.booleanValue() ? "true" : "false");
    }

    public void L(Number number) throws IOException {
        if (number == null) {
            G();
            return;
        }
        O();
        String string = number.toString();
        if (this.f4278g || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            a();
            this.f4273b.append((CharSequence) string);
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
    }

    public void M(String str) throws IOException {
        if (str == null) {
            G();
            return;
        }
        O();
        a();
        I(str);
    }

    public void N(boolean z4) throws IOException {
        O();
        a();
        this.f4273b.write(z4 ? "true" : "false");
    }

    public final void O() throws IOException {
        if (this.f4280i != null) {
            int iH = H();
            if (iH == 5) {
                this.f4273b.write(44);
            } else if (iH != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            F();
            this.f4274c[this.f4275d - 1] = 4;
            I(this.f4280i);
            this.f4280i = null;
        }
    }

    public final void a() throws IOException {
        int iH = H();
        if (iH == 1) {
            this.f4274c[this.f4275d - 1] = 2;
            F();
            return;
        }
        Writer writer = this.f4273b;
        if (iH == 2) {
            writer.append(',');
            F();
        } else {
            if (iH == 4) {
                writer.append((CharSequence) this.f4277f);
                this.f4274c[this.f4275d - 1] = 5;
                return;
            }
            if (iH != 6) {
                if (iH != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f4278g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f4274c[this.f4275d - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4273b.close();
        int i4 = this.f4275d;
        if (i4 > 1 || (i4 == 1 && this.f4274c[i4 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4275d = 0;
    }

    public void e() throws IOException {
        O();
        a();
        int i4 = this.f4275d;
        int[] iArr = this.f4274c;
        if (i4 == iArr.length) {
            this.f4274c = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f4274c;
        int i5 = this.f4275d;
        this.f4275d = i5 + 1;
        iArr2[i5] = 1;
        this.f4273b.write(91);
    }

    public void flush() throws IOException {
        if (this.f4275d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4273b.flush();
    }

    public void h() throws IOException {
        O();
        a();
        int i4 = this.f4275d;
        int[] iArr = this.f4274c;
        if (i4 == iArr.length) {
            this.f4274c = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.f4274c;
        int i5 = this.f4275d;
        this.f4275d = i5 + 1;
        iArr2[i5] = 3;
        this.f4273b.write(123);
    }

    public final void t(int i4, int i5, char c5) throws IOException {
        int iH = H();
        if (iH != i5 && iH != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4280i != null) {
            throw new IllegalStateException("Dangling name: " + this.f4280i);
        }
        this.f4275d--;
        if (iH == i5) {
            F();
        }
        this.f4273b.write(c5);
    }

    public void x() throws IOException {
        t(1, 2, ']');
    }

    public void z() throws IOException {
        t(3, 5, '}');
    }
}
