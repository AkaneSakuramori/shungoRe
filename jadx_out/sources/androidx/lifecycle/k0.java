package androidx.lifecycle;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends k3.g implements j3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i4, Object obj) {
        super(0);
        this.f960c = i4;
        this.f961d = obj;
    }

    @Override // j3.a
    public final Object a() {
        switch (this.f960c) {
            case 0:
                r0 r0Var = (r0) this.f961d;
                c3.h.b0(r0Var, "<this>");
                t3.p pVar = new t3.p(0);
                k3.n.f3277a.getClass();
                k3.c cVar = new k3.c(m0.class);
                ArrayList arrayList = pVar.f4409a;
                Class clsA = cVar.a();
                c3.h.Y(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new u0.e(clsA));
                u0.e[] eVarArr = (u0.e[]) pVar.f4409a.toArray(new u0.e[0]);
                return (m0) new e.c(r0Var, new u0.c((u0.e[]) Arrays.copyOf(eVarArr, eVarArr.length))).a(m0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 1:
                return b();
            case 2:
                return b();
            default:
                return b();
        }
    }

    public final List b() {
        int i4 = this.f960c;
        Object obj = this.f961d;
        switch (i4) {
            case 1:
                return (List) obj;
            case 2:
                try {
                    return (List) ((j3.a) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return a3.p.f75b;
                }
            default:
                t3.o oVar = ((x3.l) obj).f4992e;
                c3.h.X(oVar);
                List<Certificate> listA = oVar.a();
                ArrayList arrayList = new ArrayList(a3.j.R2(listA));
                for (Certificate certificate : listA) {
                    c3.h.Y(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
