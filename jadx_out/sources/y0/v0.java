package y0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f5315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f5320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5321h;

    public v0(RecyclerView recyclerView) {
        this.f5321h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5314a = arrayList;
        this.f5315b = null;
        this.f5316c = new ArrayList();
        this.f5317d = Collections.unmodifiableList(arrayList);
        this.f5318e = 2;
        this.f5319f = 2;
    }

    public final void a(d1 d1Var, boolean z4) {
        RecyclerView.j(d1Var);
        RecyclerView recyclerView = this.f5321h;
        f1 f1Var = recyclerView.f1039k0;
        if (f1Var != null) {
            e1 e1Var = f1Var.f5134e;
            boolean z5 = e1Var instanceof e1;
            View view = d1Var.f5103a;
            i0.v0.l(view, z5 ? (i0.c) e1Var.f5126e.remove(view) : null);
        }
        if (z4 && recyclerView.f1025d0 != null) {
            recyclerView.f1030g.p(d1Var);
        }
        d1Var.f5120r = null;
        u0 u0VarC = c();
        u0VarC.getClass();
        int i4 = d1Var.f5108f;
        ArrayList arrayList = u0VarC.a(i4).f5294a;
        if (((t0) u0VarC.f5307a.get(i4)).f5295b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public final int b(int i4) {
        RecyclerView recyclerView = this.f5321h;
        if (i4 >= 0 && i4 < recyclerView.f1025d0.b()) {
            return !recyclerView.f1025d0.f5068g ? i4 : recyclerView.f1026e.f(i4, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + recyclerView.f1025d0.b() + recyclerView.y());
    }

    public final u0 c() {
        if (this.f5320g == null) {
            u0 u0Var = new u0();
            u0Var.f5307a = new SparseArray();
            u0Var.f5308b = 0;
            this.f5320g = u0Var;
        }
        return this.f5320g;
    }

    public final View d(int i4) {
        return j(i4, Long.MAX_VALUE).f5103a;
    }

    public final void e() {
        ArrayList arrayList = this.f5316c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1016t0;
        q qVar = this.f5321h.f1023c0;
        int[] iArr2 = qVar.f5279c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        qVar.f5280d = 0;
    }

    public final void f(int i4) {
        ArrayList arrayList = this.f5316c;
        a((d1) arrayList.get(i4), true);
        arrayList.remove(i4);
    }

    public final void g(View view) {
        d1 d1VarI = RecyclerView.I(view);
        boolean zL = d1VarI.l();
        RecyclerView recyclerView = this.f5321h;
        if (zL) {
            recyclerView.removeDetachedView(view, false);
        }
        if (d1VarI.k()) {
            d1VarI.f5116n.k(d1VarI);
        } else if (d1VarI.r()) {
            d1VarI.f5112j &= -33;
        }
        h(d1VarI);
        if (recyclerView.I == null || d1VarI.i()) {
            return;
        }
        recyclerView.I.d(d1VarI);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[LOOP:2: B:42:0x008a->B:46:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0098 A[EDGE_INSN: B:73:0x0098->B:47:0x0098 BREAK  A[LOOP:1: B:38:0x0075->B:45:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0098 A[EDGE_INSN: B:74:0x0098->B:47:0x0098 BREAK  A[LOOP:1: B:38:0x0075->B:45:0x0092, LOOP_LABEL: LOOP:1: B:38:0x0075->B:45:0x0092], SYNTHETIC] */
    public final void h(d1 d1Var) {
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        q qVar;
        int i6;
        int i7;
        boolean zK = d1Var.k();
        boolean z6 = false;
        boolean z7 = true;
        RecyclerView recyclerView = this.f5321h;
        View view = d1Var.f5103a;
        if (zK || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(d1Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (d1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d1Var + recyclerView.y());
        }
        if (d1Var.q()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((d1Var.f5112j & 16) == 0) {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            if (i0.e0.i(view)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        g0 g0Var = recyclerView.f1040l;
        if (d1Var.i()) {
            if (this.f5319f <= 0 || d1Var.e(526)) {
                z5 = false;
            } else {
                ArrayList arrayList = this.f5316c;
                int size = arrayList.size();
                if (size >= this.f5319f && size > 0) {
                    f(0);
                    size--;
                }
                int[] iArr = RecyclerView.f1016t0;
                if (size > 0) {
                    q qVar2 = recyclerView.f1023c0;
                    int i8 = d1Var.f5105c;
                    if (qVar2.f5279c != null) {
                        int i9 = qVar2.f5280d * 2;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= i9) {
                                i4 = size - 1;
                                loop1: while (i4 >= 0) {
                                    i5 = ((d1) arrayList.get(i4)).f5105c;
                                    qVar = recyclerView.f1023c0;
                                    if (qVar.f5279c != null) {
                                        break;
                                    }
                                    i6 = qVar.f5280d * 2;
                                    i7 = 0;
                                    while (true) {
                                        if (i7 < i6) {
                                            break loop1;
                                        } else if (qVar.f5279c[i7] == i5) {
                                            break;
                                        } else {
                                            i7 += 2;
                                        }
                                    }
                                    i4--;
                                }
                                size = i4 + 1;
                            } else if (qVar2.f5279c[i10] != i8) {
                                i10 += 2;
                            }
                        }
                    } else {
                        i4 = size - 1;
                        loop1: while (i4 >= 0) {
                            i5 = ((d1) arrayList.get(i4)).f5105c;
                            qVar = recyclerView.f1023c0;
                            if (qVar.f5279c != null) {
                                break;
                                break;
                            }
                            i6 = qVar.f5280d * 2;
                            i7 = 0;
                            while (true) {
                                if (i7 < i6) {
                                    break loop1;
                                    break loop1;
                                } else if (qVar.f5279c[i7] == i5) {
                                    break;
                                } else {
                                    i7 += 2;
                                }
                            }
                            i4--;
                        }
                        size = i4 + 1;
                    }
                }
                arrayList.add(size, d1Var);
                z5 = true;
            }
            if (z5) {
                z7 = false;
            } else {
                a(d1Var, true);
            }
            z6 = z5;
        } else {
            z7 = false;
        }
        recyclerView.f1030g.p(d1Var);
        if (z6 || z7 || !z4) {
            return;
        }
        d1Var.f5120r = null;
    }

    public final void i(View view) {
        l0 l0Var;
        d1 d1VarI = RecyclerView.I(view);
        boolean zE = d1VarI.e(12);
        RecyclerView recyclerView = this.f5321h;
        if (!zE && d1VarI.m() && (l0Var = recyclerView.I) != null) {
            k kVar = (k) l0Var;
            if (d1VarI.d().isEmpty() && kVar.f5174g && !d1VarI.h()) {
                if (this.f5315b == null) {
                    this.f5315b = new ArrayList();
                }
                d1VarI.f5116n = this;
                d1VarI.f5117o = true;
                this.f5315b.add(d1VarI);
                return;
            }
        }
        if (d1VarI.h() && !d1VarI.j() && !recyclerView.f1040l.f5142b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        d1VarI.f5116n = this;
        d1VarI.f5117o = false;
        this.f5314a.add(d1VarI);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:177:0x030a A[EDGE_INSN: B:177:0x030a->B:178:0x030b BREAK  A[LOOP:6: B:172:0x02f1->B:176:0x0307]] */
    /* JADX WARN: Code duplicated, block: B:209:0x038e A[PHI: r4 r10
      0x038e: PHI (r4v5 boolean) = (r4v4 boolean), (r4v8 boolean) binds: [B:129:0x022e, B:181:0x0313] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r10v3 y0.d1) = (r10v2 y0.d1), (r10v6 y0.d1) binds: [B:129:0x022e, B:181:0x0313] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:285:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:286:0x0504  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e A[EDGE_INSN: B:35:0x007e->B:36:0x007f BREAK  A[LOOP:0: B:14:0x0026->B:20:0x0040]] */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    public final d1 j(int i4, long j4) {
        boolean z4;
        d1 d1VarD;
        i0.c cVar;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        p0 p0Var;
        d1 d1Var;
        View view;
        int iB;
        g0 g0Var;
        int size;
        int iF;
        RecyclerView recyclerView = this.f5321h;
        if (i4 < 0 || i4 >= recyclerView.f1025d0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + recyclerView.f1025d0.b() + recyclerView.y());
        }
        a1 a1Var = recyclerView.f1025d0;
        boolean z6 = false;
        if (a1Var.f5068g) {
            ArrayList arrayList = this.f5315b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        if (recyclerView.f1040l.f5142b && (iF = recyclerView.f1026e.f(i4, 0)) > 0 && iF < recyclerView.f1040l.a()) {
                            long jB = recyclerView.f1040l.b(iF);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size) {
                                    d1VarD = null;
                                    break;
                                }
                                d1 d1Var2 = (d1) this.f5315b.get(i6);
                                if (!d1Var2.r() && d1Var2.f5107e == jB) {
                                    d1Var2.b(32);
                                    d1VarD = d1Var2;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            d1VarD = null;
                            break;
                        }
                    } else {
                        d1VarD = (d1) this.f5315b.get(i5);
                        if (!d1VarD.r() && d1VarD.c() == i4) {
                            d1VarD.b(32);
                            break;
                        }
                        i5++;
                    }
                }
            } else {
                d1VarD = null;
                break;
            }
            z4 = d1VarD != null;
        } else {
            z4 = false;
            d1VarD = null;
        }
        ArrayList arrayList2 = this.f5316c;
        ArrayList arrayList3 = this.f5314a;
        if (d1VarD == null) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    d dVar = recyclerView.f1028f;
                    ArrayList arrayList4 = dVar.f5097c;
                    int size3 = arrayList4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) arrayList4.get(i8);
                        dVar.f5095a.getClass();
                        d1 d1VarI = RecyclerView.I(view);
                        if (d1VarI.c() == i4 && !d1VarI.h() && !d1VarI.j()) {
                            break;
                        }
                        i8++;
                    }
                    if (view == null) {
                        int size4 = arrayList2.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                d1VarD = null;
                                break;
                            }
                            d1VarD = (d1) arrayList2.get(i9);
                            if (!d1VarD.h() && d1VarD.c() == i4 && !d1VarD.f()) {
                                arrayList2.remove(i9);
                                break;
                            }
                            i9++;
                        }
                    } else {
                        d1 d1VarI2 = RecyclerView.I(view);
                        d dVar2 = recyclerView.f1028f;
                        int iIndexOfChild = dVar2.f5095a.f5132a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        c cVar2 = dVar2.f5096b;
                        if (!cVar2.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        cVar2.a(iIndexOfChild);
                        dVar2.k(view);
                        d dVar3 = recyclerView.f1028f;
                        int iIndexOfChild2 = dVar3.f5095a.f5132a.indexOfChild(view);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            c cVar3 = dVar3.f5096b;
                            if (cVar3.d(iIndexOfChild2)) {
                                iB = -1;
                            } else {
                                iB = iIndexOfChild2 - cVar3.b(iIndexOfChild2);
                            }
                        }
                        if (iB == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d1VarI2 + recyclerView.y());
                        }
                        recyclerView.f1028f.c(iB);
                        i(view);
                        d1VarI2.b(8224);
                        d1VarD = d1VarI2;
                        break;
                    }
                } else {
                    d1 d1Var3 = (d1) arrayList3.get(i7);
                    if (!d1Var3.r() && d1Var3.c() == i4 && !d1Var3.h() && (a1Var.f5068g || !d1Var3.j())) {
                        d1Var3.b(32);
                        d1VarD = d1Var3;
                        break;
                    }
                    i7++;
                }
            }
            if (d1VarD != null) {
                if (!d1VarD.j()) {
                    int i10 = d1VarD.f5105c;
                    if (i10 < 0 || i10 >= recyclerView.f1040l.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d1VarD + recyclerView.y());
                    }
                    if (a1Var.f5068g) {
                        g0Var = recyclerView.f1040l;
                        if (g0Var.f5142b) {
                        }
                        z4 = true;
                    } else {
                        recyclerView.f1040l.getClass();
                        if (d1VarD.f5108f == 0) {
                            g0Var = recyclerView.f1040l;
                            if (g0Var.f5142b || d1VarD.f5107e == g0Var.b(d1VarD.f5105c)) {
                                z4 = true;
                            }
                        }
                        d1VarD.b(4);
                        if (d1VarD.k()) {
                            recyclerView.removeDetachedView(d1VarD.f5103a, false);
                            d1VarD.f5116n.k(d1VarD);
                        } else if (d1VarD.r()) {
                            d1VarD.f5112j &= -33;
                        }
                        h(d1VarD);
                        d1VarD = null;
                    }
                } else if (a1Var.f5068g) {
                    z4 = true;
                } else {
                    d1VarD.b(4);
                    if (d1VarD.k()) {
                        recyclerView.removeDetachedView(d1VarD.f5103a, false);
                        d1VarD.f5116n.k(d1VarD);
                    } else if (d1VarD.r()) {
                        d1VarD.f5112j &= -33;
                    }
                    h(d1VarD);
                    d1VarD = null;
                }
            }
        }
        if (d1VarD != null) {
            cVar = null;
        } else {
            int iF2 = recyclerView.f1026e.f(i4, 0);
            if (iF2 < 0 || iF2 >= recyclerView.f1040l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + iF2 + ").state:" + a1Var.b() + recyclerView.y());
            }
            recyclerView.f1040l.getClass();
            g0 g0Var2 = recyclerView.f1040l;
            if (g0Var2.f5142b) {
                long jB2 = g0Var2.b(iF2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                d1VarD = (d1) arrayList2.get(size6);
                                if (d1VarD.f5107e != jB2 || d1VarD.f()) {
                                    size6--;
                                } else {
                                    if (d1VarD.f5108f == 0) {
                                        arrayList2.remove(size6);
                                        break;
                                    }
                                    f(size6);
                                }
                            }
                            d1VarD = null;
                            break;
                        }
                    }
                    d1VarD = (d1) arrayList3.get(size5);
                    if (d1VarD.f5107e == jB2 && !d1VarD.r()) {
                        if (d1VarD.f5108f == 0) {
                            d1VarD.b(32);
                            if (!d1VarD.j() || a1Var.f5068g) {
                                break;
                                break;
                            }
                            d1VarD.f5112j = (d1VarD.f5112j & (-15)) | 2;
                            break;
                        }
                        arrayList3.remove(size5);
                        View view2 = d1VarD.f5103a;
                        recyclerView.removeDetachedView(view2, false);
                        d1 d1VarI3 = RecyclerView.I(view2);
                        d1VarI3.f5116n = null;
                        d1VarI3.f5117o = false;
                        d1VarI3.f5112j &= -33;
                        h(d1VarI3);
                    }
                    size5--;
                }
                if (d1VarD != null) {
                    d1VarD.f5105c = iF2;
                    z4 = true;
                }
            }
            if (d1VarD == null) {
                t0 t0Var = (t0) c().f5307a.get(0);
                if (t0Var == null) {
                    d1Var = null;
                    break;
                }
                ArrayList arrayList5 = t0Var.f5294a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            d1Var = null;
                            break;
                        }
                        if (!((d1) arrayList5.get(size7)).f()) {
                            d1Var = (d1) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    d1Var = null;
                    break;
                }
                if (d1Var != null) {
                    d1Var.o();
                    int[] iArr = RecyclerView.f1016t0;
                }
                d1VarD = d1Var;
            }
            if (d1VarD == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j4 != Long.MAX_VALUE) {
                    long j5 = this.f5320g.a(0).f5296c;
                    if (j5 != 0 && j5 + nanoTime >= j4) {
                        return null;
                    }
                }
                cVar = null;
                g0 g0Var3 = recyclerView.f1040l;
                g0Var3.getClass();
                try {
                    int i11 = e0.l.f1962a;
                    e0.k.a("RV CreateView");
                    d1VarD = g0Var3.d(recyclerView);
                    if (d1VarD.f5103a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    d1VarD.f5108f = 0;
                    e0.k.b();
                    int[] iArr2 = RecyclerView.f1016t0;
                    RecyclerView recyclerViewD = RecyclerView.D(d1VarD.f5103a);
                    if (recyclerViewD != null) {
                        d1VarD.f5104b = new WeakReference(recyclerViewD);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    t0 t0VarA = this.f5320g.a(0);
                    long j6 = t0VarA.f5296c;
                    if (j6 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                    }
                    t0VarA.f5296c = nanoTime2;
                } catch (Throwable th) {
                    int i12 = e0.l.f1962a;
                    e0.k.b();
                    throw th;
                }
            } else {
                cVar = null;
            }
        }
        if (z4 && !a1Var.f5068g && d1VarD.e(8192)) {
            d1VarD.f5112j &= -8193;
            if (a1Var.f5071j) {
                l0.b(d1VarD);
                l0 l0Var = recyclerView.I;
                d1VarD.d();
                l0Var.getClass();
                k0 k0Var = new k0();
                k0Var.a(d1VarD);
                recyclerView.V(d1VarD, k0Var);
            }
        }
        boolean z7 = a1Var.f5068g;
        View view3 = d1VarD.f5103a;
        if (!z7 || !d1VarD.g()) {
            if (!d1VarD.g() || (d1VarD.f5112j & 2) != 0 || d1VarD.h()) {
                int iF3 = recyclerView.f1026e.f(i4, 0);
                d1VarD.f5120r = recyclerView;
                int i13 = d1VarD.f5108f;
                long nanoTime3 = recyclerView.getNanoTime();
                if (j4 != Long.MAX_VALUE) {
                    long j7 = this.f5320g.a(i13).f5297d;
                    if (j7 == 0 || j7 + nanoTime3 < j4) {
                    }
                }
                g0 g0Var4 = recyclerView.f1040l;
                g0Var4.getClass();
                d1VarD.f5105c = iF3;
                if (g0Var4.f5142b) {
                    d1VarD.f5107e = g0Var4.b(iF3);
                }
                d1VarD.f5112j = (d1VarD.f5112j & (-520)) | 1;
                int i14 = e0.l.f1962a;
                e0.k.a("RV OnBindView");
                d1VarD.d();
                g0Var4.c(d1VarD, iF3);
                ArrayList arrayList6 = d1VarD.f5113k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                d1VarD.f5112j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 instanceof p0) {
                    ((p0) layoutParams2).f5275c = true;
                }
                e0.k.b();
                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                t0 t0VarA2 = this.f5320g.a(d1VarD.f5108f);
                long j8 = t0VarA2.f5297d;
                if (j8 != 0) {
                    nanoTime4 = (nanoTime4 / 4) + ((j8 / 4) * 3);
                }
                t0VarA2.f5297d = nanoTime4;
                AccessibilityManager accessibilityManager = recyclerView.f1061y;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    if (i0.e0.c(view3) == 0) {
                        i0.e0.s(view3, 1);
                    }
                    f1 f1Var = recyclerView.f1039k0;
                    if (f1Var != null) {
                        e1 e1Var = f1Var.f5134e;
                        if (e1Var instanceof e1) {
                            e1Var.getClass();
                            View.AccessibilityDelegate accessibilityDelegateC = i0.v0.c(view3);
                            if (accessibilityDelegateC != null) {
                                cVar = accessibilityDelegateC instanceof i0.a ? ((i0.a) accessibilityDelegateC).f2884a : new i0.c(accessibilityDelegateC);
                            }
                            if (cVar != null && cVar != e1Var) {
                                e1Var.f5126e.put(view3, cVar);
                            }
                        }
                        i0.v0.l(view3, e1Var);
                    }
                }
                if (a1Var.f5068g) {
                    d1VarD.f5109g = i4;
                }
                z5 = true;
            }
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
                p0Var = (p0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(p0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                p0Var = (p0) layoutParams;
            } else {
                p0Var = (p0) recyclerView.generateLayoutParams(layoutParams);
                view3.setLayoutParams(p0Var);
            }
            p0Var.f5273a = d1VarD;
            if (z4 && z5) {
                z6 = true;
            }
            p0Var.f5276d = z6;
            return d1VarD;
        }
        d1VarD.f5109g = i4;
        z5 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            p0Var = (p0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(p0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            p0Var = (p0) recyclerView.generateLayoutParams(layoutParams);
            view3.setLayoutParams(p0Var);
        } else {
            p0Var = (p0) layoutParams;
        }
        p0Var.f5273a = d1VarD;
        if (z4) {
            z6 = true;
        }
        p0Var.f5276d = z6;
        return d1VarD;
    }

    public final void k(d1 d1Var) {
        if (d1Var.f5117o) {
            this.f5315b.remove(d1Var);
        } else {
            this.f5314a.remove(d1Var);
        }
        d1Var.f5116n = null;
        d1Var.f5117o = false;
        d1Var.f5112j &= -33;
    }

    public final void l() {
        o0 o0Var = this.f5321h.f1042m;
        this.f5319f = this.f5318e + (o0Var != null ? o0Var.f5237j : 0);
        ArrayList arrayList = this.f5316c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5319f; size--) {
            f(size);
        }
    }
}
