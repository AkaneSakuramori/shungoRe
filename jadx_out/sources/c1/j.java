package c1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c3.h {
    @Override // c3.h
    public Object C1(Class cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls);
    }

    @Override // c3.h
    public boolean R(o.f fVar, o.c cVar) {
        o.c cVar2 = o.c.f3576b;
        synchronized (fVar) {
            try {
                if (fVar.f3591b != cVar) {
                    return false;
                }
                fVar.f3591b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.h
    public boolean S(o.f fVar, Object obj, Object obj2) {
        synchronized (fVar) {
            try {
                if (fVar.f3590a != obj) {
                    return false;
                }
                fVar.f3590a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.h
    public boolean T(o.f fVar, o.e eVar, o.e eVar2) {
        synchronized (fVar) {
            try {
                if (fVar.f3592c != eVar) {
                    return false;
                }
                fVar.f3592c = eVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.h
    public void X1(o.e eVar, o.e eVar2) {
        eVar.f3585b = eVar2;
    }

    @Override // c3.h
    public void Y1(o.e eVar, Thread thread) {
        eVar.f3584a = thread;
    }
}
