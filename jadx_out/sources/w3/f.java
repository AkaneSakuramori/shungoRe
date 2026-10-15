package w3;

import c3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f2.e f4913h = new f2.e(16, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f4914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f4915j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f4916a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4919d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4917b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4920e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4921f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f4922g = new e(this);

    static {
        String str = u3.b.f4767g + " TaskRunner";
        h.b0(str, "name");
        f4914i = new f(new d(new u3.a(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        h.a0(logger, "getLogger(TaskRunner::class.java.name)");
        f4915j = logger;
    }

    public f(d dVar) {
        this.f4916a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = u3.b.f4761a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f4899a);
        try {
            long jA = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, jA);
            }
        } finally {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = u3.b.f4761a;
        c cVar = aVar.f4901c;
        h.X(cVar);
        if (cVar.f4908d != aVar) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z4 = cVar.f4910f;
        cVar.f4910f = false;
        cVar.f4908d = null;
        this.f4920e.remove(cVar);
        if (j4 != -1 && !z4 && !cVar.f4907c) {
            cVar.d(aVar, j4, true);
        }
        if (!cVar.f4909e.isEmpty()) {
            this.f4921f.add(cVar);
        }
    }

    public final a c() {
        boolean z4;
        boolean z5;
        byte[] bArr = u3.b.f4761a;
        while (true) {
            ArrayList arrayList = this.f4921f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.f4916a;
            dVar.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f4909e.get(0);
                long jMax = Math.max(0L, aVar2.f4902d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z4 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = u3.b.f4761a;
                aVar.f4902d = -1L;
                c cVar = aVar.f4901c;
                h.X(cVar);
                cVar.f4909e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f4908d = aVar;
                this.f4920e.add(cVar);
                if (z4 || (!this.f4918c && (!arrayList.isEmpty()))) {
                    e eVar = this.f4922g;
                    h.b0(eVar, "runnable");
                    dVar.f4911a.execute(eVar);
                }
                return aVar;
            }
            if (this.f4918c) {
                if (jMin < this.f4919d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.f4918c = true;
            this.f4919d = jNanoTime + jMin;
            try {
                try {
                    long j4 = jMin / 1000000;
                    long j5 = jMin - (1000000 * j4);
                    if (j4 > 0 || jMin > 0) {
                        wait(j4, (int) j5);
                    }
                    z5 = false;
                } catch (InterruptedException unused) {
                    d();
                    z5 = false;
                }
                this.f4918c = z5;
            } catch (Throwable th) {
                this.f4918c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f4920e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((c) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f4921f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f4909e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        h.b0(cVar, "taskQueue");
        byte[] bArr = u3.b.f4761a;
        if (cVar.f4908d == null) {
            boolean z4 = !cVar.f4909e.isEmpty();
            ArrayList arrayList = this.f4921f;
            if (z4) {
                h.b0(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z5 = this.f4918c;
        d dVar = this.f4916a;
        if (z5) {
            dVar.getClass();
            notify();
        } else {
            dVar.getClass();
            e eVar = this.f4922g;
            h.b0(eVar, "runnable");
            dVar.f4911a.execute(eVar);
        }
    }

    public final c f() {
        int i4;
        synchronized (this) {
            i4 = this.f4917b;
            this.f4917b = i4 + 1;
        }
        return new c(this, defpackage.a.e("Q", i4));
    }
}
