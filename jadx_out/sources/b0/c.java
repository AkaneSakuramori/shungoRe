package b0;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f1080e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1084d;

    public c(int i4, int i5, int i6, int i7) {
        this.f1081a = i4;
        this.f1082b = i5;
        this.f1083c = i6;
        this.f1084d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f1081a, cVar2.f1081a), Math.max(cVar.f1082b, cVar2.f1082b), Math.max(cVar.f1083c, cVar2.f1083c), Math.max(cVar.f1084d, cVar2.f1084d));
    }

    public static c b(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f1080e : new c(i4, i5, i6, i7);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f1081a, this.f1082b, this.f1083c, this.f1084d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1084d == cVar.f1084d && this.f1081a == cVar.f1081a && this.f1083c == cVar.f1083c && this.f1082b == cVar.f1082b;
    }

    public final int hashCode() {
        return (((((this.f1081a * 31) + this.f1082b) * 31) + this.f1083c) * 31) + this.f1084d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1081a + ", top=" + this.f1082b + ", right=" + this.f1083c + ", bottom=" + this.f1084d + '}';
    }
}
