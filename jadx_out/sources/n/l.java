package n;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3525e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3528d;

    public l() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 4;
        this.f3526b = new int[i7];
        this.f3527c = new Object[i7];
    }

    public final void a(int i4, Object obj) {
        int i5 = this.f3528d;
        if (i5 != 0 && i4 <= this.f3526b[i5 - 1]) {
            d(i4, obj);
            return;
        }
        if (i5 >= this.f3526b.length) {
            int i6 = (i5 + 1) * 4;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr = new Object[i9];
            int[] iArr2 = this.f3526b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3527c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3526b = iArr;
            this.f3527c = objArr;
        }
        this.f3526b[i5] = i4;
        this.f3527c[i5] = obj;
        this.f3528d = i5 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f3526b = (int[]) this.f3526b.clone();
            lVar.f3527c = (Object[]) this.f3527c.clone();
            return lVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final Object c(int i4, Integer num) {
        Object obj;
        int iA = d.a(this.f3528d, i4, this.f3526b);
        return (iA < 0 || (obj = this.f3527c[iA]) == f3525e) ? num : obj;
    }

    public final void d(int i4, Object obj) {
        int iA = d.a(this.f3528d, i4, this.f3526b);
        if (iA >= 0) {
            this.f3527c[iA] = obj;
            return;
        }
        int i5 = ~iA;
        int i6 = this.f3528d;
        if (i5 < i6) {
            Object[] objArr = this.f3527c;
            if (objArr[i5] == f3525e) {
                this.f3526b[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (i6 >= this.f3526b.length) {
            int i7 = (i6 + 1) * 4;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 4;
            int[] iArr = new int[i10];
            Object[] objArr2 = new Object[i10];
            int[] iArr2 = this.f3526b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3527c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3526b = iArr;
            this.f3527c = objArr2;
        }
        int i11 = this.f3528d - i5;
        if (i11 != 0) {
            int[] iArr3 = this.f3526b;
            int i12 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i12, i11);
            Object[] objArr4 = this.f3527c;
            System.arraycopy(objArr4, i5, objArr4, i12, this.f3528d - i5);
        }
        this.f3526b[i5] = i4;
        this.f3527c[i5] = obj;
        this.f3528d++;
    }

    public final String toString() {
        int i4 = this.f3528d;
        if (i4 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i4 * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f3528d; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3526b[i5]);
            sb.append('=');
            Object obj = this.f3527c[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
