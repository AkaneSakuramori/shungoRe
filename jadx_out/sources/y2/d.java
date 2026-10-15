package y2;

import e.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m[] f5382a = new m[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f5384c;

    public static synchronized m a() {
        m mVarC;
        try {
            mVarC = c();
            if (mVarC == null) {
                f5383b = true;
                if (f5384c == null) {
                    f5384c = new a();
                }
                mVarC = f5384c.a();
                f5383b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVarC;
    }

    public static void b(j.a aVar, x2.b bVar) {
        m mVarC = c();
        if (mVarC == null) {
            x2.d.f4929b.execute(new k0(aVar, 10, bVar));
        } else if (aVar == null) {
            bVar.a(mVarC);
        } else {
            aVar.execute(new k0(bVar, 11, mVarC));
        }
    }

    public static m c() {
        m mVar;
        m[] mVarArr = f5382a;
        synchronized (mVarArr) {
            try {
                mVar = mVarArr[0];
                if (mVar != null && mVar.f5399c < 0) {
                    mVarArr[0] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }
}
