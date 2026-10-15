package e0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f1956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1957c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f1955a) {
                    return;
                }
                this.f1955a = true;
                this.f1957c = true;
                d dVar = this.f1956b;
                if (dVar != null) {
                    try {
                        dVar.e();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f1957c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f1957c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(d dVar) {
        synchronized (this) {
            while (this.f1957c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f1956b == dVar) {
                return;
            }
            this.f1956b = dVar;
            if (this.f1955a) {
                dVar.e();
            }
        }
    }
}
