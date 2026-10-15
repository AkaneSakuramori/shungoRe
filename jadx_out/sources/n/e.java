package n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f3496f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3497b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f3498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f3499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3500e;

    public e() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f3498c = new long[i7];
        this.f3499d = new Object[i7];
    }

    public final void a() {
        int i4 = this.f3500e;
        Object[] objArr = this.f3499d;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f3500e = 0;
        this.f3497b = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f3498c = (long[]) this.f3498c.clone();
            eVar.f3499d = (Object[]) this.f3499d.clone();
            return eVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final void c() {
        int i4 = this.f3500e;
        long[] jArr = this.f3498c;
        Object[] objArr = this.f3499d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f3496f) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f3497b = false;
        this.f3500e = i5;
    }

    public final Object d(long j4, Long l4) {
        Object obj;
        int iB = d.b(this.f3498c, this.f3500e, j4);
        return (iB < 0 || (obj = this.f3499d[iB]) == f3496f) ? l4 : obj;
    }

    public final void e(long j4, Object obj) {
        int iB = d.b(this.f3498c, this.f3500e, j4);
        if (iB >= 0) {
            this.f3499d[iB] = obj;
            return;
        }
        int i4 = ~iB;
        int i5 = this.f3500e;
        if (i4 < i5) {
            Object[] objArr = this.f3499d;
            if (objArr[i4] == f3496f) {
                this.f3498c[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f3497b && i5 >= this.f3498c.length) {
            c();
            i4 = ~d.b(this.f3498c, this.f3500e, j4);
        }
        int i6 = this.f3500e;
        if (i6 >= this.f3498c.length) {
            int i7 = (i6 + 1) * 8;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 8;
            long[] jArr = new long[i10];
            Object[] objArr2 = new Object[i10];
            long[] jArr2 = this.f3498c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3499d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3498c = jArr;
            this.f3499d = objArr2;
        }
        int i11 = this.f3500e - i4;
        if (i11 != 0) {
            long[] jArr3 = this.f3498c;
            int i12 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i12, i11);
            Object[] objArr4 = this.f3499d;
            System.arraycopy(objArr4, i4, objArr4, i12, this.f3500e - i4);
        }
        this.f3498c[i4] = j4;
        this.f3499d[i4] = obj;
        this.f3500e++;
    }

    public final int f() {
        if (this.f3497b) {
            c();
        }
        return this.f3500e;
    }

    public final Object g(int i4) {
        if (this.f3497b) {
            c();
        }
        return this.f3499d[i4];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3500e * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f3500e; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            if (this.f3497b) {
                c();
            }
            sb.append(this.f3498c[i4]);
            sb.append('=');
            Object objG = g(i4);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
