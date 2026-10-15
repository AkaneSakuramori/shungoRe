package f4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f2197a = new r(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f2199c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2198b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i4 = 0; i4 < iHighestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f2199c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        if (rVar.f2195f != null || rVar.f2196g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (rVar.f2193d) {
            return;
        }
        AtomicReference atomicReference = f2199c[(int) (Thread.currentThread().getId() & (((long) f2198b) - 1))];
        r rVar2 = f2197a;
        r rVar3 = (r) atomicReference.getAndSet(rVar2);
        if (rVar3 == rVar2) {
            return;
        }
        int i4 = rVar3 != null ? rVar3.f2192c : 0;
        if (i4 >= 65536) {
            atomicReference.set(rVar3);
            return;
        }
        rVar.f2195f = rVar3;
        rVar.f2191b = 0;
        rVar.f2192c = i4 + 8192;
        atomicReference.set(rVar);
    }

    public static final r b() {
        AtomicReference atomicReference = f2199c[(int) (Thread.currentThread().getId() & (((long) f2198b) - 1))];
        r rVar = f2197a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f2195f);
        rVar2.f2195f = null;
        rVar2.f2192c = 0;
        return rVar2;
    }
}
