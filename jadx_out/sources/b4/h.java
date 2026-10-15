package b4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1124c;

    public h(ArrayList arrayList) {
        this.f1122a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        c3.h.b0(obj, "proxy");
        c3.h.b0(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (c3.h.I(name, "supports") && c3.h.I(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (c3.h.I(name, "unsupported") && c3.h.I(Void.TYPE, returnType)) {
            this.f1123b = true;
            return null;
        }
        boolean zI = c3.h.I(name, "protocols");
        List list = this.f1122a;
        if (zI && objArr.length == 0) {
            return list;
        }
        if ((c3.h.I(name, "selectProtocol") || c3.h.I(name, "select")) && c3.h.I(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                c3.h.Y(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i4 = 0;
                    while (true) {
                        Object obj3 = list2.get(i4);
                        c3.h.Y(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.f1124c = str;
                            return str;
                        }
                        if (i4 != size) {
                            i4++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f1124c = str2;
                return str2;
            }
        }
        if ((!c3.h.I(name, "protocolSelected") && !c3.h.I(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        c3.h.Y(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f1124c = (String) obj4;
        return null;
    }
}
