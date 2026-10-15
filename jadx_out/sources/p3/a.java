package p3;

import a3.m;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f3867a;

    public a(m mVar) {
        this.f3867a = new AtomicReference(mVar);
    }

    @Override // p3.c
    public final Iterator iterator() {
        c cVar = (c) this.f3867a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
