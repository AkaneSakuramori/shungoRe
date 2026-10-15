package w3;

import c3.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f4901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4902d;

    public a(String str, boolean z4) {
        h.b0(str, "name");
        this.f4899a = str;
        this.f4900b = z4;
        this.f4902d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f4899a;
    }
}
