package m2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f3450b;

    public /* synthetic */ k(b0 b0Var, int i4) {
        this.f3449a = i4;
        this.f3450b = b0Var;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        int i4 = this.f3449a;
        b0 b0Var = this.f3450b;
        switch (i4) {
            case 0:
                return new AtomicLong(((Number) b0Var.b(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.G()) {
                    arrayList.add(Long.valueOf(((Number) b0Var.b(bVar)).longValue()));
                }
                bVar.x();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.T() != 9) {
                    return b0Var.b(bVar);
                }
                bVar.P();
                return null;
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        int i4 = this.f3449a;
        b0 b0Var = this.f3450b;
        switch (i4) {
            case 0:
                b0Var.c(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.e();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    b0Var.c(cVar, Long.valueOf(atomicLongArray.get(i5)));
                }
                cVar.x();
                break;
            default:
                if (obj == null) {
                    cVar.G();
                } else {
                    b0Var.c(cVar, obj);
                }
                break;
        }
    }
}
