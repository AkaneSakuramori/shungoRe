package o;

import c1.j;
import c3.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Future {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3586d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f3587e = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f3588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f3589g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f3592c;

    static {
        h jVar;
        try {
            jVar = new d(AtomicReferenceFieldUpdater.newUpdater(e.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            jVar = new j();
        }
        f3588f = jVar;
        if (th != null) {
            f3587e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3589g = new Object();
    }

    public static void b(f fVar) {
        e eVar;
        c cVar;
        do {
            eVar = fVar.f3592c;
        } while (!f3588f.T(fVar, eVar, e.f3583c));
        while (eVar != null) {
            Thread thread = eVar.f3584a;
            if (thread != null) {
                eVar.f3584a = null;
                LockSupport.unpark(thread);
            }
            eVar = eVar.f3585b;
        }
        do {
            cVar = fVar.f3591b;
        } while (!f3588f.R(fVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f3577a;
            cVar.f3577a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3577a;
            try {
                throw null;
            } catch (RuntimeException e5) {
                f3587e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e5);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3575a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3589g) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e5) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e5.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e6) {
                sb.append("FAILURE, cause=[");
                sb.append(e6.getCause());
                sb.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        a aVar;
        Object obj = this.f3590a;
        if (obj == null) {
            if (f3586d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z4);
            } else {
                aVar = z4 ? a.f3573b : a.f3574c;
            }
            if (f3588f.S(this, obj, aVar)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void d(e eVar) {
        eVar.f3584a = null;
        while (true) {
            e eVar2 = this.f3592c;
            if (eVar2 == e.f3583c) {
                return;
            }
            e eVar3 = null;
            while (eVar2 != null) {
                e eVar4 = eVar2.f3585b;
                if (eVar2.f3584a != null) {
                    eVar3 = eVar2;
                } else if (eVar3 != null) {
                    eVar3.f3585b = eVar4;
                    if (eVar3.f3584a == null) {
                    }
                } else if (!f3588f.T(this, eVar2, eVar4)) {
                }
                eVar2 = eVar4;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[EDGE_INSN: B:56:0x009f->B:36:0x006e BREAK  A[LOOP:0: B:21:0x003e->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3590a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f3590a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3590a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f3590a;
        if ((obj2 != null) & true) {
            return c(obj2);
        }
        e eVar = this.f3592c;
        e eVar2 = e.f3583c;
        if (eVar != eVar2) {
            e eVar3 = new e();
            do {
                h hVar = f3588f;
                hVar.X1(eVar3, eVar);
                if (hVar.T(this, eVar, eVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(eVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f3590a;
                    } while (!((obj != null) & true));
                    return c(obj);
                }
                eVar = this.f3592c;
            } while (eVar != eVar2);
        }
        return c(this.f3590a);
    }
}
