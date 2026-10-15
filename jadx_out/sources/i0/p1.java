package i0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f2950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f2951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f2952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2953d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2950a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2951b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2952c = declaredField3;
            declaredField3.setAccessible(true);
            f2953d = true;
        } catch (ReflectiveOperationException e5) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
        }
    }
}
