package t3;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    f4478c("http/1.0"),
    f4479d("http/1.1"),
    f4480e("spdy/3.1"),
    f4481f("h2"),
    f4482g("h2_prior_knowledge"),
    f4483h("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4485b;

    x(String str) {
        this.f4485b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4485b;
    }
}
