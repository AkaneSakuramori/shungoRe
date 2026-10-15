package m2;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f3477b;

    public u(Boolean bool) {
        bool.getClass();
        this.f3477b = bool;
    }

    public static boolean e(u uVar) {
        Serializable serializable = uVar.f3477b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean b() {
        Serializable serializable = this.f3477b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d());
    }

    public final Number c() {
        Serializable serializable = this.f3477b;
        return serializable instanceof String ? new o2.h((String) serializable) : (Number) serializable;
    }

    public final String d() {
        Serializable serializable = this.f3477b;
        if (serializable instanceof Number) {
            return c().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        Serializable serializable = this.f3477b;
        Serializable serializable2 = uVar.f3477b;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (e(this) && e(uVar)) {
            return c().longValue() == uVar.c().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = c().doubleValue();
        double dDoubleValue2 = uVar.c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f3477b;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public u(Number number) {
        number.getClass();
        this.f3477b = number;
    }

    public u(String str) {
        str.getClass();
        this.f3477b = str;
    }
}
