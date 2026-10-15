package t3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4320n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4333m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c3.h.b0(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str) {
        this.f4321a = z4;
        this.f4322b = z5;
        this.f4323c = i4;
        this.f4324d = i5;
        this.f4325e = z6;
        this.f4326f = z7;
        this.f4327g = z8;
        this.f4328h = i6;
        this.f4329i = i7;
        this.f4330j = z9;
        this.f4331k = z10;
        this.f4332l = z11;
        this.f4333m = str;
    }

    public final String toString() {
        String str = this.f4333m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4321a) {
            sb.append("no-cache, ");
        }
        if (this.f4322b) {
            sb.append("no-store, ");
        }
        int i4 = this.f4323c;
        if (i4 != -1) {
            sb.append("max-age=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f4324d;
        if (i5 != -1) {
            sb.append("s-maxage=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f4325e) {
            sb.append("private, ");
        }
        if (this.f4326f) {
            sb.append("public, ");
        }
        if (this.f4327g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.f4328h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.f4329i;
        if (i7 != -1) {
            sb.append("min-fresh=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f4330j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4331k) {
            sb.append("no-transform, ");
        }
        if (this.f4332l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
        this.f4333m = string;
        return string;
    }
}
