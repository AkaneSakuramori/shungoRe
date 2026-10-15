package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f935a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f936b;

    public a(HashMap map) {
        this.f936b = map;
        for (Map.Entry entry : map.entrySet()) {
            l lVar = (l) entry.getValue();
            List arrayList = (List) this.f935a.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f935a.put(lVar, arrayList);
            }
            arrayList.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                bVar.getClass();
                try {
                    int i4 = bVar.f937a;
                    Method method = bVar.f938b;
                    if (i4 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i4 == 1) {
                        method.invoke(obj, rVar);
                    } else if (i4 == 2) {
                        method.invoke(obj, rVar, lVar);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
