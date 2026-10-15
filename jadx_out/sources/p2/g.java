package p2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t2.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f3780u = new f();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f3781v = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f3782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f3784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f3785t;

    @Override // t2.b
    public final String F() {
        StringBuilder sb = new StringBuilder("$");
        int i4 = 0;
        while (true) {
            int i5 = this.f3783r;
            if (i4 >= i5) {
                return sb.toString();
            }
            Object[] objArr = this.f3782q;
            Object obj = objArr[i4];
            if (obj instanceof m2.o) {
                i4++;
                if (i4 < i5 && (objArr[i4] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f3785t[i4]);
                    sb.append(']');
                }
            } else if ((obj instanceof m2.t) && (i4 = i4 + 1) < i5 && (objArr[i4] instanceof Iterator)) {
                sb.append('.');
                String str = this.f3784s[i4];
                if (str != null) {
                    sb.append(str);
                }
            }
            i4++;
        }
    }

    @Override // t2.b
    public final boolean G() {
        int iT = T();
        return (iT == 4 || iT == 2) ? false : true;
    }

    @Override // t2.b
    public final boolean J() {
        a0(8);
        boolean zB = ((m2.u) d0()).b();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return zB;
    }

    @Override // t2.b
    public final double K() {
        int iT = T();
        if (iT != 7 && iT != 6) {
            throw new IllegalStateException("Expected " + defpackage.a.s(7) + " but was " + defpackage.a.s(iT) + b0());
        }
        m2.u uVar = (m2.u) c0();
        double dDoubleValue = uVar.f3477b instanceof Number ? uVar.c().doubleValue() : Double.parseDouble(uVar.d());
        if (!this.f4257c && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return dDoubleValue;
    }

    @Override // t2.b
    public final int L() {
        int iT = T();
        if (iT != 7 && iT != 6) {
            throw new IllegalStateException("Expected " + defpackage.a.s(7) + " but was " + defpackage.a.s(iT) + b0());
        }
        m2.u uVar = (m2.u) c0();
        int iIntValue = uVar.f3477b instanceof Number ? uVar.c().intValue() : Integer.parseInt(uVar.d());
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return iIntValue;
    }

    @Override // t2.b
    public final long M() {
        int iT = T();
        if (iT != 7 && iT != 6) {
            throw new IllegalStateException("Expected " + defpackage.a.s(7) + " but was " + defpackage.a.s(iT) + b0());
        }
        m2.u uVar = (m2.u) c0();
        long jLongValue = uVar.f3477b instanceof Number ? uVar.c().longValue() : Long.parseLong(uVar.d());
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return jLongValue;
    }

    @Override // t2.b
    public final String N() {
        a0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) c0()).next();
        String str = (String) entry.getKey();
        this.f3784s[this.f3783r - 1] = str;
        e0(entry.getValue());
        return str;
    }

    @Override // t2.b
    public final void P() {
        a0(9);
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // t2.b
    public final String R() {
        int iT = T();
        if (iT != 6 && iT != 7) {
            throw new IllegalStateException("Expected " + defpackage.a.s(6) + " but was " + defpackage.a.s(iT) + b0());
        }
        String strD = ((m2.u) d0()).d();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return strD;
    }

    @Override // t2.b
    public final int T() {
        if (this.f3783r == 0) {
            return 10;
        }
        Object objC0 = c0();
        if (objC0 instanceof Iterator) {
            boolean z4 = this.f3782q[this.f3783r - 2] instanceof m2.t;
            Iterator it = (Iterator) objC0;
            if (!it.hasNext()) {
                return z4 ? 4 : 2;
            }
            if (z4) {
                return 5;
            }
            e0(it.next());
            return T();
        }
        if (objC0 instanceof m2.t) {
            return 3;
        }
        if (objC0 instanceof m2.o) {
            return 1;
        }
        if (!(objC0 instanceof m2.u)) {
            if (objC0 instanceof m2.s) {
                return 9;
            }
            if (objC0 == f3781v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((m2.u) objC0).f3477b;
        if (serializable instanceof String) {
            return 6;
        }
        if (serializable instanceof Boolean) {
            return 8;
        }
        if (serializable instanceof Number) {
            return 7;
        }
        throw new AssertionError();
    }

    @Override // t2.b
    public final void Y() {
        if (T() == 5) {
            N();
            this.f3784s[this.f3783r - 2] = "null";
        } else {
            d0();
            int i4 = this.f3783r;
            if (i4 > 0) {
                this.f3784s[i4 - 1] = "null";
            }
        }
        int i5 = this.f3783r;
        if (i5 > 0) {
            int[] iArr = this.f3785t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // t2.b
    public final void a() {
        a0(1);
        e0(((m2.o) c0()).f3474b.iterator());
        this.f3785t[this.f3783r - 1] = 0;
    }

    public final void a0(int i4) {
        if (T() == i4) {
            return;
        }
        throw new IllegalStateException("Expected " + defpackage.a.s(i4) + " but was " + defpackage.a.s(T()) + b0());
    }

    public final String b0() {
        return " at path " + F();
    }

    public final Object c0() {
        return this.f3782q[this.f3783r - 1];
    }

    @Override // t2.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3782q = new Object[]{f3781v};
        this.f3783r = 1;
    }

    public final Object d0() {
        Object[] objArr = this.f3782q;
        int i4 = this.f3783r - 1;
        this.f3783r = i4;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    @Override // t2.b
    public final void e() {
        a0(3);
        e0(((o2.j) ((m2.t) c0()).f3476b.entrySet()).iterator());
    }

    public final void e0(Object obj) {
        int i4 = this.f3783r;
        Object[] objArr = this.f3782q;
        if (i4 == objArr.length) {
            int i5 = i4 * 2;
            this.f3782q = Arrays.copyOf(objArr, i5);
            this.f3785t = Arrays.copyOf(this.f3785t, i5);
            this.f3784s = (String[]) Arrays.copyOf(this.f3784s, i5);
        }
        Object[] objArr2 = this.f3782q;
        int i6 = this.f3783r;
        this.f3783r = i6 + 1;
        objArr2[i6] = obj;
    }

    @Override // t2.b
    public final String toString() {
        return g.class.getSimpleName() + b0();
    }

    @Override // t2.b
    public final void x() {
        a0(2);
        d0();
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // t2.b
    public final void z() {
        a0(4);
        d0();
        d0();
        int i4 = this.f3783r;
        if (i4 > 0) {
            int[] iArr = this.f3785t;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }
}
