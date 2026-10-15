package o2;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f3610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f3611c;

    public c(Type[] typeArr, Type[] typeArr2) {
        c3.h.V(typeArr2.length <= 1);
        c3.h.V(typeArr.length == 1);
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            d.b(typeArr[0]);
            this.f3611c = null;
            this.f3610b = d.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        d.b(typeArr2[0]);
        c3.h.V(typeArr[0] == Object.class);
        this.f3611c = d.a(typeArr2[0]);
        this.f3610b = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3611c;
        return type != null ? new Type[]{type} : d.f3612a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f3610b};
    }

    public final int hashCode() {
        Type type = this.f3611c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3610b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f3611c;
        if (type != null) {
            return "? super " + d.h(type);
        }
        Type type2 = this.f3610b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.h(type2);
    }
}
