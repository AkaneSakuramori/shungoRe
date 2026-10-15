package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import r3.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f3303a;

    static {
        String property;
        Object next;
        int i4 = p.f3306a;
        q0 q0VarC = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator itI = defpackage.a.i();
        c3.h.b0(itI, "<this>");
        a3.m mVar = new a3.m(1, itI);
        boolean z4 = mVar instanceof p3.a;
        p3.c aVar = mVar;
        if (!z4) {
            aVar = new p3.a(mVar);
        }
        List listQ2 = p3.d.Q2(aVar);
        Iterator it = listQ2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iB = ((j) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((j) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        j jVar = (j) next;
        if (jVar != null) {
            try {
                q0VarC = jVar.c(listQ2);
            } catch (Throwable unused2) {
                jVar.a();
            }
            if (q0VarC != null) {
                f3303a = q0VarC;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
