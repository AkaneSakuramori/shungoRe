package z;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(Context context, int i4) {
        return context.getColor(i4);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
