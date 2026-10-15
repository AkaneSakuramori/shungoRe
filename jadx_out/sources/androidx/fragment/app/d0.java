package androidx.fragment.app;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n.k f726b = new n.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f727a;

    public d0(i0 i0Var) {
        this.f727a = i0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        n.k kVar = f726b;
        n.k kVar2 = (n.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new n.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e6) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }

    public final q a(String str) {
        Context context = this.f727a.f764p.f884k;
        Object obj = q.S;
        try {
            return (q) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e6) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e7) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e7);
        } catch (InvocationTargetException e8) {
            throw new p(defpackage.a.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e8);
        }
    }
}
