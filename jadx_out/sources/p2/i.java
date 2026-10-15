package p2;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends t2.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f3786p = new h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m2.u f3787q = new m2.u("closed");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f3788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f3789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m2.q f3790o;

    public i() {
        super(f3786p);
        this.f3788m = new ArrayList();
        this.f3790o = m2.s.f3475b;
    }

    @Override // t2.c
    public final void C(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f3788m.isEmpty() || this.f3789n != null) {
            throw new IllegalStateException();
        }
        if (!(P() instanceof m2.t)) {
            throw new IllegalStateException();
        }
        this.f3789n = str;
    }

    @Override // t2.c
    public final t2.c G() {
        Q(m2.s.f3475b);
        return this;
    }

    @Override // t2.c
    public final void J(long j4) {
        Q(new m2.u(Long.valueOf(j4)));
    }

    @Override // t2.c
    public final void K(Boolean bool) {
        if (bool == null) {
            Q(m2.s.f3475b);
        } else {
            Q(new m2.u(bool));
        }
    }

    @Override // t2.c
    public final void L(Number number) {
        if (number == null) {
            Q(m2.s.f3475b);
            return;
        }
        if (!this.f4278g) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        Q(new m2.u(number));
    }

    @Override // t2.c
    public final void M(String str) {
        if (str == null) {
            Q(m2.s.f3475b);
        } else {
            Q(new m2.u(str));
        }
    }

    @Override // t2.c
    public final void N(boolean z4) {
        Q(new m2.u(Boolean.valueOf(z4)));
    }

    public final m2.q P() {
        ArrayList arrayList = this.f3788m;
        return (m2.q) arrayList.get(arrayList.size() - 1);
    }

    public final void Q(m2.q qVar) {
        if (this.f3789n != null) {
            if (!(qVar instanceof m2.s) || this.f4281j) {
                m2.t tVar = (m2.t) P();
                String str = this.f3789n;
                tVar.getClass();
                tVar.f3476b.put(str, qVar);
            }
            this.f3789n = null;
            return;
        }
        if (this.f3788m.isEmpty()) {
            this.f3790o = qVar;
            return;
        }
        m2.q qVarP = P();
        if (!(qVarP instanceof m2.o)) {
            throw new IllegalStateException();
        }
        m2.o oVar = (m2.o) qVarP;
        oVar.getClass();
        oVar.f3474b.add(qVar);
    }

    @Override // t2.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f3788m;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f3787q);
    }

    @Override // t2.c
    public final void e() {
        m2.o oVar = new m2.o();
        Q(oVar);
        this.f3788m.add(oVar);
    }

    @Override // t2.c, java.io.Flushable
    public final void flush() {
    }

    @Override // t2.c
    public final void h() {
        m2.t tVar = new m2.t();
        Q(tVar);
        this.f3788m.add(tVar);
    }

    @Override // t2.c
    public final void x() {
        ArrayList arrayList = this.f3788m;
        if (arrayList.isEmpty() || this.f3789n != null) {
            throw new IllegalStateException();
        }
        if (!(P() instanceof m2.o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // t2.c
    public final void z() {
        ArrayList arrayList = this.f3788m;
        if (arrayList.isEmpty() || this.f3789n != null) {
            throw new IllegalStateException();
        }
        if (!(P() instanceof m2.t)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
