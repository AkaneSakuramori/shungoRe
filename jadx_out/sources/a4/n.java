package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f167c;

    public n(t tVar, w wVar) {
        this.f167c = tVar;
        this.f166b = wVar;
    }

    @Override // j3.a
    public final Object a() throws Throwable {
        b bVar;
        t tVar = this.f167c;
        w wVar = this.f166b;
        b bVar2 = b.f81e;
        IOException e5 = null;
        try {
            try {
                wVar.e(this);
                while (wVar.a(false, this)) {
                }
                bVar = b.f79c;
                try {
                    bVar2 = b.f84h;
                    tVar.a(bVar, bVar2, null);
                } catch (IOException e6) {
                    e5 = e6;
                    bVar2 = b.f80d;
                    tVar.a(bVar2, bVar2, e5);
                }
            } catch (Throwable th) {
                th = th;
                tVar.a(bVar, bVar2, e5);
                u3.b.c(wVar);
                throw th;
            }
        } catch (IOException e7) {
            e5 = e7;
            bVar = bVar2;
        } catch (Throwable th2) {
            th = th2;
            bVar = bVar2;
            tVar.a(bVar, bVar2, e5);
            u3.b.c(wVar);
            throw th;
        }
        u3.b.c(wVar);
        return z2.f.f5511a;
    }
}
