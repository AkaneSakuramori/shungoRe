package t3;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4400b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f4401c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4402d = new ArrayDeque();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(x3.g gVar) {
        c3.h.b0(gVar, "call");
        gVar.f4966c.decrementAndGet();
        a(this.f4401c, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[Catch: all -> 0x0099, TryCatch #2 {all -> 0x0099, blocks: (B:22:0x0062, B:24:0x0066, B:27:0x009b), top: B:50:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0066, please report this as an issue */
    public final void c() {
        int size;
        int i4;
        x3.g gVar;
        byte[] bArr = u3.b.f4761a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f4400b.iterator();
                c3.h.a0(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    x3.g gVar2 = (x3.g) it.next();
                    if (this.f4401c.size() >= 64) {
                        break;
                    }
                    if (gVar2.f4966c.get() < 5) {
                        it.remove();
                        gVar2.f4966c.incrementAndGet();
                        arrayList.add(gVar2);
                        this.f4401c.add(gVar2);
                    }
                }
                synchronized (this) {
                    this.f4401c.size();
                    this.f4402d.size();
                }
                size = arrayList.size();
                for (i4 = 0; i4 < size; i4++) {
                    gVar = (x3.g) arrayList.get(i4);
                    synchronized (this) {
                        try {
                            if (this.f4399a == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = u3.b.f4767g + " Dispatcher";
                                c3.h.b0(str, "name");
                                this.f4399a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new u3.a(str, false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = this.f4399a;
                            c3.h.X(threadPoolExecutor);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gVar.getClass();
                    x3.j jVar = gVar.f4967d;
                    l lVar = jVar.f4970b.f4453b;
                    byte[] bArr2 = u3.b.f4761a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar);
                        } catch (RejectedExecutionException e5) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e5);
                            jVar.i(interruptedIOException);
                            gVar.f4965b.a(jVar, interruptedIOException);
                            jVar.f4970b.f4453b.b(gVar);
                        }
                    } catch (Throwable th2) {
                        jVar.f4970b.f4453b.b(gVar);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        size = arrayList.size();
        while (i4 < size) {
            gVar = (x3.g) arrayList.get(i4);
            synchronized (this) {
                if (this.f4399a == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = u3.b.f4767g + " Dispatcher";
                    c3.h.b0(str2, "name");
                    this.f4399a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new u3.a(str2, false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = this.f4399a;
                c3.h.X(threadPoolExecutor2);
                gVar.getClass();
                x3.j jVar2 = gVar.f4967d;
                l lVar2 = jVar2.f4970b.f4453b;
                byte[] bArr3 = u3.b.f4761a;
                threadPoolExecutor2.execute(gVar);
            }
        }
    }
}
