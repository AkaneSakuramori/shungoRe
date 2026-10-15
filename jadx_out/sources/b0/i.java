package b0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f1095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Constructor f1096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f1097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f1098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f1099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f1100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f1101o;

    public i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodN;
        Method methodO;
        Method method2;
        Method methodP;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodN = N(cls);
            methodO = O(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodP = P(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e5.getClass().getName()), e5);
            cls = null;
            method = null;
            constructor = null;
            methodN = null;
            methodO = null;
            method2 = null;
            methodP = null;
        }
        this.f1095i = cls;
        this.f1096j = constructor;
        this.f1097k = methodN;
        this.f1098l = methodO;
        this.f1099m = method2;
        this.f1100n = method;
        this.f1101o = methodP;
    }

    public static Method N(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method O(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void H(Object obj) {
        try {
            this.f1100n.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean I(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1097k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface J(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1095i, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1101o.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean K(Object obj) {
        try {
            return ((Boolean) this.f1099m.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean L() {
        Method method = this.f1097k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object M() {
        try {
            return this.f1096j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method P(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // b0.h, e.n0
    public final Typeface w(Context context, a0.g gVar, Resources resources, int i4) {
        if (!L()) {
            return super.w(context, gVar, resources, i4);
        }
        Object objM = M();
        if (objM == null) {
            return null;
        }
        for (a0.h hVar : gVar.f16a) {
            if (!I(context, objM, hVar.f17a, hVar.f21e, hVar.f18b, hVar.f19c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f20d))) {
                H(objM);
                return null;
            }
        }
        if (K(objM)) {
            return J(objM);
        }
        return null;
    }

    @Override // e.n0
    public final Typeface x(Context context, f0.h[] hVarArr, int i4) {
        Typeface typefaceJ;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!L()) {
            f0.h hVarB = B(i4, hVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarB.f2017a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarB.f2019c).setItalic(hVarB.f2020d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (f0.h hVar : hVarArr) {
            if (hVar.f2021e == 0) {
                Uri uri = hVar.f2017a;
                if (!map.containsKey(uri)) {
                    map.put(uri, c3.h.B1(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM = M();
        if (objM == null) {
            return null;
        }
        int length = hVarArr.length;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < length) {
            f0.h hVar2 = hVarArr[i5];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f2017a);
            if (byteBuffer != null) {
                try {
                    if (!((Boolean) this.f1098l.invoke(objM, byteBuffer, Integer.valueOf(hVar2.f2018b), null, Integer.valueOf(hVar2.f2019c), Integer.valueOf(hVar2.f2020d ? 1 : 0))).booleanValue()) {
                        H(objM);
                        return null;
                    }
                    z4 = true;
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
            i5++;
            z4 = z4;
        }
        if (!z4) {
            H(objM);
            return null;
        }
        if (K(objM) && (typefaceJ = J(objM)) != null) {
            return Typeface.create(typefaceJ, i4);
        }
        return null;
    }

    @Override // e.n0
    public final Typeface z(Context context, Resources resources, int i4, String str, int i5) {
        if (!L()) {
            return super.z(context, resources, i4, str, i5);
        }
        Object objM = M();
        if (objM == null) {
            return null;
        }
        if (!I(context, objM, str, 0, -1, -1, null)) {
            H(objM);
            return null;
        }
        if (K(objM)) {
            return J(objM);
        }
        return null;
    }
}
