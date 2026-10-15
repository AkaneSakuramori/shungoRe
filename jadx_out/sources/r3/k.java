package r3;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends c3.a implements c3.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4097c;

    static {
        int i4 = 0;
        f4097c = new j(i4, i4);
    }

    public k() {
        super(c3.f.f1265b);
    }

    public boolean C() {
        return !(this instanceof x0);
    }

    @Override // c3.a, c3.k
    public final c3.i e(c3.j jVar) {
        c3.h.b0(jVar, "key");
        if (!(jVar instanceof c3.b)) {
            if (c3.f.f1265b == jVar) {
                return this;
            }
            return null;
        }
        c3.b bVar = (c3.b) jVar;
        c3.j jVar2 = this.f1257b;
        c3.h.b0(jVar2, "key");
        if (jVar2 != bVar && bVar.f1259c != jVar2) {
            return null;
        }
        c3.i iVarA = bVar.a(this);
        if (iVarA instanceof c3.i) {
            return iVarA;
        }
        return null;
    }

    @Override // c3.a, c3.k
    public final c3.k t(c3.j jVar) {
        c3.h.b0(jVar, "key");
        boolean z4 = jVar instanceof c3.b;
        c3.l lVar = c3.l.f1275b;
        if (z4) {
            c3.b bVar = (c3.b) jVar;
            c3.j jVar2 = this.f1257b;
            c3.h.b0(jVar2, "key");
            if ((jVar2 == bVar || bVar.f1259c == jVar2) && bVar.a(this) != null) {
                return lVar;
            }
        } else if (c3.f.f1265b == jVar) {
            return lVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + q.h(this);
    }

    public abstract void z(c3.k kVar, Runnable runnable);
}
