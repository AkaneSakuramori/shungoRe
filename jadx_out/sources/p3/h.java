package p3;

import j3.l;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f3874b;

    public h(q3.c cVar, a3.a aVar) {
        this.f3873a = cVar;
        this.f3874b = aVar;
    }

    @Override // p3.c
    public final Iterator iterator() {
        return new g(this);
    }
}
