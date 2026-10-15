package y0;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f5307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5308b;

    public final t0 a(int i4) {
        SparseArray sparseArray = this.f5307a;
        t0 t0Var = (t0) sparseArray.get(i4);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0();
        sparseArray.put(i4, t0Var2);
        return t0Var2;
    }
}
