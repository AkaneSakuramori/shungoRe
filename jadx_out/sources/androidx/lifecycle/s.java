package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f980b;

    public final void a(r rVar, l lVar) {
        m mVarA = lVar.a();
        m mVar = this.f979a;
        c3.h.b0(mVar, "state1");
        if (mVarA.compareTo(mVar) < 0) {
            mVar = mVarA;
        }
        this.f979a = mVar;
        this.f980b.b(rVar, lVar);
        this.f979a = mVarA;
    }
}
