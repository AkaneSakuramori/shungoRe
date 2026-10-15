package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Collection, Set {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f3484f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[] f3485g = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object[] f3486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f3487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object[] f3488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f3489k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f3493e;

    public c(int i4) {
        if (i4 == 0) {
            this.f3490b = f3484f;
            this.f3491c = f3485g;
        } else {
            a(i4);
        }
        this.f3492d = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f3489k < 10) {
                        objArr[0] = f3488j;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f3488j = objArr;
                        f3489k++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f3487i < 10) {
                        objArr[0] = f3486h;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f3486h = objArr;
                        f3487i++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i4) {
        if (i4 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f3488j;
                    if (objArr != null) {
                        this.f3491c = objArr;
                        f3488j = (Object[]) objArr[0];
                        this.f3490b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3489k--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f3486h;
                    if (objArr2 != null) {
                        this.f3491c = objArr2;
                        f3486h = (Object[]) objArr2[0];
                        this.f3490b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3487i--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f3490b = new int[i4];
        this.f3491c = new Object[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int iC;
        if (obj == null) {
            iC = d();
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            iC = c(iHashCode, obj);
        }
        if (iC >= 0) {
            return false;
        }
        int i5 = ~iC;
        int i6 = this.f3492d;
        int[] iArr = this.f3490b;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f3491c;
            a(i7);
            int[] iArr2 = this.f3490b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3491c, 0, objArr.length);
            }
            b(iArr, objArr, this.f3492d);
        }
        int i8 = this.f3492d;
        if (i5 < i8) {
            int[] iArr3 = this.f3490b;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f3491c;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f3492d - i5);
        }
        this.f3490b[i5] = i4;
        this.f3491c[i5] = obj;
        this.f3492d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3492d;
        int[] iArr = this.f3490b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3491c;
            a(size);
            int i4 = this.f3492d;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f3490b, 0, i4);
                System.arraycopy(objArr, 0, this.f3491c, 0, this.f3492d);
            }
            b(iArr, objArr, this.f3492d);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final int c(int i4, Object obj) {
        int i5 = this.f3492d;
        if (i5 == 0) {
            return -1;
        }
        int iA = d.a(i5, i4, this.f3490b);
        if (iA < 0 || obj.equals(this.f3491c[iA])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f3490b[i6] == i4) {
            if (obj.equals(this.f3491c[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f3490b[i7] == i4; i7--) {
            if (obj.equals(this.f3491c[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i4 = this.f3492d;
        if (i4 != 0) {
            b(this.f3490b, this.f3491c, i4);
            this.f3490b = f3484f;
            this.f3491c = f3485g;
            this.f3492d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i4 = this.f3492d;
        if (i4 == 0) {
            return -1;
        }
        int iA = d.a(i4, 0, this.f3490b);
        if (iA < 0 || this.f3491c[iA] == null) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f3490b[i5] == 0) {
            if (this.f3491c[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f3490b[i6] == 0; i6--) {
            if (this.f3491c[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void e(int i4) {
        Object[] objArr = this.f3491c;
        Object obj = objArr[i4];
        int i5 = this.f3492d;
        if (i5 <= 1) {
            b(this.f3490b, objArr, i5);
            this.f3490b = f3484f;
            this.f3491c = f3485g;
            this.f3492d = 0;
            return;
        }
        int[] iArr = this.f3490b;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            int i6 = i5 - 1;
            this.f3492d = i6;
            if (i4 < i6) {
                int i7 = i4 + 1;
                System.arraycopy(iArr, i7, iArr, i4, i6 - i4);
                Object[] objArr2 = this.f3491c;
                System.arraycopy(objArr2, i7, objArr2, i4, this.f3492d - i4);
            }
            this.f3491c[this.f3492d] = null;
            return;
        }
        a(i5 > 8 ? i5 + (i5 >> 1) : 8);
        this.f3492d--;
        if (i4 > 0) {
            System.arraycopy(iArr, 0, this.f3490b, 0, i4);
            System.arraycopy(objArr, 0, this.f3491c, 0, i4);
        }
        int i8 = this.f3492d;
        if (i4 < i8) {
            int i9 = i4 + 1;
            System.arraycopy(iArr, i9, this.f3490b, i4, i8 - i4);
            System.arraycopy(objArr, i9, this.f3491c, i4, this.f3492d - i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3492d != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f3492d; i4++) {
                try {
                    if (!set.contains(this.f3491c[i4])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3490b;
        int i4 = this.f3492d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3492d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f3493e == null) {
            this.f3493e = new a(1, this);
        }
        a aVar = this.f3493e;
        if (((h) aVar.f2351b) == null) {
            aVar.f2351b = new h(aVar, 1);
        }
        return ((h) aVar.f2351b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i4 = this.f3492d - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f3491c[i4])) {
                e(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3492d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i4 = this.f3492d;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f3491c, 0, objArr, 0, i4);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3492d * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f3492d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3491c[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3492d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3492d);
        }
        System.arraycopy(this.f3491c, 0, objArr, 0, this.f3492d);
        int length = objArr.length;
        int i4 = this.f3492d;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
