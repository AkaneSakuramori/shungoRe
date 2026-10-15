package t3;

import androidx.lifecycle.k0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f4405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z2.d f4408d;

    public o(f0 f0Var, g gVar, List list, j3.a aVar) {
        c3.h.b0(f0Var, "tlsVersion");
        c3.h.b0(gVar, "cipherSuite");
        c3.h.b0(list, "localCertificates");
        this.f4405a = f0Var;
        this.f4406b = gVar;
        this.f4407c = list;
        this.f4408d = new z2.d(new k0(2, aVar));
    }

    public final List a() {
        return (List) this.f4408d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f4405a == this.f4405a && c3.h.I(oVar.f4406b, this.f4406b) && c3.h.I(oVar.a(), a()) && c3.h.I(oVar.f4407c, this.f4407c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4407c.hashCode() + ((a().hashCode() + ((this.f4406b.hashCode() + ((this.f4405a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(a3.j.R2(listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                c3.h.a0(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4405a);
        sb.append(" cipherSuite=");
        sb.append(this.f4406b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f4407c;
        ArrayList arrayList2 = new ArrayList(a3.j.R2(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                c3.h.a0(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
