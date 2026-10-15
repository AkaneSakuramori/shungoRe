package f0;

import i.a0;
import java.util.ArrayList;
import n.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2010b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f2009a = i4;
        this.f2010b = obj;
    }

    public final void a(f fVar) {
        switch (this.f2009a) {
            case 0:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((a0) this.f2010b).v(fVar);
                return;
            default:
                synchronized (g.f2015c) {
                    try {
                        k kVar = g.f2016d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f2010b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f2010b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((e) ((h0.a) arrayList.get(i4))).b(fVar);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f2009a) {
            case 0:
                a((f) obj);
                break;
            default:
                a((f) obj);
                break;
        }
    }
}
