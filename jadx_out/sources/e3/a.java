package e3;

import c3.h;
import c4.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c3.e, d, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3.e f1986b;

    public a(c3.e eVar) {
        this.f1986b = eVar;
    }

    public c3.e a(c3.e eVar) {
        h.b0(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // c3.e
    public final void b(Object obj) {
        c3.e eVar = this;
        while (true) {
            a aVar = (a) eVar;
            c3.e eVar2 = aVar.f1986b;
            h.X(eVar2);
            try {
                obj = aVar.h(obj);
                if (obj == d3.a.f1765b) {
                    return;
                }
            } catch (Throwable th) {
                obj = h.A0(th);
            }
            aVar.i();
            if (!(eVar2 instanceof a)) {
                eVar2.b(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public final StackTraceElement e() {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i4 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        i iVar = f.f1991b;
        i iVar2 = f.f1990a;
        if (iVar == null) {
            try {
                i iVar3 = new i(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f1991b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f1991b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f1293a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = iVar.f1294b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = iVar.f1295c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i4);
    }

    @Override // e3.d
    public final d f() {
        c3.e eVar = this.f1986b;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    public abstract Object h(Object obj);

    public abstract void i();

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objE = e();
        if (objE == null) {
            objE = getClass().getName();
        }
        sb.append(objE);
        return sb.toString();
    }
}
