package p2;

import com.google.gson.reflect.TypeToken;
import i.a0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f3775c;

    public /* synthetic */ b(a0 a0Var, int i4) {
        this.f3774b = i4;
        this.f3775c = a0Var;
    }

    public static b0 b(a0 a0Var, m2.m mVar, TypeToken typeToken, n2.a aVar) {
        b0 sVar;
        Object objD = a0Var.r(TypeToken.get(aVar.value())).d();
        if (objD instanceof b0) {
            sVar = (b0) objD;
        } else if (objD instanceof c0) {
            sVar = ((c0) objD).a(mVar, typeToken);
        } else {
            boolean z4 = objD instanceof m2.p;
            if (!z4) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objD.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            sVar = new s(z4 ? (m2.p) objD : null, mVar, typeToken, null);
        }
        return (sVar == null || !aVar.nullSafe()) ? sVar : sVar.a();
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        int i4 = this.f3774b;
        a0 a0Var = this.f3775c;
        switch (i4) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                c3.h.V(Collection.class.isAssignableFrom(rawType));
                Type typeG = o2.d.g(type, rawType, o2.d.e(type, rawType, Collection.class), new HashMap());
                if (typeG instanceof WildcardType) {
                    typeG = ((WildcardType) typeG).getUpperBounds()[0];
                }
                Type type2 = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments()[0] : Object.class;
                return new com.auth0.android.request.internal.h(mVar, type2, mVar.c(TypeToken.get(type2)), a0Var.r(typeToken));
            default:
                n2.a aVar = (n2.a) typeToken.getRawType().getAnnotation(n2.a.class);
                if (aVar == null) {
                    return null;
                }
                return b(a0Var, mVar, typeToken, aVar);
        }
    }
}
