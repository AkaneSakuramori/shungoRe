package j1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c3.h f3211b;

    static {
        String str;
        k3.n.f3277a.getClass();
        Class cls = new k3.c(p0.class).f3266a;
        c3.h.b0(cls, "jClass");
        String simpleName = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName2 = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    simpleName = q3.l.q3(simpleName2, enclosingMethod.getName() + '$');
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        simpleName = q3.l.q3(simpleName2, enclosingConstructor.getName() + '$');
                    } else {
                        int iY2 = q3.l.Y2(simpleName2, '$', 0, false, 6);
                        if (iY2 == -1) {
                            simpleName = simpleName2;
                        } else {
                            String strSubstring = simpleName2.substring(iY2 + 1, simpleName2.length());
                            c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            simpleName = strSubstring;
                        }
                    }
                }
            } else {
                boolean zIsArray = cls.isArray();
                LinkedHashMap linkedHashMap = k3.c.f3265c;
                if (zIsArray) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        simpleName = str.concat("Array");
                    }
                    if (simpleName == null) {
                        simpleName = "Array";
                    }
                } else {
                    simpleName = (String) linkedHashMap.get(cls.getName());
                    if (simpleName == null) {
                        simpleName = cls.getSimpleName();
                    }
                }
            }
        }
        f3210a = simpleName;
    }
}
