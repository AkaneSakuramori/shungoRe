package com.auth0.android.request.internal;

import androidx.fragment.app.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m2.b0;
import m2.c0;
import m2.r;
import p2.t;
import p2.u;
import p2.w;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1318c;

    public /* synthetic */ h(c0 c0Var, Object obj, int i4) {
        this.f1316a = i4;
        this.f1318c = c0Var;
        this.f1317b = obj;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) throws t2.d {
        Date dateB;
        Collection collection = null;
        switch (this.f1316a) {
            case 0:
                Object objB = ((b0) this.f1317b).b(bVar);
                for (Field field : objB.getClass().getDeclaredFields()) {
                    if (field.getAnnotation(g.class) != null) {
                        try {
                            field.setAccessible(true);
                            if (field.get(objB) == null) {
                                throw new p(String.format("Missing required attribute %s", field.getName()));
                            }
                        } catch (IllegalAccessException unused) {
                            throw new p(String.format("Missing required attribute %s", field.getName()));
                        }
                    }
                }
                return objB;
            case 1:
                if (bVar.T() == 9) {
                    bVar.P();
                } else {
                    collection = (Collection) ((o2.n) this.f1318c).d();
                    bVar.a();
                    while (bVar.G()) {
                        collection.add(((b0) this.f1317b).b(bVar));
                    }
                    bVar.x();
                }
                return collection;
            case 2:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                String strR = bVar.R();
                synchronized (((List) this.f1318c)) {
                    try {
                        Iterator it = ((List) this.f1318c).iterator();
                        while (it.hasNext()) {
                            try {
                                dateB = ((DateFormat) it.next()).parse(strR);
                            } catch (ParseException unused2) {
                            }
                        }
                        try {
                            dateB = q2.a.b(strR, new ParsePosition(0));
                        } catch (ParseException e5) {
                            throw new r(strR, e5);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ((p2.e) this.f1317b).a(dateB);
            case 3:
                Object objB2 = ((u) this.f1318c).f3835d.b(bVar);
                if (objB2 != null) {
                    Class cls = (Class) this.f1317b;
                    if (!cls.isInstance(objB2)) {
                        throw new r("Expected a " + cls.getName() + " but was " + objB2.getClass().getName());
                    }
                }
                return objB2;
            default:
                if (bVar.T() != 9) {
                    return (Enum) ((Map) this.f1317b).get(bVar.R());
                }
                bVar.P();
                return null;
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        switch (this.f1316a) {
            case 0:
                ((b0) this.f1317b).c(cVar, obj);
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    cVar.G();
                    return;
                }
                cVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((b0) this.f1317b).c(cVar, it.next());
                }
                cVar.x();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    cVar.G();
                    return;
                }
                synchronized (((List) this.f1318c)) {
                    cVar.M(((DateFormat) ((List) this.f1318c).get(0)).format(date));
                    break;
                }
                return;
            case 3:
                ((u) this.f1318c).f3835d.c(cVar, obj);
                return;
            default:
                Enum r5 = (Enum) obj;
                cVar.M(r5 == null ? null : (String) ((Map) this.f1318c).get(r5));
                return;
        }
    }

    public final String toString() {
        switch (this.f1316a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((List) this.f1318c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(p2.e eVar, int i4, int i5, int i6) {
        this(eVar, i4, i5);
        this.f1316a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(p2.e eVar, String str, int i4) {
        this(eVar, str);
        this.f1316a = 2;
    }

    public h(m2.m mVar, Type type, b0 b0Var, o2.n nVar) {
        this.f1316a = 1;
        this.f1317b = new t(mVar, b0Var, type);
        this.f1318c = nVar;
    }

    public h(p2.e eVar, String str) {
        this.f1316a = 2;
        ArrayList arrayList = new ArrayList();
        this.f1318c = arrayList;
        eVar.getClass();
        this.f1317b = eVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public h(p2.e eVar, int i4, int i5) {
        this.f1316a = 2;
        ArrayList arrayList = new ArrayList();
        this.f1318c = arrayList;
        eVar.getClass();
        this.f1317b = eVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i4, i5, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i4, i5));
        }
        if (o2.g.f3622a >= 9) {
            arrayList.add(c3.h.d1(i4, i5));
        }
    }

    public h(Class cls) {
        this.f1316a = 4;
        this.f1317b = new HashMap();
        this.f1318c = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new w(field));
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    n2.b bVar = (n2.b) field.getAnnotation(n2.b.class);
                    Object obj = this.f1317b;
                    if (bVar != null) {
                        strName = bVar.value();
                        for (String str : bVar.alternate()) {
                            ((Map) obj).put(str, r4);
                        }
                    }
                    ((Map) obj).put(strName, r4);
                    ((Map) this.f1318c).put(r4, strName);
                }
            }
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }
}
