package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f938b;

    public b(int i4, Method method) {
        this.f937a = i4;
        this.f938b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f937a == bVar.f937a && this.f938b.getName().equals(bVar.f938b.getName());
    }

    public final int hashCode() {
        return this.f938b.getName().hashCode() + (this.f937a * 31);
    }
}
