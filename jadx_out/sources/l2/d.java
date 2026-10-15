package l2;

import i2.w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m.f f3383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f3384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3385f;

    public /* synthetic */ d(g gVar, m.f fVar) {
        this.f3381b = 0;
        this.f3382c = gVar;
        this.f3383d = fVar;
        this.f3385f = null;
        this.f3384e = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f3381b;
        Runnable runnable = this.f3384e;
        m.f fVar = this.f3383d;
        g gVar = this.f3382c;
        Object obj = this.f3385f;
        switch (i4) {
            case 0:
                defpackage.a.n(obj);
                if (gVar.f3395f == null) {
                    throw new IllegalStateException("mSession is null in launchWhenSessionEstablished");
                }
                gVar.b(fVar, runnable);
                return;
            default:
                ((w) ((e) obj)).a(gVar.f3390a, fVar, gVar.f3391b, runnable);
                return;
        }
    }

    public /* synthetic */ d(g gVar, m.f fVar, int i4) {
        w wVar = g.f3389i;
        this.f3381b = 1;
        this.f3382c = gVar;
        this.f3385f = wVar;
        this.f3383d = fVar;
        this.f3384e = null;
    }
}
