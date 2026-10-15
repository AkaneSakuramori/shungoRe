package y0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f5079d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.e f5076a = new p.e(30, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5077b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5078c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.k f5080e = new androidx.fragment.app.k(2, this);

    public b(f0 f0Var) {
        this.f5079d = f0Var;
    }

    public final boolean a(int i4) {
        ArrayList arrayList = this.f5078c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            int i6 = aVar.f5057a;
            if (i6 == 8) {
                if (f(aVar.f5060d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = aVar.f5058b;
                int i8 = aVar.f5060d + i7;
                while (i7 < i8) {
                    if (f(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f5078c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f5079d.a((a) arrayList.get(i4));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f5077b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f5057a;
            f0 f0Var = this.f5079d;
            if (i5 == 1) {
                f0Var.a(aVar);
                f0Var.d(aVar.f5058b, aVar.f5060d);
            } else if (i5 == 2) {
                f0Var.a(aVar);
                int i6 = aVar.f5058b;
                int i7 = aVar.f5060d;
                RecyclerView recyclerView = f0Var.f5132a;
                recyclerView.O(i6, i7, true);
                recyclerView.f1031g0 = true;
                recyclerView.f1025d0.f5064c += i7;
            } else if (i5 == 4) {
                f0Var.a(aVar);
                f0Var.c(aVar.f5058b, aVar.f5060d, aVar.f5059c);
            } else if (i5 == 8) {
                f0Var.a(aVar);
                f0Var.e(aVar.f5058b, aVar.f5060d);
            }
        }
        l(arrayList);
    }

    public final void d(a aVar) {
        int i4;
        int i5 = aVar.f5057a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(aVar.f5058b, i5);
        int i6 = aVar.f5058b;
        int i7 = aVar.f5057a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < aVar.f5060d; i9++) {
            int iM2 = m((i4 * i9) + aVar.f5058b, aVar.f5057a);
            int i10 = aVar.f5057a;
            if (i10 == 2 ? iM2 != iM : !(i10 == 4 && iM2 == iM + 1)) {
                a aVarH = h(aVar.f5059c, i10, iM, i8);
                e(aVarH, i6);
                k(aVarH);
                if (aVar.f5057a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                iM = iM2;
            } else {
                i8++;
            }
        }
        Object obj = aVar.f5059c;
        k(aVar);
        if (i8 > 0) {
            a aVarH2 = h(obj, aVar.f5057a, iM, i8);
            e(aVarH2, i6);
            k(aVarH2);
        }
    }

    public final void e(a aVar, int i4) {
        f0 f0Var = this.f5079d;
        f0Var.a(aVar);
        int i5 = aVar.f5057a;
        if (i5 != 2) {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            f0Var.c(i4, aVar.f5060d, aVar.f5059c);
        } else {
            int i6 = aVar.f5060d;
            RecyclerView recyclerView = f0Var.f5132a;
            recyclerView.O(i4, i6, true);
            recyclerView.f1031g0 = true;
            recyclerView.f1025d0.f5064c += i6;
        }
    }

    public final int f(int i4, int i5) {
        ArrayList arrayList = this.f5078c;
        int size = arrayList.size();
        while (i5 < size) {
            a aVar = (a) arrayList.get(i5);
            int i6 = aVar.f5057a;
            if (i6 == 8) {
                int i7 = aVar.f5058b;
                if (i7 == i4) {
                    i4 = aVar.f5060d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (aVar.f5060d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = aVar.f5058b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = aVar.f5060d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += aVar.f5060d;
                }
            }
            i5++;
        }
        return i4;
    }

    public final boolean g() {
        return this.f5077b.size() > 0;
    }

    public final a h(Object obj, int i4, int i5, int i6) {
        a aVar = (a) this.f5076a.a();
        if (aVar != null) {
            aVar.f5057a = i4;
            aVar.f5058b = i5;
            aVar.f5060d = i6;
            aVar.f5059c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f5057a = i4;
        aVar2.f5058b = i5;
        aVar2.f5060d = i6;
        aVar2.f5059c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f5078c.add(aVar);
        int i4 = aVar.f5057a;
        f0 f0Var = this.f5079d;
        if (i4 == 1) {
            f0Var.d(aVar.f5058b, aVar.f5060d);
            return;
        }
        if (i4 == 2) {
            int i5 = aVar.f5058b;
            int i6 = aVar.f5060d;
            RecyclerView recyclerView = f0Var.f5132a;
            recyclerView.O(i5, i6, false);
            recyclerView.f1031g0 = true;
            return;
        }
        if (i4 == 4) {
            f0Var.c(aVar.f5058b, aVar.f5060d, aVar.f5059c);
        } else if (i4 == 8) {
            f0Var.e(aVar.f5058b, aVar.f5060d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    public final void j() {
        byte b5;
        boolean z4;
        byte b6;
        a aVarH;
        int i4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        ArrayList arrayList = this.f5077b;
        androidx.fragment.app.k kVar = this.f5080e;
        kVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z7 = false;
            while (true) {
                b5 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f5057a != 8) {
                    z7 = true;
                } else if (z7) {
                    break;
                }
                size--;
            }
            a aVarH2 = null;
            if (size == -1) {
                break;
            }
            int i7 = size + 1;
            a aVar = (a) arrayList.get(size);
            a aVar2 = (a) arrayList.get(i7);
            int i8 = aVar2.f5057a;
            if (i8 != 1) {
                Object obj = kVar.f785c;
                if (i8 == 2) {
                    int i9 = aVar.f5058b;
                    int i10 = aVar.f5060d;
                    if (i9 < i10) {
                        z6 = aVar2.f5058b == i9 && aVar2.f5060d == i10 - i9;
                        z5 = false;
                    } else if (aVar2.f5058b == i10 + 1 && aVar2.f5060d == i9 - i10) {
                        z6 = true;
                        z5 = true;
                    } else {
                        z5 = true;
                        z6 = false;
                    }
                    int i11 = aVar2.f5058b;
                    if (i10 < i11) {
                        aVar2.f5058b = i11 - 1;
                    } else {
                        int i12 = aVar2.f5060d;
                        if (i10 < i11 + i12) {
                            aVar2.f5060d = i12 - 1;
                            aVar.f5057a = 2;
                            aVar.f5060d = 1;
                            if (aVar2.f5060d == 0) {
                                arrayList.remove(i7);
                                ((b) obj).k(aVar2);
                            }
                        }
                    }
                    int i13 = aVar.f5058b;
                    int i14 = aVar2.f5058b;
                    if (i13 <= i14) {
                        aVar2.f5058b = i14 + 1;
                    } else {
                        int i15 = i14 + aVar2.f5060d;
                        if (i13 < i15) {
                            aVarH2 = ((b) obj).h(null, 2, i13 + 1, i15 - i13);
                            aVar2.f5060d = aVar.f5058b - aVar2.f5058b;
                        }
                    }
                    if (z6) {
                        arrayList.set(size, aVar2);
                        arrayList.remove(i7);
                        ((b) obj).k(aVar);
                    } else {
                        if (z5) {
                            if (aVarH2 != null) {
                                int i16 = aVar.f5058b;
                                if (i16 > aVarH2.f5058b) {
                                    aVar.f5058b = i16 - aVarH2.f5060d;
                                }
                                int i17 = aVar.f5060d;
                                if (i17 > aVarH2.f5058b) {
                                    aVar.f5060d = i17 - aVarH2.f5060d;
                                }
                            }
                            int i18 = aVar.f5058b;
                            if (i18 > aVar2.f5058b) {
                                aVar.f5058b = i18 - aVar2.f5060d;
                            }
                            int i19 = aVar.f5060d;
                            if (i19 > aVar2.f5058b) {
                                aVar.f5060d = i19 - aVar2.f5060d;
                            }
                        } else {
                            if (aVarH2 != null) {
                                int i20 = aVar.f5058b;
                                if (i20 >= aVarH2.f5058b) {
                                    aVar.f5058b = i20 - aVarH2.f5060d;
                                }
                                int i21 = aVar.f5060d;
                                if (i21 >= aVarH2.f5058b) {
                                    aVar.f5060d = i21 - aVarH2.f5060d;
                                }
                            }
                            int i22 = aVar.f5058b;
                            if (i22 >= aVar2.f5058b) {
                                aVar.f5058b = i22 - aVar2.f5060d;
                            }
                            int i23 = aVar.f5060d;
                            if (i23 >= aVar2.f5058b) {
                                aVar.f5060d = i23 - aVar2.f5060d;
                            }
                        }
                        arrayList.set(size, aVar2);
                        if (aVar.f5058b != aVar.f5060d) {
                            arrayList.set(i7, aVar);
                        } else {
                            arrayList.remove(i7);
                        }
                        if (aVarH2 != null) {
                            arrayList.add(size, aVarH2);
                        }
                    }
                } else if (i8 == 4) {
                    int i24 = aVar.f5060d;
                    int i25 = aVar2.f5058b;
                    if (i24 < i25) {
                        aVar2.f5058b = i25 - 1;
                    } else {
                        int i26 = aVar2.f5060d;
                        if (i24 < i25 + i26) {
                            aVar2.f5060d = i26 - 1;
                            aVarH = ((b) obj).h(aVar2.f5059c, 4, aVar.f5058b, 1);
                        }
                        i4 = aVar.f5058b;
                        i5 = aVar2.f5058b;
                        if (i4 <= i5) {
                            aVar2.f5058b = i5 + 1;
                        } else {
                            i6 = i5 + aVar2.f5060d;
                            if (i4 < i6) {
                                int i27 = i6 - i4;
                                aVarH2 = ((b) obj).h(aVar2.f5059c, 4, i4 + 1, i27);
                                aVar2.f5060d -= i27;
                            }
                        }
                        arrayList.set(i7, aVar);
                        if (aVar2.f5060d > 0) {
                            arrayList.set(size, aVar2);
                        } else {
                            arrayList.remove(size);
                            ((b) obj).k(aVar2);
                        }
                        if (aVarH != null) {
                            arrayList.add(size, aVarH);
                        }
                        if (aVarH2 != null) {
                            arrayList.add(size, aVarH2);
                        }
                    }
                    aVarH = null;
                    i4 = aVar.f5058b;
                    i5 = aVar2.f5058b;
                    if (i4 <= i5) {
                        aVar2.f5058b = i5 + 1;
                    } else {
                        i6 = i5 + aVar2.f5060d;
                        if (i4 < i6) {
                            int i28 = i6 - i4;
                            aVarH2 = ((b) obj).h(aVar2.f5059c, 4, i4 + 1, i28);
                            aVar2.f5060d -= i28;
                        }
                    }
                    arrayList.set(i7, aVar);
                    if (aVar2.f5060d > 0) {
                        arrayList.set(size, aVar2);
                    } else {
                        arrayList.remove(size);
                        ((b) obj).k(aVar2);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
            } else {
                int i29 = aVar.f5060d;
                int i30 = aVar2.f5058b;
                int i31 = i29 < i30 ? -1 : 0;
                int i32 = aVar.f5058b;
                if (i32 < i30) {
                    i31++;
                }
                if (i30 <= i32) {
                    aVar.f5058b = i32 + aVar2.f5060d;
                }
                int i33 = aVar2.f5058b;
                if (i33 <= i29) {
                    aVar.f5060d = i29 + aVar2.f5060d;
                }
                aVar2.f5058b = i33 + i31;
                arrayList.set(size, aVar2);
                arrayList.set(i7, aVar);
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            a aVarH3 = (a) arrayList.get(i34);
            int i35 = aVarH3.f5057a;
            if (i35 != 1) {
                f0 f0Var = this.f5079d;
                if (i35 == 2) {
                    int i36 = aVarH3.f5058b;
                    int i37 = aVarH3.f5060d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    byte b7 = -1;
                    while (i38 < i37) {
                        if (f0Var.b(i38) != null || a(i38)) {
                            if (b7 == 0) {
                                d(h(null, 2, i36, i39));
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            b6 = 1;
                        } else {
                            if (b7 == 1) {
                                i(h(null, 2, i36, i39));
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            b6 = 0;
                        }
                        if (z4) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        b7 = b6;
                    }
                    if (i39 != aVarH3.f5060d) {
                        k(aVarH3);
                        aVarH3 = h(null, 2, i36, i39);
                    }
                    if (b7 == 0) {
                        d(aVarH3);
                    } else {
                        i(aVarH3);
                    }
                } else if (i35 == 4) {
                    int i40 = aVarH3.f5058b;
                    int i41 = aVarH3.f5060d + i40;
                    int i42 = i40;
                    int i43 = 0;
                    while (i40 < i41) {
                        if (f0Var.b(i40) != null || a(i40)) {
                            if (b5 == 0) {
                                d(h(aVarH3.f5059c, 4, i42, i43));
                                i42 = i40;
                                i43 = 0;
                            }
                            b5 = 1;
                        } else {
                            if (b5 == 1) {
                                i(h(aVarH3.f5059c, 4, i42, i43));
                                i42 = i40;
                                i43 = 0;
                            }
                            b5 = 0;
                        }
                        i43++;
                        i40++;
                    }
                    if (i43 != aVarH3.f5060d) {
                        Object obj2 = aVarH3.f5059c;
                        k(aVarH3);
                        aVarH3 = h(obj2, 4, i42, i43);
                    }
                    if (b5 == 0) {
                        d(aVarH3);
                    } else {
                        i(aVarH3);
                    }
                } else if (i35 == 8) {
                    i(aVarH3);
                }
            } else {
                i(aVarH3);
            }
            i34++;
            b5 = -1;
        }
        arrayList.clear();
    }

    public final void k(a aVar) {
        aVar.f5059c = null;
        this.f5076a.b(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k((a) arrayList.get(i4));
        }
        arrayList.clear();
    }

    public final int m(int i4, int i5) {
        int i6;
        int i7;
        ArrayList arrayList = this.f5078c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i8 = aVar.f5057a;
            if (i8 == 8) {
                int i9 = aVar.f5058b;
                int i10 = aVar.f5060d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            aVar.f5058b = i9 + 1;
                            aVar.f5060d = i10 + 1;
                        } else if (i5 == 2) {
                            aVar.f5058b = i9 - 1;
                            aVar.f5060d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        aVar.f5060d = i10 + 1;
                    } else if (i5 == 2) {
                        aVar.f5060d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        aVar.f5058b = i9 + 1;
                    } else if (i5 == 2) {
                        aVar.f5058b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = aVar.f5058b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= aVar.f5060d;
                    } else if (i8 == 2) {
                        i4 += aVar.f5060d;
                    }
                } else if (i5 == 1) {
                    aVar.f5058b = i11 + 1;
                } else if (i5 == 2) {
                    aVar.f5058b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f5057a == 8) {
                int i12 = aVar2.f5060d;
                if (i12 == aVar2.f5058b || i12 < 0) {
                    arrayList.remove(size2);
                    k(aVar2);
                }
            } else if (aVar2.f5060d <= 0) {
                arrayList.remove(size2);
                k(aVar2);
            }
        }
        return i4;
    }
}
