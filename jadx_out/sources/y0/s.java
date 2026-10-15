package y0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f5286f = new ThreadLocal();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w.g f5287g = new w.g(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f5288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f5291e;

    public static d1 c(RecyclerView recyclerView, int i4, long j4) {
        int iH = recyclerView.f1028f.h();
        for (int i5 = 0; i5 < iH; i5++) {
            d1 d1VarI = RecyclerView.I(recyclerView.f1028f.g(i5));
            if (d1VarI.f5105c == i4 && !d1VarI.h()) {
                return null;
            }
        }
        v0 v0Var = recyclerView.f1022c;
        try {
            recyclerView.P();
            d1 d1VarJ = v0Var.j(i4, j4);
            if (d1VarJ != null) {
                if (!d1VarJ.g() || d1VarJ.h()) {
                    v0Var.a(d1VarJ, false);
                } else {
                    v0Var.g(d1VarJ.f5103a);
                }
            }
            return d1VarJ;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow() && this.f5289c == 0) {
            this.f5289c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        q qVar = recyclerView.f1023c0;
        qVar.f5277a = i4;
        qVar.f5278b = i5;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    public final void b(long j4) {
        r rVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        r rVar2;
        ArrayList arrayList = this.f5288b;
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                q qVar = recyclerView3.f1023c0;
                qVar.b(recyclerView3, false);
                i4 += qVar.f5280d;
            }
        }
        ArrayList arrayList2 = this.f5291e;
        arrayList2.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i7);
            if (recyclerView4.getWindowVisibility() == 0) {
                q qVar2 = recyclerView4.f1023c0;
                int iAbs = Math.abs(qVar2.f5278b) + Math.abs(qVar2.f5277a);
                for (int i8 = 0; i8 < qVar2.f5280d * 2; i8 += 2) {
                    if (i6 >= arrayList2.size()) {
                        rVar2 = new r();
                        arrayList2.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList2.get(i6);
                    }
                    int[] iArr = qVar2.f5279c;
                    int i9 = iArr[i8 + 1];
                    rVar2.f5281a = i9 <= iAbs;
                    rVar2.f5282b = iAbs;
                    rVar2.f5283c = i9;
                    rVar2.f5284d = recyclerView4;
                    rVar2.f5285e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(arrayList2, f5287g);
        for (int i10 = 0; i10 < arrayList2.size() && (recyclerView = (rVar = (r) arrayList2.get(i10)).f5284d) != null; i10++) {
            d1 d1VarC = c(recyclerView, rVar.f5285e, rVar.f5281a ? Long.MAX_VALUE : j4);
            if (d1VarC != null && d1VarC.f5104b != null && d1VarC.g() && !d1VarC.h() && (recyclerView2 = (RecyclerView) d1VarC.f5104b.get()) != null) {
                if (recyclerView2.f1062z && recyclerView2.f1028f.h() != 0) {
                    l0 l0Var = recyclerView2.I;
                    if (l0Var != null) {
                        l0Var.e();
                    }
                    o0 o0Var = recyclerView2.f1042m;
                    v0 v0Var = recyclerView2.f1022c;
                    if (o0Var != null) {
                        o0Var.e0(v0Var);
                        recyclerView2.f1042m.f0(v0Var);
                    }
                    v0Var.f5314a.clear();
                    v0Var.e();
                }
                q qVar3 = recyclerView2.f1023c0;
                qVar3.b(recyclerView2, true);
                if (qVar3.f5280d != 0) {
                    try {
                        int i11 = e0.l.f1962a;
                        e0.k.a("RV Nested Prefetch");
                        a1 a1Var = recyclerView2.f1025d0;
                        g0 g0Var = recyclerView2.f1040l;
                        a1Var.f5065d = 1;
                        a1Var.f5066e = g0Var.a();
                        a1Var.f5068g = false;
                        a1Var.f5069h = false;
                        a1Var.f5070i = false;
                        for (int i12 = 0; i12 < qVar3.f5280d * 2; i12 += 2) {
                            c(recyclerView2, qVar3.f5279c[i12], j4);
                        }
                        e0.k.b();
                    } catch (Throwable th) {
                        int i13 = e0.l.f1962a;
                        e0.k.b();
                        throw th;
                    }
                }
            }
            rVar.f5281a = false;
            rVar.f5282b = 0;
            rVar.f5283c = 0;
            rVar.f5284d = null;
            rVar.f5285e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i4 = e0.l.f1962a;
            e0.k.a("RV Prefetch");
            ArrayList arrayList = this.f5288b;
            if (arrayList.isEmpty()) {
                this.f5289c = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f5289c = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5290d);
                this.f5289c = 0L;
            }
        } finally {
            this.f5289c = 0L;
            int i6 = e0.l.f1962a;
            e0.k.b();
        }
    }
}
