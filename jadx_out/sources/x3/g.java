package x3;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import t3.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.b f4965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AtomicInteger f4966c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f4967d;

    public g(j jVar, w2.b bVar) {
        this.f4967d = jVar;
        this.f4965b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t3.l lVar;
        String str = "OkHttp " + ((s) this.f4967d.f4971c.f2808b).g();
        j jVar = this.f4967d;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            jVar.f4975g.h();
            boolean z4 = false;
            try {
                try {
                    try {
                        this.f4965b.b(jVar, jVar.g());
                        lVar = jVar.f4970b.f4453b;
                    } catch (IOException e5) {
                        e = e5;
                        z4 = true;
                        if (z4) {
                            b4.l lVar2 = b4.l.f1135a;
                            b4.l lVar3 = b4.l.f1135a;
                            String str2 = "Callback failure for " + j.a(jVar);
                            lVar3.getClass();
                            b4.l.i(str2, 4, e);
                        } else {
                            this.f4965b.a(jVar, e);
                        }
                        lVar = jVar.f4970b.f4453b;
                    } catch (Throwable th) {
                        th = th;
                        z4 = true;
                        jVar.d();
                        if (!z4) {
                            IOException iOException = new IOException("canceled due to " + th);
                            c3.h.F(iOException, th);
                            this.f4965b.a(jVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    jVar.f4970b.f4453b.b(this);
                    throw th2;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
            lVar.b(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
