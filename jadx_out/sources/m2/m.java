package m2;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeToken f3452j = TypeToken.get(Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f3453a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3454b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a0 f3455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2.b f3456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3461i;

    public m(o2.f fVar, a aVar, Map map, boolean z4, int i4, List list, v vVar, w wVar) {
        i.a0 a0Var = new i.a0(map);
        this.f3455c = a0Var;
        int i5 = 0;
        this.f3458f = false;
        this.f3459g = false;
        this.f3460h = z4;
        this.f3461i = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(p2.x.f3866z);
        int i6 = 1;
        arrayList.add(vVar == z.f3478b ? p2.n.f3801c : new p2.l(i6, vVar));
        arrayList.add(fVar);
        arrayList.addAll(list);
        arrayList.add(p2.x.f3855o);
        arrayList.add(p2.x.f3847g);
        arrayList.add(p2.x.f3844d);
        arrayList.add(p2.x.f3845e);
        arrayList.add(p2.x.f3846f);
        j jVar = i4 == 1 ? p2.x.f3851k : new j(i5);
        arrayList.add(p2.x.b(Long.TYPE, Long.class, jVar));
        arrayList.add(p2.x.b(Double.TYPE, Double.class, new i(0)));
        arrayList.add(p2.x.b(Float.TYPE, Float.class, new i(1)));
        arrayList.add(wVar == z.f3479c ? p2.m.f3799b : new p2.l(i5, new p2.m(wVar)));
        arrayList.add(p2.x.f3848h);
        arrayList.add(p2.x.f3849i);
        arrayList.add(p2.x.a(AtomicLong.class, new k(jVar, 0).a()));
        arrayList.add(p2.x.a(AtomicLongArray.class, new k(jVar, 1).a()));
        arrayList.add(p2.x.f3850j);
        arrayList.add(p2.x.f3852l);
        arrayList.add(p2.x.f3856p);
        arrayList.add(p2.x.f3857q);
        arrayList.add(p2.x.a(BigDecimal.class, p2.x.f3853m));
        arrayList.add(p2.x.a(BigInteger.class, p2.x.f3854n));
        arrayList.add(p2.x.f3858r);
        arrayList.add(p2.x.f3859s);
        arrayList.add(p2.x.f3861u);
        arrayList.add(p2.x.f3862v);
        arrayList.add(p2.x.f3864x);
        arrayList.add(p2.x.f3860t);
        arrayList.add(p2.x.f3842b);
        arrayList.add(p2.c.f3776b);
        arrayList.add(p2.x.f3863w);
        if (s2.e.f4232a) {
            arrayList.add(s2.e.f4236e);
            arrayList.add(s2.e.f4235d);
            arrayList.add(s2.e.f4237f);
        }
        arrayList.add(p2.a.f3771c);
        arrayList.add(p2.x.f3841a);
        arrayList.add(new p2.b(a0Var, i5));
        arrayList.add(new p2.k(a0Var));
        p2.b bVar = new p2.b(a0Var, i6);
        this.f3456d = bVar;
        arrayList.add(bVar);
        arrayList.add(p2.x.A);
        arrayList.add(new p2.q(a0Var, aVar, fVar, bVar));
        this.f3457e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(q qVar, Type type) {
        Object objB = null;
        if (qVar == null) {
            return null;
        }
        p2.g gVar = new p2.g(p2.g.f3780u);
        gVar.f3782q = new Object[32];
        boolean z4 = false;
        gVar.f3783r = 0;
        gVar.f3784s = new String[32];
        gVar.f3785t = new int[32];
        gVar.e0(qVar);
        boolean z5 = gVar.f4257c;
        gVar.f4257c = true;
        try {
            try {
                try {
                    try {
                        gVar.T();
                        try {
                            objB = c(TypeToken.get(type)).b(gVar);
                        } catch (EOFException e5) {
                            e = e5;
                            if (!z4) {
                                throw new r(e);
                            }
                        }
                    } catch (Throwable th) {
                        gVar.f4257c = z5;
                        throw th;
                    }
                } catch (EOFException e6) {
                    e = e6;
                    z4 = true;
                }
                gVar.f4257c = z5;
                return objB;
            } catch (IOException e7) {
                throw new r(e7);
            }
        } catch (AssertionError e8) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e8.getMessage());
            assertionError.initCause(e8);
            throw assertionError;
        } catch (IllegalStateException e9) {
            throw new r(e9);
        }
    }

    public final b0 c(TypeToken typeToken) {
        boolean z4;
        ConcurrentHashMap concurrentHashMap = this.f3454b;
        b0 b0Var = (b0) concurrentHashMap.get(typeToken == null ? f3452j : typeToken);
        if (b0Var != null) {
            return b0Var;
        }
        ThreadLocal threadLocal = this.f3453a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            z4 = false;
        }
        l lVar = (l) map.get(typeToken);
        if (lVar != null) {
            return lVar;
        }
        try {
            l lVar2 = new l();
            map.put(typeToken, lVar2);
            Iterator it = this.f3457e.iterator();
            while (it.hasNext()) {
                b0 b0VarA = ((c0) it.next()).a(this, typeToken);
                if (b0VarA != null) {
                    if (lVar2.f3451a != null) {
                        throw new AssertionError();
                    }
                    lVar2.f3451a = b0VarA;
                    concurrentHashMap.put(typeToken, b0VarA);
                    map.remove(typeToken);
                    if (z4) {
                        threadLocal.remove();
                    }
                    return b0VarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + typeToken);
        } catch (Throwable th) {
            map.remove(typeToken);
            if (z4) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final b0 d(c0 c0Var, TypeToken typeToken) {
        List<c0> list = this.f3457e;
        if (!list.contains(c0Var)) {
            c0Var = this.f3456d;
        }
        boolean z4 = false;
        for (c0 c0Var2 : list) {
            if (z4) {
                b0 b0VarA = c0Var2.a(this, typeToken);
                if (b0VarA != null) {
                    return b0VarA;
                }
            } else if (c0Var2 == c0Var) {
                z4 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final t2.c e(Writer writer) throws IOException {
        if (this.f3459g) {
            writer.write(")]}'\n");
        }
        t2.c cVar = new t2.c(writer);
        if (this.f3461i) {
            cVar.f4276e = "  ";
            cVar.f4277f = ": ";
        }
        cVar.f4281j = this.f3458f;
        return cVar;
    }

    public final String f(Map map) {
        if (map == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                h(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e5) {
                throw new r(e5);
            }
        }
        Class cls = map.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            g(map, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e6) {
            throw new r(e6);
        }
    }

    public final void g(Map map, Class cls, t2.c cVar) {
        b0 b0VarC = c(TypeToken.get((Type) cls));
        boolean z4 = cVar.f4278g;
        cVar.f4278g = true;
        boolean z5 = cVar.f4279h;
        cVar.f4279h = this.f3460h;
        boolean z6 = cVar.f4281j;
        cVar.f4281j = this.f3458f;
        try {
            try {
                try {
                    b0VarC.c(cVar, map);
                    cVar.f4278g = z4;
                    cVar.f4279h = z5;
                    cVar.f4281j = z6;
                } catch (IOException e5) {
                    throw new r(e5);
                }
            } catch (AssertionError e6) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e6.getMessage());
                assertionError.initCause(e6);
                throw assertionError;
            }
        } catch (Throwable th) {
            cVar.f4278g = z4;
            cVar.f4279h = z5;
            cVar.f4281j = z6;
            throw th;
        }
    }

    public final void h(t2.c cVar) {
        s sVar = s.f3475b;
        boolean z4 = cVar.f4278g;
        cVar.f4278g = true;
        boolean z5 = cVar.f4279h;
        cVar.f4279h = this.f3460h;
        boolean z6 = cVar.f4281j;
        cVar.f4281j = this.f3458f;
        try {
            try {
                c3.h.N2(sVar, cVar);
                cVar.f4278g = z4;
                cVar.f4279h = z5;
                cVar.f4281j = z6;
            } catch (IOException e5) {
                throw new r(e5);
            } catch (AssertionError e6) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e6.getMessage());
                assertionError.initCause(e6);
                throw assertionError;
            }
        } catch (Throwable th) {
            cVar.f4278g = z4;
            cVar.f4279h = z5;
            cVar.f4281j = z6;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f3458f + ",factories:" + this.f3457e + ",instanceCreators:" + this.f3455c + "}";
    }
}
