package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f650b;

    public w(int i4) {
        this.f649a = new SparseArray(i4);
    }

    public final void a(q qVar, int i4, int i5) {
        int iA = qVar.a(i4);
        SparseArray sparseArray = this.f649a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(iA);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(qVar.a(i4), wVar);
        }
        if (i5 > i4) {
            wVar.a(qVar, i4 + 1, i5);
        } else {
            wVar.f650b = qVar;
        }
    }
}
