package k3;

import androidx.activity.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a implements e, o3.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3269i;

    public f(z zVar) {
        super(zVar, z.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.f3268h = 0;
        this.f3269i = 0;
    }

    public final o3.a c() {
        n.f3277a.getClass();
        return this;
    }

    @Override // k3.e
    public final int d() {
        return this.f3268h;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f3261e.equals(fVar.f3261e) && this.f3262f.equals(fVar.f3262f) && this.f3269i == fVar.f3269i && this.f3268h == fVar.f3268h && c3.h.I(this.f3259c, fVar.f3259c) && c3.h.I(b(), fVar.b());
        }
        if (!(obj instanceof o3.c)) {
            return false;
        }
        o3.a aVar = this.f3258b;
        if (aVar == null) {
            c();
            this.f3258b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f3262f.hashCode() + ((this.f3261e.hashCode() + (b() == null ? 0 : b().hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        o3.a aVar = this.f3258b;
        if (aVar == null) {
            c();
            this.f3258b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f3261e;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : defpackage.a.g("function ", str, " (Kotlin reflection is not available)");
    }
}
