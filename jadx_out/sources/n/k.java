package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Object[] f3518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object[] f3520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f3521h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3522b = d.f3494a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3523c = d.f3495b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3524d = 0;

    public static void c(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f3521h < 10) {
                        objArr[0] = f3520g;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f3520g = objArr;
                        f3521h++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f3519f < 10) {
                        objArr[0] = f3518e;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f3518e = objArr;
                        f3519f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i4) {
        if (i4 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f3520g;
                    if (objArr != null) {
                        this.f3523c = objArr;
                        f3520g = (Object[]) objArr[0];
                        this.f3522b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3521h--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f3518e;
                    if (objArr2 != null) {
                        this.f3523c = objArr2;
                        f3518e = (Object[]) objArr2[0];
                        this.f3522b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3519f--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f3522b = new int[i4];
        this.f3523c = new Object[i4 << 1];
    }

    public final void b(int i4) {
        int i5 = this.f3524d;
        int[] iArr = this.f3522b;
        if (iArr.length < i4) {
            Object[] objArr = this.f3523c;
            a(i4);
            if (this.f3524d > 0) {
                System.arraycopy(iArr, 0, this.f3522b, 0, i5);
                System.arraycopy(objArr, 0, this.f3523c, 0, i5 << 1);
            }
            c(iArr, objArr, i5);
        }
        if (this.f3524d != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i4 = this.f3524d;
        if (i4 > 0) {
            int[] iArr = this.f3522b;
            Object[] objArr = this.f3523c;
            this.f3522b = d.f3494a;
            this.f3523c = d.f3495b;
            this.f3524d = 0;
            c(iArr, objArr, i4);
        }
        if (this.f3524d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i4, Object obj) {
        int i5 = this.f3524d;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i5, i4, this.f3522b);
            if (iA < 0 || obj.equals(this.f3523c[iA << 1])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && this.f3522b[i6] == i4) {
                if (obj.equals(this.f3523c[i6 << 1])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && this.f3522b[i7] == i4; i7--) {
                if (obj.equals(this.f3523c[i7 << 1])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3524d != kVar.f3524d) {
                return false;
            }
            for (int i4 = 0; i4 < this.f3524d; i4++) {
                try {
                    Object objH = h(i4);
                    Object objJ = j(i4);
                    Object orDefault = kVar.getOrDefault(objH, null);
                    if (objJ == null) {
                        if (orDefault != null || !kVar.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objJ.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3524d != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f3524d; i5++) {
                try {
                    Object objH2 = h(i5);
                    Object objJ2 = j(i5);
                    Object obj2 = map.get(objH2);
                    if (objJ2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objJ2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i4 = this.f3524d;
        if (i4 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i4, 0, this.f3522b);
            if (iA < 0 || this.f3523c[iA << 1] == null) {
                return iA;
            }
            int i5 = iA + 1;
            while (i5 < i4 && this.f3522b[i5] == 0) {
                if (this.f3523c[i5 << 1] == null) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iA - 1; i6 >= 0 && this.f3522b[i6] == 0; i6--) {
                if (this.f3523c[i6 << 1] == null) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i4 = this.f3524d * 2;
        Object[] objArr = this.f3523c;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f3523c[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i4) {
        return this.f3523c[i4 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f3522b;
        Object[] objArr = this.f3523c;
        int i4 = this.f3524d;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i4) {
        Object[] objArr = this.f3523c;
        int i5 = i4 << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f3524d;
        int i7 = 0;
        if (i6 <= 1) {
            c(this.f3522b, objArr, i6);
            this.f3522b = d.f3494a;
            this.f3523c = d.f3495b;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f3522b;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    int i10 = i8 - i4;
                    System.arraycopy(iArr, i9, iArr, i4, i10);
                    Object[] objArr2 = this.f3523c;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.f3523c;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f3524d) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f3522b, 0, i4);
                    System.arraycopy(objArr, 0, this.f3523c, 0, i5);
                }
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, this.f3522b, i4, i13);
                    System.arraycopy(objArr, i12 << 1, this.f3523c, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f3524d) {
            throw new ConcurrentModificationException();
        }
        this.f3524d = i7;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f3524d <= 0;
    }

    public final Object j(int i4) {
        return this.f3523c[(i4 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i4;
        int iD;
        int i5 = this.f3524d;
        if (obj == null) {
            iD = f();
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i6 = (iD << 1) + 1;
            Object[] objArr = this.f3523c;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iD;
        int[] iArr = this.f3522b;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f3523c;
            a(i8);
            if (i5 != this.f3524d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3522b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3523c, 0, objArr2.length);
            }
            c(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f3522b;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f3523c;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f3524d - i7) << 1);
        }
        int i10 = this.f3524d;
        if (i5 == i10) {
            int[] iArr4 = this.f3522b;
            if (i7 < iArr4.length) {
                iArr4[i7] = i4;
                Object[] objArr4 = this.f3523c;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f3524d = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        int i4 = (iE << 1) + 1;
        Object[] objArr = this.f3523c;
        Object obj3 = objArr[i4];
        objArr[i4] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f3524d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3524d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f3524d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objH = h(i4);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i4);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (obj2 != objJ && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (objJ != obj2 && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        int i4 = (iE << 1) + 1;
        Object[] objArr = this.f3523c;
        Object obj4 = objArr[i4];
        objArr[i4] = obj3;
        return true;
    }
}
