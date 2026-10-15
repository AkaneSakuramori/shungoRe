package o2;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3623b;

    public h(String str) {
        this.f3623b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3623b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Object obj2 = ((h) obj).f3623b;
        String str = this.f3623b;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3623b);
    }

    public final int hashCode() {
        return this.f3623b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f3623b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f3623b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f3623b;
    }
}
