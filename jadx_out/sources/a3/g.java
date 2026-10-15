package a3;

import j1.y;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractList implements List {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        i iVar = (i) this;
        y.b(i4, iVar.f71d);
        if (i4 == c3.h.W0(iVar)) {
            return iVar.removeLast();
        }
        if (i4 == 0) {
            return iVar.removeFirst();
        }
        int iD = iVar.d(iVar.f69b + i4);
        Object[] objArr = iVar.f70c;
        Object obj = objArr[iD];
        if (i4 < (iVar.f71d >> 1)) {
            int i5 = iVar.f69b;
            if (iD >= i5) {
                j.T2(objArr, objArr, i5 + 1, i5, iD);
            } else {
                j.T2(objArr, objArr, 1, 0, iD);
                Object[] objArr2 = iVar.f70c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = iVar.f69b;
                j.T2(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = iVar.f70c;
            int i7 = iVar.f69b;
            objArr3[i7] = null;
            iVar.f69b = iVar.c(i7);
        } else {
            int iD2 = iVar.d(c3.h.W0(iVar) + iVar.f69b);
            if (iD <= iD2) {
                Object[] objArr4 = iVar.f70c;
                j.T2(objArr4, objArr4, iD, iD + 1, iD2 + 1);
            } else {
                Object[] objArr5 = iVar.f70c;
                j.T2(objArr5, objArr5, iD, iD + 1, objArr5.length);
                Object[] objArr6 = iVar.f70c;
                objArr6[objArr6.length - 1] = objArr6[0];
                j.T2(objArr6, objArr6, 0, 1, iD2 + 1);
            }
            iVar.f70c[iD2] = null;
        }
        iVar.f71d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((i) this).f71d;
    }
}
