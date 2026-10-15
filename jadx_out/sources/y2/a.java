package y2;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5371a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5372b = 0;

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final m a() {
        m mVarB;
        if (c(1) || !c(2)) {
            mVarB = null;
        } else {
            try {
                mVarB = b("su", "--mount-master");
                try {
                    if (!mVarB.e()) {
                        mVarB = null;
                    }
                } catch (x2.a unused) {
                }
            } catch (x2.a unused2) {
            }
        }
        if (mVarB == null && !c(1)) {
            try {
                mVarB = b("su");
                mVarB = mVarB.e() ? mVarB : null;
            } catch (x2.a unused3) {
            }
        }
        if (mVarB != null) {
            return mVarB;
        }
        if (!c(1)) {
            synchronized (r.class) {
            }
        }
        return b("sh");
    }

    public final m b(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            try {
                m mVar = new m(this, Runtime.getRuntime().exec(strArr));
                synchronized (d.class) {
                    if (d.f5383b) {
                        m[] mVarArr = d.f5382a;
                        synchronized (mVarArr) {
                            mVarArr[0] = mVar;
                        }
                    }
                }
                return mVar;
            } catch (IOException e5) {
                throw new x2.a("Unable to create a shell!", e5);
            }
        } catch (IOException e6) {
            throw new x2.a("Unable to create a shell!", e6);
        }
    }

    public final boolean c(int i4) {
        return (this.f5372b & i4) == i4;
    }
}
