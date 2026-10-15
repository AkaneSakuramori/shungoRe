package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3282a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = a.f3278a;

    @Override // kotlinx.coroutines.internal.l
    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        g1.e eVar = a.f3278a;
        if (obj2 == eVar) {
            g1.e eVarC = c(obj);
            obj2 = this._consensus;
            if (obj2 == eVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3282a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, eVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != eVar) {
                        obj2 = this._consensus;
                    }
                }
                obj2 = eVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract g1.e c(Object obj);
}
