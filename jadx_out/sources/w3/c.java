package w3;

import c3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f4908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4910f;

    public c(f fVar, String str) {
        h.b0(fVar, "taskRunner");
        h.b0(str, "name");
        this.f4905a = fVar;
        this.f4906b = str;
        this.f4909e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = u3.b.f4761a;
        synchronized (this.f4905a) {
            if (b()) {
                this.f4905a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f4908d;
        if (aVar != null && aVar.f4900b) {
            this.f4910f = true;
        }
        ArrayList arrayList = this.f4909e;
        boolean z4 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f4900b) {
                a aVar2 = (a) arrayList.get(size);
                if (f.f4913h.w().isLoggable(Level.FINE)) {
                    q.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(a aVar, long j4) {
        h.b0(aVar, "task");
        synchronized (this.f4905a) {
            if (!this.f4907c) {
                if (d(aVar, j4, false)) {
                    this.f4905a.e(this);
                }
            } else if (aVar.f4900b) {
                if (f.f4913h.w().isLoggable(Level.FINE)) {
                    q.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f.f4913h.w().isLoggable(Level.FINE)) {
                    q.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j4, boolean z4) {
        h.b0(aVar, "task");
        c cVar = aVar.f4901c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            aVar.f4901c = this;
        }
        this.f4905a.f4916a.getClass();
        long jNanoTime = System.nanoTime();
        long j5 = jNanoTime + j4;
        ArrayList arrayList = this.f4909e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.f4902d <= j5) {
                if (f.f4913h.w().isLoggable(Level.FINE)) {
                    q.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        aVar.f4902d = j5;
        if (f.f4913h.w().isLoggable(Level.FINE)) {
            q.a(aVar, this, z4 ? "run again after ".concat(q.e(j5 - jNanoTime)) : "scheduled after ".concat(q.e(j5 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).f4902d - jNanoTime > j4) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, aVar);
        return size == 0;
    }

    public final void e() {
        byte[] bArr = u3.b.f4761a;
        synchronized (this.f4905a) {
            this.f4907c = true;
            if (b()) {
                this.f4905a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f4906b;
    }
}
