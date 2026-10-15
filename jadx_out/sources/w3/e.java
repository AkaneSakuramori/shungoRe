package w3;

import c3.h;
import java.util.logging.Level;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4912b;

    public e(f fVar) {
        this.f4912b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVarC;
        long jNanoTime;
        while (true) {
            f fVar = this.f4912b;
            synchronized (fVar) {
                aVarC = fVar.c();
            }
            if (aVarC == null) {
                return;
            }
            c cVar = aVarC.f4901c;
            h.X(cVar);
            f fVar2 = this.f4912b;
            boolean zIsLoggable = f.f4913h.w().isLoggable(Level.FINE);
            if (zIsLoggable) {
                cVar.f4905a.f4916a.getClass();
                jNanoTime = System.nanoTime();
                q.a(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                f.a(fVar2, aVarC);
                if (zIsLoggable) {
                    cVar.f4905a.f4916a.getClass();
                    q.a(aVarC, cVar, "finished run in ".concat(q.e(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    d dVar = fVar2.f4916a;
                    dVar.getClass();
                    dVar.f4911a.execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        cVar.f4905a.f4916a.getClass();
                        q.a(aVarC, cVar, "failed a run in ".concat(q.e(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
