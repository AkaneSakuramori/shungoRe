package y2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f5389r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5390s = true;

    public g() {
        this.f5379l = e.a();
    }

    public final c3.h S2() {
        h hVar = h.f5391l;
        try {
            m mVarA = d.a();
            this.f5381n = mVarA;
            if (this.f5389r && !mVarA.e()) {
                close();
                return hVar;
            }
            if (this.f5379l instanceof e) {
                this.f5379l = new ArrayList();
            }
            h hVarQ2 = Q2();
            if (!this.f5390s || hVarQ2 != h.f5392m) {
                return hVarQ2;
            }
            this.f5390s = false;
            return S2();
        } catch (x2.a unused) {
            close();
            return hVar;
        }
    }
}
