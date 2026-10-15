package x3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t3.b0;
import t3.s;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public final class j implements t3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.w f4971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f4973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t3.n f4974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f4975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f4976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f4978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f4979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f4981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f4985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile e f4986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile l f4987s;

    public j(w wVar, i.w wVar2, boolean z4) {
        c3.h.b0(wVar, "client");
        c3.h.b0(wVar2, "originalRequest");
        this.f4970b = wVar;
        this.f4971c = wVar2;
        this.f4972d = z4;
        this.f4973e = (m) wVar.f4454c.f1137a;
        t3.n nVar = (t3.n) wVar.f4457f.f3366a;
        byte[] bArr = u3.b.f4761a;
        c3.h.b0(nVar, "$this_asFactory");
        this.f4974f = nVar;
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.f4975g = iVar;
        this.f4976h = new AtomicBoolean();
        this.f4984p = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f4985q ? "canceled " : "");
        sb.append(jVar.f4972d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((s) jVar.f4971c.f2808b).g());
        return sb.toString();
    }

    public final void b(l lVar) {
        byte[] bArr = u3.b.f4761a;
        if (this.f4979k != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f4979k = lVar;
        lVar.f5003p.add(new h(this, this.f4977i));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = u3.b.f4761a;
        l lVar = this.f4979k;
        if (lVar != null) {
            synchronized (lVar) {
                socketJ = j();
            }
            if (this.f4979k == null) {
                if (socketJ != null) {
                    u3.b.d(socketJ);
                }
                this.f4974f.getClass();
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.f4980l && this.f4975g.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            t3.n nVar = this.f4974f;
            c3.h.X(interruptedIOException);
            nVar.getClass();
        } else {
            this.f4974f.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f4970b, this.f4971c, this.f4972d);
    }

    public final void d() {
        Socket socket;
        if (this.f4985q) {
            return;
        }
        this.f4985q = true;
        e eVar = this.f4986r;
        if (eVar != null) {
            eVar.f4951d.cancel();
        }
        l lVar = this.f4987s;
        if (lVar != null && (socket = lVar.f4990c) != null) {
            u3.b.d(socket);
        }
        this.f4974f.getClass();
    }

    public final b0 e() {
        if (!this.f4976h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f4975g.h();
        b4.l lVar = b4.l.f1135a;
        this.f4977i = b4.l.f1135a.g();
        this.f4974f.getClass();
        try {
            t3.l lVar2 = this.f4970b.f4453b;
            synchronized (lVar2) {
                lVar2.f4402d.add(this);
            }
            b0 b0VarG = g();
            t3.l lVar3 = this.f4970b.f4453b;
            lVar3.getClass();
            lVar3.a(lVar3.f4402d, this);
            return b0VarG;
        } catch (Throwable th) {
            t3.l lVar4 = this.f4970b.f4453b;
            lVar4.getClass();
            lVar4.a(lVar4.f4402d, this);
            throw th;
        }
    }

    public final void f(boolean z4) {
        e eVar;
        synchronized (this) {
            if (!this.f4984p) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z4 && (eVar = this.f4986r) != null) {
            eVar.f4951d.cancel();
            eVar.f4948a.h(eVar, true, true, null);
        }
        this.f4981m = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    public final b0 g() throws Throwable {
        ArrayList arrayList = new ArrayList();
        a3.l.e3(this.f4970b.f4455d, arrayList);
        arrayList.add(new y3.g(this.f4970b));
        arrayList.add(new y3.a(this.f4970b.f4462k));
        this.f4970b.getClass();
        arrayList.add(new v3.a());
        arrayList.add(a.f4930a);
        if (!this.f4972d) {
            a3.l.e3(this.f4970b.f4456e, arrayList);
        }
        arrayList.add(new y3.b(this.f4972d));
        i.w wVar = this.f4971c;
        w wVar2 = this.f4970b;
        boolean z4 = false;
        try {
            b0 b0VarB = new y3.f(this, arrayList, 0, null, wVar, wVar2.f4474w, wVar2.f4475x, wVar2.f4476y).b(this.f4971c);
            if (this.f4985q) {
                u3.b.c(b0VarB);
                throw new IOException("Canceled");
            }
            i(null);
            return b0VarB;
        } catch (IOException e5) {
            try {
                IOException iOExceptionI = i(e5);
                c3.h.Y(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            } catch (Throwable th) {
                th = th;
                z4 = true;
                if (!z4) {
                    i(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z4) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException h(e eVar, boolean z4, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        c3.h.b0(eVar, "exchange");
        if (!c3.h.I(eVar, this.f4986r)) {
            return iOException;
        }
        synchronized (this) {
            z6 = false;
            if (z4) {
                try {
                    if (this.f4982n) {
                        if (z4) {
                            this.f4982n = false;
                        }
                        if (z5) {
                            this.f4983o = false;
                        }
                        z8 = this.f4982n;
                        if (z8) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (!z8) {
                            z6 = true;
                        }
                        z7 = z6;
                        z6 = z9;
                    } else if (z5 || !this.f4983o) {
                        z7 = false;
                    } else {
                        if (z4) {
                            this.f4982n = false;
                        }
                        if (z5) {
                            this.f4983o = false;
                        }
                        z8 = this.f4982n;
                        if (z8 || this.f4983o) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (!z8 && !this.f4983o && !this.f4984p) {
                            z6 = true;
                        }
                        z7 = z6;
                        z6 = z9;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z5) {
                }
                z7 = false;
            }
        }
        if (z6) {
            this.f4986r = null;
            l lVar = this.f4979k;
            if (lVar != null) {
                synchronized (lVar) {
                    lVar.f5000m++;
                }
            }
        }
        return z7 ? c(iOException) : iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.f4984p) {
                this.f4984p = false;
                if (!this.f4982n && !this.f4983o) {
                    z4 = true;
                }
            }
        }
        return z4 ? c(iOException) : iOException;
    }

    public final Socket j() {
        l lVar = this.f4979k;
        c3.h.X(lVar);
        byte[] bArr = u3.b.f4761a;
        ArrayList arrayList = lVar.f5003p;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (c3.h.I(((Reference) it.next()).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i4);
        this.f4979k = null;
        if (arrayList.isEmpty()) {
            lVar.f5004q = System.nanoTime();
            m mVar = this.f4973e;
            mVar.getClass();
            byte[] bArr2 = u3.b.f4761a;
            boolean z4 = lVar.f4997j;
            w3.c cVar = mVar.f5007c;
            if (z4 || mVar.f5005a == 0) {
                lVar.f4997j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = mVar.f5009e;
                concurrentLinkedQueue.remove(lVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = lVar.f4991d;
                c3.h.X(socket);
                return socket;
            }
            cVar.c(mVar.f5008d, 0L);
        }
        return null;
    }
}
