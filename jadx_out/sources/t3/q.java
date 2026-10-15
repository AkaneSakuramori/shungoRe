package t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f4410b;

    public q(String[] strArr) {
        this.f4410b = strArr;
    }

    public final String a(String str) {
        c3.h.b0(str, "name");
        String[] strArr = this.f4410b;
        int length = strArr.length - 2;
        int iZ0 = c3.h.Z0(length, 0, -2);
        if (iZ0 <= length) {
            while (!q3.l.U2(str, strArr[length])) {
                if (length != iZ0) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i4) {
        return this.f4410b[i4 * 2];
    }

    public final p c() {
        p pVar = new p();
        ArrayList arrayList = pVar.f4409a;
        c3.h.b0(arrayList, "<this>");
        String[] strArr = this.f4410b;
        c3.h.b0(strArr, "elements");
        arrayList.addAll(a3.j.Q2(strArr));
        return pVar;
    }

    public final String d(int i4) {
        return this.f4410b[(i4 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.f4410b, ((q) obj).f4410b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4410b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        z2.a[] aVarArr = new z2.a[size];
        for (int i4 = 0; i4 < size; i4++) {
            aVarArr[i4] = new z2.a(b(i4), d(i4));
        }
        return new a3.c(aVarArr);
    }

    public final int size() {
        return this.f4410b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String strB = b(i4);
            String strD = d(i4);
            sb.append(strB);
            sb.append(": ");
            if (u3.b.p(strB)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        String string = sb.toString();
        c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
