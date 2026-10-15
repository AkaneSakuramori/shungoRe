package k;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3237b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3238c;

    public d(g gVar) {
        this.f3238c = gVar;
    }

    @Override // k.f
    public final void a(c cVar) {
        c cVar2 = this.f3236a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3235d;
            this.f3236a = cVar3;
            this.f3237b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3237b) {
            return this.f3238c.f3241b != null;
        }
        c cVar = this.f3236a;
        return (cVar == null || cVar.f3234c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3237b) {
            this.f3237b = false;
            this.f3236a = this.f3238c.f3241b;
        } else {
            c cVar = this.f3236a;
            this.f3236a = cVar != null ? cVar.f3234c : null;
        }
        return this.f3236a;
    }
}
