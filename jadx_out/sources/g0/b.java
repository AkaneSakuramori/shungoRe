package g0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f2277e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f2281d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f2277e[i4] = Character.getDirectionality(i4);
        }
    }

    public b(CharSequence charSequence) {
        this.f2278a = charSequence;
        this.f2279b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.f2280c - 1;
        CharSequence charSequence = this.f2278a;
        char cCharAt = charSequence.charAt(i4);
        this.f2281d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f2280c);
            this.f2280c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f2280c--;
        char c5 = this.f2281d;
        return c5 < 1792 ? f2277e[c5] : Character.getDirectionality(c5);
    }
}
