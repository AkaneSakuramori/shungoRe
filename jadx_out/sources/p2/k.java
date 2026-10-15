package p2;

import com.google.gson.reflect.TypeToken;
import i.a0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f3795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3796c = false;

    public k(a0 a0Var) {
        this.f3795b = a0Var;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Class clsF = o2.d.f(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            c3.h.V(Map.class.isAssignableFrom(clsF));
            Type typeG = o2.d.g(type, clsF, o2.d.e(type, clsF, Map.class), new HashMap());
            actualTypeArguments = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new j(this, mVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? x.f3843c : mVar.c(TypeToken.get(type2)), actualTypeArguments[1], mVar.c(TypeToken.get(actualTypeArguments[1])), this.f3795b.r(typeToken));
    }
}
