package b0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import e.n0;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f1090d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f1091e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f1092f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f1093g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1094h = false;

    public h() {
        super(10);
    }

    public static boolean F(int i4, Object obj, String str, boolean z4) {
        G();
        try {
            return ((Boolean) f1092f.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void G() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1094h) {
            return;
        }
        f1094h = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1091e = constructor;
        f1090d = cls;
        f1092f = method2;
        f1093g = method;
    }

    @Override // e.n0
    public Typeface w(Context context, a0.g gVar, Resources resources, int i4) {
        G();
        try {
            Object objNewInstance = f1091e.newInstance(new Object[0]);
            for (a0.h hVar : gVar.f16a) {
                File fileB1 = c3.h.b1(context);
                if (fileB1 == null) {
                    return null;
                }
                try {
                    if (!c3.h.u0(fileB1, resources, hVar.f22f)) {
                        return null;
                    }
                    if (!F(hVar.f18b, objNewInstance, fileB1.getPath(), hVar.f19c)) {
                        return null;
                    }
                    fileB1.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileB1.delete();
                }
            }
            G();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f1090d, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f1093g.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }
}
