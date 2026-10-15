package a1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.p;
import c3.h;
import com.shungo.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f52d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f53e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f56c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f55b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f54a = new HashMap();

    public a(Context context) {
        this.f56c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f52d == null) {
            synchronized (f53e) {
                try {
                    if (f52d == null) {
                        f52d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f52d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f56c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f55b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new p(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (h.o1()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f54a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f56c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new p(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
