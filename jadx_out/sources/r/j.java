package r;

import java.util.ArrayList;
import r3.q;
import s.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends d implements i {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f4022q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f4023r0 = 0;

    public final void S(int i4, o oVar, ArrayList arrayList) {
        for (int i5 = 0; i5 < this.f4023r0; i5++) {
            d dVar = this.f4022q0[i5];
            ArrayList arrayList2 = oVar.f4182a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i6 = 0; i6 < this.f4023r0; i6++) {
            q.d(this.f4022q0[i6], i4, arrayList, oVar);
        }
    }

    public void a() {
    }
}
