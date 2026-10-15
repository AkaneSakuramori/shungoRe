package t3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k3.g implements j3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Object obj, Object obj2, int i4) {
        super(0);
        this.f4338c = i4;
        this.f4339d = fVar;
        this.f4340e = obj;
        this.f4341f = obj2;
    }

    @Override // j3.a
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f4338c) {
            case 0:
                break;
        }
        return b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    public final List b() {
        List<Certificate> listI0;
        int i4 = this.f4338c;
        Object obj = this.f4341f;
        Object obj2 = this.f4340e;
        f fVar = this.f4339d;
        switch (i4) {
            case 0:
                c3.h hVar = fVar.f4347b;
                if (hVar != null) {
                    listI0 = hVar.i0((String) obj, (List) obj2);
                    if (listI0 == null) {
                        listI0 = (List) obj2;
                    }
                } else {
                    listI0 = (List) obj2;
                }
                ArrayList arrayList = new ArrayList(a3.j.R2(listI0));
                for (Certificate certificate : listI0) {
                    c3.h.Y(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                c3.h hVar2 = fVar.f4347b;
                c3.h.X(hVar2);
                return hVar2.i0(((a) obj).f4290i.f4423d, ((o) obj2).a());
        }
    }
}
