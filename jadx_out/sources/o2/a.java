package o2;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f3606b;

    public a(Type type) {
        this.f3606b = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f3606b;
    }

    public final int hashCode() {
        return this.f3606b.hashCode();
    }

    public final String toString() {
        return d.h(this.f3606b) + "[]";
    }
}
