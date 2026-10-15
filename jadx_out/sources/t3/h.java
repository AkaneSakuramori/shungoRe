package t3;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f4376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f4377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4378d;

    public h(boolean z4) {
        this.f4375a = z4;
    }

    public final i a() {
        return new i(this.f4375a, this.f4378d, this.f4376b, this.f4377c);
    }

    public final void b(String... strArr) {
        c3.h.b0(strArr, "cipherSuites");
        if (!this.f4375a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.f4376b = (String[]) strArr.clone();
    }

    public final void c(g... gVarArr) {
        c3.h.b0(gVarArr, "cipherSuites");
        if (!this.f4375a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g gVar : gVarArr) {
            arrayList.add(gVar.f4374a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d() {
        if (!this.f4375a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.f4378d = true;
    }

    public final void e(String... strArr) {
        c3.h.b0(strArr, "tlsVersions");
        if (!this.f4375a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.f4377c = (String[]) strArr.clone();
    }

    public final void f(f0... f0VarArr) {
        if (!this.f4375a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(f0VarArr.length);
        for (f0 f0Var : f0VarArr) {
            arrayList.add(f0Var.f4354b);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
