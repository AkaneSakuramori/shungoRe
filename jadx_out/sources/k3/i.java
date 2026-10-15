package k3;

import r3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends a implements o3.d, j3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3272h;

    public i(Object obj) {
        super(obj, q.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f3272h = false;
    }

    @Override // j3.a
    public final Object a() {
        return ((kotlinx.coroutines.internal.e) this).f3259c.getClass().getSimpleName();
    }

    public final o3.a c() {
        if (!this.f3272h) {
            o3.a aVar = this.f3258b;
            if (aVar != null) {
                return aVar;
            }
            e();
            this.f3258b = this;
        }
        return this;
    }

    public final o3.a e() {
        n.f3277a.getClass();
        return this;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return b().equals(iVar.b()) && this.f3261e.equals(iVar.f3261e) && this.f3262f.equals(iVar.f3262f) && c3.h.I(this.f3259c, iVar.f3259c);
        }
        if (obj instanceof o3.d) {
            return obj.equals(c());
        }
        return false;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f3262f.hashCode() + ((this.f3261e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        o3.a aVarC = c();
        return aVarC != this ? aVarC.toString() : defpackage.a.h(new StringBuilder("property "), this.f3261e, " (Kotlin reflection is not available)");
    }
}
