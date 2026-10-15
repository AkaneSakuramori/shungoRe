package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3294a = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new i(8, false);

    public final boolean a(Object obj) {
        while (true) {
            i iVar = (i) this._cur;
            int iA = iVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3294a;
                i iVarE = iVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, iVarE) && atomicReferenceFieldUpdater.get(this) == iVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            i iVar = (i) this._cur;
            if (iVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3294a;
            i iVarE = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, iVarE) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }

    public final int c() {
        return ((i) this._cur).c();
    }

    public final Object d() {
        while (true) {
            i iVar = (i) this._cur;
            Object objF = iVar.f();
            if (objF != i.f3298g) {
                return objF;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3294a;
            i iVarE = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, iVarE) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }
}
