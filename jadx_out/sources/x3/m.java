package x3;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3.c f5007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.b f5008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5009e;

    public m(w3.f fVar, TimeUnit timeUnit) {
        c3.h.b0(fVar, "taskRunner");
        this.f5005a = 5;
        this.f5006b = timeUnit.toNanos(5L);
        this.f5007c = fVar.f();
        this.f5008d = new w3.b(this, defpackage.a.h(new StringBuilder(), u3.b.f4767g, " ConnectionPool"));
        this.f5009e = new ConcurrentLinkedQueue();
    }

    public final boolean a(t3.a aVar, j jVar, List list, boolean z4) {
        c3.h.b0(aVar, "address");
        c3.h.b0(jVar, "call");
        for (l lVar : this.f5009e) {
            c3.h.a0(lVar, "connection");
            synchronized (lVar) {
                if (z4) {
                    if (lVar.f4994g == null) {
                        continue;
                    }
                }
                if (lVar.h(aVar, list)) {
                    jVar.b(lVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(l lVar, long j4) {
        byte[] bArr = u3.b.f4761a;
        ArrayList arrayList = lVar.f5003p;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                String str = "A connection to " + lVar.f4989b.f4342a.f4290i + " was leaked. Did you forget to close a response body?";
                b4.l lVar2 = b4.l.f1135a;
                b4.l.f1135a.k(((h) reference).f4968a, str);
                arrayList.remove(i4);
                lVar.f4997j = true;
                if (arrayList.isEmpty()) {
                    lVar.f5004q = j4 - this.f5006b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
