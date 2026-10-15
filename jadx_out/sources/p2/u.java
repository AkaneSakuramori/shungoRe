package p2;

import com.google.gson.reflect.TypeToken;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f3835d;

    public /* synthetic */ u(Object obj, b0 b0Var, int i4) {
        this.f3833b = i4;
        this.f3834c = obj;
        this.f3835d = b0Var;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        int i4 = this.f3833b;
        b0 b0Var = this.f3835d;
        Object obj = this.f3834c;
        switch (i4) {
            case 0:
                if (typeToken.getRawType() == ((Class) obj)) {
                    return b0Var;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) obj).isAssignableFrom(rawType)) {
                    return new com.auth0.android.request.internal.h(this, rawType, 3);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) obj)) {
                    return b0Var;
                }
                return null;
        }
    }

    public final String toString() {
        int i4 = this.f3833b;
        b0 b0Var = this.f3835d;
        Object obj = this.f3834c;
        switch (i4) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + b0Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + b0Var + "]";
            default:
                return super.toString();
        }
    }
}
