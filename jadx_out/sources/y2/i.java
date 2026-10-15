package y2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractExecutorService implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayDeque f5396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FutureTask f5397d;

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean awaitTermination(long j4, TimeUnit timeUnit) {
        FutureTask futureTask = this.f5397d;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j4, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable;
        while (true) {
            synchronized (this) {
                try {
                    runnable = (Runnable) this.f5396c.poll();
                    if (runnable == null) {
                        this.f5397d = null;
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            runnable.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f5395b) {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
        this.f5396c.offer(runnable);
        if (this.f5397d == null) {
            FutureTask futureTask = new FutureTask(this);
            this.f5397d = futureTask;
            x2.d.f4929b.execute(futureTask);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isShutdown() {
        return this.f5395b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isTerminated() {
        return this.f5395b && this.f5397d == null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized void shutdown() {
        this.f5395b = true;
        this.f5396c.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized List shutdownNow() {
        ArrayList arrayList;
        this.f5395b = true;
        FutureTask futureTask = this.f5397d;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        try {
            arrayList = new ArrayList(this.f5396c);
            this.f5396c.clear();
        } catch (Throwable th) {
            this.f5396c.clear();
            throw th;
        }
        return arrayList;
    }
}
