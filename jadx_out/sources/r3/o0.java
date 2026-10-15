package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends kotlinx.coroutines.internal.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.internal.f f4107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.internal.f f4108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f4109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4110e;

    public o0(kotlinx.coroutines.internal.f fVar, p0 p0Var, Object obj) {
        this.f4109d = p0Var;
        this.f4110e = obj;
        this.f4107b = fVar;
    }

    @Override // kotlinx.coroutines.internal.b
    public final void b(Object obj, Object obj2) {
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) obj;
        boolean z4 = obj2 == null;
        kotlinx.coroutines.internal.f fVar2 = this.f4107b;
        kotlinx.coroutines.internal.f fVar3 = z4 ? fVar2 : this.f4108c;
        if (fVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.f.f3291b;
            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, this, fVar3)) {
                if (atomicReferenceFieldUpdater.get(fVar) != this) {
                    return;
                }
            }
            if (z4) {
                kotlinx.coroutines.internal.f fVar4 = this.f4108c;
                c3.h.X(fVar4);
                fVar2.g(fVar4);
            }
        }
    }

    @Override // kotlinx.coroutines.internal.b
    public final g1.e c(Object obj) {
        if (this.f4109d.r() == this.f4110e) {
            return null;
        }
        return kotlinx.coroutines.internal.a.f3280c;
    }
}
