package r2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import m2.r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f4071d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f4073c;

    public c() {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f4071d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f4072b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.f4073c = declaredField;
    }

    @Override // r2.b
    public final void a(AccessibleObject accessibleObject) {
        Field field;
        Object obj = this.f4072b;
        if (obj != null && (field = this.f4073c) != null) {
            try {
                f4071d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, Long.valueOf(((Long) f4071d.getMethod("objectFieldOffset", Field.class).invoke(obj, field)).longValue()), Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e5) {
            throw new r("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e5);
        }
    }
}
