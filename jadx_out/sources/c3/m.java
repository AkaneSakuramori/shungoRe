package c3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e, e3.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1276c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1277b;
    private volatile Object result;

    public m(e eVar) {
        h.b0(eVar, "delegate");
        d3.a aVar = d3.a.f1766c;
        this.f1277b = eVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        d3.a aVar = d3.a.f1766c;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1276c;
            d3.a aVar2 = d3.a.f1765b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return d3.a.f1765b;
        }
        if (obj == d3.a.f1767d) {
            return d3.a.f1765b;
        }
        if (obj instanceof z2.b) {
            throw ((z2.b) obj).f5506b;
        }
        return obj;
    }

    @Override // c3.e
    public final void b(Object obj) {
        while (true) {
            Object obj2 = this.result;
            d3.a aVar = d3.a.f1766c;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1276c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            d3.a aVar2 = d3.a.f1765b;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1276c;
            d3.a aVar3 = d3.a.f1767d;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f1277b.b(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    @Override // e3.d
    public final e3.d f() {
        e eVar = this.f1277b;
        if (eVar instanceof e3.d) {
            return (e3.d) eVar;
        }
        return null;
    }

    @Override // c3.e
    public final k g() {
        return this.f1277b.g();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f1277b;
    }
}
