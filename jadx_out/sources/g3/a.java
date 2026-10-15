package g3;

import c3.h;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f2318a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.a0(methods, "throwableMethods");
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            if (i4 >= length) {
                break;
            }
            Method method2 = methods[i4];
            if (h.I(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.a0(parameterTypes, "it.parameterTypes");
                if (h.I(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f2318a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !h.I(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
