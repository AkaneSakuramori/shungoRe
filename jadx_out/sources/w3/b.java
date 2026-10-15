package w3;

import a4.t;
import c3.h;
import java.io.IOException;
import java.net.Socket;
import x3.l;
import x3.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, Object obj, String str) {
        super(str, true);
        this.f4903e = i4;
        this.f4904f = obj;
    }

    @Override // w3.a
    public final long a() {
        int i4 = 0;
        switch (this.f4903e) {
            case 0:
                ((j3.a) this.f4904f).a();
                return -1L;
            case 1:
                m mVar = (m) this.f4904f;
                long jNanoTime = System.nanoTime();
                long j4 = Long.MIN_VALUE;
                l lVar = null;
                int i5 = 0;
                for (l lVar2 : mVar.f5009e) {
                    h.a0(lVar2, "connection");
                    synchronized (lVar2) {
                        if (mVar.b(lVar2, jNanoTime) > 0) {
                            i5++;
                        } else {
                            i4++;
                            long j5 = jNanoTime - lVar2.f5004q;
                            if (j5 > j4) {
                                lVar = lVar2;
                                j4 = j5;
                            }
                        }
                    }
                }
                long j6 = mVar.f5006b;
                if (j4 < j6 && i4 <= mVar.f5005a) {
                    if (i4 > 0) {
                        return j6 - j4;
                    }
                    if (i5 > 0) {
                        return j6;
                    }
                    return -1L;
                }
                h.X(lVar);
                synchronized (lVar) {
                    if (!(!lVar.f5003p.isEmpty()) && lVar.f5004q + j4 == jNanoTime) {
                        lVar.f4997j = true;
                        mVar.f5009e.remove(lVar);
                        Socket socket = lVar.f4991d;
                        h.X(socket);
                        u3.b.d(socket);
                        if (mVar.f5009e.isEmpty()) {
                            mVar.f5007c.a();
                        }
                    }
                }
                return 0L;
            default:
                t tVar = (t) this.f4904f;
                tVar.getClass();
                try {
                    tVar.f208z.x(2, 0, false);
                    break;
                } catch (IOException e5) {
                    tVar.e(e5);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, String str) {
        super(str, true);
        this.f4903e = 1;
        this.f4904f = mVar;
    }
}
