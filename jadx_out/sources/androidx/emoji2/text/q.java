package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f624d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.h f626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f627c = 0;

    public q(g.h hVar, int i4) {
        this.f626b = hVar;
        this.f625a = i4;
    }

    public final int a(int i4) {
        q0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        Object obj = aVarC.f3879d;
        int i5 = iA + aVarC.f3876a;
        return ((ByteBuffer) obj).getInt((i4 * 4) + ((ByteBuffer) obj).getInt(i5) + i5 + 4);
    }

    public final int b() {
        q0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i4 = iA + aVarC.f3876a;
        return ((ByteBuffer) aVarC.f3879d).getInt(((ByteBuffer) aVarC.f3879d).getInt(i4) + i4);
    }

    public final q0.a c() {
        ThreadLocal threadLocal = f624d;
        q0.a aVar = (q0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new q0.a();
            threadLocal.set(aVar);
        }
        a2.a aVar2 = (a2.a) this.f626b.f2224c;
        int iA = aVar2.a(6);
        if (iA != 0) {
            int i4 = iA + aVar2.f3876a;
            int i5 = (this.f625a * 4) + ((ByteBuffer) aVar2.f3879d).getInt(i4) + i4 + 4;
            aVar.b(((ByteBuffer) aVar2.f3879d).getInt(i5) + i5, (ByteBuffer) aVar2.f3879d);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        q0.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f3879d).getInt(iA + aVarC.f3876a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i4 = 0; i4 < iB; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
