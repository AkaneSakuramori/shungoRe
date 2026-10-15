package o2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w.g f3639i = new w.g(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f3640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f3644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f3645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f3646h;

    public m() {
        w.g gVar = f3639i;
        this.f3642d = 0;
        this.f3643e = 0;
        this.f3644f = new l();
        this.f3640b = gVar;
    }

    public final l a(Object obj, boolean z4) {
        int iCompareTo;
        l lVar;
        l lVar2 = this.f3641c;
        w.g gVar = f3639i;
        Comparator comparator = this.f3640b;
        if (lVar2 != null) {
            Comparable comparable = comparator == gVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lVar2.f3636f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lVar2;
                }
                l lVar3 = iCompareTo < 0 ? lVar2.f3632b : lVar2.f3633c;
                if (lVar3 == null) {
                    break;
                }
                lVar2 = lVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z4) {
            return null;
        }
        l lVar4 = this.f3644f;
        if (lVar2 != null) {
            lVar = new l(lVar2, obj, lVar4, lVar4.f3635e);
            if (iCompareTo < 0) {
                lVar2.f3632b = lVar;
            } else {
                lVar2.f3633c = lVar;
            }
            b(lVar2, true);
        } else {
            if (comparator == gVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(lVar2, obj, lVar4, lVar4.f3635e);
            this.f3641c = lVar;
        }
        this.f3642d++;
        this.f3643e++;
        return lVar;
    }

    public final void b(l lVar, boolean z4) {
        while (lVar != null) {
            l lVar2 = lVar.f3632b;
            l lVar3 = lVar.f3633c;
            int i4 = lVar2 != null ? lVar2.f3638h : 0;
            int i5 = lVar3 != null ? lVar3.f3638h : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                l lVar4 = lVar3.f3632b;
                l lVar5 = lVar3.f3633c;
                int i7 = (lVar4 != null ? lVar4.f3638h : 0) - (lVar5 != null ? lVar5.f3638h : 0);
                if (i7 == -1 || (i7 == 0 && !z4)) {
                    e(lVar);
                } else {
                    f(lVar3);
                    e(lVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 2) {
                l lVar6 = lVar2.f3632b;
                l lVar7 = lVar2.f3633c;
                int i8 = (lVar6 != null ? lVar6.f3638h : 0) - (lVar7 != null ? lVar7.f3638h : 0);
                if (i8 == 1 || (i8 == 0 && !z4)) {
                    f(lVar);
                } else {
                    e(lVar2);
                    f(lVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 0) {
                lVar.f3638h = i4 + 1;
                if (z4) {
                    return;
                }
            } else {
                lVar.f3638h = Math.max(i4, i5) + 1;
                if (!z4) {
                    return;
                }
            }
            lVar = lVar.f3631a;
        }
    }

    public final void c(l lVar, boolean z4) {
        l lVar2;
        l lVar3;
        int i4;
        if (z4) {
            l lVar4 = lVar.f3635e;
            lVar4.f3634d = lVar.f3634d;
            lVar.f3634d.f3635e = lVar4;
        }
        l lVar5 = lVar.f3632b;
        l lVar6 = lVar.f3633c;
        l lVar7 = lVar.f3631a;
        int i5 = 0;
        if (lVar5 == null || lVar6 == null) {
            if (lVar5 != null) {
                d(lVar, lVar5);
                lVar.f3632b = null;
            } else if (lVar6 != null) {
                d(lVar, lVar6);
                lVar.f3633c = null;
            } else {
                d(lVar, null);
            }
            b(lVar7, false);
            this.f3642d--;
            this.f3643e++;
            return;
        }
        if (lVar5.f3638h > lVar6.f3638h) {
            l lVar8 = lVar5.f3633c;
            while (true) {
                l lVar9 = lVar8;
                lVar3 = lVar5;
                lVar5 = lVar9;
                if (lVar5 == null) {
                    break;
                } else {
                    lVar8 = lVar5.f3633c;
                }
            }
        } else {
            l lVar10 = lVar6.f3632b;
            while (true) {
                lVar2 = lVar6;
                lVar6 = lVar10;
                if (lVar6 == null) {
                    break;
                } else {
                    lVar10 = lVar6.f3632b;
                }
            }
            lVar3 = lVar2;
        }
        c(lVar3, false);
        l lVar11 = lVar.f3632b;
        if (lVar11 != null) {
            i4 = lVar11.f3638h;
            lVar3.f3632b = lVar11;
            lVar11.f3631a = lVar3;
            lVar.f3632b = null;
        } else {
            i4 = 0;
        }
        l lVar12 = lVar.f3633c;
        if (lVar12 != null) {
            i5 = lVar12.f3638h;
            lVar3.f3633c = lVar12;
            lVar12.f3631a = lVar3;
            lVar.f3633c = null;
        }
        lVar3.f3638h = Math.max(i4, i5) + 1;
        d(lVar, lVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3641c = null;
        this.f3642d = 0;
        this.f3643e++;
        l lVar = this.f3644f;
        lVar.f3635e = lVar;
        lVar.f3634d = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVarA = null;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lVarA != null;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.f3631a;
        lVar.f3631a = null;
        if (lVar2 != null) {
            lVar2.f3631a = lVar3;
        }
        if (lVar3 == null) {
            this.f3641c = lVar2;
        } else if (lVar3.f3632b == lVar) {
            lVar3.f3632b = lVar2;
        } else {
            lVar3.f3633c = lVar2;
        }
    }

    public final void e(l lVar) {
        l lVar2 = lVar.f3632b;
        l lVar3 = lVar.f3633c;
        l lVar4 = lVar3.f3632b;
        l lVar5 = lVar3.f3633c;
        lVar.f3633c = lVar4;
        if (lVar4 != null) {
            lVar4.f3631a = lVar;
        }
        d(lVar, lVar3);
        lVar3.f3632b = lVar;
        lVar.f3631a = lVar3;
        int iMax = Math.max(lVar2 != null ? lVar2.f3638h : 0, lVar4 != null ? lVar4.f3638h : 0) + 1;
        lVar.f3638h = iMax;
        lVar3.f3638h = Math.max(iMax, lVar5 != null ? lVar5.f3638h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f3645g;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f3645g = jVar2;
        return jVar2;
    }

    public final void f(l lVar) {
        l lVar2 = lVar.f3632b;
        l lVar3 = lVar.f3633c;
        l lVar4 = lVar2.f3632b;
        l lVar5 = lVar2.f3633c;
        lVar.f3632b = lVar5;
        if (lVar5 != null) {
            lVar5.f3631a = lVar;
        }
        d(lVar, lVar2);
        lVar2.f3633c = lVar;
        lVar.f3631a = lVar2;
        int iMax = Math.max(lVar3 != null ? lVar3.f3638h : 0, lVar5 != null ? lVar5.f3638h : 0) + 1;
        lVar.f3638h = iMax;
        lVar2.f3638h = Math.max(iMax, lVar4 != null ? lVar4.f3638h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            return lVarA.f3637g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f3646h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f3646h = jVar2;
        return jVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        l lVarA = a(obj, true);
        Object obj3 = lVarA.f3637g;
        lVarA.f3637g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            c(lVarA, true);
        }
        if (lVarA != null) {
            return lVarA.f3637g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3642d;
    }
}
