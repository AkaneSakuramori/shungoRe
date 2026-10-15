package p2;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.m f3830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f3831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f3832c;

    public t(m2.m mVar, b0 b0Var, Type type) {
        this.f3830a = mVar;
        this.f3831b = b0Var;
        this.f3832c = type;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        return this.f3831b.b(bVar);
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        Type type = this.f3832c;
        Type type2 = (obj == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : obj.getClass();
        b0 b0Var = this.f3831b;
        if (type2 != type) {
            b0 b0VarC = this.f3830a.c(TypeToken.get(type2));
            if (!(b0VarC instanceof p) || (b0Var instanceof p)) {
                b0Var = b0VarC;
            }
        }
        b0Var.c(cVar, obj);
    }
}
