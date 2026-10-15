package a3;

import j1.y;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f68e = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f70c = f68e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71d;

    public final void a(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f70c.length;
        while (i4 < length && it.hasNext()) {
            this.f70c[i4] = it.next();
            i4++;
        }
        int i5 = this.f69b;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f70c[i6] = it.next();
        }
        this.f71d = collection.size() + this.f71d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c3.h.b0(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f71d);
        a(d(this.f69b + this.f71d), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        b(this.f71d + 1);
        int length = this.f69b;
        if (length == 0) {
            Object[] objArr = this.f70c;
            c3.h.b0(objArr, "<this>");
            length = objArr.length;
        }
        int i4 = length - 1;
        this.f69b = i4;
        this.f70c[i4] = obj;
        this.f71d++;
    }

    public final void addLast(Object obj) {
        b(this.f71d + 1);
        this.f70c[d(this.f69b + this.f71d)] = obj;
        this.f71d++;
    }

    public final void b(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f70c;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f68e) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f70c = new Object[i4];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i4 < 0) {
            i5 = i4;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        j.T2(objArr, objArr2, 0, this.f69b, objArr.length);
        Object[] objArr3 = this.f70c;
        int length2 = objArr3.length;
        int i6 = this.f69b;
        j.T2(objArr3, objArr2, length2 - i6, 0, i6);
        this.f69b = 0;
        this.f70c = objArr2;
    }

    public final int c(int i4) {
        Object[] objArr = this.f70c;
        c3.h.b0(objArr, "<this>");
        if (i4 == objArr.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iD = d(this.f69b + this.f71d);
        int i4 = this.f69b;
        if (i4 < iD) {
            Object[] objArr = this.f70c;
            c3.h.b0(objArr, "<this>");
            Arrays.fill(objArr, i4, iD, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f70c;
            Arrays.fill(objArr2, this.f69b, objArr2.length, (Object) null);
            Object[] objArr3 = this.f70c;
            c3.h.b0(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iD, (Object) null);
        }
        this.f69b = 0;
        this.f71d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        Object[] objArr = this.f70c;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        y.b(i4, this.f71d);
        return this.f70c[d(this.f69b + i4)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int iD = d(this.f69b + this.f71d);
        int length = this.f69b;
        if (length < iD) {
            while (length < iD) {
                if (c3.h.I(obj, this.f70c[length])) {
                    i4 = this.f69b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iD) {
            return -1;
        }
        int length2 = this.f70c.length;
        while (length < length2) {
            if (c3.h.I(obj, this.f70c[length])) {
                i4 = this.f69b;
            } else {
                length++;
            }
        }
        for (int i5 = 0; i5 < iD; i5++) {
            if (c3.h.I(obj, this.f70c[i5])) {
                length = i5 + this.f70c.length;
                i4 = this.f69b;
            }
        }
        return -1;
        return length - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f71d == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int iD = d(this.f69b + this.f71d);
        int i5 = this.f69b;
        if (i5 < iD) {
            length = iD - 1;
            if (i5 <= length) {
                while (!c3.h.I(obj, this.f70c[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f69b;
                return length - i4;
            }
            return -1;
        }
        if (i5 > iD) {
            for (int i6 = iD - 1; -1 < i6; i6--) {
                if (c3.h.I(obj, this.f70c[i6])) {
                    length = i6 + this.f70c.length;
                    i4 = this.f69b;
                    return length - i4;
                }
            }
            Object[] objArr = this.f70c;
            c3.h.b0(objArr, "<this>");
            length = objArr.length - 1;
            int i7 = this.f69b;
            if (i7 <= length) {
                while (!c3.h.I(obj, this.f70c[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i4 = this.f69b;
                return length - i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iD;
        c3.h.b0(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f70c.length != 0) {
            int iD2 = d(this.f69b + this.f71d);
            int i4 = this.f69b;
            if (i4 < iD2) {
                iD = i4;
                while (i4 < iD2) {
                    Object obj = this.f70c[i4];
                    if (!collection.contains(obj)) {
                        this.f70c[iD] = obj;
                        iD++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                Object[] objArr = this.f70c;
                c3.h.b0(objArr, "<this>");
                Arrays.fill(objArr, iD, iD2, (Object) null);
            } else {
                int length = this.f70c.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f70c;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj2)) {
                        this.f70c[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                iD = d(i5);
                for (int i6 = 0; i6 < iD2; i6++) {
                    Object[] objArr3 = this.f70c;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (!collection.contains(obj3)) {
                        this.f70c[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                int length2 = iD - this.f69b;
                if (length2 < 0) {
                    length2 += this.f70c.length;
                }
                this.f71d = length2;
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f70c;
        int i4 = this.f69b;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f69b = c(i4);
        this.f71d--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iD = d(c3.h.W0(this) + this.f69b);
        Object[] objArr = this.f70c;
        Object obj = objArr[iD];
        objArr[iD] = null;
        this.f71d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iD;
        c3.h.b0(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f70c.length != 0) {
            int iD2 = d(this.f69b + this.f71d);
            int i4 = this.f69b;
            if (i4 < iD2) {
                iD = i4;
                while (i4 < iD2) {
                    Object obj = this.f70c[i4];
                    if (collection.contains(obj)) {
                        this.f70c[iD] = obj;
                        iD++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                Object[] objArr = this.f70c;
                c3.h.b0(objArr, "<this>");
                Arrays.fill(objArr, iD, iD2, (Object) null);
            } else {
                int length = this.f70c.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f70c;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f70c[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                iD = d(i5);
                for (int i6 = 0; i6 < iD2; i6++) {
                    Object[] objArr3 = this.f70c;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f70c[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                int length2 = iD - this.f69b;
                if (length2 < 0) {
                    length2 += this.f70c.length;
                }
                this.f71d = length2;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        y.b(i4, this.f71d);
        int iD = d(this.f69b + i4);
        Object[] objArr = this.f70c;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        c3.h.b0(objArr, "array");
        int length = objArr.length;
        int i4 = this.f71d;
        if (length < i4) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            c3.h.Y(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iD = d(this.f69b + this.f71d);
        int i5 = this.f69b;
        if (i5 < iD) {
            j.U2(this.f70c, objArr, 0, i5, iD, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f70c;
            j.T2(objArr2, objArr, 0, this.f69b, objArr2.length);
            Object[] objArr3 = this.f70c;
            j.T2(objArr3, objArr, objArr3.length - this.f69b, 0, iD);
        }
        int length2 = objArr.length;
        int i6 = this.f71d;
        if (length2 > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int length;
        y.c(i4, this.f71d);
        int i5 = this.f71d;
        if (i4 == i5) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        b(i5 + 1);
        int iD = d(this.f69b + i4);
        int i6 = this.f71d;
        if (i4 < ((i6 + 1) >> 1)) {
            if (iD == 0) {
                Object[] objArr = this.f70c;
                c3.h.b0(objArr, "<this>");
                iD = objArr.length;
            }
            int i7 = iD - 1;
            int i8 = this.f69b;
            if (i8 == 0) {
                Object[] objArr2 = this.f70c;
                c3.h.b0(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i8 - 1;
            }
            int i9 = this.f69b;
            if (i7 >= i9) {
                Object[] objArr3 = this.f70c;
                objArr3[length] = objArr3[i9];
                j.T2(objArr3, objArr3, i9, i9 + 1, i7 + 1);
            } else {
                Object[] objArr4 = this.f70c;
                j.T2(objArr4, objArr4, i9 - 1, i9, objArr4.length);
                Object[] objArr5 = this.f70c;
                objArr5[objArr5.length - 1] = objArr5[0];
                j.T2(objArr5, objArr5, 0, 1, i7 + 1);
            }
            this.f70c[i7] = obj;
            this.f69b = length;
        } else {
            int iD2 = d(this.f69b + i6);
            if (iD < iD2) {
                Object[] objArr6 = this.f70c;
                j.T2(objArr6, objArr6, iD + 1, iD, iD2);
            } else {
                Object[] objArr7 = this.f70c;
                j.T2(objArr7, objArr7, 1, 0, iD2);
                Object[] objArr8 = this.f70c;
                objArr8[0] = objArr8[objArr8.length - 1];
                j.T2(objArr8, objArr8, iD + 1, iD, objArr8.length - 1);
            }
            this.f70c[iD] = obj;
        }
        this.f71d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        c3.h.b0(collection, "elements");
        y.c(i4, this.f71d);
        if (collection.isEmpty()) {
            return false;
        }
        int i5 = this.f71d;
        if (i4 == i5) {
            return addAll(collection);
        }
        b(collection.size() + i5);
        int iD = d(this.f69b + this.f71d);
        int iD2 = d(this.f69b + i4);
        int size = collection.size();
        if (i4 < ((this.f71d + 1) >> 1)) {
            int i6 = this.f69b;
            int length = i6 - size;
            if (iD2 < i6) {
                Object[] objArr = this.f70c;
                j.T2(objArr, objArr, length, i6, objArr.length);
                if (size >= iD2) {
                    Object[] objArr2 = this.f70c;
                    j.T2(objArr2, objArr2, objArr2.length - size, 0, iD2);
                } else {
                    Object[] objArr3 = this.f70c;
                    j.T2(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f70c;
                    j.T2(objArr4, objArr4, 0, size, iD2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f70c;
                j.T2(objArr5, objArr5, length, i6, iD2);
            } else {
                Object[] objArr6 = this.f70c;
                length += objArr6.length;
                int i7 = iD2 - i6;
                int length2 = objArr6.length - length;
                if (length2 >= i7) {
                    j.T2(objArr6, objArr6, length, i6, iD2);
                } else {
                    j.T2(objArr6, objArr6, length, i6, i6 + length2);
                    Object[] objArr7 = this.f70c;
                    j.T2(objArr7, objArr7, 0, this.f69b + length2, iD2);
                }
            }
            this.f69b = length;
            int length3 = iD2 - size;
            if (length3 < 0) {
                length3 += this.f70c.length;
            }
            a(length3, collection);
        } else {
            int i8 = iD2 + size;
            if (iD2 < iD) {
                int i9 = size + iD;
                Object[] objArr8 = this.f70c;
                if (i9 <= objArr8.length) {
                    j.T2(objArr8, objArr8, i8, iD2, iD);
                } else if (i8 >= objArr8.length) {
                    j.T2(objArr8, objArr8, i8 - objArr8.length, iD2, iD);
                } else {
                    int length4 = iD - (i9 - objArr8.length);
                    j.T2(objArr8, objArr8, 0, length4, iD);
                    Object[] objArr9 = this.f70c;
                    j.T2(objArr9, objArr9, i8, iD2, length4);
                }
            } else {
                Object[] objArr10 = this.f70c;
                j.T2(objArr10, objArr10, size, 0, iD);
                Object[] objArr11 = this.f70c;
                if (i8 >= objArr11.length) {
                    j.T2(objArr11, objArr11, i8 - objArr11.length, iD2, objArr11.length);
                } else {
                    j.T2(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f70c;
                    j.T2(objArr12, objArr12, i8, iD2, objArr12.length - size);
                }
            }
            a(iD2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f71d]);
    }
}
