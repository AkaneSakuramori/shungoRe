package v0;

import a4.x;
import androidx.lifecycle.n0;
import n.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f4770d = new x(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4771c = new l();

    @Override // androidx.lifecycle.n0
    public final void a() {
        l lVar = this.f4771c;
        int i4 = lVar.f3528d;
        if (i4 > 0) {
            defpackage.a.n(lVar.f3527c[0]);
            throw null;
        }
        Object[] objArr = lVar.f3527c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        lVar.f3528d = 0;
    }
}
