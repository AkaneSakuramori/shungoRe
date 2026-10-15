package t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f4380f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f4383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f4384d;

    static {
        g gVar = g.f4371r;
        g gVar2 = g.f4372s;
        g gVar3 = g.f4373t;
        g gVar4 = g.f4365l;
        g gVar5 = g.f4367n;
        g gVar6 = g.f4366m;
        g gVar7 = g.f4368o;
        g gVar8 = g.f4370q;
        g gVar9 = g.f4369p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f4363j, g.f4364k, g.f4361h, g.f4362i, g.f4359f, g.f4360g, g.f4358e};
        h hVar = new h(true);
        hVar.c((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        f0 f0Var = f0.f4348c;
        f0 f0Var2 = f0.f4349d;
        hVar.f(f0Var, f0Var2);
        hVar.d();
        hVar.a();
        h hVar2 = new h(true);
        hVar2.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar2.f(f0Var, f0Var2);
        hVar2.d();
        f4379e = hVar2.a();
        h hVar3 = new h(true);
        hVar3.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar3.f(f0Var, f0Var2, f0.f4350e, f0.f4351f);
        hVar3.d();
        hVar3.a();
        f4380f = new h(false).a();
    }

    public i(boolean z4, boolean z5, String[] strArr, String[] strArr2) {
        this.f4381a = z4;
        this.f4382b = z5;
        this.f4383c = strArr;
        this.f4384d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f4383c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f4355b.m(str));
        }
        return a3.n.j3(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4381a) {
            return false;
        }
        String[] strArr = this.f4384d;
        if (strArr != null && !u3.b.i(strArr, sSLSocket.getEnabledProtocols(), b3.a.f1105a)) {
            return false;
        }
        String[] strArr2 = this.f4383c;
        return strArr2 == null || u3.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), g.f4356c);
    }

    public final List c() {
        String[] strArr = this.f4384d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f2.e.o(str));
        }
        return a3.n.j3(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z4 = iVar.f4381a;
        boolean z5 = this.f4381a;
        if (z5 != z4) {
            return false;
        }
        return !z5 || (Arrays.equals(this.f4383c, iVar.f4383c) && Arrays.equals(this.f4384d, iVar.f4384d) && this.f4382b == iVar.f4382b);
    }

    public final int hashCode() {
        if (!this.f4381a) {
            return 17;
        }
        String[] strArr = this.f4383c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f4384d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4382b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4381a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4382b + ')';
    }
}
