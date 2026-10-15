package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3302d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g1.e f3298g = new g1.e("REMOVE_FROZEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3296e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3297f = AtomicLongFieldUpdater.newUpdater(i.class, "_state");

    public i(int i4, boolean z4) {
        this.f3299a = i4;
        this.f3300b = z4;
        int i5 = i4 - 1;
        this.f3301c = i5;
        this.f3302d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        while (true) {
            long j4 = this._state;
            if ((3458764513820540928L & j4) != 0) {
                return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f3301c;
            if (((i5 + 2) & i6) == (i4 & i6)) {
                return 1;
            }
            if (!this.f3300b && this.f3302d.get(i5 & i6) != null) {
                int i7 = this.f3299a;
                if (i7 < 1024 || ((i5 - i4) & 1073741823) > (i7 >> 1)) {
                    return 1;
                }
            } else if (f3297f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((long) ((i5 + 1) & 1073741823)) << 30))) {
                this.f3302d.set(i5 & i6, obj);
                i iVarE = this;
                while ((iVarE._state & 1152921504606846976L) != 0) {
                    iVarE = iVarE.e();
                    AtomicReferenceArray atomicReferenceArray = iVarE.f3302d;
                    int i8 = iVarE.f3301c & i5;
                    Object obj2 = atomicReferenceArray.get(i8);
                    if ((obj2 instanceof h) && ((h) obj2).f3295a == i5) {
                        atomicReferenceArray.set(i8, obj);
                    } else {
                        iVarE = null;
                    }
                    if (iVarE == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!f3297f.compareAndSet(this, j4, j4 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j4 = this._state;
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final boolean d() {
        long j4 = this._state;
        return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
    }

    public final i e() {
        long j4;
        while (true) {
            j4 = this._state;
            if ((j4 & 1152921504606846976L) != 0) {
                break;
            }
            long j5 = j4 | 1152921504606846976L;
            if (f3297f.compareAndSet(this, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            i iVar = (i) this._next;
            if (iVar != null) {
                return iVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3296e;
            i iVar2 = new i(this.f3299a * 2, this.f3300b);
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = this.f3301c;
                int i7 = i4 & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object hVar = this.f3302d.get(i7);
                if (hVar == null) {
                    hVar = new h(i4);
                }
                iVar2.f3302d.set(iVar2.f3301c & i4, hVar);
                i4++;
            }
            iVar2._state = (-1152921504606846977L) & j4;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j4 = this._state;
            if ((j4 & 1152921504606846976L) != 0) {
                return f3298g;
            }
            int i4 = (int) (j4 & 1073741823);
            int i5 = this.f3301c;
            int i6 = ((int) ((1152921503533105152L & j4) >> 30)) & i5;
            int i7 = i5 & i4;
            if (i6 == i7) {
                return null;
            }
            Object obj = this.f3302d.get(i7);
            if (obj == null) {
                if (this.f3300b) {
                    return null;
                }
            } else {
                if (obj instanceof h) {
                    return null;
                }
                long j5 = (i4 + 1) & 1073741823;
                if (f3297f.compareAndSet(this, j4, (j4 & (-1073741824)) | j5)) {
                    this.f3302d.set(this.f3301c & i4, null);
                    return obj;
                }
                if (this.f3300b) {
                    i iVarE = this;
                    while (true) {
                        long j6 = iVarE._state;
                        int i8 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            iVarE = iVarE.e();
                        } else {
                            if (f3297f.compareAndSet(iVarE, j6, (j6 & (-1073741824)) | j5)) {
                                iVarE.f3302d.set(iVarE.f3301c & i8, null);
                                iVarE = null;
                            } else {
                                continue;
                            }
                        }
                        if (iVarE == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
