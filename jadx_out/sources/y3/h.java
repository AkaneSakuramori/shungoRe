package y3;

import t3.x;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5427c;

    public h(x xVar, int i4, String str) {
        this.f5425a = xVar;
        this.f5426b = i4;
        this.f5427c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f5425a == x.f4478c) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f5426b);
        sb.append(' ');
        sb.append(this.f5427c);
        String string = sb.toString();
        c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
