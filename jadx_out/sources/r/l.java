package r;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f4025q0;

    @Override // r.d
    public void D() {
        this.f4025q0.clear();
        super.D();
    }

    @Override // r.d
    public final void G(g.h hVar) {
        super.G(hVar);
        int size = this.f4025q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f4025q0.get(i4)).G(hVar);
        }
    }

    public abstract void S();
}
