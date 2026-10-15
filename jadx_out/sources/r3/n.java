package r3;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4105a;

    static {
        Iterator itM = defpackage.a.m();
        c3.h.b0(itM, "<this>");
        a3.m mVar = new a3.m(1, itM);
        boolean z4 = mVar instanceof p3.a;
        p3.c aVar = mVar;
        if (!z4) {
            aVar = new p3.a(mVar);
        }
        f4105a = p3.d.Q2(aVar);
    }

    public static final void a(c3.k kVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f4105a.iterator();
        while (it.hasNext()) {
            try {
                ((s3.b) ((m) it.next())).z(kVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    c3.h.F(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            c3.h.F(th, new u(kVar));
        } catch (Throwable th3) {
            c3.h.A0(th3);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
