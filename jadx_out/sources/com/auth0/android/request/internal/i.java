package com.auth0.android.request.internal;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1319b;

    public /* synthetic */ i(int i4) {
        this.f1319b = i4;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        switch (this.f1319b) {
            case 0:
                return new h(this, mVar.d(this, typeToken), 0).a();
            case 1:
                Type type = typeToken.getType();
                boolean z4 = type instanceof GenericArrayType;
                if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new p2.a(mVar, mVar.c(TypeToken.get(genericComponentType)), o2.d.f(genericComponentType));
            case 2:
                if (typeToken.getRawType() == Date.class) {
                    return new p2.c();
                }
                return null;
            case 3:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new h(rawType);
            case 4:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new s2.a();
                }
                return null;
            case 5:
                if (typeToken.getRawType() == Time.class) {
                    return new s2.b();
                }
                return null;
            default:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                mVar.getClass();
                return new s2.c(mVar.c(TypeToken.get(Date.class)));
        }
    }
}
