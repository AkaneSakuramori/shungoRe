package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f602j;

    public g(h hVar) {
        this.f602j = hVar;
    }

    @Override // c3.h
    public final void E1(Throwable th) {
        ((m) this.f602j.f1896c).d(th);
    }

    @Override // c3.h
    public final void K1(g.h hVar) {
        h hVar2 = this.f602j;
        hVar2.f604e = hVar;
        g.h hVar3 = hVar2.f604e;
        f2.e eVar = new f2.e(13);
        Object obj = hVar2.f1896c;
        f fVar = ((m) obj).f617h;
        ((m) obj).getClass();
        hVar2.f603d = new s(hVar3, eVar, fVar);
        ((m) hVar2.f1896c).e();
    }
}
