package o2;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f3607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f3608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type[] f3609d;

    public b(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z4 = true;
            boolean z5 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z5) {
                z4 = false;
            }
            c3.h.V(z4);
        }
        this.f3607b = type == null ? null : d.a(type);
        this.f3608c = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f3609d = typeArr2;
        int length = typeArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f3609d[i4].getClass();
            d.b(this.f3609d[i4]);
            Type[] typeArr3 = this.f3609d;
            typeArr3[i4] = d.a(typeArr3[i4]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f3609d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3607b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3608c;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f3609d) ^ this.f3608c.hashCode();
        Type type = this.f3607b;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f3609d;
        int length = typeArr.length;
        Type type = this.f3608c;
        if (length == 0) {
            return d.h(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.h(type));
        sb.append("<");
        sb.append(d.h(typeArr[0]));
        for (int i4 = 1; i4 < length; i4++) {
            sb.append(", ");
            sb.append(d.h(typeArr[i4]));
        }
        sb.append(">");
        return sb.toString();
    }
}
